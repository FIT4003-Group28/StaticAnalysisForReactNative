package defpackage;

import android.app.Activity;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bxzq  reason: default package */
/* loaded from: classes4.dex */
public class bxzq implements bxxu {
    private static final wfz w = new wfy(dtyb.cc, dtyb.ce, dtyb.cd, dtxr.bX, dtyf.v, dtyb.cJ, dtyb.cK, dtyb.cr);
    public final Activity a;
    public final cklq b;
    public final dxio<aeaa> c;
    public final ckhe d;
    public final dxio<glj> e;
    public final bxxl f;
    private final bxsg j;
    private final bxsh k;
    private final bxsa l;
    private final bxsi m;
    private final bxwx n;
    private final bxxj o;
    private final bxyg p;
    private final bxzi q;
    private final bxto r;
    private final bxuq s;
    private final Executor t;
    private final bxwh u;
    public boolean g = true;
    private final cqqw v = new bxzp(this);
    public boolean h = false;
    public boolean i = false;

    public bxzq(Activity activity, dxio<glj> dxioVar, ckcw ckcwVar, dxio<aeaa> dxioVar2, bxsg bxsgVar, bxsh bxshVar, bxsa bxsaVar, bxsi bxsiVar, bxwx bxwxVar, bxxj bxxjVar, bxtp bxtpVar, bxsk bxskVar, bxyg bxygVar, bxzi bxziVar, bxuq bxuqVar, wdw wdwVar, cklq cklqVar, bxxl bxxlVar, Executor executor) {
        this.a = activity;
        this.l = bxsaVar;
        this.m = bxsiVar;
        this.n = bxwxVar;
        this.o = bxxjVar;
        boolean a = wdwVar.a();
        wfz wfzVar = w;
        dxio a2 = ((dxjh) bxtpVar.a).a();
        bxtp.a(a2, 1);
        dxio a3 = ((dxjh) bxtpVar.b).a();
        bxtp.a(a3, 2);
        bxtf a4 = bxtpVar.c.a();
        bxtp.a(a4, 3);
        bato a5 = bxtpVar.d.a();
        bxtp.a(a5, 4);
        ahjq a6 = bxtpVar.e.a();
        bxtp.a(a6, 5);
        btvo a7 = bxtpVar.f.a();
        bxtp.a(a7, 6);
        dxio a8 = ((dxjh) bxtpVar.g).a();
        bxtp.a(a8, 7);
        cqat a9 = bxtpVar.h.a();
        bxtp.a(a9, 8);
        bxtp.a(bxtpVar.i.a(), 9);
        Executor a10 = bxtpVar.j.a();
        bxtp.a(a10, 10);
        dehp a11 = bxtpVar.k.a();
        bxtp.a(a11, 11);
        bxtp.a(bxskVar, 12);
        bxtp.a(wfzVar, 15);
        this.r = new bxto(a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, bxskVar, a, false, wfzVar);
        this.p = bxygVar;
        this.q = bxziVar;
        this.e = dxioVar;
        this.s = bxuqVar;
        this.b = cklqVar;
        this.t = executor;
        this.c = dxioVar2;
        this.d = (ckhe) ckcwVar.a(ckjw.av);
        this.f = bxxlVar;
        this.j = bxsgVar;
        this.k = bxshVar;
        this.u = new bxwh();
    }

    @Override // defpackage.bxxu
    public void a(cqiv cqivVar) {
        if (!this.h) {
            return;
        }
        bxsa bxsaVar = this.l;
        if (btlu.i(bxsaVar.a.j()) == btlt.INCOGNITO) {
            cqivVar.e(bxsaVar.b);
        }
        bxsg bxsgVar = this.j;
        if (!bxsgVar.b.i()) {
            cqivVar.e(bxsgVar.a);
        }
        bxxj bxxjVar = this.o;
        if (bxxjVar.c != null) {
            cqivVar.a(new bxxd(), bxxjVar.c);
        }
        bxuq bxuqVar = this.s;
        if (bxuqVar.f != null) {
            cqivVar.a(new bxui(), bxuqVar.f);
        }
        bxto bxtoVar = this.r;
        if (bxtoVar.c.a().j().l() && bxtoVar.d.g().booleanValue()) {
            cqivVar.a(new bxsx(), bxtoVar.d);
        }
        bxzi bxziVar = this.q;
        if (bxziVar.e != null && !bxziVar.a.a().isEmpty()) {
            cqivVar.e(bxziVar.e);
        }
        bxxo bxxoVar = this.p.e;
        if (bxxoVar != null) {
            cqivVar.g(bxxoVar.b());
        }
        bxwx bxwxVar = this.n;
        if (!bxwxVar.e.e()) {
            cqivVar.e(bxwxVar.h);
        }
        bxsh bxshVar = this.k;
        btlt i = btlu.i(bxshVar.a.j());
        if (i != btlt.GOOGLE && i != btlt.INCOGNITO && bxshVar.b.i()) {
            cqivVar.a(new bxkl(), bxshVar.c);
        }
        bxsi bxsiVar = this.m;
        btlt i2 = btlu.i(bxsiVar.b.j());
        if (!bxsiVar.a.a() && i2 != btlt.SIGNED_OUT && i2 != btlt.INCOGNITO && bxsiVar.c.i()) {
            cqivVar.e(bxsiVar.d);
        }
        bxwh bxwhVar = this.u;
        bxwhVar.a.clear();
        bxwhVar.b.clear();
        int i3 = cqivVar.i();
        List<cqix<?>> list = cqivVar.a;
        if (list.isEmpty()) {
            return;
        }
        cqix<?> cqixVar = list.get(0);
        int i4 = 1;
        while (i4 < i3) {
            cqix<?> cqixVar2 = list.get(i4);
            if (!(cqixVar2.b() instanceof bssk) && !(cqixVar.a() instanceof bxqz) && !(cqixVar2.a() instanceof bxuy) && !(cqixVar2.a() instanceof bxvn) && !(cqixVar.a() instanceof bxqz) && !(cqixVar.a() instanceof bxuu)) {
                if (!(cqixVar.a() instanceof bxvl) || !(cqixVar2.a() instanceof bxvl)) {
                    if (!(cqixVar.a() instanceof bxvl) || !(cqixVar2.a() instanceof bxqz)) {
                        bxwhVar.a.add(Integer.valueOf(i4));
                    }
                } else {
                    bxwhVar.b.add(Integer.valueOf(i4));
                }
            }
            i4++;
            cqixVar = cqixVar2;
        }
    }

    @Override // defpackage.bxxu
    public abp b(Context context) {
        return new bxjr(context, this.u);
    }

    @Override // defpackage.bxxu
    public cqqw c() {
        return this.v;
    }

    @Override // defpackage.bxxu
    public Boolean d() {
        return Boolean.valueOf(this.g);
    }

    public void e() {
        dehn<?> dehnVar;
        bxyk a;
        dehn dehnVar2;
        if (this.i) {
            return;
        }
        this.b.a(ckls.ZERO_PREFIX_SUGGESTIONS_REQUESTED);
        bxxl bxxlVar = this.f;
        dehn<Void> dehnVar3 = bxxlVar.e;
        if (dehnVar3 == null || !dehnVar3.isDone()) {
            bxxlVar.f = true;
            dehn<Void> dehnVar4 = bxxlVar.e;
            if (dehnVar4 != null) {
                dehnVar4.cancel(false);
            }
        }
        this.i = true;
        this.h = false;
        this.d.a();
        dehn[] dehnVarArr = new dehn[6];
        final bxwx bxwxVar = this.n;
        if (btlu.i(bxwxVar.a.j()) != btlt.GOOGLE || bxwxVar.b.i()) {
            dehnVar = dehk.a;
        } else {
            dehnVar = deew.h(bxwxVar.c.C().j(), new dbrn(bxwxVar) { // from class: bxww
                private final bxwx a;

                {
                    this.a = bxwxVar;
                }

                @Override // defpackage.dbrn
                public final Object a(Object obj) {
                    bxwx bxwxVar2 = this.a;
                    avkr avkrVar = (avkr) obj;
                    dbsk.s(avkrVar);
                    dcdn<dspd, dltm> c = avkrVar.c();
                    if (c.equals(bxwxVar2.i)) {
                        return null;
                    }
                    bxwxVar2.i = c;
                    bxwv bxwvVar = bxwxVar2.e;
                    dccr<dltm> values = bxwxVar2.i.values();
                    ArrayList a2 = dchl.a();
                    for (dltm dltmVar : values) {
                        if (bxwxVar2.d.a(dltmVar)) {
                            bxwt bxwtVar = bxwxVar2.f;
                            eeu a3 = bxwtVar.a.a();
                            bxwt.a(a3, 1);
                            dzsj<avik> dzsjVar = bxwtVar.b;
                            avzp a4 = bxwtVar.c.a();
                            bxwt.a(a4, 3);
                            bxwt.a(dltmVar, 4);
                            a2.add(new bxws(a3, dzsjVar, a4, dltmVar));
                        }
                    }
                    bxwvVar.f(a2);
                    return null;
                }
            }, bxwxVar.g);
        }
        dehnVarArr[0] = dehnVar;
        final bxxj bxxjVar = this.o;
        dehnVarArr[1] = deee.g(deew.h(degp.q(bxxjVar.a.a()), new dbrn(bxxjVar) { // from class: bxxh
            private final bxxj a;

            {
                this.a = bxxjVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                bxxj bxxjVar2 = this.a;
                awtn awtnVar = (awtn) obj;
                if (awtnVar == null) {
                    bxxjVar2.c = null;
                } else {
                    bxxf bxxfVar = bxxjVar2.c;
                    if (bxxfVar == null || !awtnVar.equals(bxxfVar.d())) {
                        bxxg bxxgVar = bxxjVar2.b;
                        bxxg.a(awtnVar, 1);
                        ff ffVar = (ff) ((dxjd) bxxgVar.a).a;
                        bxxg.a(ffVar, 2);
                        eeu a2 = bxxgVar.b.a();
                        bxxg.a(a2, 3);
                        cqat a3 = bxxgVar.c.a();
                        bxxg.a(a3, 4);
                        awre a4 = bxxgVar.d.a();
                        bxxg.a(a4, 5);
                        awtj a5 = bxxgVar.e.a();
                        bxxg.a(a5, 6);
                        bxxjVar2.c = new bxxf(awtnVar, ffVar, a2, a3, a4, a5);
                    }
                    if (bxxjVar2.c == null) {
                        throw new IllegalStateException();
                    }
                }
                return null;
            }
        }, dege.a), Throwable.class, new dbrn(bxxjVar) { // from class: bxxi
            private final bxxj a;

            {
                this.a = bxxjVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                Throwable th = (Throwable) obj;
                this.a.c = null;
                return null;
            }
        }, dege.a);
        bxyg bxygVar = this.p;
        if (bxygVar.e == null || bxygVar.g != bxygVar.b.a()) {
            boolean a2 = bxygVar.b.a();
            bxygVar.g = a2;
            if (!a2) {
                a = bxygVar.d.a();
            } else {
                a = bxygVar.c.a();
            }
            bxxp bxxpVar = a;
            bxye bxyeVar = bxygVar.a;
            boolean z = bxygVar.g;
            bxye.a(bxxpVar, 2);
            gga a3 = bxyeVar.a.a();
            bxye.a(a3, 3);
            btrm a4 = bxyeVar.b.a();
            bxye.a(a4, 4);
            bxeg a5 = bxyeVar.c.a();
            bxye.a(a5, 5);
            bxyu a6 = bxyeVar.d.a();
            bxye.a(a6, 6);
            bxzr a7 = bxyeVar.e.a();
            bxye.a(a7, 7);
            bxtu a8 = bxyeVar.f.a();
            bxye.a(a8, 8);
            bxtx a9 = bxyeVar.g.a();
            bxye.a(a9, 9);
            ania a10 = bxyeVar.h.a();
            bxye.a(a10, 10);
            dxio a11 = ((dxjh) bxyeVar.i).a();
            bxye.a(a11, 11);
            bxygVar.e = new bxyd(true ^ z, bxxpVar, a3, a4, a5, a6, a7, a8, a9, a10, a11);
        }
        bxxo bxxoVar = bxygVar.e;
        dbsk.s(bxxoVar);
        dehn<Void> a12 = bxxoVar.a(bxygVar.f);
        bxygVar.f = false;
        dehnVarArr[2] = a12;
        final bxzi bxziVar = this.q;
        if (!bxziVar.b.a() || bxziVar.e == null) {
            dehnVar2 = dehk.a;
        } else {
            bxziVar.d.a();
            dehnVar2 = bxziVar.a.b(bxziVar.f);
            dehnVar2.Pk(new Runnable(bxziVar) { // from class: bxzh
                private final bxzi a;

                {
                    this.a = bxziVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    bxzi bxziVar2 = this.a;
                    bxziVar2.d.c();
                    bxziVar2.c.a().d(aeav.SEARCH_ZERO_SUGGEST_ADS);
                }
            }, dege.a);
            bxziVar.f = false;
        }
        dehnVarArr[3] = dehnVar2;
        dehnVarArr[4] = this.r.a();
        dehnVarArr[5] = this.s.a();
        deha.k(dehnVarArr).c(new Runnable(this) { // from class: bxzn
            private final bxzq a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                dcdc<cklr> e;
                bxzq bxzqVar = this.a;
                bxzqVar.b.b();
                bxzqVar.h = true;
                bxzqVar.d.c();
                bxzqVar.c.a().d(aeav.PERSONALIZED_HISTORY);
                cqkx.p(bxzqVar);
                bxzqVar.i = false;
                cklq cklqVar = bxzqVar.b;
                cklt ckltVar = cklt.ZERO_PREFIX_SUGGESTION_LIST;
                bxxl bxxlVar2 = bxzqVar.f;
                if (!bxxlVar2.g) {
                    bxxlVar2.g = true;
                    dehn<Void> dehnVar5 = bxxlVar2.e;
                    if (dehnVar5 == null) {
                        e = dcdc.f(cklr.NO_PREINFLATED_LAYOUTS);
                    } else if (dehnVar5.isCancelled()) {
                        e = dcdc.f(cklr.SOME_PREINFLATED_LAYOUTS);
                    } else if (bxxlVar2.e.isDone()) {
                        e = dcdc.f(cklr.ALL_LAYOUTS_PREINFLATED);
                    } else {
                        e = dcdc.e();
                    }
                } else {
                    e = dcdc.e();
                }
                cklqVar.d(ckltVar, e);
            }
        }, this.t);
    }

    public void f() {
        if (this.i) {
            return;
        }
        this.h = false;
        this.s.a().Pk(new Runnable(this) { // from class: bxzo
            private final bxzq a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bxzq bxzqVar = this.a;
                bxzqVar.h = true;
                cqkx.p(bxzqVar);
            }
        }, this.t);
    }

    public boolean g() {
        cryo cryoVar;
        bxuq bxuqVar = this.s;
        cryr cryrVar = bxuqVar.h;
        return cryrVar != null && ((cryoVar = bxuqVar.g) == null || !cryrVar.a.b.a().b().equals(cryoVar.b()));
    }
}
