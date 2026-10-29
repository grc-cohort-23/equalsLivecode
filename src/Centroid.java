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
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + r;
        result = prime * result + c;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Centroid other = (Centroid) obj;
        if (r != other.r)
            return false;
        if (c != other.c)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }
    

    // @Override
    // public boolean equals(Object other) {
    //     if (this == other) return true;
    //     if(other == null) return false;
    //     if(!this.getClass().equals(other.getClass())) return false;
    //     Centroid otherCentroid = (Centroid) other;
    //     if(this.r != otherCentroid.r) return false;
    //     if(this.c != otherCentroid.c) return false;
    //     if(this.name == null)return otherCentroid.name == null;
    //     return this.name.equals(otherCentroid.name);
    //     //if(this.r != other.r) return false;
    // }
}
