package defpackage;

import android.view.View;
import com.google.android.apps.gmm.base.mod.components.appbar.ModAppBar;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: hxc  reason: default package */
/* loaded from: classes6.dex */
public final class hxc {
    public static final dcep<Integer> a = dcep.D(0, 1, 2);
    public static final dcep<Integer> b = dcep.D(0, 1, 2);
    static final cqkv c = new hxk(cqlg.a);

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> a(cqmp<T>... cqmpVarArr) {
        cqmh cqmhVar = new cqmh(ModAppBar.class, cqgr.cd(-1), cqgr.bp(-2));
        cqmhVar.f(cqmpVarArr);
        return cqmhVar;
    }

    public static <T extends cqkp> cqnf<T> b(cqlc<T, jib> cqlcVar) {
        return cqjv.g(hxo.TOOLBAR_PROPERTIES, cqlcVar, c);
    }

    public static <T extends cqkp> cqnf<T> c(cqlc<T, ? extends List<jho>> cqlcVar) {
        return cqjv.g(hxo.ACTION_MENU_ITEMS, cqlcVar, c);
    }

    public static <T extends cqkp> cqnf<T> d(cqjb<T, List<jho>> cqjbVar) {
        return cqjv.e(hxo.ACTION_MENU_ITEMS, cqjbVar, c);
    }

    public static <T extends cqkp> cqnf<T> e(Boolean bool) {
        return cqjv.i(hxo.COVER_STATUS_BAR, bool, c);
    }

    public static <T extends cqkp> cqnf<T> f(cqlc<T, ? extends CharSequence> cqlcVar) {
        return cqjv.g(hxo.TITLE, cqlcVar, c);
    }

    public static <T extends cqkp> cqnf<T> g(cqlc<T, ? extends CharSequence> cqlcVar) {
        return cqjv.g(hxo.SUBTITLE, cqlcVar, c);
    }

    public static <T extends cqkp> cqnf<T> h(cqlc<T, View.OnClickListener> cqlcVar) {
        return cqjv.g(hxo.TITLE_CLICK_LISTENER, cqlcVar, c);
    }

    public static <T extends cqkp> cqnf<T> i(cqlc<T, ? extends List<jho>> cqlcVar) {
        return cqjv.g(hxo.OVERFLOW_MENU_ITEMS, cqlcVar, c);
    }

    public static <T extends cqkp> cqnf<T> j(cqlc<T, View.OnClickListener> cqlcVar) {
        return cqjv.g(hxo.NAV_BUTTON_CLICK_LISTENER, cqlcVar, c);
    }

    public static <T extends cqkp> cqnf<T> k(cqlc<T, ? extends CharSequence> cqlcVar) {
        return cqjv.g(hxo.NAV_BUTTON_CONTENT_DESCRIPTION, cqlcVar, c);
    }

    public static <T extends cqkp> cqnf<T> l() {
        return cqgr.aR(Integer.valueOf((int) R.id.mod_app_bar_lift_on_scroll_recycler_view));
    }
}
