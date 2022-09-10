package defpackage;
/* compiled from: PG */
/* renamed from: dos  reason: default package */
/* loaded from: classes6.dex */
final class dos implements czi {
    final /* synthetic */ dou a;

    public dos(dou douVar) {
        this.a = douVar;
    }

    @Override // defpackage.czi
    public final dehn<Boolean> a(final dstv dstvVar) {
        return deew.h(this.a.a.b(), new dbrn(dstvVar) { // from class: doq
            private final dstv a;

            {
                this.a = dstvVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                dstv dstvVar2 = this.a;
                dstv dstvVar3 = ((dsw) obj).c;
                if (dstvVar3 == null) {
                    dstvVar3 = dstv.c;
                }
                return Boolean.valueOf(dsuz.a(dsvb.d(dstvVar3, dstvVar2), dov.a) < 0);
            }
        }, this.a.b);
    }

    @Override // defpackage.czi
    public final dehn<Void> b(final dstv dstvVar) {
        return this.a.a.c(new dbrn(dstvVar) { // from class: dor
            private final dstv a;

            {
                this.a = dstvVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                dstv dstvVar2 = this.a;
                dsw dswVar = (dsw) obj;
                dsqp dsqpVar = (dsqp) dswVar.cu(5);
                dsqpVar.bC(dswVar);
                dsv dsvVar = (dsv) dsqpVar;
                if (dsvVar.c) {
                    dsvVar.bF();
                    dsvVar.c = false;
                }
                dsw dswVar2 = (dsw) dsvVar.b;
                dsw dswVar3 = dsw.d;
                dstvVar2.getClass();
                dswVar2.c = dstvVar2;
                dswVar2.a |= 2;
                return dsvVar.bK();
            }
        }, this.a.b);
    }
}
