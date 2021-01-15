package com.example.AssetManage.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.AssetManage.dto.AssetAfterMap;
import com.example.AssetManage.entity.AssetEntity;
import com.example.AssetManage.repository.AssetRepository;

@RestController
@RequestMapping("/api")
public class AssetEntityController {
	// public static Logger logger =
	// LoggerFactory.getLogger(AssetEntityController.class);
	@Autowired
	AssetRepository assetRepository;

	@RequestMapping(value = "/asset", method = RequestMethod.GET)
	public ResponseEntity<List<AssetAfterMap>> listAllAssetEntity() {
		List<AssetEntity> listAssetEntity = assetRepository.findAll();
		List<AssetAfterMap> listAssetAfterMap = listAssetEntity.stream().map(AssetAfterMap::new)
				.collect(Collectors.toList());

		if (listAssetAfterMap.isEmpty()) {
			return new ResponseEntity<List<AssetAfterMap>>(HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<List<AssetAfterMap>>(listAssetAfterMap, HttpStatus.OK);
	}

	@RequestMapping(value = "/asset/{asset_id}", method = RequestMethod.GET)
	public AssetAfterMap findAssetEntity(@PathVariable("asset_id") long assetID) {
		AssetEntity asset = assetRepository.getOne(assetID);
		AssetAfterMap assetMap = new AssetAfterMap(asset);
		return assetMap;
	}

	@RequestMapping(value = "/asset", method = RequestMethod.POST)
	public AssetEntity saveAssetEntity(@RequestBody AssetEntity asset) {
		return assetRepository.saveAndFlush(asset);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	@RequestMapping(value = "/asset", method = RequestMethod.PUT)
	public ResponseEntity<AssetEntity> updateContact(@PathVariable(value = "asset_id") Long assetID,
			@RequestBody AssetEntity assetEntity) {
		AssetEntity asset = assetRepository.getOne(assetID);
		if (asset == null) {
			return ResponseEntity.notFound().build();
		}
		asset.setAssetCode(assetEntity.getAssetCode());
		asset.setAssetName(assetEntity.getAssetName());

		AssetEntity updatedgetAssetName = assetRepository.saveAndFlush(asset);
		return ResponseEntity.ok(updatedgetAssetName);
	}
}//end
