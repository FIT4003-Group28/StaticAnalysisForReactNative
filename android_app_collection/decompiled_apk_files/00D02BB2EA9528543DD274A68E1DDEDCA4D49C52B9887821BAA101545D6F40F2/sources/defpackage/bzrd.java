package defpackage;
/* compiled from: PG */
/* renamed from: bzrd  reason: default package */
/* loaded from: classes4.dex */
final class bzrd implements crzp<btlu> {
    final /* synthetic */ bzrf a;

    public bzrd(bzrf bzrfVar) {
        this.a = bzrfVar;
    }

    @Override // defpackage.crzp
    public final void On(crzm<btlu> crzmVar) {
        btlu q = btlu.q(crzmVar.l());
        if (dbsd.a(this.a.b, q)) {
            return;
        }
        bzrf bzrfVar = this.a;
        bzrfVar.b = q;
        bzrfVar.i(q);
    }
}
