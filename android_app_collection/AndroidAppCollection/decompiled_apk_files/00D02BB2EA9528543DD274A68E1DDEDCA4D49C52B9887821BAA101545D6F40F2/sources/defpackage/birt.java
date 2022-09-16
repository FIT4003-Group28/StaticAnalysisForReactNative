package defpackage;
/* renamed from: birt  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class birt implements cqlc {
    static final cqlc a = new birt();

    private birt() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        biwo biwoVar = (biwo) cqkpVar;
        int i = bivz.a;
        boolean z = true;
        if (biwoVar.n() != biwn.NO_PHONE && biwoVar.n() != biwn.NO_PHONE_AND_SUGGEST_EDIT) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
