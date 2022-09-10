package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bhnr  reason: default package */
/* loaded from: classes3.dex */
public final class bhnr extends cqiw<bhrx> {
    public static final /* synthetic */ int b = 0;
    public final boolean a;
    private final Integer c;
    private final cjtd d;

    public bhnr(boolean z) {
        super(Boolean.valueOf(z));
        this.c = Integer.valueOf(cqir.a());
        cjta b2 = cjtd.b();
        b2.d = dtxx.A;
        this.d = b2.a();
        this.a = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<bhrx> a() {
        cqnf eM;
        cqnf i;
        if (this.a) {
            eM = cqgr.eM(bhnh.a);
        } else {
            eM = cqgr.eM(bhni.a);
        }
        cqmp[] cqmpVarArr = new cqmp[8];
        cqmpVarArr[0] = cqgr.dr(1);
        cqmpVarArr[1] = cqgr.cd(-1);
        cqmpVarArr[2] = cqgr.bp(-2);
        if (this.a) {
            i = itj.i(dtxx.K);
        } else {
            i = itj.i(dtxx.y);
        }
        cqmpVarArr[3] = i;
        cqmpVarArr[4] = cqgr.dE(bhnj.a);
        cqmpVarArr[5] = cqgr.gd(cqgr.dr(0), ibn.s(), cqgr.bp(-2), cqgr.aJ(16), cqgr.gq(cqgr.ca(Float.valueOf(1.0f)), cqgr.eN(5), cqgr.aJ(16), cqgr.dL(irh.k()), ibq.t(), eM), cqgr.gq(cqic.c(new cqlc(this) { // from class: bhnk
            private final bhnr a;

            {
                this.a = this;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                bhrx bhrxVar = (bhrx) cqkpVar;
                boolean z = true;
                if (!this.a.a && bhrxVar.c().booleanValue()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }, new cqmp[0]), cqgr.cL(irh.a()), cqgr.cH(irh.a()), cqgr.aJ(16), cqgr.dL(irh.k()), ibq.u(), cqgr.eN(6), cqgr.eM(bhnl.a), cqgr.cW(cqgr.q(bhnm.a)), itj.j(bhnn.a)));
        iie q = iif.r().q();
        q.f(cqrp.d(dcyn.a));
        q.i(cqrp.d(dcyn.a));
        q.l(cqrp.d(202.0d));
        cqmpVarArr[6] = cqgr.fP(new ihx(q.a()), bhno.a, cqgr.aR(this.c));
        cqmpVarArr[7] = ict.i(cqkz.a(cqrt.l(R.string.OFFERING_CAROUSEL_SEE_MORE_BUTTON)), cqgr.q(bhnp.a), cqkz.a(this.d), cqgr.aI(bhnq.a));
        return cqgr.gd(cqmpVarArr);
    }
}
