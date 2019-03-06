public class DVD {

    String dvdName, Category;

    public  DVD (){

    }

    public DVD(String dvdName, String category) {
        this.dvdName = dvdName;
        Category = category;
    }

    public String getDvdName() {
        return dvdName;
    }

    public void setDvdName(String dvdName) {
        this.dvdName = dvdName;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    @Override
    public String toString() {
        return "DVD{" +
                "dvdName='" + dvdName + '\'' +
                ", Category='" + Category + '\'' +
                '}';
    }
}
