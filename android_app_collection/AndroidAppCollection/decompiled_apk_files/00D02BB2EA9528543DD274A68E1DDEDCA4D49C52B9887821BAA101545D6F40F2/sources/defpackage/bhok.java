package defpackage;
/* renamed from: bhok  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bhok implements cqlc {
    static final cqlc a = new bhok();

    private bhok() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bhry bhryVar = (bhry) cqkpVar;
        int i = bhor.b;
        boolean z = true;
        if (!cqjv.v(bhryVar.g()).booleanValue() && !bhryVar.h().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
