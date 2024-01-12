package com.test1;

public class PnERatio {
	private String companyName;
	private String stockName;
	private String earnings;
	private String payByInvestor;
	private Integer payPerShare;
	private Integer marketSenti;
	private String overPriced;
	private String unerPriced;
	private String benchmark;
	private String sector;

	public PnERatio() {

	}

	public PnERatio(String companyName, String stockName, String earnings, String payByInvestor, Integer payPerShare,
			Integer marketSenti, String overPriced, String unerPriced, String benchmark, String sector) {
		super();
		this.companyName = companyName;
		this.stockName = stockName;
		this.earnings = earnings;
		this.payByInvestor = payByInvestor;
		this.payPerShare = payPerShare;
		this.marketSenti = marketSenti;
		this.overPriced = overPriced;
		this.unerPriced = unerPriced;
		this.benchmark = benchmark;
		this.sector = sector;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public String getEarnings() {
		return earnings;
	}

	public void setEarnings(String earnings) {
		this.earnings = earnings;
	}

	public String getPayByInvestor() {
		return payByInvestor;
	}

	public void setPayByInvestor(String payByInvestor) {
		this.payByInvestor = payByInvestor;
	}

	public Integer getPayPerShare() {
		return payPerShare;
	}

	public void setPayPerShare(Integer payPerShare) {
		this.payPerShare = payPerShare;
	}

	public Integer getMarketSenti() {
		return marketSenti;
	}

	public void setMarketSenti(Integer marketSenti) {
		this.marketSenti = marketSenti;
	}

	public String getOverPriced() {
		return overPriced;
	}

	public void setOverPriced(String overPriced) {
		this.overPriced = overPriced;
	}

	public String getUnerPriced() {
		return unerPriced;
	}

	public void setUnerPriced(String unerPriced) {
		this.unerPriced = unerPriced;
	}

	public String getBenchmark() {
		return benchmark;
	}

	public void setBenchmark(String benchmark) {
		this.benchmark = benchmark;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

}
