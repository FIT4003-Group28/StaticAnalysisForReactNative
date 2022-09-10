package defpackage;
/* renamed from: ajbt  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class ajbt implements cqlc {
    static final cqlc a = new ajbt();

    private ajbt() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        ajbz ajbzVar = (ajbz) cqkpVar;
        cqlc<ajbz, cqss> cqlcVar = ajca.a;
        boolean z = true;
        if (!cqjv.v(ajbzVar.c()).booleanValue() && !ajbzVar.d().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
