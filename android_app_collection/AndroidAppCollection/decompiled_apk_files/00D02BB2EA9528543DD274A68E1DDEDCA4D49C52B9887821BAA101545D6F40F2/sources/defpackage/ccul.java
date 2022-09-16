package defpackage;

import android.widget.ImageView;
import com.google.android.apps.gmm.base.views.webimageview.WebImageView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ccul  reason: default package */
/* loaded from: classes4.dex */
final class ccul extends cqiw<ccuo<?>> {
    public static final /* synthetic */ int a = 0;
    private final ccud b;

    public ccul(ccud ccudVar, Object obj) {
        super(ccudVar, obj);
        this.b = ccudVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<ccuo<?>> a() {
        cqmp cqmpVar;
        cqmp cqmpVar2;
        cqmp<cqkp> cqmpVar3;
        cqtv g = cqsg.g(((cctz) this.b).c, cqrp.d(40.0d));
        cqtv f = cqsg.f(g, Float.valueOf(1.3333334f));
        cqmp[] cqmpVarArr = new cqmp[9];
        cqmpVarArr[0] = cqqx.g(cqrp.d(8.0d));
        cqmpVarArr[1] = cqqx.i(cqrp.d(dcyn.a));
        cqmpVarArr[2] = cqgr.bq(g);
        cqmpVarArr[3] = cqgr.ce(f);
        if (((cctz) this.b).a) {
            cqmpVar = cqgr.bK(cqrp.d(20.0d));
        } else {
            cqmpVar = cqmp.e;
        }
        cqmpVarArr[4] = cqmpVar;
        cqmpVarArr[5] = cqgr.bG(cqrp.d(8.0d));
        if (((cctz) this.b).a) {
            cqmpVar2 = cqgr.bT(ccug.a);
        } else {
            cqmpVar2 = cqmp.e;
        }
        cqmpVarArr[6] = cqmpVar2;
        cqmpVarArr[7] = WebImageView.a(cqgr.bp(-1), cqgr.cd(-1), cqgr.ei(ImageView.ScaleType.CENTER_CROP), WebImageView.l(ccuh.a), cqgr.cW(cqgr.q(ccui.a)), itj.i(dtxx.X), cqgr.U(cqiq.b(Integer.valueOf((int) R.string.OFFERINGS_MEDIA_CAROUSEL_ITEM_DESCRIPTION), cqiq.h(ccuj.a))), cqgr.a(ccra.r()));
        if (((cctz) this.b).b) {
            cqmpVar3 = cqmp.e;
        } else {
            cqmp[] cqmpVarArr2 = {cqgr.bw(8388661), cqgr.cW(cqgr.q(ccuk.a)), itj.i(dtxx.W), cqgr.S(Integer.valueOf((int) R.string.OFFERINGS_MEDIA_CAROUSEL_REMOVE_PHOTO_BUTTON_DESCRIPTION))};
            cqrp d = cqrp.d(12.0d);
            cqmj gc = cqgr.gc(cqgr.ch(cqrp.d(48.0d)), cqgr.dz(d, d, d, d), cqgr.bw(8388661), cqgr.eE(iup.g(cqrt.g(2131231591, ibm.b()), 0.6666667f, ibm.e())));
            gc.f(cqmpVarArr2);
            cqmpVar3 = gc;
        }
        cqmpVarArr[8] = cqmpVar3;
        return cqqx.E(cqmpVarArr);
    }
}
