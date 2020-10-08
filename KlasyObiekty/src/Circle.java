import static java.lang.Math.PI;

public class Circle {
    private Double radius;

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double promien) {
        this.radius = promien;
    }

    public Double countLength() {
        return radius * radius * PI;
    }
}
