package defpackage;
/* renamed from: blfu  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class blfu implements cqlc {
    static final cqlc a = new blfu();

    private blfu() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        blla bllaVar = (blla) cqkpVar;
        int i = blfy.a;
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
