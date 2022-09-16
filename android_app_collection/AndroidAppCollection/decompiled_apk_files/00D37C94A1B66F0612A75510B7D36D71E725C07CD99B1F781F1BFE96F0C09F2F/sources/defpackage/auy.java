package defpackage;

import android.os.SystemClock;
import android.util.SparseArray;
import com.google.android.exoplayer2.Format;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: auy  reason: default package */
/* loaded from: classes2.dex */
public final class auy implements pjx, pli, pyk, pqi, aww, pnk {
    public final pvq a;
    public final aux b;
    public final SparseArray c;
    public pwh d;
    public pjz e;
    public pwa f;
    public boolean g;
    private final pkr h;
    private final pks i;

    public auy(pvq pvqVar) {
        this.a = pvqVar;
        this.d = new pwh(pxi.v(), pvqVar, phz.a);
        pkr pkrVar = new pkr();
        this.h = pkrVar;
        this.i = new pks();
        this.b = new aux(pkrVar);
        this.c = new SparseArray();
    }

    private final auz as() {
        return au(this.b.d);
    }

    private final auz at() {
        return au(this.b.e);
    }

    private final auz au(ppz ppzVar) {
        ptx.a(this.e);
        pkt b = ppzVar == null ? null : this.b.b(ppzVar);
        if (ppzVar == null || b == null) {
            int l = this.e.l();
            pkt s = this.e.s();
            if (l >= s.q()) {
                s = pkt.c;
            }
            return I(s, l, null);
        }
        return I(b, b.f(ppzVar.a, this.h).c, ppzVar);
    }

    private final auz av(int i, ppz ppzVar) {
        ptx.a(this.e);
        if (ppzVar != null) {
            if (this.b.b(ppzVar) != null) {
                return au(ppzVar);
            }
            return I(pkt.c, i, ppzVar);
        }
        pkt s = this.e.s();
        if (i >= s.q()) {
            s = pkt.c;
        }
        return I(s, i, null);
    }

    @Override // defpackage.pyk
    public final void A(String str) {
        H(at(), 1024, new auq(2));
    }

    @Override // defpackage.pyk
    public final void B(pms pmsVar) {
        auz as = as();
        H(as, 1025, new aul(as, pmsVar, 2));
    }

    @Override // defpackage.pyk
    public final void C(pms pmsVar) {
        auz at = at();
        H(at, 1020, new aul(at, pmsVar, 3));
    }

    @Override // defpackage.pyk
    public final void D(long j, int i) {
        H(as(), 1026, new aua(6));
    }

    @Override // defpackage.pyk
    public final void E(final Format format, final pmw pmwVar) {
        final auz at = at();
        H(at, 1022, new pwe() { // from class: aui
            @Override // defpackage.pwe
            public final void a(Object obj) {
                auz auzVar = auz.this;
                Format format2 = format;
                pmw pmwVar2 = pmwVar;
                ava avaVar = (ava) obj;
                avaVar.am();
                avaVar.an(auzVar, pmwVar2);
                avaVar.f(auzVar, 2, format2);
            }
        });
    }

    @Override // defpackage.pjx, defpackage.pyk
    public final void F(final asr asrVar) {
        final auz at = at();
        H(at, 1028, new pwe() { // from class: aug
            @Override // defpackage.pwe
            public final void a(Object obj) {
                auz auzVar = auz.this;
                asr asrVar2 = asrVar;
                ava avaVar = (ava) obj;
                avaVar.ao();
                int i = asrVar2.a;
                int i2 = asrVar2.b;
                int i3 = asrVar2.c;
                avaVar.aq(auzVar, i, i2, asrVar2.d);
            }
        });
    }

    public final void G(ava avaVar) {
        this.d.e(avaVar);
    }

    public final void H(auz auzVar, int i, pwe pweVar) {
        this.c.put(i, auzVar);
        this.d.f(i, pweVar);
    }

    protected final auz I(pkt pktVar, int i, ppz ppzVar) {
        boolean z = true;
        ppz ppzVar2 = true == pktVar.z() ? null : ppzVar;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!pktVar.equals(this.e.s()) || i != this.e.l()) {
            z = false;
        }
        long j = 0;
        if (ppzVar2 == null || !ppzVar2.a()) {
            if (!z) {
                if (!pktVar.z()) {
                    j = pktVar.y(i, this.i).a();
                }
            } else {
                pkl pklVar = (pkl) this.e;
                pklVar.M();
                j = pklVar.c.p();
            }
        } else if (z && this.e.j() == ppzVar2.b && this.e.k() == ppzVar2.c) {
            j = this.e.q();
        }
        ppz ppzVar3 = this.b.c;
        pkt s = this.e.s();
        int l = this.e.l();
        long q = this.e.q();
        pkl pklVar2 = (pkl) this.e;
        pklVar2.M();
        return new auz(elapsedRealtime, pktVar, i, ppzVar2, j, s, l, ppzVar3, q, phk.d(pklVar2.c.u.p));
    }

    @Override // defpackage.pqi
    public final void J(int i, ppz ppzVar, final ppw ppwVar) {
        final auz av = av(i, ppzVar);
        H(av, 1004, new pwe() { // from class: aun
            @Override // defpackage.pwe
            public final void a(Object obj) {
                ((ava) obj).g(auz.this, ppwVar);
            }
        });
    }

    @Override // defpackage.pnk
    public final void K(int i, ppz ppzVar) {
        H(av(i, ppzVar), 1031, new aua(5));
    }

    @Override // defpackage.pnk
    public final void L(int i, ppz ppzVar) {
        H(av(i, ppzVar), 1034, new aua(10));
    }

    @Override // defpackage.pnk
    public final void M(int i, ppz ppzVar) {
        H(av(i, ppzVar), 1033, new aua(14));
    }

    @Override // defpackage.pnk
    public final void N(int i, ppz ppzVar, int i2) {
        H(av(i, ppzVar), 1030, new auq(8));
    }

    @Override // defpackage.pnk
    public final void O(int i, ppz ppzVar, Exception exc) {
        auz av = av(i, ppzVar);
        H(av, 1032, new auo(av, exc, 1));
    }

    @Override // defpackage.pnk
    public final void P(int i, ppz ppzVar) {
        H(av(i, ppzVar), 1035, new auq(1));
    }

    @Override // defpackage.pqi
    public final void Q(int i, ppz ppzVar, ppr pprVar, ppw ppwVar) {
        H(av(i, ppzVar), 1002, new aua(13));
    }

    @Override // defpackage.pqi
    public final void R(int i, ppz ppzVar, ppr pprVar, ppw ppwVar) {
        H(av(i, ppzVar), 1001, new aua(15));
    }

    @Override // defpackage.pqi
    public final void S(int i, ppz ppzVar, final ppr pprVar, final ppw ppwVar, final IOException iOException, final boolean z) {
        final auz av = av(i, ppzVar);
        H(av, 1003, new pwe() { // from class: aum
            @Override // defpackage.pwe
            public final void a(Object obj) {
                ((ava) obj).j(auz.this, pprVar, ppwVar, iOException, z);
            }
        });
    }

    @Override // defpackage.pqi
    public final void T(int i, ppz ppzVar, ppr pprVar, ppw ppwVar) {
        H(av(i, ppzVar), 1000, new aua(16));
    }

    @Override // defpackage.pqi
    public final void U(int i, ppz ppzVar, ppw ppwVar) {
        H(av(i, ppzVar), 1005, new aua(17));
    }

    @Override // defpackage.pli
    public final /* synthetic */ void V() {
    }

    @Override // defpackage.pjx
    public final /* synthetic */ void W() {
    }

    @Override // defpackage.pjx
    public final /* synthetic */ void X() {
    }

    @Override // defpackage.pjx
    public final /* synthetic */ void Y() {
    }

    @Override // defpackage.pnk
    public final /* synthetic */ void Z() {
    }

    public final auz a() {
        return au(this.b.c);
    }

    @Override // defpackage.pjv
    public final /* synthetic */ void aa() {
    }

    @Override // defpackage.pjv
    public final /* synthetic */ void ab() {
    }

    @Override // defpackage.pjv
    public final /* synthetic */ void ac() {
    }

    @Override // defpackage.pjv
    public final /* synthetic */ void ad() {
    }

    @Override // defpackage.pjv
    public final void ae(final int i) {
        aux auxVar = this.b;
        pjz pjzVar = this.e;
        ptx.a(pjzVar);
        auxVar.c = aux.c(pjzVar, auxVar.b, auxVar.d, auxVar.a);
        auxVar.a(pjzVar.s());
        final auz a = a();
        H(a, 0, new pwe() { // from class: aub
            @Override // defpackage.pwe
            public final void a(Object obj) {
                ((ava) obj).t(auz.this, i);
            }
        });
    }

    @Override // defpackage.pyk
    public final /* synthetic */ void af() {
    }

    @Override // defpackage.pjx
    public final void ag() {
        H(at(), 1016, new aua(7));
    }

    @Override // defpackage.pjv
    public final void ah() {
        H(a(), 14, new aua(11));
    }

    @Override // defpackage.pjv
    public final void ai() {
        H(a(), 1, new aua(8));
    }

    @Override // defpackage.pjv
    public final void aj() {
        H(a(), 15, new aua(9));
    }

    @Override // defpackage.pjx
    public final void ak() {
        H(a(), 1007, new aua(12));
    }

    @Override // defpackage.pjv
    public final void al() {
        H(a(), 6, new auq(5));
    }

    @Override // defpackage.pjv
    public final void am() {
        H(a(), 7, new aua());
    }

    @Override // defpackage.pjv
    public final void an() {
        H(a(), 9, new aua(2));
    }

    @Override // defpackage.pjv
    @Deprecated
    public final void ao() {
        H(a(), 3, new auq(3));
    }

    @Override // defpackage.pjx
    public final void ap() {
        H(at(), 1029, new aua(3));
    }

    @Override // defpackage.pjv
    public final void aq() {
        H(a(), 2, new aua(18));
    }

    @Override // defpackage.pjx
    public final void ar() {
        H(at(), 1019, new auq(7));
    }

    public final void b(ava avaVar) {
        ptx.a(avaVar);
        this.d.a(avaVar);
    }

    @Override // defpackage.pli
    public final void c(Exception exc) {
        H(at(), 1037, new aua(19));
    }

    @Override // defpackage.pli
    public final void d(String str, long j, long j2) {
        auz at = at();
        H(at, 1009, new aur(at, str, j2, j, 1));
    }

    @Override // defpackage.pli
    public final void e(String str) {
        H(at(), 1013, new auq());
    }

    @Override // defpackage.pli
    public final void f(pms pmsVar) {
        auz as = as();
        H(as, 1014, new aul(as, pmsVar, 1));
    }

    @Override // defpackage.pli
    public final void g(pms pmsVar) {
        auz at = at();
        H(at, 1008, new aul(at, pmsVar));
    }

    @Override // defpackage.pli
    public final void h(final Format format, pmw pmwVar) {
        final auz at = at();
        H(at, 1010, new pwe() { // from class: auh
            @Override // defpackage.pwe
            public final void a(Object obj) {
                auz auzVar = auz.this;
                Format format2 = format;
                ava avaVar = (ava) obj;
                avaVar.C();
                avaVar.D();
                avaVar.f(auzVar, 1, format2);
            }
        });
    }

    @Override // defpackage.pli
    public final void i(final long j) {
        final auz at = at();
        H(at, 1011, new pwe() { // from class: auf
            @Override // defpackage.pwe
            public final void a(Object obj) {
                ((ava) obj).b(auz.this, j);
            }
        });
    }

    @Override // defpackage.pli
    public final void j(Exception exc) {
        H(at(), 1018, new aua(20));
    }

    @Override // defpackage.pli
    public final void k(final int i, final long j, final long j2) {
        final auz at = at();
        H(at, 1012, new pwe() { // from class: aud
            @Override // defpackage.pwe
            public final void a(Object obj) {
                ((ava) obj).c(auz.this, i, j, j2);
            }
        });
    }

    @Override // defpackage.aww
    public final void l(int i, long j, long j2) {
        aux auxVar = this.b;
        H(au(auxVar.b.isEmpty() ? null : (ppz) arey.s(auxVar.b)), 1006, new aua(4));
    }

    @Override // defpackage.pyk
    public final void m(final int i, final long j) {
        final auz as = as();
        H(as, 1023, new pwe() { // from class: auc
            @Override // defpackage.pwe
            public final void a(Object obj) {
                ((ava) obj).i(auz.this, i, j);
            }
        });
    }

    @Override // defpackage.pjv
    public final void n(boolean z) {
        auz a = a();
        H(a, 4, new aus(a, z, 1));
    }

    @Override // defpackage.pjv
    public final void o(boolean z) {
        H(a(), 8, new auq(4));
    }

    @Override // defpackage.pjv
    public final void p(final pjt pjtVar) {
        final auz a = a();
        H(a, 13, new pwe() { // from class: auk
            @Override // defpackage.pwe
            public final void a(Object obj) {
                ((ava) obj).l(auz.this, pjtVar);
            }
        });
    }

    @Override // defpackage.pjv
    public final void q(int i) {
        H(a(), 5, new aua(1));
    }

    @Override // defpackage.pjv
    public final void r(final pjr pjrVar) {
        ppz ppzVar;
        final auz auzVar = null;
        if ((pjrVar instanceof phr) && (ppzVar = ((phr) pjrVar).f) != null) {
            auzVar = au(new ppz(ppzVar));
        }
        if (auzVar == null) {
            auzVar = a();
        }
        H(auzVar, 11, new pwe() { // from class: auj
            @Override // defpackage.pwe
            public final void a(Object obj) {
                ((ava) obj).m(auz.this, pjrVar);
            }
        });
    }

    @Override // defpackage.pjv
    public final void s(final boolean z, final int i) {
        final auz a = a();
        H(a, -1, new pwe() { // from class: auu
            @Override // defpackage.pwe
            public final void a(Object obj) {
                ((ava) obj).n(auz.this, z, i);
            }
        });
    }

    @Override // defpackage.pjv
    public final void t(final pjy pjyVar, final pjy pjyVar2, final int i) {
        if (i == 1) {
            this.g = false;
            i = 1;
        }
        aux auxVar = this.b;
        pjz pjzVar = this.e;
        ptx.a(pjzVar);
        auxVar.c = aux.c(pjzVar, auxVar.b, auxVar.d, auxVar.a);
        final auz a = a();
        H(a, 12, new pwe() { // from class: aue
            @Override // defpackage.pwe
            public final void a(Object obj) {
                auz auzVar = auz.this;
                int i2 = i;
                pjy pjyVar3 = pjyVar;
                pjy pjyVar4 = pjyVar2;
                ava avaVar = (ava) obj;
                avaVar.ab();
                avaVar.o(auzVar, pjyVar3, pjyVar4, i2);
            }
        });
    }

    @Override // defpackage.pjx
    public final /* synthetic */ void u() {
    }

    @Override // defpackage.pyk
    public final void v(final Object obj, final long j) {
        final auz at = at();
        H(at, 1027, new pwe() { // from class: aup
            @Override // defpackage.pwe
            public final void a(Object obj2) {
                ((ava) obj2).p(auz.this, obj, j);
            }
        });
    }

    @Override // defpackage.pjv
    public final void w() {
        auz a = a();
        H(a, -1, new aut(a));
    }

    @Override // defpackage.pjx, defpackage.pli
    public final void x(boolean z) {
        auz at = at();
        H(at, 1017, new aus(at, z));
    }

    @Override // defpackage.pyk
    public final void y(Exception exc) {
        auz at = at();
        H(at, 1038, new auo(at, exc));
    }

    @Override // defpackage.pyk
    public final void z(String str, long j, long j2) {
        auz at = at();
        H(at, 1021, new aur(at, str, j2, j));
    }
}
