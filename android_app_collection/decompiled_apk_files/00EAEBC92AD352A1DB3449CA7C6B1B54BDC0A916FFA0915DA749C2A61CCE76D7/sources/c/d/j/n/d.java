package c.d.j.n;

import c.d.j.o.c;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class d implements k0 {

    /* renamed from: a  reason: collision with root package name */
    private final c.d.j.o.c f3402a;

    /* renamed from: b  reason: collision with root package name */
    private final String f3403b;

    /* renamed from: c  reason: collision with root package name */
    private final m0 f3404c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f3405d;

    /* renamed from: e  reason: collision with root package name */
    private final c.b f3406e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f3407f;

    /* renamed from: g  reason: collision with root package name */
    private c.d.j.e.d f3408g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f3409h;
    private boolean i = false;
    private final List<l0> j = new ArrayList();

    public d(c.d.j.o.c cVar, String str, m0 m0Var, Object obj, c.b bVar, boolean z, boolean z2, c.d.j.e.d dVar) {
        this.f3402a = cVar;
        this.f3403b = str;
        this.f3404c = m0Var;
        this.f3405d = obj;
        this.f3406e = bVar;
        this.f3407f = z;
        this.f3408g = dVar;
        this.f3409h = z2;
    }

    public static void a(List<l0> list) {
        if (list == null) {
            return;
        }
        for (l0 l0Var : list) {
            l0Var.a();
        }
    }

    public static void b(List<l0> list) {
        if (list == null) {
            return;
        }
        for (l0 l0Var : list) {
            l0Var.b();
        }
    }

    public static void c(List<l0> list) {
        if (list == null) {
            return;
        }
        for (l0 l0Var : list) {
            l0Var.d();
        }
    }

    public static void d(List<l0> list) {
        if (list == null) {
            return;
        }
        for (l0 l0Var : list) {
            l0Var.c();
        }
    }

    @Override // c.d.j.n.k0
    public String a() {
        return this.f3403b;
    }

    public synchronized List<l0> a(c.d.j.e.d dVar) {
        if (dVar == this.f3408g) {
            return null;
        }
        this.f3408g = dVar;
        return new ArrayList(this.j);
    }

    public synchronized List<l0> a(boolean z) {
        if (z == this.f3409h) {
            return null;
        }
        this.f3409h = z;
        return new ArrayList(this.j);
    }

    @Override // c.d.j.n.k0
    public void a(l0 l0Var) {
        boolean z;
        synchronized (this) {
            this.j.add(l0Var);
            z = this.i;
        }
        if (z) {
            l0Var.a();
        }
    }

    @Override // c.d.j.n.k0
    public Object b() {
        return this.f3405d;
    }

    public synchronized List<l0> b(boolean z) {
        if (z == this.f3407f) {
            return null;
        }
        this.f3407f = z;
        return new ArrayList(this.j);
    }

    @Override // c.d.j.n.k0
    public synchronized c.d.j.e.d c() {
        return this.f3408g;
    }

    @Override // c.d.j.n.k0
    public synchronized boolean d() {
        return this.f3407f;
    }

    @Override // c.d.j.n.k0
    public m0 e() {
        return this.f3404c;
    }

    @Override // c.d.j.n.k0
    public c.d.j.o.c f() {
        return this.f3402a;
    }

    @Override // c.d.j.n.k0
    public synchronized boolean g() {
        return this.f3409h;
    }

    @Override // c.d.j.n.k0
    public c.b h() {
        return this.f3406e;
    }

    public void i() {
        a(j());
    }

    public synchronized List<l0> j() {
        if (this.i) {
            return null;
        }
        this.i = true;
        return new ArrayList(this.j);
    }
}
