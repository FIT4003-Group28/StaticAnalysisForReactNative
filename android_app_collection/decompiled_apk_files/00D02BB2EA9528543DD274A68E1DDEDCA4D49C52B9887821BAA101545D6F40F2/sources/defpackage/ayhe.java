package defpackage;
/* renamed from: ayhe  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class ayhe implements cqlc {
    static final cqlc a = new ayhe();

    private ayhe() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        aymp aympVar = (aymp) cqkpVar;
        int i = ayif.a;
        boolean z = true;
        if (aympVar.b().booleanValue() && aympVar.n() != null) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
