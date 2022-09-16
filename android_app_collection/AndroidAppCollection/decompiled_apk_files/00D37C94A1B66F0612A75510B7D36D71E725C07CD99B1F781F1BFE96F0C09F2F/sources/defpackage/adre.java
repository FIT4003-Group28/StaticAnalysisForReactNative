package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: adre  reason: default package */
/* loaded from: classes.dex */
public final class adre implements adny {
    public final axnm e;
    public final axnm f;
    public final axnm g;
    private final snc k;
    private adnt l;
    private adnv m;
    private admx n;
    private final long o;
    private final acwu p;
    private static final String h = zep.a("MDX.SessionInfoStorageController");
    static final long a = TimeUnit.MINUTES.toMillis(1);
    static final long b = TimeUnit.MINUTES.toMillis(2);
    static final long c = TimeUnit.MINUTES.toMillis(10);
    private final adnx q = new adrc(this);
    private final Handler i = new Handler(Looper.getMainLooper());
    private final adrd j = new adrd(this);
    public boolean d = false;

    public adre(snc sncVar, axnm axnmVar, axnm axnmVar2, axnm axnmVar3, acwu acwuVar) {
        this.k = sncVar;
        this.e = axnmVar;
        this.f = axnmVar2;
        this.g = axnmVar3;
        this.p = acwuVar;
        this.o = acwuVar.as;
    }

    public final void a() {
        if (this.m == null) {
            zep.m(h, "cannot update values because session builders are null");
        } else if (this.n == null) {
            ((adra) this.e.get()).d(this.m.a());
        } else {
            long c2 = this.k.c();
            long j = this.n.a().c;
            long j2 = this.o;
            boolean z = false;
            if (j2 > 0) {
                j = this.p.as + c2;
            } else if (j2 < 0) {
                z = true;
            } else {
                adnt adntVar = this.l;
                if (adntVar != null) {
                    long max = Math.max(b, adntVar.e() - this.l.c());
                    if (this.l.aj() == 2) {
                        max = Math.max(max, c);
                    }
                    j = max + c2;
                }
            }
            adnv adnvVar = this.m;
            admx admxVar = this.n;
            admxVar.c(c2);
            admxVar.d(j);
            admxVar.e(z);
            adnvVar.b(admxVar.a());
            ((adra) this.e.get()).d(adnvVar.a());
        }
    }

    public final void b() {
        this.i.postDelayed(this.j, a);
    }

    @Override // defpackage.adny
    public final void j(adnt adntVar) {
        long c2 = this.k.c();
        admx a2 = admy.a();
        a2.b(c2);
        this.n = a2;
        if (this.m == null || this.l != adntVar) {
            zep.m(h, "session info builder lost or mismatch, using connected time as a proxy for started time");
            adnv b2 = adntVar.o().b();
            b2.h(c2);
            this.m = b2;
        }
        this.l = adntVar;
        adntVar.z(this.q);
        a();
        b();
    }

    @Override // defpackage.adny
    public final void k(adnt adntVar) {
        if (adntVar != this.l) {
            zep.m(h, "Mismatching session disconnect, ignore");
            return;
        }
        adnv adnvVar = this.m;
        if (adnvVar == null) {
            zep.m(h, "session info builder lost, ignore");
            return;
        }
        adnvVar.c(adntVar.r());
        a();
        ((adro) this.g.get()).g(this.m.a());
        adntVar.N(this.q);
        this.i.removeCallbacks(this.j);
        this.l = null;
        this.n = null;
        this.m = null;
    }

    @Override // defpackage.adny
    public final void l(adnt adntVar) {
        ylx.m(((adra) this.e.get()).a.b(adch.p), adkd.h);
        this.l = adntVar;
        this.n = null;
        adnv b2 = adntVar.o().b();
        b2.h(this.k.c());
        this.m = b2;
        adnw a2 = b2.a();
        if (!this.p.an) {
            ((adra) this.e.get()).d(a2);
        }
        ((adro) this.g.get()).h(adntVar);
    }
}
