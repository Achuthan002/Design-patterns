interface Shape {
    void draw();
}

class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class Square implements Shape {
    public void draw() {
        System.out.println("Drawing Square");
    }
}

class ShapeFactory {
    public Shape getShape(String type) {
        if (type == null) return null;
        if (type.equalsIgnoreCase("CIRCLE")) return new Circle();
        if (type.equalsIgnoreCase("SQUARE")) return new Square();
        return null;
    }
}
