package defpackage;
/* renamed from: mqp  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class mqp implements cqlc {
    static final cqlc a = new mqp();

    private mqp() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        mra mraVar = (mra) cqkpVar;
        int i = mqt.a;
        boolean z = true;
        if (!mraVar.a().booleanValue() && !mraVar.b().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
