package defpackage;

import android.widget.ImageView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: brsu  reason: default package */
/* loaded from: classes4.dex */
final class brsu extends cqiw<bdzv> {
    private final cqtv d;
    private final boolean e;
    private static final cqtv b = cqrp.d(dcyn.a);
    private static final cqtv c = ibn.d();
    public static final cqrp a = cqrp.d(18.0d);

    public brsu(boolean z) {
        super(Boolean.valueOf(z));
        this.d = c;
        this.e = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<bdzv> a() {
        cqmp cqmpVar;
        cqmp[] cqmpVarArr = new cqmp[11];
        cqmpVarArr[0] = cqgr.aG(B().d());
        cqmpVarArr[1] = cqgr.cH(ibn.a());
        cqmpVarArr[2] = cqgr.ce(cqrp.d(dcyn.a));
        cqmpVarArr[3] = cqgr.ca(Float.valueOf(1.0f));
        cqmpVarArr[4] = cqgr.bR(this.d);
        cqmpVarArr[5] = cqgr.aJ(16);
        cqmpVarArr[6] = cqgr.cU(B().c());
        cqmpVarArr[7] = iue.b(B().b());
        cqmpVarArr[8] = cqgr.az(true);
        cqmpVarArr[9] = cqgr.V(brsp.a);
        cqmp[] cqmpVarArr2 = new cqmp[13];
        cqmpVarArr2[0] = cqgr.bp(-2);
        cqmpVarArr2[1] = cqgr.cH(cqrp.d(36.0d));
        cqmpVarArr2[2] = cqgr.x(iur.a(R.drawable.mod_internal_place_action_button));
        cqmpVarArr2[3] = cqgr.J(false);
        cqmpVarArr2[4] = cqgr.az(false);
        cqmpVarArr2[5] = cqgr.bV(cqrp.d(4.0d));
        cqmpVarArr2[6] = cqgr.bD(cqrp.d(4.0d));
        cqmpVarArr2[7] = cqgr.dQ(ibn.f());
        cqmpVarArr2[8] = cqgr.dF(ibn.f());
        cqmpVarArr2[9] = cqgr.bw(16);
        cqmpVarArr2[10] = cqgr.aJ(17);
        if (this.e) {
            cqmpVar = ict.f(brsq.a, brsr.a, cqic.c(cqjv.x(brss.a), new cqmp[0]), cqgr.bw(17), cqgr.az(false), cqgr.ei(ImageView.ScaleType.CENTER_INSIDE), cqgr.bG(ibn.d()));
        } else {
            cqmpVar = cqmp.e;
        }
        cqmpVarArr2[11] = cqmpVar;
        cqmpVarArr2[12] = cqgr.gq(cqgr.J(false), cqgr.az(false), cqgr.bp(-2), cqgr.cH(cqrp.d(36.0d)), cqgr.cd(-2), ibq.z(), cqgr.bw(17), cqgr.aJ(17), cqgr.eN(4), ibq.r(), cqgr.cj(Float.valueOf(0.02f)), cqgr.eU(ibm.x()), cqgr.eM(brst.a));
        cqmpVarArr[10] = cqgr.gd(cqmpVarArr2);
        return cqgr.fY(cqmpVarArr);
    }

    public brsu(boolean z, byte[] bArr) {
        super(Boolean.valueOf(z), true);
        this.d = b;
        this.e = z;
    }
}
