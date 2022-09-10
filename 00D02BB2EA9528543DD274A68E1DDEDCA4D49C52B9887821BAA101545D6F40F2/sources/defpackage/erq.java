package defpackage;
/* compiled from: PG */
/* renamed from: erq  reason: default package */
/* loaded from: classes6.dex */
final class erq<T> implements dzsj<T> {
    final /* synthetic */ err a;

    public erq(err errVar) {
        this.a = errVar;
    }

    @Override // defpackage.dzsj
    public final T a() {
        err errVar = this.a;
        ftt fttVar = errVar.a.y;
        dzsj<rb> dzsjVar = fttVar.eV;
        dzsj<cqhn> il = fttVar.eW.il();
        dzsj<ufc> E = errVar.a.E();
        ese eseVar = errVar.a;
        dzsj dzsjVar2 = eseVar.x;
        if (dzsjVar2 == null) {
            dzsjVar2 = new erv(eseVar, 37);
            eseVar.x = dzsjVar2;
        }
        return (T) new uhx(dzsjVar, il, E, dzsjVar2);
    }
}
