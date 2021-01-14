package com.example.AssetManage.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.AssetManage.dto.AssetAfterMap;
import com.example.AssetManage.entity.AssetEntity;
import com.example.AssetManage.repository.AssetRepository;

@RestController
@RequestMapping("/api/")
public class AssetEntityController {
	// public static Logger logger =
	// LoggerFactory.getLogger(AssetEntityController.class);
	@Autowired
	AssetRepository assetRepository;

	@RequestMapping(value = "/asset", method = RequestMethod.GET)
	public ResponseEntity<List<AssetEntity>> listAllAssetEntity() {
		List<AssetEntity> listAssetEntity = assetRepository.findAll();
		List<AssetAfterMap> listAssetMap = new ArrayList<AssetAfterMap>();

		/*
		 * if (listAssetEntity.isEmpty()) { return new
		 * ResponseEntity<List<AssetAfterMap>>(HttpStatus.NO_CONTENT); }
		 */

		return new ResponseEntity<List<AssetAfterMap>>(listAssetMap, HttpStatus.OK);
	}

	@RequestMapping(value = "/asset/{asset_id}", method = RequestMethod.GET)
	public AssetAfterMap findAssetEntity(@PathVariable("asset_id") long assetID) {
		AssetEntity asset = assetRepository.getOne(assetID);
		AssetAfterMap assetMap = new AssetAfterMap(asset);
		return assetMap;
	}
}
