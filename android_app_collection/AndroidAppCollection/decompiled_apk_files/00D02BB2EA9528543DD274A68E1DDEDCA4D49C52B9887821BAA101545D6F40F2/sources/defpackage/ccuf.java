package defpackage;

import android.widget.ImageView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ccuf  reason: default package */
/* loaded from: classes4.dex */
final class ccuf extends cqiw<ccun> {
    private final ccud a;

    public ccuf(ccud ccudVar) {
        super(ccudVar);
        this.a = ccudVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<ccun> a() {
        cqmp[] cqmpVarArr = new cqmp[5];
        cqmpVarArr[0] = cqgr.cd(-1);
        cqmpVarArr[1] = cqgr.bp(-1);
        cqmpVarArr[2] = cqgr.gc(cqgr.eE(iup.e(R.raw.offering_details_placeholder_dish)), cqgr.ei(ImageView.ScaleType.CENTER_CROP));
        cqmpVarArr[3] = cjmf.a();
        cqmpVarArr[4] = ((cctz) this.a).b ? cqmp.e : ccra.k(cqkz.a(cqrt.i(iup.e(R.raw.ic_mod_add_photo), ibl.b())), cqkz.a(cqrt.l(R.string.ADD_PHOTOS_BUTTON)), cqgr.q(ccue.a), cqkz.a(cjtd.a(dtxx.Q)), cqgr.eU(ibl.b()), hyw.P(ibl.m()), cqgr.bw(17));
        return cqgr.fY(cqmpVarArr);
    }
}
