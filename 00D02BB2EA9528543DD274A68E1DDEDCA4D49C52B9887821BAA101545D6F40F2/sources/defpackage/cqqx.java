package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import androidx.cardview.widget.CardView;
/* compiled from: PG */
/* renamed from: cqqx  reason: default package */
/* loaded from: classes.dex */
public final class cqqx {
    public static <T extends cqkp> cqnf<T> A(cqrd cqrdVar) {
        return cqjv.j(cqqi.SNAP_HELPER, cqrdVar);
    }

    public static <T extends cqkp> cqnf<T> B(Boolean bool) {
        return cqjv.j(cqqi.USE_COMPAT_PADDING, bool);
    }

    public static <T extends cqkp> cqnf<T> C(Boolean bool) {
        return cqjv.j(cqqi.SET_FULL_SPAN, bool);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> D(cqmp<T>... cqmpVarArr) {
        return new cqmh(RecyclerView.class, cqmpVarArr);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> E(cqmp<T>... cqmpVarArr) {
        return new cqmh(CardView.class, cqmpVarArr);
    }

    public static <T extends cqkp> cqnf<T> F() {
        return r(new cqqq(new Object[0]));
    }

    public static <T extends cqkp> cqnf<T> G() {
        return r(new cqqr(new Object[0]));
    }

    public static <T extends cqkp> cqnf<T> H(int i) {
        return r(new cqqs(new Object[]{Integer.valueOf(i)}, i));
    }

    public static <T extends cqkp> cqnf<T> I() {
        return A(cqqm.a);
    }

    public static <T extends cqkp> cqnf<T> J() {
        return A(cqqn.a);
    }

    public static <T extends cqkp> cqnf<T> K(cqjb<T, abp> cqjbVar) {
        return cqjv.d(cqqi.ITEM_DECORATION, cqjbVar);
    }

    public static <T extends cqkp> cqnf<T> L() {
        return M(null, 1);
    }

    public static <T extends cqkp> cqnf<T> M(@dzsi final cqtd cqtdVar, final Integer num) {
        return K(new cqjb(num, cqtdVar) { // from class: cqqo
            private final Integer a;
            private final cqtd b;

            {
                this.a = num;
                this.b = cqtdVar;
            }

            @Override // defpackage.cqjb
            public final Object a(cqkp cqkpVar, Context context) {
                Integer num2 = this.a;
                cqtd cqtdVar2 = this.b;
                zd zdVar = new zd(context, num2.intValue());
                if (cqtdVar2 != null) {
                    zdVar.a(cqtdVar2.a(context));
                }
                return zdVar;
            }
        });
    }

    public static <T extends cqkp> cqnf<T> N(int i, int i2, int i3) {
        return cqjv.j(cqqi.AUTO_SIZE_CONFIG, new cqrn(i, i2, i3, 2));
    }

    public static <T extends cqkp> cqnf<T> a(int i, int i2, int i3) {
        return cqjv.j(cqqi.AUTO_SIZE_CONFIG, new cqrn(i, i2, 1, i3));
    }

    public static <T extends cqkp> cqnf<T> b(cqss cqssVar) {
        return cqjv.j(cqqi.BACKGROUND_TINT_LIST, new cqqp(new Object[]{cqssVar}, cqssVar));
    }

    public static <T extends cqkp> cqnf<T> c(@dzsi cqss cqssVar) {
        return cqjv.j(cqqi.BUTTON_TINT_LIST, cqssVar);
    }

    public static <T extends cqkp> cqnf<T> d(@dzsi cqss cqssVar) {
        return cqjv.j(cqqi.CARD_BACKGROUND_COLOR, cqssVar);
    }

    public static <T extends cqkp> cqnf<T> e(Integer num) {
        return cqjv.j(cqqi.CARD_BACKGROUND_COLOR, num);
    }

    public static <T extends cqkp> cqnf<T> f(cqlc<T, ?> cqlcVar) {
        return cqjv.f(cqqi.CARD_BACKGROUND_COLOR, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> g(cqtv cqtvVar) {
        return cqjv.j(cqqi.CARD_CORNER_RADIUS, cqtvVar);
    }

    public static <T extends cqkp> cqnf<T> h(cqlc<T, cqtv> cqlcVar) {
        return cqjv.f(cqqi.CARD_CORNER_RADIUS, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> i(cqtv cqtvVar) {
        return cqjv.j(cqqi.CARD_ELEVATION, cqtvVar);
    }

    public static <T extends cqkp> cqnf<T> j(cqlc<T, cqtv> cqlcVar) {
        return cqjv.f(cqqi.CARD_ELEVATION, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> k(cqtv cqtvVar) {
        return cqjv.j(cqqi.CONTENT_PADDING, cqtvVar);
    }

    public static <T extends cqkp> cqnf<T> l(cqtv cqtvVar) {
        return cqjv.j(cqqi.CONTENT_PADDING_BOTTOM, cqtvVar);
    }

    public static <T extends cqkp> cqnf<T> m(cqtv cqtvVar) {
        return cqjv.j(cqqi.CONTENT_PADDING_LEFT, cqtvVar);
    }

    public static <T extends cqkp> cqnf<T> n(cqtv cqtvVar) {
        return cqjv.j(cqqi.CONTENT_PADDING_RIGHT, cqtvVar);
    }

    public static <T extends cqkp> cqnf<T> o(cqtv cqtvVar) {
        return cqjv.j(cqqi.CONTENT_PADDING_TOP, cqtvVar);
    }

    public static <T extends cqkp> cqnf<T> p(@dzsi abn abnVar) {
        return cqjv.j(cqqi.ITEM_ANIMATOR, abnVar);
    }

    public static <T extends cqkp> cqnf<T> q(cqlc<T, abn> cqlcVar) {
        return cqjv.f(cqqi.ITEM_ANIMATOR, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> r(cqrb cqrbVar) {
        return cqjv.j(cqqi.LAYOUT_MANAGER, cqrbVar);
    }

    public static <T extends cqkp> cqnf<T> s(cqtv cqtvVar) {
        return cqjv.j(cqqi.MAX_CARD_ELEVATION, cqtvVar);
    }

    public static <T extends cqkp> cqnf<T> t(@dzsi abx abxVar) {
        return cqjv.j(cqqi.ON_SCROLL_LISTENER, abxVar);
    }

    public static <T extends cqkp> cqnf<T> u(cqjb<T, abx> cqjbVar) {
        return cqjv.d(cqqi.ON_SCROLL_LISTENER, cqjbVar);
    }

    public static <T extends cqkp> cqnf<T> v(cqlc<T, abx> cqlcVar) {
        return cqjv.f(cqqi.ON_SCROLL_LISTENER, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> w(final cqlc<T, Integer> cqlcVar, final cqlc<T, Integer> cqlcVar2) {
        return cqjv.f(cqqi.RECYCLER_VIEW_SCROLL_POSITION, new cqlc(cqlcVar, cqlcVar2) { // from class: cqql
            private final cqlc a;
            private final cqlc b;

            {
                this.a = cqlcVar;
                this.b = cqlcVar2;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                return new cqrk(((Integer) this.a.a(cqkpVar)).intValue(), ((Integer) ((cqlb) this.b).a).intValue());
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        });
    }

    public static <T extends cqkp> cqnf<T> x(cqlc<T, cqrh> cqlcVar) {
        return cqjv.f(cqqi.ON_VIEW_ATTACHED_TO_WINDOW, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> y(Boolean bool) {
        return cqjv.j(cqqi.PREVENT_CORNER_OVERLAP, bool);
    }

    public static <T extends cqkp> cqnf<T> z(@dzsi acb acbVar) {
        return cqjv.j(cqqi.RECYCLER_LISTENER, acbVar);
    }
}
