package defpackage;
/* renamed from: biea  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class biea implements cqlc {
    static final cqlc a = new biea();

    private biea() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bijb bijbVar = (bijb) cqkpVar;
        int i = bieb.a;
        boolean z = true;
        if (!cqjv.v(bijbVar.d()).booleanValue() && bijbVar.d().a().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
