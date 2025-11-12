public class Cube2 {
    private Cube basicCube;
    private String color;

    public Cube2() {
        basicCube = new Cube();
        this.color = "black";
    }

    public Cube2(int side) {
        this();
        basicCube.setSide(side);
    }

    public void setSide(int side) {
        if (side < 1) {
            throw new IllegalArgumentException("A cube’s side length must be equal to or greater than 1!");
        }
        basicCube.setSide(side);
    }

    public int getSide() {
        return basicCube.getSide();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    //the following methods have been started for you, but need to be completed
    public int calculateVolume() {
        return basicCube.calculateVolume();
    }
    public int calculateSurfaceArea() {
        return basicCube.calculateSurfaceArea();
    }
    public Cube2 add(Cube2 otherCube) {
        if (Math.sqrt(Cube2.this.getSide() * Cube2.this.getSide() + otherCube.getSide() * otherCube.getSide())%1==0) {
            int newSide = (int) Math.sqrt(Cube2.this.getSide() * Cube2.this.getSide() + otherCube.getSide() * otherCube.getSide());
            if (newSide < 1) {
                throw new IllegalArgumentException("A cube’s side length must be equal to or greater than 1!");
            }  
            return new Cube2(newSide);
        } else {
            throw new IllegalArgumentException("Resulting side length is invalid!");
        }
    }
    public Cube2 minus(Cube2 otherCube) {
        if (Cube2.this.getSide() >= otherCube.getSide()) {
            if (Math.sqrt(Cube2.this.getSide() * Cube2.this.getSide() - otherCube.getSide() * otherCube.getSide())%1==0) {
                int newSide = (int) Math.sqrt(Cube2.this.getSide() * Cube2.this.getSide() - otherCube.getSide() * otherCube.getSide());
                if (newSide < 1) {
                    throw new IllegalArgumentException("A cube’s side length must be equal to or greater than 1!");
                }
                return new Cube2(newSide);
            } else {
                throw new IllegalArgumentException("Resulting side length is invalid!");
            }
        } else if (Cube2.this.getSide() < otherCube.getSide()) {
            if (Math.sqrt(otherCube.getSide() * otherCube.getSide() - Cube2.this.getSide() * Cube2.this.getSide())%1==0) {
                int newSide = (int) Math.sqrt(otherCube.getSide() * otherCube.getSide() - Cube2.this.getSide() * Cube2.this.getSide());
                if (newSide < 1) {
                    throw new IllegalArgumentException("A cube’s side length must be equal to or greater than 1!");
                }
                return new Cube2(newSide);
            } else {
                throw new IllegalArgumentException("Resulting side length is invalid!");
            }
        } else {
            throw new IllegalArgumentException("Resulting side length is invalid!");
        }
        
    }
    public boolean equals(Cube2 otherCube) {
        if (this.getSide() == otherCube.getSide() && this.getColor().equals(otherCube.getColor())) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return "Cube{side=" + getSide() + ", color=" + color + "}";
    }
}
