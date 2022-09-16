package defpackage;
/* compiled from: PG */
/* renamed from: pct  reason: default package */
/* loaded from: classes7.dex */
public final class pct implements pcx<dlfb> {
    public static final int a = auiy.COMMUTE_NOTIFICATION_PROBER.a().intValue();
    private final dxio<byqh> b;
    private final dxio<cjqq> c;

    public pct(dxio<byqh> dxioVar, dxio<cjqq> dxioVar2) {
        this.b = dxioVar;
        this.c = dxioVar2;
    }

    @Override // defpackage.pcx
    public final boolean a(int i) {
        return a == i;
    }

    @Override // defpackage.pcx
    public final dssr<dlfb> b() {
        return (dssr) dlfb.h.cu(7);
    }

    @Override // defpackage.pcx
    public final /* bridge */ /* synthetic */ int c(dlfb dlfbVar) {
        return dpyv.COMMUTE_NOTIFICATION_PROBER.dm;
    }

    @Override // defpackage.pcx
    public final /* bridge */ /* synthetic */ void d(pau pauVar, pas pasVar, dlfb dlfbVar) {
        dlfb dlfbVar2 = dlfbVar;
        cjqp g = this.c.a().g();
        cjta b = cjtd.b();
        b.b = dlfbVar2.f;
        b.g(dlfbVar2.g);
        g.c(b.a());
        this.b.a().m(dlfbVar2);
    }
}
