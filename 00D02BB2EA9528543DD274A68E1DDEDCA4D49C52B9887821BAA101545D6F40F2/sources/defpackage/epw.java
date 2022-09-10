package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: epw  reason: default package */
/* loaded from: classes6.dex */
public final class epw<T> implements dzsj<T> {
    final /* synthetic */ epx a;
    private final int b;

    public epw(epx epxVar, int i) {
        this.a = epxVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        int i = this.b;
        if (i == 0) {
            ftt fttVar = this.a.b;
            return (T) new cazn(fttVar.eV, fttVar.eW.il());
        } else if (i == 1) {
            ftt fttVar2 = this.a.b;
            return (T) new cbqd(fttVar2.a, dxjc.c(fttVar2.bh()));
        } else if (i != 2) {
            return (T) new cbdi();
        } else {
            epx epxVar = this.a;
            dzsj<cqkj> y = epxVar.b.y();
            dzsj<cbct> vA = epxVar.b.vA();
            dzsj<cbbc> vC = epxVar.b.vC();
            dzsj<cqhn> il = epxVar.b.eW.il();
            dzsj dzsjVar = epxVar.a;
            if (dzsjVar == null) {
                dzsjVar = new epw(epxVar, 3);
                epxVar.a = dzsjVar;
            }
            return (T) new cazl(y, vA, vC, il, dzsjVar, epxVar.b());
        }
    }
}
