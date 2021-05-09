import java.util.ArrayList;
import java.util.stream.Collectors;

public class СonverterTest {

     public СonverterTest( ArrayList<MultiplicationTable> listMultiplicationTable, ArrayList<ConvertationTable> listConvertationTable) {
          this.listMultiplicationTable = listMultiplicationTable;
          this.listConvertationTable = listConvertationTable;
     }

     private ArrayList <MultiplicationTable> listMultiplicationTable;
     private ArrayList <ConvertationTable> listConvertationTable;


     public ArrayList<ValuesTable> start (ArrayList<ValuesTable> listValuesTable){

          ArrayList<ValuesTable> tempValuesTable=new ArrayList<ValuesTable>();
          tempValuesTable.addAll(listValuesTable);

          for (int i=0; i<listValuesTable.size(); i++){
               for (int j=0; j<listMultiplicationTable.size();j++){
                    if (listValuesTable.get(i).getuM()==listMultiplicationTable.get(j).getCalculateduM()){
                         for (int k=0; k<listValuesTable.size();k++){
                              if (listMultiplicationTable.get(j).getBasicuM()!=listValuesTable.get(i).getuM()){
                                   tempValuesTable.add(new ValuesTable(listValuesTable.get(i).getIndicator(),listValuesTable.get(i).getResource()
                                           ,listValuesTable.get(i).getYear(),listMultiplicationTable.get(j).getBasicuM(),
                                           listValuesTable.get(i).getValue()*Math.pow(10,listMultiplicationTable.get(j).getDegree()*-1)));
                              }
                         }
                    }
               }
          }

          for (int i=0; i<listValuesTable.size(); i++){
               for (int j=0; j<listMultiplicationTable.size();j++){
                    if (listValuesTable.get(i).getuM()==listMultiplicationTable.get(j).getBasicuM()){
                         for (int k=0; k<listValuesTable.size();k++){
                              if (listMultiplicationTable.get(j).getCalculateduM()!=listValuesTable.get(i).getuM()){
                                   tempValuesTable.add(new ValuesTable(listValuesTable.get(i).getIndicator(),listValuesTable.get(i).getResource()
                                           ,listValuesTable.get(i).getYear(),listMultiplicationTable.get(j).getCalculateduM(),
                                           listValuesTable.get(i).getValue()*Math.pow(10,listMultiplicationTable.get(j).getDegree())));
                              }
                         }
                    }
               }
          }

          for (int i=0; i<listValuesTable.size(); i++){
               for (int j=0; j<listConvertationTable.size();j++){
                    if (listValuesTable.get(i).getuM()==listConvertationTable.get(j).getBasicuM()){
                         tempValuesTable.add(new ValuesTable(listValuesTable.get(i).getIndicator(),listValuesTable.get(i).getResource()
                                 ,listValuesTable.get(i).getYear(),listConvertationTable.get(j).getCalculateduM(),
                                 listValuesTable.get(i).getValue()*listConvertationTable.get(j).getRatio()));

                    }
               }
          }

          return (ArrayList<ValuesTable>) tempValuesTable.stream().distinct().collect(Collectors.toList());
     }
}
