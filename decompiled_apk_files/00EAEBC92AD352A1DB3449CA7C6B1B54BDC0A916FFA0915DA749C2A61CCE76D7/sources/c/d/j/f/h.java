package c.d.j.f;

import android.net.Uri;
import c.d.j.d.p;
import c.d.j.n.j0;
import c.d.j.n.p0;
import c.d.j.n.t0;
import c.d.j.o.c;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;
/* loaded from: classes.dex */
public class h {
    private static final CancellationException k = new CancellationException("Prefetching is not enabled");

    /* renamed from: a  reason: collision with root package name */
    private final n f3282a;

    /* renamed from: b  reason: collision with root package name */
    private final c.d.j.l.c f3283b;

    /* renamed from: c  reason: collision with root package name */
    private final c.d.d.d.l<Boolean> f3284c;

    /* renamed from: d  reason: collision with root package name */
    private final p<c.d.b.a.d, c.d.j.k.b> f3285d;

    /* renamed from: e  reason: collision with root package name */
    private final p<c.d.b.a.d, c.d.d.g.g> f3286e;

    /* renamed from: f  reason: collision with root package name */
    private final c.d.j.d.e f3287f;

    /* renamed from: g  reason: collision with root package name */
    private final c.d.j.d.e f3288g;

    /* renamed from: h  reason: collision with root package name */
    private final c.d.j.d.f f3289h;
    private AtomicLong i = new AtomicLong();
    private final c.d.c.a j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements c.d.d.d.j<c.d.b.a.d> {
        a(h hVar) {
        }

        @Override // c.d.d.d.j
        public boolean a(c.d.b.a.d dVar) {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements c.d.d.d.j<c.d.b.a.d> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Uri f3290a;

        b(h hVar, Uri uri) {
            this.f3290a = uri;
        }

        @Override // c.d.d.d.j
        public boolean a(c.d.b.a.d dVar) {
            return dVar.a(this.f3290a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f3291a = new int[c.a.values().length];

        static {
            try {
                f3291a[c.a.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3291a[c.a.SMALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public h(n nVar, Set<c.d.j.l.c> set, c.d.d.d.l<Boolean> lVar, p<c.d.b.a.d, c.d.j.k.b> pVar, p<c.d.b.a.d, c.d.d.g.g> pVar2, c.d.j.d.e eVar, c.d.j.d.e eVar2, c.d.j.d.f fVar, t0 t0Var, c.d.d.d.l<Boolean> lVar2, c.d.d.d.l<Boolean> lVar3, c.d.c.a aVar) {
        this.f3282a = nVar;
        this.f3283b = new c.d.j.l.b(set);
        this.f3284c = lVar;
        this.f3285d = pVar;
        this.f3286e = pVar2;
        this.f3287f = eVar;
        this.f3288g = eVar2;
        this.f3289h = fVar;
        this.j = aVar;
    }

    private c.d.e.c<Void> a(j0<Void> j0Var, c.d.j.o.c cVar, c.b bVar, Object obj, c.d.j.e.d dVar) {
        c.d.j.l.c a2 = a(cVar, (c.d.j.l.c) null);
        c.d.c.a aVar = this.j;
        if (aVar != null) {
            aVar.a(obj);
        }
        try {
            return c.d.j.g.d.a(j0Var, new p0(cVar, d(), a2, obj, c.b.a(cVar.e(), bVar), true, false, dVar), a2);
        } catch (Exception e2) {
            return c.d.e.d.b(e2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private <T> c.d.e.c<c.d.d.h.a<T>> a(c.d.j.n.j0<c.d.d.h.a<T>> r11, c.d.j.o.c r12, c.d.j.o.c.b r13, java.lang.Object r14, c.d.j.l.c r15) {
        /*
            r10 = this;
            boolean r0 = c.d.j.p.b.c()
            if (r0 == 0) goto Lb
            java.lang.String r0 = "ImagePipeline#submitFetchRequest"
            c.d.j.p.b.a(r0)
        Lb:
            c.d.j.l.c r15 = r10.a(r12, r15)
            c.d.c.a r0 = r10.j
            if (r0 == 0) goto L16
            r0.a(r14)
        L16:
            c.d.j.o.c$b r0 = r12.e()     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L56
            c.d.j.o.c$b r6 = c.d.j.o.c.b.a(r0, r13)     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L56
            c.d.j.n.p0 r13 = new c.d.j.n.p0     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L56
            java.lang.String r3 = r10.d()     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L56
            r7 = 0
            boolean r0 = r12.j()     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L56
            if (r0 != 0) goto L39
            android.net.Uri r0 = r12.p()     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L56
            boolean r0 = c.d.d.k.f.i(r0)     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L56
            if (r0 != 0) goto L36
            goto L39
        L36:
            r0 = 0
            r8 = 0
            goto L3b
        L39:
            r0 = 1
            r8 = 1
        L3b:
            c.d.j.e.d r9 = r12.i()     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L56
            r1 = r13
            r2 = r12
            r4 = r15
            r5 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L56
            c.d.e.c r11 = c.d.j.g.c.a(r11, r13, r15)     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L56
            boolean r12 = c.d.j.p.b.c()
            if (r12 == 0) goto L53
            c.d.j.p.b.a()
        L53:
            return r11
        L54:
            r11 = move-exception
            goto L65
        L56:
            r11 = move-exception
            c.d.e.c r11 = c.d.e.d.b(r11)     // Catch: java.lang.Throwable -> L54
            boolean r12 = c.d.j.p.b.c()
            if (r12 == 0) goto L64
            c.d.j.p.b.a()
        L64:
            return r11
        L65:
            boolean r12 = c.d.j.p.b.c()
            if (r12 == 0) goto L6e
            c.d.j.p.b.a()
        L6e:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: c.d.j.f.h.a(c.d.j.n.j0, c.d.j.o.c, c.d.j.o.c$b, java.lang.Object, c.d.j.l.c):c.d.e.c");
    }

    private c.d.d.d.j<c.d.b.a.d> c(Uri uri) {
        return new b(this, uri);
    }

    public c.d.e.c<c.d.d.h.a<c.d.j.k.b>> a(c.d.j.o.c cVar, Object obj) {
        return a(cVar, obj, c.b.FULL_FETCH);
    }

    public c.d.e.c<Void> a(c.d.j.o.c cVar, Object obj, c.d.j.e.d dVar) {
        if (!this.f3284c.mo139get().booleanValue()) {
            return c.d.e.d.b(k);
        }
        try {
            return a(this.f3282a.b(cVar), cVar, c.b.FULL_FETCH, obj, dVar);
        } catch (Exception e2) {
            return c.d.e.d.b(e2);
        }
    }

    public c.d.e.c<c.d.d.h.a<c.d.j.k.b>> a(c.d.j.o.c cVar, Object obj, c.b bVar) {
        return a(cVar, obj, bVar, null);
    }

    public c.d.e.c<c.d.d.h.a<c.d.j.k.b>> a(c.d.j.o.c cVar, Object obj, c.b bVar, c.d.j.l.c cVar2) {
        try {
            return a(this.f3282a.a(cVar), cVar, bVar, obj, cVar2);
        } catch (Exception e2) {
            return c.d.e.d.b(e2);
        }
    }

    public c.d.j.l.c a(c.d.j.o.c cVar, c.d.j.l.c cVar2) {
        return cVar2 == null ? cVar.k() == null ? this.f3283b : new c.d.j.l.b(this.f3283b, cVar.k()) : cVar.k() == null ? new c.d.j.l.b(this.f3283b, cVar2) : new c.d.j.l.b(this.f3283b, cVar2, cVar.k());
    }

    public void a() {
        c();
        b();
    }

    public boolean a(Uri uri) {
        if (uri == null) {
            return false;
        }
        return this.f3285d.b(c(uri));
    }

    public boolean a(Uri uri, c.a aVar) {
        c.d.j.o.d b2 = c.d.j.o.d.b(uri);
        b2.a(aVar);
        return b(b2.a());
    }

    public boolean a(c.d.j.o.c cVar) {
        if (cVar == null) {
            return false;
        }
        c.d.d.h.a<c.d.j.k.b> aVar = this.f3285d.get(this.f3289h.a(cVar, null));
        try {
            return c.d.d.h.a.c(aVar);
        } finally {
            c.d.d.h.a.b(aVar);
        }
    }

    public c.d.e.c<c.d.d.h.a<c.d.j.k.b>> b(c.d.j.o.c cVar, Object obj) {
        return a(cVar, obj, c.b.BITMAP_MEMORY_CACHE);
    }

    public void b() {
        this.f3287f.a();
        this.f3288g.a();
    }

    public boolean b(Uri uri) {
        return a(uri, c.a.SMALL) || a(uri, c.a.DEFAULT);
    }

    public boolean b(c.d.j.o.c cVar) {
        c.d.j.d.e eVar;
        c.d.b.a.d c2 = this.f3289h.c(cVar, null);
        int i = c.f3291a[cVar.b().ordinal()];
        if (i == 1) {
            eVar = this.f3287f;
        } else if (i != 2) {
            return false;
        } else {
            eVar = this.f3288g;
        }
        return eVar.b(c2);
    }

    public c.d.e.c<Void> c(c.d.j.o.c cVar, Object obj) {
        return a(cVar, obj, c.d.j.e.d.MEDIUM);
    }

    public void c() {
        a aVar = new a(this);
        this.f3285d.a(aVar);
        this.f3286e.a(aVar);
    }

    public String d() {
        return String.valueOf(this.i.getAndIncrement());
    }

    public p<c.d.b.a.d, c.d.j.k.b> e() {
        return this.f3285d;
    }

    public c.d.j.d.f f() {
        return this.f3289h;
    }
}
