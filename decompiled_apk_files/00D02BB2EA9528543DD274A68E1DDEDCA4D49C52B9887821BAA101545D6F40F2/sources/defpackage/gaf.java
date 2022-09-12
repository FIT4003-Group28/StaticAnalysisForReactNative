package defpackage;
/* renamed from: gaf  reason: default package */
/* loaded from: classes6.dex */
final /* synthetic */ class gaf implements cqlc {
    static final cqlc a = new gaf();

    private gaf() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        gbe gbeVar = (gbe) cqkpVar;
        int i = gbb.a;
        boolean z = true;
        if (!cqjv.v(gbeVar.c()).booleanValue() && !gbeVar.d()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
