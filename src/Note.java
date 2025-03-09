public class Note {
    private String theNote;
    private int priority;

    public Note(String theNote, int priority) {
        this.theNote = theNote;
        this.priority = priority;
    }
    public String getNote() {
        return theNote;
    }
    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return getPriority() + ", " + getNote();
    }
}
