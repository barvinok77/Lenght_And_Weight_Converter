package core;

import java.text.DecimalFormat;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/")
public class Converter {

	private String newLine = System.lineSeparator();

	@GET
	@Path("length/imperial/xml")
	@Produces("application/xml")
	public String convertInToCmfromInputXML(@DefaultValue("1") @QueryParam("in>>cm") Double input) {
		DecimalFormat df = new DecimalFormat("####0.00");
		Double inches = input;
		Double centimeter = inches * 2.54;
		String in = df.format(inches).toString();
		String cm = df.format(centimeter).toString();
		return "<calc conversion=" + "\"inches to centimeters\">" + "<inches>" + in + "</inches>" + "<centimeter>" + cm
				+ "</centimeter>" + "</calc>";
	}

	@GET
	@Path("length/imperial/json")
	@Produces("application/json")
	public String convertInToCmfromInputJSON(@DefaultValue("1") @QueryParam("in>>cm") Double input) {
		DecimalFormat df = new DecimalFormat("####0.00");
		Double inches = input;
		Double centimeter = (double) (inches * 2.54);
		String in = df.format(inches).toString();
		String cm = df.format(centimeter).toString();
		return "{" + newLine + "\t\"calc\":" + "{" + newLine + "\t\t\"conversion\":\"inches to centimeters\"," + newLine
				+ "\t\t\"inches\": " + in + "," + newLine + "\t\t\"centimeter\": " + cm + newLine + "\t\t}" + newLine + "}";
	}
	
	@GET
	@Path("length/metric/xml")
	@Produces("application/xml")
	public String convertCmToInfromInputXML(@DefaultValue("1") @QueryParam("cm>>in") Double input) {
		DecimalFormat df = new DecimalFormat("####0.00");
		Double centimeter = input;
		Double inches = centimeter * 0.3937;
		String in = df.format(inches).toString();
		String cm = df.format(centimeter).toString();
		return "<calc conversion=" + "\"centimeters to inches\">" + "<centimeter>" + cm + "</centimeter>" + "<inches>" + in
				+ "</inches>" + "</calc>";
	}
	
	@GET
	@Path("length/metric/json")
	@Produces("application/json")
	public String convertCmToInfromInputJSON(@DefaultValue("1") @QueryParam("cm>>in") Double input) {
		DecimalFormat df = new DecimalFormat("####0.00");
		Double centimeter = input;
		Double inches = centimeter * 0.3937;
		String in = df.format(inches).toString();
		String cm = df.format(centimeter).toString();
		return "{" + newLine + "\t\"calc\":" + "{" + newLine + "\t\t\"conversion\":\"centimeters to inches\"," + newLine
				+ "\t\t\"centimeter\": " + in + "," + newLine + "\t\t\"inches\": " + cm + newLine + "\t\t}" + newLine + "}";
	}
	
	@GET
	@Path("weight/imperial/xml")
	@Produces("application/xml")
	public String convertLbToKgfromInputXML(@DefaultValue("1") @QueryParam("lb>>kg") Double input) {
		DecimalFormat df = new DecimalFormat("####0.00");
		Double pound = input;
		Double kilogram = pound * 0.4536;
		String lb = df.format(pound).toString();
		String kg = df.format(kilogram).toString();
		return "<calc conversion=" + "\"pounds to kilograms\">" + "<pound>" + lb + "</pound>" + "<kilogram>" + kg
				+ "</kilogram>" + "</calc>";
	}
	
	@GET
	@Path("weight/imperial/json")
	@Produces("application/json")
	public String convertLbToKgfromInputJSON(@DefaultValue("1") @QueryParam("lb>>kg") Double input) {
		DecimalFormat df = new DecimalFormat("####0.00");
		Double pound = input;
		Double kilogram = pound * 0.4536;
		String lb = df.format(pound).toString();
		String kg = df.format(kilogram).toString();
		return "{" + newLine + "\t\"calc\":" + "{" + newLine + "\t\t\"conversion\":\"pounds to kilograms\"," + newLine
				+ "\t\t\"pound\": " + lb + "," + newLine + "\t\t\"kilogram\": " + kg + newLine + "\t\t}" + newLine + "}";
	}
	
	@GET
	@Path("weight/metric/xml")
	@Produces("application/xml")
	public String convertKgToLbfromInputXML(@DefaultValue("1") @QueryParam("kg>>lb") Double input) {
		DecimalFormat df = new DecimalFormat("####0.00");
		Double kilogram = input;
		Double pound = kilogram * 2.2046;
		String lb = df.format(pound).toString();
		String kg = df.format(kilogram).toString();
		return "<calc conversion=" + "\"kilograms to pounds\">" + "<kilogram>" + kg + "</kilogram>" + "<pound>" + lb
				+ "</pound>" + "</calc>";
	}
	
	@GET
	@Path("weight/metric/json")
	@Produces("application/json")
	public String convertKgToLbfromInputJSON(@DefaultValue("1") @QueryParam("kg>>lb") Double input) {
		DecimalFormat df = new DecimalFormat("####0.00");
		Double kilogram = input;
		Double pound = kilogram * 2.2046;
		String lb = df.format(pound).toString();
		String kg = df.format(kilogram).toString();
		return "{" + newLine + "\t\"calc\":" + "{" + newLine + "\t\t\"conversion\":\"kilograms to pounds\"," + newLine
				+ "\t\t\"kilogram\": " + kg + "," + newLine + "\t\t\"pound\": " + lb + newLine + "\t\t}" + newLine + "}";
	}
}
