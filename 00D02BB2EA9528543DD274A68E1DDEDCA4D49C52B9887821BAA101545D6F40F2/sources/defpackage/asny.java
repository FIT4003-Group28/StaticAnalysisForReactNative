package defpackage;
/* renamed from: asny  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class asny implements cqlc {
    static final cqlc a = new asny();

    private asny() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        asur asurVar = (asur) cqkpVar;
        int i = asob.a;
        boolean z = true;
        if (!asurVar.d().booleanValue() && !asurVar.e().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
