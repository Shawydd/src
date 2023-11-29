package lez04.exs.objects;

public class StudCLA {

	private String name;
	private int vote;

	public StudCLA(String name, int vote) {
		super();
		this.name = name;
		this.vote = vote;
	}

	public StudCLA() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getVote() {
		return vote;
	}

	public void setVote(int vote) {
		this.vote = vote;
	}

	public void stampDetails() {
		System.out.println("Student " + name + ", vote: " + vote + '.');
	}

}
