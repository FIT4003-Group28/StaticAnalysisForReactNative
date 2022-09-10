package defpackage;
/* compiled from: PG */
/* renamed from: cjtl  reason: default package */
/* loaded from: classes4.dex */
public final class cjtl extends cjtp {
    @dzsi
    private final dukj a;
    @dzsi
    private final ddll b;
    @dzsi
    private final ddqm c;
    @dzsi
    private final ddoo d;
    @dzsi
    private final ddmw e;
    @dzsi
    private final ddrw f;
    private final boolean g;

    public cjtl(cqat cqatVar, @dzsi dukj dukjVar, @dzsi ddll ddllVar, @dzsi ddqm ddqmVar, @dzsi ddoo ddooVar, @dzsi ddmw ddmwVar, @dzsi ddrw ddrwVar, boolean z, dbsg<ddlp> dbsgVar) {
        super(cqatVar.e(), dbsgVar);
        this.a = dukjVar;
        this.b = ddllVar;
        this.c = ddqmVar;
        this.d = ddooVar;
        this.e = ddmwVar;
        this.f = ddrwVar;
        this.g = z;
    }

    private final synchronized void z(ddlr ddlrVar) {
        dukj dukjVar = this.a;
        if (dukjVar != null) {
            if (ddlrVar.c) {
                ddlrVar.bF();
                ddlrVar.c = false;
            }
            ddls ddlsVar = (ddls) ddlrVar.b;
            ddls ddlsVar2 = ddls.k;
            ddlsVar.b = dukjVar.G;
            ddlsVar.a |= 1;
        }
        ddll ddllVar = this.b;
        if (ddllVar != null) {
            if (ddlrVar.c) {
                ddlrVar.bF();
                ddlrVar.c = false;
            }
            ddls ddlsVar3 = (ddls) ddlrVar.b;
            ddls ddlsVar4 = ddls.k;
            ddllVar.getClass();
            ddlsVar3.c = ddllVar;
            ddlsVar3.a |= 2;
        }
        ddqm ddqmVar = this.c;
        if (ddqmVar != null) {
            if (ddlrVar.c) {
                ddlrVar.bF();
                ddlrVar.c = false;
            }
            ddls ddlsVar5 = (ddls) ddlrVar.b;
            ddls ddlsVar6 = ddls.k;
            ddqmVar.getClass();
            ddlsVar5.j = ddqmVar;
            ddlsVar5.a |= 4096;
        }
        ddoo ddooVar = this.d;
        if (ddooVar != null) {
            if (ddlrVar.c) {
                ddlrVar.bF();
                ddlrVar.c = false;
            }
            ddls ddlsVar7 = (ddls) ddlrVar.b;
            ddls ddlsVar8 = ddls.k;
            ddooVar.getClass();
            ddlsVar7.d = ddooVar;
            ddlsVar7.a |= 4;
        }
        ddmw ddmwVar = this.e;
        if (ddmwVar != null) {
            if (ddlrVar.c) {
                ddlrVar.bF();
                ddlrVar.c = false;
            }
            ddls ddlsVar9 = (ddls) ddlrVar.b;
            ddls ddlsVar10 = ddls.k;
            ddmwVar.getClass();
            ddlsVar9.f = ddmwVar;
            ddlsVar9.a |= 64;
        }
        ddrw ddrwVar = this.f;
        if (ddrwVar != null) {
            if (ddlrVar.c) {
                ddlrVar.bF();
                ddlrVar.c = false;
            }
            ddls ddlsVar11 = (ddls) ddlrVar.b;
            ddls ddlsVar12 = ddls.k;
            ddrwVar.getClass();
            ddlsVar11.h = ddrwVar;
            ddlsVar11.a |= 256;
        }
    }

    @Override // defpackage.cjtp, defpackage.cjtk
    public final synchronized void C(dwum dwumVar) {
        super.C(dwumVar);
        dnqg k = k();
        int i = ddda.eY.b;
        if (k.c) {
            k.bF();
            k.c = false;
        }
        dnqh dnqhVar = (dnqh) k.b;
        dnqh dnqhVar2 = dnqh.p;
        dnqhVar.a |= 64;
        dnqhVar.g = i;
        if (dwumVar.c) {
            dwumVar.bF();
            dwumVar.c = false;
        }
        dwun dwunVar = (dwun) dwumVar.b;
        dnqh bK = k.bK();
        dwun dwunVar2 = dwun.w;
        bK.getClass();
        dwunVar.e = bK;
        dwunVar.a |= 4;
    }

    @Override // defpackage.cjtp
    public final synchronized void D(ddmz ddmzVar) {
        super.D(ddmzVar);
        ddls ddlsVar = ((ddna) ddmzVar.b).e;
        if (ddlsVar == null) {
            ddlsVar = ddls.k;
        }
        dsqp dsqpVar = (dsqp) ddlsVar.cu(5);
        dsqpVar.bC(ddlsVar);
        ddlr ddlrVar = (ddlr) dsqpVar;
        z(ddlrVar);
        if (ddmzVar.c) {
            ddmzVar.bF();
            ddmzVar.c = false;
        }
        ddna ddnaVar = (ddna) ddmzVar.b;
        ddls bK = ddlrVar.bK();
        bK.getClass();
        ddnaVar.e = bK;
        ddnaVar.a |= 128;
        if (!this.g || this.a == null) {
            return;
        }
        ddjm bZ = ddkr.i.bZ();
        dukj dukjVar = this.a;
        dbsk.s(dukjVar);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddkr ddkrVar = (ddkr) bZ.b;
        ddkrVar.b = dukjVar.G;
        ddkrVar.a |= 1;
        if (ddmzVar.c) {
            ddmzVar.bF();
            ddmzVar.c = false;
        }
        ddna ddnaVar2 = (ddna) ddmzVar.b;
        ddkr bK2 = bZ.bK();
        bK2.getClass();
        ddnaVar2.m = bK2;
        ddnaVar2.a |= 32768;
    }
}
