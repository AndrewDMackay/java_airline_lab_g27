
public class Pilot extends CabinCrewMember{

    private String name;
    private CabinCrewMemberType type;
    private String pilotLicenceNumber;

    public Pilot(String name, CabinCrewMemberType cabinCrewMemberType, String pilotLicenceNumber){
        super(cabinCrewMemberType.getRank());
        this.name = name;
        this.type = cabinCrewMemberType;
        this.pilotLicenceNumber = pilotLicenceNumber;
    }

    public String getName(){
        return name;
    }

    public CabinCrewMemberType getType(){
        return type;
    }

    public String getPilotLicenceNumber (){
        return pilotLicenceNumber;
    }
}
