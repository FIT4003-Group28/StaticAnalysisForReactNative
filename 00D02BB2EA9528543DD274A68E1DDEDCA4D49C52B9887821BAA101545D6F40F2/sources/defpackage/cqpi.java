package defpackage;

import com.google.android.flexbox.FlexboxLayout;
/* compiled from: PG */
/* renamed from: cqpi  reason: default package */
/* loaded from: classes5.dex */
public final class cqpi {
    public static <T extends cqkp> cqmj<T> a(cqmp<T>... cqmpVarArr) {
        return new cqmh(FlexboxLayout.class, cqmpVarArr);
    }

    public static <T extends cqkp> cqnf<T> b(@dzsi cqtd cqtdVar) {
        return cqjv.j(cqph.DIVIDER_DRAWABLE_VERTICAL, cqtdVar);
    }

    public static <T extends cqkp> cqnf<T> c(int i) {
        return cqjv.j(cqph.FLEX_DIRECTION, Integer.valueOf(i));
    }

    public static <T extends cqkp> cqnf<T> d(int i) {
        return cqjv.j(cqph.JUSTIFY_CONTENT, Integer.valueOf(i));
    }

    public static <T extends cqkp> cqnf<T> e() {
        return cqjv.j(cqph.ALIGN_CONTENT, 5);
    }

    public static <T extends cqkp> cqnf<T> f() {
        return cqjv.j(cqph.ALIGN_ITEMS, 4);
    }

    public static <T extends cqkp> cqnf<T> g() {
        return cqjv.j(cqph.FLEX_WRAP, 1);
    }
}
