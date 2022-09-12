package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cjmw  reason: default package */
/* loaded from: classes4.dex */
public final class cjmw {
    static final cqkv a = new cjmx(cqlg.a);

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> a(cqmp<T>... cqmpVarArr) {
        return new cqmh(cjmy.class, cqmpVarArr);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> b(cqmp<T>... cqmpVarArr) {
        return cqgr.bt(R.layout.terra_textfield_outlined_internal, cqmpVarArr);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> c(cqmp<T>... cqmpVarArr) {
        return cqgr.bt(R.layout.terra_textfield_outlined_dense_internal, cqmpVarArr);
    }

    public static <T extends cqkp> cqnf<T> d(CharSequence charSequence) {
        return cqjv.i(cjna.HINT, charSequence, a);
    }

    public static <T extends cqkp> cqnf<T> e(cqsn cqsnVar) {
        return cqjv.i(cjna.HINT, cqsnVar, a);
    }

    public static <T extends cqkp> cqnf<T> f(cqlc<T, ?> cqlcVar) {
        return cqjv.g(cjna.HINT, cqlcVar, a);
    }

    public static <T extends cqkp> cqnf<T> g(@dzsi cqtd cqtdVar) {
        return cqjv.i(cjna.END_ICON_DRAWABLE, cqtdVar, a);
    }

    public static <T extends cqkp> cqnf<T> h(cqlc<T, View.OnClickListener> cqlcVar) {
        return cqjv.g(cjna.END_ICON_ON_CLICK_LISTENER, cqlcVar, a);
    }

    public static <T extends cqkp> cqnf<T> i() {
        return cqjv.i(cjna.END_ICON_MODE, -1, a);
    }
}
