public class Printer {
    private int paperCount;
    private int tonerVolume;

    public Printer(int inputPaperCount, int inputTonerVolume){
        this.paperCount = inputPaperCount;
        this.tonerVolume = inputTonerVolume;
    }

    public int getPaperCount() {
        return paperCount;
    }

    public void setPaperCount(int inputPaperCount) {
        this.paperCount = inputPaperCount;
    }

    public void print(int pages, int copies) {
        int totalPages = pages * copies;
        if (totalPages <= this.paperCount && totalPages <= this.tonerVolume) {
            this.paperCount -= totalPages;
            this.tonerVolume -= totalPages;
        }
    }

    public int getTonerVolume() {
        return tonerVolume;
    }

    public void setTonerVolume(int tonerVolume) {
        this.tonerVolume = tonerVolume;
    }
}
