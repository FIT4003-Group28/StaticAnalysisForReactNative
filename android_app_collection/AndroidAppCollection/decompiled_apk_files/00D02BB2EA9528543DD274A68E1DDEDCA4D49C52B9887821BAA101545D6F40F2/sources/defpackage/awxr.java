package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: awxr  reason: default package */
/* loaded from: classes.dex */
public final class awxr implements awwx<dptu> {
    static final awxr a = new awxr();

    @Override // defpackage.awwx
    public final int a(axdt axdtVar) {
        return axdtVar.aI();
    }

    @Override // defpackage.awwx
    public final int b(dkut dkutVar) {
        return dkutVar.Q;
    }

    @Override // defpackage.awwx
    public final long c(axdt axdtVar, int i) {
        return ((axds) axdtVar).W.get(i).b;
    }

    @Override // defpackage.awwx
    public final dviq d(axdt axdtVar, int i) {
        dviq dviqVar = axdtVar.aJ(i).d;
        return dviqVar == null ? dviq.D : dviqVar;
    }

    @Override // defpackage.awwx
    public final void e(axdr axdrVar, int i) {
        if (axdrVar.c) {
            axdrVar.bF();
            axdrVar.c = false;
        }
        axds axdsVar = (axds) axdrVar.b;
        axds axdsVar2 = axds.ac;
        axdsVar.bL();
        axdsVar.W.remove(i);
    }

    @Override // defpackage.awwx
    public final void f(axdr axdrVar) {
        if (axdrVar.c) {
            axdrVar.bF();
            axdrVar.c = false;
        }
        axds axdsVar = axds.ac;
        ((axds) axdrVar.b).W = axds.ck();
    }

    @Override // defpackage.awwx
    public final void g(drbi drbiVar) {
        if (drbiVar.c) {
            drbiVar.bF();
            drbiVar.c = false;
        }
        drbj drbjVar = (drbj) drbiVar.b;
        drbj drbjVar2 = drbj.Z;
        drbjVar.a |= 2097152;
        drbjVar.v = true;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ dqpe h(dptu dptuVar) {
        dqpe dqpeVar = dptuVar.b;
        return dqpeVar == null ? dqpe.f : dqpeVar;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ dptu i(dvix dvixVar) {
        dptu dptuVar = ((dviw) dvixVar).p;
        return dptuVar == null ? dptu.m : dptuVar;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ dptu j(axdt axdtVar, int i) {
        dptu dptuVar = axdtVar.aJ(i).c;
        return dptuVar == null ? dptu.m : dptuVar;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ void k(axdr axdrVar, dptu dptuVar, @dzsi dviq dviqVar, long j) {
        dptu dptuVar2 = dptuVar;
        axdh bZ = axdi.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        axdi axdiVar = (axdi) bZ.b;
        dptuVar2.getClass();
        axdiVar.c = dptuVar2;
        int i = axdiVar.a | 2;
        axdiVar.a = i;
        int i2 = i | 1;
        axdiVar.a = i2;
        axdiVar.b = j;
        if (dviqVar != null) {
            dviqVar.getClass();
            axdiVar.d = dviqVar;
            axdiVar.a = i2 | 4;
        }
        axdi bK = bZ.bK();
        if (axdrVar.c) {
            axdrVar.bF();
            axdrVar.c = false;
        }
        axds axdsVar = (axds) axdrVar.b;
        axds axdsVar2 = axds.ac;
        bK.getClass();
        axdsVar.bL();
        axdsVar.W.add(0, bK);
    }

    @Override // defpackage.awwx
    public final int l(dvix dvixVar) {
        dptu dptuVar = ((dviw) dvixVar).p;
        if (dptuVar == null) {
            dptuVar = dptu.m;
        }
        int a2 = drbt.a(dptuVar.c);
        if (a2 == 0) {
            return 1;
        }
        return a2;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ int m(dssj dssjVar) {
        int a2 = drbt.a(((dptu) dssjVar).c);
        if (a2 == 0) {
            return 1;
        }
        return a2;
    }
}
