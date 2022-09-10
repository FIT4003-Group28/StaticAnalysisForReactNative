package defpackage;
/* renamed from: cgar  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class cgar implements cqlc {
    static final cqlc a = new cgar();

    private cgar() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        cgbf cgbfVar = (cgbf) cqkpVar;
        int i = cgbe.a;
        boolean z = true;
        if (cgbfVar.l().booleanValue() && !cqjv.v(cgbfVar.m()).booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
