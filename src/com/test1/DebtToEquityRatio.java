package com.test1;

public class DebtToEquityRatio {
	private long fundingCompanyId;
	private String debt;
	private String ownedFunds;
	private String shareHolderEquity;
	private String totalLiablity;
	private String nonAgresssiveFund;
	private String agressiveFund;
	private String gowthWithEquity;
	private String growthWithDebt;

	public DebtToEquityRatio() {

	}

	public DebtToEquityRatio(long fundingCompanyId, String debt, String ownedFunds, String shareHolderEquity,
			String totalLiablity, String nonAgresssiveFund, String agressiveFund, String gowthWithEquity,
			String growthWithDebt) {
		super();
		this.fundingCompanyId = fundingCompanyId;
		this.debt = debt;
		this.ownedFunds = ownedFunds;
		this.shareHolderEquity = shareHolderEquity;
		this.totalLiablity = totalLiablity;
		this.nonAgresssiveFund = nonAgresssiveFund;
		this.agressiveFund = agressiveFund;
		this.gowthWithEquity = gowthWithEquity;
		this.growthWithDebt = growthWithDebt;
	}

	public long getFundingCompanyId() {
		return fundingCompanyId;
	}

	public void setFundingCompanyId(long fundingCompanyId) {
		this.fundingCompanyId = fundingCompanyId;
	}

	public String getDebt() {
		return debt;
	}

	public void setDebt(String debt) {
		this.debt = debt;
	}

	public String getOwnedFunds() {
		return ownedFunds;
	}

	public void setOwnedFunds(String ownedFunds) {
		this.ownedFunds = ownedFunds;
	}

	public String getShareHolderEquity() {
		return shareHolderEquity;
	}

	public void setShareHolderEquity(String shareHolderEquity) {
		this.shareHolderEquity = shareHolderEquity;
	}

	public String getTotalLiablity() {
		return totalLiablity;
	}

	public void setTotalLiablity(String totalLiablity) {
		this.totalLiablity = totalLiablity;
	}

	public String getNonAgresssiveFund() {
		return nonAgresssiveFund;
	}

	public void setNonAgresssiveFund(String nonAgresssiveFund) {
		this.nonAgresssiveFund = nonAgresssiveFund;
	}

	public String getAgressiveFund() {
		return agressiveFund;
	}

	public void setAgressiveFund(String agressiveFund) {
		this.agressiveFund = agressiveFund;
	}

	public String getGowthWithEquity() {
		return gowthWithEquity;
	}

	public void setGowthWithEquity(String gowthWithEquity) {
		this.gowthWithEquity = gowthWithEquity;
	}

	public String getGrowthWithDebt() {
		return growthWithDebt;
	}

	public void setGrowthWithDebt(String growthWithDebt) {
		this.growthWithDebt = growthWithDebt;
	}

}
