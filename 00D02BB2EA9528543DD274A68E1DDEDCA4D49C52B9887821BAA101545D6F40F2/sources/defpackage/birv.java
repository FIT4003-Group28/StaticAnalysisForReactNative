package defpackage;
/* renamed from: birv  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class birv implements cqlc {
    static final cqlc a = new birv();

    private birv() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        biwo biwoVar = (biwo) cqkpVar;
        int i = bivz.a;
        boolean z = true;
        if (biwoVar.n() != biwn.FULL_PLACE_INFO_BLOCK && biwoVar.n() != biwn.COUNTERFACTUAL) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
