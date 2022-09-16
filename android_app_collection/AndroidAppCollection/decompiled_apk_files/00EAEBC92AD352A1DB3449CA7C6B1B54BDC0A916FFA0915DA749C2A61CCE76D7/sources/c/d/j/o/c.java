package c.d.j.o;

import android.net.Uri;
import c.d.d.d.h;
import java.io.File;
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private final a f3632a;

    /* renamed from: b  reason: collision with root package name */
    private final Uri f3633b;

    /* renamed from: c  reason: collision with root package name */
    private final int f3634c;

    /* renamed from: d  reason: collision with root package name */
    private File f3635d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f3636e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f3637f;

    /* renamed from: g  reason: collision with root package name */
    private final c.d.j.e.b f3638g;

    /* renamed from: h  reason: collision with root package name */
    private final c.d.j.e.e f3639h;
    private final c.d.j.e.f i;
    private final c.d.j.e.a j;
    private final c.d.j.e.d k;
    private final b l;
    private final boolean m;
    private final boolean n;
    private final Boolean o;
    private final e p;
    private final c.d.j.l.c q;
    private final Boolean r;

    /* loaded from: classes.dex */
    public enum a {
        SMALL,
        DEFAULT
    }

    /* loaded from: classes.dex */
    public enum b {
        FULL_FETCH(1),
        DISK_CACHE(2),
        ENCODED_MEMORY_CACHE(3),
        BITMAP_MEMORY_CACHE(4);
        

        /* renamed from: b  reason: collision with root package name */
        private int f3648b;

        b(int i) {
            this.f3648b = i;
        }

        public static b a(b bVar, b bVar2) {
            return bVar.a() > bVar2.a() ? bVar : bVar2;
        }

        public int a() {
            return this.f3648b;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public c(d dVar) {
        this.f3632a = dVar.c();
        this.f3633b = dVar.l();
        this.f3634c = b(this.f3633b);
        this.f3636e = dVar.p();
        this.f3637f = dVar.n();
        this.f3638g = dVar.d();
        this.f3639h = dVar.i();
        this.i = dVar.k() == null ? c.d.j.e.f.e() : dVar.k();
        this.j = dVar.b();
        this.k = dVar.h();
        this.l = dVar.e();
        this.m = dVar.m();
        this.n = dVar.o();
        this.o = dVar.q();
        this.p = dVar.f();
        this.q = dVar.g();
        this.r = dVar.j();
    }

    public static c a(Uri uri) {
        if (uri == null) {
            return null;
        }
        return d.b(uri).a();
    }

    private static int b(Uri uri) {
        if (uri == null) {
            return -1;
        }
        if (c.d.d.k.f.i(uri)) {
            return 0;
        }
        if (c.d.d.k.f.g(uri)) {
            return c.d.d.f.a.c(c.d.d.f.a.b(uri.getPath())) ? 2 : 3;
        } else if (c.d.d.k.f.f(uri)) {
            return 4;
        } else {
            if (c.d.d.k.f.c(uri)) {
                return 5;
            }
            if (c.d.d.k.f.h(uri)) {
                return 6;
            }
            if (c.d.d.k.f.b(uri)) {
                return 7;
            }
            return c.d.d.k.f.j(uri) ? 8 : -1;
        }
    }

    public c.d.j.e.a a() {
        return this.j;
    }

    public a b() {
        return this.f3632a;
    }

    public c.d.j.e.b c() {
        return this.f3638g;
    }

    public boolean d() {
        return this.f3637f;
    }

    public b e() {
        return this.l;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!h.a(this.f3633b, cVar.f3633b) || !h.a(this.f3632a, cVar.f3632a) || !h.a(this.f3635d, cVar.f3635d) || !h.a(this.j, cVar.j) || !h.a(this.f3638g, cVar.f3638g) || !h.a(this.f3639h, cVar.f3639h) || !h.a(this.i, cVar.i)) {
            return false;
        }
        e eVar = this.p;
        c.d.b.a.d dVar = null;
        c.d.b.a.d a2 = eVar != null ? eVar.a() : null;
        e eVar2 = cVar.p;
        if (eVar2 != null) {
            dVar = eVar2.a();
        }
        return h.a(a2, dVar);
    }

    public e f() {
        return this.p;
    }

    public int g() {
        c.d.j.e.e eVar = this.f3639h;
        if (eVar != null) {
            return eVar.f3267b;
        }
        return 2048;
    }

    public int h() {
        c.d.j.e.e eVar = this.f3639h;
        if (eVar != null) {
            return eVar.f3266a;
        }
        return 2048;
    }

    public int hashCode() {
        e eVar = this.p;
        return h.a(this.f3632a, this.f3633b, this.f3635d, this.j, this.f3638g, this.f3639h, this.i, eVar != null ? eVar.a() : null, this.r);
    }

    public c.d.j.e.d i() {
        return this.k;
    }

    public boolean j() {
        return this.f3636e;
    }

    public c.d.j.l.c k() {
        return this.q;
    }

    public c.d.j.e.e l() {
        return this.f3639h;
    }

    public Boolean m() {
        return this.r;
    }

    public c.d.j.e.f n() {
        return this.i;
    }

    public synchronized File o() {
        if (this.f3635d == null) {
            this.f3635d = new File(this.f3633b.getPath());
        }
        return this.f3635d;
    }

    public Uri p() {
        return this.f3633b;
    }

    public int q() {
        return this.f3634c;
    }

    public boolean r() {
        return this.m;
    }

    public boolean s() {
        return this.n;
    }

    public Boolean t() {
        return this.o;
    }

    public String toString() {
        h.b a2 = h.a(this);
        a2.a("uri", this.f3633b);
        a2.a("cacheChoice", this.f3632a);
        a2.a("decodeOptions", this.f3638g);
        a2.a("postprocessor", this.p);
        a2.a("priority", this.k);
        a2.a("resizeOptions", this.f3639h);
        a2.a("rotationOptions", this.i);
        a2.a("bytesRange", this.j);
        a2.a("resizingAllowedOverride", this.r);
        return a2.toString();
    }
}
