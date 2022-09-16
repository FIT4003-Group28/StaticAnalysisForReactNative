package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.nio.charset.Charset;
import java.util.Map;
/* compiled from: PG */
/* renamed from: acuf  reason: default package */
/* loaded from: classes.dex */
public final class acuf {
    public final Map a = new ConcurrentHashMap();

    public static String a(apzg apzgVar) {
        if (apzgVar.c.d() > 0) {
            return apzgVar.c.D(Charset.defaultCharset());
        }
        if (!apzgVar.qn(atno.b)) {
            return null;
        }
        atnp atnpVar = (atnp) apzgVar.qm(atno.b);
        if ((atnpVar.b & 2) == 0) {
            return null;
        }
        int i = atnpVar.e;
        int i2 = atnpVar.d;
        StringBuilder sb = new StringBuilder(23);
        sb.append(i2);
        sb.append(":");
        sb.append(i);
        return sb.toString();
    }
}
