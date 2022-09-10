package defpackage;
/* renamed from: ugf  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class ugf implements cqlc {
    static final cqlc a = new ugf();

    private ugf() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        uhb uhbVar = (uhb) cqkpVar;
        int i = ugo.a;
        boolean z = true;
        if (!uhbVar.d().booleanValue() && !uhbVar.e().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
