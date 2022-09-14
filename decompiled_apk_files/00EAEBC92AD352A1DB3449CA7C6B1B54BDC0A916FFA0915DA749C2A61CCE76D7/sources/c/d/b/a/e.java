package c.d.b.a;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class e {
    public static String a(d dVar) {
        try {
            return dVar instanceof f ? c(((f) dVar).b().get(0)) : c(dVar);
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static List<String> b(d dVar) {
        try {
            if (!(dVar instanceof f)) {
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(c(dVar));
                return arrayList;
            }
            List<d> b2 = ((f) dVar).b();
            ArrayList arrayList2 = new ArrayList(b2.size());
            for (int i = 0; i < b2.size(); i++) {
                arrayList2.add(c(b2.get(i)));
            }
            return arrayList2;
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException(e2);
        }
    }

    private static String c(d dVar) {
        return c.d.d.k.c.a(dVar.a().getBytes("UTF-8"));
    }
}
