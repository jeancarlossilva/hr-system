package br.com.jean.payrollapi.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.jean.payrollapi.domain.Payroll;
import br.com.jean.payrollapi.domain.User;
import br.com.jean.payrollapi.feingClients.UserFeing;
import br.com.jean.payrollapi.services.PayrollService;

@RestController
@RequestMapping(value = "/api/payments")
public class PayrollResource {
	
	@Autowired
	private PayrollService service;
	
	@GetMapping(value = "/{workerId}")
	public ResponseEntity<Payroll> getPayment(@PathVariable Long workerId, @RequestBody Payroll payment) {
				
		return ResponseEntity.ok().body(service.getPayment(workerId, payment));
				
	}

}
