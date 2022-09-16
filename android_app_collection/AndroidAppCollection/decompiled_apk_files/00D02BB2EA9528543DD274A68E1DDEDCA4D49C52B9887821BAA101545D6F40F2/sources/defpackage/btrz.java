package defpackage;
/* compiled from: PG */
/* renamed from: btrz  reason: default package */
/* loaded from: classes.dex */
final class btrz implements crzp<aufb> {
    final /* synthetic */ btrm a;

    public btrz(btrm btrmVar) {
        this.a = btrmVar;
    }

    @Override // defpackage.crzp
    public final void On(crzm<aufb> crzmVar) {
        aufb l = crzmVar.l();
        dbsk.s(l);
        this.a.b(l.equals(aufb.DAY) ? alid.DAY : alid.NIGHT);
    }
}
