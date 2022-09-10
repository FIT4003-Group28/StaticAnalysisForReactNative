package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: awyj  reason: default package */
/* loaded from: classes.dex */
public final class awyj implements awwx<dvjd> {
    static final awyj a = new awyj();

    @Override // defpackage.awwx
    public final int a(axdt axdtVar) {
        return axdtVar.aC();
    }

    @Override // defpackage.awwx
    public final int b(dkut dkutVar) {
        return dkutVar.N;
    }

    @Override // defpackage.awwx
    public final long c(axdt axdtVar, int i) {
        return ((axds) axdtVar).T.get(i).b;
    }

    @Override // defpackage.awwx
    public final dviq d(axdt axdtVar, int i) {
        dviq dviqVar = axdtVar.aD(i).d;
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
        axdsVar.bI();
        axdsVar.T.remove(i);
    }

    @Override // defpackage.awwx
    public final void f(axdr axdrVar) {
        if (axdrVar.c) {
            axdrVar.bF();
            axdrVar.c = false;
        }
        axds axdsVar = axds.ac;
        ((axds) axdrVar.b).T = axds.ck();
    }

    @Override // defpackage.awwx
    public final void g(drbi drbiVar) {
        if (drbiVar.c) {
            drbiVar.bF();
            drbiVar.c = false;
        }
        drbj drbjVar = (drbj) drbiVar.b;
        drbj drbjVar2 = drbj.Z;
        drbjVar.b |= 128;
        drbjVar.L = true;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ dqpe h(dvjd dvjdVar) {
        dqpe dqpeVar = dvjdVar.a;
        return dqpeVar == null ? dqpe.f : dqpeVar;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ dvjd i(dvix dvixVar) {
        dvjd dvjdVar = ((dviw) dvixVar).K;
        return dvjdVar == null ? dvjd.d : dvjdVar;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ dvjd j(axdt axdtVar, int i) {
        dvjd dvjdVar = axdtVar.aD(i).c;
        return dvjdVar == null ? dvjd.d : dvjdVar;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ void k(axdr axdrVar, dvjd dvjdVar, @dzsi dviq dviqVar, long j) {
        dvjd dvjdVar2 = dvjdVar;
        axeg bZ = axeh.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        axeh axehVar = (axeh) bZ.b;
        dvjdVar2.getClass();
        axehVar.c = dvjdVar2;
        int i = axehVar.a | 2;
        axehVar.a = i;
        int i2 = i | 1;
        axehVar.a = i2;
        axehVar.b = j;
        if (dviqVar != null) {
            dviqVar.getClass();
            axehVar.d = dviqVar;
            axehVar.a = i2 | 4;
        }
        axeh bK = bZ.bK();
        if (axdrVar.c) {
            axdrVar.bF();
            axdrVar.c = false;
        }
        axds axdsVar = (axds) axdrVar.b;
        axds axdsVar2 = axds.ac;
        bK.getClass();
        axdsVar.bI();
        axdsVar.T.add(0, bK);
    }

    @Override // defpackage.awwx
    public final int l(dvix dvixVar) {
        dvjd dvjdVar = ((dviw) dvixVar).K;
        if (dvjdVar == null) {
            dvjdVar = dvjd.d;
        }
        int a2 = drbt.a(dvjdVar.c);
        if (a2 == 0) {
            return 1;
        }
        return a2;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ int m(dssj dssjVar) {
        int a2 = drbt.a(((dvjd) dssjVar).c);
        if (a2 == 0) {
            return 1;
        }
        return a2;
    }
}
