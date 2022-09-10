package defpackage;

import android.app.Activity;
import java.util.List;
/* compiled from: PG */
/* renamed from: anbn  reason: default package */
/* loaded from: classes2.dex */
public final class anbn {
    public final Activity a;
    public final dxio<aksn> b;
    public final dxio<akvz> c;
    public final dxio<akty> d;
    public final dbty<Integer> e;
    public aktd f;
    public boolean g;
    public aljq h;
    private final dxio<akzh> i;
    private final dfoe j;
    private final dbty<dkjo> k;
    private final dbty<Boolean> l;

    public anbn(gga ggaVar, final btvo btvoVar, dxio<aksn> dxioVar, dxio<akvz> dxioVar2, dxio<akty> dxioVar3, dxio<akzh> dxioVar4, dfoe dfoeVar) {
        this.a = ggaVar;
        this.b = dxioVar;
        this.c = dxioVar2;
        this.d = dxioVar3;
        this.i = dxioVar4;
        this.j = dfoeVar;
        this.k = dbud.a(new dbty(btvoVar) { // from class: anbk
            private final btvo a;

            {
                this.a = btvoVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                dkjo dkjoVar = this.a.getExploreMapParametersWithoutLogging().r;
                return dkjoVar == null ? dkjo.h : dkjoVar;
            }
        });
        this.l = dbud.a(new dbty(btvoVar) { // from class: anbl
            private final btvo a;

            {
                this.a = btvoVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                int a = dkjx.a(this.a.getExploreMapParametersWithoutLogging().o);
                return Boolean.valueOf(a != 0 && a == 4);
            }
        });
        this.e = dbud.a(new dbty(btvoVar) { // from class: anbm
            private final btvo a;

            {
                this.a = btvoVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return Integer.valueOf(this.a.getExploreMapParametersWithoutLogging().p);
            }
        });
    }

    private final akuh e(int i) {
        return this.c.a().a(dmqc.b(i));
    }

    public final aktd a(dmpn dmpnVar) {
        akti c = this.d.a().c(dmpnVar, dmti.WORLD_ENCODING_LAT_LNG_E7);
        c.Pu();
        this.d.a().f(c);
        return c;
    }

    public final void b() {
        if (this.h != null) {
            aljq aljqVar = this.h;
            dbsk.s(aljqVar);
            this.b.a().b(aljqVar);
            this.h = null;
        }
        if (this.f != null) {
            aktd aktdVar = this.f;
            dbsk.s(aktdVar);
            this.d.a().e(aktdVar);
            this.f = null;
        }
        this.g = false;
    }

    public final akqi c() {
        dfoi dfoiVar = this.j.b;
        if (dfoiVar == null) {
            dfoiVar = dfoi.h;
        }
        dghy dghyVar = dfoiVar.b;
        if (dghyVar == null) {
            dghyVar = dghy.e;
        }
        return akqi.b(dghyVar.b);
    }

    public final dbsg<dmpn> d() {
        int i;
        int i2;
        dfoi dfoiVar = this.j.b;
        if (dfoiVar == null) {
            dfoiVar = dfoi.h;
        }
        dfoh dfohVar = dfoiVar.f;
        if (dfohVar == null) {
            dfohVar = dfoh.f;
        }
        if ((dfoiVar.a & 16) == 0 || (i = dfohVar.e) == 0 || dfohVar.c == 0 || dfohVar.b == 0) {
            return dbpy.a;
        }
        akuh e = e(i);
        dbsk.s(e);
        dmpk g = e.g();
        dmlp bZ = dmlq.e.bZ();
        dmlo dmloVar = dmlo.CENTER;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmlq dmlqVar = (dmlq) bZ.b;
        dmlqVar.c = dmloVar.j;
        dmlqVar.a |= 2;
        dgbk dgbkVar = dfoiVar.c;
        if (dgbkVar == null) {
            dgbkVar = dgbk.d;
        }
        dmls a = akxh.a(akra.f(akqq.p(dgbkVar)));
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmlq dmlqVar2 = (dmlq) bZ.b;
        a.getClass();
        dmlqVar2.b = a;
        dmlqVar2.a |= 1;
        if (g.c) {
            g.bF();
            g.c = false;
        }
        dmpn dmpnVar = (dmpn) g.b;
        dmlq bK = bZ.bK();
        dmpn dmpnVar2 = dmpn.r;
        bK.getClass();
        dmpnVar.d = bK;
        dmpnVar.a |= 4;
        int i3 = this.k.a().e * 8;
        if (g.c) {
            g.bF();
            g.c = false;
        }
        dmpn dmpnVar3 = (dmpn) g.b;
        dmpnVar3.a |= 128;
        dmpnVar3.i = i3;
        dmpm dmpmVar = dmpm.CENTER_LEFT_TO_CENTER_RIGHT;
        if (g.c) {
            g.bF();
            g.c = false;
        }
        dmpn dmpnVar4 = (dmpn) g.b;
        dmpnVar4.f = dmpmVar.q;
        dmpnVar4.a |= 16;
        int size = this.k.a().g.size();
        while (true) {
            size--;
            if (size >= 0) {
                dkjn dkjnVar = this.k.a().g.get(size);
                if (dkjnVar.a <= this.i.a().k()) {
                    i2 = dkjnVar.b;
                    break;
                }
            } else {
                i2 = this.k.a().d;
                break;
            }
        }
        if (g.c) {
            g.bF();
            g.c = false;
        }
        dmpn dmpnVar5 = (dmpn) g.b;
        dmpnVar5.a |= 64;
        dmpnVar5.h = i2;
        String str = dfoiVar.d;
        dmoi bZ2 = dmol.n.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dmol dmolVar = (dmol) bZ2.b;
        str.getClass();
        dmolVar.a |= 128;
        dmolVar.i = str;
        akqi c = c();
        if (akqi.e(c.c)) {
            long j = c.c;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dmol dmolVar2 = (dmol) bZ2.b;
            int i4 = dmolVar2.a | 16;
            dmolVar2.a = i4;
            dmolVar2.f = j;
            long j2 = c.b;
            dmolVar2.a = i4 | 8;
            dmolVar2.e = j2;
        }
        g.k(dmnl.L, bZ2.bK());
        boolean z = this.k.a().a;
        if (this.k.a().b) {
            z = (z ? 1 : 0) | true;
        }
        if (this.k.a().c) {
            boolean z2 = z ? 1 : 0;
            char c2 = z ? 1 : 0;
            char c3 = z ? 1 : 0;
            z = z2 | true;
        }
        if (g.c) {
            g.bF();
            g.c = false;
        }
        dmpn dmpnVar6 = (dmpn) g.b;
        dmpnVar6.a |= 32;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = z ? 1 : 0;
        dmpnVar6.g = i5;
        akxf.L(g);
        akxf.P(g);
        akxf.M(g);
        akuh e2 = e(dfohVar.b);
        if (e2 != null) {
            dmpe dmpeVar = (dmpe) dmph.f.bZ();
            dmpeVar.c((dmpd) e2.e().bK());
            if (g.c) {
                g.bF();
                g.c = false;
            }
            dmpn dmpnVar7 = (dmpn) g.b;
            dmph dmphVar = (dmph) dmpeVar.bK();
            dmphVar.getClass();
            dmpnVar7.b = dmphVar;
            dmpnVar7.a |= 1;
        }
        akuh e3 = e(dfohVar.c);
        List<String> a2 = dfyn.a(str, 20, 2, 50);
        dbsk.s(e3);
        dmpe a3 = akxg.a(a2, e3);
        if (a3.c) {
            a3.bF();
            a3.c = false;
        }
        dmph dmphVar2 = (dmph) a3.b;
        dmph dmphVar3 = dmph.f;
        dmphVar2.e = 2;
        dmphVar2.a |= 4;
        dmph dmphVar4 = (dmph) a3.bK();
        if (g.c) {
            g.bF();
            g.c = false;
        }
        dmpn dmpnVar8 = (dmpn) g.b;
        dmphVar4.getClass();
        dmpnVar8.c = dmphVar4;
        dmpnVar8.a |= 2;
        dnbb bZ3 = dnbc.c.bZ();
        dnox bZ4 = dnpo.t.bZ();
        bZ4.c(dnph.RECENTLY_VIEWED_PLACE);
        boolean booleanValue = this.l.a().booleanValue();
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dnpo dnpoVar = (dnpo) bZ4.b;
        dnpoVar.a |= 16;
        dnpoVar.j = booleanValue;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dnbc dnbcVar = (dnbc) bZ3.b;
        dnpo bK2 = bZ4.bK();
        bK2.getClass();
        dnbcVar.b = bK2;
        dnbcVar.a |= 1;
        akxf.N(g, bZ3.bK());
        if (this.k.a().f != 0) {
            dmll bZ5 = dmlm.g.bZ();
            int i8 = this.k.a().f;
            if (bZ5.c) {
                bZ5.bF();
                bZ5.c = false;
            }
            dmlm dmlmVar = (dmlm) bZ5.b;
            dmlmVar.a |= 8;
            dmlmVar.e = i8;
            akxf.y(g, bZ5.bK());
        }
        return dbsg.i((dmpn) g.bK());
    }
}
