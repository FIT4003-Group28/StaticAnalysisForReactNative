package com.facebook.f.c;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import com.facebook.common.d.h;
import com.facebook.common.d.i;
import com.facebook.f.b.a;
import com.facebook.f.b.b;
import com.facebook.f.g.a;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.concurrent.Executor;
/* compiled from: AbstractDraweeController.java */
/* loaded from: classes.dex */
public abstract class a<T, INFO> implements a.InterfaceC0053a, a.InterfaceC0055a, com.facebook.f.h.a {

    /* renamed from: a  reason: collision with root package name */
    private static final Class<?> f2381a = a.class;

    /* renamed from: b  reason: collision with root package name */
    private final com.facebook.f.b.b f2382b = com.facebook.f.b.b.a();

    /* renamed from: c  reason: collision with root package name */
    private final com.facebook.f.b.a f2383c;

    /* renamed from: d  reason: collision with root package name */
    private final Executor f2384d;
    private com.facebook.f.b.c e;
    private com.facebook.f.g.a f;
    private d<INFO> g;
    private e h;
    private com.facebook.f.h.c i;
    private Drawable j;
    private String k;
    private Object l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    private String r;
    private com.facebook.c.c<T> s;
    private T t;
    private Drawable u;

    protected abstract com.facebook.c.c<T> a();

    protected abstract void a(Drawable drawable);

    protected abstract void a(T t);

    protected T c() {
        return null;
    }

    protected abstract INFO c(T t);

    protected abstract Drawable d(T t);

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractDraweeController.java */
    /* renamed from: com.facebook.f.c.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0054a<INFO> extends f<INFO> {
        private C0054a() {
        }

        public static <INFO> C0054a<INFO> a(d<? super INFO> dVar, d<? super INFO> dVar2) {
            C0054a<INFO> c0054a = new C0054a<>();
            c0054a.a(dVar);
            c0054a.a(dVar2);
            return c0054a;
        }
    }

    public a(com.facebook.f.b.a aVar, Executor executor, String str, Object obj) {
        this.f2383c = aVar;
        this.f2384d = executor;
        a(str, obj, true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(String str, Object obj) {
        a(str, obj, false);
    }

    private void a(String str, Object obj, boolean z) {
        this.f2382b.a(b.a.ON_INIT_CONTROLLER);
        if (!z && this.f2383c != null) {
            this.f2383c.b(this);
        }
        this.m = false;
        this.o = false;
        b();
        this.q = false;
        if (this.e != null) {
            this.e.a();
        }
        if (this.f != null) {
            this.f.a();
            this.f.a(this);
        }
        if (this.g instanceof C0054a) {
            ((C0054a) this.g).a();
        } else {
            this.g = null;
        }
        this.h = null;
        if (this.i != null) {
            this.i.b();
            this.i.a((Drawable) null);
            this.i = null;
        }
        this.j = null;
        if (com.facebook.common.e.a.a(2)) {
            com.facebook.common.e.a.a(f2381a, "controller %x %s -> %s: initialize", Integer.valueOf(System.identityHashCode(this)), this.k, str);
        }
        this.k = str;
        this.l = obj;
    }

    @Override // com.facebook.f.b.a.InterfaceC0053a
    public void d() {
        this.f2382b.a(b.a.ON_RELEASE_CONTROLLER);
        if (this.e != null) {
            this.e.b();
        }
        if (this.f != null) {
            this.f.b();
        }
        if (this.i != null) {
            this.i.b();
        }
        b();
    }

    private void b() {
        boolean z = this.n;
        this.n = false;
        this.p = false;
        if (this.s != null) {
            this.s.h();
            this.s = null;
        }
        if (this.u != null) {
            a(this.u);
        }
        if (this.r != null) {
            this.r = null;
        }
        this.u = null;
        if (this.t != null) {
            b("release", this.t);
            a((a<T, INFO>) this.t);
            this.t = null;
        }
        if (z) {
            h().a(this.k);
        }
    }

    public String e() {
        return this.k;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public com.facebook.f.b.c f() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(com.facebook.f.b.c cVar) {
        this.e = cVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public com.facebook.f.g.a g() {
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(com.facebook.f.g.a aVar) {
        this.f = aVar;
        if (this.f != null) {
            this.f.a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(boolean z) {
        this.q = z;
    }

    public void a(String str) {
        this.r = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void a(d<? super INFO> dVar) {
        i.a(dVar);
        if (this.g instanceof C0054a) {
            ((C0054a) this.g).a(dVar);
        } else if (this.g != null) {
            this.g = C0054a.a(this.g, dVar);
        } else {
            this.g = dVar;
        }
    }

    protected d<INFO> h() {
        if (this.g == null) {
            return c.a();
        }
        return this.g;
    }

    public void a(e eVar) {
        this.h = eVar;
    }

    @Override // com.facebook.f.h.a
    public com.facebook.f.h.b i() {
        return this.i;
    }

    public void a(com.facebook.f.h.b bVar) {
        if (com.facebook.common.e.a.a(2)) {
            com.facebook.common.e.a.a(f2381a, "controller %x %s: setHierarchy: %s", Integer.valueOf(System.identityHashCode(this)), this.k, bVar);
        }
        this.f2382b.a(bVar != null ? b.a.ON_SET_HIERARCHY : b.a.ON_CLEAR_HIERARCHY);
        if (this.n) {
            this.f2383c.b(this);
            d();
        }
        if (this.i != null) {
            this.i.a((Drawable) null);
            this.i = null;
        }
        if (bVar != null) {
            i.a(bVar instanceof com.facebook.f.h.c);
            this.i = (com.facebook.f.h.c) bVar;
            this.i.a(this.j);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(Drawable drawable) {
        this.j = drawable;
        if (this.i != null) {
            this.i.a(this.j);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Drawable j() {
        return this.j;
    }

    @Override // com.facebook.f.h.a
    public void k() {
        if (com.facebook.common.e.a.a(2)) {
            com.facebook.common.e.a.a(f2381a, "controller %x %s: onAttach: %s", Integer.valueOf(System.identityHashCode(this)), this.k, this.n ? "request already submitted" : "request needs submit");
        }
        this.f2382b.a(b.a.ON_ATTACH_CONTROLLER);
        i.a(this.i);
        this.f2383c.b(this);
        this.m = true;
        if (!this.n) {
            o();
        }
    }

    @Override // com.facebook.f.h.a
    public void l() {
        if (com.facebook.common.e.a.a(2)) {
            com.facebook.common.e.a.a(f2381a, "controller %x %s: onDetach", Integer.valueOf(System.identityHashCode(this)), this.k);
        }
        this.f2382b.a(b.a.ON_DETACH_CONTROLLER);
        this.m = false;
        this.f2383c.a(this);
    }

    @Override // com.facebook.f.h.a
    public boolean a(MotionEvent motionEvent) {
        if (com.facebook.common.e.a.a(2)) {
            com.facebook.common.e.a.a(f2381a, "controller %x %s: onTouchEvent %s", Integer.valueOf(System.identityHashCode(this)), this.k, motionEvent);
        }
        if (this.f == null) {
            return false;
        }
        if (!this.f.c() && !m()) {
            return false;
        }
        this.f.a(motionEvent);
        return true;
    }

    protected boolean m() {
        return q();
    }

    private boolean q() {
        return this.p && this.e != null && this.e.c();
    }

    @Override // com.facebook.f.g.a.InterfaceC0055a
    public boolean n() {
        if (com.facebook.common.e.a.a(2)) {
            com.facebook.common.e.a.a(f2381a, "controller %x %s: onClick", Integer.valueOf(System.identityHashCode(this)), this.k);
        }
        if (q()) {
            this.e.d();
            this.i.b();
            o();
            return true;
        }
        return false;
    }

    protected void o() {
        T c2 = c();
        if (c2 != null) {
            this.s = null;
            this.n = true;
            this.p = false;
            this.f2382b.a(b.a.ON_SUBMIT_CACHE_HIT);
            h().a(this.k, this.l);
            a(this.k, this.s, c2, 1.0f, true, true);
            return;
        }
        this.f2382b.a(b.a.ON_DATASOURCE_SUBMIT);
        h().a(this.k, this.l);
        this.i.a(BitmapDescriptorFactory.HUE_RED, true);
        this.n = true;
        this.p = false;
        this.s = a();
        if (com.facebook.common.e.a.a(2)) {
            com.facebook.common.e.a.a(f2381a, "controller %x %s: submitRequest: dataSource: %x", Integer.valueOf(System.identityHashCode(this)), this.k, Integer.valueOf(System.identityHashCode(this.s)));
        }
        final String str = this.k;
        final boolean c3 = this.s.c();
        this.s.a(new com.facebook.c.b<T>() { // from class: com.facebook.f.c.a.1
            @Override // com.facebook.c.b
            public void e(com.facebook.c.c<T> cVar) {
                boolean b2 = cVar.b();
                float g = cVar.g();
                T d2 = cVar.d();
                if (d2 != null) {
                    a.this.a(str, cVar, d2, g, b2, c3);
                } else if (!b2) {
                } else {
                    a.this.a(str, (com.facebook.c.c) cVar, (Throwable) new NullPointerException(), true);
                }
            }

            @Override // com.facebook.c.b
            public void f(com.facebook.c.c<T> cVar) {
                a.this.a(str, (com.facebook.c.c) cVar, cVar.f(), true);
            }

            @Override // com.facebook.c.b, com.facebook.c.e
            public void d(com.facebook.c.c<T> cVar) {
                boolean b2 = cVar.b();
                a.this.a(str, cVar, cVar.g(), b2);
            }
        }, this.f2384d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, com.facebook.c.c<T> cVar, T t, float f, boolean z, boolean z2) {
        if (!a(str, (com.facebook.c.c) cVar)) {
            b("ignore_old_datasource @ onNewResult", t);
            a((a<T, INFO>) t);
            cVar.h();
            return;
        }
        this.f2382b.a(z ? b.a.ON_DATASOURCE_RESULT : b.a.ON_DATASOURCE_RESULT_INT);
        try {
            Drawable d2 = d(t);
            T t2 = this.t;
            Drawable drawable = this.u;
            this.t = t;
            this.u = d2;
            try {
                if (z) {
                    b("set_final_result @ onNewResult", t);
                    this.s = null;
                    this.i.a(d2, 1.0f, z2);
                    h().a(str, c(t), p());
                } else {
                    b("set_intermediate_result @ onNewResult", t);
                    this.i.a(d2, f, z2);
                    h().b(str, (String) c(t));
                }
                if (drawable != null && drawable != d2) {
                    a(drawable);
                }
                if (t2 == null || t2 == t) {
                    return;
                }
                b("release_previous_result @ onNewResult", t2);
                a((a<T, INFO>) t2);
            } catch (Throwable th) {
                if (drawable != null && drawable != d2) {
                    a(drawable);
                }
                if (t2 != null && t2 != t) {
                    b("release_previous_result @ onNewResult", t2);
                    a((a<T, INFO>) t2);
                }
                throw th;
            }
        } catch (Exception e) {
            b("drawable_failed @ onNewResult", t);
            a((a<T, INFO>) t);
            a(str, cVar, e, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, com.facebook.c.c<T> cVar, Throwable th, boolean z) {
        if (!a(str, (com.facebook.c.c) cVar)) {
            a("ignore_old_datasource @ onFailure", th);
            cVar.h();
            return;
        }
        this.f2382b.a(z ? b.a.ON_DATASOURCE_FAILURE : b.a.ON_DATASOURCE_FAILURE_INT);
        if (z) {
            a("final_failed @ onFailure", th);
            this.s = null;
            this.p = true;
            if (this.q && this.u != null) {
                this.i.a(this.u, 1.0f, true);
            } else if (q()) {
                this.i.b(th);
            } else {
                this.i.a(th);
            }
            h().b(this.k, th);
            return;
        }
        a("intermediate_failed @ onFailure", th);
        h().a(this.k, th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, com.facebook.c.c<T> cVar, float f, boolean z) {
        if (!a(str, (com.facebook.c.c) cVar)) {
            a("ignore_old_datasource @ onProgress", (Throwable) null);
            cVar.h();
        } else if (z) {
        } else {
            this.i.a(f, false);
        }
    }

    private boolean a(String str, com.facebook.c.c<T> cVar) {
        if (cVar == null && this.s == null) {
            return true;
        }
        return str.equals(this.k) && cVar == this.s && this.n;
    }

    private void b(String str, T t) {
        if (com.facebook.common.e.a.a(2)) {
            com.facebook.common.e.a.a(f2381a, "controller %x %s: %s: image: %s %x", Integer.valueOf(System.identityHashCode(this)), this.k, str, e(t), Integer.valueOf(b((a<T, INFO>) t)));
        }
    }

    private void a(String str, Throwable th) {
        if (com.facebook.common.e.a.a(2)) {
            com.facebook.common.e.a.a(f2381a, "controller %x %s: %s: failure: %s", Integer.valueOf(System.identityHashCode(this)), this.k, str, th);
        }
    }

    public Animatable p() {
        if (this.u instanceof Animatable) {
            return (Animatable) this.u;
        }
        return null;
    }

    protected String e(T t) {
        return t != null ? t.getClass().getSimpleName() : "<null>";
    }

    protected int b(T t) {
        return System.identityHashCode(t);
    }

    public String toString() {
        return h.a(this).a("isAttached", this.m).a("isRequestSubmitted", this.n).a("hasFetchFailed", this.p).a("fetchedImage", b((a<T, INFO>) this.t)).a("events", this.f2382b.toString()).toString();
    }
}
