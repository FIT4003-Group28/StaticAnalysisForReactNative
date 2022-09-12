package defpackage;
/* renamed from: yhi  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class yhi implements cqlc {
    static final cqlc a = new yhi();

    private yhi() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        yhr yhrVar = (yhr) cqkpVar;
        cqjg cqjgVar = yhm.a;
        boolean z = true;
        if (!cqjv.v(yhrVar.h()).booleanValue() && yhrVar.a().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
