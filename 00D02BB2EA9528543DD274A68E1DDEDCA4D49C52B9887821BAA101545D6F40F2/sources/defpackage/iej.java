package defpackage;

import android.text.TextUtils;
import android.widget.ImageView;
import com.google.android.apps.gmm.base.views.webimageview.WebImageView;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: iej  reason: default package */
/* loaded from: classes6.dex */
public abstract class iej extends cqiw<jba> {
    static final cqrp a = cqrp.d(16.0d);
    static final cqrp b = cqrp.d(12.0d);

    public iej(Object... objArr) {
        super(objArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final cqmj<jba> d(cqlc<jba, cqtv> cqlcVar) {
        return WebImageView.a(cqgr.cd(-1), cqgr.bs(cqlcVar), cqgr.ei(ImageView.ScaleType.CENTER_CROP), WebImageView.l(iea.a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeVarargs
    public static final cqmj<jba> e(cqmp<jba>... cqmpVarArr) {
        cqmj gq = cqgr.gq(cqgr.eN(5), cqgr.cd(0), cqgr.ca(Float.valueOf(1.0f)), cqgr.aJ(8388611), ibq.y(), cqgr.eM(ied.a));
        gq.f(cqmpVarArr);
        return iue.g(cqgr.cd(-1), cqgr.bp(-2), cqgr.bv(3), cqgr.dr(0), cqgr.aJ(16), gq);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeVarargs
    public static final cqmj<jba> f(cqmp<jba>... cqmpVarArr) {
        cqmj<jba> gq = cqgr.gq(cqgr.eN(5), cqgr.cd(-1), cqgr.bp(-2), cqgr.bv(3), cqgr.cp(Float.valueOf(0.95f)), ibq.m(), ibq.x(), cqgr.aR(Integer.valueOf((int) R.id.title)), cqgr.ar(TextUtils.TruncateAt.END), cqgr.eM(ieb.a), cqgr.cB(2));
        gq.f(cqmpVarArr);
        return gq;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final cqmj<jba> g() {
        return jgb.a(cqgr.cd(-1), cqgr.bp(-2), cqgr.ca(Float.valueOf(1.0f)), jgb.b(3), jgb.d(2), f(new cqmp[0]), cqgr.gq(cqgr.eN(5), cqgr.cd(-1), cqgr.bp(-2), ibq.p(), ibq.y(), cqgr.ar(TextUtils.TruncateAt.END), cqgr.eM(iec.a), cqgr.cB(2)));
    }
}
