package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: PG */
/* renamed from: cvzg  reason: default package */
/* loaded from: classes.dex */
public final class cvzg<T> {
    public boolean a;
    public final CopyOnWriteArrayList<cvxj<T>> b = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<cvzf<T>> c = new CopyOnWriteArrayList<>();
    public final Object d = new Object();
    public dcdc<cvui<T>> e = dcdc.e();
    public final Map<String, cvui<T>> f = new HashMap();
    public final List<cvui<T>> g = new ArrayList();

    private final void n() {
        T e = e();
        T f = f();
        T g = g();
        Iterator<cvzf<T>> it = this.c.iterator();
        while (it.hasNext()) {
            it.next().a(e, f, g);
        }
        Iterator<cvxj<T>> it2 = this.b.iterator();
        while (it2.hasNext()) {
            it2.next().a(e);
        }
    }

    private static final boolean o(T t, T t2) {
        String b;
        String b2;
        if (t == t2) {
            return true;
        }
        if (t == null || t2 == null) {
            return false;
        }
        b = ((cwfm) t).b();
        b2 = ((cwfm) t2).b();
        return b.equals(b2);
    }

    public final void a() {
        if (!this.a) {
            this.a = true;
            Iterator<cvzf<T>> it = this.c.iterator();
            while (it.hasNext()) {
                it.next().e();
            }
            Iterator<cvxj<T>> it2 = this.b.iterator();
            while (it2.hasNext()) {
                it2.next().b();
            }
        }
    }

    public final void b(T t) {
        String b;
        cvui<T> cvuiVar;
        String b2;
        dbsk.s(t);
        if (o(e(), t)) {
            return;
        }
        b = ((cwfm) t).b();
        synchronized (this.d) {
            cvuiVar = this.f.get(b);
        }
        dbsk.b(cvuiVar != null, "Selected account must be an available account");
        int i = 0;
        while (true) {
            if (i >= this.g.size()) {
                i = -1;
                break;
            }
            b2 = ((cwfm) this.g.get(i).a()).b();
            if (b2.equals(b)) {
                break;
            }
            i++;
        }
        if (i != -1) {
            List<cvui<T>> list = this.g;
            list.set(i, list.get(0));
            this.g.set(0, cvuiVar);
        } else {
            this.g.add(0, cvuiVar);
            if (this.g.size() > 3) {
                this.g.remove(3);
            }
        }
        n();
    }

    public final int c() {
        int size;
        synchronized (this.d) {
            size = this.e.size();
        }
        return size;
    }

    public final boolean d() {
        return !this.g.isEmpty();
    }

    public final T e() {
        if (d()) {
            return this.g.get(0).a();
        }
        return null;
    }

    public final T f() {
        if (this.g.size() > 1) {
            return this.g.get(1).a();
        }
        return null;
    }

    public final T g() {
        if (this.g.size() > 2) {
            return this.g.get(2).a();
        }
        return null;
    }

    @Deprecated
    public final void h(cvzf<T> cvzfVar) {
        this.c.add(cvzfVar);
    }

    public final void i(cvxj<T> cvxjVar) {
        this.b.add(cvxjVar);
    }

    @Deprecated
    public final void j(cvzf<T> cvzfVar) {
        this.c.remove(cvzfVar);
    }

    public final void k(cvxj<T> cvxjVar) {
        this.b.remove(cvxjVar);
    }

    public final List<T> l() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.d) {
            dcpe<cvui<T>> listIterator = this.e.listIterator();
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next().a());
            }
        }
        return arrayList;
    }

    public final void m() {
        if (!o(null, e()) || !o(null, f()) || !o(null, g())) {
            this.g.clear();
            n();
        }
    }
}
