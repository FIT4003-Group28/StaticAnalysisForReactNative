package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: biqz  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class biqz implements cqlc {
    static final cqlc a = new biqz();

    private biqz() {
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
