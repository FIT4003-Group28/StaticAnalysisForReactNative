package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: atrl  reason: default package */
/* loaded from: classes2.dex */
public final class atrl extends cqiw<atye> {
    private static final cqrp b = cqrp.d(36.0d);
    private static final cqrp c = cqrp.d(12.0d);
    private static final cqrp d = cqrp.d(12.0d);
    public final cqjg a = cqjg.a();
    private final cqjg e = cqjg.a();
    private final cqjg f = cqjg.a();
    private final cqjg g = cqjg.a();

    public static <T extends cqkp> cqmn<T> e(atxw atxwVar) {
        return cqmn.a(cqgr.ce(ibn.a()), cqgr.bq(ibn.a()), cqgr.bG(cqrp.d(26.0d)), cqgr.cU(atxwVar.c()), iue.b(cjtd.a(dtyi.y)), cqgr.T(atxwVar.g()), iuy.g());
    }

    private final Boolean f() {
        return cqjv.r(E(), B().ak());
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, atye atyeVar, Context context, cqiv cqivVar) {
        for (jbi jbiVar : atyeVar.z()) {
            cqivVar.a(new atrj(), jbiVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<atye> a() {
        cqmj gc = cqgr.gc(cqgr.cd(-1), cqgr.bp(-2), cqgr.eD(Integer.valueOf((int) R.drawable.nav_prompt_above_shadow_rounded_corners)));
        gc.f(cqgr.aD(cqjv.t(f(), iva.a())));
        Boolean f = f();
        cqmn a = cqmn.a(cqgr.bR(cqrp.d(8.0d)), cqgr.bG(cqrp.d(8.0d)));
        cqmp[] cqmpVarArr = {cqgr.bR(cqrp.d(dcyn.a)), cqgr.bG(cqrp.d(dcyn.a))};
        cqmp[] cqmpVarArr2 = {cqgr.aT(this.a), cqgr.aJ(49), cqgr.ce(ibn.b()), cqgr.bw(17), cqgr.bq(cqrp.d(82.0d))};
        Boolean t = cqjv.t(G(), B().ak());
        cqnf bY = cqgr.bY(cqjd.i(), cqjd.e(), cqjd.y(this.g));
        cqjd[] cqjdVarArr = {cqjd.t(), cqjd.e(), cqjd.y(this.f)};
        cqrp cqrpVar = b;
        cqmp[] cqmpVarArr3 = {cqgr.aT(this.e), cqgr.bp(-2), cqgr.dr(1), cqjv.k(t, bY, cqgr.bY(cqjdVarArr)), cqgr.bR(cqrpVar), cqgr.gq(cqic.a(B().g(), new cqmp[0]), ibq.m(), ibq.A(), cqgr.fh(cqrp.f(20.0d)), cqgr.cB(2), cqgr.ar(TextUtils.TruncateAt.END), cqgr.aZ(false), cqgr.eI(B().x()), cqgr.eN(5)), cqgr.gq(cqic.a(cqjv.t(B().ae(), cqjv.v(B().y())), new cqmp[0]), cqjv.k(B().g(), cqgr.bV(cqrp.d(dcyn.a)), cqgr.bV(cqrp.d(6.0d))), ibq.m(), ibq.C(), cqgr.fh(cqrp.f(18.0d)), cqgr.cB(2), cqgr.ar(TextUtils.TruncateAt.END), cqgr.aZ(false), cqgr.eI(B().y()), cqgr.eN(5)), cqgr.gd(cqgr.dr(1), cqic.a(cqjv.v(B().z()), new cqmp[0]), cqgr.ck(C()))};
        Boolean t2 = cqjv.t(G(), B().ak());
        cqnf bY2 = cqgr.bY(cqjd.u(this.e));
        cqjd[] cqjdVarArr2 = {cqjd.t(), cqjd.y(this.g)};
        atrf atrfVar = new atrf();
        atyd i = B().i();
        cqrp cqrpVar2 = d;
        Boolean f2 = f();
        Float valueOf = Float.valueOf(1.0f);
        cqmn a2 = cqmn.a(cqgr.ce(cqrp.d(dcyn.a)), cqgr.ca(valueOf));
        Float valueOf2 = Float.valueOf(0.0f);
        cqmp[] cqmpVarArr4 = {cqgr.aT(this.f), cqjv.k(f(), cqgr.cd(-1), cqgr.cd(-2)), cqgr.bp(-2), cqgr.bV(ibn.f()), cqgr.bD(ibn.f()), cqgr.bR(cqrpVar), cqjv.k(f(), cqgr.bG(cqrpVar), cqgr.bG(cqrp.d(dcyn.a))), cqjv.k(t2, bY2, cqgr.bY(cqjdVarArr2)), cqgr.fQ(atrfVar, i, cqgr.bG(cqrpVar2), cqjv.m(f2, a2, cqmn.a(cqgr.ce(atrf.d), cqgr.ca(valueOf2)))), cqgr.fQ(new atrf(), B().j(), cqgr.bR(cqrpVar2), cqjv.m(f(), cqmn.a(cqgr.ce(cqrp.d(dcyn.a)), cqgr.ca(valueOf)), cqmn.a(cqgr.ce(atrf.d), cqgr.ca(valueOf2))))};
        Boolean t3 = cqjv.t(G(), B().ak());
        cqnf bY3 = cqgr.bY(cqjd.i(), cqjd.f());
        cqjd[] cqjdVarArr3 = {cqjd.t(), cqjd.f()};
        atri atriVar = new atri();
        atxw T = B().T();
        dbsk.s(T);
        return cqgr.fY(cqgr.cd(-1), cqgr.bp(-2), gc, cqgr.J(cqjv.u(E())), cqgr.P(false), cqgr.L(false), cqgr.fY(cqgr.cd(B().ai()), cqgr.bp(-2), cqgr.P(false), cqgr.L(false), cqgr.fY(cqgr.cd(-1), cqgr.bp(-2), cqjv.k(G(), cqgr.cH(cqrt.d(R.dimen.navigation_header_with_grippy_height_port)), cqgr.cH(cqrt.d(R.dimen.navigation_header_with_grippy_height_land))), cqgr.bV(cqrp.d(5.0d)), cqjv.m(f, a, cqmn.a(cqmpVarArr)), cqgr.dR(B().Z()), cqgr.dG(B().aa()), cqgr.dC(B().ab()), cqgr.x(atpj.g(iva.b(ibl.b(), ibl.d()))), cqgr.ap(atlt.a), atpj.e(), atpj.f(), cqgr.az(true), cqgr.P(false), cqgr.L(false), cqgr.gg(cqmpVarArr2), cqgr.gj(cqic.a(B().c(), new cqmp[0]), cqgr.cd(-1), cqgr.bp(-2), cqgr.fD(new cqfc(this) { // from class: atrg
            private final atrl a;

            {
                this.a = this;
            }

            @Override // defpackage.cqfc
            public final void a(View view, boolean z) {
                atrl atrlVar = this.a;
                View view2 = (View) view.getParent().getParent();
                View a3 = cqhu.a(view2, atrlVar.a);
                if (a3 == null || view2 == null) {
                    return;
                }
                int height = view.getHeight() - a3.getHeight();
                a3.setVisibility(8);
                if (height <= 0) {
                    return;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, "translationY", height, 0.0f);
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(new LinearInterpolator());
                ofFloat.start();
            }
        }), iue.b(B().Q()), cqgr.L(false), cqjv.k(cqjv.t(G(), B().ak()), cqgr.bV(cqrp.d(30.0d)), cqgr.bV(cqrp.d(16.0d))), cqgr.bD(cqrp.d(8.0d)), cqgr.gd(cqmpVarArr3), cqgr.gd(cqmpVarArr4), cqgr.gd(cqgr.aT(this.g), cqgr.cd(-2), cqgr.bp(-2), cqgr.bR(c), cqjv.k(t3, bY3, cqgr.bY(cqjdVarArr3)), cqgr.fQ(new atrk(), B().P(), new cqmp[0]), cqgr.fO(atriVar, T, cqgr.aG(cqjv.v(B().P()))))))));
    }
}
