package defpackage;
/* renamed from: bisa  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bisa implements cqlc {
    static final cqlc a = new bisa();

    private bisa() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        biwo biwoVar = (biwo) cqkpVar;
        int i = bivz.a;
        boolean z = true;
        if (biwoVar.aw(dqgh.POINT).booleanValue() && !biwoVar.aw(dqgh.ADDRESS).booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
