package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
@Deprecated
/* renamed from: ibh  reason: default package */
/* loaded from: classes6.dex */
public final class ibh {
    static final cqkv a = new ibj(cqlg.a);

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> a(cqmp<T>... cqmpVarArr) {
        return cqgr.bt(R.layout.textfield_outlined_internal, cqmpVarArr);
    }

    public static <T extends cqkp> cqnf<T> b(Boolean bool) {
        return cqjv.i(ibi.COUNTER_ENABLED, bool, a);
    }

    public static <T extends cqkp> cqnf<T> c(cqlc<T, Integer> cqlcVar) {
        return cqjv.g(ibi.COUNTER_MAX_LENGTH, cqlcVar, a);
    }

    public static <T extends cqkp> cqnf<T> d(cqsn cqsnVar) {
        return cqjv.i(ibi.HINT, cqsnVar, a);
    }

    public static <T extends cqkp> cqnf<T> e(cqlc<T, ?> cqlcVar) {
        return cqjv.g(ibi.HINT, cqlcVar, a);
    }

    public static <T extends cqkp> cqnf<T> f(Boolean bool) {
        return cqjv.i(ibi.HINT_ANIMATION_ENABLED, bool, a);
    }

    public static <T extends cqkp> cqnf<T> g(@dzsi CharSequence charSequence) {
        return cqjv.i(ibi.ERROR, charSequence, a);
    }

    public static <T extends cqkp> cqnf<T> h(cqlc<T, ? extends CharSequence> cqlcVar) {
        return cqjv.g(ibi.ERROR, cqlcVar, a);
    }

    public static <T extends cqkp> cqnf<T> i(Boolean bool) {
        return cqjv.i(ibi.ERROR_ENABLED, bool, a);
    }

    public static <T extends cqkp> cqnf<T> j(@dzsi cqtd cqtdVar) {
        return cqjv.i(ibi.START_ICON_DRAWABLE, cqtdVar, a);
    }

    public static <T extends cqkp> cqnf<T> k(cqlc<T, cqtd> cqlcVar) {
        return cqjv.g(ibi.END_ICON_DRAWABLE, cqlcVar, a);
    }

    public static <T extends cqkp> cqnf<T> l(Integer num) {
        return cqjv.i(ibi.END_ICON_MODE, num, a);
    }

    public static <T extends cqkp> cqnf<T> m(cqlc<T, cqss> cqlcVar) {
        return cqjv.g(ibi.STROKE_COLOR_STATE_LIST, cqlcVar, a);
    }

    public static <T extends cqkp> cqnf<T> n(cqlc<T, Integer> cqlcVar) {
        return cqjv.g(ibi.BOX_STROKE_WIDTH, cqlcVar, a);
    }

    public static <T extends cqkp> cqnf<T> o(cqlc<T, cqss> cqlcVar) {
        return cqjv.g(ibi.DEFAULT_HINT_TEXT_COLOR, cqlcVar, a);
    }

    public static <T extends cqkp> cqnf<T> p() {
        return cqjv.i(ibi.ERROR_ICON_DRAWABLE, null, a);
    }
}
