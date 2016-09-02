package com.ilwllc.sgerke.jacksonxml;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.dataformat.xml.JacksonXmlModule;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class WeatherGet {
	public static void main(String[] args) throws ClientProtocolException, IOException {

		//Arguments must be passed for sleep time, city, and state, 
		if(args.length == 0){
			System.out.println("***** Missing arguments *****");
			return;
		}
		
		int timeout = 5;
		RequestConfig config = RequestConfig.custom()
				.setConnectTimeout(timeout * 1000)
				.setConnectionRequestTimeout(timeout * 1000)
				.setSocketTimeout(timeout * 1000).build();

		//CloseableHttpClient client = HttpClientBuilder.create().setDefaultRequestConfig(config).build();
		//String url = "http://graphical.weather.gov/xml/sample_products/browser_interface/ndfdXMLclient.php?whichClient=NDFDgen&lat=39.3073383&lon=-84.3183044&listLatLon=&lat1=&lon1=&lat2=&lon2=&resolutionSub=&listLat1=&listLon1=&listLat2=&listLon2=&resolutionList=&endPoint1Lat=&endPoint1Lon=&endPoint2Lat=&endPoint2Lon=&listEndPoint1Lat=&listEndPoint1Lon=&listEndPoint2Lat=&listEndPoint2Lon=&zipCodeList=&listZipCodeList=&centerPointLat=&centerPointLon=&distanceLat=&distanceLon=&resolutionSquare=&listCenterPointLat=&listCenterPointLon=&listDistanceLat=&listDistanceLon=&listResolutionSquare=&citiesLevel=&listCitiesLevel=&sector=&gmlListLatLon=&featureType=&requestedTime=&startTime=&endTime=&compType=&propertyName=&product=time-series&begin=2016-09-01T00%3A00%3A00&end=2016-09-30T00%3A00%3A00&Unit=e&maxt=maxt&Submit=Submit";
		//HttpGet httpgeturl = new HttpGet(url);
			
//	    try {
			//HttpResponse httpresponse = client.execute(httpgeturl);
			//System.out.println("***** HttpResponse status: " + httpresponse.getStatusLine().getStatusCode() + " *****");
			//BufferedReader br = new BufferedReader (new InputStreamReader(httpresponse.getEntity().getContent()));
			
			//String xmlInput = "<dwml xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" version=\"1.0\" xsi:noNamespaceSchemaLocation=\"http://www.nws.noaa.gov/forecasts/xml/DWMLgen/schema/DWML.xsd\"><head><product srsName=\"WGS 1984\" concise-name=\"time-series\" operational-mode=\"official\"><title>NOAA's National Weather Service Forecast Data</title><field>meteorological</field><category>forecast</category><creation-date refresh-frequency=\"PT1H\">2016-09-01T14:09:44Z</creation-date></product><source><more-information>http://www.nws.noaa.gov/forecasts/xml/</more-information><production-center>Meteorological Development Laboratory<sub-center>Product Generation Branch</sub-center></production-center><disclaimer>http://www.nws.noaa.gov/disclaimer.html</disclaimer><credit>http://www.weather.gov/</credit><credit-logo>http://www.weather.gov/images/xml_logo.gif</credit-logo><feedback>http://www.weather.gov/feedback.php</feedback></source></head><data><location><location-key>point1</location-key><point latitude=\"39.31\" longitude=\"-84.32\"/></location><moreWeatherInformation applicable-location=\"point1\">http://forecast.weather.gov/MapClick.php?textField1=39.31&textField2=-84.32</moreWeatherInformation><time-layout time-coordinate=\"local\" summarization=\"none\"><layout-key>k-p24h-n7-1</layout-key><start-valid-time>2016-09-01T08:00:00-04:00</start-valid-time><end-valid-time>2016-09-01T20:00:00-04:00</end-valid-time><start-valid-time>2016-09-02T08:00:00-04:00</start-valid-time><end-valid-time>2016-09-02T20:00:00-04:00</end-valid-time><start-valid-time>2016-09-03T08:00:00-04:00</start-valid-time><end-valid-time>2016-09-03T20:00:00-04:00</end-valid-time><start-valid-time>2016-09-04T08:00:00-04:00</start-valid-time><end-valid-time>2016-09-04T20:00:00-04:00</end-valid-time><start-valid-time>2016-09-05T08:00:00-04:00</start-valid-time><end-valid-time>2016-09-05T20:00:00-04:00</end-valid-time><start-valid-time>2016-09-06T08:00:00-04:00</start-valid-time><end-valid-time>2016-09-06T20:00:00-04:00</end-valid-time><start-valid-time>2016-09-07T08:00:00-04:00</start-valid-time><end-valid-time>2016-09-07T20:00:00-04:00</end-valid-time></time-layout><parameters applicable-location=\"point1\"><temperature type=\"maximum\" units=\"Fahrenheit\" time-layout=\"k-p24h-n7-1\"><name>Daily Maximum Temperature</name><value>78</value><value>78</value><value>81</value><value>84</value><value>87</value><value>89</value><value>88</value></temperature></parameters></data></dwml>";
			//String xmlInput = "<dwml xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" version=\"1.0\" xsi:noNamespaceSchemaLocation=\"http://www.nws.noaa.gov/forecasts/xml/DWMLgen/schema/DWML.xsd\"><head><product srsName=\"WGS 1984\" concise-name=\"time-series\" operational-mode=\"official\"><title>NOAA's National Weather Service Forecast Data</title><field>meteorological</field><category>forecast</category><creation-date refresh-frequency=\"PT1H\">2016-09-01T14:09:44Z</creation-date></product><source><more-information>http://www.nws.noaa.gov/forecasts/xml/</more-information><production-center>Meteorological Development Laboratory</production-center><disclaimer>http://www.nws.noaa.gov/disclaimer.html</disclaimer><credit>http://www.weather.gov/</credit><credit-logo>http://www.weather.gov/images/xml_logo.gif</credit-logo><feedback>http://www.weather.gov/feedback.php</feedback></source></head><data><location><location-key>point1</location-key><point latitude=\"39.31\" longitude=\"-84.32\"/></location><moreWeatherInformation applicable-location=\"point1\">http://forecast.weather.gov/MapClick.php?textField1=39.31&textField2=-84.32</moreWeatherInformation><time-layout time-coordinate=\"local\" summarization=\"none\"><layout-key>k-p24h-n7-1</layout-key><start-valid-time>2016-09-01T08:00:00-04:00</start-valid-time><end-valid-time>2016-09-01T20:00:00-04:00</end-valid-time><start-valid-time>2016-09-02T08:00:00-04:00</start-valid-time><end-valid-time>2016-09-02T20:00:00-04:00</end-valid-time><start-valid-time>2016-09-03T08:00:00-04:00</start-valid-time><end-valid-time>2016-09-03T20:00:00-04:00</end-valid-time><start-valid-time>2016-09-04T08:00:00-04:00</start-valid-time><end-valid-time>2016-09-04T20:00:00-04:00</end-valid-time><start-valid-time>2016-09-05T08:00:00-04:00</start-valid-time><end-valid-time>2016-09-05T20:00:00-04:00</end-valid-time><start-valid-time>2016-09-06T08:00:00-04:00</start-valid-time><end-valid-time>2016-09-06T20:00:00-04:00</end-valid-time><start-valid-time>2016-09-07T08:00:00-04:00</start-valid-time><end-valid-time>2016-09-07T20:00:00-04:00</end-valid-time></time-layout><parameters applicable-location=\"point1\"><temperature type=\"maximum\" units=\"Fahrenheit\" time-layout=\"k-p24h-n7-1\"><name>Daily Maximum Temperature</name><value>78</value><value>78</value><value>81</value><value>84</value><value>87</value><value>89</value><value>88</value></temperature></parameters></data></dwml>";
			String xmlInput = "<dwml xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" version=\"1.0\" xsi:noNamespaceSchemaLocation=\"http://www.nws.noaa.gov/forecasts/xml/DWMLgen/schema/DWML.xsd\"><head><product srsName=\"WGS 1984\" concise-name=\"time-series\" operational-mode=\"official\"><title>NOAA's National Weather Service Forecast Data</title><field>meteorological</field><category>forecast</category><creation-date refresh-frequency=\"PT1H\">2016-09-01T14:09:44Z</creation-date></product><source><more-information>http://www.nws.noaa.gov/forecasts/xml/</more-information><production-center>Meteorological Development Laboratory</production-center><disclaimer>http://www.nws.noaa.gov/disclaimer.html</disclaimer><credit>http://www.weather.gov/</credit><credit-logo>http://www.weather.gov/images/xml_logo.gif</credit-logo><feedback>http://www.weather.gov/feedback.php</feedback></source></head><data><location><location-key>point1</location-key><point latitude=\"39.31\" longitude=\"-84.32\"/></location><moreWeatherInformation applicable-location=\"point1\">http://forecast.weather.gov</moreWeatherInformation><time-layout time-coordinate=\"local\" summarization=\"none\"><layout-key>k-p24h-n7-1</layout-key><start-valid-time>2016-09-01T08:00:00-04:00</start-valid-time><end-valid-time>2016-09-01T20:00:00-04:00</end-valid-time><start-valid-time>2016-09-02T08:00:00-04:00</start-valid-time><end-valid-time>2016-09-02T20:00:00-04:00</end-valid-time><start-valid-time>2016-09-03T08:00:00-04:00</start-valid-time><end-valid-time>2016-09-03T20:00:00-04:00</end-valid-time><start-valid-time>2016-09-04T08:00:00-04:00</start-valid-time><end-valid-time>2016-09-04T20:00:00-04:00</end-valid-time><start-valid-time>2016-09-05T08:00:00-04:00</start-valid-time><end-valid-time>2016-09-05T20:00:00-04:00</end-valid-time><start-valid-time>2016-09-06T08:00:00-04:00</start-valid-time><end-valid-time>2016-09-06T20:00:00-04:00</end-valid-time><start-valid-time>2016-09-07T08:00:00-04:00</start-valid-time><end-valid-time>2016-09-07T20:00:00-04:00</end-valid-time></time-layout><parameters applicable-location=\"point1\"><temperature type=\"maximum\" units=\"Fahrenheit\" time-layout=\"k-p24h-n7-1\"><name>Daily Maximum Temperature</name><value>78</value><value>78</value><value>81</value><value>84</value><value>87</value><value>89</value><value>88</value></temperature></parameters></data></dwml>";
			BufferedReader br = new BufferedReader (new InputStreamReader(new ByteArrayInputStream(xmlInput	.getBytes())));

			JacksonXmlModule module = new JacksonXmlModule();
			module.setDefaultUseWrapper(false);
			XmlMapper mapper = new com.fasterxml.jackson.dataformat.xml.XmlMapper(module);

			mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);
		        
	        Dwml response = (Dwml)mapper.readValue(br,Dwml.class);
	        
			String xmlResponse = mapper.writeValueAsString(response);
	        System.out.println(xmlResponse);
	        
			System.out.println("location-key: "  + response.getData().getLocation().getLocationKey());
			System.out.println("latitude: "  + response.getData().getLocation().getPoint().getLatitude());
			System.out.println("longitude: "  + response.getData().getLocation().getPoint().getLongitude());
			System.out.println("moreWeatherInformation: "  + response.getData().getMoreWeatherInformation().toString());

			for (TimeLayout timeLayout : response.getData().getTimeLayouts())
			{
				System.out.println("time-layout");
				System.out.println("time-coordinate: " + timeLayout.getTimecoordinate());
				System.out.println("summarization: " + timeLayout.getSummarization());
				System.out.println("layout-key: " + timeLayout.getLayoutKey());
				for (String startValidTime : timeLayout.getStartValidTime())
				{
					System.out.println("start-valid-time" + startValidTime);
				}
				for (String endValidTime : timeLayout.getEndValidTime())
				{
					System.out.println("end-valid-time" + endValidTime);
				}
			}
				for (Parameters parameters1 : response.getData().getParameters1())
			{
				System.out.println("parameters");
				System.out.println("applicable-location: " + parameters1.getApplicableLocation());
				for (Temperature temperature : parameters1.getTemperature())
				{
					System.out.println("type: " + temperature.getType());
					System.out.println("units: " + temperature.getUnits());
					System.out.println("time-layout: " + temperature.getTimeLayout());
					System.out.println("name: " + temperature.getName());
					for (String value : temperature.getValue())
					{
						System.out.println("value: " + value);
					}
				}
			}
			
			/*							
			try {
				TimeUnit.MINUTES.sleep(Integer.parseInt(args[0]));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
		} catch(Exception exception) {
			System.out.println("***** HttpResponse exception *****");
			System.out.println(exception);
	    }
	    */
	}
}
