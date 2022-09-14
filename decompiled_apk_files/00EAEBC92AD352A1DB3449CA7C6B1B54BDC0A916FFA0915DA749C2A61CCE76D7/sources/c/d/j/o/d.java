package c.d.j.o;

import android.net.Uri;
import c.d.j.f.i;
import c.d.j.o.c;
/* loaded from: classes.dex */
public class d {
    private c.d.j.l.c n;

    /* renamed from: a  reason: collision with root package name */
    private Uri f3649a = null;

    /* renamed from: b  reason: collision with root package name */
    private c.b f3650b = c.b.FULL_FETCH;

    /* renamed from: c  reason: collision with root package name */
    private c.d.j.e.e f3651c = null;

    /* renamed from: d  reason: collision with root package name */
    private c.d.j.e.f f3652d = null;

    /* renamed from: e  reason: collision with root package name */
    private c.d.j.e.b f3653e = c.d.j.e.b.a();

    /* renamed from: f  reason: collision with root package name */
    private c.a f3654f = c.a.DEFAULT;

    /* renamed from: g  reason: collision with root package name */
    private boolean f3655g = i.C().a();

    /* renamed from: h  reason: collision with root package name */
    private boolean f3656h = false;
    private c.d.j.e.d i = c.d.j.e.d.HIGH;
    private e j = null;
    private boolean k = true;
    private boolean l = true;
    private Boolean m = null;
    private c.d.j.e.a o = null;
    private Boolean p = null;

    /* loaded from: classes.dex */
    public static class a extends RuntimeException {
        public a(String str) {
            super("Invalid request builder: " + str);
        }
    }

    private d() {
    }

    public static d a(c cVar) {
        d b2 = b(cVar.p());
        b2.a(cVar.c());
        b2.a(cVar.a());
        b2.a(cVar.b());
        b2.b(cVar.d());
        b2.a(cVar.e());
        b2.a(cVar.f());
        b2.c(cVar.j());
        b2.a(cVar.i());
        b2.a(cVar.l());
        b2.a(cVar.k());
        b2.a(cVar.n());
        b2.a(cVar.t());
        return b2;
    }

    public static d b(Uri uri) {
        d dVar = new d();
        dVar.a(uri);
        return dVar;
    }

    public c a() {
        r();
        return new c(this);
    }

    public d a(Uri uri) {
        c.d.d.d.i.a(uri);
        this.f3649a = uri;
        return this;
    }

    public d a(c.d.j.e.a aVar) {
        this.o = aVar;
        return this;
    }

    public d a(c.d.j.e.b bVar) {
        this.f3653e = bVar;
        return this;
    }

    public d a(c.d.j.e.d dVar) {
        this.i = dVar;
        return this;
    }

    public d a(c.d.j.e.e eVar) {
        this.f3651c = eVar;
        return this;
    }

    public d a(c.d.j.e.f fVar) {
        this.f3652d = fVar;
        return this;
    }

    public d a(c.d.j.l.c cVar) {
        this.n = cVar;
        return this;
    }

    public d a(c.a aVar) {
        this.f3654f = aVar;
        return this;
    }

    public d a(c.b bVar) {
        this.f3650b = bVar;
        return this;
    }

    public d a(e eVar) {
        this.j = eVar;
        return this;
    }

    public d a(Boolean bool) {
        this.m = bool;
        return this;
    }

    @Deprecated
    public d a(boolean z) {
        a(z ? c.d.j.e.f.e() : c.d.j.e.f.g());
        return this;
    }

    public c.d.j.e.a b() {
        return this.o;
    }

    public d b(boolean z) {
        this.f3656h = z;
        return this;
    }

    public c.a c() {
        return this.f3654f;
    }

    public d c(boolean z) {
        this.f3655g = z;
        return this;
    }

    public c.d.j.e.b d() {
        return this.f3653e;
    }

    public c.b e() {
        return this.f3650b;
    }

    public e f() {
        return this.j;
    }

    public c.d.j.l.c g() {
        return this.n;
    }

    public c.d.j.e.d h() {
        return this.i;
    }

    public c.d.j.e.e i() {
        return this.f3651c;
    }

    public Boolean j() {
        return this.p;
    }

    public c.d.j.e.f k() {
        return this.f3652d;
    }

    public Uri l() {
        return this.f3649a;
    }

    public boolean m() {
        return this.k && c.d.d.k.f.i(this.f3649a);
    }

    public boolean n() {
        return this.f3656h;
    }

    public boolean o() {
        return this.l;
    }

    public boolean p() {
        return this.f3655g;
    }

    public Boolean q() {
        return this.m;
    }

    protected void r() {
        Uri uri = this.f3649a;
        if (uri != null) {
            if (c.d.d.k.f.h(uri)) {
                if (!this.f3649a.isAbsolute()) {
                    throw new a("Resource URI path must be absolute.");
                }
                if (this.f3649a.getPath().isEmpty()) {
                    throw new a("Resource URI must not be empty");
                }
                try {
                    Integer.parseInt(this.f3649a.getPath().substring(1));
                } catch (NumberFormatException unused) {
                    throw new a("Resource URI path must be a resource id.");
                }
            }
            if (c.d.d.k.f.c(this.f3649a) && !this.f3649a.isAbsolute()) {
                throw new a("Asset URI path must be absolute.");
            }
            return;
        }
        throw new a("Source must be set!");
    }
}
