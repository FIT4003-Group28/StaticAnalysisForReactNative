package defpackage;
/* renamed from: blau  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class blau implements cqlc {
    static final cqlc a = new blau();

    private blau() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        blla bllaVar = (blla) cqkpVar;
        boolean z = true;
        if (!((Boolean) blav.a.a(bllaVar)).booleanValue() && !bllaVar.d().b().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
