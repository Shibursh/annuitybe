package com.axa.annuityinfo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.axa.annuityinfo.dao.AnnuityInfoDao;
import com.axa.annuityinfo.model.AnnuityInfo;

@Controller
@RequestMapping("/")
public class SearchRestController {
	@Autowired
	AnnuityInfoDao annuityInfoDao;

	@RequestMapping("/search")
	@ResponseBody
	public ResponseEntity<List<AnnuityInfo>> listUsers() {

		List<AnnuityInfo> annuityInfo = annuityInfoDao.findSearchData();
		if (annuityInfo.isEmpty()) {
			return new ResponseEntity<List<AnnuityInfo>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<AnnuityInfo>>(annuityInfo, HttpStatus.OK);
	}

	@RequestMapping("/search/{policyNo}")
	@ResponseBody
	public ResponseEntity<AnnuityInfo> getAnnuityInfoByPolicyNo(@PathVariable("policyNo") String policyNo) {

		AnnuityInfo annuityInfo = annuityInfoDao.getAnnuityInfoByPolicyNo(policyNo);
		return new ResponseEntity<AnnuityInfo>(annuityInfo, HttpStatus.OK);
	}

}