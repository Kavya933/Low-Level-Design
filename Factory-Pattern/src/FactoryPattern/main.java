package FactoryPattern;

public class main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shapeObj = shapeFactory.getShape("Circle");
        shapeObj.draw();

        Shape shapeObj2 = shapeFactory.getShape("Square");
        shapeObj2.draw();
    }
}
