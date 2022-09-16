package defpackage;
/* renamed from: uzp  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class uzp implements cqlc {
    static final cqlc a = new uzp();

    private uzp() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        zfp zfpVar = (zfp) cqkpVar;
        int i = uzr.a;
        boolean z = true;
        if (!cqjv.v(zfpVar.aa()).booleanValue()) {
            izl aa = zfpVar.aa();
            dbsk.s(aa);
            if (aa.b().booleanValue()) {
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
