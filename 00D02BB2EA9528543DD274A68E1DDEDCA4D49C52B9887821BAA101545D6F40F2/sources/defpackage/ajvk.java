package defpackage;
/* renamed from: ajvk  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class ajvk implements cqlc {
    static final cqlc a = new ajvk();

    private ajvk() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        ajwa ajwaVar = (ajwa) cqkpVar;
        int i = ajwb.a;
        boolean z = false;
        if (ajwaVar.c().booleanValue() && !ajwaVar.r().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
