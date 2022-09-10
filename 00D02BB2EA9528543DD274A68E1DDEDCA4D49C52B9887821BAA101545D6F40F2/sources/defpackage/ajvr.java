package defpackage;
/* renamed from: ajvr  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class ajvr implements cqlc {
    static final cqlc a = new ajvr();

    private ajvr() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        ajwa ajwaVar = (ajwa) cqkpVar;
        int i = ajwb.a;
        boolean z = false;
        if (!ajwaVar.c().booleanValue() && !ajwaVar.r().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
