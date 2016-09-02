package com.ilwllc.sgerke.jacksonxml;

import java.util.List;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class TimeLayout {

	@JacksonXmlProperty(localName = "time-coordinate", isAttribute=true)
	private String timecoordinate;
	public String getTimecoordinate() {
		return timecoordinate;
	}
	public void setTimecoordinate(String timecoordinate) {
		this.timecoordinate = timecoordinate;
	}
	
	
	@JacksonXmlProperty(localName = "summarization", isAttribute=true)
	private String summarization;
	public String getSummarization() {
		return summarization;
	}
	public void setSummarization(String summarization) {
		this.summarization = summarization;
	}
	
	
	@JacksonXmlProperty(localName = "layout-key")
	private String layoutKey;
	public String getLayoutKey() {
		return layoutKey;
	}
	public void setLayoutKey(String layoutKey) {
		this.layoutKey = layoutKey;
	}
	
	
	@JacksonXmlProperty(localName = "start-valid-time")
	private List<String> startValidTime;
	public List<String> getStartValidTime() {
		return startValidTime;
	}
	public void setStartValidTime(List<String> startValidTime) {
		this.startValidTime = startValidTime;
	}
	
	
	@JacksonXmlProperty(localName = "end-valid-time")
	private List<String> endValidTime;
	public List<String> getEndValidTime() {
		return endValidTime;
	}
	public void setEndValidTime(List<String> endValidTime) {
		this.endValidTime = endValidTime;
	}

}
