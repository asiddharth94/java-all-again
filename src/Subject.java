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

    public void setTotalMarks(short tM) {
        totalMarks = tM;
    }

    public short getMarksObtained() {
        return marksObtained;
    }

    public void setMarksObtained(short mO) {
        marksObtained = mO;
    }

    public Subject(short subId, String subName, short tM, short mO) {
        subjectId = subId;
        subjectName = subName;
        totalMarks = tM;
        marksObtained = mO;
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
