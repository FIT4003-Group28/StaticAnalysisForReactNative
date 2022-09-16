package defpackage;
/* renamed from: bjpu  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bjpu implements cqlc {
    static final cqlc a = new bjpu();

    private bjpu() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bjpx bjpxVar = (bjpx) cqkpVar;
        int i = bjpw.c;
        boolean z = true;
        if (bjpxVar.o() && !bjpxVar.p()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
