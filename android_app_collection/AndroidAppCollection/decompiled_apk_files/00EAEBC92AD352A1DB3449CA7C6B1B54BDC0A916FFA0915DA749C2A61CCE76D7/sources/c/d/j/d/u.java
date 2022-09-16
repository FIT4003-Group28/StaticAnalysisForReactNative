package c.d.j.d;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class u {

    /* renamed from: b  reason: collision with root package name */
    private static final Class<?> f3241b = u.class;

    /* renamed from: a  reason: collision with root package name */
    private Map<c.d.b.a.d, c.d.j.k.d> f3242a = new HashMap();

    private u() {
    }

    public static u b() {
        return new u();
    }

    private synchronized void c() {
        c.d.d.e.a.b(f3241b, "Count = %d", Integer.valueOf(this.f3242a.size()));
    }

    public void a() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.f3242a.values());
            this.f3242a.clear();
        }
        for (int i = 0; i < arrayList.size(); i++) {
            c.d.j.k.d dVar = (c.d.j.k.d) arrayList.get(i);
            if (dVar != null) {
                dVar.close();
            }
        }
    }

    public synchronized void a(c.d.b.a.d dVar, c.d.j.k.d dVar2) {
        c.d.d.d.i.a(dVar);
        c.d.d.d.i.a(c.d.j.k.d.e(dVar2));
        c.d.j.k.d.c(this.f3242a.put(dVar, c.d.j.k.d.b(dVar2)));
        c();
    }

    public synchronized boolean a(c.d.b.a.d dVar) {
        c.d.d.d.i.a(dVar);
        if (!this.f3242a.containsKey(dVar)) {
            return false;
        }
        c.d.j.k.d dVar2 = this.f3242a.get(dVar);
        synchronized (dVar2) {
            if (c.d.j.k.d.e(dVar2)) {
                return true;
            }
            this.f3242a.remove(dVar);
            c.d.d.e.a.c(f3241b, "Found closed reference %d for key %s (%d)", Integer.valueOf(System.identityHashCode(dVar2)), dVar.a(), Integer.valueOf(System.identityHashCode(dVar)));
            return false;
        }
    }

    public synchronized c.d.j.k.d b(c.d.b.a.d dVar) {
        c.d.j.k.d dVar2;
        c.d.d.d.i.a(dVar);
        c.d.j.k.d dVar3 = this.f3242a.get(dVar);
        if (dVar3 != null) {
            synchronized (dVar3) {
                if (!c.d.j.k.d.e(dVar3)) {
                    this.f3242a.remove(dVar);
                    c.d.d.e.a.c(f3241b, "Found closed reference %d for key %s (%d)", Integer.valueOf(System.identityHashCode(dVar3)), dVar.a(), Integer.valueOf(System.identityHashCode(dVar)));
                    return null;
                }
                dVar2 = c.d.j.k.d.b(dVar3);
            }
        } else {
            dVar2 = dVar3;
        }
        return dVar2;
    }

    public synchronized boolean b(c.d.b.a.d dVar, c.d.j.k.d dVar2) {
        c.d.d.d.i.a(dVar);
        c.d.d.d.i.a(dVar2);
        c.d.d.d.i.a(c.d.j.k.d.e(dVar2));
        c.d.j.k.d dVar3 = this.f3242a.get(dVar);
        if (dVar3 == null) {
            return false;
        }
        c.d.d.h.a<c.d.d.g.g> b2 = dVar3.b();
        c.d.d.h.a<c.d.d.g.g> b3 = dVar2.b();
        if (b2 != null && b3 != null && b2.b() == b3.b()) {
            this.f3242a.remove(dVar);
            c.d.d.h.a.b(b3);
            c.d.d.h.a.b(b2);
            c.d.j.k.d.c(dVar3);
            c();
            return true;
        }
        c.d.d.h.a.b(b3);
        c.d.d.h.a.b(b2);
        c.d.j.k.d.c(dVar3);
        return false;
    }

    public boolean c(c.d.b.a.d dVar) {
        c.d.j.k.d remove;
        c.d.d.d.i.a(dVar);
        synchronized (this) {
            remove = this.f3242a.remove(dVar);
        }
        if (remove == null) {
            return false;
        }
        try {
            return remove.B();
        } finally {
            remove.close();
        }
    }
}
