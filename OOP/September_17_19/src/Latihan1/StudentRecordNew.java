package Latihan1;

public class StudentRecordNew extends StudentRecord{
    private double compGrade;
    private double average;
    
    public double getCompGrade() {
        return compGrade;
    }

    public void setCompGrade(double compGrade) {
        this.compGrade = compGrade;
    }
    
    @Override
    public double getAverage() {
        average = (getCompGrade() + getMathGrade() + getEnglishGrade() + getScienceGrade()) / 4;
        return average;
    }
}
