package com.example.AssetManage.dto;

import java.sql.Date;

import com.example.AssetManage.entity.AssetEntity;
import com.example.AssetManage.entity.AssetTypeEntity;

/**
 * @author lb_phung
 *
 */
public class AssetAfterMap {
	/**
	 * ID of Asset
	 */

	private Long assetIDMap;
	/**
	 * Code of Asset
	 */

	private String assetCodeMap;

	/**
	 * Name of Asset
	 */

	private String assetNameMap;
	/**
	 * Price of Asset
	 */

	private String assetPriceMap;
	/**
	 * DayExp of Asset
	 */

	private Date assetDayExpMap;
	/**
	 * id of AssetType
	 */

	private AssetTypeAfterMap assetTypeMap;


	public AssetAfterMap(AssetEntity assetEntity) {
		super();
		this.assetIDMap = assetEntity.getAssetID();
		this.assetCodeMap = assetEntity.getAssetCode();
		this.assetNameMap = assetEntity.getAssetName();
		this.assetPriceMap = assetEntity.getAssetPrice();
		this.assetDayExpMap = assetEntity.getAssetDayExp();
		AssetTypeAfterMap assetType = new AssetTypeAfterMap(assetEntity.getAssetType());
		this.assetTypeMap  = assetType;

	}

	public Long getAssetIDMap() {
		return assetIDMap;
	}

	public void setAssetIDMap(Long assetIDMap) {
		this.assetIDMap = assetIDMap;
	}

	public String getAssetCodeMap() {
		return assetCodeMap;
	}

	public void setAssetCodeMap(String assetCodeMap) {
		this.assetCodeMap = assetCodeMap;
	}

	public String getAssetNameMap() {
		return assetNameMap;
	}

	public void setAssetNameMap(String assetNameMap) {
		this.assetNameMap = assetNameMap;
	}

	public String getAssetPriceMap() {
		return assetPriceMap;
	}

	public void setAssetPriceMap(String assetPriceMap) {
		this.assetPriceMap = assetPriceMap;
	}

	public Date getAssetDayExpMap() {
		return assetDayExpMap;
	}

	public void setAssetDayExpMap(Date assetDayExpMap) {
		this.assetDayExpMap = assetDayExpMap;
	}

	public AssetTypeAfterMap getAssetTypeMap() {
		return assetTypeMap;
	}

	public void setAssetTypeMap(AssetTypeAfterMap assetTypeMap) {
		this.assetTypeMap = assetTypeMap;
	}

	
}// end
