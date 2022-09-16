package defpackage;
/* compiled from: PG */
/* renamed from: fqv  reason: default package */
/* loaded from: classes6.dex */
final class fqv<T> implements dzsj<T> {
    final /* synthetic */ fqw a;
    private final int b;

    public fqv(fqw fqwVar, int i) {
        this.a = fqwVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                fqw fqwVar = this.a;
                ftt fttVar = fqwVar.b;
                return (T) new brvh(fttVar.eV, fttVar.sD(), fqwVar.b.sB());
            } else if (i != 2) {
                fqw fqwVar2 = this.a;
                return (T) new bakw(fqwVar2.b.eW.cx(), fqwVar2.b.eW.er(), fqwVar2.b.fr(), dxjh.c(fqwVar2.b.eW.el()));
            } else {
                fqw fqwVar3 = this.a;
                return (T) new barh(fqwVar3.b.ad(), fqwVar3.b.y(), fqwVar3.b.fe());
            }
        }
        fqw fqwVar4 = this.a;
        dzsj<gga> ad = fqwVar4.b.ad();
        dzsj<cqhn> il = fqwVar4.b.eW.il();
        dzsj<btvo> V = fqwVar4.b.eW.V();
        dzsj<gdc> lD = fqwVar4.b.lD();
        dzsj dzsjVar = fqwVar4.a;
        if (dzsjVar == null) {
            dzsjVar = new fqv(fqwVar4, 1);
            fqwVar4.a = dzsjVar;
        }
        return (T) new bass(ad, il, V, lD, dzsjVar, fqwVar4.b.pl());
    }
}
