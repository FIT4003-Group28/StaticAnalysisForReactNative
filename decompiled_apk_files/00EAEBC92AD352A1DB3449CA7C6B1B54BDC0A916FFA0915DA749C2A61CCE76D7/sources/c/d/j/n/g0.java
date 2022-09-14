package c.d.j.n;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public class g0 implements j0<c.d.j.k.d> {

    /* renamed from: a  reason: collision with root package name */
    private final c.d.j.d.e f3429a;

    /* renamed from: b  reason: collision with root package name */
    private final c.d.j.d.f f3430b;

    /* renamed from: c  reason: collision with root package name */
    private final c.d.d.g.h f3431c;

    /* renamed from: d  reason: collision with root package name */
    private final c.d.d.g.a f3432d;

    /* renamed from: e  reason: collision with root package name */
    private final j0<c.d.j.k.d> f3433e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements b.d<c.d.j.k.d, Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m0 f3434a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f3435b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k f3436c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ k0 f3437d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ c.d.b.a.d f3438e;

        a(m0 m0Var, String str, k kVar, k0 k0Var, c.d.b.a.d dVar) {
            this.f3434a = m0Var;
            this.f3435b = str;
            this.f3436c = kVar;
            this.f3437d = k0Var;
            this.f3438e = dVar;
        }

        @Override // b.d
        public Void a(b.f<c.d.j.k.d> fVar) {
            if (g0.b(fVar)) {
                this.f3434a.b(this.f3435b, "PartialDiskCacheProducer", null);
                this.f3436c.a();
            } else if (fVar.e()) {
                this.f3434a.a(this.f3435b, "PartialDiskCacheProducer", fVar.a(), null);
                g0.this.a(this.f3436c, this.f3437d, this.f3438e, (c.d.j.k.d) null);
            } else {
                c.d.j.k.d b2 = fVar.b();
                m0 m0Var = this.f3434a;
                String str = this.f3435b;
                if (b2 != null) {
                    m0Var.a(str, "PartialDiskCacheProducer", g0.a(m0Var, str, true, b2.z()));
                    c.d.j.e.a b3 = c.d.j.e.a.b(b2.z() - 1);
                    b2.a(b3);
                    int z = b2.z();
                    c.d.j.o.c f2 = this.f3437d.f();
                    if (b3.a(f2.a())) {
                        this.f3434a.a(this.f3435b, "PartialDiskCacheProducer", true);
                        this.f3436c.a(b2, 9);
                    } else {
                        this.f3436c.a(b2, 8);
                        c.d.j.o.d a2 = c.d.j.o.d.a(f2);
                        a2.a(c.d.j.e.a.a(z - 1));
                        g0.this.a(this.f3436c, new p0(a2.a(), this.f3437d), this.f3438e, b2);
                    }
                } else {
                    m0Var.a(str, "PartialDiskCacheProducer", g0.a(m0Var, str, false, 0));
                    g0.this.a(this.f3436c, this.f3437d, this.f3438e, b2);
                }
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AtomicBoolean f3440a;

        b(g0 g0Var, AtomicBoolean atomicBoolean) {
            this.f3440a = atomicBoolean;
        }

        @Override // c.d.j.n.l0
        public void a() {
            this.f3440a.set(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c extends n<c.d.j.k.d, c.d.j.k.d> {

        /* renamed from: c  reason: collision with root package name */
        private final c.d.j.d.e f3441c;

        /* renamed from: d  reason: collision with root package name */
        private final c.d.b.a.d f3442d;

        /* renamed from: e  reason: collision with root package name */
        private final c.d.d.g.h f3443e;

        /* renamed from: f  reason: collision with root package name */
        private final c.d.d.g.a f3444f;

        /* renamed from: g  reason: collision with root package name */
        private final c.d.j.k.d f3445g;

        private c(k<c.d.j.k.d> kVar, c.d.j.d.e eVar, c.d.b.a.d dVar, c.d.d.g.h hVar, c.d.d.g.a aVar, c.d.j.k.d dVar2) {
            super(kVar);
            this.f3441c = eVar;
            this.f3442d = dVar;
            this.f3443e = hVar;
            this.f3444f = aVar;
            this.f3445g = dVar2;
        }

        /* synthetic */ c(k kVar, c.d.j.d.e eVar, c.d.b.a.d dVar, c.d.d.g.h hVar, c.d.d.g.a aVar, c.d.j.k.d dVar2, a aVar2) {
            this(kVar, eVar, dVar, hVar, aVar, dVar2);
        }

        private c.d.d.g.j a(c.d.j.k.d dVar, c.d.j.k.d dVar2) {
            c.d.d.g.j mo192a = this.f3443e.mo192a(dVar2.z() + dVar2.c().f3244a);
            a(dVar.h(), mo192a, dVar2.c().f3244a);
            a(dVar2.h(), mo192a, dVar2.z());
            return mo192a;
        }

        private void a(c.d.d.g.j jVar) {
            c.d.j.k.d dVar;
            Throwable th;
            c.d.d.h.a a2 = c.d.d.h.a.a(jVar.mo193a());
            try {
                dVar = new c.d.j.k.d(a2);
                try {
                    dVar.C();
                    c().a(dVar, 1);
                    c.d.j.k.d.c(dVar);
                    c.d.d.h.a.b(a2);
                } catch (Throwable th2) {
                    th = th2;
                    c.d.j.k.d.c(dVar);
                    c.d.d.h.a.b(a2);
                    throw th;
                }
            } catch (Throwable th3) {
                dVar = null;
                th = th3;
            }
        }

        private void a(InputStream inputStream, OutputStream outputStream, int i) {
            byte[] mo186get = this.f3444f.mo186get(16384);
            int i2 = i;
            while (i2 > 0) {
                try {
                    int read = inputStream.read(mo186get, 0, Math.min(16384, i2));
                    if (read < 0) {
                        break;
                    } else if (read > 0) {
                        outputStream.write(mo186get, 0, read);
                        i2 -= read;
                    }
                } finally {
                    this.f3444f.a(mo186get);
                }
            }
            if (i2 <= 0) {
                return;
            }
            throw new IOException(String.format(null, "Failed to read %d bytes - finished %d short", Integer.valueOf(i), Integer.valueOf(i2)));
        }

        @Override // c.d.j.n.b
        /* renamed from: a */
        public void b(c.d.j.k.d dVar, int i) {
            if (c.d.j.n.b.b(i)) {
                return;
            }
            if (this.f3445g != null) {
                try {
                    if (dVar.c() != null) {
                        try {
                            a(a(this.f3445g, dVar));
                        } catch (IOException e2) {
                            c.d.d.e.a.b("PartialDiskCacheProducer", "Error while merging image data", e2);
                            c().a(e2);
                        }
                        this.f3441c.c(this.f3442d);
                        return;
                    }
                } finally {
                    dVar.close();
                    this.f3445g.close();
                }
            }
            if (c.d.j.n.b.b(i, 8) && c.d.j.n.b.a(i) && dVar.g() != c.d.i.c.f3152b) {
                this.f3441c.a(this.f3442d, dVar);
            }
            c().a(dVar, i);
        }
    }

    public g0(c.d.j.d.e eVar, c.d.j.d.f fVar, c.d.d.g.h hVar, c.d.d.g.a aVar, j0<c.d.j.k.d> j0Var) {
        this.f3429a = eVar;
        this.f3430b = fVar;
        this.f3431c = hVar;
        this.f3432d = aVar;
        this.f3433e = j0Var;
    }

    private static Uri a(c.d.j.o.c cVar) {
        return cVar.p().buildUpon().appendQueryParameter("fresco_partial", "true").build();
    }

    private b.d<c.d.j.k.d, Void> a(k<c.d.j.k.d> kVar, k0 k0Var, c.d.b.a.d dVar) {
        return new a(k0Var.e(), k0Var.a(), kVar, k0Var, dVar);
    }

    static Map<String, String> a(m0 m0Var, String str, boolean z, int i) {
        if (!m0Var.a(str)) {
            return null;
        }
        String valueOf = String.valueOf(z);
        return z ? c.d.d.d.f.a("cached_value_found", valueOf, "encodedImageSize", String.valueOf(i)) : c.d.d.d.f.a("cached_value_found", valueOf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(k<c.d.j.k.d> kVar, k0 k0Var, c.d.b.a.d dVar, c.d.j.k.d dVar2) {
        this.f3433e.a(new c(kVar, this.f3429a, dVar, this.f3431c, this.f3432d, dVar2, null), k0Var);
    }

    private void a(AtomicBoolean atomicBoolean, k0 k0Var) {
        k0Var.a(new b(this, atomicBoolean));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(b.f<?> fVar) {
        return fVar.c() || (fVar.e() && (fVar.a() instanceof CancellationException));
    }

    @Override // c.d.j.n.j0
    public void a(k<c.d.j.k.d> kVar, k0 k0Var) {
        c.d.j.o.c f2 = k0Var.f();
        if (!f2.r()) {
            this.f3433e.a(kVar, k0Var);
            return;
        }
        k0Var.e().a(k0Var.a(), "PartialDiskCacheProducer");
        c.d.b.a.d a2 = this.f3430b.a(f2, a(f2), k0Var.b());
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f3429a.a(a2, atomicBoolean).a((b.d<c.d.j.k.d, TContinuationResult>) a(kVar, k0Var, a2));
        a(atomicBoolean, k0Var);
    }
}
