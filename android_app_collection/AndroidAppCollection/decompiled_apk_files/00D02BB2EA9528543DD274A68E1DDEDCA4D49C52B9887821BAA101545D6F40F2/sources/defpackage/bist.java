package defpackage;
/* renamed from: bist  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bist implements cqlc {
    static final cqlc a = new bist();

    private bist() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        biwo biwoVar = (biwo) cqkpVar;
        int i = bivz.a;
        boolean z = false;
        if (biwoVar.aJ().booleanValue() && !biwoVar.ao().b().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
