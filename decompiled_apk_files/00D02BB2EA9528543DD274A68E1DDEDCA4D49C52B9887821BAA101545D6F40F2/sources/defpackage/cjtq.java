package defpackage;
/* compiled from: PG */
/* renamed from: cjtq  reason: default package */
/* loaded from: classes4.dex */
public abstract class cjtq extends cjtp {
    public cjtq(cqat cqatVar, dbsg<ddlp> dbsgVar) {
        super(cqatVar.e(), dbsgVar);
    }

    @dzsi
    protected abstract dtaq A();

    @Override // defpackage.cjtp, defpackage.cjtk
    public final synchronized void C(dwum dwumVar) {
        super.C(dwumVar);
        dtaq A = A();
        if (A != null) {
            if (dwumVar.c) {
                dwumVar.bF();
                dwumVar.c = false;
            }
            dwun dwunVar = (dwun) dwumVar.b;
            dwun dwunVar2 = dwun.w;
            A.getClass();
            dsrj<dtaq> dsrjVar = dwunVar.b;
            if (!dsrjVar.a()) {
                dwunVar.b = dsqw.cl(dsrjVar);
            }
            dwunVar.b.add(A);
        }
    }

    @Override // defpackage.cjtp
    public final synchronized void D(ddmz ddmzVar) {
        super.D(ddmzVar);
        ddom z = z();
        if (ddmzVar.c) {
            ddmzVar.bF();
            ddmzVar.c = false;
        }
        ddna ddnaVar = (ddna) ddmzVar.b;
        ddna ddnaVar2 = ddna.v;
        z.getClass();
        ddnaVar.l = z;
        ddnaVar.a |= 16384;
    }

    protected abstract ddom z();
}
