package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: nfd  reason: default package */
/* loaded from: classes7.dex */
public final class nfd implements crzp<jzq> {
    final /* synthetic */ nff a;

    public nfd(nff nffVar) {
        this.a = nffVar;
    }

    @Override // defpackage.crzp
    public final void On(crzm<jzq> crzmVar) {
        dbsk.s(crzmVar.l());
        for (nfz nfzVar : this.a.a.b()) {
            cqkp cqkpVar = nfzVar.a;
            if (cqkpVar instanceof nfu) {
                ((nfu) cqkpVar).a();
                cqkx.p(nfzVar.a);
            }
        }
    }
}
