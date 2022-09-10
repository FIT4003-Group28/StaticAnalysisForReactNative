package defpackage;
/* compiled from: PG */
/* renamed from: arbb  reason: default package */
/* loaded from: classes.dex */
final class arbb implements crzp<aufb> {
    final /* synthetic */ arbi a;

    public arbb(arbi arbiVar) {
        this.a = arbiVar;
    }

    @Override // defpackage.crzp
    public final void On(crzm<aufb> crzmVar) {
        bvrj.UI_THREAD.c();
        aufb l = crzmVar.l();
        dbsk.s(l);
        aray arayVar = this.a.k;
        boolean z = l.c;
        if (arayVar.k == ardz.NAVIGATION && arayVar.l != z) {
            arayVar.l = z;
            if (arayVar.i == null) {
                arayVar.i = arayVar.c();
            } else {
                arayVar.i.d(arayVar.d());
            }
        }
    }
}
