package com.ty.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.dto.BankLoanAppDto;

@Repository
public class BankLoanAppDao {

	@Autowired
	EntityManagerFactory entityManagerFactory;

	public void saveBankLoanAppDto(BankLoanAppDto bankLoanApp) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(bankLoanApp);
		entityTransaction.commit();
	}

	public BankLoanAppDto getBankLoanAppDtoById(int id) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		return entityManager.find(BankLoanAppDto.class, id);
	}

	public void updateBankLoanAppDto(BankLoanAppDto bankLoanApp) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.merge(bankLoanApp);
		entityTransaction.commit();
	}

	public boolean deleteBankLoanAppDto(int id) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		BankLoanAppDto bankLoanApp = entityManager.find(BankLoanAppDto.class, id);
		if (bankLoanApp != null) {
			entityTransaction.begin();
			entityManager.remove(bankLoanApp);
			entityTransaction.commit();
			return true;
		} else {
			return false;
		}
	}

	public List<BankLoanAppDto> getAllBankLoanAppDto() {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Query query = entityManager.createQuery("SELECT b FROM BankLoanAppDto b");
		return query.getResultList();
	}
}
