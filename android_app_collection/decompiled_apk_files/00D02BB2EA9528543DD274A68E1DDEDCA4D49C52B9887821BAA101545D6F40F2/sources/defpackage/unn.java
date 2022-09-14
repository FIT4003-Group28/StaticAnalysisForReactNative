package defpackage;
/* renamed from: unn  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class unn implements cqlc {
    static final cqlc a = new unn();

    private unn() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        final unu unuVar = new unu();
        return dchl.k(((zbf) cqkpVar).c(), new dbrn(unuVar) { // from class: uns
            private final unu a;

            {
                this.a = unuVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                return cqgr.fT(this.a, new unw((CharSequence) obj));
            }
        });
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
