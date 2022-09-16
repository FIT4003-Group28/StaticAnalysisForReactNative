package android.arch.lifecycle;

import android.arch.lifecycle.c;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
/* compiled from: LifecycleRegistry.java */
/* loaded from: classes.dex */
public class f extends c {

    /* renamed from: c  reason: collision with root package name */
    private final WeakReference<e> f92c;

    /* renamed from: a  reason: collision with root package name */
    private android.arch.a.b.a<d, a> f90a = new android.arch.a.b.a<>();

    /* renamed from: d  reason: collision with root package name */
    private int f93d = 0;
    private boolean e = false;
    private boolean f = false;
    private ArrayList<c.b> g = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private c.b f91b = c.b.INITIALIZED;

    public f(e eVar) {
        this.f92c = new WeakReference<>(eVar);
    }

    public void a(c.b bVar) {
        b(bVar);
    }

    public void a(c.a aVar) {
        b(b(aVar));
    }

    private void b(c.b bVar) {
        if (this.f91b == bVar) {
            return;
        }
        this.f91b = bVar;
        if (this.e || this.f93d != 0) {
            this.f = true;
            return;
        }
        this.e = true;
        d();
        this.e = false;
    }

    private boolean b() {
        if (this.f90a.a() == 0) {
            return true;
        }
        c.b bVar = this.f90a.d().getValue().f96a;
        c.b bVar2 = this.f90a.e().getValue().f96a;
        return bVar == bVar2 && this.f91b == bVar2;
    }

    private c.b c(d dVar) {
        Map.Entry<d, a> d2 = this.f90a.d(dVar);
        c.b bVar = null;
        c.b bVar2 = d2 != null ? d2.getValue().f96a : null;
        if (!this.g.isEmpty()) {
            bVar = this.g.get(this.g.size() - 1);
        }
        return a(a(this.f91b, bVar2), bVar);
    }

    @Override // android.arch.lifecycle.c
    public void a(d dVar) {
        e eVar;
        a aVar = new a(dVar, this.f91b == c.b.DESTROYED ? c.b.DESTROYED : c.b.INITIALIZED);
        if (this.f90a.a(dVar, aVar) == null && (eVar = this.f92c.get()) != null) {
            boolean z = this.f93d != 0 || this.e;
            c.b c2 = c(dVar);
            this.f93d++;
            while (aVar.f96a.compareTo(c2) < 0 && this.f90a.c(dVar)) {
                c(aVar.f96a);
                aVar.a(eVar, e(aVar.f96a));
                c();
                c2 = c(dVar);
            }
            if (!z) {
                d();
            }
            this.f93d--;
        }
    }

    private void c() {
        this.g.remove(this.g.size() - 1);
    }

    private void c(c.b bVar) {
        this.g.add(bVar);
    }

    @Override // android.arch.lifecycle.c
    public void b(d dVar) {
        this.f90a.b(dVar);
    }

    @Override // android.arch.lifecycle.c
    public c.b a() {
        return this.f91b;
    }

    static c.b b(c.a aVar) {
        switch (aVar) {
            case ON_CREATE:
            case ON_STOP:
                return c.b.CREATED;
            case ON_START:
            case ON_PAUSE:
                return c.b.STARTED;
            case ON_RESUME:
                return c.b.RESUMED;
            case ON_DESTROY:
                return c.b.DESTROYED;
            default:
                throw new IllegalArgumentException("Unexpected event value " + aVar);
        }
    }

    private static c.a d(c.b bVar) {
        switch (bVar) {
            case INITIALIZED:
                throw new IllegalArgumentException();
            case CREATED:
                return c.a.ON_DESTROY;
            case STARTED:
                return c.a.ON_STOP;
            case RESUMED:
                return c.a.ON_PAUSE;
            case DESTROYED:
                throw new IllegalArgumentException();
            default:
                throw new IllegalArgumentException("Unexpected state value " + bVar);
        }
    }

    private static c.a e(c.b bVar) {
        switch (bVar) {
            case INITIALIZED:
            case DESTROYED:
                return c.a.ON_CREATE;
            case CREATED:
                return c.a.ON_START;
            case STARTED:
                return c.a.ON_RESUME;
            case RESUMED:
                throw new IllegalArgumentException();
            default:
                throw new IllegalArgumentException("Unexpected state value " + bVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void a(e eVar) {
        android.arch.a.b.b<d, a>.d c2 = this.f90a.c();
        while (c2.hasNext() && !this.f) {
            Map.Entry next = c2.next();
            a aVar = (a) next.getValue();
            while (aVar.f96a.compareTo(this.f91b) < 0 && !this.f && this.f90a.c(next.getKey())) {
                c(aVar.f96a);
                aVar.a(eVar, e(aVar.f96a));
                c();
            }
        }
    }

    private void b(e eVar) {
        Iterator<Map.Entry<d, a>> b2 = this.f90a.b();
        while (b2.hasNext() && !this.f) {
            Map.Entry<d, a> next = b2.next();
            a value = next.getValue();
            while (value.f96a.compareTo(this.f91b) > 0 && !this.f && this.f90a.c(next.getKey())) {
                c.a d2 = d(value.f96a);
                c(b(d2));
                value.a(eVar, d2);
                c();
            }
        }
    }

    private void d() {
        e eVar = this.f92c.get();
        if (eVar == null) {
            Log.w("LifecycleRegistry", "LifecycleOwner is garbage collected, you shouldn't try dispatch new events from it.");
            return;
        }
        while (!b()) {
            this.f = false;
            if (this.f91b.compareTo(this.f90a.d().getValue().f96a) < 0) {
                b(eVar);
            }
            Map.Entry<d, a> e = this.f90a.e();
            if (!this.f && e != null && this.f91b.compareTo(e.getValue().f96a) > 0) {
                a(eVar);
            }
        }
        this.f = false;
    }

    static c.b a(c.b bVar, c.b bVar2) {
        return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LifecycleRegistry.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        c.b f96a;

        /* renamed from: b  reason: collision with root package name */
        GenericLifecycleObserver f97b;

        a(d dVar, c.b bVar) {
            this.f97b = h.a(dVar);
            this.f96a = bVar;
        }

        void a(e eVar, c.a aVar) {
            c.b b2 = f.b(aVar);
            this.f96a = f.a(this.f96a, b2);
            this.f97b.a(eVar, aVar);
            this.f96a = b2;
        }
    }
}
