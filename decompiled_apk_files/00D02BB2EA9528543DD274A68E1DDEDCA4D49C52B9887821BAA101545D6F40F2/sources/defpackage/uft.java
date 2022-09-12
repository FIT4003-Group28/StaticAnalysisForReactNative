package defpackage;
/* renamed from: uft  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class uft implements cqlc {
    static final cqlc a = new uft();

    private uft() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        uhb uhbVar = (uhb) cqkpVar;
        int i = ugo.a;
        boolean z = false;
        if (uhbVar.m().booleanValue() && uhbVar.d().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
