package defpackage;
/* renamed from: aatt  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class aatt implements cqlc {
    static final cqlc a = new aatt();

    private aatt() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        aawt aawtVar = (aawt) cqkpVar;
        int i = aaua.a;
        boolean z = true;
        if (!aawtVar.b().c().booleanValue() && cqjv.v(aawtVar.d()).booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
