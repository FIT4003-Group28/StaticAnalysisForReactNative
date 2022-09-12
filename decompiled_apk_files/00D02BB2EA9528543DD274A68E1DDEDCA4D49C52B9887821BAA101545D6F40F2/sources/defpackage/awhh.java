package defpackage;
/* compiled from: PG */
/* renamed from: awhh  reason: default package */
/* loaded from: classes3.dex */
public class awhh {
    public final akpq a;
    private final dxio<akzh> e;
    @dzsi
    public awhg b = null;
    @dzsi
    public Runnable c = null;
    private volatile double f = dcyn.a;
    public volatile double d = dcyn.a;
    @dzsi
    private volatile akqq g = null;

    public awhh(dxio<akzh> dxioVar, akpq akpqVar) {
        this.e = dxioVar;
        this.a = akpqVar;
    }

    public final void a() {
        float f = this.e.a().p().k;
        akqq S = this.e.a().g().S();
        double d = f;
        if (d == this.f && this.g != null && akqq.v(S, this.g, 1000.0d)) {
            return;
        }
        this.f = d;
        this.d = akyx.f(this.e.a());
        this.g = S;
        Runnable runnable = this.c;
        if (runnable == null) {
            return;
        }
        runnable.run();
    }
}
