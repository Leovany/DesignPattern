package com.leovany.principle.singleresponsibility;

/**
 * 1. 单一职责原则 ： 类级单一职责
 */
public class SingleResponsibility2 {
    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("摩托车");

        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");

        WaterVehicle waterVehicle = new WaterVehicle();
        waterVehicle.run("轮船");
    }

    private static class RoadVehicle {
        public void run(String vehicle) {
            System.out.println(vehicle + " 在公路上运行!!");
        }
    }

    private static class AirVehicle {
        public void run(String vehicle) {
            System.out.println(vehicle + " 在天空上运行!!");
        }
    }

    private static class WaterVehicle {
        public void run(String vehicle) {
            System.out.println(vehicle + " 在水路上运行!!");
        }
    }
}
