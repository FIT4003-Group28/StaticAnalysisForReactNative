package defpackage;

import android.content.Context;
import j$.util.concurrent.ConcurrentHashMap;
import java.nio.charset.Charset;
/* compiled from: PG */
/* renamed from: qqp  reason: default package */
/* loaded from: classes4.dex */
public final class qqp implements qqf {
    public static final Charset a = Charset.forName("UTF-8");
    public static final vbr b;
    public static final ConcurrentHashMap c;
    static Boolean d;
    static Long e;
    public final Context f;

    static {
        vbr vbrVar = new vbr(rtd.a());
        if (vbrVar.e) {
            throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
        }
        vbr vbrVar2 = new vbr(vbrVar.b, "gms:playlog:service:samplingrules_", vbrVar.d, false, vbrVar.f, vbrVar.h);
        b = new vbr(vbrVar2.b, vbrVar2.c, "LogSamplingRulesV2__", vbrVar2.e, vbrVar2.f, vbrVar2.h);
        c = new ConcurrentHashMap();
        d = null;
        e = null;
    }

    public qqp(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f = applicationContext;
        if (applicationContext != null) {
            vbt.g(applicationContext);
        }
    }
}
