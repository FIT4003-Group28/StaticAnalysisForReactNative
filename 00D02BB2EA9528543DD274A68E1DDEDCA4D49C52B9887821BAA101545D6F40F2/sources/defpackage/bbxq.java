package defpackage;
/* renamed from: bbxq  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bbxq implements cqlc {
    static final cqlc a = new bbxq();

    private bbxq() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bbyg bbygVar = (bbyg) cqkpVar;
        cqjg cqjgVar = bbyf.a;
        boolean z = true;
        if (!bbygVar.u().booleanValue() && bbygVar.e().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
