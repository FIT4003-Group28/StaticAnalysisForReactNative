package defpackage;
/* renamed from: lfw  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class lfw implements cqlc {
    static final cqlc a = new lfw();

    private lfw() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        lie lieVar = (lie) cqkpVar;
        int i = lgd.a;
        boolean z = false;
        if (lieVar.g().booleanValue() && lieVar.f().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
