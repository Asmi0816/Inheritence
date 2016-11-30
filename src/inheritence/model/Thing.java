package inheritence.model;

public abstract class Thing implements DoesStuff
{
	private String words;
	
	public String getWords()
	{
		return words;
	}
	
	public void setWords(String words)
	{
		this.words = words;
	}
	public void doesNada()
	{
		System.out.println("Grabbage code is my favorite code it the code that gets ready for sunday!" + words);
	}
}
