import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class Notebook implements INotable{
    List<Note> notes;
    @Override
    public Note next_todo() {
       Note note = null;
       int maxPriority = 0;
       for(Note n: notes) {
           if(n.getPriority() > maxPriority) {
               maxPriority = n.getPriority();
               note = n;
           }
       }
       return note;
    }
    @Override
    public boolean save(String fileName) {
        FileWriter fileWriter = null;
        boolean flag = true;
        try {
            fileWriter = new FileWriter(new File(fileName), true);
            for (Note n: notes) {
                fileWriter.write(n.toString() + "\r\n");
            }
            fileWriter.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            flag = false;
        }
        return flag;
    }
    public void addNote(String name, int priority) {
        notes.add(new Note(name, priority));
    }
}