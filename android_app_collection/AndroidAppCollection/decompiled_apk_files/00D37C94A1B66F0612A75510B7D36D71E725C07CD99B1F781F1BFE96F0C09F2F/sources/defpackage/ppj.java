package defpackage;

import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ppj  reason: default package */
/* loaded from: classes4.dex */
public final class ppj implements pqi, pnk {
    final /* synthetic */ ppl a;
    private final Object b;
    private pqh c;
    private pnj d;

    public ppj(ppl pplVar, Object obj) {
        this.a = pplVar;
        this.c = pplVar.rJ(null);
        this.d = pplVar.n(null);
        this.b = obj;
    }

    private final boolean a(int i, ppz ppzVar) {
        ppz ppzVar2;
        if (ppzVar != null) {
            ppzVar2 = this.a.z(this.b, ppzVar);
            if (ppzVar2 == null) {
                return false;
            }
        } else {
            ppzVar2 = null;
        }
        int w = this.a.w(this.b, i);
        pqh pqhVar = this.c;
        if (pqhVar.a != w || !pxi.M(pqhVar.c, ppzVar2)) {
            this.c = this.a.b.i(w, ppzVar2);
        }
        pnj pnjVar = this.d;
        if (pnjVar.a != w || !pxi.M(pnjVar.c, ppzVar2)) {
            this.d = this.a.c.h(w, ppzVar2);
            return true;
        }
        return true;
    }

    @Override // defpackage.pqi
    public final void J(int i, ppz ppzVar, ppw ppwVar) {
        if (a(i, ppzVar)) {
            this.c.b(ppwVar);
        }
    }

    @Override // defpackage.pnk
    public final void K(int i, ppz ppzVar) {
        if (a(i, ppzVar)) {
            this.d.b();
        }
    }

    @Override // defpackage.pnk
    public final void L(int i, ppz ppzVar) {
        if (a(i, ppzVar)) {
            this.d.c();
        }
    }

    @Override // defpackage.pnk
    public final void M(int i, ppz ppzVar) {
        if (a(i, ppzVar)) {
            this.d.d();
        }
    }

    @Override // defpackage.pnk
    public final void N(int i, ppz ppzVar, int i2) {
        if (a(i, ppzVar)) {
            this.d.e(i2);
        }
    }

    @Override // defpackage.pnk
    public final void O(int i, ppz ppzVar, Exception exc) {
        if (a(i, ppzVar)) {
            this.d.f(exc);
        }
    }

    @Override // defpackage.pnk
    public final void P(int i, ppz ppzVar) {
        if (a(i, ppzVar)) {
            this.d.g();
        }
    }

    @Override // defpackage.pqi
    public final void Q(int i, ppz ppzVar, ppr pprVar, ppw ppwVar) {
        if (a(i, ppzVar)) {
            this.c.d(pprVar, ppwVar);
        }
    }

    @Override // defpackage.pqi
    public final void R(int i, ppz ppzVar, ppr pprVar, ppw ppwVar) {
        if (a(i, ppzVar)) {
            this.c.e(pprVar, ppwVar);
        }
    }

    @Override // defpackage.pqi
    public final void S(int i, ppz ppzVar, ppr pprVar, ppw ppwVar, IOException iOException, boolean z) {
        if (a(i, ppzVar)) {
            this.c.f(pprVar, ppwVar, iOException, z);
        }
    }

    @Override // defpackage.pqi
    public final void T(int i, ppz ppzVar, ppr pprVar, ppw ppwVar) {
        if (a(i, ppzVar)) {
            this.c.g(pprVar, ppwVar);
        }
    }

    @Override // defpackage.pqi
    public final void U(int i, ppz ppzVar, ppw ppwVar) {
        if (a(i, ppzVar)) {
            this.c.h(ppwVar);
        }
    }

    @Override // defpackage.pnk
    public final /* synthetic */ void Z() {
    }
}
