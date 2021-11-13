
public enum CabinCrewMemberType {

    CAPTAIN("captain"),
    FIRSTOFFICER("firstOfficer"),
    SECONDOFFICER("secondOfficer"),
    THIRDOFFICER("thirdOfficer"),
    PURSER("purser"),
    FLIGHTATTENDANT("flightAttendant");


    private final String rank;

    CabinCrewMemberType(String rank) {
        this.rank = rank;
    }

    public String getRank() {
        return rank;
    }
}
