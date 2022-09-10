package defpackage;
/* renamed from: cdta  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class cdta implements cqlc {
    static final cqlc a = new cdta();

    private cdta() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        oxt oxtVar = (oxt) cqkpVar;
        int i = cdti.a;
        boolean z = false;
        if (oxtVar.c() != null && oxtVar.c().length() > 0 && oxtVar.d().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
