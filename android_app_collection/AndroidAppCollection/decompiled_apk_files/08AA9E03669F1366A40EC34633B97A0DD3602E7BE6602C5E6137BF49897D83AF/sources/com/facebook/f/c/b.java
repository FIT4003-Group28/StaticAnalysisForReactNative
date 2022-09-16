package com.facebook.f.c;

import android.content.Context;
import android.graphics.drawable.Animatable;
import com.facebook.c.g;
import com.facebook.common.d.h;
import com.facebook.common.d.i;
import com.facebook.common.d.k;
import com.facebook.f.c.b;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: AbstractDraweeControllerBuilder.java */
/* loaded from: classes.dex */
public abstract class b<BUILDER extends b<BUILDER, REQUEST, IMAGE, INFO>, REQUEST, IMAGE, INFO> implements com.facebook.f.h.d {

    /* renamed from: a  reason: collision with root package name */
    private static final d<Object> f2388a = new c<Object>() { // from class: com.facebook.f.c.b.1
        @Override // com.facebook.f.c.c, com.facebook.f.c.d
        public void a(String str, Object obj, Animatable animatable) {
            if (animatable != null) {
                animatable.start();
            }
        }
    };

    /* renamed from: b  reason: collision with root package name */
    private static final NullPointerException f2389b = new NullPointerException("No image request was specified!");
    private static final AtomicLong r = new AtomicLong();

    /* renamed from: c  reason: collision with root package name */
    private final Context f2390c;

    /* renamed from: d  reason: collision with root package name */
    private final Set<d> f2391d;
    private Object e;
    private REQUEST f;
    private REQUEST g;
    private REQUEST[] h;
    private boolean i;
    private k<com.facebook.c.c<IMAGE>> j;
    private d<? super INFO> k;
    private e l;
    private boolean m;
    private boolean n;
    private boolean o;
    private String p;
    private com.facebook.f.h.a q;

    /* compiled from: AbstractDraweeControllerBuilder.java */
    /* loaded from: classes.dex */
    public enum a {
        FULL_FETCH,
        DISK_CACHE,
        BITMAP_MEMORY_CACHE
    }

    protected abstract com.facebook.c.c<IMAGE> a(REQUEST request, Object obj, a aVar);

    protected abstract BUILDER c();

    protected abstract com.facebook.f.c.a d();

    /* JADX INFO: Access modifiers changed from: protected */
    public b(Context context, Set<d> set) {
        this.f2390c = context;
        this.f2391d = set;
        a();
    }

    private void a() {
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = true;
        this.k = null;
        this.l = null;
        this.m = false;
        this.n = false;
        this.q = null;
        this.p = null;
    }

    public BUILDER e() {
        a();
        return c();
    }

    @Override // com.facebook.f.h.d
    /* renamed from: a */
    public BUILDER e(Object obj) {
        this.e = obj;
        return c();
    }

    public Object f() {
        return this.e;
    }

    public BUILDER b(REQUEST request) {
        this.f = request;
        return c();
    }

    public REQUEST g() {
        return this.f;
    }

    public BUILDER c(REQUEST request) {
        this.g = request;
        return c();
    }

    public boolean h() {
        return this.o;
    }

    public BUILDER a(boolean z) {
        this.n = z;
        return c();
    }

    public BUILDER a(d<? super INFO> dVar) {
        this.k = dVar;
        return c();
    }

    public e i() {
        return this.l;
    }

    public String j() {
        return this.p;
    }

    @Override // com.facebook.f.h.d
    /* renamed from: a */
    public BUILDER b(com.facebook.f.h.a aVar) {
        this.q = aVar;
        return c();
    }

    public com.facebook.f.h.a k() {
        return this.q;
    }

    @Override // com.facebook.f.h.d
    /* renamed from: l */
    public com.facebook.f.c.a q() {
        m();
        if (this.f == null && this.h == null && this.g != null) {
            this.f = this.g;
            this.g = null;
        }
        return n();
    }

    protected void m() {
        boolean z = true;
        i.b(this.h == null || this.f == null, "Cannot specify both ImageRequest and FirstAvailableImageRequests!");
        if (this.j != null && (this.h != null || this.f != null || this.g != null)) {
            z = false;
        }
        i.b(z, "Cannot specify DataSourceSupplier with other ImageRequests! Use one or the other.");
    }

    protected com.facebook.f.c.a n() {
        com.facebook.f.c.a d2 = d();
        d2.b(h());
        d2.a(j());
        d2.a(i());
        b(d2);
        a(d2);
        return d2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static String o() {
        return String.valueOf(r.getAndIncrement());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public k<com.facebook.c.c<IMAGE>> p() {
        if (this.j != null) {
            return this.j;
        }
        k<com.facebook.c.c<IMAGE>> kVar = null;
        if (this.f != null) {
            kVar = d(this.f);
        } else if (this.h != null) {
            kVar = a(this.h, this.i);
        }
        if (kVar != null && this.g != null) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(kVar);
            arrayList.add(d(this.g));
            kVar = g.a(arrayList);
        }
        return kVar == null ? com.facebook.c.d.b(f2389b) : kVar;
    }

    protected k<com.facebook.c.c<IMAGE>> a(REQUEST[] requestArr, boolean z) {
        ArrayList arrayList = new ArrayList(requestArr.length * 2);
        if (z) {
            for (REQUEST request : requestArr) {
                arrayList.add(a((b<BUILDER, REQUEST, IMAGE, INFO>) request, a.BITMAP_MEMORY_CACHE));
            }
        }
        for (REQUEST request2 : requestArr) {
            arrayList.add(d(request2));
        }
        return com.facebook.c.f.a(arrayList);
    }

    protected k<com.facebook.c.c<IMAGE>> d(REQUEST request) {
        return a((b<BUILDER, REQUEST, IMAGE, INFO>) request, a.FULL_FETCH);
    }

    protected k<com.facebook.c.c<IMAGE>> a(final REQUEST request, final a aVar) {
        final Object f = f();
        return new k<com.facebook.c.c<IMAGE>>() { // from class: com.facebook.f.c.b.2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.facebook.common.d.k
            /* renamed from: a */
            public com.facebook.c.c<IMAGE> b() {
                return b.this.a(request, f, aVar);
            }

            public String toString() {
                return h.a(this).a("request", request.toString()).toString();
            }
        };
    }

    protected void a(com.facebook.f.c.a aVar) {
        if (this.f2391d != null) {
            for (d dVar : this.f2391d) {
                aVar.a(dVar);
            }
        }
        if (this.k != null) {
            aVar.a((d) this.k);
        }
        if (this.n) {
            aVar.a((d) f2388a);
        }
    }

    protected void b(com.facebook.f.c.a aVar) {
        if (!this.m) {
            return;
        }
        com.facebook.f.b.c f = aVar.f();
        if (f == null) {
            f = new com.facebook.f.b.c();
            aVar.a(f);
        }
        f.a(this.m);
        c(aVar);
    }

    protected void c(com.facebook.f.c.a aVar) {
        if (aVar.g() == null) {
            aVar.a(com.facebook.f.g.a.a(this.f2390c));
        }
    }
}
