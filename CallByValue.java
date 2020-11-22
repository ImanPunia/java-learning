public class CallByValue {
    
    public static void main(String[] arg) {
        Shape circle = new Shape("circle");
        Shape square = new Shape("square");
        System.out.println("value of circle" + circle.name + "value of square" + square.name);
        swap(circle, square);
        System.out.println("After Swapping");
        System.out.println("value of circle" + circle.name + "value of square" + square.name);

    }

    private static void swap(Shape circle, Shape square){
        Shape temp = circle;
        circle = square;
        square = temp;
    }

}

class Shape{
    String name;

    Shape(String shape){
        name = shape;
    }

    public String getShape(){
        return name;
    }
}