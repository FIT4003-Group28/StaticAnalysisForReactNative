package defpackage;
/* renamed from: akhv  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class akhv implements cqlc {
    static final cqlc a = new akhv();

    private akhv() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        aklc aklcVar = (aklc) cqkpVar;
        int i = akig.a;
        boolean z = true;
        if (!cqjv.v(aklcVar.a()).booleanValue() && !cqjv.v(aklcVar.c()).booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
