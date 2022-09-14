package defpackage;
/* renamed from: boec  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class boec implements cqlc {
    static final cqlc a = new boec();

    private boec() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        boql boqlVar = (boql) cqkpVar;
        int i = bofn.a;
        boolean z = false;
        if (!boqlVar.g().booleanValue() && !boqlVar.p().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
