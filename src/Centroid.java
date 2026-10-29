public class Centroid {
    private int r;
    private int c;
    private String name;
    
    public Centroid(int r, int c, String name) {
        this.r = r;
        this.c = c;
        this.name = name;
    }

    @Override
    public boolean equals(Object other){
        if(this == other) return true;
        if(other == null) return false;
        if(!getClass().equals(other.getClass())) return false;
        Centroid otherCentroid = (Centroid) other;
        if(r != otherCentroid.r) return false;
        if(c != otherCentroid.c) return false;
        if(name == null) {
            return otherCentroid.name == null;
        }
        return name.equals(otherCentroid.name);
    }

    // @Override 
    // HashCode, didn't have the option to paste the logic here in class, R.I.P my vscode

}
