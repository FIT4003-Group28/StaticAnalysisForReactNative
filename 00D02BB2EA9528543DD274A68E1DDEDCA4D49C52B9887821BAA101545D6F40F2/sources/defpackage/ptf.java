package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ptf  reason: default package */
/* loaded from: classes7.dex */
public final class ptf implements vyy {
    final /* synthetic */ ptg a;

    public ptf(ptg ptgVar) {
        this.a = ptgVar;
    }

    @Override // defpackage.vyy
    public final boolean a(vvy vvyVar) {
        long j;
        ptg ptgVar = this.a;
        cqat cqatVar = ptgVar.e;
        bvjj bvjjVar = ptgVar.f;
        ahjq a = ptgVar.d.a();
        if ((vvyVar.a & 16) != 0) {
            vvs vvsVar = vvyVar.e;
            if (vvsVar == null) {
                vvsVar = vvs.e;
            }
            j = vvsVar.b;
        } else {
            j = 0;
        }
        long b = cqatVar.b() - vvyVar.d;
        long i = ptg.i(bvjjVar);
        bvjjVar.Z(bvjk.eb, Math.max(i, j));
        if (j > i && b <= vyz.a && vyz.b(vvyVar)) {
            vvs vvsVar2 = vvyVar.e;
            if (vvsVar2 == null) {
                vvsVar2 = vvs.e;
            }
            int a2 = vvq.a(vvsVar2.c);
            return a2 != 0 && a2 == 2 && !vyz.d(vvyVar, a.a());
        }
        return false;
    }

    @Override // defpackage.vyy
    public final void b() {
    }

    @Override // defpackage.vyy
    public final void c(vvy vvyVar) {
        this.a.f(ddda.dm);
        fd J = this.a.a.J(gfu.ACTIVITY_FRAGMENT);
        gn gnVar = J != null ? J.A : null;
        if (this.a.e() && this.a.c.b() && (gnVar == null || !gnVar.J())) {
            amte a = vze.a(vvyVar, this.a.b);
            if (a == null) {
                this.a.f(ddda.f3do);
                return;
            }
            ptg ptgVar = this.a;
            ptgVar.a.A();
            GmmLocation a2 = ptgVar.d.a().a();
            if (a2 == null || !vyz.a(a, a2, ptgVar.g.getNavigationParameters().s().a, ptgVar.b)) {
                amvh[] amvhVarArr = a.c;
                if (amvhVarArr.length > 1) {
                    dcdc<amvh> subList = dcdc.t(amvhVarArr).subList(1, a.c.length);
                    ptgVar.f(ddda.dp);
                    qcw x = qcx.x();
                    x.s(a.b);
                    x.r(a.e());
                    x.b(subList);
                    x.w(a.i());
                    ptgVar.h.a().m(x.a());
                    return;
                }
                ptgVar.f(ddda.f3do);
                return;
            }
            ptgVar.f(ddda.dp);
            qcs v = qct.v(a);
            v.f();
            v.e(true);
            ptgVar.h.a().m(v.a(ptgVar.h.a().e()));
            return;
        }
        this.a.f(ddda.dn);
    }
}
