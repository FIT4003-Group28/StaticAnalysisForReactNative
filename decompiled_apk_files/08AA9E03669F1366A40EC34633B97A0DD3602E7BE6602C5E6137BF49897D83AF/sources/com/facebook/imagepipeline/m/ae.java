package com.facebook.imagepipeline.m;

import android.util.Pair;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
/* compiled from: MultiplexProducer.java */
/* loaded from: classes.dex */
public abstract class ae<K, T extends Closeable> implements aj<T> {

    /* renamed from: a  reason: collision with root package name */
    final Map<K, ae<K, T>.a> f2751a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final aj<T> f2752b;

    protected abstract T a(T t);

    protected abstract K b(ak akVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public ae(aj<T> ajVar) {
        this.f2752b = ajVar;
    }

    @Override // com.facebook.imagepipeline.m.aj
    public void a(j<T> jVar, ak akVar) {
        boolean z;
        ae<K, T>.a a2;
        K b2 = b(akVar);
        do {
            z = false;
            synchronized (this) {
                a2 = a((ae<K, T>) b2);
                if (a2 == null) {
                    a2 = b((ae<K, T>) b2);
                    z = true;
                }
            }
        } while (!a2.a(jVar, akVar));
        if (z) {
            a2.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized ae<K, T>.a a(K k) {
        return this.f2751a.get(k);
    }

    private synchronized ae<K, T>.a b(K k) {
        ae<K, T>.a aVar;
        aVar = new a(k);
        this.f2751a.put(k, aVar);
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(K k, ae<K, T>.a aVar) {
        if (this.f2751a.get(k) == aVar) {
            this.f2751a.remove(k);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MultiplexProducer.java */
    /* loaded from: classes.dex */
    public class a {

        /* renamed from: b  reason: collision with root package name */
        private final K f2754b;

        /* renamed from: c  reason: collision with root package name */
        private final CopyOnWriteArraySet<Pair<j<T>, ak>> f2755c = com.facebook.common.d.j.b();

        /* renamed from: d  reason: collision with root package name */
        private T f2756d;
        private float e;
        private d f;
        private ae<K, T>.a.C0060a g;

        public a(K k) {
            this.f2754b = k;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public boolean a(j<T> jVar, ak akVar) {
            Pair<j<T>, ak> create = Pair.create(jVar, akVar);
            synchronized (this) {
                if (ae.this.a((ae) this.f2754b) != this) {
                    return false;
                }
                this.f2755c.add(create);
                List<al> b2 = b();
                List<al> f = f();
                List<al> d2 = d();
                Closeable closeable = this.f2756d;
                float f2 = this.e;
                d.b(b2);
                d.d(f);
                d.c(d2);
                synchronized (create) {
                    synchronized (this) {
                        if (closeable != this.f2756d) {
                            closeable = null;
                        } else if (closeable != null) {
                            closeable = ae.this.a((ae) closeable);
                        }
                    }
                    if (closeable != null) {
                        if (f2 > BitmapDescriptorFactory.HUE_RED) {
                            jVar.b(f2);
                        }
                        jVar.b(closeable, false);
                        a(closeable);
                    }
                }
                a(create, akVar);
                return true;
            }
        }

        private void a(final Pair<j<T>, ak> pair, ak akVar) {
            akVar.a(new e() { // from class: com.facebook.imagepipeline.m.ae.a.1
                @Override // com.facebook.imagepipeline.m.e, com.facebook.imagepipeline.m.al
                public void a() {
                    boolean remove;
                    List list;
                    d dVar;
                    List list2;
                    List list3;
                    synchronized (a.this) {
                        remove = a.this.f2755c.remove(pair);
                        list = null;
                        if (!remove) {
                            dVar = null;
                            list2 = null;
                        } else if (a.this.f2755c.isEmpty()) {
                            dVar = a.this.f;
                            list2 = null;
                        } else {
                            List b2 = a.this.b();
                            list2 = a.this.f();
                            list3 = a.this.d();
                            dVar = null;
                            list = b2;
                        }
                        list3 = list2;
                    }
                    d.b(list);
                    d.d(list2);
                    d.c(list3);
                    if (dVar != null) {
                        dVar.i();
                    }
                    if (remove) {
                        ((j) pair.first).b();
                    }
                }

                @Override // com.facebook.imagepipeline.m.e, com.facebook.imagepipeline.m.al
                public void b() {
                    d.b(a.this.b());
                }

                @Override // com.facebook.imagepipeline.m.e, com.facebook.imagepipeline.m.al
                public void c() {
                    d.c(a.this.d());
                }

                @Override // com.facebook.imagepipeline.m.e, com.facebook.imagepipeline.m.al
                public void d() {
                    d.d(a.this.f());
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a() {
            synchronized (this) {
                boolean z = false;
                com.facebook.common.d.i.a(this.f == null);
                if (this.g == null) {
                    z = true;
                }
                com.facebook.common.d.i.a(z);
                if (this.f2755c.isEmpty()) {
                    ae.this.a((ae) this.f2754b, (ae<ae, T>.a) this);
                    return;
                }
                ak akVar = (ak) this.f2755c.iterator().next().second;
                this.f = new d(akVar.a(), akVar.b(), akVar.c(), akVar.d(), akVar.e(), c(), e(), g());
                this.g = new C0060a();
                ae.this.f2752b.a(this.g, this.f);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized List<al> b() {
            if (this.f == null) {
                return null;
            }
            return this.f.a(c());
        }

        private synchronized boolean c() {
            Iterator<Pair<j<T>, ak>> it = this.f2755c.iterator();
            while (it.hasNext()) {
                if (!((ak) it.next().second).f()) {
                    return false;
                }
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized List<al> d() {
            if (this.f == null) {
                return null;
            }
            return this.f.b(e());
        }

        private synchronized boolean e() {
            Iterator<Pair<j<T>, ak>> it = this.f2755c.iterator();
            while (it.hasNext()) {
                if (((ak) it.next().second).h()) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized List<al> f() {
            if (this.f == null) {
                return null;
            }
            return this.f.a(g());
        }

        private synchronized com.facebook.imagepipeline.e.c g() {
            com.facebook.imagepipeline.e.c cVar;
            cVar = com.facebook.imagepipeline.e.c.LOW;
            Iterator<Pair<j<T>, ak>> it = this.f2755c.iterator();
            while (it.hasNext()) {
                cVar = com.facebook.imagepipeline.e.c.a(cVar, ((ak) it.next().second).g());
            }
            return cVar;
        }

        public void a(ae<K, T>.a.C0060a c0060a, Throwable th) {
            synchronized (this) {
                if (this.g != c0060a) {
                    return;
                }
                Iterator<Pair<j<T>, ak>> it = this.f2755c.iterator();
                this.f2755c.clear();
                ae.this.a((ae) this.f2754b, (ae<ae, T>.a) this);
                a(this.f2756d);
                this.f2756d = null;
                while (it.hasNext()) {
                    Pair<j<T>, ak> next = it.next();
                    synchronized (next) {
                        ((j) next.first).b(th);
                    }
                }
            }
        }

        public void a(ae<K, T>.a.C0060a c0060a, T t, boolean z) {
            synchronized (this) {
                if (this.g != c0060a) {
                    return;
                }
                a(this.f2756d);
                this.f2756d = null;
                Iterator<Pair<j<T>, ak>> it = this.f2755c.iterator();
                if (!z) {
                    this.f2756d = (T) ae.this.a((ae) t);
                } else {
                    this.f2755c.clear();
                    ae.this.a((ae) this.f2754b, (ae<ae, T>.a) this);
                }
                while (it.hasNext()) {
                    Pair<j<T>, ak> next = it.next();
                    synchronized (next) {
                        ((j) next.first).b(t, z);
                    }
                }
            }
        }

        public void a(ae<K, T>.a.C0060a c0060a) {
            synchronized (this) {
                if (this.g != c0060a) {
                    return;
                }
                this.g = null;
                this.f = null;
                a(this.f2756d);
                this.f2756d = null;
                a();
            }
        }

        public void a(ae<K, T>.a.C0060a c0060a, float f) {
            synchronized (this) {
                if (this.g != c0060a) {
                    return;
                }
                this.e = f;
                Iterator<Pair<j<T>, ak>> it = this.f2755c.iterator();
                while (it.hasNext()) {
                    Pair<j<T>, ak> next = it.next();
                    synchronized (next) {
                        ((j) next.first).b(f);
                    }
                }
            }
        }

        private void a(Closeable closeable) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: MultiplexProducer.java */
        /* renamed from: com.facebook.imagepipeline.m.ae$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0060a extends b<T> {
            private C0060a() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.facebook.imagepipeline.m.b
            protected /* bridge */ /* synthetic */ void a(Object obj, boolean z) {
                a((C0060a) ((Closeable) obj), z);
            }

            protected void a(T t, boolean z) {
                a.this.a(this, t, z);
            }

            @Override // com.facebook.imagepipeline.m.b
            protected void a(Throwable th) {
                a.this.a(this, th);
            }

            @Override // com.facebook.imagepipeline.m.b
            protected void a() {
                a.this.a(this);
            }

            @Override // com.facebook.imagepipeline.m.b
            protected void a(float f) {
                a.this.a(this, f);
            }
        }
    }
}
