package defpackage;

import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: bvpm  reason: default package */
/* loaded from: classes.dex */
public final class bvpm {
    public static final /* synthetic */ int a = 0;
    private static final Map<String, bvpl> b;
    private static bvpl[] c;
    private static final StringBuilder d;

    static {
        Charset.forName("UTF-8");
        b = new HashMap();
        c = new bvpl[0];
        d = new StringBuilder();
    }

    private bvpm() {
    }

    public static synchronized void a(String str, @dzsi String str2) {
        synchronized (bvpm.class) {
            b(str, str2);
        }
    }

    public static synchronized void b(String str, @dzsi String str2) {
        synchronized (bvpm.class) {
            if (str != null) {
                if (str2 == null) {
                    if (b.remove(str) == null) {
                    }
                    Map<String, bvpl> map = b;
                    c = (bvpl[]) map.values().toArray(new bvpl[map.size()]);
                    c();
                    return;
                }
                Map<String, bvpl> map2 = b;
                bvpl bvplVar = map2.get(str);
                if (bvplVar == null || !bvplVar.b.equals(str2)) {
                    map2.put(str, new bvpl(str, str2));
                    Map<String, bvpl> map3 = b;
                    c = (bvpl[]) map3.values().toArray(new bvpl[map3.size()]);
                    c();
                    return;
                }
            }
        }
    }

    private static synchronized void c() {
        bvpl[] bvplVarArr;
        synchronized (bvpm.class) {
            d.setLength(0);
            for (bvpl bvplVar : c) {
                StringBuilder sb = d;
                sb.append("{");
                sb.append(bvplVar.a);
                sb.append(": ");
                sb.append(bvplVar.b);
                sb.append("} ");
            }
            d.toString();
        }
    }
}
