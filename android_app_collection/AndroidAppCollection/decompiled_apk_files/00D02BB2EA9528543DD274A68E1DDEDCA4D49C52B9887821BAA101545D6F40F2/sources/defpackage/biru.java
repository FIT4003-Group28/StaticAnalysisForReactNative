package defpackage;
/* renamed from: biru  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class biru implements cqlc {
    static final cqlc a = new biru();

    private biru() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        biwo biwoVar = (biwo) cqkpVar;
        int i = bivz.a;
        boolean z = true;
        if (biwoVar.n() != biwn.NO_SUGGEST_EDIT && biwoVar.n() != biwn.NO_PHONE_AND_SUGGEST_EDIT) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
