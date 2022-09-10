package defpackage;
/* renamed from: ign  reason: default package */
/* loaded from: classes6.dex */
final /* synthetic */ class ign implements cqlc {
    static final cqlc a = new ign();

    private ign() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        igq igqVar = (igq) cqkpVar;
        float f = 0.5f;
        if (cqjv.v(igqVar.d()).booleanValue() && cqjv.v(igqVar.c()).booleanValue()) {
            f = 1.0f;
        }
        return Float.valueOf(f);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
