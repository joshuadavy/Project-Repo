public enum SystemOfMeasurement {
    
    Celsius("C"),
    Fahrenheit("F");
    
    private String abbreviation;
    
    private SystemOfMeasurement(String abbreviation) {
        this.abbreviation = abbreviation;
    }
    
    public String getAbbreviation() {
        return abbreviation;
    }
}
