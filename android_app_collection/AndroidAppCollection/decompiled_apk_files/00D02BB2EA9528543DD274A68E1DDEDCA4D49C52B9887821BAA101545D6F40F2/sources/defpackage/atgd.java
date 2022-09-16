package defpackage;
/* renamed from: atgd  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class atgd implements cqlc {
    static final cqlc a = new atgd();

    private atgd() {
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
