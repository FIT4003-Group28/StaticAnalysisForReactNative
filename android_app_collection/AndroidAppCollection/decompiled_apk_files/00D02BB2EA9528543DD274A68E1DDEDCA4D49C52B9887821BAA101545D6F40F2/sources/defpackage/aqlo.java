package defpackage;
/* renamed from: aqlo  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class aqlo implements cqlc {
    static final cqlc a = new aqlo();

    private aqlo() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        aqna aqnaVar = (aqna) cqkpVar;
        int i = aqlr.a;
        boolean z = true;
        if (!aqnaVar.h().booleanValue() && !aqnaVar.i().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
