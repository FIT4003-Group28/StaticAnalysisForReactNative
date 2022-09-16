package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: chlu  reason: default package */
/* loaded from: classes4.dex */
public class chlu extends chjc implements chmj {
    private final btvo a;
    private final djdl c;
    private final List<chml> d;
    private final jic e;
    @dzsi
    private final jic f;
    @dzsi
    private final chjw g;

    public chlu(cchz cchzVar, btvo btvoVar, chjx chjxVar, chkd chkdVar, chiu chiuVar, chmu chmuVar) {
        super(chmuVar);
        chhy chhyVar;
        djdl djdlVar;
        chhy chhyVar2;
        this.a = btvoVar;
        chle chleVar = (chle) chmuVar;
        chik chikVar = chleVar.a;
        if (chikVar.a == 1) {
            chhyVar = (chhy) chikVar.b;
        } else {
            chhyVar = chhy.e;
        }
        djdm djdmVar = chhyVar.b;
        djdmVar = djdmVar == null ? djdm.c : djdmVar;
        if (djdmVar.a == 3) {
            djdlVar = (djdl) djdmVar.b;
        } else {
            djdlVar = djdl.g;
        }
        this.c = djdlVar;
        chik chikVar2 = chleVar.a;
        if (chikVar2.a == 1) {
            chhyVar2 = (chhy) chikVar2.b;
        } else {
            chhyVar2 = chhy.e;
        }
        chhx chhxVar = chhyVar2.c;
        jic jicVar = null;
        this.g = (djdlVar.a & 2) != 0 ? chjxVar.a(djdlVar.c, (chhxVar == null ? chhx.c : chhxVar).b) : null;
        this.d = new ArrayList();
        for (dqeg dqegVar : djdlVar.e) {
            this.d.add(chkdVar.a(dqegVar));
        }
        ccih l = cchzVar.d().l();
        dbsk.s(l);
        this.e = chiuVar.a(l.b());
        dkgh dkghVar = this.c.b;
        dkgn dkgnVar = (dkghVar == null ? dkgh.d : dkghVar).c;
        if (((dkgnVar == null ? dkgn.h : dkgnVar).a & 8) != 0) {
            dkgh dkghVar2 = this.c.b;
            dkgn dkgnVar2 = (dkghVar2 == null ? dkgh.d : dkghVar2).c;
            jicVar = new jic((dkgnVar2 == null ? dkgn.h : dkgnVar2).e, ckqc.FIFE_MERGE, 0);
        }
        this.f = jicVar;
    }

    @Override // defpackage.chmv
    public void RH(cqiv cqivVar) {
        cqivVar.a(new cheo(new cqmp[0]), this);
    }

    @Override // defpackage.chmj
    public CharSequence c() {
        return this.c.d;
    }

    @Override // defpackage.chmj
    @dzsi
    public chmi d() {
        return this.g;
    }

    @Override // defpackage.chjf, defpackage.chmv
    public chik e() {
        chhy chhyVar;
        chik e = super.e();
        dsqp dsqpVar = (dsqp) e.cu(5);
        dsqpVar.bC(e);
        chij chijVar = (chij) dsqpVar;
        chik chikVar = (chik) chijVar.b;
        if (chikVar.a == 1) {
            chhyVar = (chhy) chikVar.b;
        } else {
            chhyVar = chhy.e;
        }
        dsqp dsqpVar2 = (dsqp) chhyVar.cu(5);
        dsqpVar2.bC(chhyVar);
        chhv chhvVar = (chhv) dsqpVar2;
        chhx chhxVar = ((chhy) chhvVar.b).c;
        if (chhxVar == null) {
            chhxVar = chhx.c;
        }
        dsqp dsqpVar3 = (dsqp) chhxVar.cu(5);
        dsqpVar3.bC(chhxVar);
        chhw chhwVar = (chhw) dsqpVar3;
        chjw chjwVar = this.g;
        if (chjwVar != null) {
            boolean booleanValue = chjwVar.a().booleanValue();
            if (chhwVar.c) {
                chhwVar.bF();
                chhwVar.c = false;
            }
            chhx chhxVar2 = (chhx) chhwVar.b;
            chhxVar2.a |= 1;
            chhxVar2.b = booleanValue;
        }
        if (chhvVar.c) {
            chhvVar.bF();
            chhvVar.c = false;
        }
        chhy chhyVar2 = (chhy) chhvVar.b;
        chhx bK = chhwVar.bK();
        bK.getClass();
        chhyVar2.c = bK;
        chhyVar2.a |= 2;
        if (chijVar.c) {
            chijVar.bF();
            chijVar.c = false;
        }
        chik chikVar2 = (chik) chijVar.b;
        chhy bK2 = chhvVar.bK();
        bK2.getClass();
        chikVar2.b = bK2;
        chikVar2.a = 1;
        return chijVar.bK();
    }

    @Override // defpackage.chmj
    public List<chml> h() {
        return this.d;
    }

    @Override // defpackage.chmj
    public String i() {
        return this.c.f ? this.a.getUgcContributionStatsParameters().a : "";
    }

    @Override // defpackage.chmj
    public jic j() {
        return this.e;
    }

    @Override // defpackage.chmj
    @dzsi
    public jic k() {
        return this.f;
    }

    @Override // defpackage.chmj
    public cjtd l() {
        cjta b = cjtd.b();
        b.g(this.b.d());
        b.d = dtyc.D;
        return b.a();
    }
}
