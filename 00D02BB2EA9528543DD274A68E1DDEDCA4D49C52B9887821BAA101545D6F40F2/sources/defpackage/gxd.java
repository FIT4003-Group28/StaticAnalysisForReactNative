package defpackage;
/* renamed from: gxd  reason: default package */
/* loaded from: classes6.dex */
final /* synthetic */ class gxd implements cqlc {
    static final cqlc a = new gxd();

    private gxd() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        iza izaVar = (iza) cqkpVar;
        int i = gxg.a;
        boolean z = true;
        if (!izaVar.e().booleanValue() && !izaVar.d().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
