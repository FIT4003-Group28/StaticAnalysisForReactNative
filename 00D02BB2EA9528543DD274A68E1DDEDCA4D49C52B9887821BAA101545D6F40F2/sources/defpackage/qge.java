package defpackage;
/* compiled from: PG */
/* renamed from: qge  reason: default package */
/* loaded from: classes7.dex */
public final class qge {
    private final akta a;
    private final aksp b;
    private final akpq c;
    private final akzh d;
    @dzsi
    private qgd e;
    private boolean f = false;

    public qge(akqq akqqVar, alec alecVar, aksp akspVar, akpq akpqVar, akzh akzhVar) {
        this.b = akspVar;
        this.a = alecVar.a(new aldj(akqqVar, 2), bntp.POLYLINE_MEASLES.c());
        this.c = akpqVar;
        this.d = akzhVar;
    }

    private final void c() {
        qgd qgdVar = this.e;
        if (qgdVar != null) {
            this.c.c(qgdVar);
            this.e = null;
        }
    }

    public final void a() {
        if (this.f) {
            bvoo.f(new RuntimeException("Attempted to add measle to map multiple times."));
            return;
        }
        this.f = true;
        this.b.c(this.a);
        c();
        qgd qgdVar = new qgd(this.a, this.d, this.c);
        this.e = qgdVar;
        this.c.a(qgdVar);
        this.c.b(this.e);
    }

    public final void b() {
        if (!this.f) {
            bvoo.f(new RuntimeException("Attempted to remove measle to map before it was added."));
            return;
        }
        this.f = false;
        c();
        this.b.d(this.a);
        this.b.a(this.a);
    }
}
