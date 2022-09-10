package defpackage;

import android.text.TextUtils;
import android.widget.ImageView;
/* compiled from: PG */
/* renamed from: bfns  reason: default package */
/* loaded from: classes3.dex */
public final class bfns extends cqiw<bfrq> {
    private final boolean e;
    private static final cqtv d = cqrp.f(12.0d);
    public static final cqtv a = ibn.a();
    public static final cqtv b = cqrp.d(12.0d);
    public static final cqjg c = cqjg.a();

    public bfns(boolean z) {
        super(Boolean.valueOf(z));
        this.e = z;
    }

    private static final cqmn<bfrq> f() {
        return cqmn.a(cqgr.bT(bfnf.a), cqgr.cB(2), cqgr.ar(TextUtils.TruncateAt.END), iue.c(bfng.a));
    }

    private static final cqmj<bfrq> h(cqmp<bfrq>... cqmpVarArr) {
        cqmj<bfrq> gq = cqgr.gq(cqic.c(cqjv.x(bfnb.a), new cqmp[0]), ibq.q(), ibq.y(), cqgr.fh(d), cqgr.eN(5), cqgr.bV(cqrp.d(4.0d)), cqgr.eM(bfnc.a));
        gq.f(cqmpVarArr);
        return gq;
    }

    @Override // defpackage.cqiw
    public final cqmj<bfrq> a() {
        Float valueOf = Float.valueOf(1.0f);
        cqtv cqtvVar = b;
        cqmp[] cqmpVarArr = {cqgr.aF(bfni.a), cqgr.cd(0), cqgr.ca(valueOf), cqgr.dr(1), cqgr.dU(cqtvVar), cqgr.dB(cqtvVar), e(new cqmp[0]), h(new cqmp[0])};
        cqmp[] cqmpVarArr2 = {cqic.c(bfni.a, new cqmp[0])};
        cqmp[] cqmpVarArr3 = {cqgr.ei(ImageView.ScaleType.CENTER), cqgr.eE(cqrt.g(2131232299, ibm.m())), cqgr.cW(bfno.a), iue.c(bfnp.a), cqgr.V(bfnq.a), cqgr.x(ibo.a())};
        cqtv cqtvVar2 = a;
        cqmj fY = cqgr.fY(cqgr.gc(cqmpVarArr3), cqgr.ce(cqtvVar2), cqgr.bq(cqtvVar2));
        fY.f(cqmpVarArr2);
        cqmp[] cqmpVarArr4 = {cqic.f(bfni.a, new cqmp[0])};
        cqjg cqjgVar = c;
        cqmp<bfrq>[] cqmpVarArr5 = {cqgr.aT(cqjgVar), cqgr.bv(3), cqjv.l(bfnh.a, cqgr.bY(cqjd.e()), cqgr.bY(cqjd.e(), cqjd.t())), cqgr.dX(new cqlc() { // from class: bfnj
            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                return ((Boolean) bfnh.a.a((bfrq) cqkpVar)).booleanValue() ? bfns.b : cqrp.d(dcyn.a);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), cqgr.dF(cqtvVar2)};
        cqmp[] cqmpVarArr6 = {cqgr.bv(3), cqgr.bY(cqjd.q(cqjgVar)), cqgr.dF(cqsg.f(cqtvVar2, Float.valueOf(0.45f))), cqgr.dE(new cqlc() { // from class: bfnk
            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                if (((Boolean) bfnh.a.a((bfrq) cqkpVar)).booleanValue()) {
                    return cqsg.f(bfns.a, Float.valueOf(0.16f));
                }
                return cqrp.d(dcyn.a);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        })};
        cqmj fY2 = cqgr.fY(cqgr.gc(cqgr.ei(ImageView.ScaleType.CENTER), cqgr.eE(cqrt.g(2131232299, ibm.m())), cqgr.x(ibq.E())), cqgr.V(bfnl.a), cqgr.cW(bfnm.a), iue.c(bfnn.a), cqgr.ce(cqtvVar2), cqgr.bq(cqtvVar2));
        fY2.f(cqmpVarArr6);
        cqmj gj = cqgr.gj(cqgr.ca(valueOf), e(cqmpVarArr5), fY2, h(cqgr.bY(cqjd.u(cqjgVar)), cqgr.dB(cqtvVar)));
        gj.f(cqmpVarArr4);
        return cqgr.gd(cqgr.bp(-2), cqgr.dr(0), cqgr.aJ(16), cqgr.cd(-1), cqgr.dQ(ibn.g()), cqgr.dF(cqsg.g(ibn.g(), ibn.f())), cqgr.gd(cqmpVarArr), fY, gj, cqgr.fR(new aeke(), bfna.a, new cqmp[0]));
    }

    private final cqmj<bfrq> e(cqmp<bfrq>... cqmpVarArr) {
        cqmj gq;
        if (!this.e) {
            gq = cqgr.gq(ibq.i(), cqgr.eU(ibm.p()), f(), cqgr.eM(bfnd.a));
        } else {
            gq = cqgr.gq(ibq.p(), cqgr.eU(ibm.t()), f(), cqgr.eM(bfne.a));
        }
        cqmj<bfrq> gd = cqgr.gd(cqgr.dr(0), cqgr.aJ(16), cqgr.fP(new acmu(), bfnr.a, new cqmp[0]), gq);
        gd.f(cqmpVarArr);
        return gd;
    }
}
