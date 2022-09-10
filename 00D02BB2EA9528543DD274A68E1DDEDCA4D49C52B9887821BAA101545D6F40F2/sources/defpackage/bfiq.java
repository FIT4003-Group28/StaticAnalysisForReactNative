package defpackage;
/* renamed from: bfiq  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bfiq implements cqlc {
    static final cqlc a = new bfiq();

    private bfiq() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bfkk bfkkVar = (bfkk) cqkpVar;
        cqjg cqjgVar = bfix.a;
        boolean z = false;
        if (bfkkVar.b().booleanValue() && bfkkVar.B().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
