package com.ty.dto;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BankLoanAppDto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String fullName;
	private String fathersName;
	private String gender;
	private String dateOfBirth;
	private long panNumber;
	private String address;
	private long phoneNumber;
	private String email;
	private long bankAccountNumber;
	private String bankName;
	private String typeOfLoan;
	private double amountOfLoan;
	private String tenureOfRepayment;

	public String getTypeOfLoan() {
		return typeOfLoan;
	}

	public void setTypeOfLoan(String typeOfLoan) {
		this.typeOfLoan = typeOfLoan;
	}

	public double getAmountOfLoan() {
		return amountOfLoan;
	}

	public void setAmountOfLoan(double amountOfLoan) {
		this.amountOfLoan = amountOfLoan;
	}

	public String getTenureOfRepayment() {
		return tenureOfRepayment;
	}

	public void setTenureOfRepayment(String tenureOfRepayment) {
		this.tenureOfRepayment = tenureOfRepayment;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getFathersName() {
		return fathersName;
	}

	public void setFathersName(String fathersName) {
		this.fathersName = fathersName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public long getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(long panNumber) {
		this.panNumber = panNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getBankAccountNumber() {
		return bankAccountNumber;
	}

	public void setBankAccountNumber(long bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

}
