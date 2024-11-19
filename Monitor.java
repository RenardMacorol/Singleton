public class Monitor     {
	private HelpDesk helpDesk1;
	private HelpDesk helpDesk2;
	private HelpDesk helpDesk3;

	Monitor(HelpDesk hp1,HelpDesk hp2, HelpDesk hp3){
		this.helpDesk1 = hp1;
		this.helpDesk2 = hp2;
		this.helpDesk3 = hp3;
	}

	public void show(){
		
		System.out.println(helpDesk1.getName() + " Number: " + helpDesk1.getQue());
		System.out.println(helpDesk2.getName() + " Number: " + helpDesk2.getQue());
		System.out.println(helpDesk3.getName() + " Number: " + helpDesk3.getQue());
	}
}
