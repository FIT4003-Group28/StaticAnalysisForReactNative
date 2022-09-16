package defpackage;
/* renamed from: jov  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class jov implements cqlc {
    static final cqlc a = new jov();

    private jov() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        jrc jrcVar = (jrc) cqkpVar;
        int i = jpf.a;
        boolean z = true;
        if (!jrcVar.h().booleanValue() && cqjv.v(jrcVar.e()).booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
