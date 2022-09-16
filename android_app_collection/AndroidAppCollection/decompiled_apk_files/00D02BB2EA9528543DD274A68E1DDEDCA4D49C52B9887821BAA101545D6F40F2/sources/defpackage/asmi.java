package defpackage;
/* compiled from: PG */
/* renamed from: asmi  reason: default package */
/* loaded from: classes2.dex */
public final class asmi implements ggd {
    private final gga a;
    private final btrm b;
    private final crfm c;
    private final asik d;
    private boolean e;

    public asmi(gga ggaVar, btrm btrmVar, crfm crfmVar, asik asikVar) {
        this.a = ggaVar;
        this.b = btrmVar;
        this.c = crfmVar;
        this.d = asikVar;
    }

    private final void f() {
        this.e = false;
        this.b.a(this);
    }

    @Override // defpackage.ggd
    public final void a(Runnable runnable) {
        if (arym.GUIDED_NAV.equals(((crgt) this.c).b)) {
            asmh.a(runnable).aJ(this.a);
        } else {
            runnable.run();
        }
    }

    @Override // defpackage.ggd
    public final void b() {
        f();
        if (!arym.FREE_NAV.equals(((crgt) this.c).b) || !((asio) this.d).b) {
            ((crgt) this.c).d(false);
        }
    }

    @Override // defpackage.ggd
    public final boolean c(fd fdVar) {
        return fdVar instanceof asmm;
    }

    public final void d() {
        if (this.e) {
            f();
            this.a.bc.d();
        }
    }

    public final void e() {
        if (this.e) {
            return;
        }
        this.e = true;
        this.a.bc.c(this);
        btrm btrmVar = this.b;
        dceq a = dcet.a();
        a.b(crhp.class, new asmj(crhp.class, this, bvrj.UI_THREAD));
        btrmVar.g(this, a.a());
    }
}
