package defpackage;
/* renamed from: blte  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class blte implements cqlc {
    static final cqlc a = new blte();

    private blte() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        blwp blwpVar = (blwp) cqkpVar;
        cqjg cqjgVar = bltv.a;
        boolean z = false;
        if (blwpVar.K().booleanValue() || (!blwpVar.R().booleanValue() && !blwpVar.S().booleanValue())) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
