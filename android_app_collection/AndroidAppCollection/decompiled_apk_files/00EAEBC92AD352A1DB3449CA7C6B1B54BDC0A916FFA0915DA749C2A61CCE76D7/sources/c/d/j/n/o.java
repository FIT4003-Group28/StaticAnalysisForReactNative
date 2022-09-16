package c.d.j.n;

import c.d.j.o.c;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public class o implements j0<c.d.j.k.d> {

    /* renamed from: a  reason: collision with root package name */
    private final c.d.j.d.e f3504a;

    /* renamed from: b  reason: collision with root package name */
    private final c.d.j.d.e f3505b;

    /* renamed from: c  reason: collision with root package name */
    private final c.d.j.d.f f3506c;

    /* renamed from: d  reason: collision with root package name */
    private final j0<c.d.j.k.d> f3507d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements b.d<c.d.j.k.d, Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m0 f3508a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f3509b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k f3510c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ k0 f3511d;

        a(m0 m0Var, String str, k kVar, k0 k0Var) {
            this.f3508a = m0Var;
            this.f3509b = str;
            this.f3510c = kVar;
            this.f3511d = k0Var;
        }

        @Override // b.d
        public Void a(b.f<c.d.j.k.d> fVar) {
            if (o.b(fVar)) {
                this.f3508a.b(this.f3509b, "DiskCacheProducer", null);
                this.f3510c.a();
            } else {
                if (fVar.e()) {
                    this.f3508a.a(this.f3509b, "DiskCacheProducer", fVar.a(), null);
                } else {
                    c.d.j.k.d b2 = fVar.b();
                    if (b2 != null) {
                        m0 m0Var = this.f3508a;
                        String str = this.f3509b;
                        m0Var.a(str, "DiskCacheProducer", o.a(m0Var, str, true, b2.z()));
                        this.f3508a.a(this.f3509b, "DiskCacheProducer", true);
                        this.f3510c.a(1.0f);
                        this.f3510c.a(b2, 1);
                        b2.close();
                    } else {
                        m0 m0Var2 = this.f3508a;
                        String str2 = this.f3509b;
                        m0Var2.a(str2, "DiskCacheProducer", o.a(m0Var2, str2, false, 0));
                    }
                }
                o.this.f3507d.a(this.f3510c, this.f3511d);
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AtomicBoolean f3513a;

        b(o oVar, AtomicBoolean atomicBoolean) {
            this.f3513a = atomicBoolean;
        }

        @Override // c.d.j.n.l0
        public void a() {
            this.f3513a.set(true);
        }
    }

    public o(c.d.j.d.e eVar, c.d.j.d.e eVar2, c.d.j.d.f fVar, j0<c.d.j.k.d> j0Var) {
        this.f3504a = eVar;
        this.f3505b = eVar2;
        this.f3506c = fVar;
        this.f3507d = j0Var;
    }

    static Map<String, String> a(m0 m0Var, String str, boolean z, int i) {
        if (!m0Var.a(str)) {
            return null;
        }
        String valueOf = String.valueOf(z);
        return z ? c.d.d.d.f.a("cached_value_found", valueOf, "encodedImageSize", String.valueOf(i)) : c.d.d.d.f.a("cached_value_found", valueOf);
    }

    private void a(AtomicBoolean atomicBoolean, k0 k0Var) {
        k0Var.a(new b(this, atomicBoolean));
    }

    private void b(k<c.d.j.k.d> kVar, k0 k0Var) {
        if (k0Var.h().a() >= c.b.DISK_CACHE.a()) {
            kVar.a(null, 1);
        } else {
            this.f3507d.a(kVar, k0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(b.f<?> fVar) {
        return fVar.c() || (fVar.e() && (fVar.a() instanceof CancellationException));
    }

    private b.d<c.d.j.k.d, Void> c(k<c.d.j.k.d> kVar, k0 k0Var) {
        return new a(k0Var.e(), k0Var.a(), kVar, k0Var);
    }

    @Override // c.d.j.n.j0
    public void a(k<c.d.j.k.d> kVar, k0 k0Var) {
        c.d.j.o.c f2 = k0Var.f();
        if (!f2.r()) {
            b(kVar, k0Var);
            return;
        }
        k0Var.e().a(k0Var.a(), "DiskCacheProducer");
        c.d.b.a.d c2 = this.f3506c.c(f2, k0Var.b());
        c.d.j.d.e eVar = f2.b() == c.a.SMALL ? this.f3505b : this.f3504a;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        eVar.a(c2, atomicBoolean).a((b.d<c.d.j.k.d, TContinuationResult>) c(kVar, k0Var));
        a(atomicBoolean, k0Var);
    }
}
