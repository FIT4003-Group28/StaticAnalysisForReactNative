package android.support.v4.i;
/* compiled from: Pools.java */
/* loaded from: classes.dex */
public final class j {

    /* compiled from: Pools.java */
    /* loaded from: classes.dex */
    public static class a<T> {

        /* renamed from: a  reason: collision with root package name */
        private final Object[] f471a;

        /* renamed from: b  reason: collision with root package name */
        private int f472b;

        public a(int i) {
            if (i <= 0) {
                throw new IllegalArgumentException("The max pool size must be > 0");
            }
            this.f471a = new Object[i];
        }

        public T a() {
            if (this.f472b > 0) {
                int i = this.f472b - 1;
                T t = (T) this.f471a[i];
                this.f471a[i] = null;
                this.f472b--;
                return t;
            }
            return null;
        }

        public boolean a(T t) {
            if (b(t)) {
                throw new IllegalStateException("Already in the pool!");
            }
            if (this.f472b >= this.f471a.length) {
                return false;
            }
            this.f471a[this.f472b] = t;
            this.f472b++;
            return true;
        }

        private boolean b(T t) {
            for (int i = 0; i < this.f472b; i++) {
                if (this.f471a[i] == t) {
                    return true;
                }
            }
            return false;
        }
    }

    /* compiled from: Pools.java */
    /* loaded from: classes.dex */
    public static class b<T> extends a<T> {

        /* renamed from: a  reason: collision with root package name */
        private final Object f473a;

        public b(int i) {
            super(i);
            this.f473a = new Object();
        }

        @Override // android.support.v4.i.j.a
        public T a() {
            T t;
            synchronized (this.f473a) {
                t = (T) super.a();
            }
            return t;
        }

        @Override // android.support.v4.i.j.a
        public boolean a(T t) {
            boolean a2;
            synchronized (this.f473a) {
                a2 = super.a(t);
            }
            return a2;
        }
    }
}
