package defpackage;
/* compiled from: PG */
/* renamed from: fgw  reason: default package */
/* loaded from: classes6.dex */
final class fgw<T> implements dzsj<T> {
    final /* synthetic */ fgx a;
    private final int b;

    public fgw(fgx fgxVar, int i) {
        this.a = fgxVar;
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
                return i != 3 ? (T) new abvu(this.a.a.rB()) : (T) new abtu();
            }
            ftt fttVar2 = this.a.a;
            return (T) abte.b(fttVar2.a, dxjc.c(fttVar2.bh()));
        }
    }
}
