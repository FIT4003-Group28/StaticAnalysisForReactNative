package android.arch.lifecycle;

import android.arch.lifecycle.c;
/* loaded from: classes.dex */
public abstract class LiveData<T> {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f68a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private android.arch.a.b.b<k<T>, LiveData<T>.a> f69b;

    /* renamed from: c  reason: collision with root package name */
    private int f70c;

    /* renamed from: d  reason: collision with root package name */
    private volatile Object f71d;
    private int e;
    private boolean f;
    private boolean g;

    protected void b() {
    }

    protected void c() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void a(LiveData<T>.a aVar) {
        if (!aVar.f75d) {
            return;
        }
        if (!aVar.a()) {
            aVar.a(false);
        } else if (aVar.e >= this.e) {
        } else {
            aVar.e = this.e;
            aVar.f74c.a(this.f71d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(LiveData<T>.a aVar) {
        if (this.f) {
            this.g = true;
            return;
        }
        this.f = true;
        do {
            this.g = false;
            if (aVar != null) {
                a(aVar);
                aVar = null;
            } else {
                android.arch.a.b.b<k<T>, LiveData<T>.a>.d c2 = this.f69b.c();
                while (c2.hasNext()) {
                    a((a) c2.next().getValue());
                    if (this.g) {
                        break;
                    }
                }
            }
        } while (this.g);
        this.f = false;
    }

    public void a(e eVar, k<T> kVar) {
        if (eVar.getLifecycle().a() == c.b.DESTROYED) {
            return;
        }
        LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(eVar, kVar);
        LiveData<T>.a a2 = this.f69b.a(kVar, lifecycleBoundObserver);
        if (a2 != null && !a2.a(eVar)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (a2 != null) {
            return;
        }
        eVar.getLifecycle().a(lifecycleBoundObserver);
    }

    public void a(k<T> kVar) {
        a("removeObserver");
        LiveData<T>.a b2 = this.f69b.b(kVar);
        if (b2 == null) {
            return;
        }
        b2.b();
        b2.a(false);
    }

    public T a() {
        T t = (T) this.f71d;
        if (t != f68a) {
            return t;
        }
        return null;
    }

    public boolean d() {
        return this.f70c > 0;
    }

    /* loaded from: classes.dex */
    class LifecycleBoundObserver extends LiveData<T>.a implements GenericLifecycleObserver {

        /* renamed from: a  reason: collision with root package name */
        final e f72a;

        LifecycleBoundObserver(e eVar, k<T> kVar) {
            super(kVar);
            this.f72a = eVar;
        }

        @Override // android.arch.lifecycle.LiveData.a
        boolean a() {
            return this.f72a.getLifecycle().a().a(c.b.STARTED);
        }

        @Override // android.arch.lifecycle.GenericLifecycleObserver
        public void a(e eVar, c.a aVar) {
            if (this.f72a.getLifecycle().a() == c.b.DESTROYED) {
                LiveData.this.a(this.f74c);
            } else {
                a(a());
            }
        }

        @Override // android.arch.lifecycle.LiveData.a
        boolean a(e eVar) {
            return this.f72a == eVar;
        }

        @Override // android.arch.lifecycle.LiveData.a
        void b() {
            this.f72a.getLifecycle().b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public abstract class a {

        /* renamed from: c  reason: collision with root package name */
        final k<T> f74c;

        /* renamed from: d  reason: collision with root package name */
        boolean f75d;
        int e = -1;

        abstract boolean a();

        boolean a(e eVar) {
            return false;
        }

        void b() {
        }

        a(k<T> kVar) {
            this.f74c = kVar;
        }

        void a(boolean z) {
            if (z == this.f75d) {
                return;
            }
            this.f75d = z;
            int i = 1;
            boolean z2 = LiveData.this.f70c == 0;
            LiveData liveData = LiveData.this;
            int i2 = liveData.f70c;
            if (!this.f75d) {
                i = -1;
            }
            liveData.f70c = i2 + i;
            if (z2 && this.f75d) {
                LiveData.this.b();
            }
            if (LiveData.this.f70c == 0 && !this.f75d) {
                LiveData.this.c();
            }
            if (!this.f75d) {
                return;
            }
            LiveData.this.b(this);
        }
    }

    private static void a(String str) {
        if (!android.arch.a.a.a.a().b()) {
            throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
        }
    }
}
