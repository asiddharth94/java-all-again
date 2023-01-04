public class Subject {

    private short subjectId;
    private String subjectName;

    private short totalMarks;
    private short marksObtained;

    public short getSubjectId() {
        return subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public short getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(short totalMarks) {
        this.totalMarks = totalMarks;
    }

    public short getMarksObtained() {
        return marksObtained;
    }

    public void setMarksObtained(short marksObtained) {
        this.marksObtained = marksObtained;
    }

    public Subject(short subjectId, String subjectName, short totalMarks, short marksObtained) {
        this.subjectId = subjectId;
        this.subjectName = subjectName;
        this.totalMarks = totalMarks;
        this.marksObtained = marksObtained;
    }
    @Override
    public String toString() {
        return "Subject{" +
                "subjectId=" + subjectId +
                ", subjectName='" + subjectName + '\'' +
                ", totalMarks=" + totalMarks +
                ", marksObtained=" + marksObtained +
                '}';
    }

}
