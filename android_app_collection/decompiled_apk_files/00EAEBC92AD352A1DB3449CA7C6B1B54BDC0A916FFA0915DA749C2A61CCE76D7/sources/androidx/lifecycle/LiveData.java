package androidx.lifecycle;

import androidx.lifecycle.f;
/* loaded from: classes.dex */
public abstract class LiveData<T> {
    static final Object j = new Object();

    /* renamed from: g  reason: collision with root package name */
    private boolean f1833g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f1834h;

    /* renamed from: a  reason: collision with root package name */
    final Object f1827a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private a.b.a.b.b<o<? super T>, LiveData<T>.b> f1828b = new a.b.a.b.b<>();

    /* renamed from: c  reason: collision with root package name */
    int f1829c = 0;

    /* renamed from: e  reason: collision with root package name */
    volatile Object f1831e = j;
    private final Runnable i = new a();

    /* renamed from: d  reason: collision with root package name */
    private volatile Object f1830d = j;

    /* renamed from: f  reason: collision with root package name */
    private int f1832f = -1;

    /* loaded from: classes.dex */
    class LifecycleBoundObserver extends LiveData<T>.b implements g {

        /* renamed from: e  reason: collision with root package name */
        final i f1835e;

        LifecycleBoundObserver(i iVar, o<? super T> oVar) {
            super(oVar);
            this.f1835e = iVar;
        }

        @Override // androidx.lifecycle.LiveData.b
        void a() {
            this.f1835e.a().b(this);
        }

        @Override // androidx.lifecycle.g
        public void a(i iVar, f.a aVar) {
            if (this.f1835e.a().a() == f.b.DESTROYED) {
                LiveData.this.a((o) this.f1838a);
            } else {
                a(b());
            }
        }

        @Override // androidx.lifecycle.LiveData.b
        boolean a(i iVar) {
            return this.f1835e == iVar;
        }

        @Override // androidx.lifecycle.LiveData.b
        boolean b() {
            return this.f1835e.a().a().a(f.b.STARTED);
        }
    }

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (LiveData.this.f1827a) {
                obj = LiveData.this.f1831e;
                LiveData.this.f1831e = LiveData.j;
            }
            LiveData.this.b((LiveData) obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public abstract class b {

        /* renamed from: a  reason: collision with root package name */
        final o<? super T> f1838a;

        /* renamed from: b  reason: collision with root package name */
        boolean f1839b;

        /* renamed from: c  reason: collision with root package name */
        int f1840c = -1;

        b(o<? super T> oVar) {
            this.f1838a = oVar;
        }

        void a() {
        }

        void a(boolean z) {
            if (z == this.f1839b) {
                return;
            }
            this.f1839b = z;
            int i = 1;
            boolean z2 = LiveData.this.f1829c == 0;
            LiveData liveData = LiveData.this;
            int i2 = liveData.f1829c;
            if (!this.f1839b) {
                i = -1;
            }
            liveData.f1829c = i2 + i;
            if (z2 && this.f1839b) {
                LiveData.this.c();
            }
            LiveData liveData2 = LiveData.this;
            if (liveData2.f1829c == 0 && !this.f1839b) {
                liveData2.d();
            }
            if (!this.f1839b) {
                return;
            }
            LiveData.this.a(this);
        }

        boolean a(i iVar) {
            return false;
        }

        abstract boolean b();
    }

    static void a(String str) {
        if (a.b.a.a.a.b().a()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    private void b(LiveData<T>.b bVar) {
        if (!bVar.f1839b) {
            return;
        }
        if (!bVar.b()) {
            bVar.a(false);
            return;
        }
        int i = bVar.f1840c;
        int i2 = this.f1832f;
        if (i >= i2) {
            return;
        }
        bVar.f1840c = i2;
        bVar.f1838a.a((Object) this.f1830d);
    }

    public T a() {
        T t = (T) this.f1830d;
        if (t != j) {
            return t;
        }
        return null;
    }

    void a(LiveData<T>.b bVar) {
        if (this.f1833g) {
            this.f1834h = true;
            return;
        }
        this.f1833g = true;
        do {
            this.f1834h = false;
            if (bVar == null) {
                a.b.a.b.b<o<? super T>, LiveData<T>.b>.d c2 = this.f1828b.c();
                while (c2.hasNext()) {
                    b((b) ((b) c2.next().getValue()));
                    if (this.f1834h) {
                        break;
                    }
                }
            } else {
                b((b) bVar);
                bVar = null;
            }
        } while (this.f1834h);
        this.f1833g = false;
    }

    public void a(i iVar, o<? super T> oVar) {
        a("observe");
        if (iVar.a().a() == f.b.DESTROYED) {
            return;
        }
        LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(iVar, oVar);
        LiveData<T>.b b2 = this.f1828b.b(oVar, lifecycleBoundObserver);
        if (b2 != null && !b2.a(iVar)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (b2 != null) {
            return;
        }
        iVar.a().a(lifecycleBoundObserver);
    }

    public void a(o<? super T> oVar) {
        a("removeObserver");
        LiveData<T>.b remove = this.f1828b.remove(oVar);
        if (remove == null) {
            return;
        }
        remove.a();
        remove.a(false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(T t) {
        boolean z;
        synchronized (this.f1827a) {
            z = this.f1831e == j;
            this.f1831e = t;
        }
        if (!z) {
            return;
        }
        a.b.a.a.a.b().b(this.i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(T t) {
        a("setValue");
        this.f1832f++;
        this.f1830d = t;
        a((b) null);
    }

    public boolean b() {
        return this.f1829c > 0;
    }

    protected void c() {
    }

    protected void d() {
    }
}
