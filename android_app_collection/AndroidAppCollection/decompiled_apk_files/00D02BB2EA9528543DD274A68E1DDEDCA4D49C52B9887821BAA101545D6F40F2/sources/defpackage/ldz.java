package defpackage;

import java.io.PrintWriter;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ldz  reason: default package */
/* loaded from: classes7.dex */
public final class ldz implements non {
    public final akox a;
    public final nov b;
    public final noo c;
    public final ldy d;
    public final ckcw e;
    public final dxio<bvrv> f;
    final nog g;
    public final cqat h;
    @dzsi
    public cryz<lzf> i;
    @dzsi
    public lzf j;
    public final les k;
    @dzsi
    public lkr l;
    public boolean m;
    public final dcba<ldu> n;
    public final crfr q;
    private final dehn<lzf> r;
    private final kcy s;
    private final Executor t;
    private final jua u;
    public final ldx o = new ldx(this);
    public final lkn p = new lds(this);
    private final ldt v = new ldt(this);

    public ldz(akox akoxVar, nov novVar, noo nooVar, ldy ldyVar, jua juaVar, dehn dehnVar, crfr crfrVar, kcy kcyVar, noe noeVar, cqat cqatVar, crzm crzmVar, ckcw ckcwVar, Executor executor, dxio dxioVar, noh nohVar) {
        dbsk.s(akoxVar);
        this.a = akoxVar;
        dbsk.s(novVar);
        this.b = novVar;
        dbsk.s(nooVar);
        this.c = nooVar;
        dbsk.s(ldyVar);
        this.d = ldyVar;
        dbsk.s(juaVar);
        this.u = juaVar;
        dbsk.s(dehnVar);
        this.r = dehnVar;
        this.q = crfrVar;
        dbsk.s(kcyVar);
        this.s = kcyVar;
        dbsk.s(cqatVar);
        this.h = cqatVar;
        dbsk.s(ckcwVar);
        this.e = ckcwVar;
        dbsk.s(executor);
        this.t = executor;
        dbsk.s(dxioVar);
        this.f = dxioVar;
        dbsk.s(crzmVar);
        this.g = nohVar.a(noeVar, novVar);
        this.k = ldyVar.a();
        this.n = dcba.a(10);
    }

    @Override // defpackage.btph
    public final void NX(String str, PrintWriter printWriter) {
        boolean z = this.m;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 14);
        sb.append(str);
        sb.append("started: ");
        sb.append(z);
        printWriter.println(sb.toString());
        boolean z2 = true;
        boolean z3 = this.i != null;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 45);
        sb2.append(str);
        sb2.append("navigationManagerReadyCallback present: ");
        sb2.append(z3);
        printWriter.println(sb2.toString());
        boolean z4 = this.j != null;
        StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 32);
        sb3.append(str);
        sb3.append("navigationManager present: ");
        sb3.append(z4);
        printWriter.println(sb3.toString());
        if (this.l == null) {
            z2 = false;
        }
        StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 32);
        sb4.append(str);
        sb4.append("navigationOverlay present: ");
        sb4.append(z2);
        printWriter.println(sb4.toString());
        this.g.NX(str, printWriter);
    }

    @Override // defpackage.non
    public final void a() {
        this.g.k(this.k);
        this.s.d(this.v);
        this.i = bvqj.d(this.r, new bvqg(this) { // from class: ldn
            private final ldz a;

            {
                this.a = this;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                ldz ldzVar = this.a;
                lzf lzfVar = (lzf) obj;
                dbsk.l(ldzVar.j == null);
                ldzVar.j = lzfVar;
                ldzVar.j.g(ldzVar.o);
                ldzVar.i = null;
                if (ldzVar.m) {
                    ldzVar.q.a();
                }
            }
        }, this.t);
    }

    @Override // defpackage.non
    @dzsi
    public final noq b() {
        return this.g.d();
    }

    public final mbr d() {
        final lkr lkrVar = this.l;
        if (lkrVar != null) {
            if (lkrVar.w) {
                return this.u.a(new mcn(this, lkrVar) { // from class: ldo
                    private final ldz a;
                    private final lkr b;

                    {
                        this.a = this;
                        this.b = lkrVar;
                    }

                    @Override // defpackage.mcn
                    public final void NY(final aste asteVar, final mnz mnzVar) {
                        final ldz ldzVar = this.a;
                        final lkr lkrVar2 = this.b;
                        final Runnable runnable = new Runnable(ldzVar, asteVar, mnzVar) { // from class: ldr
                            private final ldz a;
                            private final aste b;
                            private final mnz c;

                            {
                                this.a = ldzVar;
                                this.b = asteVar;
                                this.c = mnzVar;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                ldz ldzVar2 = this.a;
                                ldzVar2.k.NY(this.b, this.c);
                            }
                        };
                        lkrVar2.a.execute(new Runnable(lkrVar2, runnable) { // from class: lka
                            private final lkr a;
                            private final Runnable b;

                            {
                                this.a = lkrVar2;
                                this.b = runnable;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                lkr lkrVar3 = this.a;
                                Runnable runnable2 = this.b;
                                if (!lkrVar3.w) {
                                    runnable2.run();
                                } else {
                                    lkrVar3.x.add(runnable2);
                                }
                            }
                        });
                    }
                });
            }
            jua juaVar = this.u;
            lkrVar.getClass();
            return juaVar.a(new mcn(lkrVar) { // from class: ldp
                private final lkr a;

                {
                    this.a = lkrVar;
                }

                @Override // defpackage.mcn
                public final void NY(aste asteVar, mnz mnzVar) {
                    lkr lkrVar2 = this.a;
                    lkrVar2.g.a();
                    lkrVar2.l();
                    lju ljuVar = lkrVar2.s;
                    nog nogVar = ljuVar.p;
                    nogVar.k(((jvg) ljuVar.f).a.w(nogVar, asteVar, ljuVar.k.c, ljuVar.q, mnzVar, mcl.DEFAULT, ljuVar.i.a(), new mwp(((jvg) ljuVar.f).a, ljuVar.p)));
                    lkrVar2.g.b();
                }
            });
        }
        return this.u.a(this.k);
    }

    @Override // defpackage.non
    public final void e() {
        this.g.e();
    }

    @Override // defpackage.non
    public final void f() {
        dbsk.l(!this.m);
        this.s.d(null);
        this.b.a();
        while (!this.g.h()) {
            this.g.n();
        }
        this.b.b();
        cryz<lzf> cryzVar = this.i;
        if (cryzVar != null) {
            cryzVar.c();
            this.i = null;
        }
        lzf lzfVar = this.j;
        if (lzfVar != null) {
            lzfVar.i(this.o);
            this.j = null;
        }
        this.o.a.removeCallbacksAndMessages(null);
    }

    @Override // defpackage.non
    public final String g() {
        return "BaseNavigationOverlay";
    }

    @Override // defpackage.non
    public final boolean h() {
        return true;
    }

    @Override // defpackage.non
    public final int i() {
        if (!this.g.h()) {
            return this.g.b();
        }
        return 3;
    }
}
