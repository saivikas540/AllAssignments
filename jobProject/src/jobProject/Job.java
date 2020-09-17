package jobProject;

	import java.util.UUID;
	public class Job implements Comparable<Job>{
	    private UUID id;
	    private String name;
	    private long mobileNumber;
	    private String roleApply;
	    private String birthDate;
	    private int relevantExp;
	    private int totalExp;
	    private int references=0;
	    public Job(String name, long mobileNumber,String birthDate, String roleApply, int relevantExp, int totalExp,int references) {
	        this.name = name;
	        this.mobileNumber = mobileNumber;
	        this.roleApply = roleApply;
	        this.birthDate = birthDate;
	        this.relevantExp = relevantExp;
	        this.totalExp = totalExp;
	        this.references = references;
	    }
	    public Job(UUID id) {
	        this.id = id;
	    }
	    public UUID getId() {
	        return id;
	    }
	    public void setId(UUID uniqueKey) {
	        this.id = uniqueKey;
	    }
	    public String getName() {
	        return name;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }
	    public long getMobileNumber() {
	        return mobileNumber;
	    }
	    public void setMobileNumber(int mobileNumber) {
	        this.mobileNumber = mobileNumber;
	    }
	    public String getRoleApply() {
	        return roleApply;
	    }
	    public void setRoleApply(String roleApply) {
	        this.roleApply = roleApply;
	    }
	    public int getRelevantExp() {
	        return relevantExp;
	    }
	    public void setRelevantExp(int relevantExp) {
	        this.relevantExp = relevantExp;
	    }
	    public int getTotalExp() {
	        return totalExp;
	    }
	    public void setTotalExp(int totalExp) {
	        this.totalExp = totalExp;
	    }
	    public String getBirthDate() {
	        return birthDate;
	    }
	    public void setBirthDate(String birthDate) {
	        this.birthDate = birthDate;
	    }
	    public int compareTo(Job compareFruit) {
	        int compareQuantity = ((Job) compareFruit).getRelevantExp();
	        // ascending order
	        return  (this.relevantExp - compareQuantity);
	    }
	    public int getReferences() {
	        return references;
	    }
	    public void setReferences(int references) {
	        this.references = references;
	    }
	}
