interface Button {
    void render();
}

class WindowsButton implements Button {
    public void render() {
        System.out.println("Render Windows Button");
    }
}

class MacOSButton implements Button {
    public void render() {
        System.out.println("Render MacOS Button");
    }
}

interface GUIFactory {
    Button createButton();
}

class WindowsFactory implements GUIFactory {
    public Button createButton() {
        return new WindowsButton();
    }
}

class MacOSFactory implements GUIFactory {
    public Button createButton() {
        return new MacOSButton();
    }
}
