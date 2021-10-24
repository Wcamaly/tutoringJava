package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Students {
	List<Student> students;
	Map<String, Student> mStudents;
	public Students() {
		super();
		this.students = new ArrayList<Student>();
		this.mStudents = new HashMap<String,Student>();
	}
	
	/*
	void addStudent(Student s) {
		students.add(s);
	}
	
	void removeStudent(Student s) {
		students.remove(s);
	}

	Student getStudent (int indx) {
		return this.getStudent(indx);
	}
	*/
	
	
	/*
	 {
	 	"38393939" : {
	 		name: "",
	 		surname: "",
	 		},
	 	"33892389" : {
	 		name: "",
	 		surname: "",
	 	},
	 }
	 |"3930393"| name: ""   |
	 |         | Surname: ""|
	 
	 |"4444444"|  name: ""  |
	 |         | surname: "" |
	 * */
	
	void addStudent(Student s) {
		mStudents.put(s.getDocument(), s);
	}
	
	boolean removeStudent(Student s) {
		return mStudents.remove(s.getDocument(), s);
	}

	Student getStudent (String document) {
		return this.mStudents.get(document);
	}
	
	
	
}


