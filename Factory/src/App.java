public class App {
    public static void main(String[] args) throws Exception {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle = shapeFactory.create_shape("CIRCLE");
        Shape square = shapeFactory.create_shape("SQUARE");
        Shape triangle = shapeFactory.create_shape("TRIANGLE");
        Shape hexagon = shapeFactory.create_shape("HEXAGON");

        circle.draw();
        square.draw();
        triangle.draw();
        hexagon.draw();
    }

}