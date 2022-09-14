package defpackage;
/* renamed from: lfr  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class lfr implements cqlc {
    static final cqlc a = new lfr();

    private lfr() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        lie lieVar = (lie) cqkpVar;
        int i = lgd.a;
        boolean z = true;
        if (!cqjv.v(lieVar.e()).booleanValue() && !cqjv.v(lieVar.d()).booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
