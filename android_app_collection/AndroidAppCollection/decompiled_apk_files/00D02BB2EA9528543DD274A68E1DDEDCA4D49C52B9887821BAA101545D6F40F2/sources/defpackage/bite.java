package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: bite  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class bite implements cqlc {
    static final cqlc a = new bite();

    private bite() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        biwo biwoVar = (biwo) cqkpVar;
        int i = bivz.a;
        boolean z = true;
        if (biwoVar.as().a().booleanValue() && !biwoVar.ar().a().booleanValue() && !biwoVar.ar().j().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
