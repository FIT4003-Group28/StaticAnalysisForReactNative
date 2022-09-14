package c.d.h.c;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import c.d.d.d.h;
import c.d.d.d.i;
import c.d.h.b.a;
import c.d.h.b.b;
import c.d.h.g.a;
import com.horcrux.svg.BuildConfig;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public abstract class a<T, INFO> implements c.d.h.h.a, a.b, a.InterfaceC0079a {
    private static final Class<?> t = a.class;

    /* renamed from: b  reason: collision with root package name */
    private final c.d.h.b.a f2976b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f2977c;

    /* renamed from: d  reason: collision with root package name */
    private c.d.h.b.c f2978d;

    /* renamed from: e  reason: collision with root package name */
    private c.d.h.g.a f2979e;

    /* renamed from: f  reason: collision with root package name */
    protected d<INFO> f2980f;

    /* renamed from: g  reason: collision with root package name */
    private c.d.h.h.c f2981g;

    /* renamed from: h  reason: collision with root package name */
    private Drawable f2982h;
    private String i;
    private Object j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private String o;
    private c.d.e.c<T> p;
    private T q;
    private Drawable r;

    /* renamed from: a  reason: collision with root package name */
    private final c.d.h.b.b f2975a = c.d.h.b.b.a();
    private boolean s = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c.d.h.c.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0076a extends c.d.e.b<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f2983a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f2984b;

        C0076a(String str, boolean z) {
            this.f2983a = str;
            this.f2984b = z;
        }

        @Override // c.d.e.b, c.d.e.e
        public void d(c.d.e.c<T> cVar) {
            boolean d2 = cVar.d();
            a.this.a(this.f2983a, cVar, cVar.f(), d2);
        }

        @Override // c.d.e.b
        public void e(c.d.e.c<T> cVar) {
            a.this.a(this.f2983a, (c.d.e.c) cVar, cVar.e(), true);
        }

        @Override // c.d.e.b
        public void f(c.d.e.c<T> cVar) {
            boolean d2 = cVar.d();
            boolean a2 = cVar.a();
            float f2 = cVar.f();
            T mo140b = cVar.mo140b();
            if (mo140b != null) {
                a.this.a(this.f2983a, cVar, mo140b, f2, d2, this.f2984b, a2);
            } else if (!d2) {
            } else {
                a.this.a(this.f2983a, (c.d.e.c) cVar, (Throwable) new NullPointerException(), true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b<INFO> extends f<INFO> {
        private b() {
        }

        public static <INFO> b<INFO> a(d<? super INFO> dVar, d<? super INFO> dVar2) {
            if (c.d.j.p.b.c()) {
                c.d.j.p.b.a("AbstractDraweeController#createInternal");
            }
            b<INFO> bVar = new b<>();
            bVar.a(dVar);
            bVar.a(dVar2);
            if (c.d.j.p.b.c()) {
                c.d.j.p.b.a();
            }
            return bVar;
        }
    }

    public a(c.d.h.b.a aVar, Executor executor, String str, Object obj) {
        this.f2976b = aVar;
        this.f2977c = executor;
        c(str, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, c.d.e.c<T> cVar, float f2, boolean z) {
        if (!a(str, (c.d.e.c) cVar)) {
            a("ignore_old_datasource @ onProgress", (Throwable) null);
            cVar.close();
        } else if (z) {
        } else {
            this.f2981g.a(f2, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v6, types: [c.d.h.c.d] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.lang.String r5, c.d.e.c<T> r6, T r7, float r8, boolean r9, boolean r10, boolean r11) {
        /*
            r4 = this;
            boolean r0 = c.d.j.p.b.c()     // Catch: java.lang.Throwable -> Ld4
            if (r0 == 0) goto Lb
            java.lang.String r0 = "AbstractDraweeController#onNewResultInternal"
            c.d.j.p.b.a(r0)     // Catch: java.lang.Throwable -> Ld4
        Lb:
            boolean r0 = r4.a(r5, r6)     // Catch: java.lang.Throwable -> Ld4
            if (r0 != 0) goto L26
            java.lang.String r5 = "ignore_old_datasource @ onNewResult"
            r4.d(r5, r7)     // Catch: java.lang.Throwable -> Ld4
            r4.e(r7)     // Catch: java.lang.Throwable -> Ld4
            r6.close()     // Catch: java.lang.Throwable -> Ld4
            boolean r5 = c.d.j.p.b.c()
            if (r5 == 0) goto L25
            c.d.j.p.b.a()
        L25:
            return
        L26:
            c.d.h.b.b r0 = r4.f2975a     // Catch: java.lang.Throwable -> Ld4
            if (r9 == 0) goto L2d
            c.d.h.b.b$a r1 = c.d.h.b.b.a.ON_DATASOURCE_RESULT     // Catch: java.lang.Throwable -> Ld4
            goto L2f
        L2d:
            c.d.h.b.b$a r1 = c.d.h.b.b.a.ON_DATASOURCE_RESULT_INT     // Catch: java.lang.Throwable -> Ld4
        L2f:
            r0.a(r1)     // Catch: java.lang.Throwable -> Ld4
            android.graphics.drawable.Drawable r6 = r4.a(r7)     // Catch: java.lang.Exception -> Lbe java.lang.Throwable -> Ld4
            T r0 = r4.q     // Catch: java.lang.Throwable -> Ld4
            android.graphics.drawable.Drawable r1 = r4.r     // Catch: java.lang.Throwable -> Ld4
            r4.q = r7     // Catch: java.lang.Throwable -> Ld4
            r4.r = r6     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r2 = "release_previous_result @ onNewResult"
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r9 == 0) goto L63
            java.lang.String r8 = "set_final_result @ onNewResult"
            r4.d(r8, r7)     // Catch: java.lang.Throwable -> L61
            r8 = 0
            r4.p = r8     // Catch: java.lang.Throwable -> L61
            c.d.h.h.c r8 = r4.f2981g     // Catch: java.lang.Throwable -> L61
            r8.a(r6, r3, r10)     // Catch: java.lang.Throwable -> L61
            c.d.h.c.d r8 = r4.g()     // Catch: java.lang.Throwable -> L61
            java.lang.Object r9 = r4.d(r7)     // Catch: java.lang.Throwable -> L61
            android.graphics.drawable.Animatable r10 = r4.e()     // Catch: java.lang.Throwable -> L61
        L5d:
            r8.a(r5, r9, r10)     // Catch: java.lang.Throwable -> L61
            goto L91
        L61:
            r5 = move-exception
            goto Lac
        L63:
            if (r11 == 0) goto L7c
            java.lang.String r8 = "set_temporary_result @ onNewResult"
            r4.d(r8, r7)     // Catch: java.lang.Throwable -> L61
            c.d.h.h.c r8 = r4.f2981g     // Catch: java.lang.Throwable -> L61
            r8.a(r6, r3, r10)     // Catch: java.lang.Throwable -> L61
            c.d.h.c.d r8 = r4.g()     // Catch: java.lang.Throwable -> L61
            java.lang.Object r9 = r4.d(r7)     // Catch: java.lang.Throwable -> L61
            android.graphics.drawable.Animatable r10 = r4.e()     // Catch: java.lang.Throwable -> L61
            goto L5d
        L7c:
            java.lang.String r9 = "set_intermediate_result @ onNewResult"
            r4.d(r9, r7)     // Catch: java.lang.Throwable -> L61
            c.d.h.h.c r9 = r4.f2981g     // Catch: java.lang.Throwable -> L61
            r9.a(r6, r8, r10)     // Catch: java.lang.Throwable -> L61
            c.d.h.c.d r8 = r4.g()     // Catch: java.lang.Throwable -> L61
            java.lang.Object r9 = r4.d(r7)     // Catch: java.lang.Throwable -> L61
            r8.a(r5, r9)     // Catch: java.lang.Throwable -> L61
        L91:
            if (r1 == 0) goto L98
            if (r1 == r6) goto L98
            r4.a(r1)     // Catch: java.lang.Throwable -> Ld4
        L98:
            if (r0 == 0) goto La2
            if (r0 == r7) goto La2
            r4.d(r2, r0)     // Catch: java.lang.Throwable -> Ld4
            r4.e(r0)     // Catch: java.lang.Throwable -> Ld4
        La2:
            boolean r5 = c.d.j.p.b.c()
            if (r5 == 0) goto Lab
            c.d.j.p.b.a()
        Lab:
            return
        Lac:
            if (r1 == 0) goto Lb3
            if (r1 == r6) goto Lb3
            r4.a(r1)     // Catch: java.lang.Throwable -> Ld4
        Lb3:
            if (r0 == 0) goto Lbd
            if (r0 == r7) goto Lbd
            r4.d(r2, r0)     // Catch: java.lang.Throwable -> Ld4
            r4.e(r0)     // Catch: java.lang.Throwable -> Ld4
        Lbd:
            throw r5     // Catch: java.lang.Throwable -> Ld4
        Lbe:
            r8 = move-exception
            java.lang.String r10 = "drawable_failed @ onNewResult"
            r4.d(r10, r7)     // Catch: java.lang.Throwable -> Ld4
            r4.e(r7)     // Catch: java.lang.Throwable -> Ld4
            r4.a(r5, r6, r8, r9)     // Catch: java.lang.Throwable -> Ld4
            boolean r5 = c.d.j.p.b.c()
            if (r5 == 0) goto Ld3
            c.d.j.p.b.a()
        Ld3:
            return
        Ld4:
            r5 = move-exception
            boolean r6 = c.d.j.p.b.c()
            if (r6 == 0) goto Lde
            c.d.j.p.b.a()
        Lde:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: c.d.h.c.a.a(java.lang.String, c.d.e.c, java.lang.Object, float, boolean, boolean, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, c.d.e.c<T> cVar, Throwable th, boolean z) {
        Drawable drawable;
        if (c.d.j.p.b.c()) {
            c.d.j.p.b.a("AbstractDraweeController#onFailureInternal");
        }
        if (!a(str, (c.d.e.c) cVar)) {
            a("ignore_old_datasource @ onFailure", th);
            cVar.close();
            if (!c.d.j.p.b.c()) {
                return;
            }
            c.d.j.p.b.a();
            return;
        }
        this.f2975a.a(z ? b.a.ON_DATASOURCE_FAILURE : b.a.ON_DATASOURCE_FAILURE_INT);
        if (z) {
            a("final_failed @ onFailure", th);
            this.p = null;
            this.m = true;
            if (this.n && (drawable = this.r) != null) {
                this.f2981g.a(drawable, 1.0f, true);
            } else if (p()) {
                this.f2981g.a(th);
            } else {
                this.f2981g.b(th);
            }
            g().b(this.i, th);
        } else {
            a("intermediate_failed @ onFailure", th);
            g().a(this.i, th);
        }
        if (!c.d.j.p.b.c()) {
            return;
        }
        c.d.j.p.b.a();
    }

    private void a(String str, Throwable th) {
        if (c.d.d.e.a.a(2)) {
            c.d.d.e.a.a(t, "controller %x %s: %s: failure: %s", Integer.valueOf(System.identityHashCode(this)), this.i, str, th);
        }
    }

    private boolean a(String str, c.d.e.c<T> cVar) {
        if (cVar == null && this.p == null) {
            return true;
        }
        return str.equals(this.i) && cVar == this.p && this.l;
    }

    private synchronized void c(String str, Object obj) {
        if (c.d.j.p.b.c()) {
            c.d.j.p.b.a("AbstractDraweeController#init");
        }
        this.f2975a.a(b.a.ON_INIT_CONTROLLER);
        if (!this.s && this.f2976b != null) {
            this.f2976b.a(this);
        }
        this.k = false;
        o();
        this.n = false;
        if (this.f2978d != null) {
            this.f2978d.a();
        }
        if (this.f2979e != null) {
            this.f2979e.a();
            this.f2979e.a(this);
        }
        if (this.f2980f instanceof b) {
            ((b) this.f2980f).a();
        } else {
            this.f2980f = null;
        }
        if (this.f2981g != null) {
            this.f2981g.b();
            this.f2981g.a((Drawable) null);
            this.f2981g = null;
        }
        this.f2982h = null;
        if (c.d.d.e.a.a(2)) {
            c.d.d.e.a.a(t, "controller %x %s -> %s: initialize", Integer.valueOf(System.identityHashCode(this)), this.i, str);
        }
        this.i = str;
        this.j = obj;
        if (c.d.j.p.b.c()) {
            c.d.j.p.b.a();
        }
    }

    private void d(String str, T t2) {
        if (c.d.d.e.a.a(2)) {
            c.d.d.e.a.b(t, "controller %x %s: %s: image: %s %x", Integer.valueOf(System.identityHashCode(this)), this.i, str, b((a<T, INFO>) t2), Integer.valueOf(c(t2)));
        }
    }

    private void o() {
        boolean z = this.l;
        this.l = false;
        this.m = false;
        c.d.e.c<T> cVar = this.p;
        if (cVar != null) {
            cVar.close();
            this.p = null;
        }
        Drawable drawable = this.r;
        if (drawable != null) {
            a(drawable);
        }
        if (this.o != null) {
            this.o = null;
        }
        this.r = null;
        T t2 = this.q;
        if (t2 != null) {
            d(BuildConfig.BUILD_TYPE, t2);
            e(this.q);
            this.q = null;
        }
        if (z) {
            g().a(this.i);
        }
    }

    private boolean p() {
        c.d.h.b.c cVar;
        return this.m && (cVar = this.f2978d) != null && cVar.d();
    }

    protected abstract Drawable a(T t2);

    @Override // c.d.h.h.a
    public void a() {
        if (c.d.j.p.b.c()) {
            c.d.j.p.b.a("AbstractDraweeController#onDetach");
        }
        if (c.d.d.e.a.a(2)) {
            c.d.d.e.a.a(t, "controller %x %s: onDetach", Integer.valueOf(System.identityHashCode(this)), this.i);
        }
        this.f2975a.a(b.a.ON_DETACH_CONTROLLER);
        this.k = false;
        this.f2976b.b(this);
        if (c.d.j.p.b.c()) {
            c.d.j.p.b.a();
        }
    }

    protected abstract void a(Drawable drawable);

    /* JADX WARN: Multi-variable type inference failed */
    public void a(d<? super INFO> dVar) {
        i.a(dVar);
        d<INFO> dVar2 = this.f2980f;
        if (dVar2 instanceof b) {
            ((b) dVar2).a(dVar);
        } else if (dVar2 != null) {
            this.f2980f = b.a(dVar2, dVar);
        } else {
            this.f2980f = dVar;
        }
    }

    public void a(e eVar) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(c.d.h.g.a aVar) {
        this.f2979e = aVar;
        c.d.h.g.a aVar2 = this.f2979e;
        if (aVar2 != null) {
            aVar2.a(this);
        }
    }

    @Override // c.d.h.h.a
    public void a(c.d.h.h.b bVar) {
        if (c.d.d.e.a.a(2)) {
            c.d.d.e.a.a(t, "controller %x %s: setHierarchy: %s", Integer.valueOf(System.identityHashCode(this)), this.i, bVar);
        }
        this.f2975a.a(bVar != null ? b.a.ON_SET_HIERARCHY : b.a.ON_CLEAR_HIERARCHY);
        if (this.l) {
            this.f2976b.a(this);
            release();
        }
        c.d.h.h.c cVar = this.f2981g;
        if (cVar != null) {
            cVar.a((Drawable) null);
            this.f2981g = null;
        }
        if (bVar != null) {
            i.a(bVar instanceof c.d.h.h.c);
            this.f2981g = (c.d.h.h.c) bVar;
            this.f2981g.a(this.f2982h);
        }
    }

    public void a(String str) {
        this.o = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(String str, Object obj) {
        c(str, obj);
        this.s = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(boolean z) {
        this.n = z;
    }

    @Override // c.d.h.h.a
    public boolean a(MotionEvent motionEvent) {
        if (c.d.d.e.a.a(2)) {
            c.d.d.e.a.a(t, "controller %x %s: onTouchEvent %s", Integer.valueOf(System.identityHashCode(this)), this.i, motionEvent);
        }
        c.d.h.g.a aVar = this.f2979e;
        if (aVar == null) {
            return false;
        }
        if (!aVar.b() && !m()) {
            return false;
        }
        this.f2979e.a(motionEvent);
        return true;
    }

    @Override // c.d.h.h.a
    public c.d.h.h.b b() {
        return this.f2981g;
    }

    protected String b(T t2) {
        return t2 != null ? t2.getClass().getSimpleName() : "<null>";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(Drawable drawable) {
        this.f2982h = drawable;
        c.d.h.h.c cVar = this.f2981g;
        if (cVar != null) {
            cVar.a(this.f2982h);
        }
    }

    public void b(d<? super INFO> dVar) {
        i.a(dVar);
        d<INFO> dVar2 = this.f2980f;
        if (dVar2 instanceof b) {
            ((b) dVar2).b(dVar);
        } else if (dVar2 != dVar) {
        } else {
            this.f2980f = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(String str, T t2) {
    }

    protected int c(T t2) {
        return System.identityHashCode(t2);
    }

    @Override // c.d.h.h.a
    public void c() {
        if (c.d.j.p.b.c()) {
            c.d.j.p.b.a("AbstractDraweeController#onAttach");
        }
        if (c.d.d.e.a.a(2)) {
            c.d.d.e.a.a(t, "controller %x %s: onAttach: %s", Integer.valueOf(System.identityHashCode(this)), this.i, this.l ? "request already submitted" : "request needs submit");
        }
        this.f2975a.a(b.a.ON_ATTACH_CONTROLLER);
        i.a(this.f2981g);
        this.f2976b.a(this);
        this.k = true;
        if (!this.l) {
            n();
        }
        if (c.d.j.p.b.c()) {
            c.d.j.p.b.a();
        }
    }

    protected abstract INFO d(T t2);

    @Override // c.d.h.g.a.InterfaceC0079a
    public boolean d() {
        if (c.d.d.e.a.a(2)) {
            c.d.d.e.a.a(t, "controller %x %s: onClick", Integer.valueOf(System.identityHashCode(this)), this.i);
        }
        if (p()) {
            this.f2978d.b();
            this.f2981g.b();
            n();
            return true;
        }
        return false;
    }

    public Animatable e() {
        Drawable drawable = this.r;
        if (drawable instanceof Animatable) {
            return (Animatable) drawable;
        }
        return null;
    }

    protected abstract void e(T t2);

    /* renamed from: f */
    protected T mo128f() {
        return null;
    }

    protected d<INFO> g() {
        d<INFO> dVar = this.f2980f;
        return dVar == null ? c.a() : dVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Drawable h() {
        return this.f2982h;
    }

    protected abstract c.d.e.c<T> i();

    /* JADX INFO: Access modifiers changed from: protected */
    public c.d.h.g.a j() {
        return this.f2979e;
    }

    public String k() {
        return this.i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public c.d.h.b.c l() {
        if (this.f2978d == null) {
            this.f2978d = new c.d.h.b.c();
        }
        return this.f2978d;
    }

    protected boolean m() {
        return p();
    }

    protected void n() {
        if (c.d.j.p.b.c()) {
            c.d.j.p.b.a("AbstractDraweeController#submitRequest");
        }
        T mo128f = mo128f();
        if (mo128f == null) {
            this.f2975a.a(b.a.ON_DATASOURCE_SUBMIT);
            g().b(this.i, this.j);
            this.f2981g.a(0.0f, true);
            this.l = true;
            this.m = false;
            this.p = i();
            if (c.d.d.e.a.a(2)) {
                c.d.d.e.a.a(t, "controller %x %s: submitRequest: dataSource: %x", Integer.valueOf(System.identityHashCode(this)), this.i, Integer.valueOf(System.identityHashCode(this.p)));
            }
            this.p.a(new C0076a(this.i, this.p.c()), this.f2977c);
            if (!c.d.j.p.b.c()) {
                return;
            }
            c.d.j.p.b.a();
            return;
        }
        if (c.d.j.p.b.c()) {
            c.d.j.p.b.a("AbstractDraweeController#submitRequest->cache");
        }
        this.p = null;
        this.l = true;
        this.m = false;
        this.f2975a.a(b.a.ON_SUBMIT_CACHE_HIT);
        g().b(this.i, this.j);
        b(this.i, mo128f);
        a(this.i, this.p, mo128f, 1.0f, true, true, true);
        if (c.d.j.p.b.c()) {
            c.d.j.p.b.a();
        }
        if (!c.d.j.p.b.c()) {
            return;
        }
        c.d.j.p.b.a();
    }

    @Override // c.d.h.b.a.b
    public void release() {
        this.f2975a.a(b.a.ON_RELEASE_CONTROLLER);
        c.d.h.b.c cVar = this.f2978d;
        if (cVar != null) {
            cVar.c();
        }
        c.d.h.g.a aVar = this.f2979e;
        if (aVar != null) {
            aVar.c();
        }
        c.d.h.h.c cVar2 = this.f2981g;
        if (cVar2 != null) {
            cVar2.b();
        }
        o();
    }

    public String toString() {
        h.b a2 = h.a(this);
        a2.a("isAttached", this.k);
        a2.a("isRequestSubmitted", this.l);
        a2.a("hasFetchFailed", this.m);
        a2.a("fetchedImage", c(this.q));
        a2.a("events", this.f2975a.toString());
        return a2.toString();
    }
}
