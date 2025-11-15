public class Cube2 {
    private Cube basicCube;
    private String color;
    private int side;
    public void checkSide(int side) {
        if (side < 1) {
            throw new IllegalArgumentException("A cube's side length must be equal to or greater than 1!");
        }
    }  
    public Cube2() {
        this.basicCube = new Cube();
        this.side = 1;
        this.color = "black";
    }
    public Cube2(int side) {
        checkSide(side);
        this.basicCube = new Cube(side);
        this.side = side;
        this.color = "black";
    }
    public Cube2(int side, String color) {
        checkSide(side);
        this.basicCube = new Cube(side);
        this.side = side;
        this.color = color;
    }
    public int getSide() {
        return side;
    }
    public void setSide(int side) {
        checkSide(side);
        this.side = side;
        this.basicCube.setSide(side);
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int calculateSurfaceArea() {
        return basicCube.calculateSurfaceArea();
    }
    public int calculateVolume() {
        return basicCube.calculateVolume();
    }
    public String toString() {
        return "Cube{side=" + Cube2.this.side + ", color=\"" + Cube2.this.color + "\"}";
    }
    public Cube2 add(Cube2 otherOne) {
        if (Math.sqrt(Cube2.this.side * Cube2.this.side + otherOne.side * otherOne.side)%1 == 0) {
        int newSide = (int) Math.sqrt(Cube2.this.side * Cube2.this.side + otherOne.side * otherOne.side);
        checkSide(newSide);
        return new Cube2(newSide, Cube2.this.color);
        } else {
            throw new IllegalArgumentException("The cubes' side will not be an integer!");
        }
    }
    public Cube2 minus(Cube2 otherOne) {
        if (Math.sqrt(Cube2.this.side * Cube2.this.side - otherOne.side * otherOne.side)%1 == 0) {
            int newSide = (int) Math.sqrt(Math.sqrt((Cube2.this.side * Cube2.this.side - otherOne.side * otherOne.side)*(Cube2.this.side * Cube2.this.side - otherOne.side * otherOne.side)));
            checkSide(newSide);
            return new Cube2(newSide, Cube2.this.color);
        } else {
            throw new IllegalArgumentException("The cubes' side will not be an integer!");
        }
    }
    public boolean equals(Cube2 otherOne) {
        if ((Cube2.this.side == otherOne.side) & (Cube2.this.color.equals(otherOne.color))) {
            return true;
        } else {
            return false;
        }
    }
}