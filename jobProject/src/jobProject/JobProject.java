package jobProject;
	import java.util.ArrayList;
	import java.util.List;
	import java.util.Scanner;
	import java.util.UUID;
	import java.util.*;
	public class JobProject {
	    List<Job> cars = new ArrayList<Job>();
	    UUID uniqueKey = UUID.randomUUID();
	    Map<String, Integer> map = Map.of("Java Developer", 2, ".Net Developer", 2, "Training Support", 1,
	            "Sr. Java Developer", 5, "Sr. .Net Developer", 5, "Java Architect", 5);
	    public void addCandidate() {
	        Scanner sc = new Scanner(System.in);
	        int choice = 0;
	        System.out.println("Enter your Name:");
	        String name = sc.nextLine();
	        System.out.println("Enter your Mobile Number:");
	        long mobile = sc.nextLong();
	        System.out.println("Revelant experience (in months)");
	        int relevantExp = sc.nextInt();
	        System.out.println("Total Experience (in months).");
	        int totalExp = sc.nextInt();
	        System.out.println("Enter your birthdate (dd-mm-yyyy)");
	        sc.nextLine();
	        String birthDate = sc.nextLine();
	        System.out.println("Enter your Role Name:");
	        String role = sc.nextLine();
	        if (role.equals("Sr. Java Developer") || role.equals("Sr. .Net Developer") || role.equals("Java Architect")) {
	            System.out.println("How Many references");
	            choice = sc.nextInt();
	        }
	        Job obj = new Job(name, mobile, birthDate, role, relevantExp, totalExp, choice);
	        cars.add(obj);
	        System.out.println("submitted");
	        sc.close();
	    }
	    public void getElgibleCandidate(String str) throws Exception {
	        List<String> names = new ArrayList<String>();
	        List<Job> jobObjects = new ArrayList<Job>();
	        if (str.equals("Sr. Java Developer") || str.equals("Sr. .Net Developer") || str.equals("Java Architect")) {
	            for (int i = 0; i < cars.size(); i++) {
	                if (cars.get(i).getRoleApply().equals(str) && (int) (cars.get(i).getRelevantExp() / 12) >= map.get(str)
	                        && cars.get(i).getReferences() >= 2) {
	                    jobObjects.add(cars.get(i));
	                    cars.get(i).setId((uniqueKey));
	                    names.add(cars.get(i).getName());
	                }
	            }
	        } else if ((str.equals("Java Developer") || str.equals(".Net Developer") || str.equals("Training Support"))) {
	            for (int i = 0; i < cars.size(); i++) {
	                if (cars.get(i).getRoleApply().equals(str)
	                        && (int) (cars.get(i).getRelevantExp() / 12) >= map.get(str)) {
	                    jobObjects.add(cars.get(i));
	                    cars.get(i).setId((uniqueKey));
	                    names.add(cars.get(i).getName());
	                }
	            }
	        } else {
	            throw new Exception("Enter Valid Role");
	        }
	        Collections.sort(jobObjects);
	        for (int i = 0; i < jobObjects.size(); i++) {
	            System.out.println(jobObjects.get(i).getName());
	        }
	    }
}
