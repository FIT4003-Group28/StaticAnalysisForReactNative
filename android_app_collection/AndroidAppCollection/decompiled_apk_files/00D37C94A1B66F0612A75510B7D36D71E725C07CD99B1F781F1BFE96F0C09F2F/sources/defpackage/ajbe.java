package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: ajbe  reason: default package */
/* loaded from: classes.dex */
public final class ajbe implements ajbr {
    private static long f;
    public final ajff a;
    public final ajaq b;
    public final ajai c;
    public final aivw d;
    public final aacz e;
    private final ajbc g;
    private final aijf h;
    private final aeov i;
    private final ajar j;
    private final aikf k;
    private final snc l;
    private final aiix m;
    private final aadd n;
    private final Handler o = new Handler(Looper.getMainLooper());
    private boolean p = false;
    private final ajal q;

    public ajbe(aeov aeovVar, ajbc ajbcVar, ajai ajaiVar, aijf aijfVar, ajar ajarVar, aikf aikfVar, ajaq ajaqVar, snc sncVar, ajff ajffVar, ajal ajalVar, aiix aiixVar, aacz aaczVar, aadd aaddVar) {
        this.a = ajffVar;
        this.b = ajaqVar;
        this.g = ajbcVar;
        this.h = aijfVar;
        this.q = ajalVar;
        this.c = ajaiVar;
        this.i = aeovVar;
        this.j = ajarVar;
        this.k = aikfVar;
        this.l = sncVar;
        this.m = aiixVar;
        this.e = aaczVar;
        this.n = aaddVar;
        ajaqVar.b = new WeakReference(ajffVar);
        aivw l = ajffVar.l();
        this.d = l;
        if (aiix.E(aaczVar)) {
            l.t.d(l.f.H().aa(new aivu(l, 14), new aivu(l, 6)));
            l.t.d(l.g.H().aa(new aivu(l, 1), new aivu(l, 6)));
            l.t.d(l.h.H().aa(new aivu(l, 7), new aivu(l, 6)));
            l.t.d(l.i.H().aa(new aivu(l), new aivu(l, 6)));
            l.t.d(l.j.H().aa(new aivu(l, 8), new aivu(l, 6)));
            l.t.d(l.m.H().aa(new aivu(l, 3), new aivu(l, 6)));
            l.t.d(l.l.H().aa(new aivu(l, 2), new aivu(l, 6)));
            l.t.d(l.d.b.H().aa(new aivu(l, 12), new aivu(l, 6)));
            l.t.d(l.k.H().aa(new aivu(l, 10), new aivu(l, 6)));
            l.t.d(l.n.H().aa(new aivu(l, 9), new aivu(l, 6)));
            l.t.d(l.o.H().aa(new aivu(l, 11), new aivu(l, 6)));
            l.t.d(l.p.H().aa(new aivu(l, 13), new aivu(l, 6)));
            apgr apgrVar = aivw.b(l.e).C;
            if ((apgrVar == null ? apgr.a : apgrVar).b) {
                l.t.d(l.d.a().H().aa(new aivu(l, 4), new aivu(l, 6)));
            }
            apgr apgrVar2 = aivw.b(l.e).C;
            if (!(apgrVar2 == null ? apgr.a : apgrVar2).h) {
                return;
            }
            l.t.d(l.r.H().aa(new aivu(l, 5), new aivu(l, 6)));
        }
    }

    private final void E(int i) {
        ajjh.v(this.a, i);
        this.q.g(this.a, 4);
    }

    private final boolean F() {
        atzt D = aiix.D(this.e);
        return (D == null || !D.l) ? this.q.a().e() || (ajjh.w(this.q.b()) && this.q.a().a(aika.PLAYBACK_INTERRUPTED)) : !this.p;
    }

    @Override // defpackage.ajbr
    public final String A() {
        return this.a.Z();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void B(boolean z) {
        if (!z) {
            this.c.l(new ahgl(this.a.Z()), this.a);
        }
        this.a.i().i();
    }

    public final void C() {
        ajaq ajaqVar = this.b;
        ajaqVar.a.clear();
        ajaqVar.b.clear();
        this.a.m().k();
        this.a.o().e(false);
        this.a.o().d();
        this.a.i().g();
        this.a.i().l();
        ajfj p = this.a.p();
        p.e = 0L;
        p.f = -1L;
        p.g = 0L;
        p.h = 0L;
        p.i = 0L;
        p.k = 4;
        this.a.p().l = null;
        if (aiix.E(this.e)) {
            aivw aivwVar = this.d;
            afiz afizVar = aivwVar.s;
            if (afizVar != null) {
                aivwVar.q.deleteObserver(afizVar);
                afizVar.g();
            }
            aivwVar.t.qr();
        }
        this.p = true;
    }

    public final void D(int i) {
        aehr i2 = this.i.i();
        this.q.e(this.a, i, i2.c, i2.b, i2.e, i2.f);
    }

    @Override // defpackage.ajbr
    public final PlayerResponseModel a() {
        return this.a.c();
    }

    @Override // defpackage.ajbr
    public final aijp b() {
        return this.a.h();
    }

    @Override // defpackage.ajbu
    public final ajbv c() {
        return this.a.p();
    }

    @Override // defpackage.aeuo
    public final void d() {
        if (F()) {
            if (aiix.w(this.n)) {
                D(4);
            }
            E(5);
        }
    }

    @Override // defpackage.aeuo
    public final void e(FormatStreamModel formatStreamModel, long j, long j2, aeui[] aeuiVarArr) {
        final aeuh d;
        for (aeui aeuiVar : aeuiVarArr) {
            if (ajjh.w(this.q.b()) && aeuiVar.a.equals("http://youtube.com/streaming/metadata/segment/102015") && formatStreamModel.C() && (d = aeuh.d(j2, aeuiVar)) != null) {
                this.o.post(new Runnable() { // from class: ajbd
                    @Override // java.lang.Runnable
                    public final void run() {
                        ajbe ajbeVar = ajbe.this;
                        aeuh aeuhVar = d;
                        ajai ajaiVar = ajbeVar.c;
                        ahgc ahgcVar = new ahgc(aeuhVar, ajbeVar.A());
                        ajff ajffVar = ajbeVar.a;
                        for (ajfb ajfbVar : ajaiVar.b) {
                        }
                        ajffVar.af().c(ahgcVar);
                    }
                });
            }
        }
        PlayerResponseModel a = a();
        if (a == null || a.c() == null || !a.c().ai()) {
            return;
        }
        ahgb ahgbVar = new ahgb(aeuiVarArr, formatStreamModel, j, j2);
        this.a.f().a(ahgbVar);
        this.a.ab().c(ahgbVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d0, code lost:
        if (r0.I() == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e2, code lost:
        if (r12.a.q().h(r12.a.Z()) == false) goto L25;
     */
    @Override // defpackage.aeuo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f() {
        /*
            r12 = this;
            boolean r0 = r12.F()
            if (r0 == 0) goto Lee
            ajbc r0 = r12.g
            r0.b()
            ajal r1 = r12.q
            ajff r2 = r12.a
            r3 = 4
            r4 = -1
            long r6 = defpackage.ajjh.p(r2)
            ajff r0 = r12.a
            long r8 = defpackage.ajjh.p(r0)
            r10 = -1
            r1.e(r2, r3, r4, r6, r8, r10)
            ajff r0 = r12.a
            aitv r0 = r0.i()
            aiuf r1 = r0.b
            if (r1 == 0) goto L32
            boolean r2 = r0.f
            if (r2 == 0) goto L32
            r1.i()
        L32:
            aius r1 = r0.d
            if (r1 == 0) goto L39
            r1.b()
        L39:
            aiul r0 = r0.c
            r1 = 7
            r2 = 0
            if (r0 == 0) goto L4f
            r0.i = r2
            r0.C = r1
            snc r3 = r0.d
            long r3 = r3.d()
            r0.b(r2, r3)
            r0.a()
        L4f:
            ajff r0 = r12.a
            ajbj r0 = r0.m()
            r0.g()
            ajal r0 = r12.q
            aika r0 = r0.a()
            boolean r0 = r0.h()
            if (r0 == 0) goto L92
            ajff r0 = r12.a
            defpackage.ajjh.v(r0, r1)
            ajal r0 = r12.q
            ajff r1 = r12.a
            r3 = 2
            r0.g(r1, r3)
            ajal r0 = r12.q
            r0.c(r2)
            ajal r0 = r12.q
            ajff r1 = r12.a
            r2 = 3
            r0.g(r1, r2)
            ajal r0 = r12.q
            ajff r0 = r0.b()
            boolean r0 = defpackage.ajjh.w(r0)
            if (r0 != 0) goto Lee
            ajai r0 = r12.c
            ajff r1 = r12.a
            r0.i(r1)
            return
        L92:
            ajal r0 = r12.q
            aika r0 = r0.a()
            aika r3 = defpackage.aika.PLAYBACK_INTERRUPTED
            if (r0 != r3) goto La8
            ajal r0 = r12.q
            ajao r0 = r0.a
            r3 = 1
            ajfl r2 = r0.aA(r2, r2, r3)
            r0.j = r2
            goto Leb
        La8:
            ajff r0 = r12.a
            ajfq r0 = r0.q()
            boolean r0 = r0.i()
            if (r0 == 0) goto Le4
            ajff r0 = r12.a
            com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel r0 = r0.c()
            ajal r2 = r12.q
            ajff r2 = r2.b()
            boolean r2 = defpackage.ajjh.w(r2)
            if (r2 == 0) goto Ld2
            if (r0 == 0) goto Leb
            com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData r0 = r0.c
            if (r0 == 0) goto Leb
            boolean r0 = r0.I()
            if (r0 == 0) goto Leb
        Ld2:
            ajff r0 = r12.a
            ajfq r0 = r0.q()
            ajff r2 = r12.a
            java.lang.String r2 = r2.Z()
            boolean r0 = r0.h(r2)
            if (r0 == 0) goto Leb
        Le4:
            ajal r0 = r12.q
            ajao r0 = r0.a
            r0.U()
        Leb:
            r12.E(r1)
        Lee:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajbe.f():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x020e  */
    @Override // defpackage.aeuo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(defpackage.afkn r15) {
        /*
            Method dump skipped, instructions count: 621
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajbe.g(afkn):void");
    }

    @Override // defpackage.aeuo
    public final void h(aesr aesrVar) {
        this.a.i().c(aesrVar);
        ajai ajaiVar = this.c;
        ajff ajffVar = this.a;
        for (ajfb ajfbVar : ajaiVar.b) {
            ajfbVar.i(aesrVar, ajffVar.Z());
        }
        ajffVar.ac().c(aesrVar);
        afiz afizVar = this.d.s;
        if (afizVar == null || !aiix.E(this.e)) {
            return;
        }
        afizVar.r(aesrVar);
    }

    @Override // defpackage.aeuo
    public final void i(String str, afip afipVar) {
        ajai ajaiVar = this.c;
        String A = A();
        for (ajfb ajfbVar : ajaiVar.b) {
            ajfbVar.j(str, afipVar, A);
        }
        afiz afizVar = this.d.s;
        if (afizVar == null || !aiix.E(this.e)) {
            return;
        }
        afizVar.s(str, afipVar);
    }

    @Override // defpackage.aeuo
    public final void j(afte afteVar) {
        ajai ajaiVar = this.c;
        String Z = this.a.Z();
        for (ajfb ajfbVar : ajaiVar.b) {
            ajfbVar.m(Z);
        }
        afiz afizVar = this.d.s;
        if (afizVar == null || !aiix.E(this.e)) {
            return;
        }
        afizVar.u();
    }

    @Override // defpackage.aeuo
    public final void k(long j, long j2) {
        ajjh.t(this.a, j2);
        this.a.p().g = j;
    }

    @Override // defpackage.aeuo
    public final void l(String str) {
        this.a.ah().c(ahgd.b(str));
    }

    @Override // defpackage.aeuo
    public final void m() {
        long c = this.l.c();
        if (F()) {
            ahgr ahgrVar = new ahgr();
            ahgrVar.b(c);
            this.a.ak().c(ahgrVar);
            aitv i = this.a.i();
            aiuf aiufVar = i.b;
            if (aiufVar != null && i.f) {
                aiufVar.k();
            }
            aiul aiulVar = i.c;
            if (aiulVar != null && aiulVar.i) {
                aiulVar.C = 3;
                aiulVar.b(false, aiulVar.d.d());
                aiulVar.i = false;
            }
            this.a.m().h();
            E(3);
        }
    }

    @Override // defpackage.aeuo
    public final void n() {
        if (F()) {
            if (aiix.w(this.n)) {
                D(4);
            }
            E(6);
        }
    }

    @Override // defpackage.aeuo
    public final void o(long j) {
        if (F()) {
            this.a.ao().c(new ahgj(ajjh.r(this.i), j));
            this.a.i().j(j);
            this.g.e = this.a.m().b(j, false);
            E(10);
        }
    }

    @Override // defpackage.aeuo
    public final void p(float f2) {
        PlayerResponseModel c = this.q.b().c();
        ajai ajaiVar = this.c;
        ahgh ahghVar = new ahgh(ajjh.s(this.i, c).a(), c, f2);
        ajff ajffVar = this.a;
        for (ajfb ajfbVar : ajaiVar.b) {
            ajfbVar.S(ahghVar);
        }
        ajffVar.al().c(ahghVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0204  */
    @Override // defpackage.aeuo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q() {
        /*
            Method dump skipped, instructions count: 528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajbe.q():void");
    }

    @Override // defpackage.aeuo
    public final void r() {
        this.q.f(2);
    }

    @Override // defpackage.aeuo
    public final void s(long j) {
        if (!aiix.q(this.n) || !this.q.a().d()) {
            return;
        }
        ahgv ahgvVar = new ahgv(ajjh.r(this.i), this.q.a().a(aika.INTERSTITIAL_PLAYING));
        if (j >= 0) {
            ahgvVar.i((j - this.l.c()) + this.l.d());
            ahgvVar.b(j);
        } else {
            ahgvVar.b(this.l.c());
        }
        ajai.x(ahgvVar, this.a);
    }

    @Override // defpackage.aeuo
    public final void t(long j) {
        if (F()) {
            this.a.ao().c(new ahgj(ajjh.r(this.i), j));
            this.a.i().j(j);
            this.g.e = this.a.m().b(j, false);
            E(9);
        }
    }

    @Override // defpackage.aeuo
    public final void u(long j) {
        t(j);
    }

    @Override // defpackage.aeuo
    public final void v() {
        if (this.q.a.at()) {
            this.q.f(1);
            if (!F()) {
                return;
            }
            aitv i = this.a.i();
            aiuf aiufVar = i.b;
            if (aiufVar != null && i.f) {
                aiufVar.n();
            }
            aiul aiulVar = i.c;
            if (aiulVar != null && aiulVar.i) {
                aiulVar.C = 9;
                aiulVar.b(false, aiulVar.d.d());
                aiulVar.i = false;
            }
            this.g.b();
            E(4);
        }
    }

    @Override // defpackage.aeuo
    public final void w(String str, String str2) {
        ajai ajaiVar = this.c;
        String A = A();
        for (ajfb ajfbVar : ajaiVar.b) {
            ajfbVar.s(str, str2, A);
        }
        afiz afizVar = this.d.s;
        if (afizVar == null || !aiix.E(this.e)) {
            return;
        }
        afizVar.C(str, str2);
    }

    @Override // defpackage.aeuo
    public final void x(int i) {
        this.h.i();
        this.a.aC().c(new ahhr(i));
        ajal ajalVar = this.q;
        String Z = this.a.Z();
        ajai ajaiVar = ajalVar.a.c;
        aiip aiipVar = new aiip(15, i, Z);
        for (ajfb ajfbVar : ajaiVar.b) {
            ajfbVar.u(aiipVar);
        }
        afiz afizVar = this.d.s;
        if (afizVar == null || !aiix.E(this.e)) {
            return;
        }
        afizVar.D(i);
    }

    @Override // defpackage.aeuo
    public final void y(long j) {
        long c = this.l.c();
        if (F() && ajjh.w(this.q.b())) {
            this.a.i().i();
            this.c.e(this.a.Z());
            this.q.d(aika.PLAYBACK_INTERRUPTED);
        }
        ajal ajalVar = this.q;
        ajff ajffVar = this.a;
        ajalVar.e(ajffVar, 4, ajffVar.p().f, j, j, -1L);
        ajfp p = this.a.q().p(this.a.Z(), this.a.p().e);
        if (p != null) {
            this.a.au().c(new ahhh(p.e, c));
        }
    }

    @Override // defpackage.aeuo
    public final void z(awan awanVar) {
        this.c.d(new ahge(awanVar, false), this.a);
    }
}
