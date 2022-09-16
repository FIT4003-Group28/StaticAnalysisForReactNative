package defpackage;
/* compiled from: PG */
/* renamed from: cjti  reason: default package */
/* loaded from: classes.dex */
public final class cjti extends cjtp {
    private static final dcdn<dukj, ddda> a;
    private final ddkr b;
    @dzsi
    private final ddll c;

    static {
        dcdg dcdgVar = new dcdg();
        dcdgVar.f(dukj.APP_STARTED_COLD, ddda.L);
        dcdgVar.f(dukj.APP_STARTED_HOT, ddda.J);
        dcdgVar.f(dukj.APP_BACKGROUNDED, ddda.E);
        dcdgVar.f(dukj.APP_CRASHED, ddda.F);
        dcdgVar.f(dukj.EXTERNAL_INVOCATION_STARTED, ddda.I);
        dcdgVar.f(dukj.EXTERNAL_INVOCATION_COMPLETED, ddda.H);
        dcdgVar.f(dukj.PROJECTED_APP_STARTED_COLD, ddda.eU);
        dcdgVar.f(dukj.PROJECTED_APP_STARTED_HOT, ddda.eV);
        dcdgVar.f(dukj.PROJECTED_APP_BACKGROUNDED, ddda.eT);
        dcdgVar.f(dukj.VANAGON_MODE_STARTED, ddda.fQ);
        dcdgVar.f(dukj.VANAGON_MODE_ENDED, ddda.fP);
        dcdgVar.f(dukj.WIDGET_STARTED, ddda.fA);
        dcdgVar.f(dukj.RUNNING, ddda.K);
        a = dcdgVar.b();
    }

    public cjti(cqat cqatVar, ddkr ddkrVar, dbsg<ddlp> dbsgVar, @dzsi ddll ddllVar) {
        super(cqatVar.e(), dbsgVar);
        this.b = ddkrVar;
        this.c = ddllVar;
    }

    @Override // defpackage.cjtp, defpackage.cjtk
    public final synchronized void C(dwum dwumVar) {
        super.C(dwumVar);
        if ((this.b.a & 1) != 0) {
            dcdn<dukj, ddda> dcdnVar = a;
            dukj b = dukj.b(this.b.b);
            if (b == null) {
                b = dukj.APP_STARTED_COLD;
            }
            ddda dddaVar = dcdnVar.get(b);
            if (dddaVar != null) {
                dnqg k = k();
                int i = dddaVar.b;
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
        }
    }

    @Override // defpackage.cjtp
    public final synchronized void D(ddmz ddmzVar) {
        super.D(ddmzVar);
        ddkr ddkrVar = this.b;
        if (ddmzVar.c) {
            ddmzVar.bF();
            ddmzVar.c = false;
        }
        ddna ddnaVar = (ddna) ddmzVar.b;
        ddna ddnaVar2 = ddna.v;
        ddkrVar.getClass();
        ddnaVar.m = ddkrVar;
        ddnaVar.a |= 32768;
        if (this.c != null) {
            ddls ddlsVar = ddnaVar.e;
            if (ddlsVar == null) {
                ddlsVar = ddls.k;
            }
            dsqp dsqpVar = (dsqp) ddlsVar.cu(5);
            dsqpVar.bC(ddlsVar);
            ddlr ddlrVar = (ddlr) dsqpVar;
            ddll ddllVar = this.c;
            dbsk.s(ddllVar);
            if (ddlrVar.c) {
                ddlrVar.bF();
                ddlrVar.c = false;
            }
            ddls ddlsVar2 = (ddls) ddlrVar.b;
            ddllVar.getClass();
            ddlsVar2.c = ddllVar;
            ddlsVar2.a |= 2;
            dukj b = dukj.b(this.b.b);
            if (b == null) {
                b = dukj.APP_STARTED_COLD;
            }
            if (ddlrVar.c) {
                ddlrVar.bF();
                ddlrVar.c = false;
            }
            ddls ddlsVar3 = (ddls) ddlrVar.b;
            ddlsVar3.b = b.G;
            ddlsVar3.a |= 1;
            if (ddmzVar.c) {
                ddmzVar.bF();
                ddmzVar.c = false;
            }
            ddna ddnaVar3 = (ddna) ddmzVar.b;
            ddls bK = ddlrVar.bK();
            bK.getClass();
            ddnaVar3.e = bK;
            ddnaVar3.a |= 128;
        }
    }
}
