package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bhpg  reason: default package */
/* loaded from: classes3.dex */
public final class bhpg extends cqiw<bhrz> {
    public static final /* synthetic */ int b = 0;
    public final boolean a;
    private final Integer c;

    public bhpg(boolean z) {
        super(Boolean.valueOf(z));
        this.c = Integer.valueOf(cqir.a());
        this.a = z;
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, bhrz bhrzVar, Context context, cqiv cqivVar) {
        bhrz bhrzVar2 = bhrzVar;
        ddho ddhoVar = this.a ? dtxx.J : dtxx.x;
        for (bhry bhryVar : bhrzVar2.f()) {
            cqivVar.a(new bhoh(false, ddhoVar), bhryVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<bhrz> a() {
        cqnf eL;
        cqnf i;
        cqmp[] cqmpVarArr = new cqmp[7];
        cqmpVarArr[0] = cqgr.dr(1);
        cqmpVarArr[1] = cqgr.cd(-1);
        cqmpVarArr[2] = cqgr.bp(-2);
        cqmpVarArr[3] = cqgr.dE(bhos.a);
        cqmp[] cqmpVarArr2 = new cqmp[6];
        cqmpVarArr2[0] = cqgr.dr(0);
        cqmpVarArr2[1] = ibn.s();
        cqmpVarArr2[2] = cqgr.bp(-2);
        cqmpVarArr2[3] = cqgr.aJ(16);
        cqmp[] cqmpVarArr3 = new cqmp[6];
        cqmpVarArr3[0] = cqgr.ca(Float.valueOf(1.0f));
        cqmpVarArr3[1] = cqgr.eN(5);
        cqmpVarArr3[2] = cqgr.aJ(16);
        cqmpVarArr3[3] = cqgr.dL(irh.k());
        cqmpVarArr3[4] = ibq.t();
        if (this.a) {
            eL = cqgr.eL(Integer.valueOf((int) R.string.OFFERING_DETAILS_OTHER_DISHES_AT_PLACE));
        } else {
            eL = cqgr.eL(Integer.valueOf((int) R.string.OFFERING_CAROUSEL_TITLE_DISH));
        }
        cqmpVarArr3[5] = eL;
        cqmpVarArr2[4] = cqgr.gq(cqmpVarArr3);
        cqmpVarArr2[5] = cqgr.gq(cqic.c(new cqlc(this) { // from class: bhou
            private final bhpg a;

            {
                this.a = this;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                bhrz bhrzVar = (bhrz) cqkpVar;
                boolean z = true;
                if (!this.a.a && bhrzVar.g().booleanValue()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }, new cqmp[0]), cqgr.cL(irh.a()), cqgr.cH(irh.a()), cqgr.aJ(16), cqgr.dL(irh.k()), ibq.u(), cqgr.eN(6), cqgr.eM(bhov.a), cqgr.cW(cqgr.q(bhow.a)), itj.j(bhox.a));
        cqmpVarArr[4] = cqgr.gd(cqmpVarArr2);
        cqmpVarArr[5] = jgv.b(C(), 20, cqqx.p(null), cqqx.K(ccra.o(cqrp.d(2.0d), cqrp.d(dcyn.a), cqrp.d(16.0d))), cqgr.aR(this.c), cqgr.dk(bhoy.a), cqgr.L(false), cqgr.P(false), iue.c(bhoz.a));
        cqmpVarArr[6] = hyb.d(cqgr.aI(bhpa.a), cqgr.bC(5), cqgr.bw(1), cqgr.cW(cqgr.q(bhpb.a)), cqgr.eL(Integer.valueOf((int) R.string.OFFERING_CAROUSEL_SEE_MORE_BUTTON)), itj.i(dtxx.A));
        cqmj gd = cqgr.gd(cqmpVarArr);
        cqlc x = cqjv.x(bhpc.a);
        cqmp[] cqmpVarArr4 = new cqmp[5];
        cqmpVarArr4[0] = cqgr.cd(-1);
        cqmpVarArr4[1] = cqgr.bp(-2);
        if (this.a) {
            i = itj.i(dtxx.K);
        } else {
            i = itj.i(dtxx.y);
        }
        cqmpVarArr4[2] = i;
        gd.f(cqic.c(x, new cqmp[0]));
        cqmpVarArr4[3] = gd;
        cqmpVarArr4[4] = cqgr.fP(new bhpi(), bhot.a, cqic.f(x, new cqmp[0]));
        return cqgr.fY(cqmpVarArr4);
    }
}
