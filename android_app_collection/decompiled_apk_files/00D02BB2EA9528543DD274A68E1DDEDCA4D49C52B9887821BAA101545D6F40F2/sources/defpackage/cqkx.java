package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: PG */
/* renamed from: cqkx  reason: default package */
/* loaded from: classes.dex */
public final class cqkx {
    public static final Set<cqho> a = Collections.newSetFromMap(new WeakHashMap());
    public static final cqqe<cqkp, cqhm> b = new cqqe<>();

    private cqkx() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(View view) {
        cqjz<?> g = cqjz.g(view);
        if (g != null) {
            g.k();
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                a(viewGroup.getChildAt(i));
            }
        }
    }

    public static void b() {
        for (cqho cqhoVar : a) {
            cqhoVar.q().b();
        }
    }

    @Deprecated
    public static int c() {
        return cqir.a();
    }

    @Deprecated
    public static View d(View view, cqjg cqjgVar) {
        cqjz<?> s = cqjz.s(view, cqjgVar);
        if (s == null) {
            return null;
        }
        return s.c;
    }

    @Deprecated
    public static <T extends View> T e(View view, cqjg cqjgVar, Class<? extends T> cls) {
        cqjz<?> s = cqjz.s(view, cqjgVar);
        if (s == null) {
            return null;
        }
        return (T) s.i(cls);
    }

    @Deprecated
    public static void f(View view, cqjg cqjgVar, Collection<? super View> collection) {
        g(view, cqjgVar, View.class, collection);
    }

    @Deprecated
    public static <V extends View> void g(View view, cqjg cqjgVar, Class<V> cls, Collection<? super V> collection) {
        h(view, cqjgVar, cls, cqpv.b(collection));
    }

    public static <V extends View> void h(View view, cqjg cqjgVar, Class<V> cls, dbrn<? super V, ?> dbrnVar) {
        cqjz.u(view, cqpv.a(dbst.b(cqjz.t(cqjgVar), new cqjy(cls)), dbrs.a(dbrnVar, dbrs.a(new cqpt(), new cqjw()))));
    }

    @Deprecated
    public static cqkp i(View view) {
        cqjz<?> g = cqjz.g(view);
        if (g == null) {
            return null;
        }
        return g.j;
    }

    @Deprecated
    public static void j(cqkp cqkpVar, cqhm cqhmVar) {
        b.b(cqkpVar, cqhmVar);
    }

    static <V extends cqkp> void k(V v, dbrn<? super cqiy<V>, ?> dbrnVar) {
        for (cqho cqhoVar : a) {
            List<WeakReference<cqiy<V>>> a2 = cqhoVar.q().a(v, false);
            if (a2 != null) {
                int size = a2.size();
                for (int i = 0; i < size; i++) {
                    cqiy<V> cqiyVar = a2.get(i).get();
                    if (cqiyVar != null) {
                        ((cqpu) dbrnVar).a(cqiyVar);
                    }
                }
            }
        }
    }

    public static <V extends cqkp> Iterable<cqiy<V>> l(V v) {
        ArrayList arrayList = new ArrayList();
        k(v, cqpv.b(arrayList));
        return arrayList;
    }

    @dzsi
    public static <V extends cqkp> cqiy<V> m(V v) {
        Iterator it = l(v).iterator();
        if (!it.hasNext()) {
            return null;
        }
        return (cqiy) it.next();
    }

    public static Iterable<View> n(cqkp cqkpVar) {
        return dcft.o(l(cqkpVar), new cqkw());
    }

    @dzsi
    public static <V extends View> V o(cqkp cqkpVar) {
        cqiy m = m(cqkpVar);
        if (m == null) {
            return null;
        }
        return (V) m.c;
    }

    @Deprecated
    public static <V extends cqkp> void p(V v) {
        ArrayList arrayList = new ArrayList();
        k(v, cqpv.b(arrayList));
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            cqjz cqjzVar = (cqjz) arrayList.get(i);
            if (cqjzVar.j == v) {
                cqjzVar.j();
            }
        }
        cqhm c = b.c(v);
        if (c != null) {
            c.a();
        }
    }
}
