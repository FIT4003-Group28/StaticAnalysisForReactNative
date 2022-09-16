package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: zqx  reason: default package */
/* loaded from: classes7.dex */
public final class zqx implements zfo {
    private final Context a;
    private final amve b;

    public zqx(Context context, amve amveVar) {
        this.a = context;
        this.b = amveVar;
    }

    @dzsi
    private final String f(bvsz bvszVar) {
        dgas x = vyb.x(this.b);
        if (x == null) {
            return null;
        }
        return bvtb.c(this.a.getResources(), x, bvszVar).toString();
    }

    @Override // defpackage.zfo
    @dzsi
    public final String a() {
        return f(bvsz.ABBREVIATED);
    }

    @Override // defpackage.zfo
    @dzsi
    public final String b() {
        return f(bvsz.EXTENDED);
    }

    @Override // defpackage.zfo
    @dzsi
    public final String c() {
        bvsz bvszVar = bvsz.EXTENDED;
        int f = vxp.f(this.b.b());
        if (f < 0) {
            return null;
        }
        return vxp.g(this.a, f, bvszVar);
    }

    @Override // defpackage.zfo
    @dzsi
    public final String d() {
        return zba.b(this.b.b());
    }

    @Override // defpackage.zfo
    public final Boolean e() {
        return Boolean.FALSE;
    }
}
