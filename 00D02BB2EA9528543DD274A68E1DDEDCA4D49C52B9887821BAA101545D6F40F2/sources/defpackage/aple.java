package defpackage;

import android.widget.ImageView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aple  reason: default package */
/* loaded from: classes2.dex */
public final class aple {
    private static final cqtv a = cqrt.d(R.dimen.timeline_day_details_stop_segment_icon_size);
    private static final cqtv b = irh.e();
    private static final cqtv c = cqrt.d(R.dimen.timeline_segment_schematic_line_width);

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> a(cqmp<T>... cqmpVarArr) {
        return new cqmh(dmjq.class, cqmpVarArr);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> b(cqmp<T>... cqmpVarArr) {
        return new cqmh(aplf.class, cqmpVarArr);
    }

    public static <T extends cqkp> cqmj<T> c(cqtv cqtvVar) {
        return cqgr.fY(apla.a(cqtvVar), cqgr.x(cqtt.g(irg.a())), cqgr.gg(apla.a(cqsg.f(cqtvVar, Float.valueOf(0.618f))), cqgr.bw(17)));
    }

    public static jic d(@dzsi String str, ckqc ckqcVar, @dzsi cqtd cqtdVar) {
        return new jic(str, ckqcVar, cqtdVar, 250, null, new ckql());
    }

    public static <T extends cqkp> cqmj<T> e() {
        cqtv cqtvVar = a;
        return cqgr.gc(apla.a(cqtvVar), cqgr.bR(cqsg.d(b, cqsg.f(cqsg.g(c, cqtvVar), Float.valueOf(0.5f)))), cqgr.bV(cqrt.d(R.dimen.timeline_day_details_stop_segment_icon_margin_top)), cqgr.ei(ImageView.ScaleType.FIT_CENTER), cqgr.eE(cqrt.f(2131231296)));
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> f(cqmp<T>... cqmpVarArr) {
        cqmj<T> fV = cqgr.fV(cqgr.cd(-2), cqgr.cH(irh.o()), cqgr.dQ(irh.g()), cqgr.dF(irh.g()), cqgr.aZ(false), irn.p());
        fV.f(cqmpVarArr);
        return fV;
    }
}
