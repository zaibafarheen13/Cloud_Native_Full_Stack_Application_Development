package Packages.Triangle;

public class triangle {
    double height, base;

    public triangle(double height,double base){   
        this.height=height;
        this.base=base;
    }

    public double calculateArea(){
        return 0.5*base*height;
    }

}
