package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.gmm.base.views.webimageview.WebImageView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: anrn  reason: default package */
/* loaded from: classes2.dex */
public final class anrn {
    private static final cqrp b = cqrp.d(4.0d);
    public static final cqtv a = cqsg.d(cqrt.d(R.dimen.timeline_day_details_stop_segment_checkin_icon_size), irh.g());

    @SafeVarargs
    public static <T extends cqkp> cqmp<T> a(cqlc<T, jic> cqlcVar, cqmp<T>... cqmpVarArr) {
        cqmj u = itj.u(cqgr.bq(apkz.b()), cqgr.ce(apkz.b()), cqgr.ei(ImageView.ScaleType.FIT_CENTER), cqgr.bV(cqrp.d(13.0d)), WebImageView.l(cqlcVar));
        u.f(cqmpVarArr);
        return u;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmp<T> b(cqlc<T, CharSequence> cqlcVar, cqmp<T>... cqmpVarArr) {
        cqmj gq = cqgr.gq(cqgr.cd(-2), apla.b(), irn.E(), cqgr.eM(cqlcVar));
        gq.f(cqmpVarArr);
        return gq;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmp<T> c(cqlc<T, CharSequence> cqlcVar, cqmp<T>... cqmpVarArr) {
        cqmj gq = cqgr.gq(cqgr.cd(-2), irn.m(), irn.E(), cqgr.eM(cqlcVar));
        gq.f(cqmpVarArr);
        return gq;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmp<T> d(cqlc<T, CharSequence> cqlcVar, cqmp<T>... cqmpVarArr) {
        cqmj gq = cqgr.gq(cqgr.cd(-2), irn.m(), irn.E(), cqgr.eM(cqlcVar));
        gq.f(cqmpVarArr);
        return gq;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmp<T> e(cqlc<T, cqsn> cqlcVar, cqmp<T>... cqmpVarArr) {
        cqmj gq = cqgr.gq(cqgr.cd(-1), cqgr.eN(4), apla.c(), cqgr.eM(cqlcVar));
        gq.f(cqmpVarArr);
        return gq;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> f(cqmp<T>... cqmpVarArr) {
        cqrp c = irh.c();
        cqrp cqrpVar = b;
        cqmj<T> f = aple.f(cqgr.dQ(cqsg.g(c, cqrpVar)), cqgr.dF(irh.c()), cqgr.al(cqsg.g(cqrp.d(12.0d), cqrpVar)), cqgr.bV(cqrp.d(12.0d)), cqgr.l(false), cqgr.eU(iva.c(R.color.qu_white_alpha_87, R.color.google_grey900)), cqgr.x(apla.d()), cqgr.ai(cqtt.h(cqrt.h(2131231613, irg.N()), 0.75f)));
        f.f(cqmpVarArr);
        return f;
    }

    public static <T extends cqkp> cqmp<T> g(cqlc<T, CharSequence> cqlcVar, cqlc<T, cqss> cqlcVar2, final cqlc<T, Boolean> cqlcVar3) {
        return b(cqlcVar, cqgr.eW(cqlcVar2), cqgr.bI(new cqlc(cqlcVar3) { // from class: anrj
            private final cqlc a;

            {
                this.a = cqlcVar3;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqlc cqlcVar4 = this.a;
                cqtv cqtvVar = anrn.a;
                return ((Boolean) cqlcVar4.a(cqkpVar)).booleanValue() ? anrn.a : cqrp.d(dcyn.a);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }));
    }

    public static <T extends cqkp> cqmj<T> h(cqlc<T, Boolean> cqlcVar) {
        cqtv cqtvVar = a;
        return cqgr.gc(cqgr.bR(cqsg.h(cqtvVar)), cqgr.ce(cqtvVar), cqgr.bq(cqrt.d(R.dimen.timeline_day_details_stop_segment_checkin_icon_size)), cqgr.bw(80), cqgr.eE(cqrt.g(2131232561, irg.u())), cqgr.dQ(irh.g()), cqgr.aI(cqlcVar));
    }

    public static <T extends cqkp> cqmp<T> i(cqlc<T, CharSequence> cqlcVar, cqlc<T, View.OnClickListener> cqlcVar2, cqlc<T, Boolean> cqlcVar3) {
        return hyw.w(cqkz.a(cqrt.f(2131231782)), cqlcVar2, cqkz.a(cjtd.a(dtxv.P)), cqkz.a(null), cqkz.a(null), cqkz.a(true), cqkz.a(false), hyw.J(), cqgr.eM(cqlcVar), cqgr.V(cqlcVar), cqgr.aI(cqlcVar3));
    }
}
