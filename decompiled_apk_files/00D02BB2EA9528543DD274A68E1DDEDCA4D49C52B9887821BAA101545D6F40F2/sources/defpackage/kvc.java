package defpackage;
/* compiled from: PG */
/* renamed from: kvc  reason: default package */
/* loaded from: classes7.dex */
final class kvc implements crzp<Boolean> {
    final /* synthetic */ kvd a;

    public kvc(kvd kvdVar) {
        this.a = kvdVar;
    }

    @Override // defpackage.crzp
    public final void On(final crzm<Boolean> crzmVar) {
        this.a.a(new dbrn(crzmVar) { // from class: kvb
            private final crzm a;

            {
                this.a = crzmVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                crzm crzmVar2 = this.a;
                ddlj ddljVar = (ddlj) obj;
                dsqp dsqpVar = (dsqp) ddljVar.cu(5);
                dsqpVar.bC(ddljVar);
                ddky ddkyVar = (ddky) dsqpVar;
                ddlh bZ = ddli.c.bZ();
                Boolean bool = (Boolean) crzmVar2.l();
                dbsk.s(bool);
                boolean booleanValue = bool.booleanValue();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                ddli ddliVar = (ddli) bZ.b;
                ddliVar.a |= 1;
                ddliVar.b = booleanValue;
                if (ddkyVar.c) {
                    ddkyVar.bF();
                    ddkyVar.c = false;
                }
                ddlj ddljVar2 = (ddlj) ddkyVar.b;
                ddli bK = bZ.bK();
                ddlj ddljVar3 = ddlj.i;
                bK.getClass();
                ddljVar2.f = bK;
                ddljVar2.a |= 16;
                return ddkyVar.bK();
            }
        });
    }
}
