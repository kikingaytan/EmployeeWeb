package com.mock.employee.aop.logging;

import java.util.ArrayList;
import java.util.List;

public class TemporalForEachTest {

    public static void main (String[] args){
         class Bus{
            public Integer driverNo;

            public Bus(Integer driverNo, String driverName){
                this.driverName=driverName;
                this.driverNo= driverNo;
            }

            public Integer getDriverNo() {
                return driverNo;
            }

            public void setDriverNo(Integer driverNo) {
                this.driverNo = driverNo;
            }

            public String getDriverName() {
                return driverName;
            }

            public void setDriverName(String driverName) {
                this.driverName = driverName;
            }

            public String driverName;

            @Override
            public String toString() {
                return "Bus{" +
                    "driverNo=" + driverNo +
                    ", driverName='" + driverName + '\'' +
                    '}';
            }
        };
        List<Bus> bussesList = new ArrayList<>();
        bussesList.add(new Bus(1,"Jose Luis"));
        bussesList.add(new Bus(2,"Carlitos"));
        bussesList.add(new Bus(3,"Rolas"));
        System.out.println("Busses" +bussesList);

        bussesList.forEach(b ->{
            b.driverName=b.driverName+" "+b.driverName;
        });
        System.out.println("Busses2"+ bussesList);
    }
}
