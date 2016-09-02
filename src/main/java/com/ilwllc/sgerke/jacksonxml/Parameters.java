package com.ilwllc.sgerke.jacksonxml;

import java.util.List;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Parameters {

		@JacksonXmlProperty(localName = "applicable-location", isAttribute=true)
		private String applicableLocation = null;
		public String getApplicableLocation() {
			return applicableLocation;
		}
		public void setApplicableLocation(String applicableLocation) {
			this.applicableLocation = applicableLocation;
		}
		
		
		@JacksonXmlProperty(localName = "temperature")
		private List<Temperature> temperature = null;
		public List<Temperature> getTemperature() {
			return temperature;
		}
		public void setTemperature(List<Temperature> temperature) {
			this.temperature = temperature;
		}

}
