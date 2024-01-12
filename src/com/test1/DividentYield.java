package com.test1;

public class DividentYield {
	private long dividentEarning;
	private String companyStock;
	private String totalDivident;
	private String currStockPrice;
	private String higherDivident;
	private String lowerDivident;
	private String chanceToEarn;
	private String yieldIndustry;
	private String acessToAverage;

	public DividentYield() {

	}

	public DividentYield(long dividentEarning, String companyStock, String totalDivident, String currStockPrice,
			String higherDivident, String lowerDivident, String chanceToEarn, String yieldIndustry,
			String acessToAverage) {
		super();
		this.dividentEarning = dividentEarning;
		this.companyStock = companyStock;
		this.totalDivident = totalDivident;
		this.currStockPrice = currStockPrice;
		this.higherDivident = higherDivident;
		this.lowerDivident = lowerDivident;
		this.chanceToEarn = chanceToEarn;
		this.yieldIndustry = yieldIndustry;
		this.acessToAverage = acessToAverage;
	}

	public long getDividentEarning() {
		return dividentEarning;
	}

	public void setDividentEarning(long dividentEarning) {
		this.dividentEarning = dividentEarning;
	}

	public String getCompanyStock() {
		return companyStock;
	}

	public void setCompanyStock(String companyStock) {
		this.companyStock = companyStock;
	}

	public String getTotalDivident() {
		return totalDivident;
	}

	public void setTotalDivident(String totalDivident) {
		this.totalDivident = totalDivident;
	}

	public String getCurrStockPrice() {
		return currStockPrice;
	}

	public void setCurrStockPrice(String currStockPrice) {
		this.currStockPrice = currStockPrice;
	}

	public String getHigherDivident() {
		return higherDivident;
	}

	public void setHigherDivident(String higherDivident) {
		this.higherDivident = higherDivident;
	}

	public String getLowerDivident() {
		return lowerDivident;
	}

	public void setLowerDivident(String lowerDivident) {
		this.lowerDivident = lowerDivident;
	}

	public String getChanceToEarn() {
		return chanceToEarn;
	}

	public void setChanceToEarn(String chanceToEarn) {
		this.chanceToEarn = chanceToEarn;
	}

	public String getYieldIndustry() {
		return yieldIndustry;
	}

	public void setYieldIndustry(String yieldIndustry) {
		this.yieldIndustry = yieldIndustry;
	}

	public String getAcessToAverage() {
		return acessToAverage;
	}

	public void setAcessToAverage(String acessToAverage) {
		this.acessToAverage = acessToAverage;
	}

}
