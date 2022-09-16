package defpackage;

import android.widget.ImageView;
/* compiled from: PG */
/* renamed from: iox  reason: default package */
/* loaded from: classes6.dex */
public class iox extends cqiw<jbf> {
    private final cqrp a;
    private final cqrp b;
    private final cqrp c;
    private final cqrp d;
    private final ddho e;
    private final boolean f;

    public iox(cqrp cqrpVar, cqrp cqrpVar2, cqrp cqrpVar3, cqrp cqrpVar4, ddho ddhoVar, boolean z, @dzsi Object... objArr) {
        super(cqrpVar, cqrpVar2, cqrpVar3, cqrpVar4, objArr);
        this.a = cqrpVar;
        this.b = cqrpVar2;
        this.c = cqrpVar3;
        this.d = cqrpVar4;
        this.e = ddhoVar;
        this.f = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public cqmj<jbf> a() {
        cqmp cqmpVar;
        cqmp[] cqmpVarArr = new cqmp[5];
        cqmpVarArr[0] = cqgr.bR(this.d);
        cqmpVarArr[1] = cqgr.bG(this.d);
        if (this.f) {
            cqmpVar = cqqx.g(cqrp.d(8.0d));
        } else {
            cqmpVar = cqmp.e;
        }
        cqmpVarArr[2] = cqmpVar;
        cqmpVarArr[3] = iue.g(cqgr.bq(this.a), cqgr.ce(this.b), cqgr.bv(3), cqgr.x(irn.G()), cqgr.cW(acly.a(iou.a)), itj.i(this.e), cqgr.fY(cqgr.cd(-1), cqgr.bq(this.c), cqgr.x(ibm.x()), cqgr.gc(cqgr.ce(cqrp.d(36.0d)), cqgr.bq(cqrp.d(36.0d)), cqgr.bw(17), cqgr.ei(ImageView.ScaleType.FIT_XY), cqgr.eG(iov.a))), cqgr.gq(cqgr.cd(-1), cqgr.bp(-1), cqgr.eN(5), cqgr.aJ(48), cqgr.bv(3), cqgr.dU(cqrp.d(11.0d)), cqgr.dQ(cqrp.d(11.0d)), cqgr.dF(cqrp.d(11.0d)), cqgr.dB(cqrp.d(5.0d)), irn.m(), irn.x(), cqgr.eM(iow.a)));
        cqmpVarArr[4] = cqgr.cd(-2);
        return cjyl.d(cqmpVarArr);
    }
}
