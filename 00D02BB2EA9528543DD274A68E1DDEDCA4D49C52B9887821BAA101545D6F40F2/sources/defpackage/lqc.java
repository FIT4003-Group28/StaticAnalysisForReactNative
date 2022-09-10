package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: lqc  reason: default package */
/* loaded from: classes7.dex */
public final /* synthetic */ class lqc implements cqlc {
    static final cqlc a = new lqc();

    private lqc() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        int i = lqi.a;
        if (((lwp) cqkpVar).o().booleanValue()) {
            return atny.SHOW_IF_NO_SECONDARY_CUES_PRESENT;
        }
        return atny.SHOW_ALWAYS;
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
