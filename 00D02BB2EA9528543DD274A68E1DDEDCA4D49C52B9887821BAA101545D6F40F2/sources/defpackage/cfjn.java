package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cfjn  reason: default package */
/* loaded from: classes4.dex */
public class cfjn implements cfhf {
    public final gga a;
    public final cfgv b;
    public final List<cfgf> c;
    @dzsi
    public dlnm d;
    @dzsi
    public cfhs e;
    @dzsi
    public cfhs f;
    @dzsi
    public cfhs g;
    private final ceze h;
    private final cfjb i;
    private final aujx j;
    private final dlno k;
    private final cezu l;
    private final bvrb m;
    private final cfkq n;
    private final cezg o;
    private final Class<? extends fd> p;
    private final cfkj q;
    private final dcdc<dlnm> r;
    private final Runnable s;
    private final Resources t;
    private Boolean u;

    public cfjn(gga ggaVar, cqhn cqhnVar, cfjb cfjbVar, aujx aujxVar, cfgv cfgvVar, ceze cezeVar, cfkq cfkqVar, bvrb bvrbVar, cezg cezgVar, Resources resources, cezu cezuVar, Class<? extends fd> cls) {
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        this.h = cezeVar;
        this.a = ggaVar;
        this.i = cfjbVar;
        this.j = aujxVar;
        this.b = cfgvVar;
        this.m = bvrbVar;
        this.n = cfkqVar;
        this.o = cezgVar;
        this.t = resources;
        dlno a = cfgvVar.a();
        this.k = a;
        this.l = cezuVar;
        this.p = cls;
        this.u = p();
        this.r = dcdc.r(a.c);
        arrayList.addAll(Collections.unmodifiableList(((cfgj) cfgvVar.a.b).d));
        this.q = new cfjl(this);
        this.e = null;
        this.f = null;
        o(true);
        cfgvVar.b.add(new cfjf(this));
        this.s = new Runnable(this) { // from class: cfjg
            private final cfjn a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cfjn cfjnVar = this.a;
                cfhs cfhsVar = cfjnVar.e;
                if (cfhsVar != null) {
                    cfhsVar.x();
                }
                cfjnVar.k();
            }
        };
    }

    private final Boolean p() {
        return Boolean.valueOf(this.t.getConfiguration().orientation == 2);
    }

    private final void q() {
        if (!this.u.equals(p())) {
            dlnm dlnmVar = this.d;
            dbsk.s(dlnmVar);
            m(dlnmVar, cfhr.CENTER);
        }
        this.u = p();
    }

    private final boolean r() {
        return !this.c.isEmpty() && !((cfgf) dcft.s(this.c)).d;
    }

    private final boolean s() {
        cfhs cfhsVar;
        cfhs cfhsVar2;
        cfhs cfhsVar3 = this.f;
        return (cfhsVar3 != null && cfhsVar3.s()) || ((cfhsVar = this.e) != null && cfhsVar.s()) || ((cfhsVar2 = this.g) != null && cfhsVar2.s());
    }

    @Override // defpackage.cfhf
    @dzsi
    public cfhe a() {
        if (!(this.f instanceof cfhe) || p().booleanValue()) {
            return null;
        }
        return (cfhe) this.f;
    }

    @Override // defpackage.cfhf
    @dzsi
    public cfhe b() {
        if (!(this.e instanceof cfhe) || p().booleanValue()) {
            return null;
        }
        q();
        return (cfhe) this.e;
    }

    @Override // defpackage.cfhf
    @dzsi
    public cfhe c() {
        if (!(this.g instanceof cfhe) || p().booleanValue()) {
            return null;
        }
        return (cfhe) this.g;
    }

    @Override // defpackage.cfhf
    @dzsi
    public cfhe d() {
        if (!(this.f instanceof cfhe) || !p().booleanValue()) {
            return null;
        }
        return (cfhe) this.f;
    }

    @Override // defpackage.cfhf
    @dzsi
    public cfhe e() {
        if (!(this.e instanceof cfhe) || !p().booleanValue()) {
            return null;
        }
        q();
        return (cfhe) this.e;
    }

    @Override // defpackage.cfhf
    @dzsi
    public cfhe f() {
        if (!(this.g instanceof cfhe) || !p().booleanValue()) {
            return null;
        }
        return (cfhe) this.g;
    }

    @Override // defpackage.cfhf
    @dzsi
    public cfhk g() {
        cfhs cfhsVar = this.f;
        if (cfhsVar instanceof cfhk) {
            return (cfhk) cfhsVar;
        }
        return null;
    }

    @Override // defpackage.cfhf
    @dzsi
    public cfhk h() {
        cfhs cfhsVar = this.e;
        if (cfhsVar instanceof cfhk) {
            return (cfhk) cfhsVar;
        }
        return null;
    }

    @Override // defpackage.cfhf
    @dzsi
    public cfhk i() {
        cfhs cfhsVar = this.g;
        if (cfhsVar instanceof cfhk) {
            return (cfhk) cfhsVar;
        }
        return null;
    }

    public CharSequence j() {
        dlnd dlndVar;
        dlnm dlnmVar = this.d;
        if (dlnmVar != null) {
            if (dlnmVar.d == 13) {
                dlndVar = (dlnd) dlnmVar.e;
            } else {
                dlndVar = dlnd.c;
            }
            return dlndVar.a;
        }
        return "";
    }

    public boolean k() {
        if (!s() && this.e != null) {
            if (!r()) {
                return false;
            }
            cfhs cfhsVar = this.e;
            dbsk.s(cfhsVar);
            cfhsVar.w(new Runnable(this) { // from class: cfjh
                private final cfjn a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    cfjn cfjnVar = this.a;
                    bvrj.UI_THREAD.c();
                    cfjnVar.f = null;
                    cfjnVar.g = cfjnVar.e;
                    List<cfgf> list = cfjnVar.c;
                    dlnm dlnmVar = list.remove(list.size() - 1).b;
                    if (dlnmVar == null) {
                        dlnmVar = dlnm.l;
                    }
                    cfjnVar.m(dlnmVar, cfhr.END);
                    cfhs cfhsVar2 = cfjnVar.g;
                    if (cfhsVar2 != null) {
                        cfhsVar2.v();
                    }
                    cfhs cfhsVar3 = cfjnVar.e;
                    if (cfhsVar3 != null) {
                        cfhsVar3.v();
                    }
                    cqkx.p(cfjnVar);
                }
            });
        }
        return true;
    }

    public void l(cfgv cfgvVar) {
        List<cfgf> list = this.c;
        cfgi cfgiVar = cfgvVar.a;
        if (cfgiVar.c) {
            cfgiVar.bF();
            cfgiVar.c = false;
        }
        cfgj cfgjVar = cfgj.h;
        ((cfgj) cfgiVar.b).d = cfgj.ck();
        cfgvVar.a.b(list);
    }

    public final void m(final dlnm dlnmVar, cfhr cfhrVar) {
        boolean a;
        cfjb cfjbVar = this.i;
        cfjm cfjmVar = new cfjm(this, dlnmVar) { // from class: cfji
            private final cfjn a;
            private final dlnm b;

            {
                this.a = this;
                this.b = dlnmVar;
            }

            @Override // defpackage.cfjm
            public final void a(cfgd cfgdVar) {
                this.a.n(this.b, cfgdVar);
            }
        };
        cezu cezuVar = this.l;
        dspd dspdVar = this.k.b;
        cfkj cfkjVar = this.q;
        Runnable runnable = r() ? this.s : null;
        boolean r = r();
        if (!this.c.isEmpty()) {
            a = true;
        } else {
            cfga bZ = cfgd.h.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            cfgd.d((cfgd) bZ.b);
            cfgd bK = bZ.bK();
            cfge bZ2 = cfgf.e.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            cfgf cfgfVar = (cfgf) bZ2.b;
            dlnmVar.getClass();
            cfgfVar.b = dlnmVar;
            int i = cfgfVar.a | 1;
            cfgfVar.a = i;
            bK.getClass();
            cfgfVar.c = bK;
            cfgfVar.a = i | 2;
            ArrayList arrayList = new ArrayList(this.c);
            arrayList.add(bZ2.bK());
            a = cfgp.a(this.r, arrayList).a();
        }
        cfgm a2 = cfjbVar.a.a();
        cfjb.a(a2, 1);
        dxio a3 = ((dxjh) cfjbVar.b).a();
        cfjb.a(a3, 2);
        Executor a4 = cfjbVar.c.a();
        cfjb.a(a4, 3);
        cqhn a5 = cfjbVar.d.a();
        cfjb.a(a5, 4);
        ceze a6 = cfjbVar.e.a();
        cfjb.a(a6, 5);
        cfjv a7 = cfjbVar.f.a();
        cfjb.a(a7, 6);
        cfki a8 = cfjbVar.g.a();
        cfjb.a(a8, 7);
        cfhw a9 = cfjbVar.h.a();
        cfjb.a(a9, 8);
        cflc a10 = cfjbVar.i.a();
        cfjb.a(a10, 9);
        cfkx a11 = cfjbVar.j.a();
        cfjb.a(a11, 10);
        cfie a12 = cfjbVar.k.a();
        cfjb.a(a12, 11);
        cfij a13 = cfjbVar.l.a();
        cfjb.a(a13, 12);
        cfks a14 = cfjbVar.m.a();
        cfjb.a(a14, 13);
        bwsh a15 = cfjbVar.n.a();
        cfjb.a(a15, 14);
        cezt a16 = cfjbVar.o.a();
        cfjb.a(a16, 15);
        gga a17 = cfjbVar.p.a();
        cfjb.a(a17, 16);
        cfkl a18 = cfjbVar.q.a();
        cfjb.a(a18, 17);
        cfgv a19 = cfjbVar.r.a();
        cfjb.a(a19, 18);
        cqhu a20 = cfjbVar.s.a();
        cfjb.a(a20, 19);
        cpv a21 = cfjbVar.t.a();
        cfjb.a(a21, 20);
        btvo a22 = cfjbVar.u.a();
        cfjb.a(a22, 21);
        cfgl a23 = cfjbVar.v.a();
        cfjb.a(a23, 22);
        cfjb.a(cfjmVar, 23);
        cfjb.a(cezuVar, 24);
        cfjb.a(dspdVar, 25);
        cfjb.a(dlnmVar, 26);
        cfjb.a(cfhrVar, 27);
        cfjb.a(cfkjVar, 28);
        cfja cfjaVar = new cfja(a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23, cfjmVar, cezuVar, dspdVar, dlnmVar, cfhrVar, cfkjVar, runnable, r, a);
        cfjaVar.y();
        this.e = cfjaVar;
        this.d = dlnmVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void n(dlnm dlnmVar, cfgd cfgdVar) {
        bvrj.UI_THREAD.c();
        if (s()) {
            return;
        }
        if (this.f == null) {
            dlno dlnoVar = this.k;
            if ((dlnoVar.a & 2) != 0) {
                aujx aujxVar = this.j;
                ddos b = ddos.b(dlnoVar.e);
                if (b == null) {
                    b = ddos.POST_TRIP_UGC;
                }
                aujxVar.c(b).a(null);
            }
        }
        cfge bZ = cfgf.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        cfgf cfgfVar = (cfgf) bZ.b;
        dlnmVar.getClass();
        cfgfVar.b = dlnmVar;
        int i = cfgfVar.a | 1;
        cfgfVar.a = i;
        cfgdVar.getClass();
        cfgfVar.c = cfgdVar;
        cfgfVar.a = i | 2;
        cfgf bK = bZ.bK();
        this.l.d(bK);
        this.c.add(bK);
        this.b.f(dlnmVar.g, cfgdVar);
        cfhs cfhsVar = this.e;
        dbsk.s(cfhsVar);
        cfhsVar.w(new Runnable(this) { // from class: cfjj
            private final cfjn a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cfjn cfjnVar = this.a;
                bvrj.UI_THREAD.c();
                cfjnVar.o(false);
                cfhs cfhsVar2 = cfjnVar.f;
                if (cfhsVar2 != null) {
                    cfhsVar2.u();
                }
                cfhs cfhsVar3 = cfjnVar.e;
                if (cfhsVar3 != null) {
                    cfhsVar3.u();
                }
                cqkx.p(cfjnVar);
            }
        });
    }

    public final void o(boolean z) {
        cfkp a;
        dlnu dlnuVar;
        dlnu dlnuVar2;
        dbsg<dlnm> a2 = cfgp.a(this.r, this.c);
        if (a2.a()) {
            this.g = null;
            this.f = this.e;
            m(a2.b(), z ? cfhr.CENTER : cfhr.BEGIN);
            return;
        }
        this.f = this.e;
        cfhr cfhrVar = z ? cfhr.CENTER : cfhr.BEGIN;
        Iterator<dlny> it = this.k.d.iterator();
        loop0: while (true) {
            if (it.hasNext()) {
                dlny next = it.next();
                for (dlnx dlnxVar : next.e) {
                    if (dlnxVar.b) {
                        dlnv dlnvVar = next.d;
                        if (dlnvVar == null) {
                            dlnvVar = dlnv.f;
                        }
                        if (dlnvVar.b == 3) {
                            dlnuVar = (dlnu) dlnvVar.c;
                        } else {
                            dlnuVar = dlnu.c;
                        }
                        if ((dlnuVar.a & 1) != 0) {
                            cezg cezgVar = this.o;
                            dlnv dlnvVar2 = next.d;
                            if (dlnvVar2 == null) {
                                dlnvVar2 = dlnv.f;
                            }
                            if (dlnvVar2.b == 3) {
                                dlnuVar2 = (dlnu) dlnvVar2.c;
                            } else {
                                dlnuVar2 = dlnu.c;
                            }
                            if (cezgVar.a(dlnuVar2.b).cq().a()) {
                                break;
                            }
                        }
                    }
                    if (!cfgp.b(dlnxVar.a, this.c)) {
                        break;
                    }
                }
                a = this.n.a(next, cfhrVar, this.p);
                break loop0;
            }
            cfkq cfkqVar = this.n;
            dlnp bZ = dlny.f.bZ();
            String charSequence = cqrt.l(R.string.UGC_POST_TRIP_THANK_YOU_TITLE).a(this.a).toString();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dlny dlnyVar = (dlny) bZ.b;
            charSequence.getClass();
            dlnyVar.a |= 2;
            dlnyVar.b = charSequence;
            String charSequence2 = cqrt.l(R.string.UGC_POST_TRIP_THANK_YOU_TEXT).a(this.a).toString();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dlny dlnyVar2 = (dlny) bZ.b;
            charSequence2.getClass();
            dlnyVar2.a |= 4;
            dlnyVar2.c = charSequence2;
            dlns bZ2 = dlnv.f.bZ();
            String charSequence3 = cqrt.l(R.string.UGC_POST_TRIP_CLOSE_BUTTON_LABEL).a(this.a).toString();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dlnv dlnvVar3 = (dlnv) bZ2.b;
            charSequence3.getClass();
            dlnvVar3.a |= 1;
            dlnvVar3.d = charSequence3;
            dlnv dlnvVar4 = (dlnv) bZ2.b;
            dlnvVar4.e = 1;
            dlnvVar4.a |= 2;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dlny dlnyVar3 = (dlny) bZ.b;
            dlnv bK = bZ2.bK();
            bK.getClass();
            dlnyVar3.d = bK;
            dlnyVar3.a |= 8;
            a = cfkqVar.a(bZ.bK(), cfhrVar, this.p);
        }
        this.e = a;
        bvrb bvrbVar = this.m;
        final ceze cezeVar = this.h;
        cezeVar.getClass();
        bvrbVar.a(new Runnable(cezeVar) { // from class: cfjk
            private final ceze a;

            {
                this.a = cezeVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.d();
            }
        }, bvrj.UI_THREAD, 10L);
    }
}
