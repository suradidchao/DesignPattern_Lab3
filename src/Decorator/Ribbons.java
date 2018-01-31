package Decorator;

public class Ribbons extends TreeDecorator {
    public Ribbons(Tree tree) {
        this.tree = tree;
    }

    public String getDescription() {
        return tree.getDescription() + ", Decorator.Ribbons";
    }

    public double cost() {
        return 2 + tree.cost();
    }
}
