package defpackage;
/* compiled from: PG */
/* renamed from: blix  reason: default package */
/* loaded from: classes3.dex */
public final class blix extends cqiw<blja> {
    public final boolean a;
    public final int b;
    public final boolean c;
    public final boolean d;

    public blix(boolean z, int i, boolean z2, boolean z3) {
        super(Boolean.valueOf(z), Integer.valueOf(i), Boolean.valueOf(z2), Boolean.valueOf(z3));
        this.a = z;
        this.b = i;
        this.c = z2;
        this.d = z3;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<blja> a() {
        return cqgr.gd(cqgr.dr(1), cqgr.cd(-1), cqgr.bp(-2), cqgr.an(new cqlc(this) { // from class: bliu
            private final blix a;

            {
                this.a = this;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                final blix blixVar = this.a;
                return dchl.k(((blja) cqkpVar).a(), new dbrn(blixVar) { // from class: bliw
                    private final blix a;

                    {
                        this.a = blixVar;
                    }

                    @Override // defpackage.dbrn
                    public final Object a(Object obj) {
                        cqiw blitVar;
                        blix blixVar2 = this.a;
                        bliy bliyVar = (bliy) obj;
                        if (bliyVar.e().booleanValue()) {
                            blitVar = new grf(bliv.a);
                        } else {
                            blitVar = new blit(blixVar2.a, blixVar2.b, blixVar2.c, blixVar2.d);
                        }
                        return cqgr.fT(blitVar, bliyVar);
                    }
                });
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }));
    }
}
