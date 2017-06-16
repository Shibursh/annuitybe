package com.axa.annuityinfo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.axa.annuityinfo.model.AnnuityInfo;

@Repository
@Transactional
public class AnnuityInfoDao {
	@PersistenceContext
	private EntityManager entiytManager;

	@SuppressWarnings("unchecked")
	public List<AnnuityInfo> findSearchData() {
		Query query = entiytManager.createQuery(
				"SELECT new AnnuityInfo(a.policyNo as policyNo, a.nenkinShoshoNo as nenkinShoshoNo, a.holderName as holderName, a.holderKname as holderKname, a.annuitantName as annuitantName, a.annuitantKname as annuitantKname, a.keiyakuStatus as keiyakuStatus) from AnnuityInfo a");
		return (List<AnnuityInfo>) query.getResultList();
	}

	public AnnuityInfo getAnnuityInfoByPolicyNo(String policyNo) {
		return entiytManager.find(AnnuityInfo.class, policyNo);
	}
}