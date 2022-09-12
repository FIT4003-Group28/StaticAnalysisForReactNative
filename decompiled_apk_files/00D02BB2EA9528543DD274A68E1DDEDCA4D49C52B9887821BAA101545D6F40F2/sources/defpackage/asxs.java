package defpackage;
/* compiled from: PG */
/* renamed from: asxs  reason: default package */
/* loaded from: classes2.dex */
final class asxs implements dbty<aefv> {
    final /* synthetic */ asxt a;

    public asxs(asxt asxtVar) {
        this.a = asxtVar;
    }

    @Override // defpackage.dbty
    public final /* bridge */ /* synthetic */ aefv a() {
        aefv aefvVar = (aefv) this.a.d.a().c();
        int e = aszk.a.e(this.a.a.d);
        aefvVar.setMinExposurePixels(e);
        aefvVar.h(e);
        aefvVar.setNestedScrollViewId(aszk.c);
        return aefvVar;
    }
}
