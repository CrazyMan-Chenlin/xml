import dom4jExample.Controller;
import dom4jExample.Model;
import org.dom4j.DocumentException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class View {
    private final static String ID="id";
     private final static String NAME="name";
    private final static String GNDER="gender";
    private final static String PHONE="phone";
    private final static String EMAIL="email";
    private final static String ADDRESS="address";
    static int  inputChoose() {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        try {
            int choose = Integer.parseInt(reader.readLine());
            if(choose!=1&&choose!=2&&choose!=3&&choose!=4&&choose!=5){
                throw new IOException();
            }
            return choose;
        } catch (Exception e) {
            System.out.println("您输入的不是一个数据");
            inputChoose();
        }
      return 0;
    }
    static int Anymore()  {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("退出程序按1，继续使用程序按2");
        try {
            int more=Integer.parseInt(reader.readLine());
            if(more!=2&&more!=1){
                throw new Exception();
            }
            return more;
        } catch (Exception e) {
            System.out.println("您输入的数值有无，清重新输入。");
        }
        return 0;
    }

    public static void main(String[] args) throws IOException, DocumentException {
        System.out.println("欢迎使用联系人数据库。。。。。");
        while(true) {
            System.out.println("请选择你要执行的操作：");
            System.out.println("添加联系人选择1");
            System.out.println("删除联系人选择2");
            System.out.println("修改联系人选择3");
            System.out.println("查询联系人选择4");
            System.out.println("退出程序选择5");
            BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
                 int choose=inputChoose();
                 String str;
                 int i;
                Controller controller = new Controller();
                switch (choose) {
                    case 1:
                        Model model = new Model();
                        System.out.println("请输入联系人姓名：");
                        str = reader.readLine();
                        str.trim();
                        model.setName(str);
                        System.out.println("请输入联系人id");
                        str = reader.readLine();
                        str.trim();
                        model.setId(str);
                        System.out.println("请输入联系人性别");
                        str = reader.readLine();
                        str.trim();
                        model.setGender(str);
                        System.out.println("请输入联系人电话");
                        str = reader.readLine();
                        str.trim();
                        model.setPhone(str);
                        System.out.println("请输入联系人emial");
                        str = reader.readLine();
                        str.trim();
                        model.setEmail(str);
                        System.out.println("请输入联系人地址");
                        str = reader.readLine();
                        str.trim();
                        model.setAddress(str);
                        controller.addContact(model);
                        break;
                    case 2:
                        controller.selectContact();
                        System.out.println("输入要删除第几个联系人的序号");
                        str = reader.readLine();
                        i = Integer.parseInt(str);
                        controller.delteContact(i);
                        break;
                    case 3:
                        controller.selectContact();
                        Model model1 = new Model();
                        System.out.println("输入要修改第几个联系人的序号");
                        str = reader.readLine();
                        i = Integer.parseInt(str);
                        System.out.println("请输入修改联系人的信息");
                        System.out.println("请输入联系人姓名：");
                        str = reader.readLine();
                        str.trim();
                        model1.setName(str);
                        System.out.println("请输入联系人id");
                        str = reader.readLine();
                        str.trim();
                        model1.setId(str);
                        System.out.println("请输入联系人性别");
                        str = reader.readLine();
                        str.trim();
                        model1.setGender(str);
                        System.out.println("请输入联系人电话");
                        str = reader.readLine();
                        str.trim();
                        model1.setPhone(str);
                        System.out.println("请输入联系人emial");
                        str = reader.readLine();
                        str.trim();
                        model1.setEmail(str);
                        System.out.println("请输入联系人地址");
                        str = reader.readLine();
                        str.trim();
                        model1.setAddress(str);
                        controller.updateContact(i, model1);
                        break;
                    case 4:
                        controller.selectContact();
                        break;
                    case 5:
                        break;
                    default: {
                        System.out.println("输入错误，请重新输入");
                    }
                }
            int more=Anymore();
            if(more==1){
                System.out.println("退出程序成功！");
                reader.close();
                break;
            }
        }
    }
}
