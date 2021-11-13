
public enum CabinCrewMemberType {

    CAPTAIN("captain"),
    FIRSTOFFICER("firstOfficer"),
    PURSER("purser"),
    FLIGHTATTENDANT("flightAttendant");


    private final String rank;

    CabinCrewMemberType(String rank){
        this.rank = rank;
    }

    public String getCabinCrewMemberRank(){
            return rank;
    }
}
