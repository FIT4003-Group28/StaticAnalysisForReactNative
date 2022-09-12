package defpackage;
/* compiled from: PG */
/* renamed from: cjmi  reason: default package */
/* loaded from: classes4.dex */
final class cjmi implements crzp<Boolean> {
    final /* synthetic */ cjmn a;

    public cjmi(cjmn cjmnVar) {
        this.a = cjmnVar;
    }

    @Override // defpackage.crzp
    public final void On(crzm<Boolean> crzmVar) {
        cjmn cjmnVar = this.a;
        if (cjmnVar.d == null || !cjmnVar.i.a().a()) {
            return;
        }
        cjmnVar.l(cjmnVar.d, true);
    }
}
