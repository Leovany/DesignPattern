package com.leovany.principle.singleresponsibility;

/**
 * 1. 单一职责原则: 只有逻辑足够简单下，可以违背单一职责原则，方法级单一职责
 */
public class SingleResponsibility3 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.runRoad("摩托车");
        vehicle.runAir("飞机");
        vehicle.runWater("轮船");
    }

    private static class Vehicle {
        public void runRoad(String vehicle) {
            System.out.println(vehicle + " 在公路上运行!!");
        }

        public void runAir(String vehicle) {
            System.out.println(vehicle + " 在天空上运行!!");
        }

        public void runWater(String vehicle) {
            System.out.println(vehicle + " 在水路上运行!!");
        }
    }
}
