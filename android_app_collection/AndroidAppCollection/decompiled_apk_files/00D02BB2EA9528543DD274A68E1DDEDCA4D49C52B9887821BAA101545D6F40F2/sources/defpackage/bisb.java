package defpackage;
/* renamed from: bisb  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bisb implements cqlc {
    static final cqlc a = new bisb();

    private bisb() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        biwo biwoVar = (biwo) cqkpVar;
        int i = bivz.a;
        boolean z = true;
        if (biwoVar.aJ().booleanValue() && !biwoVar.ao().b().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
