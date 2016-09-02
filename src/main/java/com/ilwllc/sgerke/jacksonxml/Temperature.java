package com.ilwllc.sgerke.jacksonxml;

import java.util.List;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Temperature {

	@JacksonXmlProperty(localName = "type", isAttribute=true)
	private String type = null;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	@JacksonXmlProperty(localName = "units", isAttribute=true)
	private String units = null;
	public String getUnits() {
		return units;
	}
	public void setUnits(String units) {
		this.units = units;
	}
	
	
	@JacksonXmlProperty(localName = "time-layout", isAttribute=true)
	private String timeLayout = null;
	public String getTimeLayout() {
		return timeLayout;
	}
	public void setTimeLayout(String timeLayout) {
		this.timeLayout = timeLayout;
	}
	
	@JacksonXmlProperty(localName = "name")
	private String name = null;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	@JacksonXmlProperty(localName = "value")
	private List<String> value = null;
	public List<String> getValue() {
		return value;
	}
	public void setValue(List<String> value) {
		this.value = value;
	}

}
