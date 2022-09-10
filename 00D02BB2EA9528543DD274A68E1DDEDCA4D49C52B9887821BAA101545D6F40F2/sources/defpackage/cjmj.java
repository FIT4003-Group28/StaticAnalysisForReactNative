package defpackage;
/* compiled from: PG */
/* renamed from: cjmj  reason: default package */
/* loaded from: classes4.dex */
final class cjmj implements crzp<Boolean> {
    final /* synthetic */ cjmn a;

    public cjmj(cjmn cjmnVar) {
        this.a = cjmnVar;
    }

    @Override // defpackage.crzp
    public final void On(crzm<Boolean> crzmVar) {
        cjmn cjmnVar = this.a;
        boolean z = cjmnVar.g.a;
        if (cjmnVar.e == z) {
            return;
        }
        if (z) {
            cjmu cjmuVar = cjmnVar.d;
            cjmnVar.k(cjmu.TRANSPARENT_BG_WHITE_ICONS);
            cjmnVar.e = true;
            cjmnVar.d = cjmuVar;
            return;
        }
        cjmnVar.e = false;
        cjmnVar.l(cjmnVar.d, true);
    }
}
