
public abstract class CabinCrewMember {

    private String name;
    private String rank;

    public CabinCrewMember(String name, String rank){
        this.name = name;
        this.rank = rank;
    }

    public String getCabinCrewMemberName(){
        return name;
    }

    public String getCabinCrewMemberRank(){
        return rank;
    }
}
