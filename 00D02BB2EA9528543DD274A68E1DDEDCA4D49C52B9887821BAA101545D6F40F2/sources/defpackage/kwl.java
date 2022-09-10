package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: kwl  reason: default package */
/* loaded from: classes7.dex */
public final class kwl implements crzp<dbsg<Boolean>> {
    final /* synthetic */ kwy a;

    public kwl(kwy kwyVar) {
        this.a = kwyVar;
    }

    @Override // defpackage.crzp
    public final void On(crzm<dbsg<Boolean>> crzmVar) {
        dbsg<Boolean> l = crzmVar.l();
        dbsk.s(l);
        if (l.a()) {
            this.a.a(l.b().booleanValue());
        }
    }
}
