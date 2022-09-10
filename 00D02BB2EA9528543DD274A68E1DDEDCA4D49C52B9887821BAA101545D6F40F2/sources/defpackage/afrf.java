package defpackage;
/* renamed from: afrf  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class afrf implements cqlc {
    static final cqlc a = new afrf();

    private afrf() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        afrk afrkVar = (afrk) cqkpVar;
        boolean z = false;
        if (((Boolean) afqv.a.a(afrkVar)).booleanValue() && !((Boolean) afre.a.a(afrkVar)).booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
