package defpackage;
/* compiled from: PG */
/* renamed from: bfdk  reason: default package */
/* loaded from: classes3.dex */
final class bfdk implements crzp<bfbm> {
    final /* synthetic */ bfdm a;

    public bfdk(bfdm bfdmVar) {
        this.a = bfdmVar;
    }

    @Override // defpackage.crzp
    public final void On(crzm<bfbm> crzmVar) {
        if (!this.a.aD) {
            return;
        }
        bfbm l = crzmVar.l();
        dbsk.s(l);
        this.a.ae = l.a();
        dbpk a = this.a.b.a();
        dbsk.s(a);
        a.b(dbpk.c(this.a.f.a(l.b())), this.a.af);
    }
}
