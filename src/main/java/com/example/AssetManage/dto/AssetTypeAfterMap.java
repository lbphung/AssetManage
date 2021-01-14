package com.example.AssetManage.dto;

import com.example.AssetManage.entity.AssetTypeEntity;

public class AssetTypeAfterMap {
	/**
	 * ID of Asset
	 */

	private Long assetTypeID;
	/**
	 * Code of AssetType
	 */

	private String assetTypeCode;

	/**
	 * Name of AssetType
	 */

	private String assetTypeName;


	

	public AssetTypeAfterMap(AssetTypeEntity assetTypeEntity) {

		super();
		this.assetTypeID = assetTypeEntity.getAssetTypeID();
		this.assetTypeCode = assetTypeEntity.getAssetTypeCode();
		this.assetTypeName = assetTypeEntity.getAssetTypeName();
		
	}

	public Long getAssetTypeID() {
		return assetTypeID;
	}

	public void setAssetTypeID(Long assetTypeID) {
		this.assetTypeID = assetTypeID;
	}

	public String getAssetTypeCode() {
		return assetTypeCode;
	}

	public void setAssetTypeCode(String assetTypeCode) {
		this.assetTypeCode = assetTypeCode;
	}

	public String getAssetTypeName() {
		return assetTypeName;
	}

	public void setAssetTypeName(String assetTypeName) {
		this.assetTypeName = assetTypeName;
	}
}
