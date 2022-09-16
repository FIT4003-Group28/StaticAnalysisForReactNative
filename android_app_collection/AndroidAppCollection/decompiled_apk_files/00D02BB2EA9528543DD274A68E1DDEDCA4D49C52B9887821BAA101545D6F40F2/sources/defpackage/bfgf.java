package defpackage;

import android.text.TextUtils;
import android.widget.ImageView;
/* compiled from: PG */
/* renamed from: bfgf  reason: default package */
/* loaded from: classes3.dex */
public final class bfgf {
    static final cqrp a = cqrp.d(15.0d);
    public static final /* synthetic */ int b = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static cqiw<bfgv> a(boolean z) {
        return new bfge(new Object[]{Boolean.valueOf(z)}, z);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> b(cqlc<T, cqss> cqlcVar, cqmn<T> cqmnVar, cqlc<T, cqtd> cqlcVar2, cqlc<T, String> cqlcVar3, cqlc<T, Boolean> cqlcVar4, cqmp<T>... cqmpVarArr) {
        cqmj<T> gd = cqgr.gd(cqgr.aJ(16), cqgr.gq(cqgr.aI(cqlcVar4), cqmnVar, cqgr.eW(cqlcVar), cqgr.eB(true), cqgr.eI(" · ")), cqgr.gc(cqgr.ch(cqrp.d(16.0d)), cqgr.fp(cqlcVar), cqgr.ei(ImageView.ScaleType.FIT_CENTER), cqgr.eG(cqlcVar2)), cqgr.gm(cqgr.ce(cqrp.d(4.0d))), cqgr.gq(cqmnVar, cqgr.ar(TextUtils.TruncateAt.END), cqgr.eB(true), cqgr.eW(cqlcVar), cqgr.eM(cqlcVar3)));
        gd.f(cqmpVarArr);
        return gd;
    }

    public static <T extends cqkp> cqmj<T> c(cqmp<T>... cqmpVarArr) {
        cqmj<T> gc = cqgr.gc(cqgr.cd(-2), cqgr.bp(-2), cqgr.dU(ibn.d()), cqgr.dB(ibn.d()), cqgr.bw(49), cqgr.eE(cqrt.i(ibk.a, ibm.j())));
        gc.f(cqmpVarArr);
        return gc;
    }
}
