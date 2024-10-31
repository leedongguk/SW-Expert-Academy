import java.util.*;

class Solution {
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        String[] grades = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0"};
     
        
        int T;
        T = sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
        
        	int N = sc.nextInt();
        	int K = sc.nextInt();
        	
        	List<Student> students = new ArrayList<>();
        	
        	for(int i =0;i<N;i++) {
        		int mid = sc.nextInt();
        		int finals = sc.nextInt();
        		int assigment = sc.nextInt();
        		
        		double totalScore = mid * 0.35 + finals*0.45 + assigment*0.20;
        		students.add(new Student(i+1, totalScore));
        	}
        	
        	students.sort((s1, s2) -> Double.compare(s2.totalScore, s1.totalScore));
        	
        	int studentsPerGrade = N / 10; 
        	Map<Integer, String> gradeMap = new HashMap<>();
        	
            for (int i = 0; i < N; i++) {
                int gradeIndex = i / studentsPerGrade;
                gradeMap.put(students.get(i).index, grades[gradeIndex]);
            }
        	
            System.out.println("#" + test_case + " " + gradeMap.get(K));

        }
    }
    
    
}

class Student{
	int index;
	double totalScore;
	
	public Student(int index, double totalScore) {
		this.index = index;
		this.totalScore = totalScore;
	}
	
}
