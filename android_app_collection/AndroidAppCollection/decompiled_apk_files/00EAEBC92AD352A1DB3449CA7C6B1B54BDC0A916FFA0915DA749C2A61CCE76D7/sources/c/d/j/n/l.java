package c.d.j.n;

import android.net.Uri;
import android.util.Base64;
import java.io.ByteArrayInputStream;
/* loaded from: classes.dex */
public class l extends z {
    public l(c.d.d.g.h hVar) {
        super(c.d.d.b.a.a(), hVar);
    }

    static byte[] a(String str) {
        c.d.d.d.i.a(str.substring(0, 5).equals("data:"));
        int indexOf = str.indexOf(44);
        String substring = str.substring(indexOf + 1, str.length());
        return b(str.substring(0, indexOf)) ? Base64.decode(substring, 0) : Uri.decode(substring).getBytes();
    }

    static boolean b(String str) {
        if (!str.contains(";")) {
            return false;
        }
        String[] split = str.split(";");
        return split[split.length - 1].equals("base64");
    }

    @Override // c.d.j.n.z
    protected c.d.j.k.d a(c.d.j.o.c cVar) {
        byte[] a2 = a(cVar.p().toString());
        return a(new ByteArrayInputStream(a2), a2.length);
    }

    @Override // c.d.j.n.z
    protected String a() {
        return "DataFetchProducer";
    }
}
