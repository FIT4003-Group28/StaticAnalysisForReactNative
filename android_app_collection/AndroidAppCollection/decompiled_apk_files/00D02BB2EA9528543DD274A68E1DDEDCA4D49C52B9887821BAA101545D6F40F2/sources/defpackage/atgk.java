package defpackage;
/* renamed from: atgk  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class atgk implements cqlc {
    static final cqlc a = new atgk();

    private atgk() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        atna atnaVar = (atna) cqkpVar;
        int i = athe.header;
        boolean z = false;
        if (atnaVar.x().booleanValue() && atnaVar.p().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
