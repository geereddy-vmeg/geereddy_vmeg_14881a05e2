import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		
		if(students==null)
		{
			throw IllegalArgumentException;
		}
		
		return students;
	}

	@Override
	public void setStudents(Student[] students) {
		students[students.length]=students;
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		if(index<0 && index>=studtnts.length)
		{
			throw IllegalArgumentException;
		}
		return students[index];
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		if(student==null)
		{
			throw IllegalArgumentException;
		}
		students[index]=student;
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		if(student==null)
		{
			throw IllegalArgumentException;
		}
		for(int i=student.length;i>=0;i++)
		{
			student[i]=student[i+1];
		}	
		students[0]=student;
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		if(student==null)
		{
			throw IllegalArgumentException;
		}
		students[students.length]=student;
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		if(student==null)
		{
			throw IllegalArgumentException;
		}
		if(index<0 && index>=studtnts.length)
		{
			throw IllegalArgumentException;
		}
		students[index]=student;
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		if(index<0 && index>=studtnts.length)
		{
			throw IllegalArgumentException;
		}
		student[index]=null;
		for(int i=index;i<student.length-1;i++)
		{
			students[i]=students[i+1];
		}
		students[students.length]=null;
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		int x=0;
		for(int j=0;j<students.length;j++)
		{
			if(students[j]=student)
			{
				x=x+1;
				students[j]=null;
				for(int i=index;i<student.length-1;i++)
				{
				students[i]=students[i+1];
				}
				break;
			}
		}
			if(x==1)
			{	
			try
				{
					throw IllegalArgumentException;
				}
			
			catch(Exception e)
			{
				System.out.println("Student not exist");
			}
			}
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
		if(student==null)
		{
			throw IllegalArgumentException;
		}
		for(int i=index+1;i<students.length;i++)
		{
			students[i]=null;
		}
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
		if(student==null)
		{
			throw IllegalArgumentException;
		}
		for(int i=0;i<students.length;i++)
		{
			if(students[i]==student)
			{
				for(int j=i+1;j<students.length;j++)
				{
					students[j]=null;
				}
				break;
			}
		}
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
		if(index<0 && index>=studtnts.length)
		{
			throw IllegalArgumentException;
		}
		for(int i=0;i<index;i++)
		{
			students[i]=null;
		}
		x=index;
		for(int j=0;x<student.length;j++)
		{
			student[j]=student[x];
			x++;
		}
		for(int k=index;k<students.length;k++)
		{
			students[k]=null;
		}
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
		if(student==null)
		{
			throw IllegalArgumentException;
		}
		for(int m=0;m<students.length;m++)
		{
			if(student[m]==student)
			{
				break;
			}
		}
		m=index;
		for(int i=0;i<index;i++)
		{
			students[i]=null;
		}
		x=index;
		for(int j=0;x<student.length;j++)
		{
			student[j]=student[x];
			x++;
		}
		for(int k=index;k<students.length;k++)
		{
			students[k]=null;
		}
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
		int temp;
		for(int i=0;i<students.length;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(students[j]>students[i])
				{
				temp=students[j];
				students[j]=students[i];
				students[i]=temp;
				}
			}
		}
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
