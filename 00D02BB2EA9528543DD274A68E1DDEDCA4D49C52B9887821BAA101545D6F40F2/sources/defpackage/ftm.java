package defpackage;
/* compiled from: PG */
/* renamed from: ftm  reason: default package */
/* loaded from: classes6.dex */
final class ftm<T> implements dzsj<T> {
    final /* synthetic */ ftn a;
    private final int b;

    public ftm(ftn ftnVar, int i) {
        this.a = ftnVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        if (this.b != 0) {
            ftn ftnVar = this.a;
            dxjc.c(ftnVar.a.fr());
            dxjg.e(ftnVar.a.eW.a.sz());
            dxjg.e(ftnVar.a.eW.a.m());
            ckcw rU = ftnVar.a.eW.a.rU();
            dxjg.e(rU);
            return (T) new apuy((aprw) ftnVar.a.eW.iM(), rU);
        }
        ftn ftnVar2 = this.a;
        return (T) new apvo(ftnVar2.a.ad(), ftnVar2.a.az(), ftnVar2.a.eW.ng());
    }
}
