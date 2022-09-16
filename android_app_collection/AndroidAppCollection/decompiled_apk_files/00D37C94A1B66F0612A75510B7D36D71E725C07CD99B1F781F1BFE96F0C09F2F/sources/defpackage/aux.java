package defpackage;
/* compiled from: PG */
/* renamed from: aux  reason: default package */
/* loaded from: classes2.dex */
public final class aux {
    public final pkr a;
    public ppz c;
    public ppz d;
    public ppz e;
    public amuk b = amuk.q();
    private amup f = amyc.b;

    public aux(pkr pkrVar) {
        this.a = pkrVar;
    }

    public static ppz c(pjz pjzVar, amuk amukVar, ppz ppzVar, pkr pkrVar) {
        int b;
        pkt s = pjzVar.s();
        pkl pklVar = (pkl) pjzVar;
        pklVar.M();
        pig pigVar = pklVar.c;
        if (pigVar.u.a.z()) {
            b = 0;
        } else {
            pjs pjsVar = pigVar.u;
            b = pjsVar.a.b(pjsVar.s.a);
        }
        Object j = s.z() ? null : s.j(b);
        int b2 = (pjzVar.F() || s.z()) ? -1 : s.x(b, pkrVar).b(phk.c(pjzVar.q()) - pkrVar.e);
        for (int i = 0; i < amukVar.size(); i++) {
            ppz ppzVar2 = (ppz) amukVar.get(i);
            if (e(ppzVar2, j, pjzVar.F(), pjzVar.j(), pjzVar.k(), b2)) {
                return ppzVar2;
            }
        }
        if (amukVar.isEmpty() && ppzVar != null) {
            if (e(ppzVar, j, pjzVar.F(), pjzVar.j(), pjzVar.k(), b2)) {
                return ppzVar;
            }
        }
        return null;
    }

    private final void d(amum amumVar, ppz ppzVar, pkt pktVar) {
        if (ppzVar == null) {
            return;
        }
        if (pktVar.b(ppzVar.a) != -1) {
            amumVar.f(ppzVar, pktVar);
            return;
        }
        pkt pktVar2 = (pkt) this.f.get(ppzVar);
        if (pktVar2 == null) {
            return;
        }
        amumVar.f(ppzVar, pktVar2);
    }

    private static boolean e(ppz ppzVar, Object obj, boolean z, int i, int i2, int i3) {
        if (!ppzVar.a.equals(obj)) {
            return false;
        }
        if (z) {
            if (ppzVar.b != i || ppzVar.c != i2) {
                return false;
            }
        } else if (ppzVar.b != -1 || ppzVar.e != i3) {
            return false;
        }
        return true;
    }

    public final void a(pkt pktVar) {
        amum h = amup.h();
        if (!this.b.isEmpty()) {
            for (int i = 0; i < this.b.size(); i++) {
                d(h, (ppz) this.b.get(i), pktVar);
            }
            if (!this.b.contains(this.c)) {
                d(h, this.c, pktVar);
            }
        } else {
            d(h, this.d, pktVar);
            if (!akzj.f(this.e, this.d)) {
                d(h, this.e, pktVar);
            }
            if (!akzj.f(this.c, this.d) && !akzj.f(this.c, this.e)) {
                d(h, this.c, pktVar);
            }
        }
        this.f = h.b();
    }

    public final pkt b(ppz ppzVar) {
        return (pkt) this.f.get(ppzVar);
    }
}
