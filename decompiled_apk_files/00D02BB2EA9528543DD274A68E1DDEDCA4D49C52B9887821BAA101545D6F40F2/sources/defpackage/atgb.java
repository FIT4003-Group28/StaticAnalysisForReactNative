package defpackage;
/* renamed from: atgb  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class atgb implements cqlc {
    static final cqlc a = new atgb();

    private atgb() {
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
