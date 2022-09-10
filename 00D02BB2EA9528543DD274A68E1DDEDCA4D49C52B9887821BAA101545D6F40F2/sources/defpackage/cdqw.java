package defpackage;
/* compiled from: PG */
/* renamed from: cdqw  reason: default package */
/* loaded from: classes4.dex */
final class cdqw implements btzi<dinq, dins> {
    final /* synthetic */ cdqx a;
    private final cdqu b;

    public cdqw(cdqx cdqxVar, cdqu cdquVar) {
        this.a = cdqxVar;
        this.b = cdquVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dinq> btzrVar, btzy btzyVar) {
        this.a.a(this.b);
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dinq> btzrVar, dins dinsVar) {
        dins dinsVar2 = dinsVar;
        cdqx cdqxVar = this.a;
        cdqu cdquVar = this.b;
        cdqe cdqeVar = (cdqe) cdquVar;
        ilo c = cdqeVar.c.c();
        if (c != null) {
            dmau dmauVar = c.bn().d().c;
            if (dmauVar == null) {
                dmauVar = dmau.f;
            }
            dsqp dsqpVar = (dsqp) dmauVar.cu(5);
            dsqpVar.bC(dmauVar);
            dmat dmatVar = (dmat) dsqpVar;
            boolean z = true;
            if (dinsVar2.b.size() == 0) {
                if (dmatVar.c) {
                    dmatVar.bF();
                    dmatVar.c = false;
                }
                dmau dmauVar2 = (dmau) dmatVar.b;
                dmauVar2.b = null;
                dmauVar2.a &= -2;
            } else {
                dmbw dmbwVar = dinsVar2.b.get(0);
                if (dmatVar.c) {
                    dmatVar.bF();
                    dmatVar.c = false;
                }
                dmau dmauVar3 = (dmau) dmatVar.b;
                dmbwVar.getClass();
                dmauVar3.b = dmbwVar;
                dmauVar3.a |= 1;
            }
            dmau dmauVar4 = (dmau) dmatVar.b;
            dmauVar4.a |= 8;
            dmauVar4.e = true;
            if (dinsVar2.b.size() <= 1) {
                z = false;
            }
            if (dmatVar.c) {
                dmatVar.bF();
                dmatVar.c = false;
            }
            dmau dmauVar5 = (dmau) dmatVar.b;
            dmauVar5.a |= 2;
            dmauVar5.c = z;
            cdqxVar.b(dmatVar.bK(), cdquVar);
        } else {
            bvoo.h("Deleting a post requires a PlacemarkRef passed in to update.", new Object[0]);
        }
        cdqeVar.d.b();
    }
}
