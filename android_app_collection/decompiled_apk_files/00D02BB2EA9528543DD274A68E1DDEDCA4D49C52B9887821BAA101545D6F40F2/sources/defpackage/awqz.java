package defpackage;

import android.os.Bundle;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: awqz  reason: default package */
/* loaded from: classes3.dex */
public final class awqz extends itb implements awre {
    public final ckcw a;
    public final gga b;
    public final bvrb c;
    public final cqat d;
    public final ahtd e;
    public final bgdt f;
    public final awpw g;
    public final awti h;
    public final awpz i;
    public final awpu j;
    public boolean k;
    @dzsi
    public ilo o;
    private final btrm p;
    private final bwqv q;
    private final bgea r;
    @dzsi
    private awqy s;
    @dzsi
    private bvpk t;
    private final Runnable u = new awqt(this);
    private final Runnable v = new awqu(this);
    private final awqv w = new awqv(this);

    public awqz(ckcw ckcwVar, gga ggaVar, bvrb bvrbVar, btrm btrmVar, bwqv bwqvVar, cqat cqatVar, ahtd ahtdVar, bgdt bgdtVar, awpw awpwVar, awti awtiVar, awpz awpzVar, awpu awpuVar, bgea bgeaVar) {
        this.a = ckcwVar;
        this.b = ggaVar;
        this.c = bvrbVar;
        this.p = btrmVar;
        this.q = bwqvVar;
        this.d = cqatVar;
        this.e = ahtdVar;
        this.f = bgdtVar;
        this.g = awpwVar;
        this.h = awtiVar;
        this.i = awpzVar;
        this.j = awpuVar;
        this.r = bgeaVar;
    }

    private final void r() {
        bvpk bvpkVar = this.t;
        if (bvpkVar != null) {
            bvpkVar.b();
            this.t = null;
        }
    }

    @Override // defpackage.itb
    public final void Nt() {
        super.Nt();
        this.g.a();
        btrm btrmVar = this.p;
        dceq a = dcet.a();
        a.b(awrf.class, new awra(awrf.class, this, bvrj.UI_THREAD));
        a.b(alhj.class, new awra(alhj.class, this));
        btrmVar.g(this, a.a());
        this.h.b().Pk(this.u, this.c.h());
        this.h.n(this.w);
        o();
    }

    @Override // defpackage.itb
    public final void Po() {
        super.Po();
        r();
        this.p.a(this);
        this.h.o(this.w);
        this.h.c();
        this.g.b();
        this.f.b();
    }

    @Override // defpackage.awre
    public final void e() {
        bvrj.UI_THREAD.c();
        this.h.b().Pk(this.v, this.c.h());
    }

    @Override // defpackage.awre
    public final void f(boolean z) {
        bvrj.UI_THREAD.c();
        awqy awqyVar = this.s;
        if (awqyVar != null) {
            awqyVar.a();
            this.s = null;
        }
        awqy awqyVar2 = new awqy(this, z);
        this.s = awqyVar2;
        awqyVar2.b();
    }

    @Override // defpackage.awre
    public final void i(awtn awtnVar) {
        bvrj.UI_THREAD.c();
        awqy awqyVar = this.s;
        if (awqyVar != null) {
            awqyVar.a();
            this.s = null;
        }
        k(awtnVar);
    }

    @Override // defpackage.awre
    public final void j() {
        bvrj.UI_THREAD.c();
        k(null);
    }

    public final void k(@dzsi awtn awtnVar) {
        bvrj.UI_THREAD.c();
        this.h.g(awtnVar);
    }

    public final boolean l(awtn awtnVar) {
        awqe p = p();
        if (p != null) {
            p.g(awtnVar);
            p.i(this.o);
            return true;
        }
        return false;
    }

    public final void m(awtn awtnVar, boolean z) {
        if (!l(awtnVar) && bvrj.UI_THREAD.b()) {
            gga ggaVar = this.b;
            bwqv bwqvVar = this.q;
            ilo iloVar = this.o;
            awqe awqeVar = new awqe();
            Bundle bundle = new Bundle();
            bvrs.l(bundle, awtnVar.n());
            if (iloVar != null) {
                bwqvVar.c(bundle, "placemark", iloVar);
            }
            bundle.putBoolean("created_from_map_tap", z);
            awqeVar.B(bundle);
            awqeVar.au = z;
            ggaVar.D(awqeVar);
        }
        this.g.d();
    }

    public final void n(awtn awtnVar) {
        this.f.a(this.r.a(awtnVar.c()).bK(), new awqr(this, awtnVar));
    }

    public final void o() {
        if (w()) {
            r();
            bvrb bvrbVar = this.c;
            if (this.t == null) {
                this.t = bvpk.a(new awqs(this));
            }
            bvrbVar.a(this.t, bvrj.UI_THREAD, TimeUnit.MINUTES.toMillis(1L));
        }
    }

    @dzsi
    public final awqe p() {
        fd K = this.b.K();
        if (K instanceof awqe) {
            return (awqe) K;
        }
        return null;
    }
}
