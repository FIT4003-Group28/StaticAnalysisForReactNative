package defpackage;

import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: aavt  reason: default package */
/* loaded from: classes2.dex */
final class aavt extends cqiw<jbi> {
    private final aavq a;

    public aavt(aavq aavqVar) {
        super(aavqVar);
        this.a = aavqVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<jbi> a() {
        cqmp[] cqmpVarArr = new cqmp[6];
        boolean z = false;
        cqmpVarArr[0] = cqgr.aF(cqjv.x(aavr.a));
        cqmpVarArr[1] = aahw.m();
        cqmpVarArr[2] = cqgr.cB(1);
        cqmpVarArr[3] = cqgr.ar(TextUtils.TruncateAt.END);
        if (this.a == aavq.JUSTIFY_START) {
            z = true;
        }
        cqmpVarArr[4] = cqjv.k(Boolean.valueOf(z), vlb.a(), cqgr.eN(6));
        cqmpVarArr[5] = cqgr.eM(aavs.a);
        return cqgr.gq(cqmpVarArr);
    }
}
