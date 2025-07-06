public class Cone extends Shape {
    private double radius;
    private double height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    private double slantHeight() {
        return Math.sqrt(radius * radius + height * height);
    }

    @Override
    public double surfaceArea() {
        return Math.PI * radius * (radius + slantHeight());
    }

    @Override
    public double volume() {
        return (1.0 / 3.0) * Math.PI * radius * radius * height;
    }

    @Override
    public String toString() {
        return String.format("Cone [radius=%.2f, height=%.2f] → surface area = %.2f, volume = %.2f",
                             radius, height, surfaceArea(), volume());
    }
}
