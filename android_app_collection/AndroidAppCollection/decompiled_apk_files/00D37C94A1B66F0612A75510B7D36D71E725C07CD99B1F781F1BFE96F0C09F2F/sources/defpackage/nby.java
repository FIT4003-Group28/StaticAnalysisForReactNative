package defpackage;
/* compiled from: PG */
/* renamed from: nby  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class nby implements Runnable {
    public final /* synthetic */ nca a;
    private final /* synthetic */ int b;

    public /* synthetic */ nby(nca ncaVar, int i, byte[] bArr) {
        this.b = i;
        this.a = ncaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            nca ncaVar = this.a;
            nfj.d(ncaVar.f, ncaVar.g, ncaVar.h, ncaVar.i, ncaVar.j, ncaVar.a, ncaVar.b);
        } else if (i == 1) {
            nca ncaVar2 = this.a;
            ncaVar2.a.e(ncaVar2.c, true);
        } else if (i == 2) {
            nca ncaVar3 = this.a;
            ncaVar3.a.q(ncaVar3.d);
        } else {
            nca ncaVar4 = this.a;
            ncaVar4.a.q(ncaVar4.e);
        }
    }
}
