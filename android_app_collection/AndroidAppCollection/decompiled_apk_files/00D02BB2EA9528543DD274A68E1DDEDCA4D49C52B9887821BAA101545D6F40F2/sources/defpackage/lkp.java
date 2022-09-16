package defpackage;

import android.app.Application;
import android.content.Context;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lkp  reason: default package */
/* loaded from: classes7.dex */
public final class lkp implements atcu {
    final /* synthetic */ lkr a;

    public lkp(lkr lkrVar) {
        this.a = lkrVar;
    }

    private final int l() {
        crqf crqfVar;
        atlq atlqVar = this.a.v;
        if (atlqVar == null || (crqfVar = atlqVar.m) == null) {
            return 0;
        }
        return crqfVar.g().a.ai() - 2;
    }

    @Override // defpackage.asmn
    public final void Qa() {
        lkr lkrVar = this.a;
        lkrVar.s.y = true;
        lkrVar.c.b();
    }

    @Override // defpackage.asmn
    public final void Qb(aste asteVar) {
        throw null;
    }

    @Override // defpackage.asmn
    public final void Qc() {
        throw null;
    }

    @Override // defpackage.atcu
    public final void Qk() {
        final lju ljuVar = this.a.s;
        int l = l();
        ljt ljtVar = ljuVar.f;
        final atcu atcuVar = ljuVar.g;
        Runnable runnable = new Runnable(ljuVar) { // from class: ljj
            private final lju a;

            {
                this.a = ljuVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.k();
            }
        };
        not notVar = ljuVar.q;
        jvg jvgVar = (jvg) ljtVar;
        jvh jvhVar = jvgVar.e;
        final lri lriVar = jvhVar.aE;
        cqkj cqkjVar = jvhVar.v;
        kxu kxuVar = jvhVar.C;
        lxh t = jvgVar.a.t();
        jvh jvhVar2 = jvgVar.e;
        kdg kdgVar = jvhVar2.u;
        final kcw kcwVar = jvhVar2.I;
        final noo nooVar = jvhVar2.y;
        lnh lnhVar = jvhVar2.O;
        jty jtyVar = jvhVar2.bc;
        nfg nfgVar = lriVar.a;
        Runnable runnable2 = new Runnable(nooVar) { // from class: lqx
            private final noo a;

            {
                this.a = nooVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.b();
            }
        };
        Runnable runnable3 = new Runnable(nooVar) { // from class: lqz
            private final noo a;

            {
                this.a = nooVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.a();
            }
        };
        String string = cqkjVar.d.getString(R.string.CAR_NAVIGATION_OPTIONS);
        Context context = cqkjVar.d;
        boolean a = lnhVar.a();
        boolean z = true;
        if (!lriVar.c.e() && !lriVar.c.f()) {
            z = false;
        }
        Runnable runnable4 = new Runnable(atcuVar) { // from class: lra
            private final atcu a;

            {
                this.a = atcuVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.b();
            }
        };
        Runnable runnable5 = new Runnable(kcwVar) { // from class: lrb
            private final kcw a;

            {
                this.a = kcwVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                lkf lkfVar = this.a.c;
                if (lkfVar == null) {
                    return;
                }
                lkfVar.a();
            }
        };
        Runnable runnable6 = new Runnable(lriVar, nooVar) { // from class: lrc
            private final lri a;
            private final noo b;

            {
                this.a = lriVar;
                this.b = nooVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                lri lriVar2 = this.a;
                noo nooVar2 = this.b;
                lriVar2.b.b(new crhv());
                lri.a(nooVar2);
            }
        };
        Runnable runnable7 = new Runnable(atcuVar) { // from class: lrd
            private final atcu a;

            {
                this.a = atcuVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.m();
            }
        };
        Runnable runnable8 = new Runnable(lriVar, nooVar) { // from class: lre
            private final lri a;
            private final noo b;

            {
                this.a = lriVar;
                this.b = nooVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                lri lriVar2 = this.a;
                noo nooVar2 = this.b;
                lriVar2.c.d();
                lri.a(nooVar2);
            }
        };
        Runnable runnable9 = new Runnable(atcuVar) { // from class: lrf
            private final atcu a;

            {
                this.a = atcuVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.h();
            }
        };
        dccx F = dcdc.F();
        F.g(new nfz(3, new ngt(context.getString(R.string.CAR_SETTINGS_TITLE), runnable4, (CharSequence) null, nqu.aG(R.raw.car_only_ic_settings_36dp), dtxm.bW)));
        F.g(new nfz(3, new ngt(context.getString(R.string.MENU_DESTINATION_LIST), runnable, (CharSequence) null, nqu.O(), dtxm.bR)));
        F.g(new nfz(3, new ngt(context.getString(R.string.MENU_ALTERNATES), runnable5, (CharSequence) null, nqu.N(), dtxm.bQ)));
        if (l > 0) {
            F.g(new nfz(3, new ngt(context.getString(R.string.MENU_REMOVE_NEXT_STOP), runnable6, (CharSequence) null, nqu.P(), dtxm.bU)));
        } else {
            F.g(new nfz(3, new ngt(context.getString(R.string.MENU_SEARCH), runnable7, (CharSequence) null, nqu.Q(), dtxm.bV)));
        }
        if (a) {
            if (z) {
                F.g(new nfz(3, new ngt(context.getString(R.string.CAR_MENU_STOP_JOURNEY_SHARING), runnable8, (CharSequence) null, nqu.S(), dtxm.bT)));
            } else {
                F.g(new nfz(3, new ngt(context.getString(R.string.CAR_MENU_START_JOURNEY_SHARING), runnable9, (CharSequence) null, nqu.R(), dtxm.bS)));
            }
        }
        ljuVar.p.k(nfgVar.a(cqkjVar, notVar, kxuVar, t, kdgVar, runnable2, runnable3, string, false, F.f(), jtyVar, new cjsz(dtxm.cd), cjtd.a(dtxm.cg), null));
        ljuVar.l();
        ljuVar.D = lut.a;
    }

    @Override // defpackage.atcu
    public final void Ql() {
    }

    @Override // defpackage.atcu
    public final void b() {
        this.a.m();
    }

    @Override // defpackage.asmn
    public final boolean bb() {
        return this.a.y.c;
    }

    @Override // defpackage.atcu
    public final void c() {
    }

    @Override // defpackage.atcu
    public final void d() {
        if (l() == 0) {
            Qa();
            return;
        }
        lkr lkrVar = this.a;
        lju ljuVar = lkrVar.s;
        String str = lkrVar.n.get(0).b;
        ljt ljtVar = ljuVar.f;
        lwq lwqVar = ljuVar.n.d;
        lwn lwnVar = ljuVar.A;
        jvg jvgVar = (jvg) ljtVar;
        dbsk.l(jvgVar.e.N.isDone());
        jvh jvhVar = jvgVar.e;
        lmt lmtVar = jvhVar.au;
        cqkj cqkjVar = jvhVar.v;
        noo nooVar = jvhVar.y;
        lzf lzfVar = (lzf) deha.s(jvhVar.N);
        kxu kxuVar = jvgVar.e.C;
        lmt.a(cqkjVar, 1);
        lmt.a(nooVar, 2);
        lmt.a(lwqVar, 3);
        jzp a = lmtVar.a.a();
        lmt.a(a, 4);
        btrm a2 = lmtVar.b.a();
        lmt.a(a2, 5);
        lmt.a(lzfVar, 6);
        cjqy a3 = lmtVar.c.a();
        lmt.a(a3, 7);
        cjqq a4 = lmtVar.d.a();
        lmt.a(a4, 8);
        lmt.a(str, 9);
        lmt.a(lwnVar, 10);
        lmt.a(kxuVar, 11);
        ljuVar.p.k(new lms(cqkjVar, nooVar, lwqVar, a, a2, lzfVar, a3, a4, str, lwnVar, kxuVar));
    }

    @Override // defpackage.atcu
    public final void f() {
    }

    @Override // defpackage.atcu
    public final void g(boolean z) {
    }

    @Override // defpackage.atcu
    public final void h() {
        lkr lkrVar = this.a;
        lkrVar.g.a();
        lkrVar.l();
        nog nogVar = lkrVar.o;
        jvg jvgVar = (jvg) lkrVar.k;
        jvh jvhVar = jvgVar.e;
        cqkj cqkjVar = jvhVar.v;
        dukx dukxVar = jvhVar.e.getCarParameters().e;
        if (dukxVar == null) {
            dukxVar = dukx.c;
        }
        ntc ntcVar = new ntc(cqkjVar, dbsg.i(Integer.valueOf(dukxVar.a)));
        jvh jvhVar2 = jvgVar.e;
        lnn lnnVar = jvhVar2.ay;
        noo nooVar = jvhVar2.y;
        kcv kcvVar = jvhVar2.s;
        lni lniVar = new lni(jvhVar2.c, jvhVar2.o);
        Context a = lnnVar.a.a();
        lnn.a(a, 1);
        lnn.a(nooVar, 2);
        btrm a2 = lnnVar.b.a();
        lnn.a(a2, 3);
        btpc a3 = lnnVar.c.a();
        lnn.a(a3, 4);
        lnn.a(kcvVar, 5);
        ckcw a4 = lnnVar.d.a();
        lnn.a(a4, 6);
        amfi a5 = lnnVar.e.a();
        lnn.a(a5, 7);
        lnn.a(lniVar, 8);
        akfa a6 = lnnVar.f.a();
        lnn.a(a6, 9);
        ahvo a7 = lnnVar.g.a();
        lnn.a(a7, 10);
        lnm lnmVar = new lnm(a, nooVar, a2, a3, kcvVar, a4, a5, lniVar, a6, a7);
        jyi h = jyj.h();
        jyk jykVar = (jyk) h;
        jykVar.a = new cjsz(dtxm.be);
        jykVar.c = dtxm.bb;
        jykVar.b = dtxm.bc;
        jykVar.f = dtxm.bg;
        jykVar.g = dtxm.bf;
        jykVar.d = dtxm.aZ;
        jykVar.e = dtxm.ba;
        jyj a8 = h.a();
        jvh jvhVar3 = jvgVar.e;
        jwg jwgVar = jvhVar3.aj;
        cqkj cqkjVar2 = jvhVar3.v;
        nov novVar = jvhVar3.x;
        kcv kcvVar2 = jvhVar3.s;
        jty jtyVar = jvhVar3.bc;
        jur jurVar = jvgVar.a;
        nop nopVar = jurVar.a;
        noo nooVar2 = jvhVar3.y;
        not notVar = jvhVar3.V;
        kdg kdgVar = jvhVar3.u;
        String string = jvhVar3.c.getString(R.string.CAR_TITLE_JOURNEY_SHARING);
        jwg.a(cqkjVar2, 1);
        jwg.a(novVar, 2);
        jwg.a(kcvVar2, 3);
        btvo a9 = jwgVar.a.a();
        jwg.a(a9, 4);
        crzm<Boolean> a10 = jwgVar.b.a();
        jwg.a(a10, 5);
        jwg.a(jtyVar, 6);
        jwg.a(jurVar, 7);
        jwg.a(nopVar, 8);
        jwg.a(nooVar2, 9);
        jwg.a(notVar, 10);
        jwg.a(kdgVar, 11);
        Executor a11 = jwgVar.c.a();
        jwg.a(a11, 12);
        cjqy a12 = jwgVar.d.a();
        jwg.a(a12, 13);
        cjqq a13 = jwgVar.e.a();
        jwg.a(a13, 14);
        jwg.a(ntcVar, 15);
        jwg.a(lnmVar, 16);
        jwg.a(string, 17);
        jwg.a(a8, 18);
        nogVar.k(new jwf(cqkjVar2, novVar, kcvVar2, a9, a10, jtyVar, jurVar, nopVar, nooVar2, notVar, kdgVar, a11, a12, a13, ntcVar, lnmVar, string, a8));
        lkrVar.g.b();
    }

    @Override // defpackage.atcu
    public final void i() {
    }

    @Override // defpackage.atcu
    public final void j() {
        q();
    }

    @Override // defpackage.atcu
    public final void k() {
    }

    @Override // defpackage.asmn
    public final void m() {
        lkr lkrVar = this.a;
        lkrVar.g.a();
        lju ljuVar = lkrVar.s;
        ddho ddhoVar = dtxm.dI;
        mnz mnzVar = mnz.ADD_STOP_CATEGORICAL;
        nog nogVar = ljuVar.p;
        ljt ljtVar = ljuVar.f;
        maw mawVar = ljuVar.k.c;
        final not notVar = ljuVar.q;
        final dcdc<ldm> a = ljuVar.i.a();
        mwp mwpVar = new mwp(((jvg) ljuVar.f).a, ljuVar.p);
        final jvg jvgVar = (jvg) ljtVar;
        jvh jvhVar = jvgVar.e;
        maz mazVar = jvhVar.aC;
        cqkj cqkjVar = jvhVar.v;
        dcdc<brcl> s = jvgVar.a.s();
        jvh jvhVar2 = jvgVar.e;
        kxu kxuVar = jvhVar2.C;
        kcv kcvVar = jvhVar2.s;
        new Runnable(jvgVar, a, notVar) { // from class: juu
            private final jvg a;
            private final dcdc b;
            private final not c;

            {
                this.a = jvgVar;
                this.b = a;
                this.c = notVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                jvg jvgVar2 = this.a;
                dcdc dcdcVar = this.b;
                not notVar2 = this.c;
                jvh jvhVar3 = jvgVar2.e;
                Application application = jvhVar3.c;
                akfa akfaVar = jvhVar3.a;
                jur jurVar = jvgVar2.a;
                mql mqlVar = new mql(application, dcdcVar, akfaVar, jurVar, jurVar.a, jvhVar3.ab, notVar2);
                nop nopVar = jvgVar2.a.a;
                mqy mqyVar = new mqy();
                jvh jvhVar4 = jvgVar2.e;
                nopVar.k(new mqi(mqlVar, mqyVar, jvhVar4.y, notVar2, jvhVar4.v));
            }
        };
        final kcv kcvVar2 = jvgVar.e.s;
        kcvVar2.getClass();
        Runnable runnable = new Runnable(kcvVar2) { // from class: juv
            private final kcv a;

            {
                this.a = kcvVar2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.o();
            }
        };
        kdg kdgVar = jvgVar.e.u;
        jur jurVar = jvgVar.a;
        asmp asmpVar = jurVar.b;
        maz.a(cqkjVar, 1);
        jzp a2 = mazVar.a.a();
        maz.a(a2, 2);
        cjqy a3 = mazVar.b.a();
        maz.a(a3, 3);
        cjqq a4 = mazVar.c.a();
        maz.a(a4, 4);
        ckcw a5 = mazVar.d.a();
        maz.a(a5, 5);
        maz.a(ddhoVar, 6);
        maz.a(s, 7);
        maz.a(notVar, 8);
        maz.a(kxuVar, 9);
        maz.a(nogVar, 10);
        maz.a(kcvVar, 11);
        maz.a(runnable, 13);
        btvo a6 = mazVar.e.a();
        maz.a(a6, 14);
        maz.a(mazVar.f.a(), 15);
        maz.a(kdgVar, 16);
        maz.a(jurVar, 17);
        maz.a(asmpVar, 19);
        maz.a(mawVar, 20);
        maz.a(mwpVar, 21);
        maz.a(mnzVar, 22);
        nogVar.k(new may(cqkjVar, a2, a3, a4, a5, ddhoVar, s, notVar, kxuVar, nogVar, kcvVar, runnable, a6, kdgVar, jurVar, a, asmpVar, mawVar, mwpVar, mnzVar));
        lkrVar.g.b();
    }

    @Override // defpackage.asmn
    public final void q() {
        final lkr lkrVar = this.a;
        lkrVar.w = true;
        lkrVar.a.execute(new Runnable(lkrVar) { // from class: lko
            private final lkr a;

            {
                this.a = lkrVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ilo iloVar;
                lkr lkrVar2 = this.a;
                if (!lkrVar2.y.a) {
                    lkrVar2.n();
                    return;
                }
                llb llbVar = lkrVar2.q;
                if (llbVar != null) {
                    llbVar.b = "";
                }
                atlq atlqVar = lkrVar2.v;
                if (atlqVar == null || (iloVar = atlqVar.q) == null) {
                    lkrVar2.l.a();
                    lkrVar2.n();
                    return;
                }
                amte amteVar = atlqVar.r;
                if (lkrVar2.n.isEmpty()) {
                    lkrVar2.n = dcdc.f(ldm.a(iloVar));
                }
                boolean z = false;
                if (lkrVar2.n.get(0).d == null) {
                    lkrVar2.n.get(0).p(iloVar);
                }
                dcdc<ldm> dcdcVar = lkrVar2.n;
                int size = dcdcVar.size();
                for (int i = 0; i < size; i++) {
                    dcdcVar.get(i).k();
                }
                if (amteVar == null || !amteVar.h()) {
                    dbsk.l(true ^ lkrVar2.n.isEmpty());
                    lkrVar2.l.c(lkrVar2.v.w, (ldm) dcft.s(lkrVar2.n), amteVar, lkrVar2.p);
                    lkrVar2.n();
                    return;
                }
                if (lkrVar2.n.size() >= 2) {
                    z = true;
                }
                dbsk.l(z);
                lkrVar2.l.b(lkrVar2.n, amteVar);
                lkrVar2.n();
            }
        });
    }

    @Override // defpackage.asmn
    public final void r() {
        lkr lkrVar = this.a;
        lkrVar.y.i(lkrVar.r);
    }

    @Override // defpackage.asmn
    public final void y() {
        lkr lkrVar = this.a;
        lkrVar.h.k(lkrVar.d.d.getString(R.string.STEP_LIST_INTERACTION_LOCKOUT), 1);
    }
}
