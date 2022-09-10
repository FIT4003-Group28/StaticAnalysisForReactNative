package defpackage;
/* compiled from: PG */
/* renamed from: eul  reason: default package */
/* loaded from: classes6.dex */
final class eul<T> implements dzsj<T> {
    final /* synthetic */ eum a;
    private final int b;

    public eul(eum eumVar, int i) {
        this.a = eumVar;
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [T, busw] */
    @Override // defpackage.dzsj
    public final T a() {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                return (T) new aaph(this.a.c.eV);
            }
            eum eumVar = this.a;
            T t = (T) eumVar.d;
            if (t != null) {
                return t;
            }
            dxio c = dxjc.c(eumVar.c.eW.h());
            bvrb tn = eumVar.c.eW.a.tn();
            dxjg.e(tn);
            ?? r1 = (T) new busw(new busv(c, tn));
            eumVar.d = r1;
            return r1;
        }
        eum eumVar2 = this.a;
        dzsj<gga> ad = eumVar2.c.ad();
        dzsj<cqkj> y = eumVar2.c.y();
        dzsj dzsjVar = eumVar2.a;
        if (dzsjVar == null) {
            dzsjVar = new eul(eumVar2, 1);
            eumVar2.a = dzsjVar;
        }
        dzsj dzsjVar2 = eumVar2.b;
        if (dzsjVar2 == null) {
            dzsjVar2 = new eul(eumVar2, 2);
            eumVar2.b = dzsjVar2;
        }
        return (T) new aapl(ad, y, dzsjVar, dzsjVar2);
    }
}
