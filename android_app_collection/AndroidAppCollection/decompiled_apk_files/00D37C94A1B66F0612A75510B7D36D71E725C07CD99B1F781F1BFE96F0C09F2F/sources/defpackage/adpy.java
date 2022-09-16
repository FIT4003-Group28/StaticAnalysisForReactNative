package defpackage;

import android.os.Handler;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: adpy  reason: default package */
/* loaded from: classes.dex */
public final class adpy implements adro {
    public static final String a = zep.a("MDX.SessionRecoveryController");
    public adrm c;
    public adnw d;
    public volatile adnw e;
    public boolean g;
    private final snc h;
    private final adrn i;
    private final Handler k;
    private final airw l;
    private final List o;
    private boolean p;
    private final aypf m = new aypf();
    private final adpx n = new adpx(this);
    private final Runnable q = new adpu(this);
    private final adpv r = new adpv(this);
    private final Set j = Collections.newSetFromMap(new ConcurrentHashMap());
    public volatile adoi b = adoi.a().a();
    public volatile String f = "";

    public adpy(snc sncVar, adrn adrnVar, Handler handler, airw airwVar, acwu acwuVar) {
        this.h = sncVar;
        this.i = adrnVar;
        this.k = handler;
        this.l = airwVar;
        this.o = acwuVar.ap;
    }

    private final void k(adnw adnwVar, int i) {
        adoh a2 = adoi.a();
        a2.b(i);
        if (adnwVar != null) {
            a2.c(adnwVar.e);
        }
        adoi a3 = a2.a();
        if (this.b.equals(a3)) {
            return;
        }
        this.b = a3;
        for (adri adriVar : this.j) {
            adoi adoiVar = this.b;
            adriVar.a.o();
            int i2 = adoiVar.a;
            if (i2 != 0) {
                if (i2 == 1) {
                    for (adnz adnzVar : adriVar.a.c) {
                        String str = adoiVar.b;
                        adnzVar.d();
                    }
                } else if (i2 == 2) {
                    for (adnz adnzVar2 : adriVar.a.c) {
                        adnzVar2.b();
                    }
                } else if (i2 == 3) {
                    for (adnz adnzVar3 : adriVar.a.c) {
                        adnzVar3.a();
                    }
                } else if (i2 == 4) {
                    for (adnz adnzVar4 : adriVar.a.c) {
                        String str2 = adoiVar.b;
                        adnzVar4.c();
                    }
                } else {
                    StringBuilder sb = new StringBuilder(28);
                    sb.append("unexpected state:");
                    sb.append(i2);
                    throw new AssertionError(sb.toString());
                }
            }
        }
    }

    private final void l(adrm adrmVar, adnw adnwVar) {
        if (!adnwVar.a.h()) {
            zep.c(a, "session was not connected, do not start recovery.");
            f(0);
            return;
        }
        zep.h(a, "starting session recovery");
        this.d = adnwVar;
        k(adnwVar, 1);
        adrmVar.f(adnwVar, this.r);
        if (((admy) adnwVar.a.c()).d) {
            return;
        }
        long j = ((admy) adnwVar.a.c()).c;
        this.k.removeCallbacks(this.q);
        this.k.postDelayed(this.q, Math.max(0L, j - this.h.c()));
    }

    private final boolean m(adnw adnwVar) {
        return adnwVar.a.h() && (((admy) adnwVar.a.c()).d || ((admy) adnwVar.a.c()).c - this.h.c() > 0) && adnwVar.f.h() && !this.o.contains(Integer.valueOf(((atcv) adnwVar.f.c()).C));
    }

    @Override // defpackage.adro
    public final adoi a() {
        return this.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
        if (((defpackage.adid) r4).n.equals(r1.a) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0059, code lost:
        if (r1 != 2) goto L26;
     */
    @Override // defpackage.adro
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ampq b(defpackage.adig r4) {
        /*
            r3 = this;
            adnw r0 = r3.e
            if (r0 != 0) goto L7
            amon r4 = defpackage.amon.a
            return r4
        L7:
            java.lang.String r1 = r3.f
            if (r1 == 0) goto L25
            java.lang.String r1 = r3.f
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L25
            java.lang.String r1 = r3.f
            java.lang.String r2 = defpackage.adew.f(r4)
            boolean r1 = defpackage.adgl.c(r1, r2)
            if (r1 != 0) goto L20
            goto L25
        L20:
            ampq r4 = defpackage.ampq.j(r0)
            return r4
        L25:
            java.lang.String r1 = defpackage.adpy.a
            java.lang.String r2 = "recovered screen cannot be matched via selected route Id, fallback to sessionInfo"
            defpackage.zep.m(r1, r2)
            java.lang.String r1 = r0.d
            java.lang.String r2 = defpackage.adew.f(r4)
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L39
            goto L5c
        L39:
            int r1 = r0.i
            r2 = 3
            if (r1 != r2) goto L55
            boolean r1 = r4 instanceof defpackage.adid
            defpackage.aqxo.y(r1)
            adid r4 = (defpackage.adid) r4
            adna r1 = r0.c
            r1.getClass()
            adit r4 = r4.n
            adit r1 = r1.a
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L5c
            goto L5f
        L55:
            r4 = 4
            if (r1 == r4) goto L5f
            r4 = 2
            if (r1 != r4) goto L5c
            goto L5f
        L5c:
            amon r4 = defpackage.amon.a
            return r4
        L5f:
            ampq r4 = defpackage.ampq.j(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adpy.b(adig):ampq");
    }

    @Override // defpackage.adro
    public final void c(adnw adnwVar) {
        if (!adnwVar.a.h()) {
            return;
        }
        if (!m(adnwVar)) {
            f(0);
            return;
        }
        adrm a2 = this.i.a(adnwVar.i);
        this.c = a2;
        if (a2 == null) {
            String str = a;
            int i = adnwVar.i;
            String W = i != 0 ? almu.W(i) : "null";
            StringBuilder sb = new StringBuilder(String.valueOf(W).length() + 52);
            sb.append("No session recoverer for loaded SessionInfo of type ");
            sb.append(W);
            zep.m(str, sb.toString());
            return;
        }
        l(a2, adnwVar);
    }

    @Override // defpackage.adro
    public final void d() {
        ylr.c();
        adnw adnwVar = this.d;
        if (this.c == null || adnwVar == null) {
            return;
        }
        f(2);
    }

    public final void e() {
        f(3);
    }

    public final void f(int i) {
        adrm adrmVar = this.c;
        if (adrmVar != null) {
            adrmVar.d();
            this.c = null;
        }
        adnw adnwVar = this.d;
        this.d = null;
        this.k.removeCallbacks(this.q);
        k(adnwVar, i);
    }

    @Override // defpackage.adro
    public final void g(adnw adnwVar) {
        ylr.c();
        this.g = false;
        adrm a2 = this.i.a(adnwVar.i);
        this.c = a2;
        if (a2 == null) {
            f(0);
        } else if (m(adnwVar)) {
            l(this.c, adnwVar);
        } else {
            f(0);
        }
    }

    @Override // defpackage.adro
    public final void h(adnt adntVar) {
        ylr.c();
        this.g = true;
        adrm adrmVar = this.c;
        if (adrmVar != null && !adrmVar.e(adntVar)) {
            this.c.d();
        }
        this.e = null;
        this.f = "";
        this.d = null;
        k(null, 0);
    }

    @Override // defpackage.adro
    public final void i() {
        ylr.c();
        if (this.p) {
            return;
        }
        this.p = true;
        this.m.g(this.n.g(this.l));
    }

    @Override // defpackage.adro
    public final void j(adri adriVar) {
        this.j.add(adriVar);
    }
}
