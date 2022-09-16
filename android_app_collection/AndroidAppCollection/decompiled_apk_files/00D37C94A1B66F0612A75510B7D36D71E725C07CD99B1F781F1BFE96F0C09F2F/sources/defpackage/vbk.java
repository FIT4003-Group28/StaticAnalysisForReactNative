package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: vbk  reason: default package */
/* loaded from: classes4.dex */
public final class vbk {
    public static Context b = null;
    public static volatile boolean c = false;
    public static volatile Exception d = null;
    public static volatile boolean e = false;
    public static volatile Exception f;
    private static volatile vbk h;
    private static volatile vbk i;
    public final Context g;
    private final amqo k;
    private final amqo l;
    private final ampq m;
    public static final Object a = new Object();
    private static final amqo j = aqxo.i(gsh.i);

    public vbk(Context context) {
        amqo amqoVar = j;
        amqo i2 = aqxo.i(new nfd(context, 7));
        ampq j2 = ampq.j(new vcu(amqoVar));
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        amqoVar.getClass();
        i2.getClass();
        this.g = applicationContext;
        this.k = aqxo.i(amqoVar);
        this.l = aqxo.i(i2);
        this.m = j2;
    }

    public static vbk a(Context context) {
        vbj vbjVar;
        vbk vbkVar = h;
        if (vbkVar == null) {
            synchronized (a) {
                vbkVar = h;
                if (vbkVar == null) {
                    Context applicationContext = context.getApplicationContext();
                    try {
                        vbjVar = (vbj) antz.u(applicationContext, vbj.class);
                    } catch (IllegalStateException unused) {
                        vbjVar = null;
                    }
                    if (vbjVar == null && (applicationContext instanceof vbj)) {
                        ((vbj) applicationContext).jm();
                    }
                    vbkVar = new vbk(applicationContext);
                    h = vbkVar;
                }
            }
        }
        return vbkVar;
    }

    public final vdd b() {
        return (vdd) ((ampv) this.m).a;
    }

    public final ankx c() {
        return (ankx) this.k.get();
    }

    public final vca d() {
        return (vca) this.l.get();
    }
}
