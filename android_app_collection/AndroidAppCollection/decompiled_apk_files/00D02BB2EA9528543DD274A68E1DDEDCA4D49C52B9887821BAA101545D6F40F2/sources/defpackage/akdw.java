package defpackage;
/* compiled from: PG */
/* renamed from: akdw  reason: default package */
/* loaded from: classes2.dex */
final class akdw implements crzp<btlu> {
    final /* synthetic */ akea a;

    public akdw(akea akeaVar) {
        this.a = akeaVar;
    }

    @Override // defpackage.crzp
    public final void On(crzm<btlu> crzmVar) {
        btlu q = btlu.q(crzmVar.l());
        if (dbsd.a(this.a.k, q)) {
            return;
        }
        akea akeaVar = this.a;
        akeaVar.k = q;
        akeaVar.g.c(q, null);
        if (!q.l() || !this.a.w()) {
            return;
        }
        akea akeaVar2 = this.a;
        akeaVar2.i.execute(new akdz(akeaVar2, q, akeaVar2.g, akeaVar2.j));
    }
}
