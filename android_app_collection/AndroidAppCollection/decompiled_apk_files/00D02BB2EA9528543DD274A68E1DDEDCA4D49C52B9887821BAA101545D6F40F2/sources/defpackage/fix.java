package defpackage;
/* compiled from: PG */
/* renamed from: fix  reason: default package */
/* loaded from: classes6.dex */
final class fix<T> implements dzsj<T> {
    final /* synthetic */ fiy a;
    private final int b;

    public fix(fiy fiyVar, int i) {
        this.a = fiyVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                return (T) new blye(this.a.b.a);
            }
            if (i != 2) {
                fiy fiyVar = this.a;
                blox bloxVar = fiyVar.a;
                btvo rp = fiyVar.b.eW.a.rp();
                dxjg.e(rp);
                return (T) new blyz(bloxVar, rp, dxjc.c(fiyVar.b.aV()), dxjc.c(fiyVar.b.m()), dxjc.c(fiyVar.b.eW.aB()));
            }
            ckcw rU = this.a.b.eW.a.rU();
            dxjg.e(rU);
            return (T) new blwm(rU);
        }
        return (T) new blzs();
    }
}
