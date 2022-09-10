package defpackage;

import com.google.android.filament.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: aldv  reason: default package */
/* loaded from: classes2.dex */
public final class aldv {
    public final akty a;
    public final akvz b;
    public final List<aktg> c = new ArrayList();
    public final List<aktd> d = new ArrayList();
    public final List<aktd> e = new ArrayList();
    private final dcdc<dwnl> f;
    private final dcdc<alcn> g;

    public aldv(dcdc<dwnl> dcdcVar, dcdc<alcn> dcdcVar2, akty aktyVar, akvz akvzVar) {
        this.f = dcdcVar;
        this.g = dcdcVar2;
        this.a = aktyVar;
        this.b = akvzVar;
    }

    public final synchronized void a() {
        dcdc<dwnl> dcdcVar = this.f;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            dwnl dwnlVar = dcdcVar.get(i);
            dwzq dwzqVar = dwnlVar.e;
            if (dwzqVar == null) {
                dwzqVar = dwzq.d;
            }
            akra c = akra.c(dwzqVar.b, dwzqVar.c);
            dbyy dbyyVar = amwc.c.b;
            Object b = dwnk.b(dwnlVar.c);
            if (b == null) {
                b = dwnk.INCIDENT_OTHER;
            }
            dbsk.s((doyd) dbyyVar.get(b));
            String str = dwnlVar.k;
            dmpq bZ = dmpv.s.bZ();
            dmog dmogVar = (dmog) dmoh.h.bZ();
            if (dmogVar.c) {
                dmogVar.bF();
                dmogVar.c = false;
            }
            dmoh dmohVar = (dmoh) dmogVar.b;
            str.getClass();
            int i2 = dmohVar.a | 1;
            dmohVar.a = i2;
            dmohVar.b = str;
            dmohVar.a = i2 | 4;
            dmohVar.c = 4;
            bZ.a(dmogVar);
            dmpv bK = bZ.bK();
            akvz akvzVar = this.b;
            dmqt dmqtVar = (dmqt) dmqx.e.bZ();
            dmoo dmooVar = (dmoo) dmop.h.bZ();
            if (dmooVar.c) {
                dmooVar.bF();
                dmooVar.c = false;
            }
            dmop dmopVar = (dmop) dmooVar.b;
            bK.getClass();
            dmopVar.d = bK;
            dmopVar.a |= 4;
            dmqtVar.a(dmooVar);
            aktg c2 = akvzVar.c((dmqx) dmqtVar.bK());
            this.c.add(c2);
            dmpk dmpkVar = (dmpk) dmpn.r.bZ();
            dmlp bZ2 = dmlq.e.bZ();
            dmls a = akxh.a(c);
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dmlq dmlqVar = (dmlq) bZ2.b;
            a.getClass();
            dmlqVar.b = a;
            dmlqVar.a |= 1;
            if (dmpkVar.c) {
                dmpkVar.bF();
                dmpkVar.c = false;
            }
            dmpn dmpnVar = (dmpn) dmpkVar.b;
            dmlq bK2 = bZ2.bK();
            bK2.getClass();
            dmpnVar.d = bK2;
            dmpnVar.a = 4 | dmpnVar.a;
            dmpe dmpeVar = (dmpe) dmph.f.bZ();
            dmpeVar.b(c2.e());
            if (dmpkVar.c) {
                dmpkVar.bF();
                dmpkVar.c = false;
            }
            dmpn dmpnVar2 = (dmpn) dmpkVar.b;
            dmph dmphVar = (dmph) dmpeVar.bK();
            dmphVar.getClass();
            dmpnVar2.b = dmphVar;
            dmpnVar2.a |= 1;
            if (dmpkVar.c) {
                dmpkVar.bF();
                dmpkVar.c = false;
            }
            dmpn dmpnVar3 = (dmpn) dmpkVar.b;
            dmpnVar3.a |= 32;
            dmpnVar3.g = 1;
            dsqv<dmpn, dmol> dsqvVar = dmnl.L;
            dmoi bZ3 = dmol.n.bZ();
            String str2 = dwnlVar.m;
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dmol dmolVar = (dmol) bZ3.b;
            str2.getClass();
            dmolVar.a |= 128;
            dmolVar.i = str2;
            dmpkVar.k(dsqvVar, bZ3.bK());
            dsqv<dmpn, dmlm> dsqvVar2 = dmnl.G;
            dmll bZ4 = dmlm.g.bZ();
            int i3 = ((dtxi) dtyc.fp).a;
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            dmlm dmlmVar = (dmlm) bZ4.b;
            dmlmVar.a |= 8;
            dmlmVar.e = i3;
            dmpkVar.k(dsqvVar2, bZ4.bK());
            dsqv<dmpn, akus> dsqvVar3 = akvj.a;
            akuq bZ5 = akus.o.bZ();
            if (bZ5.c) {
                bZ5.bF();
                bZ5.c = false;
            }
            akus akusVar = (akus) bZ5.b;
            dwnlVar.getClass();
            akusVar.c = dwnlVar;
            akusVar.b = 3;
            dmpkVar.k(dsqvVar3, bZ5.bK());
            aktd b2 = this.a.b((dmpn) dmpkVar.bK(), dmti.WORLD_ENCODING_LAT_LNG_E7);
            b2.Pu();
            this.d.add(b2);
        }
        dcdc<alcn> dcdcVar2 = this.g;
        int size2 = dcdcVar2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            alcn alcnVar = dcdcVar2.get(i4);
            if (alcnVar.b()) {
                akuh b3 = this.b.b(alcnVar.a().d() != 0 ? alcnVar.a().d() : 168L);
                akuh b4 = this.b.b(alcnVar.a().e() != 0 ? alcnVar.a().e() : 166L);
                dmpk g = this.b.a(dmqc.LEGEND_STYLE_MICRO_LANDMARK_LABEL_LAYOUT).g();
                dmlp bZ6 = dmlq.e.bZ();
                dmls a2 = akxh.a(alcnVar.a().c());
                if (bZ6.c) {
                    bZ6.bF();
                    bZ6.c = false;
                }
                dmlq dmlqVar2 = (dmlq) bZ6.b;
                a2.getClass();
                dmlqVar2.b = a2;
                dmlqVar2.a |= 1;
                if (g.c) {
                    g.bF();
                    g.c = false;
                }
                dmpn dmpnVar4 = (dmpn) g.b;
                dmlq bK3 = bZ6.bK();
                dmpn dmpnVar5 = dmpn.r;
                bK3.getClass();
                dmpnVar4.d = bK3;
                dmpnVar4.a |= 4;
                dmpe dmpeVar2 = (dmpe) dmph.f.bZ();
                dmpeVar2.b(b3.e());
                if (g.c) {
                    g.bF();
                    g.c = false;
                }
                dmpn dmpnVar6 = (dmpn) g.b;
                dmph dmphVar2 = (dmph) dmpeVar2.bK();
                dmphVar2.getClass();
                dmpnVar6.b = dmphVar2;
                dmpnVar6.a |= 1;
                dmpe a3 = akxg.a(dfyn.a(alcnVar.a().a(), 20, 2, 20), b4);
                if (g.c) {
                    g.bF();
                    g.c = false;
                }
                dmpn dmpnVar7 = (dmpn) g.b;
                dmph dmphVar3 = (dmph) a3.bK();
                dmphVar3.getClass();
                dmpnVar7.c = dmphVar3;
                dmpnVar7.a |= 2;
                dsqv<dmpn, dmol> dsqvVar4 = dmnl.L;
                dmoi bZ7 = dmol.n.bZ();
                String a4 = alcnVar.a().a();
                if (bZ7.c) {
                    bZ7.bF();
                    bZ7.c = false;
                }
                dmol dmolVar2 = (dmol) bZ7.b;
                a4.getClass();
                dmolVar2.a |= 128;
                dmolVar2.i = a4;
                long j = alcnVar.a().b().b;
                if (bZ7.c) {
                    bZ7.bF();
                    bZ7.c = false;
                }
                dmol dmolVar3 = (dmol) bZ7.b;
                dmolVar3.a |= 8;
                dmolVar3.e = j;
                long j2 = alcnVar.a().b().c;
                if (bZ7.c) {
                    bZ7.bF();
                    bZ7.c = false;
                }
                dmol dmolVar4 = (dmol) bZ7.b;
                dmolVar4.a |= 16;
                dmolVar4.f = j2;
                g.k(dsqvVar4, bZ7.bK());
                akxf.P(g);
                akxf.M(g);
                if (alcnVar.c() == dgau.TURN) {
                    if (g.c) {
                        g.bF();
                        g.c = false;
                    }
                    dmpn dmpnVar8 = (dmpn) g.b;
                    dmpnVar8.a |= 128;
                    dmpnVar8.i = 88;
                } else {
                    if (g.c) {
                        g.bF();
                        g.c = false;
                    }
                    dmpn dmpnVar9 = (dmpn) g.b;
                    dmpnVar9.a |= 128;
                    dmpnVar9.i = R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
                }
                if (alcnVar.b()) {
                    if (g.c) {
                        g.bF();
                        g.c = false;
                    }
                    dmpn dmpnVar10 = (dmpn) g.b;
                    dmpnVar10.a |= 32;
                    dmpnVar10.g = 17;
                }
                aktd b5 = this.a.b((dmpn) g.bK(), dmti.WORLD_ENCODING_LAT_LNG_E7);
                b5.Pu();
                this.d.add(b5);
            }
        }
    }

    public final void b() {
        dcdc r;
        synchronized (this) {
            r = dcdc.r(this.e);
            this.e.clear();
        }
        int size = r.size();
        for (int i = 0; i < size; i++) {
            this.a.g((aktd) r.get(i));
        }
        synchronized (this) {
            this.d.addAll(r);
        }
    }
}
