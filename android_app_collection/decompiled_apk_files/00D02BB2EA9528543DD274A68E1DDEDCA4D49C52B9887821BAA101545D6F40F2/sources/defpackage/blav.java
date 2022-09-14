package defpackage;
/* renamed from: blav  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class blav implements cqlc {
    static final cqlc a = new blav();

    private blav() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        blla bllaVar = (blla) cqkpVar;
        int i = blbf.a;
        boolean z = false;
        if (bllaVar.c().h().booleanValue() && !cqjv.v(bllaVar.b().h()).booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
