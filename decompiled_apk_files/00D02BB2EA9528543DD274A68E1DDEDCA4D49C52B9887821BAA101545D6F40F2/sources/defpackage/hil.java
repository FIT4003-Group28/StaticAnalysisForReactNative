package defpackage;
/* renamed from: hil  reason: default package */
/* loaded from: classes6.dex */
final /* synthetic */ class hil implements cqlc {
    static final cqlc a = new hil();

    private hil() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        oxt oxtVar = (oxt) cqkpVar;
        boolean z = false;
        if (hjo.e(oxtVar) && !oxtVar.d().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
