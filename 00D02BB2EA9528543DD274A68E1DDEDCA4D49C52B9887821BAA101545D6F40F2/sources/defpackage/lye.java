package defpackage;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: lye  reason: default package */
/* loaded from: classes.dex */
public final class lye implements lzf {
    public final btrm a;
    public final bvjj b;
    public final crfm c;
    public final lyt d;
    public final akfa f;
    public final Executor g;
    public boolean h;
    @dzsi
    public arym i;
    @dzsi
    public lyd k;
    public final lyr q;
    private final cqat s;
    private final bxtx t;
    private final ckco u;
    private final ckco v;
    public final List<lzd> e = new ArrayList();
    public final Set<String> j = new HashSet();
    @dzsi
    public btlu l = null;
    public final crzp<btlu> m = new lxw(this);
    final crzo<Boolean> n = new crzo<>(false);
    public final lys o = new lxx(this);
    public final lxy r = new lxy(this);
    public final lzd p = new lxz(this);

    public lye(btrm btrmVar, bvjj bvjjVar, lyr lyrVar, cqat cqatVar, ckcw ckcwVar, crfm crfmVar, bxtx bxtxVar, akfa akfaVar, Executor executor) {
        dbsk.s(btrmVar);
        this.a = btrmVar;
        dbsk.s(lyrVar);
        this.q = lyrVar;
        dbsk.s(cqatVar);
        this.s = cqatVar;
        dbsk.s(bvjjVar);
        this.b = bvjjVar;
        dbsk.s(crfmVar);
        this.c = crfmVar;
        dbsk.s(bxtxVar);
        this.t = bxtxVar;
        dbsk.s(akfaVar);
        this.f = akfaVar;
        dbsk.s(executor);
        this.g = executor;
        this.d = new lyt(crfmVar, btrmVar);
        this.u = (ckco) ckcwVar.a(ckee.aj);
        this.v = (ckco) ckcwVar.a(ckee.ak);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long m() {
        return UUID.randomUUID().getLeastSignificantBits();
    }

    private final void q(lzc lzcVar, int i) {
        dbsk.l(i > 0);
        if (i == 1) {
            this.u.a(lzcVar.a.j);
        } else {
            this.v.a(lzcVar.a.j);
        }
    }

    @Override // defpackage.btph
    public final void NX(String str, PrintWriter printWriter) {
        throw null;
    }

    @Override // defpackage.lzf
    public final void a(@dzsi List<amvh> list) {
        bvrj.UI_THREAD.c();
        this.q.a();
        lyb lybVar = new lyb(this, list);
        this.k = lybVar;
        lybVar.a();
    }

    @Override // defpackage.lzf
    public final void b() {
        bvrj.UI_THREAD.c();
        a(null);
    }

    @Override // defpackage.lzf
    public final void d(dcdc<ldm> dcdcVar, int i, @dzsi lze lzeVar, lyy lyyVar) {
        bvrj.UI_THREAD.c();
        dbsk.l(dcdcVar.size() > 0);
        ldm ldmVar = dcdcVar.get(0);
        if (ldmVar.u() != 2) {
            throw new IllegalStateException("navigate() called when navigation is not possible.");
        }
        q(lyyVar.a(), dcdcVar.size());
        qbn qbnVar = ldmVar.e;
        if (qbnVar != null) {
            qbnVar.b(null);
            ldmVar.f = ldmVar.e.a();
        }
        ilo iloVar = ldmVar.d;
        if (iloVar != null) {
            this.a.b(bwka.b(iloVar, this.s));
        }
        if (this.b.m(bvjk.jG, true) || btlu.i(this.f.j()) != btlt.SIGNED_OUT) {
            if (iloVar == null) {
                String str = ldmVar.b;
                String str2 = ldmVar.c;
                if (!dbsj.d(str) && !dbsj.d(str2)) {
                    this.t.g(ldmVar.h, 4, str, str2);
                }
            } else {
                this.t.f(iloVar, 4);
            }
        }
        amte l = ldmVar.l();
        dbsk.s(l);
        this.k = new lyc(this, dcdcVar, lyyVar, i, null, l, this.p, lzeVar);
        this.q.b(new lya(this, this.k));
    }

    @Override // defpackage.lzf
    public final boolean e() {
        bvrj.UI_THREAD.c();
        return this.i == arym.GUIDED_NAV;
    }

    @Override // defpackage.lzf
    public final boolean f() {
        bvrj.UI_THREAD.c();
        return this.h;
    }

    @Override // defpackage.lzf
    public final void g(lzd lzdVar) {
        bvrj.UI_THREAD.c();
        List<lzd> list = this.e;
        dbsk.s(lzdVar);
        list.add(lzdVar);
        if (e()) {
            lzdVar.a(dcdc.e(), lyy.c(new lzc(lzb.ALREADY_RUNNING_WHEN_ACTIVITY_STARTED)).a());
        }
    }

    @Override // defpackage.lzf
    public final void h(lzd lzdVar) {
        bvrj.UI_THREAD.c();
        List<lzd> list = this.e;
        dbsk.s(lzdVar);
        list.add(lzdVar);
    }

    @Override // defpackage.lzf
    public final void i(lzd lzdVar) {
        bvrj.UI_THREAD.c();
        dbsk.l(this.e.remove(lzdVar));
    }

    public final void j() {
        lxp.e(this.b);
        this.c.d(false);
    }

    @Override // defpackage.lzf
    public final crzm<Boolean> k() {
        return this.n.a;
    }

    @Override // defpackage.lzf
    public final void l() {
        this.n.a(true);
    }

    public final void n(@dzsi kfe kfeVar) {
        kfe kfeVar2;
        bvrj.UI_THREAD.c();
        lyr lyrVar = this.q;
        lyrVar.a.a = kfeVar;
        lyj lyjVar = lyrVar.b;
        lyjVar.a.c();
        lyjVar.c = kfeVar;
        lya lyaVar = lyjVar.d;
        if (lyaVar != null) {
            lyjVar.f(lyaVar);
        }
        if (lyjVar.b && (kfeVar2 = lyjVar.c) != null) {
            kfeVar2.b();
        }
        lym lymVar = lyrVar.c;
        lymVar.a.c();
        lymVar.b = kfeVar;
        lxy lxyVar = lymVar.c;
        if (lxyVar != null) {
            lymVar.c(lxyVar);
        }
    }

    @Override // defpackage.lzf
    public final void p(ldm ldmVar, amuh amuhVar, @dzsi dpfh dpfhVar, lyy lyyVar) {
        bvrj.UI_THREAD.c();
        dbsk.a(amuhVar.j());
        q(lyyVar.a(), 1);
        amub k = amuhVar.k();
        this.k = new lyc(this, dcdc.f(ldmVar), lyyVar, k.c, dpfhVar, k.d(), this.p, null);
        this.q.b(new lya(this, this.k));
    }
}
