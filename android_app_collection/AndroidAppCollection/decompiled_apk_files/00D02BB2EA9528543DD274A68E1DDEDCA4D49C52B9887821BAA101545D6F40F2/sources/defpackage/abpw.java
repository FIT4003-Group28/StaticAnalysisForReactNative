package defpackage;

import android.text.TextUtils;
import android.widget.ImageView;
import com.google.android.apps.gmm.base.views.webimageview.WebImageView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: abpw  reason: default package */
/* loaded from: classes.dex */
public final class abpw extends cqiw<abpx> {
    public abpw() {
        super(11);
    }

    public static <T extends cqkp> cqmj<T> e(cqlc<T, jic> cqlcVar) {
        return WebImageView.a(cqgr.bp(-1), cqgr.cd(-1), cqgr.ei(ImageView.ScaleType.CENTER_CROP), WebImageView.l(cqlcVar));
    }

    public static <T extends cqkp> cqmj<T> f() {
        return cqgr.gs(cqgr.bp(-1), cqgr.cd(-1), cqgr.v(Integer.valueOf((int) R.drawable.set_overlay_gradient)));
    }

    public static <T extends cqkp> cqmj<T> g(cqlc<T, ? extends CharSequence> cqlcVar, int i) {
        cqrp d = cqrp.d(i);
        return cqgr.gd(cqgr.bp(-2), cqgr.cd(-1), cqgr.dr(1), cqgr.bw(80), cqgr.dz(d, d, d, d), cqgr.gq(cqgr.bp(-2), cqgr.cd(-1), cqgr.eN(5), cqgr.cB(3), cqgr.ar(TextUtils.TruncateAt.END), ibq.m(), cqgr.eU(ibl.b()), cqgr.eM(cqlcVar)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<abpx> a() {
        return cqgr.fY(cqgr.cd(-1), cqgr.bp(-1), e(abps.a), cqgr.gs(cqgr.bp(-1), cqgr.cd(-1), cqgr.v(Integer.valueOf((int) R.drawable.dark_set_overlay_gradient))), g(abpt.a, 11), cqgr.cW(acly.a(abpu.a)), iue.c(abpv.a));
    }
}
