package clubmemberjava;

public class MultiClubMember extends Member{
    private int membershipPoints;

    public MultiClubMember(){System.out.println("Child two Constructor with 0 parameters");}
    public MultiClubMember(char pMemberType, int pMemberID, String pName, double pFees, int pMembershipPoints){
        super(pMemberType, pMemberID, pName, pFees);
        System.out.println("Child two with 4 parameters");
        membershipPoints = pMembershipPoints;
    }
    public void setMembershipPoints(int pMembershipPoints) {
        membershipPoints = pMembershipPoints;
    }
    public int getMembershipPoints() {
        return membershipPoints;
    }
    public String toString() {
        return super.toString() + ", " + membershipPoints;
    }
}
