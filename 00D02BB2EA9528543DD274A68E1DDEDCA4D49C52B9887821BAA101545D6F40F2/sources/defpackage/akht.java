package defpackage;
/* renamed from: akht  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class akht implements cqlc {
    static final cqlc a = new akht();

    private akht() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        aklc aklcVar = (aklc) cqkpVar;
        int i = akig.a;
        boolean z = false;
        if (cqjv.v(aklcVar.b()).booleanValue() && cqjv.v(aklcVar.a()).booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
