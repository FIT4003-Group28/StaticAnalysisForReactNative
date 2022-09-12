package defpackage;

import android.text.TextUtils;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: brjc  reason: default package */
/* loaded from: classes4.dex */
public final class brjc extends cqiw<bssp> {
    public static final /* synthetic */ int b = 0;
    public final boolean a;

    public brjc() {
        this.a = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<bssp> a() {
        cqmp[] cqmpVarArr = {cqgr.aE(briw.a), cqgr.eG(brix.a), cqgr.dX(briy.a)};
        cqmp[] cqmpVarArr2 = {ibq.z(), ibq.m(), cqgr.aJ(17), cqgr.dX(briz.a), cqgr.dE(brja.a), cqgr.eU(ibm.t()), cqgr.eM(brjb.a)};
        cqmp[] cqmpVarArr3 = {ibq.p(), cqgr.aJ(17), cqgr.bF(bric.a), cqgr.eU(ibm.p()), cqgr.eM(brid.a), cqgr.cB(2), cqgr.ar(TextUtils.TruncateAt.END)};
        cqmj gq = cqgr.gq(cqgr.aF(brin.a), cqgr.cH(ibn.a()), cqgr.bF(brio.a), ibq.p(), cqgr.eU(ibm.x()), cqgr.aJ(17), cqgr.cW(cqgr.q(brip.a)), cqgr.eM(briq.a));
        gq.f(new cqmp[0]);
        cqmp[] cqmpVarArr4 = {cqgr.aI(brii.a), cqgr.eM(brij.a), cqgr.bw(17), cqgr.bD(ibn.d()), iue.c(brik.a), cqgr.cW(cqgr.q(bril.a))};
        cqmp[] cqmpVarArr5 = {cqgr.aI(brie.a), cqgr.cH(ibn.a()), cqgr.dt(brif.a), cqgr.bw(17), cqgr.cd(-2), cqgr.cW(brig.a), cqgr.gq(ibq.p(), cqgr.bw(1), cqgr.eL(Integer.valueOf((int) R.string.NO_RESULT_ADD_NEW_PLACE_PROMPT)), cqgr.eU(ibm.p())), cqgr.gq(cqgr.bT(brih.a), ibq.p(), cqgr.bw(1), cqgr.eU(ibm.x()), cqgr.eL(Integer.valueOf((int) R.string.NO_RESULT_ADD_NEW_PLACE_LINK)))};
        cqmj t = hyw.t(null, ibm.b(), ibm.j(), true, false, cqic.f(brir.a, new cqmp[0]), cqgr.ce(cqrp.d(240.0d)), cqgr.bq(cqrp.d(48.0d)), cqgr.bw(81), cqgr.cW(cqgr.q(bris.a)), hyw.V(brit.a), cqgr.eN(4), cqgr.eU(ibm.x()));
        t.f(new cqmp[0]);
        cqmj<bssp> fY = cqgr.fY(cqgr.cd(-1), cqgr.bp(-2), cqgr.gd(cqgr.dr(1), cqgr.cd(-1), cqgr.x(ibm.b()), cqgr.dX(new cqlc(this) { // from class: brib
            private final brjc a;

            {
                this.a = this;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                brjc brjcVar = this.a;
                if (((bssp) cqkpVar).g().booleanValue()) {
                    return cqrp.d(22.0d);
                }
                if (brjcVar.a) {
                    return cqrp.d(24.0d);
                }
                return ibn.q();
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), cqgr.dT(brim.a), cqgr.dI(briu.a), cqgr.dE(briv.a), cqgr.gc(cqmpVarArr), cqgr.gq(cqmpVarArr2), cqgr.gq(cqmpVarArr3), gq, hyb.c(cqmpVarArr4), cqgr.gd(cqmpVarArr5), t));
        return this.a ? ijc.b(cqkz.a(ibn.l()), fY) : fY;
    }

    public brjc(byte[] bArr) {
        super(true);
        this.a = true;
    }
}
