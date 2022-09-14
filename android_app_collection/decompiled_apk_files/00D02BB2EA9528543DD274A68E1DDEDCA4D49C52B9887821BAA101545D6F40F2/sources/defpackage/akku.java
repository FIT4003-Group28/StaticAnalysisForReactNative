package defpackage;

import android.content.Context;
import android.widget.ImageView;
import com.google.android.apps.gmm.base.views.webimageview.WebImageView;
/* compiled from: PG */
/* renamed from: akku  reason: default package */
/* loaded from: classes2.dex */
public final class akku extends cqiw<aklg> {
    public static final /* synthetic */ int a = 0;
    private static final cqtv b = cqrp.d(16.0d);
    private final akgn<aklg> c;

    public akku(akgn<aklg> akgnVar) {
        super(akgnVar);
        this.c = akgnVar;
    }

    public static cqtd e(aklg aklgVar, Context context) {
        cqss f = aklgVar.f();
        if (f == null) {
            return akms.a();
        }
        return akms.b(Integer.valueOf(f.b(context)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<aklg> a() {
        akgn<aklg> akgnVar = this.c;
        cqmp[] cqmpVarArr = {cqgr.cd(-1), cqgr.bp(-1), WebImageView.a(cqgr.aF(cqjv.x(akkl.a)), cqgr.cd(-1), cqgr.bp(-1), cqgr.ei(ImageView.ScaleType.CENTER_CROP), WebImageView.l(akkm.a)), WebImageView.a(cqgr.aF(cqjv.x(akkn.a)), cqgr.cd(-1), cqgr.bp(-1), cqgr.ei(ImageView.ScaleType.CENTER_CROP), WebImageView.l(akko.a))};
        cqmp[] cqmpVarArr2 = {cqgr.fR(new akjq(), akkk.a, new cqmp[0])};
        cqtv cqtvVar = b;
        cqmj<aklg> a2 = akgnVar.a(iue.c(akkj.a), cqgr.fY(cqmpVarArr), cqgr.fY(cqgr.cd(-1), cqgr.bp(-1), cqgr.w(akkp.a), cqgr.fY(cqmpVarArr2), cqgr.fY(cqgr.dQ(cqtvVar), cqgr.dF(cqtvVar), cqgr.dU(cqtvVar), cqgr.dB(cqtvVar), cqgr.fR(new akhm(), akkq.a, new cqmp[0]), cqgr.fP(new akhs(), akkr.a, cqgr.bw(8388691), cqgr.aJ(8388691)))));
        a2.f(cqgr.cW(akks.a), cqgr.K(akkt.a));
        return a2;
    }
}
