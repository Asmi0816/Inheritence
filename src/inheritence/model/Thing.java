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
}
