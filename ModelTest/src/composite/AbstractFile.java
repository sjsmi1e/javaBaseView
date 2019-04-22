package composite;

import java.util.ArrayList;
import java.util.List;

public interface AbstractFile {
    public void killVir();
}

class Text implements AbstractFile{
    String name;

    public Text(String name) {
        this.name = name;
    }

    public void killVir(){
        System.out.println("Test "+name+" 正在杀毒。。。");
    }
}

    class Image implements AbstractFile{
        String name;

        public Image(String name) {
            this.name = name;
        }
        public void killVir(){
            System.out.println("Image "+name+" 正在杀毒。。。");
        }

    }

    class Foler implements AbstractFile{
        String name;
        List<AbstractFile> child = new ArrayList<AbstractFile>();

        public Foler(String name) {
            this.name = name;
        }
        //增加节点
        public void add(AbstractFile file){
            child.add(file);
        }
        //删除节点
        public void remove(AbstractFile file){
            child.remove(file);
        }
        //获得节点
        public AbstractFile get(int index){
            return child.get(index);
        }
        //功能
        public void killVir(){
            for (AbstractFile f:child){
                f.killVir();
            }
        }

    }