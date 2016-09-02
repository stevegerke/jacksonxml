package com.ilwllc.sgerke.jacksonxml;

import java.net.URL;
import java.util.List;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Data {
	
	@JacksonXmlProperty(localName = "location")
	private Location location = null;
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}


	@JacksonXmlProperty(localName = "time-layout")
	private List<TimeLayout> timeLayouts = null;
	public List<TimeLayout> getTimeLayouts() {
		return timeLayouts;
	}
	public void setTimeLayouts(List<TimeLayout> timeLayouts) {
		this.timeLayouts = timeLayouts;
	}

	@JacksonXmlProperty(localName = "parameters")
	private List<Parameters> parameters1 = null;
	public List<Parameters> getParameters1() {
		return parameters1;
	}
	public void setParameters1(List<Parameters> parameters1) {
		this.parameters1 = parameters1;
	}
	
	
	@JacksonXmlProperty(localName = "moreWeatherInformation")
	private URL moreweatherinformation;
	public URL getMoreWeatherInformation() {
		return moreweatherinformation;
	}
	public void setMoreWeatherInformation(URL moreweatherinformation) {
		this.moreweatherinformation = moreweatherinformation;
	}
	/*
	@JacksonXmlProperty(localName = "moreWeatherInformation")
	private String moreweatherinformation;
	public String getMoreWeatherInformation() {
		return moreweatherinformation;
	}
	public void setMoreWeatherInformation(String moreweatherinformation) {
		this.moreweatherinformation = moreweatherinformation;
	}	
	*/
	
	
	@JacksonXmlProperty(localName = "applicable-location", isAttribute=true)
	private String applicablelocation;
	public String getApplicablelocation() {
		return applicablelocation;
	}
	public void setApplicablelocation(String applicablelocation) {
		this.applicablelocation = applicablelocation;
	}
	
}
