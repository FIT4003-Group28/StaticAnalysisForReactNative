package defpackage;
/* renamed from: aqmw  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class aqmw implements cqlc {
    static final cqlc a = new aqmw();

    private aqmw() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        aqna aqnaVar = (aqna) cqkpVar;
        int i = aqmz.a;
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
