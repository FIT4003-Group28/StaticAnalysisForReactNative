package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: chkq  reason: default package */
/* loaded from: classes4.dex */
public class chkq extends chjc implements chmj {
    private final btvo a;
    private final djdj c;
    private final List<chml> d;
    private final jic e;
    @dzsi
    private final chjw f;

    public chkq(btvo btvoVar, chjx chjxVar, chkd chkdVar, chiu chiuVar, chmu chmuVar) {
        super(chmuVar);
        chhy chhyVar;
        djdj djdjVar;
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
        if (djdmVar.a == 4) {
            djdjVar = (djdj) djdmVar.b;
        } else {
            djdjVar = djdj.g;
        }
        this.c = djdjVar;
        chik chikVar2 = chleVar.a;
        if (chikVar2.a == 1) {
            chhyVar2 = (chhy) chikVar2.b;
        } else {
            chhyVar2 = chhy.e;
        }
        chhx chhxVar = chhyVar2.c;
        this.f = (djdjVar.a & 4) != 0 ? chjxVar.a(djdjVar.c, (chhxVar == null ? chhx.c : chhxVar).b) : null;
        this.d = new ArrayList();
        for (dqeg dqegVar : djdjVar.e) {
            this.d.add(chkdVar.a(dqegVar));
        }
        this.e = chiuVar.a(this.c.b);
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
        return this.f;
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
        chjw chjwVar = this.f;
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
        return null;
    }

    @Override // defpackage.chmj
    public cjtd l() {
        cjta b = cjtd.b();
        b.g(this.b.d());
        b.d = dtyc.C;
        return b.a();
    }
}