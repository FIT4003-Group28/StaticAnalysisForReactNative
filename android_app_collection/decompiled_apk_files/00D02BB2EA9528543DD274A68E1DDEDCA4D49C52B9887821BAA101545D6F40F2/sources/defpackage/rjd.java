package defpackage;
/* renamed from: rjd  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class rjd implements cqlc {
    static final cqlc a = new rjd();

    private rjd() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        rjz rjzVar = (rjz) cqkpVar;
        cqss cqssVar = rjk.a;
        boolean z = true;
        if (!rjzVar.a().booleanValue() && rjzVar.e().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
