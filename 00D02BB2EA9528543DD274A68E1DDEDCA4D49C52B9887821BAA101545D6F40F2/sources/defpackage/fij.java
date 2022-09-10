package defpackage;
/* compiled from: PG */
/* renamed from: fij  reason: default package */
/* loaded from: classes6.dex */
final class fij<T> implements dzsj<T> {
    final /* synthetic */ fik a;
    private final int b;

    public fij(fik fikVar, int i) {
        this.a = fikVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        int i = this.b;
        if (i == 0) {
            fik fikVar = this.a;
            return (T) new baho(fikVar.b.ad(), fikVar.b.fe(), fikVar.b.eW.al());
        } else if (i == 1) {
            fik fikVar2 = this.a;
            return (T) new barv(fikVar2.b.ad(), fikVar2.b.eW.il(), fikVar2.b.eW.u(), fikVar2.b.J(), fikVar2.b.G(), dxjh.c(fikVar2.b.eW.p()));
        } else if (i == 2) {
            fik fikVar3 = this.a;
            return (T) new bbbd(fikVar3.b.ad(), fikVar3.b.fe(), fikVar3.b.dL());
        } else if (i != 3) {
            return (T) baua.b(this.a.b.fc());
        } else {
            fik fikVar4 = this.a;
            dzsj<gga> ad = fikVar4.b.ad();
            dzsj<axwq> u = fikVar4.b.eW.u();
            dzsj<bwqv> er = fikVar4.b.eW.er();
            dzsj<ania> hj = fikVar4.b.eW.hj();
            dzsj c = dxjh.c(fikVar4.b.m());
            dzsj<gdc> lD = fikVar4.b.lD();
            dzsj dzsjVar = fikVar4.a;
            if (dzsjVar == null) {
                dzsjVar = new fij(fikVar4, 4);
                fikVar4.a = dzsjVar;
            }
            return (T) new bbbb(ad, u, er, hj, c, lD, dzsjVar);
        }
    }
}
