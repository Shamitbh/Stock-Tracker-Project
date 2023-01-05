// Shamit Bhatia
// Shamitbh@usc.edu
// ITP 368
// Fall 2017
package model;

/* This class to represent all the information about a 
   single company's stock, including price, ticker symbol
   etc.
 */


public class Stock {

	private String companyName;
	private String tickerSymbol;
	private double currentPrice;
	private double marketCap;
	private double beta;
	private double earningsPerShare;
	private double percentChange;
	private int numShares;
	// may add more variables later depending on web-scraping software...
	
	public Stock(String companyName, String tickerSymbol, double currentPrice, double marketCap, double beta,
			double earningsPerShare, double percentChange, int numShares) {
		this.companyName = companyName;
		this.tickerSymbol = tickerSymbol;
		this.currentPrice = currentPrice;
		this.marketCap = marketCap;
		this.beta = beta;
		this.earningsPerShare = earningsPerShare;
		this.percentChange = percentChange;
		this.numShares = numShares;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getTickerSymbol() {
		return tickerSymbol;
	}

	public void setTickerSymbol(String tickerSymbol) {
		this.tickerSymbol = tickerSymbol;
	}

	public double getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}

	public double getMarketCap() {
		return marketCap;
	}

	public void setMarketCap(double marketCap) {
		this.marketCap = marketCap;
	}

	public double getBeta() {
		return beta;
	}

	public void setBeta(double beta) {
		this.beta = beta;
	}

	public double getEarningsPerShare() {
		return earningsPerShare;
	}

	public void setEarningsPerShare(double earningsPerShare) {
		this.earningsPerShare = earningsPerShare;
	}

	public double getPercentChange() {
		return percentChange;
	}

	public void setPercentChange(double percentChange) {
		this.percentChange = percentChange;
	}
	
	public double getNumShares() {
		return numShares;
	}

	public void setNumShares(int numShares) {
		this.numShares = numShares;
	}

	@Override
	public String toString() {
		return "Stock [companyName=" + companyName + ", tickerSymbol=" + tickerSymbol + "]";
	}
	
}
