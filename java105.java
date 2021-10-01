// import jdk.javadoc.internal.doclets.formats.html.resources.standard;

public class java105 {
    // trianle blueprint creation 
    //  trianle has instances: base, height, 3 side lengths
    //  need a constructor function --> has the same name as the class, and always returns a instance of the class
    class Triangle {
        // atributes of Triangle
        double base, height, sidelenOne, sidelenTwo, sidelenThree;

        // make a static vvariable
        static int numOfSides = 3;
        
        // constructor of Triangle class
        public Triangle(double base, double height, double sidelenOne, double sidelenTwo, double sidelenThree){
            this.base = base;
            this.height = height;
            this.sidelenOne = sidelenOne;
            this.sidelenTwo = sidelenTwo;
            this.sidelenThree = sidelenThree;
        }

        public double findArea(){

            double area = this.base * this.height / 2;

            return area;
        }




    public static void main(String[] args) {
        java105 obj = new java105();

        Triangle triangleA = obj.new Triangle(15, 8, 15, 8, 7);
        Triangle triangleB = obj.new Triangle(3, 2.598, 3, 3, 3);

        double areaOfTrianglleA = triangleA.findArea();
        double areaOfTrianglleB = triangleB.findArea();

        System.out.println("Area of triangleA: "+areaOfTrianglleA);
        System.out.println("Area of triangleB: "+areaOfTrianglleB);
        System.out.println(triangleA.sidelenOne);
        System.out.println(triangleB.base);

        System.out.println(Triangle.numOfSides);


        // System.out.println("Instance of a Trinagle A is created "+triangleA);
        // System.out.println("Instance of Trinagle B is created "+triangleB);
    }
        

    }

    
}
