package defpackage;
/* renamed from: afre  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class afre implements cqlc {
    static final cqlc a = new afre();

    private afre() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        afrk afrkVar = (afrk) cqkpVar;
        boolean z = false;
        if (((Boolean) afqv.a.a(afrkVar)).booleanValue() && afrkVar.y().booleanValue() && afrkVar.u().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
