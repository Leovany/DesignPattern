package com.leovany.principle.singleresponsibility;

/**
 * 1. 单一职责原则 ： 应当只执行一项职责
 *
 */
public class SingleResponsibility1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("摩托车");
        vehicle.run("汽车");
        vehicle.run("轮船");
    }

    private static class Vehicle {
        public void run(String vehicle) {
            System.out.println(vehicle + " 在公路上运行!!");
        }
    }
}
