public class HelpDesk{
	private String deskName;
	private CentralQue que;

	public HelpDesk(String name, CentralQue que){
		this.deskName = name;
		this.que = que;
	}

	public String getName(){
		return deskName;
	}

	public int getQue(){
		return que.getCurrentQue();
	}

	public void add(){
		que.addQueNum();
	}

	public void reset(){
		que.resetQue();
	}



}
