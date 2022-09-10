package defpackage;

import android.os.SystemClock;
import android.view.Surface;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.io.IOException;
import java.util.List;
/* compiled from: PG */
/* renamed from: clqv  reason: default package */
/* loaded from: classes5.dex */
public final class clqv implements clof, cmbx, clrt, cmoy, cmer, cmjy, clts, cmon, clre {
    public final cmmz<apqn> a = new cmmz<>();
    public final clqu b;
    public clog c;
    public boolean d;
    private final cmmq e;
    private final cloz f;
    private final clpa g;

    public clqv(cmmq cmmqVar) {
        this.e = cmmqVar;
        cloz clozVar = new cloz();
        this.f = clozVar;
        this.g = new clpa();
        this.b = new clqu(clozVar);
    }

    private final clqw Q() {
        return O(this.b.d);
    }

    private final clqw R() {
        return O(this.b.e);
    }

    private final clqw S(int i, cmeh cmehVar) {
        cmmn.f(this.c);
        if (cmehVar != null) {
            if (this.b.a(cmehVar) != null) {
                return O(cmehVar);
            }
            return N(clpb.c, i, cmehVar);
        }
        clpb n = this.c.n();
        if (i >= n.r()) {
            n = clpb.c;
        }
        return N(n, i, null);
    }

    @Override // defpackage.clrt
    public final void A(clte clteVar) {
        R();
        this.a.e(new cmmx() { // from class: clpx
            @Override // defpackage.cmmx
            public final void a(Object obj) {
                apqn apqnVar = (apqn) obj;
            }
        });
    }

    @Override // defpackage.clrt
    public final void B(int i) {
        R();
        this.a.e(new cmmx() { // from class: clqt
            @Override // defpackage.cmmx
            public final void a(Object obj) {
                apqn apqnVar = (apqn) obj;
            }
        });
    }

    @Override // defpackage.clrt
    public final void C(String str, long j, long j2) {
        R();
        this.a.e(new cmmx() { // from class: clqi
            @Override // defpackage.cmmx
            public final void a(Object obj) {
                apqn apqnVar = (apqn) obj;
            }
        });
    }

    @Override // defpackage.clrt
    public final void D(Format format) {
        R();
        this.a.e(new cmmx() { // from class: clqo
            @Override // defpackage.cmmx
            public final void a(Object obj) {
                apqn apqnVar = (apqn) obj;
            }
        });
    }

    @Override // defpackage.clrt
    public final void E(long j) {
        R();
        this.a.e(new cmmx() { // from class: clqp
            @Override // defpackage.cmmx
            public final void a(Object obj) {
                apqn apqnVar = (apqn) obj;
            }
        });
    }

    @Override // defpackage.clrt
    public final void F(int i, long j, long j2) {
        R();
        this.a.e(new cmmx() { // from class: clqq
            @Override // defpackage.cmmx
            public final void a(Object obj) {
                apqn apqnVar = (apqn) obj;
            }
        });
    }

    @Override // defpackage.clrt
    public final void G(String str) {
        R();
        this.a.e(new cmmx() { // from class: clqr
            @Override // defpackage.cmmx
            public final void a(Object obj) {
                apqn apqnVar = (apqn) obj;
            }
        });
    }

    @Override // defpackage.clrt
    public final void H(clte clteVar) {
        Q();
        this.a.e(new cmmx() { // from class: clqs
            @Override // defpackage.cmmx
            public final void a(Object obj) {
                apqn apqnVar = (apqn) obj;
            }
        });
    }

    @Override // defpackage.clrt
    public final void I(boolean z) {
        R();
        this.a.e(new cmmx() { // from class: clpf
            @Override // defpackage.cmmx
            public final void a(Object obj) {
                apqn apqnVar = (apqn) obj;
            }
        });
    }

    @Override // defpackage.clre
    public final void J(float f) {
        R();
        this.a.e(new cmmx() { // from class: clpg
            @Override // defpackage.cmmx
            public final void a(Object obj) {
                apqn apqnVar = (apqn) obj;
            }
        });
    }

    @Override // defpackage.cmbx
    public final void K(Metadata metadata) {
        P();
        this.a.e(new cmmx() { // from class: clpn
            @Override // defpackage.cmmx
            public final void a(Object obj) {
                apqn apqnVar = (apqn) obj;
            }
        });
    }

    @Override // defpackage.cmon
    public final void L() {
    }

    @Override // defpackage.cmon
    public final void M(int i, int i2) {
        R();
        this.a.e(new cmmx() { // from class: clpr
            @Override // defpackage.cmmx
            public final void a(Object obj) {
                apqn apqnVar = (apqn) obj;
            }
        });
    }

    protected final clqw N(clpb clpbVar, int i, cmeh cmehVar) {
        boolean z = true;
        cmeh cmehVar2 = true == clpbVar.t() ? null : cmehVar;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!clpbVar.equals(this.c.n()) || i != this.c.g()) {
            z = false;
        }
        long j = 0;
        if (cmehVar2 == null || !cmehVar2.b()) {
            if (z) {
                j = this.c.m();
            } else if (!clpbVar.t()) {
                j = clpbVar.u(i, this.g).a();
            }
        } else if (z && this.c.k() == cmehVar2.b && this.c.l() == cmehVar2.c) {
            j = this.c.i();
        }
        return new clqw(elapsedRealtime, clpbVar, i, cmehVar2, j, this.c.n(), this.c.g(), this.b.c, this.c.i(), cllt.a(((clmt) this.c).n.r));
    }

    public final clqw O(cmeh cmehVar) {
        cmmn.f(this.c);
        clpb a = cmehVar == null ? null : this.b.a(cmehVar);
        if (cmehVar == null || a == null) {
            int g = this.c.g();
            clpb n = this.c.n();
            if (g >= n.r()) {
                n = clpb.c;
            }
            return N(n, g, null);
        }
        return N(a, a.g(cmehVar.a, this.f).c, cmehVar);
    }

    public final clqw P() {
        return O(this.b.c);
    }

    @Override // defpackage.clof
    public final void RK(clpb clpbVar, int i) {
        clqu clquVar = this.b;
        clog clogVar = this.c;
        cmmn.f(clogVar);
        clquVar.c = clqu.c(clogVar, clquVar.b, clquVar.d, clquVar.a);
        clquVar.b(clogVar.n());
        P();
        this.a.e(new cmmx() { // from class: clpy
            @Override // defpackage.cmmx
            public final void a(Object obj) {
                apqn apqnVar = (apqn) obj;
            }
        });
    }

    @Override // defpackage.clof
    public final void RL(clno clnoVar, int i) {
        P();
        this.a.e(new cmmx() { // from class: clpz
            @Override // defpackage.cmmx
            public final void a(Object obj) {
                apqn apqnVar = (apqn) obj;
            }
        });
    }

    @Override // defpackage.clof
    public final void RM(TrackGroupArray trackGroupArray, cmjn cmjnVar) {
        P();
        this.a.e(new cmmx() { // from class: clqa
            @Override // defpackage.cmmx
            public final void a(Object obj) {
                apqn apqnVar = (apqn) obj;
            }
        });
    }

    @Override // defpackage.clof
    public final void RN(List<Metadata> list) {
        P();
        this.a.e(new cmmx() { // from class: clqb
            @Override // defpackage.cmmx
            public final void a(Object obj) {
                apqn apqnVar = (apqn) obj;
            }
        });
    }

    @Override // defpackage.clof
    public final void RO(final boolean z, final int i) {
        P();
        this.a.e(new cmmx(z, i) { // from class: clqd
            private final boolean a;
            private final int b;

            {
                this.a = z;
                this.b = i;
            }

            @Override // defpackage.cmmx
            public final void a(Object obj) {
                ((apqn) obj).a(this.a, this.b);
            }
        });
    }

    @Override // defpackage.cmer
    public final void a(int i, cmeh cmehVar, cmdz cmdzVar, cmee cmeeVar) {
        S(i, cmehVar);
        this.a.e(new cmmx() { // from class: clps
            @Override // defpackage.cmmx
            public final void a(Object obj) {
                apqn apqnVar = (apqn) obj;
            }
        });
    }

    @Override // defpackage.cmer
    public final void b(int i, cmeh cmehVar, cmdz cmdzVar, cmee cmeeVar) {
        S(i, cmehVar);
        this.a.e(new cmmx() { // from class: clpt
            @Override // defpackage.cmmx
            public final void a(Object obj) {
                apqn apqnVar = (apqn) obj;
            }
        });
    }

    @Override // defpackage.cmer
    public final void c(int i, cmeh cmehVar, cmdz cmdzVar, cmee cmeeVar) {
        S(i, cmehVar);
        this.a.e(new cmmx() { // from class: clpu
            @Override // defpackage.cmmx
            public final void a(Object obj) {
                apqn apqnVar = (apqn) obj;
            }
        });
    }

    @Override // defpackage.cmer
    public final void d(int i, cmeh cmehVar, cmdz cmdzVar, cmee cmeeVar, IOException iOException, boolean z) {
        S(i, cmehVar);
        this.a.e(new cmmx() { // from class: clpv
            @Override // defpackage.cmmx
            public final void a(Object obj) {
                apqn apqnVar = (apqn) obj;
            }
        });
    }

    @Override // defpackage.cmer
    public final void e(int i, cmeh cmehVar, cmee cmeeVar) {
        S(i, cmehVar);
        this.a.e(new cmmx() { // from class: clpw
            @Override // defpackage.cmmx
            public final void a(Object obj) {
                apqn apqnVar = (apqn) obj;
            }
        });
    }

    @Override // defpackage.clof
    public final void f(boolean z) {
        P();
        this.a.e(new cmmx() { // from class: clqc
            @Override // defpackage.cmmx
            public final void a(Object obj) {
                apqn apqnVar = (apqn) obj;
            }
        });
    }

    @Override // defpackage.clof
    public final void g(int i) {
        P();
        this.a.e(new cmmx() { // from class: clqe
            @Override // defpackage.cmmx
            public final void a(Object obj) {
                apqn apqnVar = (apqn) obj;
            }
        });
    }

    @Override // defpackage.clof
    public final void h(boolean z, int i) {
        P();
        this.a.e(new cmmx() { // from class: clqf
            @Override // defpackage.cmmx
            public final void a(Object obj) {
                apqn apqnVar = (apqn) obj;
            }
        });
    }

    @Override // defpackage.clof
    public final void i(int i) {
        P();
        this.a.e(new cmmx() { // from class: clqg
            @Override // defpackage.cmmx
            public final void a(Object obj) {
                apqn apqnVar = (apqn) obj;
            }
        });
    }

    @Override // defpackage.clof
    public final void j(boolean z) {
        P();
        this.a.e(new cmmx() { // from class: clqh
            @Override // defpackage.cmmx
            public final void a(Object obj) {
                apqn apqnVar = (apqn) obj;
            }
        });
    }

    @Override // defpackage.clof
    public final void k(cllz cllzVar) {
        cmeh cmehVar = cllzVar.h;
        if (cmehVar != null) {
            O(cmehVar);
        } else {
            P();
        }
        this.a.e(new cmmx() { // from class: clqj
            @Override // defpackage.cmmx
            public final void a(Object obj) {
                apqn apqnVar = (apqn) obj;
            }
        });
    }

    @Override // defpackage.clof
    public final void l(int i) {
        if (i == 1) {
            this.d = false;
        }
        clqu clquVar = this.b;
        clog clogVar = this.c;
        cmmn.f(clogVar);
        clquVar.c = clqu.c(clogVar, clquVar.b, clquVar.d, clquVar.a);
        P();
        this.a.e(new cmmx() { // from class: clqk
            @Override // defpackage.cmmx
            public final void a(Object obj) {
                apqn apqnVar = (apqn) obj;
            }
        });
    }

    @Override // defpackage.clof
    public final void m(clod clodVar) {
        P();
        this.a.e(new cmmx() { // from class: clql
            @Override // defpackage.cmmx
            public final void a(Object obj) {
                apqn apqnVar = (apqn) obj;
            }
        });
    }

    @Override // defpackage.clof
    public final void n() {
        P();
        this.a.e(new cmmx() { // from class: clqm
            @Override // defpackage.cmmx
            public final void a(Object obj) {
                apqn apqnVar = (apqn) obj;
            }
        });
    }

    @Override // defpackage.clof
    public final void o() {
    }

    @Override // defpackage.clof
    public final void p() {
    }

    @Override // defpackage.clof
    public final void q() {
    }

    @Override // defpackage.cmoy
    public final void r(clte clteVar) {
        R();
        this.a.e(new cmmx() { // from class: clph
            @Override // defpackage.cmmx
            public final void a(Object obj) {
                apqn apqnVar = (apqn) obj;
            }
        });
    }

    @Override // defpackage.cmoy
    public final void s(String str, long j, long j2) {
        R();
        this.a.e(new cmmx() { // from class: clpi
            @Override // defpackage.cmmx
            public final void a(Object obj) {
                apqn apqnVar = (apqn) obj;
            }
        });
    }

    @Override // defpackage.cmoy
    public final void t(Format format) {
        R();
        this.a.e(new cmmx() { // from class: clpj
            @Override // defpackage.cmmx
            public final void a(Object obj) {
                apqn apqnVar = (apqn) obj;
            }
        });
    }

    @Override // defpackage.cmoy
    public final void u(int i, long j) {
        Q();
        this.a.e(new cmmx() { // from class: clpk
            @Override // defpackage.cmmx
            public final void a(Object obj) {
                apqn apqnVar = (apqn) obj;
            }
        });
    }

    @Override // defpackage.cmoy
    public final void v(final int i, final int i2, int i3, float f) {
        R();
        this.a.e(new cmmx(i, i2) { // from class: clpq
            private final int a;
            private final int b;

            {
                this.a = i;
                this.b = i2;
            }

            @Override // defpackage.cmmx
            public final void a(Object obj) {
                ((apqn) obj).c(this.a, this.b);
            }
        });
    }

    @Override // defpackage.cmoy
    public final void w(final Surface surface) {
        R();
        this.a.e(new cmmx(surface) { // from class: clpo
            private final Surface a;

            {
                this.a = surface;
            }

            @Override // defpackage.cmmx
            public final void a(Object obj) {
                ((apqn) obj).b();
            }
        });
    }

    @Override // defpackage.cmoy
    public final void x(String str) {
        R();
        this.a.e(new cmmx() { // from class: clpl
            @Override // defpackage.cmmx
            public final void a(Object obj) {
                apqn apqnVar = (apqn) obj;
            }
        });
    }

    @Override // defpackage.cmoy
    public final void y(clte clteVar) {
        Q();
        this.a.e(new cmmx() { // from class: clpm
            @Override // defpackage.cmmx
            public final void a(Object obj) {
                apqn apqnVar = (apqn) obj;
            }
        });
    }

    @Override // defpackage.cmoy
    public final void z(long j, int i) {
        Q();
        this.a.e(new cmmx() { // from class: clpp
            @Override // defpackage.cmmx
            public final void a(Object obj) {
                apqn apqnVar = (apqn) obj;
            }
        });
    }
}
