package defpackage;
/* renamed from: dzm  reason: default package */
/* loaded from: classes6.dex */
final /* synthetic */ class dzm implements cqlc {
    static final cqlc a = new dzm();

    private dzm() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        ebk ebkVar = (ebk) cqkpVar;
        cqjg cqjgVar = eac.a;
        boolean z = true;
        if (!cqjv.v(ebkVar.d()).booleanValue()) {
            jad d = ebkVar.d();
            dbsk.s(d);
            if (d.a().booleanValue()) {
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
