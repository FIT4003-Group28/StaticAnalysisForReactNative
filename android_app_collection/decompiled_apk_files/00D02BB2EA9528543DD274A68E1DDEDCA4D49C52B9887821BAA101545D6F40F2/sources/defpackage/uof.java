package defpackage;

import android.widget.ImageView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: uof  reason: default package */
/* loaded from: classes7.dex */
public class uof extends cqiw<zdc> {
    public static final cqjg a = cqjg.a();
    static final cqtv b = cqrp.d(12.0d);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public cqmj<zdc> a() {
        cqmp[] cqmpVarArr = new cqmp[8];
        cqmpVarArr[0] = cqgr.aT(a);
        cqtv cqtvVar = b;
        cqmpVarArr[1] = cqgr.dz(cqtvVar, cqtvVar, cqtvVar, cqtvVar);
        cqmpVarArr[2] = iue.b(cjtd.a(dtxn.cO));
        cqmpVarArr[3] = cqgr.cW(acly.a(uod.a));
        cqmpVarArr[4] = cqgr.x(irn.N());
        cqmpVarArr[5] = cqgr.T(cqrt.l(R.string.ACCESSIBILITY_SWAP_DESTINATION));
        cqmpVarArr[6] = cqgr.ei(ImageView.ScaleType.CENTER);
        cqmpVarArr[7] = cqgr.eE(iup.c(true != e() ? R.raw.ic_swap_vert : R.raw.ic_swap_horiz, ibm.p()));
        return cqgr.gc(cqmpVarArr);
    }

    protected boolean e() {
        return false;
    }
}
