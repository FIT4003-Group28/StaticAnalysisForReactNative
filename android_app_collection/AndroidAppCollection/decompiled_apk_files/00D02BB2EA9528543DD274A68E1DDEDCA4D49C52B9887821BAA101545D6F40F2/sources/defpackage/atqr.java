package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: atqr  reason: default package */
/* loaded from: classes2.dex */
public final class atqr extends cqiw<atyb> {
    private static final cqrp c = cqrp.d(5.0d);
    public static final cqrp a = cqrp.d(40.0d);
    public static final cqrp b = cqrp.d(24.0d);

    private final Boolean e() {
        return cqjv.r(B().ak(), E());
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, atyb atybVar, Context context, cqiv cqivVar) {
        for (atxt atxtVar : atybVar.e()) {
            cqivVar.a(new atqq(), atxtVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<atyb> a() {
        cqmj fY = cqgr.fY(cqgr.cd(-1), cqgr.bp(-2), cqgr.gc(cqgr.cd(-1), cqgr.eD(Integer.valueOf((int) R.drawable.nav_prompt_above_shadow_rounded_corners))));
        fY.f(cqgr.aD(cqjv.t(e(), iva.a())));
        Boolean e = e();
        cqmn a2 = cqmn.a(cqgr.bV(cqrp.d(8.0d)), cqgr.bR(cqrp.d(8.0d)), cqgr.bG(cqrp.d(8.0d)));
        cqrp cqrpVar = c;
        cqmp[] cqmpVarArr = {cqic.a(cqjv.v(B().d()), new cqmp[0]), cqgr.cd(-1), cqgr.bp(-2), cqjv.m(e, a2, cqmn.a(cqgr.bV(cqrpVar), cqgr.bR(cqrp.d(dcyn.a)), cqgr.bG(cqrp.d(dcyn.a)))), cqgr.P(false), cqgr.L(false), cqgr.fQ(new atpo(), B().d(), new cqmp[0])};
        Boolean e2 = e();
        cqmn a3 = cqmn.a(cqgr.bV(cqrp.d(8.0d)), cqgr.bR(cqrp.d(8.0d)), cqgr.bG(cqrp.d(8.0d)));
        cqmp[] cqmpVarArr2 = {cqgr.bV(cqrpVar), cqgr.bR(cqrp.d(dcyn.a)), cqgr.bG(cqrp.d(dcyn.a))};
        cqrp cqrpVar2 = a;
        cqrp cqrpVar3 = b;
        return cqgr.fY(cqgr.cd(-1), cqgr.bp(-2), cqgr.J(cqjv.u(E())), cqgr.fY(cqgr.cd(B().ai()), cqgr.bp(-2), fY, cqjv.k(e(), cqgr.bV(ird.b()), cqgr.bV(cqrp.d(dcyn.a))), cqgr.P(false), cqgr.L(false), cqgr.fY(cqmpVarArr), cqgr.fY(cqgr.aR(Integer.valueOf((int) R.id.navigation_prompt)), cqic.d(cqjv.v(B().d()), new cqmp[0]), cqgr.cd(-1), cqgr.bp(-2), cqjv.k(G(), cqgr.cH(cqrt.d(R.dimen.navigation_header_with_grippy_height_port)), cqgr.cH(cqrt.d(R.dimen.navigation_header_with_grippy_height_land))), cqjv.m(e2, a3, cqmn.a(cqmpVarArr2)), iue.b(B().Q()), cqgr.x(atpj.g(iva.b(ibl.b(), ibl.d()))), cqgr.ap(atlt.a), atpj.e(), atpj.f(), cqgr.az(true), cqgr.P(false), cqgr.L(false), cqgr.p(true), cqgr.gd(cqic.d(cqjv.v(B().f()), new cqmp[0]), cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(1), cqgr.bV(cqrp.d(32.0d)), cqgr.bD(cqrp.d(20.0d)), cqgr.gq(cqgr.cd(-2), cqgr.bp(-2), cqgr.bw(8388611), cqgr.bR(cqrpVar2), cqgr.bG(cqrpVar3), ibq.m(), ibq.A(), cqgr.fh(cqrp.f(18.0d)), cqgr.cB(1), cqgr.ar(TextUtils.TruncateAt.END), cqgr.aZ(false), cqgr.eN(5), cqgr.eI(B().x())), cqgr.gq(cqic.a(cqjv.v(B().y()), new cqmp[0]), cqgr.cd(-2), cqgr.bp(-2), cqgr.bw(8388611), cqgr.bR(cqrpVar2), cqgr.bG(cqrpVar3), ibq.f(), ibq.C(), cqgr.fh(cqrp.f(13.0d)), cqgr.cB(1), cqgr.ar(TextUtils.TruncateAt.END), cqgr.aZ(false), cqgr.eN(5), cqgr.eI(B().y())), cqqx.D(cqgr.bp(-2), cqgr.cd(-1), cqgr.bV(cqrp.d(10.0d)), cqjv.k(cqjv.t(G(), B().ak()), cqqx.H(1), cqqx.H(2)), cqgr.L(false), cqgr.ck(C()))), cqgr.fQ(new atqo(), B().f(), new cqmp[0]), cqgr.fQ(new atqp(), B().T(), new cqmp[0]))));
    }
}
