package defpackage;
/* renamed from: blba  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class blba implements cqlc {
    static final cqlc a = new blba();

    private blba() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        blla bllaVar = (blla) cqkpVar;
        int i = blbf.a;
        boolean z = false;
        if (bllaVar.h().booleanValue() && !cqjv.v(bllaVar.i()).booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
