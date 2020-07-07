package string1;

public class Snippet {
	public static void main(String args[]) {
		Snippet snippet = new Snippet();
		String a = snippet.makeFolderName("¥hoge", "fuga");
		System.out.println(a);
	}
	public String makeFolderName(String folderName, String fileName) {
		if (!folderName.endsWith("¥")) {
			folderName += "¥";
		}
		return folderName + fileName;
	}
}

