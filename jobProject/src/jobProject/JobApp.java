package jobProject;
	public class JobApp {
	    public static void main(String[] args) {
	        JobProject obj = new JobProject();
	        obj.addCandidate();
	        try {
	            obj.getElgibleCandidate("Sr. ava Developer");
	        } catch (Exception e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	}
}
