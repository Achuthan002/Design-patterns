class Product {
    private String partA;
    private String partB;

    public void setPartA(String partA) { this.partA = partA; }
    public void setPartB(String partB) { this.partB = partB; }

    public void show() {
        System.out.println("Product with " + partA + " and " + partB);
    }
}

interface Builder {
    void buildPartA();
    void buildPartB();
    Product getResult();
}

class ConcreteBuilder implements Builder {
    private Product product = new Product();

    public void buildPartA() { product.setPartA("PartA1"); }
    public void buildPartB() { product.setPartB("PartB1"); }
    public Product getResult() { return product; }
}

class Director {
    private Builder builder;
    public Director(Builder builder) { this.builder = builder; }
    public void construct() {
        builder.buildPartA();
        builder.buildPartB();
    }
}
