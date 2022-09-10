package defpackage;
/* renamed from: adqq  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class adqq implements cqlc {
    static final cqlc a = new adqq();

    private adqq() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        advm advmVar = (advm) cqkpVar;
        int i = adqx.b;
        boolean z = true;
        if (cqjv.v(advmVar.c()).booleanValue() && !cqjv.v(advmVar.a()).booleanValue() && !cqjv.v(advmVar.b()).booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
