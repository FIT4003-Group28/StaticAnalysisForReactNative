package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aune  reason: default package */
/* loaded from: classes2.dex */
public final class aune extends cqiw<aunr> {
    public static final /* synthetic */ int a = 0;
    private final int b;

    public aune(int i) {
        super(Integer.valueOf(i));
        this.b = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<aunr> a() {
        cqmp[] cqmpVarArr = new cqmp[3];
        cqmpVarArr[0] = cqgr.cd(-1);
        cqmpVarArr[1] = cqgr.bp(-2);
        cqmp[] cqmpVarArr2 = new cqmp[11];
        cqmpVarArr2[0] = cqgr.dr(1);
        cqmpVarArr2[1] = cqgr.cd(-1);
        char c = 2;
        cqmpVarArr2[2] = cqgr.bp(-2);
        cqrp d = cqrp.d(20.0d);
        cqmpVarArr2[3] = cqgr.dz(d, d, d, d);
        cqmpVarArr2[4] = cqgr.x(irg.a());
        cqmpVarArr2[5] = iue.c(aumr.a);
        cqmpVarArr2[6] = cqgr.gq(cqgr.cd(-2), cqgr.bp(-2), cqgr.eN(5), cqgr.bD(cqrp.d(10.0d)), cqgr.eM(aumv.a), irn.f(), cqgr.eU(irg.b()));
        cqmpVarArr2[7] = cqgr.gq(cqgr.aF(cqjv.x(aumw.a)), cqgr.cd(-2), cqgr.bp(-2), cqgr.eN(5), cqgr.bD(cqrp.d(10.0d)), cqgr.eM(aumx.a), cqgr.fh(cqrp.f(16.0d)), cqgr.eU(irg.j()));
        cqmj gi = cqgr.gi(cqgr.dr(1), cqgr.cd(-1), cqgr.bp(-2), cqgr.de(aums.a));
        final int i = 0;
        while (i < this.b) {
            cqmp[] cqmpVarArr3 = new cqmp[12];
            cqmpVarArr3[0] = cqgr.cd(-1);
            cqmpVarArr3[1] = cqgr.bp(-2);
            cqmpVarArr3[c] = cqgr.cH(irh.a());
            cqmpVarArr3[3] = cqgr.I(new cqlc(i) { // from class: aumt
                private final int a;

                {
                    this.a = i;
                }

                @Override // defpackage.cqlc
                public final Object a(cqkp cqkpVar) {
                    return ((aunr) cqkpVar).f(Integer.valueOf(this.a));
                }

                @Override // defpackage.cqlc
                public final boolean b() {
                    return false;
                }
            });
            cqmpVarArr3[4] = cqgr.bR(cqrp.d(16.0d));
            cqmpVarArr3[5] = cqgr.bG(cqrp.d(16.0d));
            cqmpVarArr3[6] = cqgr.dQ(cqrp.d(16.0d));
            cqmpVarArr3[7] = cqgr.eM(new cqlc(i) { // from class: aumu
                private final int a;

                {
                    this.a = i;
                }

                @Override // defpackage.cqlc
                public final Object a(cqkp cqkpVar) {
                    return ((aunr) cqkpVar).d(Integer.valueOf(this.a));
                }

                @Override // defpackage.cqlc
                public final boolean b() {
                    return false;
                }
            });
            cqmpVarArr3[8] = cqgr.eN(5);
            cqmpVarArr3[9] = cqgr.fh(cqrp.f(16.0d));
            cqmpVarArr3[10] = irn.ac(ibm.x(), irg.j());
            cqmpVarArr3[11] = cqgr.eU(irg.b());
            gi.g(cqgr.gh(cqmpVarArr3));
            i++;
            c = 2;
        }
        cqmpVarArr2[8] = gi;
        cqmpVarArr2[9] = cqgr.gq(cqgr.aF(cqjv.x(aumy.a)), cqgr.cd(-2), cqgr.bp(-2), cqgr.eN(5), cqgr.bD(cqrp.d(10.0d)), cqgr.bV(cqrp.d(10.0d)), cqgr.eM(aumz.a), cqgr.fh(cqrp.f(15.0d)), cqgr.eU(irg.j()));
        cqmpVarArr2[10] = cqgr.gd(cqgr.aJ(8388629), its.c(cqkz.a(cqrt.l(R.string.CANCEL_BUTTON)), cqgr.q(auna.a), iue.b(cjtd.a(dtxw.dH))), its.c(cqkz.a(cqrt.l(R.string.OK_BUTTON)), cqgr.q(aunb.a), cqgr.au(aunc.a), cqgr.eW(aund.a)));
        cqmpVarArr[2] = cqgr.gd(cqmpVarArr2);
        return cqgr.gk(cqmpVarArr);
    }
}
