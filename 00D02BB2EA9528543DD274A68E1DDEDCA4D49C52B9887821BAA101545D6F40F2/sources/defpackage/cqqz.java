package defpackage;

import android.support.v7.widget.Toolbar;
import android.view.View;
/* compiled from: PG */
/* renamed from: cqqz  reason: default package */
/* loaded from: classes5.dex */
public final class cqqz {
    static final cqkv a = new cqra(cqlg.a);

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> a(cqmp<T>... cqmpVarArr) {
        return new cqmh(Toolbar.class, cqmpVarArr);
    }

    public static <T extends cqkp> cqnf<T> b(Integer num) {
        return cqjv.i(cqqy.TITLE_TEXT_APPEARANCE, num, a);
    }

    public static <T extends cqkp> cqnf<T> c(@dzsi cqsn cqsnVar) {
        return cqjv.i(cqqy.NAVIGATION_CONTENT_DESCRIPTION, cqsnVar, a);
    }

    public static <T extends cqkp> cqnf<T> d(cqlc<T, View.OnClickListener> cqlcVar) {
        return cqjv.g(cqqy.NAVIGATION_ON_CLICK_LISTENER, cqlcVar, a);
    }

    public static <T extends cqkp> cqnf<T> e(@dzsi cqtd cqtdVar) {
        return cqjv.i(cqqy.NAVIGATION_ICON, cqtdVar, a);
    }

    public static <T extends cqkp> cqnf<T> f(cqlc<T, ? extends CharSequence> cqlcVar) {
        return cqjv.g(cqqy.TITLE, cqlcVar, a);
    }

    public static <T extends cqkp> cqnf<T> g(cqss cqssVar) {
        return cqjv.i(cqqy.TITLE_TEXT_COLOR, cqssVar, a);
    }

    public static <T extends cqkp> cqnf<T> h() {
        return cqjv.i(cqqy.TITLE, "", a);
    }
}
