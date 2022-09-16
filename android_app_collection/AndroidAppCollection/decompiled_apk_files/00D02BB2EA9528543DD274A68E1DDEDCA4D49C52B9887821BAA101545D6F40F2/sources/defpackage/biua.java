package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: biua  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class biua implements cqlc {
    static final cqlc a = new biua();

    private biua() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        biwo biwoVar = (biwo) cqkpVar;
        int i = bivz.a;
        boolean z = false;
        if (biwoVar.F().booleanValue() && biwoVar.H().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
