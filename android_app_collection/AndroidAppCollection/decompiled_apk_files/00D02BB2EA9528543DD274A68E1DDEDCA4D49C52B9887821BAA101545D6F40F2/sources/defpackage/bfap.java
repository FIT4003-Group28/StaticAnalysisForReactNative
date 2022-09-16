package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bfap  reason: default package */
/* loaded from: classes3.dex */
public final class bfap extends cqiw<bfat> {
    public static final cqjg a = cqjg.a();
    private final boolean b;

    public bfap() {
        this(false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<bfat> a() {
        cqmp aI;
        cqmp[] cqmpVarArr = new cqmp[1];
        cqmp[] cqmpVarArr2 = new cqmp[15];
        cqmpVarArr2[0] = cqgr.aT(a);
        if (this.b) {
            aI = cqic.f(bfai.a, new cqmp[0]);
        } else {
            aI = cqgr.aI(bfaj.a);
        }
        cqmpVarArr2[1] = aI;
        cqmpVarArr2[2] = cqgr.bp(-2);
        cqmpVarArr2[3] = cqgr.cd(-2);
        cqmpVarArr2[4] = cqgr.bw(81);
        cqmpVarArr2[5] = cqgr.dr(1);
        cqmpVarArr2[6] = cqgr.aJ(1);
        cqmpVarArr2[7] = cqgr.dB(cqrp.d(4.0d));
        cqmpVarArr2[8] = cqgr.fs(bfak.a);
        cqmpVarArr2[9] = cqgr.cW(cqgr.q(bfal.a));
        cqmpVarArr2[10] = iue.c(bfam.a);
        cqmpVarArr2[11] = cqgr.aW(1);
        cqmpVarArr2[12] = cqgr.V(bfan.a);
        cqmpVarArr2[13] = jgn.a(cqgr.bp(-2), cqgr.cd(-2), cqgr.dU(cqrp.d(6.0d)), cqgr.dB(cqrp.d(6.0d)), cqgr.dQ(cqrp.d(12.0d)), cqgr.dF(cqrp.d(12.0d)), cqgr.x(ibm.x()), jgn.b(cqrp.d(6.0d)), cqgr.gq(ibq.l(), cqgr.eU(ibm.b()), cqgr.aW(2), cqgr.eM(bfao.a)));
        cqmpVarArr2[14] = cqgr.gc(cqgr.bq(cqrp.d(16.0d)), cqgr.ce(cqrp.d(16.0d)), cqgr.eE(cqrt.f(R.layout.toast_bubble_arrow)));
        cqmpVarArr[0] = cqgr.gd(cqmpVarArr2);
        return cqgr.fY(cqmpVarArr);
    }

    public bfap(boolean z) {
        super(Boolean.valueOf(z));
        this.b = z;
    }
}
