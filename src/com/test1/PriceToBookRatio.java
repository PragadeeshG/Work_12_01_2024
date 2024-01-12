package com.test1;

public class PriceToBookRatio {
	private long ratioCode;
	private String currentShare;
	private String valuePerShare;
	private String stockPrice;
	private String toBank;
	private String correspondingAsset;
	private String subCorrespondence;
	private String localCorrres;
	private String companyBase;
	private String assetBase;
	private String assetClass;
	private String subAssetClase;
	private String skyrocketDeal;

	public PriceToBookRatio() {

	}

	public PriceToBookRatio(long ratioCode, String currentShare, String valuePerShare, String stockPrice, String toBank,
			String correspondingAsset, String subCorrespondence, String localCorrres, String companyBase,
			String assetBase, String assetClass, String subAssetClase, String skyrocketDeal) {
		super();
		this.ratioCode = ratioCode;
		this.currentShare = currentShare;
		this.valuePerShare = valuePerShare;
		this.stockPrice = stockPrice;
		this.toBank = toBank;
		this.correspondingAsset = correspondingAsset;
		this.subCorrespondence = subCorrespondence;
		this.localCorrres = localCorrres;
		this.companyBase = companyBase;
		this.assetBase = assetBase;
		this.assetClass = assetClass;
		this.subAssetClase = subAssetClase;
		this.skyrocketDeal = skyrocketDeal;
	}

	public long getRatioCode() {
		return ratioCode;
	}

	public void setRatioCode(long ratioCode) {
		this.ratioCode = ratioCode;
	}

	public String getCurrentShare() {
		return currentShare;
	}

	public void setCurrentShare(String currentShare) {
		this.currentShare = currentShare;
	}

	public String getValuePerShare() {
		return valuePerShare;
	}

	public void setValuePerShare(String valuePerShare) {
		this.valuePerShare = valuePerShare;
	}

	public String getStockPrice() {
		return stockPrice;
	}

	public void setStockPrice(String stockPrice) {
		this.stockPrice = stockPrice;
	}

	public String getToBank() {
		return toBank;
	}

	public void setToBank(String toBank) {
		this.toBank = toBank;
	}

	public String getCorrespondingAsset() {
		return correspondingAsset;
	}

	public void setCorrespondingAsset(String correspondingAsset) {
		this.correspondingAsset = correspondingAsset;
	}

	public String getSubCorrespondence() {
		return subCorrespondence;
	}

	public void setSubCorrespondence(String subCorrespondence) {
		this.subCorrespondence = subCorrespondence;
	}

	public String getLocalCorrres() {
		return localCorrres;
	}

	public void setLocalCorrres(String localCorrres) {
		this.localCorrres = localCorrres;
	}

	public String getCompanyBase() {
		return companyBase;
	}

	public void setCompanyBase(String companyBase) {
		this.companyBase = companyBase;
	}

	public String getAssetBase() {
		return assetBase;
	}

	public void setAssetBase(String assetBase) {
		this.assetBase = assetBase;
	}

	public String getAssetClass() {
		return assetClass;
	}

	public void setAssetClass(String assetClass) {
		this.assetClass = assetClass;
	}

	public String getSubAssetClase() {
		return subAssetClase;
	}

	public void setSubAssetClase(String subAssetClase) {
		this.subAssetClase = subAssetClase;
	}

	public String getSkyrocketDeal() {
		return skyrocketDeal;
	}

	public void setSkyrocketDeal(String skyrocketDeal) {
		this.skyrocketDeal = skyrocketDeal;
	}

}
