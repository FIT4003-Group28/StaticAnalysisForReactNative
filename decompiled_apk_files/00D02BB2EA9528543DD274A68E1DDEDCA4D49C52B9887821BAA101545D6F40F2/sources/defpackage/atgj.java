package defpackage;
/* renamed from: atgj  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class atgj implements cqlc {
    static final cqlc a = new atgj();

    private atgj() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        float floatValue;
        atna atnaVar = (atna) cqkpVar;
        if (atnaVar.ak().booleanValue()) {
            floatValue = 1.0f;
        } else {
            atnj w = atnaVar.w();
            dbsk.s(w);
            floatValue = w.e().floatValue();
        }
        return Float.valueOf(floatValue);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
