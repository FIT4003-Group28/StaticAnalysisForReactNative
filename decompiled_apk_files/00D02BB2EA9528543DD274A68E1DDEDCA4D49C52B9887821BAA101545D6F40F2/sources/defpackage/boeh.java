package defpackage;
/* renamed from: boeh  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class boeh implements cqlc {
    static final cqlc a = new boeh();

    private boeh() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        boql boqlVar = (boql) cqkpVar;
        int i = bofn.a;
        boolean z = true;
        if (boqlVar.f().booleanValue() && !boqlVar.g().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}