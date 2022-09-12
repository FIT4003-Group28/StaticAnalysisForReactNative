package defpackage;
/* renamed from: bwcl  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class bwcl implements cqlc {
    static final cqlc a = new bwcl();

    private bwcl() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bwch bwchVar = (bwch) cqkpVar;
        int i = 4;
        if (!bwchVar.d().booleanValue() && bwchVar.e().booleanValue()) {
            i = 0;
        }
        return Integer.valueOf(i);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
