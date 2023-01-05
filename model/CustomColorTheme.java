package model;

public enum CustomColorTheme {

	// aqua theme
	AQUA("#008080","#00cccc","#e6ffff"), 
	// blue theme
	BLUE("#0047b3", "#3385ff", "#cceeff"), 
	// purple theme
	PURPLE("#4d0099", "#944dff", "#ffe6ff"),
	// red theme
	RED("#8b0000","#ff0000","#fb9a9a"),
	// green theme
	GREEN("#003e0a", "#009619", "#00ff11"),
	// dark theme
	MOONLIGHT("#000000","#818283", "#e1e1e1");
	
	
	private String darkColor; // 1st color of theme
	private String mediumColor; // 2nd color of theme
	private String lightColor; // 3rd color of theme
	
	private CustomColorTheme(String darkColor, String mediumColor, String lightColor){
		this.darkColor = darkColor;
		this.mediumColor = mediumColor;
		this.lightColor = lightColor;
	}
	
	// gets dark (1st) color
	public String getDarkColor(){
		return darkColor;
	}
	
	// gets medium (2nd) color
	public String getMediumColor(){
		return mediumColor;
	}
	
	// gets light (3rd) color
	public String getLightColor(){
		return lightColor;
	}
}
