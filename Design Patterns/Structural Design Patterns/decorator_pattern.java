interface Car {
    void assemble();
}

class BasicCar implements Car {
    public void assemble() {
        System.out.print("Basic Car. ");
    }
}

class CarDecorator implements Car {
    protected Car decoratedCar;

    public CarDecorator(Car c) {
        this.decoratedCar = c;
    }

    public void assemble() {
        this.decoratedCar.assemble();
    }
}

class SportsCar extends CarDecorator {
    public SportsCar(Car c) {
        super(c);
    }

    public void assemble() {
        super.assemble();
        System.out.print("Adding features of Sports Car. ");
    }
}
