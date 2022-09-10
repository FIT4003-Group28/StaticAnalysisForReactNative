package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: ceyc  reason: default package */
/* loaded from: classes4.dex */
public class ceyc implements ceth {
    private final Activity a;
    private final ceet b;
    private final bqji c;
    private final cese d;
    private final List<cetg> e = new ArrayList();
    private final dhsy f;
    @dzsi
    private final String g;
    private final cevz h;

    public ceyc(Activity activity, ceet ceetVar, bqji bqjiVar, ceyb ceybVar, cese ceseVar, cebr cebrVar, dhtc dhtcVar, dhsy dhsyVar, @dzsi String str, cevz cevzVar) {
        dhsx dhsxVar;
        this.a = activity;
        this.b = ceetVar;
        this.c = bqjiVar;
        this.d = ceseVar;
        this.f = dhsyVar;
        this.g = str;
        this.h = cevzVar;
        int i = 1;
        int i2 = 5;
        if (cebrVar.a() && dhsyVar.a == 9) {
            Iterator<djda> it = ((dhsv) dhsyVar.b).a.iterator();
            while (it.hasNext()) {
                djda next = it.next();
                dmbw dmbwVar = next.a;
                dmbwVar = dmbwVar == null ? dmbw.d : dmbwVar;
                if ((dmbwVar.a & i) != 0) {
                    dmbc dmbcVar = dmbwVar.b;
                    dmbg dmbgVar = (dmbcVar == null ? dmbc.h : dmbcVar).d;
                    dmbgVar = dmbgVar == null ? dmbg.i : dmbgVar;
                    int i3 = dmbgVar.a;
                    if ((i3 & 1) != 0 || (i3 & 2) != 0 || dmbgVar.d.size() > 0) {
                        List<cetg> list = this.e;
                        dmbc dmbcVar2 = dmbwVar.b;
                        dmbcVar2 = dmbcVar2 == null ? dmbc.h : dmbcVar2;
                        dqwa dqwaVar = dhtcVar.e;
                        dqwaVar = dqwaVar == null ? dqwa.g : dqwaVar;
                        dmbu dmbuVar = dmbcVar2.c;
                        dmbe dmbeVar = (dmbuVar == null ? dmbu.i : dmbuVar).e;
                        dhze dhzeVar = (dmbeVar == null ? dmbe.c : dmbeVar).b;
                        dhzeVar = dhzeVar == null ? dhze.m : dhzeVar;
                        dsqp dsqpVar = (dsqp) dmbcVar2.cu(i2);
                        dsqpVar.bC(dmbcVar2);
                        dmbb dmbbVar = (dmbb) dsqpVar;
                        dmbu dmbuVar2 = dmbcVar2.c;
                        dmbuVar2 = dmbuVar2 == null ? dmbu.i : dmbuVar2;
                        dsqp dsqpVar2 = (dsqp) dmbuVar2.cu(i2);
                        dsqpVar2.bC(dmbuVar2);
                        dmbr dmbrVar = (dmbr) dsqpVar2;
                        dmbu dmbuVar3 = dmbcVar2.c;
                        dmbe dmbeVar2 = (dmbuVar3 == null ? dmbu.i : dmbuVar3).e;
                        dmbeVar2 = dmbeVar2 == null ? dmbe.c : dmbeVar2;
                        dsqp dsqpVar3 = (dsqp) dmbeVar2.cu(i2);
                        dsqpVar3.bC(dmbeVar2);
                        dmbd dmbdVar = (dmbd) dsqpVar3;
                        dsqp dsqpVar4 = (dsqp) dhzeVar.cu(i2);
                        dsqpVar4.bC(dhzeVar);
                        dhyz dhyzVar = (dhyz) dsqpVar4;
                        dqkn dqknVar = dhtcVar.b;
                        String str2 = (dqknVar == null ? dqkn.e : dqknVar).b;
                        if (dhyzVar.c) {
                            dhyzVar.bF();
                            dhyzVar.c = false;
                        }
                        dhze dhzeVar2 = (dhze) dhyzVar.b;
                        str2.getClass();
                        Iterator<djda> it2 = it;
                        dhzeVar2.a |= 16;
                        dhzeVar2.f = str2;
                        dqkn dqknVar2 = dhtcVar.b;
                        String str3 = (dqknVar2 == null ? dqkn.e : dqknVar2).c;
                        if (dhyzVar.c) {
                            dhyzVar.bF();
                            dhyzVar.c = false;
                        }
                        dhze dhzeVar3 = (dhze) dhyzVar.b;
                        str3.getClass();
                        dhzeVar3.a |= 8;
                        dhzeVar3.e = str3;
                        dhzb dhzbVar = dhzeVar.b;
                        dhzbVar = dhzbVar == null ? dhzb.e : dhzbVar;
                        dsqp dsqpVar5 = (dsqp) dhzbVar.cu(5);
                        dsqpVar5.bC(dhzbVar);
                        dhza dhzaVar = (dhza) dsqpVar5;
                        dqvy dqvyVar = dqwaVar.c;
                        boolean z = (dqvyVar == null ? dqvy.h : dqvyVar).d >= 4;
                        if (dhzaVar.c) {
                            dhzaVar.bF();
                            dhzaVar.c = false;
                        }
                        dhzb dhzbVar2 = (dhzb) dhzaVar.b;
                        dhzbVar2.a |= 4;
                        dhzbVar2.d = z;
                        if (dhyzVar.c) {
                            dhyzVar.bF();
                            dhyzVar.c = false;
                        }
                        dhze dhzeVar4 = (dhze) dhyzVar.b;
                        dhzb bK = dhzaVar.bK();
                        bK.getClass();
                        dhzeVar4.b = bK;
                        dhzeVar4.a |= 1;
                        int d = cesf.d(dqwaVar, 2);
                        if (dhyzVar.c) {
                            dhyzVar.bF();
                            dhyzVar.c = false;
                        }
                        dhze dhzeVar5 = (dhze) dhyzVar.b;
                        dhzeVar5.a |= 2;
                        dhzeVar5.c = d;
                        int d2 = cesf.d(dqwaVar, 4);
                        if (dhyzVar.c) {
                            dhyzVar.bF();
                            dhyzVar.c = false;
                        }
                        dhze dhzeVar6 = (dhze) dhyzVar.b;
                        dhzeVar6.a |= 4;
                        dhzeVar6.d = d2;
                        if (dmbdVar.c) {
                            dmbdVar.bF();
                            dmbdVar.c = false;
                        }
                        dmbe dmbeVar3 = (dmbe) dmbdVar.b;
                        dhze bK2 = dhyzVar.bK();
                        bK2.getClass();
                        dmbeVar3.b = bK2;
                        dmbeVar3.a |= 1;
                        if (dmbrVar.c) {
                            dmbrVar.bF();
                            dmbrVar.c = false;
                        }
                        dmbu dmbuVar4 = (dmbu) dmbrVar.b;
                        dmbe bK3 = dmbdVar.bK();
                        bK3.getClass();
                        dmbuVar4.e = bK3;
                        dmbuVar4.a |= 16;
                        if (dmbbVar.c) {
                            dmbbVar.bF();
                            dmbbVar.c = false;
                        }
                        dmbc dmbcVar3 = (dmbc) dmbbVar.b;
                        dmbu bK4 = dmbrVar.bK();
                        bK4.getClass();
                        dmbcVar3.c = bK4;
                        dmbcVar3.a |= 2;
                        cdsa cdsaVar = new cdsa(dmbbVar.bK());
                        drkr drkrVar = next.b;
                        list.add(ceybVar.a(cdsaVar, drkrVar == null ? drkr.d : drkrVar, str == null, dbpy.a));
                        it = it2;
                        i = 1;
                        i2 = 5;
                    }
                }
            }
            return;
        }
        if (dhsyVar.a == 4) {
            dhsxVar = (dhsx) dhsyVar.b;
        } else {
            dhsxVar = dhsx.b;
        }
        for (drdy drdyVar : dhsxVar.a) {
            List<cetg> list2 = this.e;
            docg docgVar = drdyVar.a;
            docgVar = docgVar == null ? docg.M : docgVar;
            dqwa dqwaVar2 = dhtcVar.e;
            dqwaVar2 = dqwaVar2 == null ? dqwa.g : dqwaVar2;
            dsqp dsqpVar6 = (dsqp) docgVar.cu(5);
            dsqpVar6.bC(docgVar);
            docc doccVar = (docc) dsqpVar6;
            dnpq dnpqVar = docgVar.m;
            dnpqVar = dnpqVar == null ? dnpq.g : dnpqVar;
            dsqp dsqpVar7 = (dsqp) dnpqVar.cu(5);
            dsqpVar7.bC(dnpqVar);
            dnpp dnppVar = (dnpp) dsqpVar7;
            dqkn dqknVar3 = dhtcVar.b;
            String str4 = (dqknVar3 == null ? dqkn.e : dqknVar3).b;
            if (dnppVar.c) {
                dnppVar.bF();
                dnppVar.c = false;
            }
            dnpq dnpqVar2 = (dnpq) dnppVar.b;
            str4.getClass();
            dnpqVar2.a |= 8;
            dnpqVar2.d = str4;
            if (doccVar.c) {
                doccVar.bF();
                doccVar.c = false;
            }
            docg docgVar2 = (docg) doccVar.b;
            dnpq bK5 = dnppVar.bK();
            bK5.getClass();
            docgVar2.m = bK5;
            docgVar2.a |= 16;
            dnfg dnfgVar = docgVar.n;
            dnfgVar = dnfgVar == null ? dnfg.c : dnfgVar;
            dsqp dsqpVar8 = (dsqp) dnfgVar.cu(5);
            dsqpVar8.bC(dnfgVar);
            dnff dnffVar = (dnff) dsqpVar8;
            dnfg dnfgVar2 = docgVar.n;
            dnna dnnaVar = (dnfgVar2 == null ? dnfg.c : dnfgVar2).b;
            dnnaVar = dnnaVar == null ? dnna.m : dnnaVar;
            dsqp dsqpVar9 = (dsqp) dnnaVar.cu(5);
            dsqpVar9.bC(dnnaVar);
            dnmv dnmvVar = (dnmv) dsqpVar9;
            dqkn dqknVar4 = dhtcVar.b;
            String str5 = (dqknVar4 == null ? dqkn.e : dqknVar4).b;
            if (dnmvVar.c) {
                dnmvVar.bF();
                dnmvVar.c = false;
            }
            dnna dnnaVar2 = (dnna) dnmvVar.b;
            str5.getClass();
            dnnaVar2.a |= 1;
            dnnaVar2.b = str5;
            dqkn dqknVar5 = dhtcVar.b;
            String str6 = (dqknVar5 == null ? dqkn.e : dqknVar5).c;
            if (dnmvVar.c) {
                dnmvVar.bF();
                dnmvVar.c = false;
            }
            dnna dnnaVar3 = (dnna) dnmvVar.b;
            str6.getClass();
            dnnaVar3.a |= 8;
            dnnaVar3.e = str6;
            dnfg dnfgVar3 = docgVar.n;
            dnna dnnaVar4 = (dnfgVar3 == null ? dnfg.c : dnfgVar3).b;
            dnmx dnmxVar = (dnnaVar4 == null ? dnna.m : dnnaVar4).h;
            dnmxVar = dnmxVar == null ? dnmx.e : dnmxVar;
            dsqp dsqpVar10 = (dsqp) dnmxVar.cu(5);
            dsqpVar10.bC(dnmxVar);
            dnmw dnmwVar = (dnmw) dsqpVar10;
            dqvy dqvyVar2 = dqwaVar2.c;
            boolean z2 = (dqvyVar2 == null ? dqvy.h : dqvyVar2).d >= 4;
            if (dnmwVar.c) {
                dnmwVar.bF();
                dnmwVar.c = false;
            }
            dnmx dnmxVar2 = (dnmx) dnmwVar.b;
            dnmxVar2.a |= 4;
            dnmxVar2.d = z2;
            if (dnmvVar.c) {
                dnmvVar.bF();
                dnmvVar.c = false;
            }
            dnna dnnaVar5 = (dnna) dnmvVar.b;
            dnmx bK6 = dnmwVar.bK();
            bK6.getClass();
            dnnaVar5.h = bK6;
            dnnaVar5.a |= 64;
            int d3 = cesf.d(dqwaVar2, 2);
            if (dnmvVar.c) {
                dnmvVar.bF();
                dnmvVar.c = false;
            }
            dnna dnnaVar6 = (dnna) dnmvVar.b;
            dnnaVar6.a |= 128;
            dnnaVar6.i = d3;
            int d4 = cesf.d(dqwaVar2, 4);
            if (dnmvVar.c) {
                dnmvVar.bF();
                dnmvVar.c = false;
            }
            dnna dnnaVar7 = (dnna) dnmvVar.b;
            dnnaVar7.a |= 512;
            dnnaVar7.j = d4;
            if (dnffVar.c) {
                dnffVar.bF();
                dnffVar.c = false;
            }
            dnfg dnfgVar4 = (dnfg) dnffVar.b;
            dnna bK7 = dnmvVar.bK();
            bK7.getClass();
            dnfgVar4.b = bK7;
            dnfgVar4.a |= 2;
            if (doccVar.c) {
                doccVar.bF();
                doccVar.c = false;
            }
            docg docgVar3 = (docg) doccVar.b;
            dnfg bK8 = dnffVar.bK();
            bK8.getClass();
            docgVar3.n = bK8;
            docgVar3.a |= 32;
            cdrr r = cdrr.r(doccVar.bK(), cdja.PUBLISHED);
            drkr drkrVar2 = drdyVar.b;
            list2.add(ceybVar.a(r, drkrVar2 == null ? drkr.d : drkrVar2, str == null, dbpy.a));
        }
    }

    @Override // defpackage.cesg
    public String a() {
        return this.f.f;
    }

    @Override // defpackage.cesg
    public cqtd b() {
        return iup.e(R.raw.ic_rate_review_white);
    }

    @Override // defpackage.cesg
    public String c() {
        return this.a.getString(R.string.WRITE_A_REVIEW);
    }

    @Override // defpackage.cesg
    public cqkl d() {
        this.c.a();
        return cqkl.a;
    }

    @Override // defpackage.cesg
    public cjtd e() {
        return cjtd.a(dtxl.fK);
    }

    @Override // defpackage.cesg
    public Boolean f() {
        boolean z = false;
        if (this.d.b() && this.g == null) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cesi
    public String g() {
        return this.f.d;
    }

    @Override // defpackage.cesi
    public cqkl h() {
        ceet ceetVar = this.b;
        String str = this.g;
        drds b = drds.b(this.f.c);
        if (b == null) {
            b = drds.UNKNOWN_CREATOR_CONTRIBUTION_TYPE;
        }
        boolean z = this.g != null;
        ceer g = cees.g();
        ((ceep) g).b = this.h;
        ceetVar.l(str, b, z, g.a());
        return cqkl.a;
    }

    @Override // defpackage.cesi
    public cjtd i() {
        return cjtd.a(dtxl.fC);
    }

    @Override // defpackage.ceth
    public List<cetg> j() {
        return this.e;
    }

    public void k() {
        for (cetg cetgVar : this.e) {
            ((cext) cetgVar.a()).o();
        }
    }

    public void l() {
        for (cetg cetgVar : this.e) {
            ((cext) cetgVar.a()).p();
        }
    }

    public void m() {
        for (cetg cetgVar : this.e) {
            ((cext) cetgVar.a()).PV(null);
        }
    }

    public void n(bkpe bkpeVar) {
        Iterator<cetg> it = this.e.iterator();
        while (it.hasNext()) {
            ((ceya) it.next()).m(bkpeVar);
        }
    }
}
