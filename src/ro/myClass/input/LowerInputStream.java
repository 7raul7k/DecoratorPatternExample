package ro.myClass.input;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerInputStream extends FilterInputStream {
    public LowerInputStream(InputStream in){
        super(in);
    }
    public int read() throws IOException {
        int m = in.read();
        return (m==-1 ? m:Character.toLowerCase((char) m));
    }

    @Override
    public int read(byte[] b,int offset,int len) throws IOException {
        int result = in.read(b,offset,len);
        for(int i = offset;i < offset+result;i++){
            b[i] = (byte) Character.toLowerCase((char) b[i]);
        }
        return result;
    }
}
