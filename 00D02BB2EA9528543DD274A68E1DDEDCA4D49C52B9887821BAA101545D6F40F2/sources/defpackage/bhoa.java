package defpackage;
/* renamed from: bhoa  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bhoa implements cqlc {
    static final cqlc a = new bhoa();

    private bhoa() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bhry bhryVar = (bhry) cqkpVar;
        int i = bhoh.a;
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
