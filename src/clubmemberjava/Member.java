package clubmemberjava;

public class Member {
    private char memberType;
    private int memberID;
    private String name;
    private double fees;

    public Member() {System.out.println("Parent Constructor with 0 parameters");}
    public Member(char pMemberType, int pMemberID, String pName, double pFees) {
        System.out.println("Parent Constructor with 4 parameters");
        memberType = pMemberType;
        memberID = pMemberID;
        name = pName;
        fees = pFees;
    }

    public void setMemberType(char pMemberType) {
        memberType = pMemberType;
    }
    public char getMemberType() {
        return memberType;
    }

    public void setMemberID(int pMemberID) {
        memberID = pMemberID;
    }
    public int getMemberID() {
        return memberID;
    }

    public void setName(String pName) {
        name = pName;
    }
    public String getName() {
        return name;
    }

    public void setFees(double pFees) {
        fees = pFees;
    }
    public double getFees() {
        return fees;
    }

    @Override
    public String toString() {
        return memberType + ", " + memberID + ", " + name + ", " + fees;
    }
}
