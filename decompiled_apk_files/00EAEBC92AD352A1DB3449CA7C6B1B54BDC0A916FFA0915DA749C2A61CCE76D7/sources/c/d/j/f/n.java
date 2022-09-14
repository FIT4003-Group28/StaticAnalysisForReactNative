package c.d.j.f;

import android.content.ContentResolver;
import android.net.Uri;
import c.d.j.n.f0;
import c.d.j.n.j0;
import c.d.j.n.o;
import c.d.j.n.t0;
import c.d.j.n.w0;
import c.d.j.o.c;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class n {

    /* renamed from: a  reason: collision with root package name */
    private final ContentResolver f3347a;

    /* renamed from: b  reason: collision with root package name */
    private final m f3348b;

    /* renamed from: c  reason: collision with root package name */
    private final f0 f3349c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f3350d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f3351e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f3352f;

    /* renamed from: g  reason: collision with root package name */
    private final t0 f3353g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f3354h;
    private final boolean i;
    private final boolean j;
    private final c.d.j.q.d k;
    j0<c.d.d.h.a<c.d.j.k.b>> l;
    j0<c.d.j.k.d> m;
    j0<c.d.j.k.d> n;
    j0<Void> o;
    j0<Void> p;
    private j0<c.d.j.k.d> q;
    j0<c.d.d.h.a<c.d.j.k.b>> r;
    j0<c.d.d.h.a<c.d.j.k.b>> s;
    j0<c.d.d.h.a<c.d.j.k.b>> t;
    j0<c.d.d.h.a<c.d.j.k.b>> u;
    j0<c.d.d.h.a<c.d.j.k.b>> v;
    j0<c.d.d.h.a<c.d.j.k.b>> w;
    j0<c.d.d.h.a<c.d.j.k.b>> x;
    Map<j0<c.d.d.h.a<c.d.j.k.b>>, j0<c.d.d.h.a<c.d.j.k.b>>> y = new HashMap();
    Map<j0<c.d.d.h.a<c.d.j.k.b>>, j0<c.d.d.h.a<c.d.j.k.b>>> z;

    public n(ContentResolver contentResolver, m mVar, f0 f0Var, boolean z, boolean z2, t0 t0Var, boolean z3, boolean z4, boolean z5, boolean z6, c.d.j.q.d dVar) {
        this.f3347a = contentResolver;
        this.f3348b = mVar;
        this.f3349c = f0Var;
        this.f3350d = z;
        this.f3351e = z2;
        new HashMap();
        this.z = new HashMap();
        this.f3353g = t0Var;
        this.f3354h = z3;
        this.i = z4;
        this.f3352f = z5;
        this.j = z6;
        this.k = dVar;
    }

    private synchronized j0<c.d.j.k.d> a() {
        if (c.d.j.p.b.c()) {
            c.d.j.p.b.a("ProducerSequenceFactory#getBackgroundLocalFileFetchToEncodeMemorySequence");
        }
        if (this.m == null) {
            if (c.d.j.p.b.c()) {
                c.d.j.p.b.a("ProducerSequenceFactory#getBackgroundLocalFileFetchToEncodeMemorySequence:init");
            }
            this.m = this.f3348b.a(g(this.f3348b.f()), this.f3353g);
            if (c.d.j.p.b.c()) {
                c.d.j.p.b.a();
            }
        }
        if (c.d.j.p.b.c()) {
            c.d.j.p.b.a();
        }
        return this.m;
    }

    private synchronized j0<c.d.d.h.a<c.d.j.k.b>> a(j0<c.d.d.h.a<c.d.j.k.b>> j0Var) {
        j0<c.d.d.h.a<c.d.j.k.b>> j0Var2;
        j0Var2 = this.z.get(j0Var);
        if (j0Var2 == null) {
            j0Var2 = this.f3348b.d(j0Var);
            this.z.put(j0Var, j0Var2);
        }
        return j0Var2;
    }

    private j0<c.d.d.h.a<c.d.j.k.b>> a(j0<c.d.j.k.d> j0Var, w0<c.d.j.k.d>[] w0VarArr) {
        return d(b(g(j0Var), w0VarArr));
    }

    private j0<c.d.j.k.d> a(w0<c.d.j.k.d>[] w0VarArr) {
        return this.f3348b.a(this.f3348b.a(w0VarArr), true, this.k);
    }

    private static String a(Uri uri) {
        String valueOf = String.valueOf(uri);
        if (valueOf.length() > 30) {
            return valueOf.substring(0, 30) + "...";
        }
        return valueOf;
    }

    private synchronized j0<c.d.j.k.d> b() {
        if (c.d.j.p.b.c()) {
            c.d.j.p.b.a("ProducerSequenceFactory#getBackgroundNetworkFetchToEncodedMemorySequence");
        }
        if (this.n == null) {
            if (c.d.j.p.b.c()) {
                c.d.j.p.b.a("ProducerSequenceFactory#getBackgroundNetworkFetchToEncodedMemorySequence:init");
            }
            this.n = this.f3348b.a(c(), this.f3353g);
            if (c.d.j.p.b.c()) {
                c.d.j.p.b.a();
            }
        }
        if (c.d.j.p.b.c()) {
            c.d.j.p.b.a();
        }
        return this.n;
    }

    private synchronized j0<c.d.d.h.a<c.d.j.k.b>> b(j0<c.d.d.h.a<c.d.j.k.b>> j0Var) {
        if (!this.y.containsKey(j0Var)) {
            this.y.put(j0Var, this.f3348b.k(this.f3348b.l(j0Var)));
        }
        return this.y.get(j0Var);
    }

    private j0<c.d.j.k.d> b(j0<c.d.j.k.d> j0Var, w0<c.d.j.k.d>[] w0VarArr) {
        return m.a(a(w0VarArr), this.f3348b.m(this.f3348b.a(m.o(j0Var), true, this.k)));
    }

    private synchronized j0<c.d.j.k.d> c() {
        if (c.d.j.p.b.c()) {
            c.d.j.p.b.a("ProducerSequenceFactory#getCommonNetworkFetchToEncodedMemorySequence");
        }
        if (this.q == null) {
            if (c.d.j.p.b.c()) {
                c.d.j.p.b.a("ProducerSequenceFactory#getCommonNetworkFetchToEncodedMemorySequence:init");
            }
            this.q = m.o(g(this.f3348b.a(this.f3349c)));
            this.q = this.f3348b.a(this.q, this.f3350d && !this.f3354h, this.k);
            if (c.d.j.p.b.c()) {
                c.d.j.p.b.a();
            }
        }
        if (c.d.j.p.b.c()) {
            c.d.j.p.b.a();
        }
        return this.q;
    }

    private j0<c.d.d.h.a<c.d.j.k.b>> c(j0<c.d.d.h.a<c.d.j.k.b>> j0Var) {
        return this.f3348b.a(this.f3348b.a(this.f3348b.b(this.f3348b.c(j0Var)), this.f3353g));
    }

    private j0<c.d.d.h.a<c.d.j.k.b>> c(c.d.j.o.c cVar) {
        try {
            if (c.d.j.p.b.c()) {
                c.d.j.p.b.a("ProducerSequenceFactory#getBasicDecodedImageSequence");
            }
            c.d.d.d.i.a(cVar);
            Uri p = cVar.p();
            c.d.d.d.i.a(p, "Uri is null.");
            int q = cVar.q();
            if (q == 0) {
                j0<c.d.d.h.a<c.d.j.k.b>> k = k();
                if (c.d.j.p.b.c()) {
                    c.d.j.p.b.a();
                }
                return k;
            }
            switch (q) {
                case 2:
                    j0<c.d.d.h.a<c.d.j.k.b>> j = j();
                    if (c.d.j.p.b.c()) {
                        c.d.j.p.b.a();
                    }
                    return j;
                case 3:
                    j0<c.d.d.h.a<c.d.j.k.b>> h2 = h();
                    if (c.d.j.p.b.c()) {
                        c.d.j.p.b.a();
                    }
                    return h2;
                case 4:
                    if (c.d.d.f.a.c(this.f3347a.getType(p))) {
                        j0<c.d.d.h.a<c.d.j.k.b>> j2 = j();
                        if (c.d.j.p.b.c()) {
                            c.d.j.p.b.a();
                        }
                        return j2;
                    }
                    j0<c.d.d.h.a<c.d.j.k.b>> f2 = f();
                    if (c.d.j.p.b.c()) {
                        c.d.j.p.b.a();
                    }
                    return f2;
                case 5:
                    j0<c.d.d.h.a<c.d.j.k.b>> e2 = e();
                    if (c.d.j.p.b.c()) {
                        c.d.j.p.b.a();
                    }
                    return e2;
                case 6:
                    j0<c.d.d.h.a<c.d.j.k.b>> i = i();
                    if (c.d.j.p.b.c()) {
                        c.d.j.p.b.a();
                    }
                    return i;
                case 7:
                    j0<c.d.d.h.a<c.d.j.k.b>> d2 = d();
                    if (c.d.j.p.b.c()) {
                        c.d.j.p.b.a();
                    }
                    return d2;
                case 8:
                    return m();
                default:
                    throw new IllegalArgumentException("Unsupported uri scheme! Uri is: " + a(p));
            }
        } finally {
            if (c.d.j.p.b.c()) {
                c.d.j.p.b.a();
            }
        }
    }

    private synchronized j0<c.d.d.h.a<c.d.j.k.b>> d() {
        if (this.w == null) {
            j0<c.d.j.k.d> a2 = this.f3348b.a();
            if (c.d.d.l.c.f2870a && (!this.f3351e || c.d.d.l.c.f2871b == null)) {
                a2 = this.f3348b.n(a2);
            }
            this.w = d(this.f3348b.a(m.o(a2), true, this.k));
        }
        return this.w;
    }

    private j0<c.d.d.h.a<c.d.j.k.b>> d(j0<c.d.j.k.d> j0Var) {
        if (c.d.j.p.b.c()) {
            c.d.j.p.b.a("ProducerSequenceFactory#newBitmapCacheGetToDecodeSequence");
        }
        j0<c.d.d.h.a<c.d.j.k.b>> c2 = c(this.f3348b.e(j0Var));
        if (c.d.j.p.b.c()) {
            c.d.j.p.b.a();
        }
        return c2;
    }

    private static void d(c.d.j.o.c cVar) {
        c.d.d.d.i.a(cVar);
        c.d.d.d.i.a(cVar.e().a() <= c.b.ENCODED_MEMORY_CACHE.a());
    }

    private synchronized j0<c.d.d.h.a<c.d.j.k.b>> e() {
        if (this.v == null) {
            this.v = e(this.f3348b.b());
        }
        return this.v;
    }

    private j0<c.d.d.h.a<c.d.j.k.b>> e(j0<c.d.j.k.d> j0Var) {
        return a(j0Var, new w0[]{this.f3348b.e()});
    }

    private synchronized j0<c.d.d.h.a<c.d.j.k.b>> f() {
        if (this.t == null) {
            this.t = a(this.f3348b.c(), new w0[]{this.f3348b.d(), this.f3348b.e()});
        }
        return this.t;
    }

    private j0<c.d.j.k.d> f(j0<c.d.j.k.d> j0Var) {
        if (c.d.j.p.b.c()) {
            c.d.j.p.b.a("ProducerSequenceFactory#newDiskCacheSequence");
        }
        if (this.f3352f) {
            j0Var = this.f3348b.j(j0Var);
        }
        o f2 = this.f3348b.f(this.f3348b.g(j0Var));
        if (c.d.j.p.b.c()) {
            c.d.j.p.b.a();
        }
        return f2;
    }

    private synchronized j0<Void> g() {
        if (c.d.j.p.b.c()) {
            c.d.j.p.b.a("ProducerSequenceFactory#getLocalFileFetchToEncodedMemoryPrefetchSequence");
        }
        if (this.o == null) {
            if (c.d.j.p.b.c()) {
                c.d.j.p.b.a("ProducerSequenceFactory#getLocalFileFetchToEncodedMemoryPrefetchSequence:init");
            }
            this.o = m.p(a());
            if (c.d.j.p.b.c()) {
                c.d.j.p.b.a();
            }
        }
        if (c.d.j.p.b.c()) {
            c.d.j.p.b.a();
        }
        return this.o;
    }

    private j0<c.d.j.k.d> g(j0<c.d.j.k.d> j0Var) {
        if (c.d.d.l.c.f2870a && (!this.f3351e || c.d.d.l.c.f2871b == null)) {
            j0Var = this.f3348b.n(j0Var);
        }
        if (this.j) {
            j0Var = f(j0Var);
        }
        return this.f3348b.h(this.f3348b.i(j0Var));
    }

    private synchronized j0<c.d.d.h.a<c.d.j.k.b>> h() {
        if (this.r == null) {
            this.r = e(this.f3348b.f());
        }
        return this.r;
    }

    private synchronized j0<c.d.d.h.a<c.d.j.k.b>> i() {
        if (this.u == null) {
            this.u = e(this.f3348b.g());
        }
        return this.u;
    }

    private synchronized j0<c.d.d.h.a<c.d.j.k.b>> j() {
        if (this.s == null) {
            this.s = c(this.f3348b.h());
        }
        return this.s;
    }

    private synchronized j0<c.d.d.h.a<c.d.j.k.b>> k() {
        if (c.d.j.p.b.c()) {
            c.d.j.p.b.a("ProducerSequenceFactory#getNetworkFetchSequence");
        }
        if (this.l == null) {
            if (c.d.j.p.b.c()) {
                c.d.j.p.b.a("ProducerSequenceFactory#getNetworkFetchSequence:init");
            }
            this.l = d(c());
            if (c.d.j.p.b.c()) {
                c.d.j.p.b.a();
            }
        }
        if (c.d.j.p.b.c()) {
            c.d.j.p.b.a();
        }
        return this.l;
    }

    private synchronized j0<Void> l() {
        if (c.d.j.p.b.c()) {
            c.d.j.p.b.a("ProducerSequenceFactory#getNetworkFetchToEncodedMemoryPrefetchSequence");
        }
        if (this.p == null) {
            if (c.d.j.p.b.c()) {
                c.d.j.p.b.a("ProducerSequenceFactory#getNetworkFetchToEncodedMemoryPrefetchSequence:init");
            }
            this.p = m.p(b());
            if (c.d.j.p.b.c()) {
                c.d.j.p.b.a();
            }
        }
        if (c.d.j.p.b.c()) {
            c.d.j.p.b.a();
        }
        return this.p;
    }

    private synchronized j0<c.d.d.h.a<c.d.j.k.b>> m() {
        if (this.x == null) {
            this.x = e(this.f3348b.i());
        }
        return this.x;
    }

    public j0<c.d.d.h.a<c.d.j.k.b>> a(c.d.j.o.c cVar) {
        if (c.d.j.p.b.c()) {
            c.d.j.p.b.a("ProducerSequenceFactory#getDecodedImageProducerSequence");
        }
        j0<c.d.d.h.a<c.d.j.k.b>> c2 = c(cVar);
        if (cVar.f() != null) {
            c2 = b(c2);
        }
        if (this.i) {
            c2 = a(c2);
        }
        if (c.d.j.p.b.c()) {
            c.d.j.p.b.a();
        }
        return c2;
    }

    public j0<Void> b(c.d.j.o.c cVar) {
        d(cVar);
        int q = cVar.q();
        if (q != 0) {
            if (q == 2 || q == 3) {
                return g();
            }
            Uri p = cVar.p();
            throw new IllegalArgumentException("Unsupported uri scheme for encoded image fetch! Uri is: " + a(p));
        }
        return l();
    }
}
