package androidx.lifecycle;

import androidx.lifecycle.f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes.dex */
public class j extends f {

    /* renamed from: c  reason: collision with root package name */
    private final WeakReference<i> f1864c;

    /* renamed from: a  reason: collision with root package name */
    private a.b.a.b.a<h, b> f1862a = new a.b.a.b.a<>();

    /* renamed from: d  reason: collision with root package name */
    private int f1865d = 0;

    /* renamed from: e  reason: collision with root package name */
    private boolean f1866e = false;

    /* renamed from: f  reason: collision with root package name */
    private boolean f1867f = false;

    /* renamed from: g  reason: collision with root package name */
    private ArrayList<f.b> f1868g = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private f.b f1863b = f.b.INITIALIZED;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f1869a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f1870b = new int[f.b.values().length];

        static {
            try {
                f1870b[f.b.INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1870b[f.b.CREATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1870b[f.b.STARTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1870b[f.b.RESUMED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1870b[f.b.DESTROYED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f1869a = new int[f.a.values().length];
            try {
                f1869a[f.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1869a[f.a.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1869a[f.a.ON_START.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f1869a[f.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f1869a[f.a.ON_RESUME.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f1869a[f.a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f1869a[f.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        f.b f1871a;

        /* renamed from: b  reason: collision with root package name */
        g f1872b;

        b(h hVar, f.b bVar) {
            this.f1872b = l.a(hVar);
            this.f1871a = bVar;
        }

        void a(i iVar, f.a aVar) {
            f.b b2 = j.b(aVar);
            this.f1871a = j.a(this.f1871a, b2);
            this.f1872b.a(iVar, aVar);
            this.f1871a = b2;
        }
    }

    public j(i iVar) {
        this.f1864c = new WeakReference<>(iVar);
    }

    static f.b a(f.b bVar, f.b bVar2) {
        return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
    }

    private void a(i iVar) {
        Iterator<Map.Entry<h, b>> a2 = this.f1862a.a();
        while (a2.hasNext() && !this.f1867f) {
            Map.Entry<h, b> next = a2.next();
            b value = next.getValue();
            while (value.f1871a.compareTo(this.f1863b) > 0 && !this.f1867f && this.f1862a.contains(next.getKey())) {
                f.a c2 = c(value.f1871a);
                e(b(c2));
                value.a(iVar, c2);
                c();
            }
        }
    }

    static f.b b(f.a aVar) {
        switch (a.f1869a[aVar.ordinal()]) {
            case 1:
            case 2:
                return f.b.CREATED;
            case 3:
            case 4:
                return f.b.STARTED;
            case 5:
                return f.b.RESUMED;
            case 6:
                return f.b.DESTROYED;
            default:
                throw new IllegalArgumentException("Unexpected event value " + aVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void b(i iVar) {
        a.b.a.b.b<h, b>.d c2 = this.f1862a.c();
        while (c2.hasNext() && !this.f1867f) {
            Map.Entry next = c2.next();
            b bVar = (b) next.getValue();
            while (bVar.f1871a.compareTo(this.f1863b) < 0 && !this.f1867f && this.f1862a.contains(next.getKey())) {
                e(bVar.f1871a);
                bVar.a(iVar, f(bVar.f1871a));
                c();
            }
        }
    }

    private boolean b() {
        if (this.f1862a.size() == 0) {
            return true;
        }
        f.b bVar = this.f1862a.b().getValue().f1871a;
        f.b bVar2 = this.f1862a.d().getValue().f1871a;
        return bVar == bVar2 && this.f1863b == bVar2;
    }

    private static f.a c(f.b bVar) {
        int i = a.f1870b[bVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return f.a.ON_DESTROY;
            }
            if (i == 3) {
                return f.a.ON_STOP;
            }
            if (i == 4) {
                return f.a.ON_PAUSE;
            }
            if (i == 5) {
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException("Unexpected state value " + bVar);
        }
        throw new IllegalArgumentException();
    }

    private f.b c(h hVar) {
        Map.Entry<h, b> b2 = this.f1862a.b(hVar);
        f.b bVar = null;
        f.b bVar2 = b2 != null ? b2.getValue().f1871a : null;
        if (!this.f1868g.isEmpty()) {
            ArrayList<f.b> arrayList = this.f1868g;
            bVar = arrayList.get(arrayList.size() - 1);
        }
        return a(a(this.f1863b, bVar2), bVar);
    }

    private void c() {
        ArrayList<f.b> arrayList = this.f1868g;
        arrayList.remove(arrayList.size() - 1);
    }

    private void d() {
        i iVar = this.f1864c.get();
        if (iVar != null) {
            while (true) {
                boolean b2 = b();
                this.f1867f = false;
                if (b2) {
                    return;
                }
                if (this.f1863b.compareTo(this.f1862a.b().getValue().f1871a) < 0) {
                    a(iVar);
                }
                Map.Entry<h, b> d2 = this.f1862a.d();
                if (!this.f1867f && d2 != null && this.f1863b.compareTo(d2.getValue().f1871a) > 0) {
                    b(iVar);
                }
            }
        } else {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
        }
    }

    private void d(f.b bVar) {
        if (this.f1863b == bVar) {
            return;
        }
        this.f1863b = bVar;
        if (this.f1866e || this.f1865d != 0) {
            this.f1867f = true;
            return;
        }
        this.f1866e = true;
        d();
        this.f1866e = false;
    }

    private void e(f.b bVar) {
        this.f1868g.add(bVar);
    }

    private static f.a f(f.b bVar) {
        int i = a.f1870b[bVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return f.a.ON_START;
            }
            if (i == 3) {
                return f.a.ON_RESUME;
            }
            if (i == 4) {
                throw new IllegalArgumentException();
            }
            if (i != 5) {
                throw new IllegalArgumentException("Unexpected state value " + bVar);
            }
        }
        return f.a.ON_CREATE;
    }

    @Override // androidx.lifecycle.f
    public f.b a() {
        return this.f1863b;
    }

    public void a(f.a aVar) {
        d(b(aVar));
    }

    @Deprecated
    public void a(f.b bVar) {
        b(bVar);
    }

    @Override // androidx.lifecycle.f
    public void a(h hVar) {
        i iVar;
        f.b bVar = this.f1863b;
        f.b bVar2 = f.b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = f.b.INITIALIZED;
        }
        b bVar3 = new b(hVar, bVar2);
        if (this.f1862a.b(hVar, bVar3) == null && (iVar = this.f1864c.get()) != null) {
            boolean z = this.f1865d != 0 || this.f1866e;
            f.b c2 = c(hVar);
            this.f1865d++;
            while (bVar3.f1871a.compareTo(c2) < 0 && this.f1862a.contains(hVar)) {
                e(bVar3.f1871a);
                bVar3.a(iVar, f(bVar3.f1871a));
                c();
                c2 = c(hVar);
            }
            if (!z) {
                d();
            }
            this.f1865d--;
        }
    }

    public void b(f.b bVar) {
        d(bVar);
    }

    @Override // androidx.lifecycle.f
    public void b(h hVar) {
        this.f1862a.remove(hVar);
    }
}
