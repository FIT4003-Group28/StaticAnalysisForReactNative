package defpackage;
/* renamed from: uji  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class uji implements cqlc {
    static final cqlc a = new uji();

    private uji() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        zfr zfrVar = (zfr) cqkpVar;
        int i = ujl.a;
        boolean z = true;
        if (!cqjv.v(zfrVar.c()).booleanValue() && !cqjv.v(zfrVar.b()).booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
