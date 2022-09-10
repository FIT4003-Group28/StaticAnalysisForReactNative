package defpackage;

import android.content.Context;
import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: PG */
/* renamed from: cnlh  reason: default package */
/* loaded from: classes.dex */
public final class cnlh implements cnjw {
    @dzsi
    static Boolean a;
    @dzsi
    static Long b;
    private static final Charset c = Charset.forName("UTF-8");
    private static final cxjs d;
    private static final ConcurrentHashMap<String, cxju<dujt>> e;
    private final Context f;

    static {
        cxjs cxjsVar = new cxjs(coxs.b());
        if (cxjsVar.e) {
            throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
        }
        d = new cxjs(cxjsVar.a, cxjsVar.b, "gms:playlog:service:samplingrules_", cxjsVar.d, false, cxjsVar.h).a("LogSamplingRulesV2__");
        e = new ConcurrentHashMap<>();
        a = null;
        b = null;
    }

    public cnlh(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f = applicationContext;
        if (applicationContext != null) {
            cxju.c(applicationContext);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0134 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x007c A[SYNTHETIC] */
    @Override // defpackage.cnjw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(@defpackage.dzsi java.lang.String r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnlh.a(java.lang.String, int, int):boolean");
    }
}
