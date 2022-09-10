package defpackage;
/* renamed from: guc  reason: default package */
/* loaded from: classes6.dex */
final /* synthetic */ class guc implements cqlc {
    static final cqlc a = new guc();

    private guc() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        jan janVar = (jan) cqkpVar;
        int i = guh.a;
        boolean z = true;
        if (!cqjv.v(janVar.c()).booleanValue() && janVar.f().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
