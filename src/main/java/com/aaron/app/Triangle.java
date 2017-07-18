package com.aaron.app;

import java.util.List;

/**
 * Created by BIng on 7/17/2017.
 */
public class Triangle {
    private Point pointA;
    private Point pointB;
    private Point pointC;

    private List<Point> listPoints;

    public Triangle(){

    }

    public Triangle(Point pointA,Point pointB,Point pointC){
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
    }

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public List<Point> getListPoints() {
        return listPoints;
    }

    public void setListPoints(List<Point> listPoints) {
        this.listPoints = listPoints;
    }

    public void printTrangle(){
        System.out.println("PointA is: ("+pointA.getX()+","+pointA.getY()+");");
        System.out.println("PointB is: ("+pointB.getX()+","+pointB.getY()+");");
        System.out.println("PointC is: ("+pointC.getX()+","+pointC.getY()+");");
    }

    public void printListPoints(){
        for(Point point:listPoints){
            System.out.println("Point = ("+point.getX()+","+point.getY()+");");
        }
    }
}
