package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: awxe  reason: default package */
/* loaded from: classes.dex */
public final class awxe implements awwx<dvgw> {
    static final awxe a = new awxe();

    @Override // defpackage.awwx
    public final int a(axdt axdtVar) {
        return axdtVar.w();
    }

    @Override // defpackage.awwx
    public final int b(dkut dkutVar) {
        return dkutVar.a;
    }

    @Override // defpackage.awwx
    public final long c(axdt axdtVar, int i) {
        return ((axds) axdtVar).q.get(i).b;
    }

    @Override // defpackage.awwx
    public final dviq d(axdt axdtVar, int i) {
        dviq dviqVar = axdtVar.x(i).d;
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
        axdsVar.bf();
        axdsVar.q.remove(i);
    }

    @Override // defpackage.awwx
    public final void f(axdr axdrVar) {
        if (axdrVar.c) {
            axdrVar.bF();
            axdrVar.c = false;
        }
        axds axdsVar = axds.ac;
        ((axds) axdrVar.b).q = axds.ck();
    }

    @Override // defpackage.awwx
    public final void g(drbi drbiVar) {
        if (drbiVar.c) {
            drbiVar.bF();
            drbiVar.c = false;
        }
        drbj drbjVar = (drbj) drbiVar.b;
        drbj drbjVar2 = drbj.Z;
        drbjVar.a |= 256;
        drbjVar.k = true;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ dqpe h(dvgw dvgwVar) {
        dqpe dqpeVar = dvgwVar.a;
        return dqpeVar == null ? dqpe.f : dqpeVar;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ dvgw i(dvix dvixVar) {
        dvgw dvgwVar = ((dviw) dvixVar).o;
        return dvgwVar == null ? dvgw.d : dvgwVar;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ dvgw j(axdt axdtVar, int i) {
        dvgw dvgwVar = axdtVar.x(i).c;
        return dvgwVar == null ? dvgw.d : dvgwVar;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ void k(axdr axdrVar, dvgw dvgwVar, @dzsi dviq dviqVar, long j) {
        dvgw dvgwVar2 = dvgwVar;
        axcr bZ = axcs.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        axcs axcsVar = (axcs) bZ.b;
        dvgwVar2.getClass();
        axcsVar.c = dvgwVar2;
        int i = axcsVar.a | 2;
        axcsVar.a = i;
        int i2 = i | 1;
        axcsVar.a = i2;
        axcsVar.b = j;
        if (dviqVar != null) {
            dviqVar.getClass();
            axcsVar.d = dviqVar;
            axcsVar.a = i2 | 4;
        }
        axcs bK = bZ.bK();
        if (axdrVar.c) {
            axdrVar.bF();
            axdrVar.c = false;
        }
        axds axdsVar = (axds) axdrVar.b;
        axds axdsVar2 = axds.ac;
        bK.getClass();
        axdsVar.bf();
        axdsVar.q.add(0, bK);
    }

    @Override // defpackage.awwx
    public final int l(dvix dvixVar) {
        dvgw dvgwVar = ((dviw) dvixVar).o;
        if (dvgwVar == null) {
            dvgwVar = dvgw.d;
        }
        int a2 = drbt.a(dvgwVar.c);
        if (a2 == 0) {
            return 1;
        }
        return a2;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ int m(dssj dssjVar) {
        int a2 = drbt.a(((dvgw) dssjVar).c);
        if (a2 == 0) {
            return 1;
        }
        return a2;
    }
}
