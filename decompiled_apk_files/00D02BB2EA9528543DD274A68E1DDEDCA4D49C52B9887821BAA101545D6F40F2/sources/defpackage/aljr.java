package defpackage;
/* compiled from: PG */
/* renamed from: aljr  reason: default package */
/* loaded from: classes.dex */
public final class aljr implements aksn {
    private final aljp b;
    private static final aljq c = new aljq(dmrt.k);
    private static final dcqe a = dcqe.c("aljr");

    public aljr(aljp aljpVar) {
        this.b = aljpVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dmrt c(dmrt dmrtVar) {
        dsqp dsqpVar = (dsqp) dmrtVar.cu(5);
        dsqpVar.bC(dmrtVar);
        dmrs dmrsVar = (dmrs) dsqpVar;
        dmot dmotVar = dmrtVar.c;
        if (dmotVar == null) {
            dmotVar = dmot.f;
        }
        if ((dmotVar.a & 2) != 0 && (dmrtVar.a & 16) == 0) {
            dndz dndzVar = dmrtVar.f;
            if (dndzVar == null) {
                dndzVar = dndz.e;
            }
            dsqp dsqpVar2 = (dsqp) dndzVar.cu(5);
            dsqpVar2.bC(dndzVar);
            dndy dndyVar = (dndy) dsqpVar2;
            if ((((dndz) dndyVar.b).a & 1) == 0) {
                if (dndyVar.c) {
                    dndyVar.bF();
                    dndyVar.c = false;
                }
                dndz dndzVar2 = (dndz) dndyVar.b;
                dndzVar2.a |= 1;
                dndzVar2.b = 56846;
            }
            dmot dmotVar2 = dmrtVar.c;
            if (dmotVar2 == null) {
                dmotVar2 = dmot.f;
            }
            d(dndyVar, dmotVar2.b);
            dndz bK = dndyVar.bK();
            if (dmrsVar.c) {
                dmrsVar.bF();
                dmrsVar.c = false;
            }
            dmrt dmrtVar2 = (dmrt) dmrsVar.b;
            bK.getClass();
            dmrtVar2.f = bK;
            dmrtVar2.a |= 16;
        }
        dmot dmotVar3 = dmrtVar.c;
        if (dmotVar3 == null) {
            dmotVar3 = dmot.f;
        }
        if ((dmotVar3.a & 4) != 0 && (dmrtVar.a & 32) == 0) {
            dndz dndzVar3 = dmrtVar.g;
            if (dndzVar3 == null) {
                dndzVar3 = dndz.e;
            }
            dsqp dsqpVar3 = (dsqp) dndzVar3.cu(5);
            dsqpVar3.bC(dndzVar3);
            dndy dndyVar2 = (dndy) dsqpVar3;
            if ((((dndz) dndyVar2.b).a & 1) == 0) {
                if (dndyVar2.c) {
                    dndyVar2.bF();
                    dndyVar2.c = false;
                }
                dndz dndzVar4 = (dndz) dndyVar2.b;
                dndzVar4.a |= 1;
                dndzVar4.b = 68109;
            }
            dmot dmotVar4 = dmrtVar.c;
            if (dmotVar4 == null) {
                dmotVar4 = dmot.f;
            }
            d(dndyVar2, dmotVar4.b);
            dndz bK2 = dndyVar2.bK();
            if (dmrsVar.c) {
                dmrsVar.bF();
                dmrsVar.c = false;
            }
            dmrt dmrtVar3 = (dmrt) dmrsVar.b;
            bK2.getClass();
            dmrtVar3.g = bK2;
            dmrtVar3.a |= 32;
        }
        return (dmrt) dmrsVar.bK();
    }

    private static void d(dndy dndyVar, int i) {
        int a2 = drsw.a(i);
        if (a2 != 0) {
            dneb dnebVar = ((dndz) dndyVar.b).c;
            if (dnebVar == null) {
                dnebVar = dneb.f;
            }
            if ((dnebVar.a & 1) != 0) {
                return;
            }
            dneb dnebVar2 = ((dndz) dndyVar.b).c;
            if (dnebVar2 == null) {
                dnebVar2 = dneb.f;
            }
            dsqp dsqpVar = (dsqp) dnebVar2.cu(5);
            dsqpVar.bC(dnebVar2);
            dnea dneaVar = (dnea) dsqpVar;
            if (dneaVar.c) {
                dneaVar.bF();
                dneaVar.c = false;
            }
            dneb dnebVar3 = (dneb) dneaVar.b;
            dnebVar3.b = a2 - 1;
            dnebVar3.a |= 1;
            if (dndyVar.c) {
                dndyVar.bF();
                dndyVar.c = false;
            }
            dndz dndzVar = (dndz) dndyVar.b;
            dneb bK = dneaVar.bK();
            bK.getClass();
            dndzVar.c = bK;
            dndzVar.a |= 2;
        }
    }

    @Override // defpackage.aksn
    public final aljq a(dmrt dmrtVar) {
        dmot dmotVar = dmrtVar.c;
        if (dmotVar == null) {
            dmotVar = dmot.f;
        }
        if ((dmotVar.a & 2) != 0) {
            dmot dmotVar2 = dmrtVar.c;
            if (dmotVar2 == null) {
                dmotVar2 = dmot.f;
            }
            dmov dmovVar = dmotVar2.c;
            if (dmovVar == null) {
                dmovVar = dmov.d;
            }
            for (dmpd dmpdVar : dmovVar.b) {
                if ((dmpdVar.a & 8) == 0) {
                    Object[] objArr = new Object[1];
                    dmot dmotVar3 = dmrtVar.c;
                    if (dmotVar3 == null) {
                        dmotVar3 = dmot.f;
                    }
                    objArr[0] = Integer.valueOf(dmotVar3.b);
                    bvoo.h("A banned RenderOpAnnotation was client-injected. It will not be rendered. use_case=%s", objArr);
                    return c;
                }
            }
        }
        dmrt c2 = c(dmrtVar);
        aljq aljqVar = new aljq(c2);
        this.b.u(c2);
        return aljqVar;
    }

    @Override // defpackage.aksn
    public final void b(aljq aljqVar) {
        this.b.v(aljqVar.a);
    }
}
