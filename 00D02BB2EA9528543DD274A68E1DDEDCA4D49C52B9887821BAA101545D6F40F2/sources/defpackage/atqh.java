package defpackage;

import android.text.TextUtils;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: atqh  reason: default package */
/* loaded from: classes2.dex */
public final class atqh extends cqiw<atxs> {
    @Override // defpackage.cqiw
    public final cqmj<atxs> a() {
        cqlc cqlcVar = new cqlc() { // from class: atqg
            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                boolean z = false;
                if (((atxs) cqkpVar).ak().booleanValue() && atqh.E().booleanValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        };
        cqmn a = cqmn.a(cqgr.bR(cqrp.d(8.0d)), cqgr.bG(cqrp.d(8.0d)));
        cqmp[] cqmpVarArr = {cqgr.bR(cqrp.d(dcyn.a)), cqgr.bG(cqrp.d(dcyn.a))};
        cqrp d = cqrp.d(8.0d);
        cqmp[] cqmpVarArr2 = {cqgr.dr(0), cqgr.cd(-1), cqgr.bp(-2), cqgr.dz(d, d, d, d), cqgr.gq(cqgr.cd(-2), cqgr.bp(-2), cqgr.bw(17), ibq.k(), ibq.A(), cqgr.fh(cqrp.f(18.0d)), cqgr.cB(1), cqgr.ar(TextUtils.TruncateAt.END), cqgr.aZ(false), cqgr.eN(5), cqgr.eM(atqc.a)), cqgr.gb(cqgr.cd(-2), cqgr.bp(-2), cqgr.bw(8388661), iue.b(cjtd.a(dtxw.cc)), cqgr.S(Integer.valueOf((int) R.string.ENROUTE_RESULT_LIST_CLOSE_CONTENT_DESCRIPTION)), cqgr.cL(irh.a()), cqgr.cH(irh.a()), cqgr.x(irn.F()), cqgr.eE(iva.g(2131231591, 2131231592)), cqgr.cW(atqd.a))};
        Integer valueOf = Integer.valueOf((int) R.id.enroute_search_result_list);
        return cqgr.fY(cqgr.cd(-1), cqgr.bp(-2), cqgr.J(cqjv.u(E())), cqgr.fY(cqgr.cg(atqa.a), cqgr.bp(-2), cqgr.bV(ird.b()), cqgr.P(false), cqgr.L(false), cqgr.fY(cqgr.aR(Integer.valueOf((int) R.id.navigation_prompt)), cqgr.cd(-1), cqgr.bp(-2), cqjv.k(G(), cqgr.cH(cqrt.d(R.dimen.navigation_header_with_grippy_height_port)), cqgr.cH(cqrt.d(R.dimen.navigation_header_with_grippy_height_land))), cqgr.bV(cqrp.d(8.0d)), cqjv.n(cqlcVar, a, cqmn.a(cqmpVarArr)), iue.c(atqb.a), cqgr.x(atpj.g(iva.b(ibl.b(), ibl.d()))), cqgr.ap(atlt.a), atpj.e(), atpj.f(), cqgr.az(true), cqgr.P(false), cqgr.L(false), cqgr.p(true), cqgr.gd(cqgr.dr(1), cqgr.cd(-1), cqgr.bp(-2), cqgr.fY(cqmpVarArr2), cqgr.fY(cqgr.cd(-1), cqgr.bp(-2), cqqx.D(cqgr.aR(valueOf), cqqx.F(), cqgr.cd(-1), cqgr.bp(-2), cqgr.dU(cqrt.d(R.dimen.shadow_height)), cqgr.P(false), cqgr.V(atqe.a), cqgr.an(atqf.a)), jdx.b(jdx.c(valueOf)))))));
    }
}
