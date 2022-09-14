package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: byoi  reason: default package */
/* loaded from: classes4.dex */
public final class byoi implements byps {
    public final Application a;
    public final dxio<auhi> b;
    public final bvjj c;
    public boolean d;
    public final dxio<auhj> e;

    public byoi(Application application, dxio<auhi> dxioVar, dxio<auhj> dxioVar2, bvjj bvjjVar) {
        this.a = application;
        this.b = dxioVar;
        this.e = dxioVar2;
        this.c = bvjjVar;
    }

    @Override // defpackage.byps
    public final void a() {
        this.c.S(bvjk.df, true);
        this.b.a().m(dpyv.AREA_TRAFFIC_WARM_UP.dm);
    }
}
