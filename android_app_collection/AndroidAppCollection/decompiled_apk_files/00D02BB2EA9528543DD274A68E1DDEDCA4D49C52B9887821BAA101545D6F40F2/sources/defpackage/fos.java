package defpackage;
/* compiled from: PG */
/* renamed from: fos  reason: default package */
/* loaded from: classes6.dex */
final class fos<T> implements dzsj<T> {
    final /* synthetic */ fot a;
    private final int b;

    public fos(fot fotVar, int i) {
        this.a = fotVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                return (T) new cdaq();
            }
            fot fotVar = this.a;
            return (T) new cdfm(fotVar.c.eW.m(), fotVar.c.eW.il(), fotVar.c.bf());
        }
        fot fotVar2 = this.a;
        dzsj<gga> ad = fotVar2.c.ad();
        dzsj<cqhn> il = fotVar2.c.eW.il();
        dzsj<bmdv> lL = fotVar2.c.eW.lL();
        dzsj dzsjVar = fotVar2.a;
        if (dzsjVar == null) {
            dzsjVar = new fos(fotVar2, 1);
            fotVar2.a = dzsjVar;
        }
        dzsj dzsjVar2 = dzsjVar;
        dzsj dzsjVar3 = fotVar2.b;
        if (dzsjVar3 == null) {
            dzsjVar3 = new fos(fotVar2, 2);
            fotVar2.b = dzsjVar3;
        }
        return (T) new cdfh(ad, il, lL, dzsjVar2, dzsjVar3, fotVar2.c.eS(), fotVar2.c.lD(), fotVar2.c.eW.bk());
    }
}
