package jobsheet10;

public class document implements printable{
    public String fileName;
    public String content;

    @Override 
    public String getPrintableContent(){
        return content;
    }
    
}
