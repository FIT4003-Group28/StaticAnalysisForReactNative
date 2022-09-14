package defpackage;
/* compiled from: PG */
/* renamed from: awmf  reason: default package */
/* loaded from: classes3.dex */
public final class awmf {
    private awme b = awme.c;
    private final crzo<awme> a = new crzo<>(this.b);

    private final void g(int i, int i2) {
        awmd awmdVar = (awmd) this.b;
        awme d = awme.d(awmdVar.a + i, awmdVar.b + i2);
        this.b = d;
        this.a.b(d);
    }

    public final synchronized void a() {
        g(0, 1);
    }

    public final synchronized void b() {
        g(1, 0);
    }

    public final synchronized void c() {
        g(0, -1);
    }

    public final synchronized void d() {
        g(-1, 0);
    }

    public final awme e() {
        awme l = f().l();
        dbsk.s(l);
        return l;
    }

    public final crzm<awme> f() {
        return this.a.a;
    }
}
