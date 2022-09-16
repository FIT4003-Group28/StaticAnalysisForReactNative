package defpackage;
/* compiled from: PG */
/* renamed from: cjtu  reason: default package */
/* loaded from: classes4.dex */
public abstract class cjtu extends cjtp {
    public cjtu(cqat cqatVar, dbsg<ddlp> dbsgVar) {
        super(cqatVar.e(), dbsgVar);
    }

    @Override // defpackage.cjtp
    public final synchronized void D(ddmz ddmzVar) {
        super.D(ddmzVar);
        ddpz a = a();
        if (ddmzVar.c) {
            ddmzVar.bF();
            ddmzVar.c = false;
        }
        ddna ddnaVar = (ddna) ddmzVar.b;
        ddna ddnaVar2 = ddna.v;
        a.getClass();
        dsrj<ddpz> dsrjVar = ddnaVar.t;
        if (!dsrjVar.a()) {
            ddnaVar.t = dsqw.cl(dsrjVar);
        }
        ddnaVar.t.add(a);
    }

    protected abstract ddpz a();
}
