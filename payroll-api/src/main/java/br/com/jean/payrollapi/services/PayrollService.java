package br.com.jean.payrollapi.services;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import br.com.jean.payrollapi.domain.Payroll;
import br.com.jean.payrollapi.domain.User;
import br.com.jean.payrollapi.feingClients.UserFeing;
import br.com.jean.payrollapi.services.exceptions.ObjectNotFoundException;
import feign.FeignException;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class PayrollService {
	
	@Autowired
	private Environment env;
	
	@Autowired
	private UserFeing userFeing;
	
	public Payroll getPayment(Long workedId, Payroll payroll) {
		System.out.println("PAYROLL_SERVICE :: Get request on " + env.getProperty("local.serve.port") + " port");
		try {
			User user = userFeing.findById(workedId).getBody();
			if(Objects.nonNull(user)) {
				return new Payroll(
						user.getName(), 
						payroll.getDescription(), 
						user.getHourlyPrice(), 
						payroll.getWorkedHours(), 
						user.getHourlyPrice() * payroll.getWorkedHours());
				
			}
		} catch (FeignException.NotFound ex) {
			throw new ObjectNotFoundException("Object not found");
		} catch (Exception ex) {
			throw new IllegalArgumentException("Illegal argument exception");
		}
		
		return null;
	
		
	}

}
