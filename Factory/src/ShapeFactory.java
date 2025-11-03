public class ShapeFactory {
    
    public Shape create_shape(String type) {
        switch (type) {
            case "CIRCLE":
                return new Circle();
            case "SQUARE":
                return new Square();
            case "TRIANGLE":
                return new Triangle();
            case "HEXAGON":
                return new Hexagon();
            default:
                System.out.println("Unknown shape type");
                return null;
        }
    }
}