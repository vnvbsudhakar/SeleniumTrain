package interfaceDemo;

public class WordClass implements MsOffice{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("save word file");
		
	}

	@Override
	public void saveAs() {
		// TODO Auto-generated method stub
		System.out.println("save as word file");
	}

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("open word");
		
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("close wor");
		
	}

	@Override
	public void newfile() {
		// TODO Auto-generated method stub
		System.out.println("new word file");
		
	}
	
	public void addHeader() {
		System.out.println("Add heading");
	}

}
