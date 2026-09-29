public class student_marks_analyzer {
    int arr[] = { 80, 75, 90, 95, 85 };
    int sum=0;

    // printing all marks and also calculates average
    void showMarksAndAverage() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            sum+=arr[i];
        }
        int average=sum/arr.length;
        System.out.println("Average is:"+average);
        System.out.println("--------------------");
    }

    // find highest marks
    int highestMarks() {
        int highest = arr[0];
        int secondHighest=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > highest) {
                highest = arr[i];
            }
        }
        return highest;
    }
//lowest marks
    int lowestMarks() {
        int lowest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < lowest) {
                lowest = arr[i];
            }
        }
        return lowest;
    }
    boolean isFound(int marks){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==marks){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        student_marks_analyzer s = new student_marks_analyzer();
        s.showMarksAndAverage();
        System.out.println("Highest Marks:"+s.highestMarks());
        System.out.println("Lowesr Marks:"+s.lowestMarks());
        System.out.println("Marks Found:"+s.isFound(95));
    }
}
