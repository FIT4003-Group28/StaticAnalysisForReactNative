package defpackage;
/* compiled from: PG */
/* renamed from: cjtw  reason: default package */
/* loaded from: classes4.dex */
public final class cjtw extends cjtp {
    private final ddda a;
    private final long b;

    public cjtw(long j, ddda dddaVar, long j2) {
        super(j, dbpy.a);
        this.a = dddaVar;
        this.b = j2;
    }

    @Override // defpackage.cjtp, defpackage.cjtk
    public final synchronized void C(dwum dwumVar) {
        super.C(dwumVar);
        dnqg k = k();
        int i = this.a.b;
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
        ddsi bZ = ddsj.k.bZ();
        ddhk b = cjth.b(this.a);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddsj ddsjVar = (ddsj) bZ.b;
        b.getClass();
        ddsjVar.g = b;
        ddsjVar.a |= 64;
        deaf deafVar = deaf.AUTOMATED;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddsj ddsjVar2 = (ddsj) bZ.b;
        ddsjVar2.b = deafVar.Q;
        ddsjVar2.a |= 2;
        if (ddmzVar.c) {
            ddmzVar.bF();
            ddmzVar.c = false;
        }
        ddna ddnaVar = (ddna) ddmzVar.b;
        ddsj bK = bZ.bK();
        ddna ddnaVar2 = ddna.v;
        bK.getClass();
        ddnaVar.c = bK;
        ddnaVar.a |= 32;
        long j = this.b;
        if (ddmzVar.c) {
            ddmzVar.bF();
            ddmzVar.c = false;
        }
        ddna ddnaVar3 = (ddna) ddmzVar.b;
        ddnaVar3.a |= 256;
        ddnaVar3.f = j;
    }

    @Override // defpackage.cjtk
    public final synchronized long h() {
        return g() - this.b;
    }
}
