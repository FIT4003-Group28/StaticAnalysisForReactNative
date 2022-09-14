package defpackage;
/* compiled from: PG */
/* renamed from: apxu  reason: default package */
/* loaded from: classes2.dex */
final class apxu implements crzp<btlu> {
    final /* synthetic */ apxx a;

    public apxu(apxx apxxVar) {
        this.a = apxxVar;
    }

    @Override // defpackage.crzp
    public final void On(crzm<btlu> crzmVar) {
        synchronized (this.a.p) {
            btlu l = crzmVar.l();
            if (!dbsd.a(this.a.t, l)) {
                this.a.L();
                apxx apxxVar = this.a;
                apxxVar.t = l;
                apxxVar.K();
            }
        }
    }
}
