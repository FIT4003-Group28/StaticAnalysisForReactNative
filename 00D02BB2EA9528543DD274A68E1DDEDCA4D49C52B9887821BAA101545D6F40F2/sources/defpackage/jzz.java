package defpackage;
/* compiled from: PG */
/* renamed from: jzz  reason: default package */
/* loaded from: classes7.dex */
final class jzz implements crzp<Boolean> {
    final /* synthetic */ kaf a;

    public jzz(kaf kafVar) {
        this.a = kafVar;
    }

    @Override // defpackage.crzp
    public final void On(crzm<Boolean> crzmVar) {
        Boolean l = crzmVar.l();
        dbsk.s(l);
        if (!l.booleanValue() || !this.a.k.a()) {
            return;
        }
        this.a.g.k();
    }
}
