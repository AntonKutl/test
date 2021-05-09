public class MultiplicationTable {
    private String name;
    private String basicuM;
    private String calculateduM;
    private int degree;

    public MultiplicationTable(String name, String basicuM, String calculateduM, int degree) {
        this.name = name;
        this.basicuM = basicuM;
        this.calculateduM = calculateduM;
        this.degree = degree;
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

    public int getDegree() {
        return degree;
    }

    public void setDegree(int degree) {
        this.degree = degree;
    }
}
