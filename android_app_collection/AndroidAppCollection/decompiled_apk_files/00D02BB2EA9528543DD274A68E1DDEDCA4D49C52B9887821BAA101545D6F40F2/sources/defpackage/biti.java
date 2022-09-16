package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: biti  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class biti implements cqlc {
    static final cqlc a = new biti();

    private biti() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        biwo biwoVar = (biwo) cqkpVar;
        int i = bivz.a;
        boolean z = true;
        if (!biwoVar.C().booleanValue() && !biwoVar.ar().a().booleanValue() && !biwoVar.as().a().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
