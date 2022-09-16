package defpackage;
/* compiled from: PG */
/* renamed from: bber  reason: default package */
/* loaded from: classes3.dex */
public final class bber {
    public final gga a;
    public final bwqv b;
    private final dxio<bvjj> c;
    private final dxio<akfa> d;

    public bber(gga ggaVar, bwqv bwqvVar, dxio<bvjj> dxioVar, dxio<akfa> dxioVar2) {
        this.a = ggaVar;
        this.b = bwqvVar;
        this.c = dxioVar;
        this.d = dxioVar2;
    }

    public final boolean a() {
        return c() >= 20;
    }

    public final void b(int i) {
        this.c.a().X(bvjk.iV, this.d.a().j(), Math.max(0, i));
    }

    public final int c() {
        return this.c.a().t(bvjk.iV, this.d.a().j(), 0);
    }
}
