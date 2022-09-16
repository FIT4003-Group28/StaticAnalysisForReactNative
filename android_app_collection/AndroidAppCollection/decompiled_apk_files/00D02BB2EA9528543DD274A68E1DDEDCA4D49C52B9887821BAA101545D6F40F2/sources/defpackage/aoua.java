package defpackage;

import java.util.HashMap;
import java.util.List;
/* compiled from: PG */
/* renamed from: aoua  reason: default package */
/* loaded from: classes2.dex */
public final class aoua extends amlq {
    private final dcdc<aogj> a;
    private dcdc<akti> b = dcdc.e();
    private dcdn<String, aktg> c = dcmn.a;
    private final akty d;
    private final akvz e;

    public aoua(akty aktyVar, akvz akvzVar, List<aogj> list) {
        this.a = dcdc.r(list);
        this.d = aktyVar;
        this.e = akvzVar;
    }

    private final void a() {
        dcdc<akti> dcdcVar = this.b;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            akti aktiVar = dcdcVar.get(i);
            this.d.g(aktiVar);
            this.d.e(aktiVar);
        }
        this.b = dcdc.e();
        dcpd<aktg> it = this.c.values().iterator();
        while (it.hasNext()) {
            this.e.j(it.next());
        }
        this.c = dcmn.a;
    }

    @Override // defpackage.amlq, defpackage.amjm
    public final void g(amjl amjlVar) {
    }

    @Override // defpackage.amlq, defpackage.amjm
    public final void h(amii amiiVar) {
        dmlm bK;
        a();
        dccx F = dcdc.F();
        HashMap d = dcjz.d();
        dcdc<aogj> dcdcVar = this.a;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            aogj aogjVar = dcdcVar.get(i);
            if (!aogjVar.d().isEmpty()) {
                akvz akvzVar = this.e;
                akqq c = aogjVar.c();
                dmpk g = akvzVar.a(dmqc.LEGEND_STYLE_POI_CUSTOM).g();
                dmlp bZ = dmlq.e.bZ();
                dmlo dmloVar = dmlo.CENTER;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dmlq dmlqVar = (dmlq) bZ.b;
                dmlqVar.c = dmloVar.j;
                dmlqVar.a |= 2;
                dmls a = akxh.a(akra.f(c));
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
                dmlq bK2 = bZ.bK();
                dmpn dmpnVar2 = dmpn.r;
                bK2.getClass();
                dmpnVar.d = bK2;
                dmpnVar.a |= 4;
                dmpm dmpmVar = dmpm.CENTER_LEFT_TO_CENTER_RIGHT;
                if (g.c) {
                    g.bF();
                    g.c = false;
                }
                dmpn dmpnVar3 = (dmpn) g.b;
                dmpnVar3.f = dmpmVar.q;
                int i2 = dmpnVar3.a | 16;
                dmpnVar3.a = i2;
                int i3 = i2 | 64;
                dmpnVar3.a = i3;
                dmpnVar3.h = 100;
                dmpnVar3.a = i3 | 32;
                dmpnVar3.g = 19;
                String d2 = aogjVar.d();
                aktg aktgVar = (aktg) d.get(d2);
                if (aktgVar == null) {
                    dmpq bZ2 = dmpv.s.bZ();
                    dmog dmogVar = (dmog) dmoh.h.bZ();
                    if (dmogVar.c) {
                        dmogVar.bF();
                        dmogVar.c = false;
                    }
                    dmoh dmohVar = (dmoh) dmogVar.b;
                    d2.getClass();
                    int i4 = dmohVar.a | 1;
                    dmohVar.a = i4;
                    dmohVar.b = d2;
                    dmohVar.a = i4 | 4;
                    dmohVar.c = 7;
                    bZ2.a(dmogVar);
                    dmpv bK3 = bZ2.bK();
                    dmqt dmqtVar = (dmqt) dmqx.e.bZ();
                    dmoo dmooVar = (dmoo) dmop.h.bZ();
                    if (dmooVar.c) {
                        dmooVar.bF();
                        dmooVar.c = false;
                    }
                    dmop dmopVar = (dmop) dmooVar.b;
                    int i5 = dmopVar.a | 1;
                    dmopVar.a = i5;
                    dmopVar.b = 0;
                    bK3.getClass();
                    dmopVar.d = bK3;
                    dmopVar.a = i5 | 4;
                    dmqtVar.a(dmooVar);
                    aktgVar = akvzVar.c((dmqx) dmqtVar.bK());
                    d.put(d2, aktgVar);
                }
                dmpe dmpeVar = (dmpe) dmph.f.bZ();
                dmpeVar.b(aktgVar.e());
                if (g.c) {
                    g.bF();
                    g.c = false;
                }
                dmpn dmpnVar4 = (dmpn) g.b;
                dmph dmphVar = (dmph) dmpeVar.bK();
                dmphVar.getClass();
                dmpnVar4.b = dmphVar;
                dmpnVar4.a |= 1;
                if (!aogjVar.b().isEmpty()) {
                    dmpe a2 = akxg.a(dfyn.a(aogjVar.b(), 20, 2, 50), akvzVar.a(dmqc.LEGEND_STYLE_POI_CUSTOM_TEXT_TITLE));
                    if (a2.c) {
                        a2.bF();
                        a2.c = false;
                    }
                    dmph dmphVar2 = (dmph) a2.b;
                    dmphVar2.e = 2;
                    dmphVar2.a |= 4;
                    dmph dmphVar3 = (dmph) a2.bK();
                    if (g.c) {
                        g.bF();
                        g.c = false;
                    }
                    dmpn dmpnVar5 = (dmpn) g.b;
                    dmphVar3.getClass();
                    dmpnVar5.c = dmphVar3;
                    dmpnVar5.a |= 2;
                }
                cjtd f = aogjVar.f();
                String str = f.d;
                if (str == null && f.g == null) {
                    bK = null;
                } else {
                    ddho ddhoVar = f.g;
                    dmll bZ3 = dmlm.g.bZ();
                    if (str != null) {
                        if (bZ3.c) {
                            bZ3.bF();
                            bZ3.c = false;
                        }
                        dmlm dmlmVar = (dmlm) bZ3.b;
                        str.getClass();
                        dmlmVar.a |= 2;
                        dmlmVar.c = str;
                    }
                    if (ddhoVar != null) {
                        int b = ddhoVar.b();
                        if (bZ3.c) {
                            bZ3.bF();
                            bZ3.c = false;
                        }
                        dmlm dmlmVar2 = (dmlm) bZ3.b;
                        dmlmVar2.a |= 8;
                        dmlmVar2.e = b;
                    }
                    bK = bZ3.bK();
                }
                if (bK != null) {
                    akxf.y(g, bK);
                }
                akxf.H(g, akqi.b(aogjVar.e()));
                akti c2 = this.d.c((dmpn) g.bK(), dmti.WORLD_ENCODING_LAT_LNG_E7);
                c2.Pu();
                c2.h();
                F.g(c2);
            }
        }
        this.c = dcdn.r(d);
        this.b = F.f();
    }

    @Override // defpackage.amlq, defpackage.amjm
    public final void i(amii amiiVar) {
        a();
    }
}
