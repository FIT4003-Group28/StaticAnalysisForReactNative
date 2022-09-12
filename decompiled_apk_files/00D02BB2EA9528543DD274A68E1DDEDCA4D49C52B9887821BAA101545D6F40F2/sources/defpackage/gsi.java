package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: gsi  reason: default package */
/* loaded from: classes6.dex */
public final class gsi extends cqiw<izx> {
    public static final /* synthetic */ int a = 0;
    private final Integer b;
    private final boolean c;

    public gsi(Integer num, boolean z) {
        super(num, Boolean.valueOf(z));
        this.b = num;
        this.c = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<izx> a() {
        cqtd J;
        cqmp[] cqmpVarArr = new cqmp[5];
        cqmpVarArr[0] = cqgr.bp(-1);
        Float valueOf = Float.valueOf(1.0f);
        cqmpVarArr[1] = cqgr.ca(valueOf);
        cqmpVarArr[2] = cqgr.gm(cqgr.ca(valueOf));
        cqmp[] cqmpVarArr2 = new cqmp[17];
        cqmpVarArr2[0] = cqgr.aT(izx.c);
        cqmpVarArr2[1] = cqgr.dr(1);
        cqmpVarArr2[2] = cqgr.bp(-2);
        cqmpVarArr2[3] = cqgr.cL(cqrp.d(72.0d));
        cqmpVarArr2[4] = cqgr.dQ(cqrp.d(4.0d));
        cqmpVarArr2[5] = cqgr.dF(cqrp.d(4.0d));
        cqmpVarArr2[6] = cqgr.aJ(17);
        if (this.c) {
            J = ibq.E();
        } else {
            J = irn.J();
        }
        cqmpVarArr2[7] = cqgr.x(J);
        cqmpVarArr2[8] = cqgr.L(false);
        cqmpVarArr2[9] = iue.c(grx.a);
        cqmpVarArr2[10] = cqgr.cW(acly.a(grz.a));
        cqmpVarArr2[11] = cqgr.K(gsa.a);
        cqmpVarArr2[12] = cqgr.dn(acly.b(gsb.a));
        cqmpVarArr2[13] = cqgr.cs(gsc.a);
        cqmp[] cqmpVarArr3 = new cqmp[5];
        cqmpVarArr3[0] = this.c ? cqmn.a(cqgr.ce(cqrp.d(42.0d)), cqgr.bq(cqrp.d(42.0d))) : irn.A();
        cqmpVarArr3[1] = cqgr.bV(this.c ? cqrp.d(14.0d) : cqrp.d(16.0d));
        cqmpVarArr3[2] = cqgr.L(false);
        cqmpVarArr3[3] = cqgr.gc(cqgr.aT(izx.d), cqgr.eG(gsd.a), cqgr.aF(gse.a));
        cqmpVarArr3[4] = cqgr.gg(cqgr.aI(gsf.a));
        cqmpVarArr2[14] = cqgr.fY(cqmpVarArr3);
        cqmp[] cqmpVarArr4 = new cqmp[12];
        cqmpVarArr4[0] = cqgr.aR(Integer.valueOf((int) R.id.action_button_label));
        cqmpVarArr4[1] = cqgr.eh(false);
        cqmpVarArr4[2] = cqgr.cd(-2);
        cqmpVarArr4[3] = cqgr.bp(-1);
        cqmpVarArr4[4] = cqgr.bV(cqrp.d(this.c ? 4.0d : 10.0d));
        cqmpVarArr4[5] = cqgr.bD(this.c ? cqrp.d(14.0d) : cqrp.d(16.0d));
        cqmpVarArr4[6] = cqgr.aJ(17);
        cqmpVarArr4[7] = cqgr.cz(cqsg.f(cqsz.c(), Float.valueOf(Float.compare((float) this.b.intValue(), 1.0f) <= 0 ? 1.0f : 1.0f / Float.valueOf(this.b.intValue()).floatValue())));
        cqmpVarArr4[8] = irn.p();
        cqmpVarArr4[9] = cqgr.V(gsg.a);
        cqmpVarArr4[10] = cqgr.eW(gsh.a);
        cqmpVarArr4[11] = cqgr.eM(gry.a);
        cqmpVarArr2[15] = cqgr.gq(cqmpVarArr4);
        cqmpVarArr2[16] = cpp.g(cpp.f());
        cqmpVarArr[3] = cqgr.gd(cqmpVarArr2);
        cqmpVarArr[4] = cqgr.gm(cqgr.ca(valueOf));
        return cqgr.gd(cqmpVarArr);
    }
}
