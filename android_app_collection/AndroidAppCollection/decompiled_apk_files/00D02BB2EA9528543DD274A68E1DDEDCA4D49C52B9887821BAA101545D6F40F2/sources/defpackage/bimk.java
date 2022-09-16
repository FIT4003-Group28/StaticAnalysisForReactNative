package defpackage;
/* renamed from: bimk  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bimk implements cqlc {
    static final cqlc a = new bimk();

    private bimk() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        final biwg biwgVar = (biwg) cqkpVar;
        int i = bina.a;
        return dchl.k(biwgVar.j(), new dbrn(biwgVar) { // from class: bimm
            private final biwg a;

            {
                this.a = biwgVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                return cqgr.fT(new bimz(this.a.l()), (biwf) obj);
            }
        });
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
