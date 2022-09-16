package defpackage;
/* compiled from: PG */
/* renamed from: fgt  reason: default package */
/* loaded from: classes6.dex */
final class fgt<T> implements dzsj<T> {
    final /* synthetic */ fgu a;
    private final int b;

    public fgt(fgu fguVar, int i) {
        this.a = fguVar;
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
