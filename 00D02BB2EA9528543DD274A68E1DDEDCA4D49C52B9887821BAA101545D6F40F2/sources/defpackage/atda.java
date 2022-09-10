package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: atda  reason: default package */
/* loaded from: classes2.dex */
public final class atda implements crzp<Boolean> {
    final /* synthetic */ atdd a;

    public atda(atdd atddVar) {
        this.a = atddVar;
    }

    @Override // defpackage.crzp
    public final void On(crzm<Boolean> crzmVar) {
        Boolean l = crzmVar.l();
        dbsk.s(l);
        ((atlo) this.a.a).a = l.booleanValue();
        S s = this.a.c;
        if (s == 0 || !((atlq) s).b()) {
            return;
        }
        this.a.u();
    }
}
