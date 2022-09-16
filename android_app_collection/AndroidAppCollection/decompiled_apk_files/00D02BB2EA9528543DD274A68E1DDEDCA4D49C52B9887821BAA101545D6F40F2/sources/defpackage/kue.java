package defpackage;
/* compiled from: PG */
/* renamed from: kue  reason: default package */
/* loaded from: classes7.dex */
class kue extends dbrh<ddlc, dhmk> {
    @Override // defpackage.dbrh
    protected final /* bridge */ /* synthetic */ ddlc b(dhmk dhmkVar) {
        dhmk dhmkVar2 = dhmkVar;
        ddlb bZ = ddlc.e.bZ();
        if ((dhmkVar2.a & 1) != 0) {
            boolean z = dhmkVar2.b;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddlc ddlcVar = (ddlc) bZ.b;
            ddlcVar.a |= 1;
            ddlcVar.b = z;
        }
        if ((dhmkVar2.a & 2) != 0) {
            boolean z2 = dhmkVar2.c;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddlc ddlcVar2 = (ddlc) bZ.b;
            ddlcVar2.a |= 2;
            ddlcVar2.c = z2;
        }
        if ((dhmkVar2.a & 4) != 0) {
            boolean z3 = dhmkVar2.d;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddlc ddlcVar3 = (ddlc) bZ.b;
            ddlcVar3.a |= 4;
            ddlcVar3.d = z3;
        }
        return bZ.bK();
    }

    @Override // defpackage.dbrh
    protected final /* bridge */ /* synthetic */ dhmk c(ddlc ddlcVar) {
        ddlc ddlcVar2 = ddlcVar;
        dhmj bZ = dhmk.e.bZ();
        if ((ddlcVar2.a & 1) != 0) {
            boolean z = ddlcVar2.b;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dhmk dhmkVar = (dhmk) bZ.b;
            dhmkVar.a |= 1;
            dhmkVar.b = z;
        }
        if ((ddlcVar2.a & 2) != 0) {
            boolean z2 = ddlcVar2.c;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dhmk dhmkVar2 = (dhmk) bZ.b;
            dhmkVar2.a |= 2;
            dhmkVar2.c = z2;
        }
        if ((ddlcVar2.a & 4) != 0) {
            boolean z3 = ddlcVar2.d;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dhmk dhmkVar3 = (dhmk) bZ.b;
            dhmkVar3.a |= 4;
            dhmkVar3.d = z3;
        }
        return bZ.bK();
    }
}
