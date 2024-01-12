package com.test1;

public class DividentSecurity {
	private long id;
	private String signOfTrouble;
	private String underperformingSecurities;
	private String consistancyOfDividents;
	private String stability;
	private String constantGrowth;
	private String marketCap;
	private String capRatio;

	public DividentSecurity() {

	}

	public DividentSecurity(long id, String signOfTrouble, String underperformingSecurities,
			String consistancyOfDividents, String stability, String constantGrowth, String marketCap, String capRatio) {
		super();
		this.id = id;
		this.signOfTrouble = signOfTrouble;
		this.underperformingSecurities = underperformingSecurities;
		this.consistancyOfDividents = consistancyOfDividents;
		this.stability = stability;
		this.constantGrowth = constantGrowth;
		this.marketCap = marketCap;
		this.capRatio = capRatio;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSignOfTrouble() {
		return signOfTrouble;
	}

	public void setSignOfTrouble(String signOfTrouble) {
		this.signOfTrouble = signOfTrouble;
	}

	public String getUnderperformingSecurities() {
		return underperformingSecurities;
	}

	public void setUnderperformingSecurities(String underperformingSecurities) {
		this.underperformingSecurities = underperformingSecurities;
	}

	public String getConsistancyOfDividents() {
		return consistancyOfDividents;
	}

	public void setConsistancyOfDividents(String consistancyOfDividents) {
		this.consistancyOfDividents = consistancyOfDividents;
	}

	public String getStability() {
		return stability;
	}

	public void setStability(String stability) {
		this.stability = stability;
	}

	public String getConstantGrowth() {
		return constantGrowth;
	}

	public void setConstantGrowth(String constantGrowth) {
		this.constantGrowth = constantGrowth;
	}

	public String getMarketCap() {
		return marketCap;
	}

	public void setMarketCap(String marketCap) {
		this.marketCap = marketCap;
	}

	public String getCapRatio() {
		return capRatio;
	}

	public void setCapRatio(String capRatio) {
		this.capRatio = capRatio;
	}

}
