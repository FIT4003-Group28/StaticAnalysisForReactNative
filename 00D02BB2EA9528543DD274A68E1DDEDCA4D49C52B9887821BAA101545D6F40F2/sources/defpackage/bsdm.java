package defpackage;
/* renamed from: bsdm  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class bsdm implements cqlc {
    static final cqlc a = new bsdm();

    private bsdm() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        jae jaeVar = (jae) cqkpVar;
        int i = bsdr.a;
        boolean z = false;
        if (cqjv.v(jaeVar.h()).booleanValue() && cqjv.v(jaeVar.c()).booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
