package defpackage;
/* renamed from: afqv  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class afqv implements cqlc {
    static final cqlc a = new afqv();

    private afqv() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        afrk afrkVar = (afrk) cqkpVar;
        boolean z = false;
        if (((Boolean) afpz.a.a(afrkVar)).booleanValue() && !afrkVar.v().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
