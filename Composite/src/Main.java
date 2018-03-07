public class Main
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		// Composite Pattern - 컴퍼짓 패턴을 통한 트리 구조 구현
		// https://youtu.be/78uNgDSHw-k
		
		
		Folder root = new Folder("root");
		Folder home = new Folder("home");
		Folder garam = new Folder("garam");
		Folder music = new Folder("music");
		Folder picture = new Folder("picture");
		Folder doc = new Folder("doc");
		Folder usr = new Folder("usr");

		File track1 = new File("track1");
		File track2 = new File("track2");
		File pic1 = new File("pic1");
		File doc1 = new File("doc1");
		File java = new File("java");

		
		// Tree
		root.addComponent(home);
			home.addComponent(garam);
				garam.addComponent(music);
					music.addComponent(track1);
					music.addComponent(track2);
				garam.addComponent(picture);
					picture.addComponent(pic1);
				garam.addComponent(doc);
					doc.addComponent(doc1);

		root.addComponent(usr);
			usr.addComponent(java);
			
		show(root);
	}

	
	private static void show(Component component)
	{
		System.out.println(component.getClass().getName()+"|"+component.getName());
		if(component instanceof Folder)
		{
			for(Component c : ((Folder)component).getChildren())
			{
				show(c);
			}
		}
	}
}
