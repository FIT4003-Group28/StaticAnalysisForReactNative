package defpackage;

import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: bcvd  reason: default package */
/* loaded from: classes3.dex */
public final class bcvd extends cqiw<bczy> {
    private final boolean a;

    public bcvd(boolean z) {
        this.a = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<bczy> a() {
        cqmp[] cqmpVarArr = new cqmp[6];
        cqmpVarArr[0] = cqgr.dr(1);
        cqmpVarArr[1] = cqgr.bw(80);
        Float valueOf = Float.valueOf(1.0f);
        cqmpVarArr[2] = cqgr.ca(valueOf);
        cqmpVarArr[3] = cqgr.bR(irh.c());
        cqmpVarArr[4] = cqgr.bG(irh.c());
        int i = true != this.a ? 3 : 1;
        cqmp[] cqmpVarArr2 = {cqgr.ca(valueOf)};
        cqmj gd = cqgr.gd(cqgr.dr(0), cqgr.bp(-2), cqgr.cH(irh.a()), cqgr.V(bcvb.a), cqgr.gq(cqgr.bp(-2), cqgr.bw(80), cqgr.ar(TextUtils.TruncateAt.END), cqgr.aW(2), cqgr.cB(Integer.valueOf(i)), irn.y(), cqgr.eN(5), cqgr.eM(bcvc.a)));
        gd.f(cqmpVarArr2);
        cqmpVarArr[5] = gd;
        return cqgr.gd(cqmpVarArr);
    }
}
