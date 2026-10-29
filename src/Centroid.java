
import java.util.Objects;

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
        if (this == other) return true;
        if(other == null) return false;
        if(!getClass().equals(other.getClass())) return false;
        Centroid otherCentroid = (Centroid) other;
        if(r != otherCentroid.r) return false;
        if(c != otherCentroid.c) return  false;
        if(name == null){
            return otherCentroid.name == null;
            }
        if(!name.equals(otherCentroid.name)) return false;
        }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + this.r;
        hash = 17 * hash + this.c;
        hash = 17 * hash + Objects.hashCode(this.name);
        return hash;
    }
    }

