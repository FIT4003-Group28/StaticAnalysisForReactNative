package defpackage;
/* renamed from: cjln  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class cjln implements cqlc {
    static final cqlc a = new cjln();

    private cjln() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        cjme cjmeVar = (cjme) cqkpVar;
        int i = cjmd.a;
        boolean z = false;
        if (cqjv.v(cjmeVar.b()).booleanValue() && cqjv.v(cjmeVar.e()).booleanValue() && cqjv.v(cjmeVar.d()).booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
