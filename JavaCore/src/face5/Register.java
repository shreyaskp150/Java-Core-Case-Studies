package face5;
public class Register
{
	String name;
	String address;
	String contactNumber;
	String email;
	String proofType;
	String proofId;
	public static int regID=0;
	public static int arr[] =new int[25];
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getProofType() {
		return proofType;
	}
	public void setProofType(String proofType) {
		this.proofType = proofType;
	}
	public String getProofId() {
		return proofId;
	}
	public void setProofId(String proofId) {
		this.proofId = proofId;
	}
	public static int getRegID() {
		return regID;
	}
	public static void setRegID(int regID) {
		Register.regID = regID;
	}
}