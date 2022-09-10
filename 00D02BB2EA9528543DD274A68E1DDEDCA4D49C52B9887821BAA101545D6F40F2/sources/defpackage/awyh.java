package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: awyh  reason: default package */
/* loaded from: classes.dex */
public final class awyh implements awwx<dvjb> {
    static final awyh a = new awyh();

    @Override // defpackage.awwx
    public final int a(axdt axdtVar) {
        return axdtVar.au();
    }

    @Override // defpackage.awwx
    public final int b(dkut dkutVar) {
        return dkutVar.G;
    }

    @Override // defpackage.awwx
    public final long c(axdt axdtVar, int i) {
        return ((axds) axdtVar).P.get(i).b;
    }

    @Override // defpackage.awwx
    public final dviq d(axdt axdtVar, int i) {
        dviq dviqVar = axdtVar.av(i).d;
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
        axdsVar.bE();
        axdsVar.P.remove(i);
    }

    @Override // defpackage.awwx
    public final void f(axdr axdrVar) {
        if (axdrVar.c) {
            axdrVar.bF();
            axdrVar.c = false;
        }
        axds axdsVar = axds.ac;
        ((axds) axdrVar.b).P = axds.ck();
    }

    @Override // defpackage.awwx
    public final void g(drbi drbiVar) {
        if (drbiVar.c) {
            drbiVar.bF();
            drbiVar.c = false;
        }
        drbj drbjVar = (drbj) drbiVar.b;
        drbj drbjVar2 = drbj.Z;
        drbjVar.b |= 32;
        drbjVar.J = true;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ dqpe h(dvjb dvjbVar) {
        dqpe dqpeVar = dvjbVar.a;
        return dqpeVar == null ? dqpe.f : dqpeVar;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ dvjb i(dvix dvixVar) {
        dvjb dvjbVar = ((dviw) dvixVar).O;
        return dvjbVar == null ? dvjb.d : dvjbVar;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ dvjb j(axdt axdtVar, int i) {
        dvjb dvjbVar = axdtVar.av(i).c;
        return dvjbVar == null ? dvjb.d : dvjbVar;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ void k(axdr axdrVar, dvjb dvjbVar, @dzsi dviq dviqVar, long j) {
        dvjb dvjbVar2 = dvjbVar;
        axec bZ = axed.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        axed axedVar = (axed) bZ.b;
        dvjbVar2.getClass();
        axedVar.c = dvjbVar2;
        int i = axedVar.a | 2;
        axedVar.a = i;
        int i2 = i | 1;
        axedVar.a = i2;
        axedVar.b = j;
        if (dviqVar != null) {
            dviqVar.getClass();
            axedVar.d = dviqVar;
            axedVar.a = i2 | 4;
        }
        axed bK = bZ.bK();
        if (axdrVar.c) {
            axdrVar.bF();
            axdrVar.c = false;
        }
        axds axdsVar = (axds) axdrVar.b;
        axds axdsVar2 = axds.ac;
        bK.getClass();
        axdsVar.bE();
        axdsVar.P.add(0, bK);
    }

    @Override // defpackage.awwx
    public final int l(dvix dvixVar) {
        dvjb dvjbVar = ((dviw) dvixVar).O;
        if (dvjbVar == null) {
            dvjbVar = dvjb.d;
        }
        int a2 = drbt.a(dvjbVar.b);
        if (a2 == 0) {
            return 1;
        }
        return a2;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ int m(dssj dssjVar) {
        int a2 = drbt.a(((dvjb) dssjVar).b);
        if (a2 == 0) {
            return 1;
        }
        return a2;
    }
}
