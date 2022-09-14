package defpackage;
/* renamed from: ugd  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class ugd implements cqlc {
    static final cqlc a = new ugd();

    private ugd() {
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
