package defpackage;
/* compiled from: PG */
/* renamed from: ffw  reason: default package */
/* loaded from: classes6.dex */
final class ffw<T> implements dzsj<T> {
    final /* synthetic */ ffx a;
    private final int b;

    public ffw(ffx ffxVar, int i) {
        this.a = ffxVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        int i = this.b;
        if (i == 0) {
            ftt fttVar = this.a.a;
            return (T) new abss(fttVar.a, fttVar.wk());
        } else if (i == 1) {
            return (T) new abtc();
        } else {
            if (i != 2) {
                return (T) new abtu();
            }
            ftt fttVar2 = this.a.a;
            return (T) abte.b(fttVar2.a, dxjc.c(fttVar2.bh()));
        }
    }
}
