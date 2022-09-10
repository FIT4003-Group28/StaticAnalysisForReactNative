package defpackage;

import android.widget.ImageView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: acom  reason: default package */
/* loaded from: classes2.dex */
public final class acom extends cqiw<acpa> {
    final /* synthetic */ cqtc a;
    final /* synthetic */ cqrp b;
    final /* synthetic */ ddho c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acom(Object[] objArr, cqtc cqtcVar, cqrp cqrpVar, ddho ddhoVar) {
        super(objArr);
        this.a = cqtcVar;
        this.b = cqrpVar;
        this.c = ddhoVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<acpa> a() {
        cqmp cqmpVar;
        cqmp[] cqmpVarArr = new cqmp[13];
        cqmpVarArr[0] = cqgr.aT(acpa.a);
        cqmpVarArr[1] = cqgr.bq(this.a);
        cqmpVarArr[2] = cqgr.ce(this.a);
        cqmpVarArr[3] = cqgr.dU(this.b);
        cqmpVarArr[4] = cqgr.dB(this.b);
        cqmpVarArr[5] = cqgr.V(acoj.a);
        cqmpVarArr[6] = cqgr.eG(acok.a);
        cqmpVarArr[7] = cqgr.ei(ImageView.ScaleType.CENTER_INSIDE);
        ddho ddhoVar = this.c;
        if (ddhoVar != null) {
            cqmpVar = aclf.a(acli.a(ddhoVar));
        } else {
            cqmpVar = cqmp.e;
        }
        cqmpVarArr[8] = cqmpVar;
        cqmpVarArr[9] = cqgr.J(true);
        cqmpVarArr[10] = cqgr.x(gdj.b());
        cqmpVarArr[11] = cqgr.cV(new acol());
        cqmpVarArr[12] = acor.e();
        return cqgr.gc(cqmpVarArr);
    }
}
