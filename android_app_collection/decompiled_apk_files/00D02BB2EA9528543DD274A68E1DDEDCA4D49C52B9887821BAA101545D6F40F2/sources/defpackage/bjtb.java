package defpackage;
/* renamed from: bjtb  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bjtb implements cqlc {
    static final cqlc a = new bjtb();

    private bjtb() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bjwo bjwoVar = (bjwo) cqkpVar;
        int i = bjto.b;
        boolean z = true;
        if (bjwoVar.p().booleanValue() && !cqjv.v(bjwoVar.q()).booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
