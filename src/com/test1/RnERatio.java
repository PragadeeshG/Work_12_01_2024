package com.test1;

public class RnERatio {
	private long returnId;
	private String returnCode;
	private String investment;
	private boolean returnOnInvestment;
	private boolean equityTurn;
	private String investmentToProfit;
	private String companyMeasure;
	private String shareHolderEquity;
	private String industryAverage;
	private String benchMark;
	private String sectorbenchMark;

	public RnERatio() {

	}

	public RnERatio(long returnId, String returnCode, String investment, boolean returnOnInvestment, boolean equityTurn,
			String investmentToProfit, String companyMeasure, String shareHolderEquity, String industryAverage,
			String benchMark, String sectorbenchMark) {
		super();
		this.returnId = returnId;
		this.returnCode = returnCode;
		this.investment = investment;
		this.returnOnInvestment = returnOnInvestment;
		this.equityTurn = equityTurn;
		this.investmentToProfit = investmentToProfit;
		this.companyMeasure = companyMeasure;
		this.shareHolderEquity = shareHolderEquity;
		this.industryAverage = industryAverage;
		this.benchMark = benchMark;
		this.sectorbenchMark = sectorbenchMark;
	}

	public long getReturnId() {
		return returnId;
	}

	public void setReturnId(long returnId) {
		this.returnId = returnId;
	}

	public String getReturnCode() {
		return returnCode;
	}

	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}

	public String getInvestment() {
		return investment;
	}

	public void setInvestment(String investment) {
		this.investment = investment;
	}

	public boolean isReturnOnInvestment() {
		return returnOnInvestment;
	}

	public void setReturnOnInvestment(boolean returnOnInvestment) {
		this.returnOnInvestment = returnOnInvestment;
	}

	public boolean isEquityTurn() {
		return equityTurn;
	}

	public void setEquityTurn(boolean equityTurn) {
		this.equityTurn = equityTurn;
	}

	public String getInvestmentToProfit() {
		return investmentToProfit;
	}

	public void setInvestmentToProfit(String investmentToProfit) {
		this.investmentToProfit = investmentToProfit;
	}

	public String getCompanyMeasure() {
		return companyMeasure;
	}

	public void setCompanyMeasure(String companyMeasure) {
		this.companyMeasure = companyMeasure;
	}

	public String getShareHolderEquity() {
		return shareHolderEquity;
	}

	public void setShareHolderEquity(String shareHolderEquity) {
		this.shareHolderEquity = shareHolderEquity;
	}

	public String getIndustryAverage() {
		return industryAverage;
	}

	public void setIndustryAverage(String industryAverage) {
		this.industryAverage = industryAverage;
	}

	public String getBenchMark() {
		return benchMark;
	}

	public void setBenchMark(String benchMark) {
		this.benchMark = benchMark;
	}

	public String getSectorbenchMark() {
		return sectorbenchMark;
	}

	public void setSectorbenchMark(String sectorbenchMark) {
		this.sectorbenchMark = sectorbenchMark;
	}

}
