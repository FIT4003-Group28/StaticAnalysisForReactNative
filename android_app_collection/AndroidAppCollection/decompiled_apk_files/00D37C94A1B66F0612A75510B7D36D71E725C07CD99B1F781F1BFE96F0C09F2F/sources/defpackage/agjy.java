package defpackage;

import android.text.TextUtils;
import java.util.Locale;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: agjy  reason: default package */
/* loaded from: classes.dex */
public final class agjy implements agxf {
    final /* synthetic */ agjz a;

    public agjy(agjz agjzVar) {
        this.a = agjzVar;
    }

    private final void m(String str) {
        agkh agkhVar = (agkh) this.a.n.get();
        if (agkhVar.c().contains(str)) {
            this.a.n(agkhVar.b().b());
        }
        agwk agwkVar = (agwk) this.a.o.get();
        if (agwkVar.c().contains(str)) {
            this.a.v(agwkVar.b().b());
        }
    }

    @Override // defpackage.agxf
    public final void a(agqz agqzVar) {
        if (!agxg.ai(agqzVar)) {
            return;
        }
        String t = agxg.t(agqzVar.f);
        aglj agljVar = (aglj) this.a.k.get();
        agljVar.W(t, agqzVar);
        agljVar.V(t, agqe.ACTIVE);
        if (agljVar.a(t) == 0) {
            agljVar.aa(t, this.a.a.c());
        }
        this.a.t(t);
        m(t);
    }

    @Override // defpackage.agxf
    public final void b(agqz agqzVar) {
    }

    @Override // defpackage.agxf
    public final void c() {
    }

    @Override // defpackage.agxf
    public final void d(agqz agqzVar) {
        if (!agxg.ai(agqzVar)) {
            return;
        }
        String t = agxg.t(agqzVar.f);
        aglj agljVar = (aglj) this.a.k.get();
        agljVar.W(t, agqzVar);
        agljVar.V(t, agqe.PAUSED);
        this.a.t(t);
        m(t);
    }

    @Override // defpackage.agxf
    public final void e(final agqz agqzVar) {
        if (!agxg.ai(agqzVar)) {
            return;
        }
        this.a.i.execute(new Runnable() { // from class: agjv
            @Override // java.lang.Runnable
            public final void run() {
                agjy agjyVar = agjy.this;
                agqz agqzVar2 = agqzVar;
                String t = agxg.t(agqzVar2.f);
                ((aglj) agjyVar.a.k.get()).W(t, agqzVar2);
                agjyVar.a.t(t);
                agkh agkhVar = (agkh) agjyVar.a.n.get();
                if (agkhVar.c().contains(t)) {
                    agki b = agkhVar.b();
                    if (b.e(agqzVar2)) {
                        agjyVar.a.n(b.b());
                    }
                }
                agwk agwkVar = (agwk) agjyVar.a.o.get();
                if (agwkVar.c().contains(t)) {
                    agwl b2 = agwkVar.b();
                    if (!b2.f(agqzVar2)) {
                        return;
                    }
                    agjyVar.a.v(b2.b());
                }
            }
        });
    }

    @Override // defpackage.agxf
    public final void f(agqz agqzVar) {
        if (!agxg.ai(agqzVar)) {
            return;
        }
        String t = agxg.t(agqzVar.f);
        ((agkh) this.a.n.get()).b().f(agqzVar);
        ((agwk) this.a.o.get()).b().g(agqzVar);
        m(t);
    }

    @Override // defpackage.agxf
    public final void g() {
        this.a.i.execute(new Runnable() { // from class: agju
            @Override // java.lang.Runnable
            public final void run() {
                agjy agjyVar = agjy.this;
                String a = agjyVar.a.f.a();
                if (!agjyVar.a.b.equals(a)) {
                    return;
                }
                aglj agljVar = (aglj) agjyVar.a.k.get();
                agkh agkhVar = (agkh) agjyVar.a.n.get();
                agwk agwkVar = (agwk) agjyVar.a.o.get();
                boolean z = false;
                boolean z2 = false;
                for (agqz agqzVar : agjyVar.a.f.b(a).values()) {
                    if (agxg.ai(agqzVar)) {
                        String t = agxg.t(agqzVar.f);
                        agljVar.W(t, agqzVar);
                        agjyVar.a.t(t);
                        z |= agkhVar.c().contains(t);
                        if (agwkVar.c().contains(t)) {
                            z2 = true;
                        }
                    }
                }
                if (z) {
                    agjyVar.a.n(agkhVar.b().b());
                }
                if (z2) {
                    agjyVar.a.v(agwkVar.b().b());
                }
                for (agqv agqvVar : agljVar.s()) {
                    if (agqvVar.i() == agqp.PLAYABLE) {
                        agjyVar.a.C(agqvVar);
                    }
                }
            }
        });
    }

    @Override // defpackage.agxf
    public final void h(agqz agqzVar) {
        if (!agxg.ai(agqzVar)) {
            return;
        }
        String t = agxg.t(agqzVar.f);
        aglj agljVar = (aglj) this.a.k.get();
        agljVar.W(t, agqzVar);
        agljVar.V(t, agqe.ACTIVE);
        this.a.t(t);
        m(t);
    }

    @Override // defpackage.agxf
    public final void i(agqz agqzVar) {
    }

    @Override // defpackage.agxf
    public final void j(agqz agqzVar) {
    }

    @Override // defpackage.agxf
    public final void k(final agqz agqzVar, final atsg atsgVar, final agqe agqeVar) {
        int f = agxg.f(agqzVar.f);
        if (agxg.ai(agqzVar)) {
            this.a.i.execute(new Runnable() { // from class: agjx
                @Override // java.lang.Runnable
                public final void run() {
                    agjy agjyVar = agjy.this;
                    agqz agqzVar2 = agqzVar;
                    agqe agqeVar2 = agqeVar;
                    atsg atsgVar2 = atsgVar;
                    final String t = agxg.t(agqzVar2.f);
                    aglj agljVar = (aglj) agjyVar.a.k.get();
                    agljVar.W(t, agqzVar2);
                    agljVar.V(t, agqeVar2);
                    if (agqzVar2.b == avkl.TRANSFER_STATE_COMPLETE) {
                        if (agqeVar2 == agqe.COMPLETE) {
                            agqo c = agljVar.c(t);
                            if (c != null) {
                                agljVar.H(c);
                                agjyVar.a.r(t);
                            }
                        } else if (agqeVar2 == agqe.REQUIRES_CONTENT_VERIFICATION) {
                            byte[] aj = agxg.aj(agqzVar2.f);
                            if (aj == null) {
                                aj = aadi.b;
                            }
                            final byte[] bArr = aj;
                            agjyVar.a.t(t);
                            final agjz agjzVar = agjyVar.a;
                            final String n = agxg.n(agqzVar2.f);
                            final boolean ac = agxg.ac(agqzVar2.f);
                            final boolean ag = agxg.ag(agqzVar2.f);
                            agjzVar.h.s(new Runnable() { // from class: agjr
                                @Override // java.lang.Runnable
                                public final void run() {
                                    agjz agjzVar2 = agjz.this;
                                    String str = t;
                                    byte[] bArr2 = bArr;
                                    String str2 = n;
                                    boolean z = ac;
                                    boolean z2 = ag;
                                    agqv e = agjzVar2.e(str);
                                    if (e == null) {
                                        zep.b("[Offline] Snapshot missing for video queued for verification");
                                    } else if (e.l != agqe.REQUIRES_CONTENT_VERIFICATION) {
                                        String valueOf = String.valueOf(e.l);
                                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 61);
                                        sb.append("[Offline] Content verification requested for video in state: ");
                                        sb.append(valueOf);
                                        zep.l(sb.toString());
                                    } else {
                                        agkg agkgVar = (agkg) agjzVar2.l.get();
                                        ylr.b();
                                        agqy agqyVar = new agqy();
                                        agxg.z(agqyVar, bArr2);
                                        agxg.X(agqyVar, str);
                                        agxg.V(agqyVar, 5);
                                        agxg.S(agqyVar, agkgVar.a.a());
                                        agxg.P(agqyVar, agqe.REQUIRES_CONTENT_VERIFICATION);
                                        agxg.W(agqyVar, z2);
                                        if (str2 != null) {
                                            agxg.A(agqyVar, str2);
                                        }
                                        agxg.F(agqyVar, z);
                                        agkgVar.c.c(agkgVar.b, String.format(Locale.US, "%s:%s:cv", agkgVar.b, str), 250, agqyVar);
                                    }
                                }
                            });
                        }
                    } else {
                        if (agqzVar2.b == avkl.TRANSFER_STATE_TRANSFERRING) {
                            ((agrn) agjyVar.a.e.get()).g(t);
                        }
                        agjyVar.a.u(t, atsgVar2);
                    }
                    agkh agkhVar = (agkh) agjyVar.a.n.get();
                    if (agkhVar.c().contains(t)) {
                        agki b = agkhVar.b();
                        if (b.e(agqzVar2)) {
                            agjyVar.a.n(b.b());
                        }
                    }
                    agwk agwkVar = (agwk) agjyVar.a.o.get();
                    if (agwkVar.c().contains(t)) {
                        agwl b2 = agwkVar.b();
                        if (!b2.f(agqzVar2)) {
                            return;
                        }
                        agjyVar.a.v(b2.b());
                    }
                }
            });
        } else if (f != 2) {
            if (f != 5) {
                return;
            }
            this.a.i.execute(new Runnable() { // from class: agjw
                @Override // java.lang.Runnable
                public final void run() {
                    agjy agjyVar = agjy.this;
                    agqz agqzVar2 = agqzVar;
                    agqe agqeVar2 = agqeVar;
                    String t = agxg.t(agqzVar2.f);
                    aglj agljVar = (aglj) agjyVar.a.k.get();
                    agljVar.W(t, agqzVar2);
                    agljVar.V(t, agqeVar2);
                    if (agqeVar2 == agqe.COMPLETE) {
                        agjyVar.a.r(t);
                    } else {
                        agjyVar.a.t(t);
                    }
                }
            });
        } else {
            String t = agxg.t(agqzVar.f);
            if (TextUtils.isEmpty(t)) {
                return;
            }
            ((aglj) this.a.k.get()).x(t);
        }
    }

    @Override // defpackage.agxf
    public final void l(agqz agqzVar) {
        String t = agxg.t(agqzVar.f);
        agjz agjzVar = this.a;
        t.length();
        agjzVar.h.v(new agoh(t));
    }
}
