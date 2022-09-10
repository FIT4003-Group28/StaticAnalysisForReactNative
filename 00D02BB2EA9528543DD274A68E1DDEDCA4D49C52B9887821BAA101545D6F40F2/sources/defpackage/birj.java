package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: birj  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class birj implements cqlc {
    static final cqlc a = new birj();

    private birj() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        biwo biwoVar = (biwo) cqkpVar;
        int i = bivz.a;
        boolean z = true;
        if (!cqjv.v(biwoVar.K()).booleanValue() && !biwoVar.F().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
