package com.ilwllc.sgerke.jacksonxml;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Point {
	
	@JacksonXmlProperty(localName = "latitude")
	private String latitude = null;
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	
	@JacksonXmlProperty(localName = "longitude")
	private String longitude = null;
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

}
