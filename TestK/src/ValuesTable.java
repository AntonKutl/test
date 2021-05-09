import java.util.Objects;

public class ValuesTable {
    private String indicator;
    private String resource;
    private int year;
    private String uM;
    private double value;

    public ValuesTable(String indicator, String resource, int year, String uM, double value) {
        this.indicator = indicator;
        this.resource = resource;
        this.year = year;
        this.uM = uM;
        this.value = value;
    }

    public String getIndicator() {
        return indicator;
    }

    public void setIndicator(String indicator) {
        this.indicator = indicator;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getuM() {
        return uM;
    }

    public void setuM(String uM) {
        this.uM = uM;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return indicator +" "+resource +" "+ year +" "+ uM + " " + value+"\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ValuesTable that = (ValuesTable) o;
        return year == that.year && Objects.equals(indicator, that.indicator) && Objects.equals(resource, that.resource) && Objects.equals(uM, that.uM);
    }

    @Override
    public int hashCode() {
        return Objects.hash(indicator, resource, year, uM);
    }
}
