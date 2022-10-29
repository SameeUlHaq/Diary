package Model;

public class Diary {

    private String title;
    private String diaryInput;
    private String date;

    public Diary(String title, String diaryInput, String date) {
        this.title = title;
        this.diaryInput = diaryInput;
        this.date = date;
    }

    public Diary() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDiaryInput() {
        return diaryInput;
    }

    public void setDiaryInput(String diaryInput) {
        this.diaryInput = diaryInput;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}