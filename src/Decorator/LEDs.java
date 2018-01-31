package Decorator;

public class LEDs extends TreeDecorator {
    public LEDs(Tree tree) {
        this.tree = tree;
    }

    public String getDescription() {
        return tree.getDescription() + ", Decorator.LEDs";
    }

    public double cost() {
        return 10 + tree.cost();
    }
}
