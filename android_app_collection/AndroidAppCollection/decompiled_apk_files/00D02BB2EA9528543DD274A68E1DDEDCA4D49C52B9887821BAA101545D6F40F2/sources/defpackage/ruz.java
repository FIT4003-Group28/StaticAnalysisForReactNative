package defpackage;
/* renamed from: ruz  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class ruz implements cqlc {
    static final cqlc a = new ruz();

    private ruz() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        sbg sbgVar = (sbg) cqkpVar;
        int i = rve.a;
        boolean z = true;
        if (sbgVar.e().booleanValue() && !cqjv.v(sbgVar.c()).booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
