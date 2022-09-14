package defpackage;
/* renamed from: bhuu  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bhuu implements cqlc {
    static final cqlc a = new bhuu();

    private bhuu() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bhwx bhwxVar = (bhwx) cqkpVar;
        cqjg cqjgVar = bhwd.a;
        boolean z = true;
        if (!bhwxVar.r().booleanValue() && bhwxVar.o().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
