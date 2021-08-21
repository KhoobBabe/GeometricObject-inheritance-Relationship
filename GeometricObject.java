package com.khubaib;

import java.util.Scanner;
import java.util.Date;

class GeometricObject {
    private String color;
    private Boolean filled;
    private Date dateCreated;

    public GeometricObject(){
        this("white", false);
    }

    public GeometricObject(String color, boolean filled){

        this.color = color;
        this.filled = filled;
        this.dateCreated = new Date();
    }
    public Date getDateCreated() {
        return dateCreated;
    }
    public String getColor(){
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString()
    {
        return ("Date Created : " + getDateCreated() +
                "\nColor : " + getColor() +
                "\nFilled : " + (isFilled()? "YES" : "NO"));
    }

}

class Rectangle_ extends GeometricObject {

    private double width;
    private double height;

    Rectangle_(){
        width = 1.0;
        height = 1.0;
    }

    Rectangle_(double width, double height, String color, Boolean fill){

        super(color, fill);
        this.width = width;
        this.height = height;

    }

    public double getArea(){

        return width * height;
    }
    public double getPerimeter(){

        return  2 * (width + height);
    }

    public String toString(){

        return    "The area of the Rectangle is: "+ getArea()+
                "\nThe perimeter of the Rectangle is: "+ getPerimeter()+
                "\nThe color of the Rectangle is: "+ getColor()+
                "\nIs the Rectangle filled: "+ isFilled()+
                "\nDate is; "+ getDateCreated();
    }

}

class TestProgram {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the height of the rectangle: ");
        double height = input.nextDouble();

        System.out.println("Enter the width of the Rectangle: ");
        double width = input.nextDouble();

        System.out.println("Enter the color of the Rectangle: ");
        String color = input.next();

        System.out.println("Is the Rectangle filled?: ");
        Boolean fill = input.nextBoolean();

        Rectangle_ rectangle = new Rectangle_( width, height, color, fill);

        System.out.println(rectangle.toString());

    }
}
