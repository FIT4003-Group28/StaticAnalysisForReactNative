package defpackage;

import android.text.TextUtils;
import android.widget.ImageView;
import com.google.android.apps.gmm.base.views.webimageview.WebImageView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: brrj  reason: default package */
/* loaded from: classes4.dex */
final class brrj extends cqiw<brrk> {
    static final cqtb a = cqrt.d(R.dimen.text_size_xmicro);
    static final cqtv b = cqrp.f(252.0d);
    static final cqtv c;
    static final cqtv d;
    private static final cqtv e;

    static {
        cqrp d2 = cqrp.d(12.0d);
        c = d2;
        d = cqsg.d(cqrp.f(82.0d), d2, d2);
        e = cqrp.f(56.0d);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<brrk> a() {
        cqmj a2 = WebImageView.a(cqgr.aF(cqjv.x(brqz.a)), cqgr.ce(e), cqgr.bp(-1), cqgr.bR(irh.g()), cqgr.ei(ImageView.ScaleType.CENTER_CROP), WebImageView.l(brra.a));
        cqmj gq = cqgr.gq(cqgr.eN(5), cqgr.eU(irg.J()), cqgr.bp(-2), cqgr.cd(-1), irn.m(), cqgr.aZ(false), cqgr.cp(Float.valueOf(0.95f)), cqgr.dB(cqrp.f(8.0d)), cqgr.ar(TextUtils.TruncateAt.END), cqgr.eM(brrb.a));
        cqtb cqtbVar = a;
        cqmj a3 = jky.a(cqgr.eN(5), cqgr.bp(-2), cqgr.cd(-1), cqgr.fh(cqtbVar), irn.n(), irn.v(), cqgr.co(cqrp.f(2.0d), false), cqgr.ar(TextUtils.TruncateAt.END), jky.c(), jky.b(brrc.a));
        Float valueOf = Float.valueOf(1.0f);
        cqmj a4 = jgb.a(cqgr.ce(cqrp.d(dcyn.a)), cqgr.ca(valueOf), cqgr.bp(-1), jgb.c(brrd.a), cqjv.f(iug.MAX_LINES_PER_VIEW, brre.a), gq, a3);
        cqmj gq2 = cqgr.gq(cqgr.aI(brrf.a), cqgr.eN(5), cqgr.bp(-2), cqgr.cd(-1), cqgr.bD(cqrp.f(8.0d)), cqgr.cB(1), cqgr.fj(2), cqgr.fh(cqtbVar), cqgr.ar(TextUtils.TruncateAt.END), irn.v(), cqgr.eM(brrg.a));
        cqtv cqtvVar = c;
        return cjyl.d(cqgr.ce(b), cqgr.bp(-2), cqgr.az(true), cqgr.cW(cqgr.q(brrh.a)), iue.c(brri.a), cqgr.ax(irn.G()), cqgr.gd(cqgr.dr(1), cqgr.cd(-1), cqgr.bq(d), cqgr.dz(cqtvVar, cqtvVar, cqtvVar, cqtvVar), gq2, cqgr.gd(cqgr.dr(0), cqgr.cd(-1), cqgr.bq(cqrp.d(dcyn.a)), cqgr.ca(valueOf), cqgr.bv(3), a4, a2)));
    }
}
