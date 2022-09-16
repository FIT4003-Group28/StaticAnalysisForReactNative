package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cdqx  reason: default package */
/* loaded from: classes4.dex */
public final class cdqx {
    public static final dcqe a = dcqe.c("cdqx");
    public final Executor b;
    public final bump c;
    public final buuy d;
    private final btrm e;

    public cdqx(bump bumpVar, buuy buuyVar, Executor executor, btrm btrmVar) {
        this.c = bumpVar;
        this.d = buuyVar;
        this.b = executor;
        this.e = btrmVar;
    }

    public final void a(cdqu cdquVar) {
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
            String str = cdqeVar.a;
            dmbw dmbwVar = dmauVar.b;
            if (dmbwVar == null) {
                dmbwVar = dmbw.d;
            }
            dmbc dmbcVar = dmbwVar.b;
            if (dmbcVar == null) {
                dmbcVar = dmbc.h;
            }
            if (str.equals(dmbcVar.b)) {
                dmbw dmbwVar2 = dmauVar.b;
                if (dmbwVar2 == null) {
                    dmbwVar2 = dmbw.d;
                }
                dsqp dsqpVar2 = (dsqp) dmbwVar2.cu(5);
                dsqpVar2.bC(dmbwVar2);
                dmbv dmbvVar = (dmbv) dsqpVar2;
                if (dmbvVar.c) {
                    dmbvVar.bF();
                    dmbvVar.c = false;
                }
                dmbw dmbwVar3 = (dmbw) dmbvVar.b;
                dmbwVar3.b = null;
                dmbwVar3.a &= -2;
                dmbw bK = dmbvVar.bK();
                if (dmatVar.c) {
                    dmatVar.bF();
                    dmatVar.c = false;
                }
                dmau dmauVar2 = (dmau) dmatVar.b;
                bK.getClass();
                dmauVar2.b = bK;
                dmauVar2.a |= 1;
            } else {
                String str2 = cdqeVar.a;
                dmbw dmbwVar4 = dmauVar.b;
                if (dmbwVar4 == null) {
                    dmbwVar4 = dmbw.d;
                }
                dmbc dmbcVar2 = dmbwVar4.c;
                if (dmbcVar2 == null) {
                    dmbcVar2 = dmbc.h;
                }
                if (str2.equals(dmbcVar2.b)) {
                    dmbw dmbwVar5 = dmauVar.b;
                    if (dmbwVar5 == null) {
                        dmbwVar5 = dmbw.d;
                    }
                    dsqp dsqpVar3 = (dsqp) dmbwVar5.cu(5);
                    dsqpVar3.bC(dmbwVar5);
                    dmbv dmbvVar2 = (dmbv) dsqpVar3;
                    if (dmbvVar2.c) {
                        dmbvVar2.bF();
                        dmbvVar2.c = false;
                    }
                    dmbw dmbwVar6 = (dmbw) dmbvVar2.b;
                    dmbwVar6.c = null;
                    dmbwVar6.a &= -3;
                    dmbw bK2 = dmbvVar2.bK();
                    if (dmatVar.c) {
                        dmatVar.bF();
                        dmatVar.c = false;
                    }
                    dmau dmauVar3 = (dmau) dmatVar.b;
                    bK2.getClass();
                    dmauVar3.b = bK2;
                    dmauVar3.a |= 1;
                }
            }
            if (dmatVar.c) {
                dmatVar.bF();
                dmatVar.c = false;
            }
            dmau dmauVar4 = (dmau) dmatVar.b;
            dmauVar4.a |= 8;
            dmauVar4.e = false;
            b(dmatVar.bK(), cdquVar);
        } else {
            bvoo.h("Deleting a post requires a PlacemarkRef passed in to update.", new Object[0]);
        }
        cdqeVar.d.b();
    }

    public final void b(dmau dmauVar, cdqu cdquVar) {
        cdqe cdqeVar = (cdqe) cdquVar;
        ilo c = cdqeVar.c.c();
        if (c != null) {
            dmbq d = c.bn().d();
            dsqp dsqpVar = (dsqp) d.cu(5);
            dsqpVar.bC(d);
            dmbp dmbpVar = (dmbp) dsqpVar;
            if (dmbpVar.c) {
                dmbpVar.bF();
                dmbpVar.c = false;
            }
            dmbq dmbqVar = (dmbq) dmbpVar.b;
            dmbq dmbqVar2 = dmbq.f;
            dmauVar.getClass();
            dmbqVar.c = dmauVar;
            dmbqVar.a |= 2;
            c.bx(dmbpVar.bK());
            cdqeVar.c.d(c);
        }
        this.e.b(cdjh.e(cdqeVar.c, 2));
    }
}
