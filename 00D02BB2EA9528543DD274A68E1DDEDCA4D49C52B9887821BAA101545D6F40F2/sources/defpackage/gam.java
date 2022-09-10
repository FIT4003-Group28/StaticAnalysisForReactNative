package defpackage;
/* renamed from: gam  reason: default package */
/* loaded from: classes6.dex */
final /* synthetic */ class gam implements cqlc {
    static final cqlc a = new gam();

    private gam() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        gbe gbeVar = (gbe) cqkpVar;
        int i = gbb.a;
        boolean z = true;
        if (!gbeVar.p() && !gbeVar.q() && !gbeVar.r()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
