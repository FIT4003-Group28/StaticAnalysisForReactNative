package defpackage;
/* renamed from: mqq  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class mqq implements cqlc {
    static final cqlc a = new mqq();

    private mqq() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        mra mraVar = (mra) cqkpVar;
        int i = mqt.a;
        boolean z = true;
        if (!mraVar.b().booleanValue() && !mraVar.a().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
