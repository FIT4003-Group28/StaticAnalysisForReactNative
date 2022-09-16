package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: cgek  reason: default package */
/* loaded from: classes4.dex */
public final class cgek extends itb implements cgen {
    private final gga a;
    private final akox b;
    private final cgep c;
    private final cgej d;
    private final dxio<cgsy> e;
    private final Set<String> f = new HashSet();
    @dzsi
    private alad g = null;
    @dzsi
    private dwpe h;

    public cgek(gga ggaVar, akox akoxVar, cgep cgepVar, cgej cgejVar, dxio dxioVar) {
        this.a = ggaVar;
        this.b = akoxVar;
        this.c = cgepVar;
        this.d = cgejVar;
        this.e = dxioVar;
    }

    private final void r(@dzsi dspd dspdVar, @dzsi dwsr dwsrVar, cgem cgemVar) {
        alad c;
        if (dwsrVar == null) {
            this.a.D(cgdv.aR(this.d.a, dspdVar, this.g, cgemVar));
            return;
        }
        dhjx c2 = cguq.c(dwsrVar, dspdVar);
        if (c2 != null && (c = alad.c(c2)) != null) {
            this.g = c;
            this.c.c(akyx.m(c2));
        }
        this.a.D(cgdv.g(this.d.a, dwsrVar, dspdVar, this.g, cgemVar));
    }

    @Override // defpackage.cgen
    public final void e(@dzsi dspd dspdVar, cgem cgemVar) {
        r(dspdVar, this.c.d(), cgemVar);
    }

    @Override // defpackage.cgen
    public final void f(@dzsi dwsr dwsrVar, cgem cgemVar) {
        r(dwsrVar == null ? null : cguq.a(dwsrVar), dwsrVar, cgemVar);
    }

    @Override // defpackage.cgen
    public final void i(dpyv dpyvVar, dqgh dqghVar, @dzsi ilo iloVar, @dzsi dhjz dhjzVar) {
        alad n;
        if (dpyvVar == dpyv.UGC_TASKS_NEARBY_NEED) {
            this.e.a().a.a();
        }
        if (iloVar == null) {
            alaa b = alad.b(this.b.n());
            b.c = 18.0f;
            if (dhjzVar != null) {
                b.c(akqq.j(dhjzVar));
            }
            n = b.a();
        } else {
            n = this.b.n();
        }
        this.g = n;
        cguu a = cguv.a(this.b.Y(n));
        a.b(this.c.e());
        a.a = this.h;
        a.b = dpyvVar;
        a.e = dqghVar;
        a.c(iloVar == null ? null : iloVar.ai().o());
        a.d = dhjzVar;
        dwsn a2 = a.a();
        this.a.D(cgdv.w(this.d.a, a2, n, this.b.n(), dpyvVar));
    }

    @Override // defpackage.cgen
    public final void j(String str, akqq akqqVar, dspd dspdVar, cgem cgemVar) {
        alaa a = alad.a();
        a.c(akqqVar);
        a.c = 14.5f;
        alad a2 = a.a();
        this.g = a2;
        cguu a3 = cguv.a(this.b.Y(a2));
        a3.c(str);
        if (dspdVar == null || dspdVar.u()) {
            a3.c = null;
        } else {
            a3.c = dspdVar;
        }
        a3.b(this.c.e());
        a3.a = this.h;
        dwsn a4 = a3.a();
        gga ggaVar = this.a;
        cgej cgejVar = this.d;
        ggaVar.D(cgdv.q(cgejVar.a, a4, a2, this.b.n(), cgemVar));
    }

    @Override // defpackage.cgen
    public final void k(@dzsi alad aladVar) {
        this.g = aladVar;
    }

    @Override // defpackage.cgen
    @dzsi
    public final alad l() {
        return this.g;
    }

    @Override // defpackage.cgen
    public final dwsn m(alad aladVar) {
        cguu a = cguv.a(this.b.Y(aladVar));
        a.b(this.c.e());
        a.a = this.h;
        return a.a();
    }

    @Override // defpackage.cgen
    public final void n(dwpe dwpeVar) {
        this.h = dwpeVar;
    }

    @Override // defpackage.cgen
    @dzsi
    public final dwpe o() {
        return this.h;
    }

    @Override // defpackage.cgen
    public final Set<String> p() {
        HashSet hashSet = new HashSet(this.f);
        this.f.clear();
        return hashSet;
    }

    @Override // defpackage.cgen
    public final void q(alad aladVar) {
        this.g = null;
        this.b.p(akyt.e(aladVar));
    }
}
