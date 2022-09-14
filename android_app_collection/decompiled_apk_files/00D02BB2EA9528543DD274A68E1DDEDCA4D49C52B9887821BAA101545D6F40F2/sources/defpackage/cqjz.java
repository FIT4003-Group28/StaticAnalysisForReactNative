package defpackage;

import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.maps.R;
import defpackage.cqkp;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cqjz  reason: default package */
/* loaded from: classes.dex */
public class cqjz<V extends cqkp> {
    private Map<cqis<?>, Object> a;
    public final View c;
    final cqja<V> d;
    final cqjg e;
    public final cqiw<V> f;
    public final cqho g;
    int h;
    final boolean i;
    @dzsi
    public V j;

    public cqjz(View view, cqho cqhoVar, cqja<V> cqjaVar, cqjg cqjgVar, cqiw<V> cqiwVar, boolean z) {
        this.c = view;
        this.g = cqhoVar;
        this.d = cqjaVar;
        this.e = cqjgVar;
        this.f = cqiwVar;
        this.i = z;
    }

    @dzsi
    public static cqjz<?> g(View view) {
        return (cqjz) view.getTag(R.id.view_properties);
    }

    @dzsi
    public static cqkp o(View view) {
        cqjz<?> g = g(view);
        if (g == null) {
            return null;
        }
        return g.j;
    }

    @dzsi
    public static cqjz<?> q(View view, dbsl<? super cqjz<?>> dbslVar) {
        cqjz<?> g = g(view);
        if (g == null) {
            return r(view, dbslVar);
        }
        return dbslVar.a(g) ? g : r(g.c, dbslVar);
    }

    @dzsi
    static cqjz<?> r(View view, dbsl<? super cqjz<?>> dbslVar) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                cqjz<?> q = q(viewGroup.getChildAt(i), dbslVar);
                if (q != null) {
                    return q;
                }
            }
            return null;
        }
        return null;
    }

    @dzsi
    public static cqjz<?> s(View view, cqjg cqjgVar) {
        return q(view, t(cqjgVar));
    }

    public static <V extends View> dbsl<cqjz<?>> t(cqjg cqjgVar) {
        return new cqjx(cqjgVar);
    }

    public static void u(View view, dbrn<? super cqjz<?>, ?> dbrnVar) {
        cqjz<?> g = g(view);
        if (g == null) {
            v(view, dbrnVar);
            return;
        }
        dbrnVar.a(g);
        v(g.c, dbrnVar);
    }

    static void v(View view, dbrn<? super cqjz<?>, ?> dbrnVar) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                u(viewGroup.getChildAt(i), dbrnVar);
            }
        }
    }

    private static void y(View view, cqkp cqkpVar, int i) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt != null) {
                    cqjz<?> g = g(childAt);
                    if (g == null) {
                        cqjz<?> g2 = g(childAt);
                        if (g2 != null) {
                            g2.x(cqkpVar, i);
                        } else if (z(childAt, i)) {
                            y(childAt, cqkpVar, i);
                        }
                    } else {
                        V v = g.j;
                        Object a = g.a(cqkpVar, g.c.getContext());
                        g.p(a);
                        int i3 = i - 1;
                        g.x(a, (i3 == 0 || i3 == 3 || a == v) ? i : 2);
                        cqid d = g.g.d();
                        if (cqkpVar == null) {
                            d.a(g.b(), g.g.k(), i);
                        } else {
                            cqid.b(g.b(), g.g.k(), cqkpVar, i);
                        }
                    }
                }
            }
        }
    }

    private static boolean z(View view, int i) {
        if (i != 3) {
            return true;
        }
        if (view.getTag(R.id.contains_invalid_bindings) == null) {
            return false;
        }
        view.setTag(R.id.contains_invalid_bindings, null);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dzsi
    public V a(@dzsi cqkp cqkpVar, Context context) {
        return cqkpVar;
    }

    public cqja<?> b() {
        return cqja.a;
    }

    public void c(@dzsi V v, @dzsi V v2) {
    }

    public void d(@dzsi V v) {
    }

    @dzsi
    public cqkf<V> e() {
        return null;
    }

    @dzsi
    public void f(cqkf<V> cqkfVar) {
    }

    public final View h() {
        return this.c;
    }

    /* JADX WARN: Incorrect return type in method signature: <V:Landroid/view/View;>(Ljava/lang/Class<TV;>;)TV; */
    @dzsi
    public final View i(Class cls) {
        if (cls.isInstance(this.c)) {
            return this.c;
        }
        return null;
    }

    public final void j() {
        w(this.j, 2);
    }

    public final void k() {
        w(this.j, 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void l() {
        w(null, 4);
    }

    public final <T> T m(cqis<T> cqisVar) {
        Map<cqis<?>, Object> map = this.a;
        if (map != null) {
            return (T) map.get(cqisVar);
        }
        return null;
    }

    public final <T> void n(cqis<T> cqisVar, @dzsi T t) {
        if (t != null) {
            if (this.a == null) {
                this.a = new HashMap();
            }
            this.a.put(cqisVar, t);
            return;
        }
        Map<cqis<?>, Object> map = this.a;
        if (map == null) {
            return;
        }
        map.remove(cqisVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void p(@dzsi V v) {
        V v2 = this.j;
        this.j = v;
        if (v != v2) {
            c(v2, v);
        }
    }

    public final void w(@dzsi V v, int i) {
        p(v);
        d(v);
        x(v, i);
    }

    public final void x(V v, int i) {
        if (cqjh.a && Thread.currentThread() != Looper.getMainLooper().getThread()) {
            String valueOf = String.valueOf(Thread.currentThread());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 76);
            sb.append("Curvular bindings need to be done from the UI Thread. The current thread is ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        } else if (!z(this.c, i)) {
        } else {
            y(this.c, v, i);
            cqid d = this.g.d();
            View view = this.c;
            V v2 = this.j;
            cqkv k = this.g.k();
            boolean z = false;
            if (this.j == null) {
                d.a(this.d, k, i);
                this.h = 0;
                return;
            }
            if (i != 4) {
                z = true;
            }
            dbsk.l(z);
            int i2 = view.getContext().getResources().getConfiguration().orientation;
            if (i2 != this.h) {
                this.h = i2;
                i = 1;
            }
            cqid.b(this.d, k, v2, i);
        }
    }
}
