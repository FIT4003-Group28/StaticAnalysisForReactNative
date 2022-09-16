package defpackage;

import android.util.Pair;
import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: pjl  reason: default package */
/* loaded from: classes4.dex */
public final class pjl implements pqi, pnk {
    final /* synthetic */ pjp a;
    private final pjn b;
    private pqh c;
    private pnj d;

    public pjl(pjp pjpVar, pjn pjnVar) {
        this.a = pjpVar;
        this.c = pjpVar.e;
        this.d = pjpVar.f;
        this.b = pjnVar;
    }

    private final boolean a(int i, ppz ppzVar) {
        ppz ppzVar2 = null;
        if (ppzVar != null) {
            pjn pjnVar = this.b;
            int i2 = 0;
            while (true) {
                if (i2 >= pjnVar.c.size()) {
                    break;
                } else if (((ppz) pjnVar.c.get(i2)).d == ppzVar.d) {
                    ppzVar2 = ppzVar.b(Pair.create(pjnVar.b, ppzVar.a));
                    break;
                } else {
                    i2++;
                }
            }
            if (ppzVar2 == null) {
                return false;
            }
        }
        int i3 = i + this.b.d;
        pqh pqhVar = this.c;
        if (pqhVar.a != i3 || !pxi.M(pqhVar.c, ppzVar2)) {
            this.c = this.a.e.i(i3, ppzVar2);
        }
        pnj pnjVar = this.d;
        if (pnjVar.a != i3 || !pxi.M(pnjVar.c, ppzVar2)) {
            this.d = this.a.f.h(i3, ppzVar2);
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
