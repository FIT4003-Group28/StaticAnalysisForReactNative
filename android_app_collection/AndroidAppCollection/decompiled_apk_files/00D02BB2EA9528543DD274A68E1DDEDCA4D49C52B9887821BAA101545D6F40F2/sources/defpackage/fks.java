package defpackage;
/* compiled from: PG */
/* renamed from: fks  reason: default package */
/* loaded from: classes6.dex */
final class fks<T> implements dzsj<T> {
    final /* synthetic */ fkt a;
    private final int b;

    public fks(fkt fktVar, int i) {
        this.a = fktVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                return (T) axzf.b(this.a.c.eW.fn());
            }
            return (T) new aymh(this.a.c.a);
        }
        fkt fktVar = this.a;
        dzsj<gga> ad = fktVar.c.ad();
        dzsj<cqkj> y = fktVar.c.y();
        dzsj<cjqy> al = fktVar.c.eW.al();
        fyu fyuVar = fktVar.c.eW;
        dzsj dzsjVar = fyuVar.dJ;
        if (dzsjVar == null) {
            dzsjVar = new fxy(fyuVar, 708);
            fyuVar.dJ = dzsjVar;
        }
        dzsj dzsjVar2 = fktVar.a;
        if (dzsjVar2 == null) {
            dzsjVar2 = new fks(fktVar, 1);
            fktVar.a = dzsjVar2;
        }
        dzsj dzsjVar3 = dzsjVar2;
        dzsj<cqhn> il = fktVar.c.eW.il();
        dzsj<axwo> eW = fktVar.c.eW();
        dzsj<axwi> el = fktVar.c.eW.el();
        dzsj dzsjVar4 = fktVar.b;
        if (dzsjVar4 == null) {
            dzsjVar4 = new fks(fktVar, 2);
            fktVar.b = dzsjVar4;
        }
        return (T) new azcd(ad, y, al, dzsjVar, dzsjVar3, il, eW, el, dzsjVar4, fktVar.c.up());
    }
}
