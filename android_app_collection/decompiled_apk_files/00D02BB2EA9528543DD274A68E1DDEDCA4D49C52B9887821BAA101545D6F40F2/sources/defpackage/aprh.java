package defpackage;
/* compiled from: PG */
/* renamed from: aprh  reason: default package */
/* loaded from: classes2.dex */
final class aprh implements crzp<btlu> {
    final /* synthetic */ apri a;

    public aprh(apri apriVar) {
        this.a = apriVar;
    }

    @Override // defpackage.crzp
    public final void On(crzm<btlu> crzmVar) {
        btlu l = crzmVar.l();
        if (btlu.g(l, this.a.c)) {
            return;
        }
        apri apriVar = this.a;
        apriVar.c = l;
        if (!apriVar.i(apriVar.c)) {
            return;
        }
        apri apriVar2 = this.a;
        btlu btluVar = apriVar2.c;
        dbsk.s(btluVar);
        apriVar2.g(btluVar);
    }
}
