package defpackage;
/* renamed from: gzc  reason: default package */
/* loaded from: classes6.dex */
final /* synthetic */ class gzc implements cqlc {
    static final cqlc a = new gzc();

    private gzc() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        izl izlVar = (izl) cqkpVar;
        int i = gzk.a;
        boolean z = true;
        if (!izlVar.y().booleanValue() && !izlVar.c().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
