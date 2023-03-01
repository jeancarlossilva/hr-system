package br.com.jean.payrollapi.domain;

public class Payroll {
	
	private String wokerName;
	private String description;
	private Double hourlyPrice;
	private Double workedHours;
	private Double totalPayment;
	
	public Payroll(String wokerName, String description, Double hourlyPrice, Double workedHours, Double totalPayment) {
		super();
		this.wokerName = wokerName;
		this.description = description;
		this.hourlyPrice = hourlyPrice;
		this.workedHours = workedHours;
		this.totalPayment = totalPayment;
	}
		
	public String getWokerName() {
		return wokerName;
	}
	public void setWokerName(String wokerName) {
		this.wokerName = wokerName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getHourlyPrice() {
		return hourlyPrice;
	}
	public void setHourlyPrice(Double hourlyPrice) {
		this.hourlyPrice = hourlyPrice;
	}
	public Double getWorkedHours() {
		return workedHours;
	}
	public void setWorkedHours(Double workedHours) {
		this.workedHours = workedHours;
	}
	public Double getTotalPayment() {
		return totalPayment;
	}
	public void setTotalPayment(Double totalPayment) {
		this.totalPayment = totalPayment;
	}
	
	
}
