package november29th;
abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}

class MyBook extends Book{

    @Override
    void setTitle(String s) {
        this.title=s;
    }
}
public class books {
    public static void main(String[] args)
	{
	    MyBook chapter=new MyBook(); 
	    chapter.setTitle("wings of fire");
            System.out.println("The title is: "+chapter.getTitle());
	} 
}