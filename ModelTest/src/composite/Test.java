package composite;

public class Test {
    public static void main(String[] args) {
        Text text = new Text("我的文档");
        Image Image = new Image("我的图片");
        Foler folder = new Foler("我的文件夹");

        folder.add(text);
        folder.add(Image);

        folder.killVir();
    }
}
