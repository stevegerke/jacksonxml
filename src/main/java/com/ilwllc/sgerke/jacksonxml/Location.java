package com.ilwllc.sgerke.jacksonxml;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Location {
	
	@JacksonXmlProperty(localName = "location-key")
	private String locationkey = null;
	public String getLocationKey() {
		return locationkey;
	}
	public void setLocationKey(String locationkey) {
		this.locationkey = locationkey;
	}


	@JacksonXmlProperty(localName = "point")
	private Point point = null;
	public Point getPoint() {
		return point;
	}
	public void setPoint(Point point) {
		this.point = point;
	}

	
}
