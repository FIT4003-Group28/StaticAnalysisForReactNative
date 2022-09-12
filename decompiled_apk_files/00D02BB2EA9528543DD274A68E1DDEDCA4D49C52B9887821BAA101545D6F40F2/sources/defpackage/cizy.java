package defpackage;
/* renamed from: cizy  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class cizy implements cqlc {
    static final cqlc a = new cizy();

    private cizy() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        cjaa cjaaVar = (cjaa) cqkpVar;
        cqjg cqjgVar = cizz.a;
        boolean z = false;
        if (cjaaVar.e().booleanValue() && cjaaVar.c().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
