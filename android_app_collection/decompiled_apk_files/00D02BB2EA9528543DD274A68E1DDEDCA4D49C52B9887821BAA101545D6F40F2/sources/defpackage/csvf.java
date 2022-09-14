package defpackage;

import android.content.Context;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: csvf  reason: default package */
/* loaded from: classes5.dex */
public final class csvf {
    private static csvf a;
    private final Set<Integer> b = new HashSet();
    private final csvo c;

    private csvf(Context context) {
        this.c = csvo.a(context);
    }

    public static synchronized csvf a(Context context) {
        csvf csvfVar;
        synchronized (csvf.class) {
            if (a == null) {
                a = new csvf(context);
            }
            csvfVar = a;
        }
        return csvfVar;
    }

    @SafeVarargs
    private static <T> dbsg<dcdc<T>> d(T... tArr) {
        return dbsg.i(dcdc.t(tArr));
    }

    public final synchronized void b(dcdc<Integer> dcdcVar) {
        this.b.addAll(dcdcVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:133:0x0265, code lost:
        if (r19.c.n() != false) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02a0 A[Catch: all -> 0x02d1, TryCatch #0 {, blocks: (B:5:0x0005, B:7:0x0098, B:8:0x00a2, B:72:0x0164, B:73:0x0168, B:136:0x026a, B:138:0x0270, B:139:0x0273, B:144:0x029a, B:146:0x02a0, B:154:0x02c4, B:155:0x02c7, B:150:0x02b2, B:152:0x02b8, B:141:0x0277, B:142:0x0285, B:143:0x0293, B:75:0x016d, B:77:0x0177, B:80:0x0187, B:81:0x018f, B:83:0x0199, B:85:0x01a1, B:88:0x01ab, B:89:0x01b5, B:91:0x01bd, B:94:0x01c7, B:96:0x01cf, B:99:0x01db, B:101:0x01e3, B:103:0x01eb, B:105:0x01f3, B:108:0x01fd, B:110:0x0205, B:112:0x020d, B:114:0x0215, B:117:0x021e, B:119:0x0226, B:122:0x022f, B:123:0x0238, B:125:0x0240, B:128:0x0249, B:129:0x0250, B:130:0x0257, B:132:0x025f, B:10:0x00a7, B:12:0x00ad, B:15:0x00bd, B:16:0x00c3, B:18:0x00c9, B:20:0x00cf, B:23:0x00d7, B:24:0x00dd, B:26:0x00e3, B:29:0x00eb, B:31:0x00f1, B:34:0x00f9, B:36:0x00ff, B:38:0x0105, B:40:0x010b, B:43:0x0112, B:45:0x0118, B:47:0x011e, B:49:0x0124, B:52:0x012b, B:54:0x0131, B:57:0x0138, B:58:0x013d, B:60:0x0143, B:63:0x014a, B:64:0x014f, B:65:0x0154, B:67:0x015a, B:156:0x02cb), top: B:164:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.util.List<java.lang.Integer> c() {
        /*
            Method dump skipped, instructions count: 832
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.csvf.c():java.util.List");
    }
}
