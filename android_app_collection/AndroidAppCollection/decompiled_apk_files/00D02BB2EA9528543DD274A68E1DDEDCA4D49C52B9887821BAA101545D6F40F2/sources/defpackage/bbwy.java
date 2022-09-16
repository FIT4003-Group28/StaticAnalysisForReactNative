package defpackage;
/* renamed from: bbwy  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bbwy implements cqlc {
    static final cqlc a = new bbwy();

    private bbwy() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bbyg bbygVar = (bbyg) cqkpVar;
        cqjg cqjgVar = bbyf.a;
        boolean z = true;
        if (!bbygVar.u().booleanValue() && bbygVar.c().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
