package defpackage;

import android.widget.ImageView;
import com.google.android.apps.gmm.base.views.webimageview.WebImageView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: anxt  reason: default package */
/* loaded from: classes2.dex */
public final class anxt extends cqiw<anxu> {
    public static final /* synthetic */ int a = 0;
    private static final cqtv b = cqrt.d(R.dimen.timeline_day_details_stop_segment_icon_size);

    @SafeVarargs
    private static final cqmj<anxu> e(cqmp<anxu>... cqmpVarArr) {
        cqmj<anxu> gq = cqgr.gq(cqgr.cd(-2), cqgr.bw(16), cqgr.bR(irh.g()), irn.n(), irn.E(), cqgr.eN(5), cqgr.eW(anwt.a), cqgr.eM(anwu.a));
        gq.f(cqmpVarArr);
        return gq;
    }

    @SafeVarargs
    private static cqmj<anxu> f(cqmp<anxu>... cqmpVarArr) {
        cqmj<anxu> gc = cqgr.gc(apla.a(cqrt.d(R.dimen.timeline_day_details_stop_segment_chevron_icon_size)), cqgr.bR(cqsg.g(cqrt.d(R.dimen.timeline_day_details_segment_title_margin_end), cqrt.d(R.dimen.timeline_day_details_stop_segment_chevron_icon_size))), cqgr.bw(80));
        gc.f(cqmpVarArr);
        return gc;
    }

    private static cqmj<anxu> h() {
        Float valueOf = Float.valueOf(1.0f);
        return cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(0), cqgr.gd(cqgr.aF(anwv.a), cqgr.ca(valueOf), anrn.g(anww.a, anwx.a, anwy.a), anrn.h(anwz.a)), cqgr.gd(cqgr.aI(anxb.a), cqgr.ca(valueOf), anrn.b(anxc.a, cqgr.eW(anxd.a))), e(cqgr.aF(anxe.a)), f(cqgr.aF(anxf.a), cqgr.eG(anxg.a)));
    }

    private static cqmj<anxu> i() {
        return cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(0), cqgr.aJ(8388613), cqgr.aI(anxh.a), cqgr.bw(8388613), e(new cqmp[0]), f(cqgr.eE(cqrt.h(2131232569, irg.a()))));
    }

    @SafeVarargs
    private static final cqmj<anxu> j(cqlc<anxu, String> cqlcVar, cqmp<anxu>... cqmpVarArr) {
        cqmj<anxu> gq = cqgr.gq(cqgr.aF(cqjv.x(cqlcVar)), cqgr.bp(-2), cqgr.cd(-1), cqgr.eN(5), irn.m(), irn.E(), cqgr.eW(anxi.a), cqgr.eM(cqlcVar));
        gq.f(cqmpVarArr);
        return gq;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<anxu> a() {
        cqtv cqtvVar = b;
        cqmp[] cqmpVarArr = {cqgr.aF(anwp.a), cqgr.cd(-1), cqgr.bp(-1), cqgr.ei(ImageView.ScaleType.FIT_CENTER), WebImageView.l(anxa.a)};
        cqmp[] cqmpVarArr2 = {cqgr.aI(anxl.a), cqgr.eE(cqrt.h(2131232706, ibm.b())), cqgr.ce(cqtvVar), cqgr.bq(cqtvVar), cqgr.ei(ImageView.ScaleType.FIT_CENTER)};
        cqmj c = aple.c(cqtvVar);
        c.f(cqgr.aI(anxm.a));
        cqmp[] cqmpVarArr3 = {apla.a(cqtvVar), cqgr.bR(irh.b()), cqgr.bV(cqrt.d(R.dimen.timeline_day_details_stop_segment_icon_margin_top)), itj.u(cqmpVarArr), cqgr.gc(cqmpVarArr2), c};
        cqmj e = aple.e();
        e.f(cqgr.aI(anxn.a));
        return cqgr.fY(cqgr.cd(-1), cqgr.bp(-2), cqgr.fY(cqmpVarArr3), e, cqgr.gd(cqgr.aF(anxo.a), cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(1), cqgr.dQ(apkz.a()), cqgr.dF(irh.b()), cqgr.gq(cqgr.aF(anwq.a), cqgr.bp(-2), cqgr.cd(-1), cqgr.eN(5), apla.c(), cqgr.eW(anwr.a), cqgr.eM(anws.a)), h(), j(anxp.a, cqgr.aF(anxq.a)), j(anxr.a, cqgr.aI(anxs.a)), i()), cqgr.gd(cqgr.aI(anxj.a), cqgr.cd(-1), cqgr.bp(-1), cqgr.bw(16), cqgr.dr(0), cqgr.dQ(apkz.a()), cqgr.dF(irh.b()), cqgr.fY(apla.a(cqrt.d(R.dimen.timeline_day_details_transitional_segment_icon_size)), cqgr.bw(16), cqgr.bG(irh.g()), itj.u(cqgr.cd(-1), cqgr.bp(-1), cqgr.ei(ImageView.ScaleType.FIT_CENTER), WebImageView.l(anxk.a))), h(), i()));
    }
}
