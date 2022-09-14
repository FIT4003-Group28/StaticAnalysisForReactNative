package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: aahf  reason: default package */
/* loaded from: classes2.dex */
public class aahf implements aahd {
    private final Activity a;
    private final dxio<qbt> b;
    private dbsg<dpjx> c = dbpy.a;

    public aahf(Activity activity, dxio<qbt> dxioVar) {
        this.a = activity;
        this.b = dxioVar;
    }

    @Override // defpackage.aahd
    public final Boolean a() {
        return Boolean.valueOf(this.c.a());
    }

    @Override // defpackage.aahd
    public final void b() {
        qcw x = qcx.x();
        x.u(amvh.M(this.c.b(), this.a));
        this.b.a().m(x.a());
    }

    @Override // defpackage.aahd
    public final Runnable c() {
        return null;
    }

    public final void d(diwb diwbVar) {
        dbsg<dpjx> dbsgVar;
        if ((diwbVar.a & 134217728) != 0) {
            dpjx dpjxVar = diwbVar.y;
            if (dpjxVar == null) {
                dpjxVar = dpjx.n;
            }
            dbsgVar = dbsg.i(dpjxVar);
        } else {
            dbsgVar = dbpy.a;
        }
        this.c = dbsgVar;
    }
}
