package defpackage;
/* compiled from: PG */
/* renamed from: efx  reason: default package */
/* loaded from: classes.dex */
public final class efx {
    public final dxio<qbt> a;
    private final gga b;
    private final asik c;
    private final bvjj d;
    private final dxio<acyr> e;

    public efx(gga ggaVar, asik asikVar, bvjj bvjjVar, dxio<acyr> dxioVar, dxio<qbt> dxioVar2) {
        this.b = ggaVar;
        this.c = asikVar;
        this.d = bvjjVar;
        this.e = dxioVar;
        this.a = dxioVar2;
    }

    public final void a(fd fdVar) {
        if (c()) {
            this.a.a().N();
        } else {
            b(fdVar).g();
        }
    }

    public final gz b(fd fdVar) {
        fd acyfVar;
        gz b = this.b.g().b();
        if (((asio) this.c).b) {
            acyfVar = new aswz();
        } else {
            acyfVar = new acyf();
        }
        b.y(acyfVar, gfu.ACTIVITY_FRAGMENT.c);
        if (fdVar != null) {
            b.u(fdVar);
        }
        return b;
    }

    public final boolean c() {
        return this.e.a().c() && dktk.b(this.d.s(bvjk.L, dktk.EXPLORE.o)) == dktk.TRANSPORTATION;
    }
}
