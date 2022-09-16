package defpackage;
/* compiled from: PG */
/* renamed from: cjuf  reason: default package */
/* loaded from: classes4.dex */
public abstract class cjuf extends cjtp {
    public cjuf(cqat cqatVar, dbsg<ddlp> dbsgVar) {
        super(cqatVar.e(), dbsgVar);
    }

    @Override // defpackage.cjtp
    public final synchronized void D(ddmz ddmzVar) {
        super.D(ddmzVar);
        ddsh a = a();
        if (ddmzVar.c) {
            ddmzVar.bF();
            ddmzVar.c = false;
        }
        ddna ddnaVar = (ddna) ddmzVar.b;
        ddna ddnaVar2 = ddna.v;
        a.getClass();
        ddnaVar.r = a;
        ddnaVar.a |= 4194304;
    }

    protected abstract ddsh a();
}
