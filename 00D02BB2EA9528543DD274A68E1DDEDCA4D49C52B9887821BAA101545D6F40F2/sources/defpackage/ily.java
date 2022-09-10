package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: ily  reason: default package */
/* loaded from: classes.dex */
public final class ily {
    @dzsi
    private static String P;
    @dzsi
    private static String Q;
    public static final dcqe a = dcqe.c("ily");
    public static int r;
    @dzsi
    public Long B;
    @dzsi
    public dhze D;
    @dzsi
    public dhld E;
    @dzsi
    public cut F;
    @dzsi
    public akqi G;
    @dzsi
    public akqq H;
    public boolean I;
    public boolean J;
    @dzsi
    public ilf L;
    public boolean c;
    @dzsi
    public ilo d;
    public boolean e;
    public boolean p;
    public int s;
    @dzsi
    public String t;
    @dzsi
    public String u;
    @dzsi
    public cjtd y;
    @dzsi
    public dndr z;
    public final ilw b = new ilw();
    private final ilv N = new ilv();
    public boolean f = true;
    public boolean g = false;
    public boolean h = false;
    public boolean i = false;
    public boolean j = false;
    public boolean k = false;
    public boolean l = false;
    public boolean m = false;
    public boolean n = false;
    public boolean o = false;
    public boolean q = false;
    private dcdc<dvxl> O = dcdc.e();
    public ddho v = ilo.c;
    public String w = "";
    public String x = "";
    public Set<String> A = dcnm.h();
    public List<azvo> C = new ArrayList();
    public int M = 1;
    @dzsi
    public dmmq K = null;

    private final void K(@dzsi dndr dndrVar) {
        if (dndrVar == null) {
            this.z = null;
            this.t = null;
        } else if (dndrVar == dndr.HOME) {
            this.b.a = dndr.HOME;
            this.z = dndr.HOME;
            this.t = P;
        } else if (dndrVar == dndr.WORK) {
            this.b.a = dndr.WORK;
            this.z = dndr.WORK;
            this.t = Q;
        } else if (dndrVar != dndr.NICKNAME) {
        } else {
            this.b.a = dndr.NICKNAME;
            this.z = dndr.NICKNAME;
        }
    }

    public static void a(Context context) {
        P = context.getString(R.string.HOME_LOCATION);
        Q = context.getString(R.string.WORK_LOCATION);
        r = context.getResources().getColor(R.color.qu_white_alpha_54);
    }

    public final void A(drcy drcyVar) {
        ilw ilwVar = this.b;
        drcx drcxVar = drcyVar.d;
        if (drcxVar == null) {
            drcxVar = drcx.d;
        }
        int a2 = drcw.a(drcxVar.b);
        if (a2 == 0) {
            a2 = 1;
        }
        int i = a2 + (-1) != 1 ? 1 : 2;
        dwfi bZ = dwfl.w.bZ();
        String str = drcyVar.b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwfl dwflVar = (dwfl) bZ.b;
        str.getClass();
        dwflVar.a = 2 | dwflVar.a;
        dwflVar.c = str;
        dizg bZ2 = dizh.j.bZ();
        dggg dgggVar = drcyVar.c;
        if (dgggVar == null) {
            dgggVar = dggg.d;
        }
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dizh dizhVar = (dizh) bZ2.b;
        dgggVar.getClass();
        dizhVar.b = dgggVar;
        dizhVar.a = 1 | dizhVar.a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwfl dwflVar2 = (dwfl) bZ.b;
        dizh bK = bZ2.bK();
        bK.getClass();
        dwflVar2.p = bK;
        dwflVar2.a |= 32768;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwfl dwflVar3 = (dwfl) bZ.b;
        dwflVar3.i = i;
        dwflVar3.a |= 256;
        drcx drcxVar2 = drcyVar.d;
        if (drcxVar2 == null) {
            drcxVar2 = drcx.d;
        }
        String str2 = drcxVar2.c;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwfl dwflVar4 = (dwfl) bZ.b;
        str2.getClass();
        dwflVar4.a |= 128;
        dwflVar4.h = str2;
        ilwVar.u = bZ.bK();
    }

    public final void B(final docm docmVar) {
        c(new dbrn(docmVar) { // from class: ilq
            private final docm a;

            {
                this.a = docmVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                dmbp dmbpVar = (dmbp) obj;
                dmbo NV = new cdpt().NV(this.a);
                if (dmbpVar.c) {
                    dmbpVar.bF();
                    dmbpVar.c = false;
                }
                dmbq dmbqVar = (dmbq) dmbpVar.b;
                dmbq dmbqVar2 = dmbq.f;
                NV.getClass();
                dmbqVar.e = NV;
                dmbqVar.a |= 64;
                return dmbpVar;
            }
        });
        docn b = b();
        if (b.c) {
            b.bF();
            b.c = false;
        }
        doco docoVar = (doco) b.b;
        doco docoVar2 = doco.k;
        docmVar.getClass();
        docoVar.i = docmVar;
        docoVar.a |= 64;
        this.b.m = b.bK();
    }

    public final void C(boolean z) {
        this.b.b = Boolean.valueOf(z);
    }

    public final void D() {
        this.b.G = true;
    }

    public final void F(String str) {
        this.b.s = str;
    }

    public final void G(List<dvxl> list) {
        this.O = dcdc.r(list);
    }

    public final void H(final boolean z) {
        c(new dbrn(z) { // from class: ilp
            private final boolean a;

            {
                this.a = z;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                boolean z2 = this.a;
                dmbp dmbpVar = (dmbp) obj;
                if (dmbpVar.c) {
                    dmbpVar.bF();
                    dmbpVar.c = false;
                }
                dmbq dmbqVar = (dmbq) dmbpVar.b;
                dmbq dmbqVar2 = dmbq.f;
                dmbqVar.a |= 16;
                dmbqVar.d = z2;
                return dmbpVar;
            }
        });
        docn b = b();
        if (b.c) {
            b.bF();
            b.c = false;
        }
        doco docoVar = (doco) b.b;
        doco docoVar2 = doco.k;
        docoVar.a |= 256;
        docoVar.j = z;
        this.b.m = b.bK();
    }

    public final void I(amvh amvhVar) {
        ilw ilwVar = this.b;
        if (amvhVar == null) {
            return;
        }
        if (amvhVar.m()) {
            ilwVar.n = amvhVar.d.o();
        }
        if (amvhVar.n()) {
            ilwVar.d(amvhVar.e);
        }
        altv altvVar = amvhVar.j;
        if (altvVar != null) {
            ilwVar.c(altvVar);
        }
        ilwVar.s = amvhVar.l() ? amvhVar.c : amvhVar.p();
        String p = dbsj.d(amvhVar.q(false)) ? amvhVar.c : amvhVar.p();
        if (p != null) {
            dpxc bZ = dpxf.f.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dpxf dpxfVar = (dpxf) bZ.b;
            p.getClass();
            dpxfVar.a |= 1;
            dpxfVar.b = p;
            ilwVar.g = bZ.bK();
        }
        ilwVar.A = amvhVar.z;
    }

    public final void J(final String str, final dbrn<docg, docg> dbrnVar) {
        c(new dbrn(str, dbrnVar) { // from class: ilt
            private final String a;
            private final dbrn b;

            {
                this.a = str;
                this.b = dbrnVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                String str2 = this.a;
                dbrn dbrnVar2 = this.b;
                dmbp dmbpVar = (dmbp) obj;
                dmas dmasVar = ((dmbq) dmbpVar.b).b;
                if (dmasVar == null) {
                    dmasVar = dmas.f;
                }
                dsrj<dmbw> dsrjVar = dmasVar.b;
                int i = 0;
                while (true) {
                    if (i >= dsrjVar.size()) {
                        break;
                    }
                    dmbw dmbwVar = dsrjVar.get(i);
                    dmbc dmbcVar = dmbwVar.b;
                    if (dmbcVar == null) {
                        dmbcVar = dmbc.h;
                    }
                    if (str2.equals(dmbcVar.b)) {
                        dmas dmasVar2 = ((dmbq) dmbpVar.b).b;
                        if (dmasVar2 == null) {
                            dmasVar2 = dmas.f;
                        }
                        dsqp dsqpVar = (dsqp) dmasVar2.cu(5);
                        dsqpVar.bC(dmasVar2);
                        dmar dmarVar = (dmar) dsqpVar;
                        dsqp dsqpVar2 = (dsqp) dmbwVar.cu(5);
                        dsqpVar2.bC(dmbwVar);
                        dmbv dmbvVar = (dmbv) dsqpVar2;
                        dmbc d = cdpy.d((docg) dbrnVar2.a(cdpy.a(dmbcVar)), 2);
                        if (dmbvVar.c) {
                            dmbvVar.bF();
                            dmbvVar.c = false;
                        }
                        dmbw dmbwVar2 = (dmbw) dmbvVar.b;
                        d.getClass();
                        dmbwVar2.b = d;
                        dmbwVar2.a |= 1;
                        if (dmarVar.c) {
                            dmarVar.bF();
                            dmarVar.c = false;
                        }
                        dmas dmasVar3 = (dmas) dmarVar.b;
                        dmbw bK = dmbvVar.bK();
                        bK.getClass();
                        dmasVar3.b();
                        dmasVar3.b.set(i, bK);
                        if (dmbpVar.c) {
                            dmbpVar.bF();
                            dmbpVar.c = false;
                        }
                        dmbq dmbqVar = (dmbq) dmbpVar.b;
                        dmas bK2 = dmarVar.bK();
                        bK2.getClass();
                        dmbqVar.b = bK2;
                        dmbqVar.a |= 1;
                    } else {
                        i++;
                    }
                }
                return dmbpVar;
            }
        });
        docn b = b();
        List unmodifiableList = Collections.unmodifiableList(((doco) b.b).b);
        int i = 0;
        while (true) {
            if (i >= unmodifiableList.size()) {
                break;
            }
            docg docgVar = (docg) unmodifiableList.get(i);
            if (str.equals(docgVar.i)) {
                docg a2 = dbrnVar.a(docgVar);
                if (b.c) {
                    b.bF();
                    b.c = false;
                }
                doco docoVar = (doco) b.b;
                a2.getClass();
                docoVar.b();
                docoVar.b.set(i, a2);
            } else {
                i++;
            }
        }
        this.b.m = b.bK();
    }

    public final docn b() {
        ilw ilwVar = this.b;
        doco docoVar = ilwVar.m;
        if (docoVar != null) {
            dsqp dsqpVar = (dsqp) docoVar.cu(5);
            dsqpVar.bC(docoVar);
            return (docn) dsqpVar;
        }
        dvyw dvywVar = ilwVar.F;
        if (dvywVar != null) {
            doco docoVar2 = dvywVar.aU;
            if (docoVar2 == null) {
                docoVar2 = doco.k;
            }
            dsqp dsqpVar2 = (dsqp) docoVar2.cu(5);
            dsqpVar2.bC(docoVar2);
            return (docn) dsqpVar2;
        }
        return doco.k.bZ();
    }

    public final void c(dbrn<dmbp, dmbp> dbrnVar) {
        dmbp bZ;
        ilw ilwVar = this.b;
        dmbq dmbqVar = ilwVar.j;
        if (dmbqVar != null) {
            dsqp dsqpVar = (dsqp) dmbqVar.cu(5);
            dsqpVar.bC(dmbqVar);
            bZ = (dmbp) dsqpVar;
        } else {
            dvyw dvywVar = ilwVar.F;
            if (dvywVar != null) {
                dmbq dmbqVar2 = dvywVar.aV;
                if (dmbqVar2 == null) {
                    dmbqVar2 = dmbq.f;
                }
                dsqp dsqpVar2 = (dsqp) dmbqVar2.cu(5);
                dsqpVar2.bC(dmbqVar2);
                bZ = (dmbp) dsqpVar2;
            } else {
                bZ = dmbq.f.bZ();
            }
        }
        x(dbrnVar.a(bZ).bK());
    }

    /* JADX WARN: Removed duplicated region for block: B:278:0x062c  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0639  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0661  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x067c  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0698  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x06b5  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0722  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x073b  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0757  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0773  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0805  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ilo d() {
        /*
            Method dump skipped, instructions count: 2203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ily.d():ilo");
    }

    public final void e(String str) {
        List<dvxx> list = this.b.C;
        dvxw bZ = dvxx.d.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dvxx dvxxVar = (dvxx) bZ.b;
        str.getClass();
        dvxxVar.a |= 1;
        dvxxVar.b = str;
        list.add(bZ.bK());
    }

    public final void f(String str) {
        this.b.D.add(str);
    }

    public final void g(ikz ikzVar) {
        this.N.c = ikzVar;
    }

    public final void h(dvuy dvuyVar, boolean z) {
        int a2 = dndf.a(dvuyVar.l);
        if (a2 == 0 || a2 == 1) {
            ilw ilwVar = this.b;
            dvyw dvywVar = null;
            if (dvuyVar != null && dvuyVar.j.size() != 0 && (dvywVar = dvuyVar.j.get(0).b) == null) {
                dvywVar = dvyw.bv;
            }
            ilwVar.F = dvywVar;
            if (!z) {
                this.c = true;
            }
        }
        this.N.a = dvuyVar;
    }

    public final void i(alap alapVar) {
        ilw ilwVar = this.b;
        if (alapVar != null && alapVar.b == null) {
            ilwVar.s = dbtm.a('\n').i(alapVar.q).get(0);
            akqi akqiVar = alapVar.g;
            if (akqiVar != null) {
                ilwVar.n = akqiVar.o();
            }
            ilwVar.d(alapVar.n);
            altw altwVar = alapVar.f;
            if (altwVar != null) {
                for (altv altvVar : altwVar.a) {
                    ilwVar.c(altvVar);
                }
            }
        }
        ilv ilvVar = this.N;
        if (alapVar == null || alapVar.b != null) {
            ilvVar.b = alapVar;
        }
        dndr dndrVar = alapVar.d;
        Long l = alapVar.e;
        K(dndrVar);
        this.b.f = l;
        dndr dndrVar2 = alapVar.d;
        if (dndrVar2 != null && dndrVar2 == dndr.NICKNAME) {
            this.b.p = alapVar.q;
            String str = alapVar.o;
            if (str != null) {
                F(str);
            }
        }
        decq decqVar = alapVar.p;
        if (decqVar != null) {
            this.b.w = decqVar;
        }
        alxk alxkVar = alapVar.c;
        if (alxkVar != null && alxkVar.b == 2) {
            this.k = true;
            this.l = true;
        }
        dmmq dmmqVar = (dmmq) bvrt.f(alapVar.h, (dssr) dmmq.a.cu(7), null);
        if (dmmqVar != null) {
            this.K = dmmqVar;
        }
    }

    public final void j(akqi akqiVar) {
        this.b.n = akqiVar == null ? "" : akqiVar.o();
    }

    public final void k(String str) {
        this.b.n = dbsj.e(str);
    }

    public final void l(eapd eapdVar, eapg eapgVar) {
        this.b.x = new ilc(4, eapgVar, eapdVar);
    }

    public final void m(dnng dnngVar) {
        this.b.d = dnngVar;
    }

    public final void n(boolean z) {
        this.b.z = z;
    }

    public final void o(boolean z) {
        this.b.A = z;
    }

    public final void p(String str) {
        this.b.o = str;
    }

    public final void q(akqq akqqVar) {
        this.b.d(akqqVar);
    }

    public final void r(dhjz dhjzVar) {
        this.b.e = dhjzVar;
    }

    public final void s(dpxf dpxfVar) {
        this.b.g = dpxfVar;
    }

    public final void t() {
        ilw ilwVar = this.b;
        if (ilwVar.x == null) {
            ilwVar.x = new ilc(3, null, null);
        }
    }

    public final void u(final docg docgVar) {
        c(new dbrn(docgVar) { // from class: ils
            private final docg a;

            {
                this.a = docgVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                docg docgVar2 = this.a;
                dmbp dmbpVar = (dmbp) obj;
                dmat bZ = dmau.f.bZ();
                dmbv bZ2 = dmbw.d.bZ();
                dmbc d = cdpy.d(docgVar2, 3);
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dmbw dmbwVar = (dmbw) bZ2.b;
                d.getClass();
                dmbwVar.c = d;
                dmbwVar.a |= 2;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dmau dmauVar = (dmau) bZ.b;
                dmbw bK = bZ2.bK();
                bK.getClass();
                dmauVar.b = bK;
                dmauVar.a |= 1;
                dmbpVar.a(bZ.bK());
                return dmbpVar;
            }
        });
        docn b = b();
        if (b.c) {
            b.bF();
            b.c = false;
        }
        doco docoVar = (doco) b.b;
        doco docoVar2 = doco.k;
        docgVar.getClass();
        docoVar.d = docgVar;
        docoVar.a |= 2;
        this.b.m = b.bK();
    }

    public final void v(final docg docgVar) {
        c(new dbrn(docgVar) { // from class: ilr
            private final docg a;

            {
                this.a = docgVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                docg docgVar2 = this.a;
                dmbp dmbpVar = (dmbp) obj;
                dmat bZ = dmau.f.bZ();
                dmbv bZ2 = dmbw.d.bZ();
                dmbc d = cdpy.d(docgVar2, 2);
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dmbw dmbwVar = (dmbw) bZ2.b;
                d.getClass();
                dmbwVar.b = d;
                dmbwVar.a |= 1;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dmau dmauVar = (dmau) bZ.b;
                dmbw bK = bZ2.bK();
                bK.getClass();
                dmauVar.b = bK;
                dmauVar.a |= 1;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dmau dmauVar2 = (dmau) bZ.b;
                dmauVar2.a |= 4;
                dmauVar2.d = true;
                dmbpVar.a(bZ.bK());
                return dmbpVar;
            }
        });
        docn b = b();
        if (b.c) {
            b.bF();
            b.c = false;
        }
        doco docoVar = (doco) b.b;
        doco docoVar2 = doco.k;
        docgVar.getClass();
        docoVar.c = docgVar;
        docoVar.a |= 1;
        this.b.m = b.bK();
    }

    public final void w(drdg drdgVar) {
        String str = drdgVar.b;
        ilw ilwVar = this.b;
        dvxa bZ = dvxb.d.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dvxb dvxbVar = (dvxb) bZ.b;
        str.getClass();
        dvxbVar.a |= 2;
        dvxbVar.c = str;
        ilwVar.t = bZ.bK();
        k(drdgVar.d);
        p(drdgVar.e);
        dpum dpumVar = drdgVar.f;
        if (dpumVar == null) {
            dpumVar = dpum.d;
        }
        q(akqq.f(dpumVar));
        F(drdgVar.g);
        this.b.r = drdgVar.h;
        if (drdgVar.i.size() > 0) {
            A(drdgVar.i.get(0));
        }
        for (drdd drddVar : drdgVar.m) {
            f(drddVar.b);
            e(drddVar.c);
        }
        dpxf dpxfVar = drdgVar.n;
        if (dpxfVar == null) {
            dpxfVar = dpxf.f;
        }
        s(dpxfVar);
        dvyx bZ2 = dvyy.e.bZ();
        float f = drdgVar.j;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dvyy dvyyVar = (dvyy) bZ2.b;
        int i = dvyyVar.a | 1;
        dvyyVar.a = i;
        dvyyVar.b = f;
        int i2 = drdgVar.l;
        dvyyVar.a = i | 16;
        dvyyVar.d = i2;
        this.b.v = bZ2.bK();
        dgfy dgfyVar = drdgVar.p;
        if (dgfyVar == null) {
            dgfyVar = dgfy.f;
        }
        this.b.h = dgfyVar;
    }

    public final void x(dmbq dmbqVar) {
        this.b.j = dmbqVar;
    }

    public final void y(doav doavVar) {
        this.b.k = doavVar;
    }

    public final void z(doaz doazVar) {
        this.b.l = doazVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
        if (r3.aB != false) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E(defpackage.dvyw r3) {
        /*
            r2 = this;
            ilw r0 = r2.b
            r0.F = r3
            boolean r0 = r3.R
            r2.c = r0
            boolean r0 = r3.aE
            r1 = 1
            if (r0 == 0) goto L10
            r2.l = r1
            goto L16
        L10:
            boolean r0 = r3.aA
            boolean r0 = r3.aB
            if (r0 == 0) goto L18
        L16:
            r2.k = r1
        L18:
            dndn r0 = r3.ah
            if (r0 != 0) goto L1e
            dndn r0 = defpackage.dndn.c
        L1e:
            dndj r0 = r0.b
            if (r0 != 0) goto L24
            dndj r0 = defpackage.dndj.e
        L24:
            dndl r0 = r0.b
            if (r0 != 0) goto L2a
            dndl r0 = defpackage.dndl.d
        L2a:
            int r0 = r0.a
            r0 = r0 & r1
            if (r0 == 0) goto L4f
            dndn r0 = r3.ah
            if (r0 != 0) goto L35
            dndn r0 = defpackage.dndn.c
        L35:
            dndj r0 = r0.b
            if (r0 != 0) goto L3b
            dndj r0 = defpackage.dndj.e
        L3b:
            dndl r0 = r0.b
            if (r0 != 0) goto L41
            dndl r0 = defpackage.dndl.d
        L41:
            int r0 = r0.b
            dndr r0 = defpackage.dndr.b(r0)
            if (r0 != 0) goto L4b
            dndr r0 = defpackage.dndr.UNKNOWN_ALIAS_TYPE
        L4b:
            r2.K(r0)
            goto L53
        L4f:
            r0 = 0
            r2.K(r0)
        L53:
            int r3 = r3.b
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L5b
            r2.q = r1
        L5b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ily.E(dvyw):void");
    }
}
