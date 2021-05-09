import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

         ArrayList<ValuesTable> listValuesTable=new ArrayList<>();
         ArrayList <MultiplicationTable> listMultiplicationTable = new ArrayList <>();
         ArrayList <ConvertationTable> listConvertationTable=new ArrayList<>();

        listValuesTable.add(new ValuesTable("Природный газ ","*",2017,"Mtoe",  148.67));


        listMultiplicationTable.add(new MultiplicationTable("*","ft3ng","Gft3ng",-9));
        listMultiplicationTable.add(new MultiplicationTable("*","tce","Gtce",-9));
        listMultiplicationTable.add(new MultiplicationTable("*","toe","Gtoe",-9));
        listMultiplicationTable.add(new MultiplicationTable("*","btu","MMbtu",-6));
        listMultiplicationTable.add(new MultiplicationTable("*","j","Mj",-6));
        listMultiplicationTable.add(new MultiplicationTable("*","boe","Kboe",-3));
        listMultiplicationTable.add(new MultiplicationTable("*","toe","Mtoe",-6));
        listMultiplicationTable.add(new MultiplicationTable("*","wh","Twh",-12));
        listMultiplicationTable.add(new MultiplicationTable("*","toe","Ktoe",-3));
        listMultiplicationTable.add(new MultiplicationTable("*","j","Gj",-9));
        listMultiplicationTable.add(new MultiplicationTable("*","boe","Mboe",-6));
        listMultiplicationTable.add(new MultiplicationTable("*","tce","Mtce",-6));
        listMultiplicationTable.add(new MultiplicationTable("*","m3ng","Gm3ng",-9));
        listMultiplicationTable.add(new MultiplicationTable("*","boe","Bboe",-9));
        listMultiplicationTable.add(new MultiplicationTable("*","btu","Qbtu",-15));
        listMultiplicationTable.add(new MultiplicationTable("*","m3ng","Mm3ng",-6));
        listMultiplicationTable.add(new MultiplicationTable("*","ft3ng","Mft3ng",-6));
        listMultiplicationTable.add(new MultiplicationTable("*","wh","Gwh",-9));

        listConvertationTable.add(new ConvertationTable("*","Mtce","Mm3ng",751.4768963));
        listConvertationTable.add(new ConvertationTable("*","Gft3ng","Twh",0.301277062));
        listConvertationTable.add(new ConvertationTable("*","MMbtu","Mj",1055.060005));
        listConvertationTable.add(new ConvertationTable("*","Bboe","Qbtu",0.58000001));
        listConvertationTable.add(new ConvertationTable("*","Gtoe","Gtce",1.4285714));
        listConvertationTable.add(new ConvertationTable("*","Gj","Gwh",0.000277778));
        listConvertationTable.add(new ConvertationTable("*","Ktoe","Kboe",6.8419054));
        listConvertationTable.add(new ConvertationTable("*","Gm3ng","Gft3ng",35.958043));




        СonverterTest con =new СonverterTest(listMultiplicationTable,listConvertationTable);
        for (int i=0;i<12;i++){
            listValuesTable=con.start(listValuesTable);
        }

        System.out.println(listValuesTable.toString());
    }
}
