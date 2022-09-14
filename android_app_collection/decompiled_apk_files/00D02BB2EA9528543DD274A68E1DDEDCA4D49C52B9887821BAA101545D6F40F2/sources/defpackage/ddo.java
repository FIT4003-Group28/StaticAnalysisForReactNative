package defpackage;
/* compiled from: PG */
/* renamed from: ddo  reason: default package */
/* loaded from: classes6.dex */
final class ddo implements czi {
    final /* synthetic */ ddr a;

    public ddo(ddr ddrVar) {
        this.a = ddrVar;
    }

    @Override // defpackage.czi
    public final dehn<Boolean> a(final dstv dstvVar) {
        return deew.h(this.a.d.b(), new dbrn(dstvVar) { // from class: ddm
            private final dstv a;

            {
                this.a = dstvVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                dstv dstvVar2 = this.a;
                dstv dstvVar3 = ((ddx) obj).c;
                if (dstvVar3 == null) {
                    dstvVar3 = dstv.c;
                }
                return Boolean.valueOf(dsuz.a(dsvb.d(dstvVar3, dstvVar2), dds.a) < 0);
            }
        }, this.a.e);
    }

    @Override // defpackage.czi
    public final dehn<Void> b(final dstv dstvVar) {
        return this.a.d.c(new dbrn(dstvVar) { // from class: ddn
            private final dstv a;

            {
                this.a = dstvVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                dstv dstvVar2 = this.a;
                ddx ddxVar = (ddx) obj;
                dsqp dsqpVar = (dsqp) ddxVar.cu(5);
                dsqpVar.bC(ddxVar);
                ddw ddwVar = (ddw) dsqpVar;
                if (ddwVar.c) {
                    ddwVar.bF();
                    ddwVar.c = false;
                }
                ddx ddxVar2 = (ddx) ddwVar.b;
                ddx ddxVar3 = ddx.e;
                dstvVar2.getClass();
                ddxVar2.c = dstvVar2;
                ddxVar2.a |= 2;
                return ddwVar.bK();
            }
        }, this.a.e);
    }
}
