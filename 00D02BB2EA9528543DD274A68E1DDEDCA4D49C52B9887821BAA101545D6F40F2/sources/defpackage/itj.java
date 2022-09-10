package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
@Deprecated
/* renamed from: itj  reason: default package */
/* loaded from: classes.dex */
public final class itj {
    public static cqgq a() {
        cqgq n = cqgr.n();
        n.c = irf.a;
        return n;
    }

    public static <T extends cqkp> cqnf<T> b(Number number) {
        return cqjv.j(iug.ASPECT_RATIO, number);
    }

    public static <T extends cqkp> cqnf<T> c(cqlc<T, Number> cqlcVar) {
        return cqjv.f(iug.ASPECT_RATIO, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> d(Integer num) {
        return cqjv.j(iug.COLLAPSED_LINE_COUNT, num);
    }

    public static <T extends cqkp> cqnf<T> e(Integer num) {
        return cqjv.j(iug.ELLIPSIS_VIEW_ID, num);
    }

    public static <T extends cqkp> cqnf<T> f(Integer num) {
        return cqjv.j(iug.MARKER_TAG, num);
    }

    public static <T extends cqkp> cqnf<T> g(cqkl cqklVar) {
        return cqjv.j(iug.ON_RIPPLE_CLICK, cqklVar != null ? new iti(cqny.a(cqklVar)) : null);
    }

    public static <T extends cqkp> cqnf<T> h(cqlc<T, View.OnClickListener> cqlcVar) {
        return cqjv.f(iug.ON_RIPPLE_CLICK, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> i(ddho ddhoVar) {
        return cqjv.j(iug.UE3_PARAMS, cjtd.a(ddhoVar));
    }

    public static <T extends cqkp> cqnf<T> j(final cqlc<T, ddho> cqlcVar) {
        return cqjv.f(iug.UE3_PARAMS, new cqlc(cqlcVar) { // from class: ith
            private final cqlc a;

            {
                this.a = cqlcVar;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                return cjtd.a((ddho) this.a.a(cqkpVar));
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        });
    }

    public static <T extends cqkp> cqnf<T> k(Integer num) {
        return cqjv.j(iug.BORDER_COLOR, num);
    }

    public static <T extends cqkp> cqnf<T> l(cqtv cqtvVar) {
        return cqjv.j(iug.BORDER_WIDTH, cqtvVar);
    }

    public static <T extends cqkp> cqnf<T> m(@dzsi Boolean bool) {
        return cqjv.j(iug.CENTER_ORIENTED, bool);
    }

    public static <T extends cqkp> cqnf<T> n(Boolean bool) {
        return cqjv.k(bool, cqgr.dY(17), cqgr.dY(1));
    }

    public static <T extends cqkp> cqnf<T> o(cqlc<T, Boolean> cqlcVar) {
        return cqjv.l(cqlcVar, cqgr.dY(17), cqgr.dY(1));
    }

    public static <T extends cqkp> cqnf<T> p(cqlc<T, Float> cqlcVar) {
        return cqjv.f(iug.TRANSLATION_Y_RATIO, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> q() {
        return cqjv.j(iug.MIRROR_IN_RTL, null);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> r(cqmp<T>... cqmpVarArr) {
        return cqgr.bt(R.layout.viewbinder_containerframelayout_internal, cqmpVarArr);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> s(cqmp<T>... cqmpVarArr) {
        return cqgr.bt(R.layout.viewbinder_gmmprogressbar_internal, cqmpVarArr);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> t(cqmp<T>... cqmpVarArr) {
        return cqgr.bt(R.layout.viewbinder_horizontaldivider_internal, cqmpVarArr);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> u(cqmp<T>... cqmpVarArr) {
        return cqgr.bt(R.layout.viewbinder_imagewebimageview_internal, cqmpVarArr);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> v(cqmp<T>... cqmpVarArr) {
        return cqgr.bt(R.layout.viewbinder_spinnerdatepicker_internal, cqmpVarArr);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> w(cqmp<T>... cqmpVarArr) {
        return cqgr.bt(R.layout.viewbinder_verticaldivider_internal, cqmpVarArr);
    }
}
