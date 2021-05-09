public class ConvertationTable {
    private String name;
    private String basicuM;
    private String calculateduM;
    private double ratio;

    public ConvertationTable(String name, String basicuM, String calculateduM, double ratio) {
        this.name = name;
        this.basicuM = basicuM;
        this.calculateduM = calculateduM;
        this.ratio = ratio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBasicuM() {
        return basicuM;
    }

    public void setBasicuM(String basicuM) {
        this.basicuM = basicuM;
    }

    public String getCalculateduM() {
        return calculateduM;
    }

    public void setCalculateduM(String calculateduM) {
        this.calculateduM = calculateduM;
    }

    public double getRatio() {
        return ratio;
    }

    public void setRatio(double ratio) {
        this.ratio = ratio;
    }


}
