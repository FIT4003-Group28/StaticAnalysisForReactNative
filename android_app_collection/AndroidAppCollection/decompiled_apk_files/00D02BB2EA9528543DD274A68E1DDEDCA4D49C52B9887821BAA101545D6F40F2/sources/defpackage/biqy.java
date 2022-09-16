package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: biqy  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class biqy implements cqlc {
    static final cqlc a = new biqy();

    private biqy() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        biwo biwoVar = (biwo) cqkpVar;
        int i = bivz.a;
        boolean z = false;
        if (biwoVar.Z().booleanValue() && biwoVar.am().a().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
