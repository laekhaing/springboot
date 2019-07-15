package com.kessai.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kessai.model.RetKetInfo;
import com.kessai.model.RetdenInfor;
import com.kessai.service.DenSearchService;
import com.kessai.web.response.DenSearchResponse;

@RestController
@RequestMapping("/api/kessai")
public class DenSearchController {

	@GetMapping(value= "/denSearch", produces = "application/json")
	public DenSearchResponse denSearchResponse() {
		
DenSearchResponse denSearchResponse = new DenSearchResponse();
		RetKetInfo retKetInfo = new RetKetInfo();
		List<RetdenInfor> retdenInfoList = new ArrayList<RetdenInfor>();
		DenSearchService service = new DenSearchService();
		retdenInfoList = service.retdenInfoList();

		for(int i = 0; i < retdenInfoList.size(); i++) {
			retKetInfo = retdenInfoList.get(i).getRetKetInfo();
			retdenInfoList.get(i).setRetKetInfo(retKetInfo);
		}
		denSearchResponse.setRetdeninfo(retdenInfoList);
		denSearchResponse.setErrmsg("");
		denSearchResponse.setRzlcd("");
		return denSearchResponse;
	}

}
