import com.google.zxing.WriterException;
import com.lnlandscape.utils.QRCodeFactory;

import java.io.IOException;

public class Test {
    public static void main(String[] args) {

        String content="https://www.baidu.com";
        String logUri="e:/timg.bmp";
        String outFileUri="e:/2.jpg";
        int[]  size=new int[]{430,430};
        String format = "jpg";

        try {
            new QRCodeFactory().CreatQrImage(content, format, outFileUri, logUri,size);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (WriterException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
