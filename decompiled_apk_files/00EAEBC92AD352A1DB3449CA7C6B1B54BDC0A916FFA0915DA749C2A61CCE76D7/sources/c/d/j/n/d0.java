package c.d.j.n;

import android.util.Pair;
import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
/* loaded from: classes.dex */
public abstract class d0<K, T extends Closeable> implements j0<T> {

    /* renamed from: a  reason: collision with root package name */
    final Map<K, d0<K, T>.b> f3410a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final j0<T> f3411b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        private final K f3412a;

        /* renamed from: b  reason: collision with root package name */
        private final CopyOnWriteArraySet<Pair<k<T>, k0>> f3413b = c.d.d.d.k.a();

        /* renamed from: c  reason: collision with root package name */
        private T f3414c;

        /* renamed from: d  reason: collision with root package name */
        private float f3415d;

        /* renamed from: e  reason: collision with root package name */
        private int f3416e;

        /* renamed from: f  reason: collision with root package name */
        private d f3417f;

        /* renamed from: g  reason: collision with root package name */
        private d0<K, T>.b.C0088b f3418g;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class a extends e {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Pair f3420a;

            a(Pair pair) {
                this.f3420a = pair;
            }

            @Override // c.d.j.n.l0
            public void a() {
                boolean remove;
                List list;
                d dVar;
                List list2;
                List list3;
                synchronized (b.this) {
                    remove = b.this.f3413b.remove(this.f3420a);
                    list = null;
                    if (!remove) {
                        dVar = null;
                        list2 = null;
                    } else if (b.this.f3413b.isEmpty()) {
                        dVar = b.this.f3417f;
                        list2 = null;
                    } else {
                        List f2 = b.this.f();
                        list2 = b.this.g();
                        list3 = b.this.e();
                        dVar = null;
                        list = f2;
                    }
                    list3 = list2;
                }
                d.c(list);
                d.d(list2);
                d.b(list3);
                if (dVar != null) {
                    dVar.i();
                }
                if (remove) {
                    ((k) this.f3420a.first).a();
                }
            }

            @Override // c.d.j.n.e, c.d.j.n.l0
            public void b() {
                d.b(b.this.e());
            }

            @Override // c.d.j.n.e, c.d.j.n.l0
            public void c() {
                d.d(b.this.g());
            }

            @Override // c.d.j.n.e, c.d.j.n.l0
            public void d() {
                d.c(b.this.f());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c.d.j.n.d0$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0088b extends c.d.j.n.b<T> {
            private C0088b() {
            }

            protected void a(T t, int i) {
                try {
                    if (c.d.j.p.b.c()) {
                        c.d.j.p.b.a("MultiplexProducer#onNewResult");
                    }
                    b.this.a(this, t, i);
                } finally {
                    if (c.d.j.p.b.c()) {
                        c.d.j.p.b.a();
                    }
                }
            }

            @Override // c.d.j.n.b
            protected void b() {
                try {
                    if (c.d.j.p.b.c()) {
                        c.d.j.p.b.a("MultiplexProducer#onCancellation");
                    }
                    b.this.a(this);
                } finally {
                    if (c.d.j.p.b.c()) {
                        c.d.j.p.b.a();
                    }
                }
            }

            @Override // c.d.j.n.b
            protected void b(float f2) {
                try {
                    if (c.d.j.p.b.c()) {
                        c.d.j.p.b.a("MultiplexProducer#onProgressUpdate");
                    }
                    b.this.a(this, f2);
                } finally {
                    if (c.d.j.p.b.c()) {
                        c.d.j.p.b.a();
                    }
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // c.d.j.n.b
            protected /* bridge */ /* synthetic */ void b(Object obj, int i) {
                a((C0088b) ((Closeable) obj), i);
            }

            @Override // c.d.j.n.b
            protected void b(Throwable th) {
                try {
                    if (c.d.j.p.b.c()) {
                        c.d.j.p.b.a("MultiplexProducer#onFailure");
                    }
                    b.this.a(this, th);
                } finally {
                    if (c.d.j.p.b.c()) {
                        c.d.j.p.b.a();
                    }
                }
            }
        }

        public b(K k) {
            this.f3412a = k;
        }

        private void a(Pair<k<T>, k0> pair, k0 k0Var) {
            k0Var.a(new a(pair));
        }

        private void a(Closeable closeable) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            }
        }

        private synchronized boolean a() {
            boolean z;
            Iterator<Pair<k<T>, k0>> it = this.f3413b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                } else if (((k0) it.next().second).g()) {
                    z = true;
                    break;
                }
            }
            return z;
        }

        private synchronized boolean b() {
            boolean z;
            Iterator<Pair<k<T>, k0>> it = this.f3413b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = true;
                    break;
                } else if (!((k0) it.next().second).d()) {
                    z = false;
                    break;
                }
            }
            return z;
        }

        private synchronized c.d.j.e.d c() {
            c.d.j.e.d dVar;
            dVar = c.d.j.e.d.LOW;
            Iterator<Pair<k<T>, k0>> it = this.f3413b.iterator();
            while (it.hasNext()) {
                dVar = c.d.j.e.d.a(dVar, ((k0) it.next().second).c());
            }
            return dVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d() {
            synchronized (this) {
                boolean z = true;
                c.d.d.d.i.a(this.f3417f == null);
                if (this.f3418g != null) {
                    z = false;
                }
                c.d.d.d.i.a(z);
                if (this.f3413b.isEmpty()) {
                    d0.this.a((d0) this.f3412a, (d0<d0, T>.b) this);
                    return;
                }
                k0 k0Var = (k0) this.f3413b.iterator().next().second;
                this.f3417f = new d(k0Var.f(), k0Var.a(), k0Var.e(), k0Var.b(), k0Var.h(), b(), a(), c());
                this.f3418g = new C0088b();
                d0.this.f3411b.a(this.f3418g, this.f3417f);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized List<l0> e() {
            if (this.f3417f == null) {
                return null;
            }
            return this.f3417f.a(a());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized List<l0> f() {
            if (this.f3417f == null) {
                return null;
            }
            return this.f3417f.b(b());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized List<l0> g() {
            if (this.f3417f == null) {
                return null;
            }
            return this.f3417f.a(c());
        }

        public void a(d0<K, T>.b.C0088b c0088b) {
            synchronized (this) {
                if (this.f3418g != c0088b) {
                    return;
                }
                this.f3418g = null;
                this.f3417f = null;
                a(this.f3414c);
                this.f3414c = null;
                d();
            }
        }

        public void a(d0<K, T>.b.C0088b c0088b, float f2) {
            synchronized (this) {
                if (this.f3418g != c0088b) {
                    return;
                }
                this.f3415d = f2;
                Iterator<Pair<k<T>, k0>> it = this.f3413b.iterator();
                while (it.hasNext()) {
                    Pair<k<T>, k0> next = it.next();
                    synchronized (next) {
                        ((k) next.first).a(f2);
                    }
                }
            }
        }

        public void a(d0<K, T>.b.C0088b c0088b, T t, int i) {
            synchronized (this) {
                if (this.f3418g != c0088b) {
                    return;
                }
                a(this.f3414c);
                this.f3414c = null;
                Iterator<Pair<k<T>, k0>> it = this.f3413b.iterator();
                if (c.d.j.n.b.b(i)) {
                    this.f3414c = (T) d0.this.a((d0) t);
                    this.f3416e = i;
                } else {
                    this.f3413b.clear();
                    d0.this.a((d0) this.f3412a, (d0<d0, T>.b) this);
                }
                while (it.hasNext()) {
                    Pair<k<T>, k0> next = it.next();
                    synchronized (next) {
                        ((k) next.first).a(t, i);
                    }
                }
            }
        }

        public void a(d0<K, T>.b.C0088b c0088b, Throwable th) {
            synchronized (this) {
                if (this.f3418g != c0088b) {
                    return;
                }
                Iterator<Pair<k<T>, k0>> it = this.f3413b.iterator();
                this.f3413b.clear();
                d0.this.a((d0) this.f3412a, (d0<d0, T>.b) this);
                a(this.f3414c);
                this.f3414c = null;
                while (it.hasNext()) {
                    Pair<k<T>, k0> next = it.next();
                    synchronized (next) {
                        ((k) next.first).a(th);
                    }
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public boolean a(k<T> kVar, k0 k0Var) {
            Pair<k<T>, k0> create = Pair.create(kVar, k0Var);
            synchronized (this) {
                if (d0.this.b(this.f3412a) != this) {
                    return false;
                }
                this.f3413b.add(create);
                List<l0> f2 = f();
                List<l0> g2 = g();
                List<l0> e2 = e();
                Closeable closeable = this.f3414c;
                float f3 = this.f3415d;
                int i = this.f3416e;
                d.c(f2);
                d.d(g2);
                d.b(e2);
                synchronized (create) {
                    synchronized (this) {
                        if (closeable != this.f3414c) {
                            closeable = null;
                        } else if (closeable != null) {
                            closeable = d0.this.a((d0) closeable);
                        }
                    }
                    if (closeable != null) {
                        if (f3 > 0.0f) {
                            kVar.a(f3);
                        }
                        kVar.a(closeable, i);
                        a(closeable);
                    }
                }
                a(create, k0Var);
                return true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public d0(j0<T> j0Var) {
        this.f3411b = j0Var;
    }

    private synchronized d0<K, T>.b a(K k) {
        d0<K, T>.b bVar;
        bVar = new b(k);
        this.f3410a.put(k, bVar);
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(K k, d0<K, T>.b bVar) {
        if (this.f3410a.get(k) == bVar) {
            this.f3410a.remove(k);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized d0<K, T>.b b(K k) {
        return this.f3410a.get(k);
    }

    protected abstract T a(T t);

    /* renamed from: a */
    protected abstract K mo143a(k0 k0Var);

    @Override // c.d.j.n.j0
    public void a(k<T> kVar, k0 k0Var) {
        boolean z;
        d0<K, T>.b b2;
        try {
            if (c.d.j.p.b.c()) {
                c.d.j.p.b.a("MultiplexProducer#produceResults");
            }
            K mo143a = mo143a(k0Var);
            do {
                z = false;
                synchronized (this) {
                    b2 = b(mo143a);
                    if (b2 == null) {
                        b2 = a((d0<K, T>) mo143a);
                        z = true;
                    }
                }
            } while (!b2.a(kVar, k0Var));
            if (z) {
                b2.d();
            }
        } finally {
            if (c.d.j.p.b.c()) {
                c.d.j.p.b.a();
            }
        }
    }
}
