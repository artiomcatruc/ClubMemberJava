package clubmemberjava;

public class SingleClubMember  extends  Member{
    private int club;

    public SingleClubMember() {System.out.println("Child Constructor with 0 parameters");}
    public SingleClubMember(char pMemberType, int pMemberID, String pName, double pFees, int pClub) {
        super(pMemberType, pMemberID, pName, pFees);
        System.out.println("Child with 4 parameters");
        club = pClub;
    }
    public void setClub(int pClub) {
        club = pClub;
    }
    public int getClub() {
        return club;
    }

    public String toString() {
        return super.toString() + ", " + club;
    }
}
