package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView;
import java.util.List;
/* compiled from: PG */
/* renamed from: cqhw  reason: default package */
/* loaded from: classes.dex */
public class cqhw {
    public final dcha<cqiw<?>, cqkf<?>> a = dbyv.N();
    public final cqhv b = new cqhv();
    public final Object c = new Object();

    private final void a(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        while (true) {
            childCount--;
            if (childCount >= 0) {
                h(viewGroup.getChildAt(childCount));
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @dzsi
    public <V extends cqkp> cqkf<V> d(cqiw<V> cqiwVar) {
        List<cqkf<?>> c;
        synchronized (this.c) {
            c = this.a.c(cqiwVar);
        }
        synchronized (c) {
            if (c.isEmpty()) {
                return null;
            }
            return (cqkf<V>) c.remove(c.size() - 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int e() {
        int i;
        synchronized (this.c) {
            dcha<cqiw<?>, cqkf<?>> dchaVar = this.a;
            i = ((dbye) dchaVar).b;
            dchaVar.p();
        }
        return i;
    }

    public final <T extends cqkp> cqmj<T> f(cqiw<T> cqiwVar) {
        cqmj<T> a;
        synchronized (this.c) {
            a = this.b.a(cqiwVar);
        }
        if (a == null) {
            a = cqiwVar.a();
        }
        synchronized (this.c) {
            cqmj<T> a2 = this.b.a(cqiwVar);
            if (a2 == null) {
                this.b.a.put(cqiwVar, a);
            } else {
                a = a2;
            }
        }
        return a;
    }

    public final void g(cqkf<?> cqkfVar) {
        cqjz<?> a = cqkfVar.a();
        View view = a.c;
        if (!a.i) {
            cqiw<?> cqiwVar = a.f;
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
            a.l();
            view.setPressed(false);
            synchronized (this.c) {
                if (this.b.a.containsKey(cqiwVar)) {
                    List<cqkf<?>> c = this.a.c(cqiwVar);
                    synchronized (c) {
                        if (c.size() < cqiwVar.NO()) {
                            c.add(cqkfVar);
                            return;
                        }
                    }
                }
            }
        }
        View c2 = cqkfVar.c();
        if ((c2 instanceof ViewGroup) && !(c2 instanceof AdapterView) && cqjz.g(c2) == null) {
            a((ViewGroup) c2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h(View view) {
        cqkf<?> a = cqke.a(view);
        if (a != null) {
            g(a);
        } else if (!(view instanceof ViewGroup)) {
        } else {
            a((ViewGroup) view);
        }
    }
}
