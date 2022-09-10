package defpackage;
/* compiled from: PG */
/* renamed from: cjui  reason: default package */
/* loaded from: classes4.dex */
public abstract class cjui extends cjtp {
    public cjui(cqat cqatVar, dbsg<ddlp> dbsgVar) {
        super(cqatVar.e(), dbsgVar);
    }

    @Override // defpackage.cjtp
    public final synchronized void D(ddmz ddmzVar) {
        super.D(ddmzVar);
        ddsu a = a();
        if (ddmzVar.c) {
            ddmzVar.bF();
            ddmzVar.c = false;
        }
        ddna ddnaVar = (ddna) ddmzVar.b;
        ddna ddnaVar2 = ddna.v;
        a.getClass();
        ddnaVar.s = a;
        ddnaVar.a |= 8388608;
    }

    protected abstract ddsu a();
}
