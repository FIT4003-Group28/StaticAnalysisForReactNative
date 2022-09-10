package defpackage;
/* compiled from: PG */
/* renamed from: kzv  reason: default package */
/* loaded from: classes7.dex */
final class kzv implements crzp<Boolean> {
    final /* synthetic */ kzz a;

    public kzv(kzz kzzVar) {
        this.a = kzzVar;
    }

    @Override // defpackage.crzp
    public final void On(crzm<Boolean> crzmVar) {
        kzz kzzVar = this.a;
        Boolean l = crzmVar.l();
        dbsk.s(l);
        kzzVar.h = l.booleanValue();
        this.a.a();
    }
}
