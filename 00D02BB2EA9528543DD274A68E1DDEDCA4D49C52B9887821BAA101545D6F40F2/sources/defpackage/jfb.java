package defpackage;

import com.google.android.apps.gmm.base.views.fivestar.FiveStarView;
/* compiled from: PG */
/* renamed from: jfb  reason: default package */
/* loaded from: classes.dex */
public final class jfb {
    public final cjqy a;

    public jfb(cjqy cjqyVar) {
        this.a = cjqyVar;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> a(cqmp<T>... cqmpVarArr) {
        return new cqmh(FiveStarView.class, cqmpVarArr);
    }

    public static <T extends cqkp> cqnf<T> b(@dzsi Number number) {
        return cqjv.j(jfa.FIVE_STAR_COUNT, number);
    }

    public static <T extends cqkp> cqnf<T> c(cqlc<T, ? extends Number> cqlcVar) {
        return cqjv.f(jfa.FIVE_STAR_COUNT, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> d(cqlc<T, ? extends CharSequence> cqlcVar) {
        return cqjv.f(jfa.FIVE_STAR_ACCESSIBILITY_LABEL, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> e() {
        return f(jfo.d);
    }

    public static <T extends cqkp> cqnf<T> f(jfo jfoVar) {
        return cqjv.j(jfa.FIVE_STAR_VIEW_PROPERTIES, jfoVar);
    }

    public static <T extends cqkp> cqnf<T> g(cqlc<T, jez> cqlcVar) {
        return cqjv.f(jfa.ON_INTERACTIVE_STAR_CLICK, cqlcVar);
    }

    public final void h(@dzsi jez jezVar, FiveStarView fiveStarView) {
        if (jezVar == null) {
            fiveStarView.setListener(null);
        } else {
            fiveStarView.setListener(new jey(this, fiveStarView, jezVar));
        }
    }
}
