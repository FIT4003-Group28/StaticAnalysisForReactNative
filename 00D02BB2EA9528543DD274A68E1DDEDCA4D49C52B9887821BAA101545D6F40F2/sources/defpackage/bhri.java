package defpackage;
/* renamed from: bhri  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bhri implements cqlc {
    static final cqlc a = new bhri();

    private bhri() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bhry bhryVar = (bhry) cqkpVar;
        int i = bhrp.a;
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
