package defpackage;

import com.google.ar.core.ImageMetadata;
/* compiled from: PG */
/* renamed from: cjtv  reason: default package */
/* loaded from: classes.dex */
public final class cjtv extends cjtp {
    @dzsi
    private final ddho a;
    @dzsi
    private final ddmm b;
    private final int c;

    public cjtv(int i, cqat cqatVar, @dzsi ddho ddhoVar, dbsg<ddlp> dbsgVar, @dzsi ddmm ddmmVar) {
        super(cqatVar.e(), dbsgVar);
        this.a = ddhoVar;
        this.c = i;
        this.b = ddmmVar;
    }

    @Override // defpackage.cjtp, defpackage.cjtk
    public final synchronized void C(dwum dwumVar) {
        super.C(dwumVar);
        dnqg k = k();
        int i = ddda.eB.b;
        if (k.c) {
            k.bF();
            k.c = false;
        }
        dnqh dnqhVar = (dnqh) k.b;
        dnqh dnqhVar2 = dnqh.p;
        dnqhVar.a |= 64;
        dnqhVar.g = i;
        dnqh bK = k.bK();
        if (dwumVar.c) {
            dwumVar.bF();
            dwumVar.c = false;
        }
        dwun dwunVar = (dwun) dwumVar.b;
        dwun dwunVar2 = dwun.w;
        bK.getClass();
        dwunVar.e = bK;
        dwunVar.a |= 4;
    }

    @Override // defpackage.cjtp
    public final synchronized void D(ddmz ddmzVar) {
        super.D(ddmzVar);
        ddqa bZ = ddqb.d.bZ();
        int i = this.c;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddqb ddqbVar = (ddqb) bZ.b;
        ddqbVar.a |= 1;
        ddqbVar.c = i;
        ddho ddhoVar = this.a;
        if (ddhoVar != null) {
            ddhk b = cjth.b(ddhoVar);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddqb ddqbVar2 = (ddqb) bZ.b;
            b.getClass();
            dsrj<ddhk> dsrjVar = ddqbVar2.b;
            if (!dsrjVar.a()) {
                ddqbVar2.b = dsqw.cl(dsrjVar);
            }
            ddqbVar2.b.add(b);
        }
        if (ddmzVar.c) {
            ddmzVar.bF();
            ddmzVar.c = false;
        }
        ddna ddnaVar = (ddna) ddmzVar.b;
        ddqb bK = bZ.bK();
        ddna ddnaVar2 = ddna.v;
        bK.getClass();
        ddnaVar.n = bK;
        ddnaVar.a |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        if (this.b != null) {
            ddls ddlsVar = ((ddna) ddmzVar.b).e;
            if (ddlsVar == null) {
                ddlsVar = ddls.k;
            }
            dsqp dsqpVar = (dsqp) ddlsVar.cu(5);
            dsqpVar.bC(ddlsVar);
            ddlr ddlrVar = (ddlr) dsqpVar;
            ddqr bZ2 = ddqs.d.bZ();
            ddmm ddmmVar = this.b;
            dbsk.s(ddmmVar);
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            ddqs ddqsVar = (ddqs) bZ2.b;
            ddmmVar.getClass();
            ddqsVar.c = ddmmVar;
            ddqsVar.a |= 8;
            if (ddlrVar.c) {
                ddlrVar.bF();
                ddlrVar.c = false;
            }
            ddls ddlsVar2 = (ddls) ddlrVar.b;
            ddqs bK2 = bZ2.bK();
            bK2.getClass();
            ddlsVar2.e = bK2;
            ddlsVar2.a |= 16;
            if (ddmzVar.c) {
                ddmzVar.bF();
                ddmzVar.c = false;
            }
            ddna ddnaVar3 = (ddna) ddmzVar.b;
            ddls bK3 = ddlrVar.bK();
            bK3.getClass();
            ddnaVar3.e = bK3;
            ddnaVar3.a |= 128;
        }
    }
}
