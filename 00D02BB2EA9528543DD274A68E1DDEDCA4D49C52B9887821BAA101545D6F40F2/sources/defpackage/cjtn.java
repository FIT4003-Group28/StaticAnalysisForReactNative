package defpackage;
/* compiled from: PG */
/* renamed from: cjtn  reason: default package */
/* loaded from: classes4.dex */
public final class cjtn extends cjtp {
    private final int a;

    public cjtn(int i, cqat cqatVar) {
        super(cqatVar.e(), dbpy.a);
        this.a = i;
    }

    @Override // defpackage.cjtp
    public final synchronized void D(ddmz ddmzVar) {
        super.D(ddmzVar);
        int i = this.a;
        if (ddmzVar.c) {
            ddmzVar.bF();
            ddmzVar.c = false;
        }
        ddna ddnaVar = (ddna) ddmzVar.b;
        ddna ddnaVar2 = ddna.v;
        ddnaVar.a |= 262144;
        ddnaVar.o = i;
    }
}
