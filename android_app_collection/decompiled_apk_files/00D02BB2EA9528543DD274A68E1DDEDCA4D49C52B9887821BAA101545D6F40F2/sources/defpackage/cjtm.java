package defpackage;
/* compiled from: PG */
/* renamed from: cjtm  reason: default package */
/* loaded from: classes4.dex */
public final class cjtm extends cjtp {
    private final int a;
    private final int b;
    private final dqum c;

    public cjtm(cqat cqatVar, int i, int i2, dqum dqumVar, dbsg<ddlp> dbsgVar) {
        super(cqatVar.e(), dbsgVar);
        this.a = i;
        this.b = i2;
        this.c = dqumVar;
    }

    @Override // defpackage.cjtp
    public final synchronized void D(ddmz ddmzVar) {
        super.D(ddmzVar);
        ddlz bZ = ddma.e.bZ();
        int i = this.a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddma ddmaVar = (ddma) bZ.b;
        int i2 = ddmaVar.a | 2;
        ddmaVar.a = i2;
        ddmaVar.b = i;
        int i3 = this.b;
        int i4 = i2 | 4;
        ddmaVar.a = i4;
        ddmaVar.c = i3;
        ddmaVar.d = this.c.e;
        ddmaVar.a = i4 | 8;
        if (ddmzVar.c) {
            ddmzVar.bF();
            ddmzVar.c = false;
        }
        ddna ddnaVar = (ddna) ddmzVar.b;
        ddma bK = bZ.bK();
        ddna ddnaVar2 = ddna.v;
        bK.getClass();
        ddnaVar.k = bK;
        ddnaVar.a |= 8192;
    }
}
