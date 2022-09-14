package c.d.h.c;

import android.content.Context;
import android.graphics.drawable.Animatable;
import c.d.d.d.h;
import c.d.d.d.i;
import c.d.d.d.l;
import c.d.e.g;
import c.d.h.c.b;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
/* loaded from: classes.dex */
public abstract class b<BUILDER extends b<BUILDER, REQUEST, IMAGE, INFO>, REQUEST, IMAGE, INFO> implements c.d.h.h.d {
    private static final d<Object> p = new a();
    private static final NullPointerException q = new NullPointerException("No image request was specified!");
    private static final AtomicLong r = new AtomicLong();

    /* renamed from: a  reason: collision with root package name */
    private final Context f2986a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<d> f2987b;

    /* renamed from: c  reason: collision with root package name */
    private Object f2988c;

    /* renamed from: d  reason: collision with root package name */
    private REQUEST f2989d;

    /* renamed from: e  reason: collision with root package name */
    private REQUEST f2990e;

    /* renamed from: f  reason: collision with root package name */
    private REQUEST[] f2991f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f2992g;

    /* renamed from: h  reason: collision with root package name */
    private l<c.d.e.c<IMAGE>> f2993h;
    private d<? super INFO> i;
    private e j;
    private boolean k;
    private boolean l;
    private boolean m;
    private String n;
    private c.d.h.h.a o;

    /* loaded from: classes.dex */
    static class a extends c.d.h.c.c<Object> {
        a() {
        }

        @Override // c.d.h.c.c, c.d.h.c.d
        public void a(String str, Object obj, Animatable animatable) {
            if (animatable != null) {
                animatable.start();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c.d.h.c.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0077b implements l<c.d.e.c<IMAGE>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c.d.h.h.a f2994a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f2995b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Object f2996c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Object f2997d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ c f2998e;

        C0077b(c.d.h.h.a aVar, String str, Object obj, Object obj2, c cVar) {
            this.f2994a = aVar;
            this.f2995b = str;
            this.f2996c = obj;
            this.f2997d = obj2;
            this.f2998e = cVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // c.d.d.d.l
        /* renamed from: get */
        public c.d.e.c<IMAGE> mo139get() {
            return b.this.a(this.f2994a, this.f2995b, this.f2996c, this.f2997d, this.f2998e);
        }

        public String toString() {
            h.b a2 = h.a(this);
            a2.a("request", this.f2996c.toString());
            return a2.toString();
        }
    }

    /* loaded from: classes.dex */
    public enum c {
        FULL_FETCH,
        DISK_CACHE,
        BITMAP_MEMORY_CACHE
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public b(Context context, Set<d> set) {
        this.f2986a = context;
        this.f2987b = set;
        n();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static String m() {
        return String.valueOf(r.getAndIncrement());
    }

    private void n() {
        this.f2988c = null;
        this.f2989d = null;
        this.f2990e = null;
        this.f2991f = null;
        this.f2992g = true;
        this.i = null;
        this.j = null;
        this.k = false;
        this.l = false;
        this.o = null;
        this.n = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public l<c.d.e.c<IMAGE>> a(c.d.h.h.a aVar, String str) {
        l<c.d.e.c<IMAGE>> lVar = this.f2993h;
        if (lVar != null) {
            return lVar;
        }
        l<c.d.e.c<IMAGE>> lVar2 = null;
        REQUEST request = this.f2989d;
        if (request != null) {
            lVar2 = a(aVar, str, request);
        } else {
            REQUEST[] requestArr = this.f2991f;
            if (requestArr != null) {
                lVar2 = a(aVar, str, requestArr, this.f2992g);
            }
        }
        if (lVar2 != null && this.f2990e != null) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(lVar2);
            arrayList.add(a(aVar, str, this.f2990e));
            lVar2 = g.a(arrayList, false);
        }
        return lVar2 == null ? c.d.e.d.a(q) : lVar2;
    }

    protected l<c.d.e.c<IMAGE>> a(c.d.h.h.a aVar, String str, REQUEST request) {
        return a(aVar, str, (String) request, c.FULL_FETCH);
    }

    protected l<c.d.e.c<IMAGE>> a(c.d.h.h.a aVar, String str, REQUEST request, c cVar) {
        return new C0077b(aVar, str, request, c(), cVar);
    }

    protected l<c.d.e.c<IMAGE>> a(c.d.h.h.a aVar, String str, REQUEST[] requestArr, boolean z) {
        ArrayList arrayList = new ArrayList(requestArr.length * 2);
        if (z) {
            for (REQUEST request : requestArr) {
                arrayList.add(a(aVar, str, (String) request, c.BITMAP_MEMORY_CACHE));
            }
        }
        for (REQUEST request2 : requestArr) {
            arrayList.add(a(aVar, str, request2));
        }
        return c.d.e.f.a(arrayList);
    }

    protected abstract c.d.e.c<IMAGE> a(c.d.h.h.a aVar, String str, REQUEST request, Object obj, c cVar);

    @Override // c.d.h.h.d
    /* renamed from: a */
    public c.d.h.c.a mo132a() {
        REQUEST request;
        l();
        if (this.f2989d == null && this.f2991f == null && (request = this.f2990e) != null) {
            this.f2989d = request;
            this.f2990e = null;
        }
        return b();
    }

    public BUILDER a(d<? super INFO> dVar) {
        this.i = dVar;
        i();
        return this;
    }

    @Override // c.d.h.h.d
    /* renamed from: a */
    public BUILDER mo133a(c.d.h.h.a aVar) {
        this.o = aVar;
        i();
        return this;
    }

    public BUILDER a(Object obj) {
        this.f2988c = obj;
        i();
        return this;
    }

    public BUILDER a(boolean z) {
        this.l = z;
        i();
        return this;
    }

    @Override // c.d.h.h.d
    /* renamed from: a  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ c.d.h.h.d mo133a(c.d.h.h.a aVar) {
        mo133a(aVar);
        return this;
    }

    protected void a(c.d.h.c.a aVar) {
        Set<d> set = this.f2987b;
        if (set != null) {
            for (d dVar : set) {
                aVar.a(dVar);
            }
        }
        d<? super INFO> dVar2 = this.i;
        if (dVar2 != null) {
            aVar.a((d) dVar2);
        }
        if (this.l) {
            aVar.a((d) p);
        }
    }

    protected c.d.h.c.a b() {
        if (c.d.j.p.b.c()) {
            c.d.j.p.b.a("AbstractDraweeControllerBuilder#buildController");
        }
        c.d.h.c.a mo130j = mo130j();
        mo130j.a(h());
        mo130j.a(d());
        mo130j.a(e());
        c(mo130j);
        a(mo130j);
        if (c.d.j.p.b.c()) {
            c.d.j.p.b.a();
        }
        return mo130j;
    }

    public BUILDER b(REQUEST request) {
        this.f2989d = request;
        i();
        return this;
    }

    protected void b(c.d.h.c.a aVar) {
        if (aVar.j() == null) {
            aVar.a(c.d.h.g.a.a(this.f2986a));
        }
    }

    public BUILDER c(REQUEST request) {
        this.f2990e = request;
        i();
        return this;
    }

    public Object c() {
        return this.f2988c;
    }

    protected void c(c.d.h.c.a aVar) {
        if (!this.k) {
            return;
        }
        aVar.l().a(this.k);
        b(aVar);
    }

    public String d() {
        return this.n;
    }

    public e e() {
        return this.j;
    }

    public REQUEST f() {
        return this.f2989d;
    }

    public c.d.h.h.a g() {
        return this.o;
    }

    public boolean h() {
        return this.m;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final BUILDER i() {
        return this;
    }

    /* renamed from: j */
    protected abstract c.d.h.c.a mo130j();

    public BUILDER k() {
        n();
        i();
        return this;
    }

    protected void l() {
        boolean z = false;
        i.b(this.f2991f == null || this.f2989d == null, "Cannot specify both ImageRequest and FirstAvailableImageRequests!");
        if (this.f2993h == null || (this.f2991f == null && this.f2989d == null && this.f2990e == null)) {
            z = true;
        }
        i.b(z, "Cannot specify DataSourceSupplier with other ImageRequests! Use one or the other.");
    }
}
