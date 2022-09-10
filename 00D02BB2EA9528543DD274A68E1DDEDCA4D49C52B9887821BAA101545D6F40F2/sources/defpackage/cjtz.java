package defpackage;
/* compiled from: PG */
/* renamed from: cjtz  reason: default package */
/* loaded from: classes4.dex */
public final class cjtz extends cjtk {
    private final long a;
    private final dwun b;

    public cjtz(cqat cqatVar, dwun dwunVar, long j) {
        super(cqatVar.e());
        this.b = dwunVar;
        this.a = j;
    }

    @Override // defpackage.cjtk
    public final synchronized void C(dwum dwumVar) {
        super.C(dwumVar);
        dwumVar.b = (MessageType) dwumVar.b.cu(4);
        dwumVar.bC(this.b);
        if ((this.b.a & 128) != 0) {
            long g = g();
            if (dwumVar.c) {
                dwumVar.bF();
                dwumVar.c = false;
            }
            dwun dwunVar = (dwun) dwumVar.b;
            dwunVar.a |= 1;
            dwunVar.c = g;
        }
        dwun dwunVar2 = this.b;
        if ((dwunVar2.a & 128) != 0) {
            ddna ddnaVar = dwunVar2.m;
            if (ddnaVar == null) {
                ddnaVar = ddna.v;
            }
            ddmz ca = ddna.v.ca(ddnaVar);
            long j = this.a;
            if (ca.c) {
                ca.bF();
                ca.c = false;
            }
            ddna ddnaVar2 = (ddna) ca.b;
            ddnaVar2.a |= 256;
            ddnaVar2.f = j;
            if (dwumVar.c) {
                dwumVar.bF();
                dwumVar.c = false;
            }
            dwun dwunVar3 = (dwun) dwumVar.b;
            ddna bK = ca.bK();
            bK.getClass();
            dwunVar3.m = bK;
            dwunVar3.a |= 128;
        }
    }

    @Override // defpackage.cjtk
    public final synchronized long h() {
        return g() - this.a;
    }
}
