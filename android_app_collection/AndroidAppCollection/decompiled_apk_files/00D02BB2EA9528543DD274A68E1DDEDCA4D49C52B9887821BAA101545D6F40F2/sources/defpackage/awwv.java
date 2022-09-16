package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: awwv  reason: default package */
/* loaded from: classes.dex */
public final class awwv implements awwx<dvit> {
    static final awwv a = new awwv();

    @Override // defpackage.awwx
    public final int a(axdt axdtVar) {
        return axdtVar.ay();
    }

    @Override // defpackage.awwx
    public final int b(dkut dkutVar) {
        return dkutVar.I;
    }

    @Override // defpackage.awwx
    public final long c(axdt axdtVar, int i) {
        return ((axds) axdtVar).R.get(i).b;
    }

    @Override // defpackage.awwx
    public final dviq d(axdt axdtVar, int i) {
        dviq dviqVar = axdtVar.az(i).d;
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
        axdsVar.bG();
        axdsVar.R.remove(i);
    }

    @Override // defpackage.awwx
    public final void f(axdr axdrVar) {
        if (axdrVar.c) {
            axdrVar.bF();
            axdrVar.c = false;
        }
        axds axdsVar = axds.ac;
        ((axds) axdrVar.b).R = axds.ck();
    }

    @Override // defpackage.awwx
    public final void g(drbi drbiVar) {
        if (drbiVar.c) {
            drbiVar.bF();
            drbiVar.c = false;
        }
        drbj drbjVar = (drbj) drbiVar.b;
        drbj drbjVar2 = drbj.Z;
        drbjVar.a |= 2;
        drbjVar.d = true;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ dqpe h(dvit dvitVar) {
        dqpe dqpeVar = dvitVar.b;
        return dqpeVar == null ? dqpe.f : dqpeVar;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ dvit i(dvix dvixVar) {
        dvit dvitVar = ((dviw) dvixVar).Q;
        return dvitVar == null ? dvit.e : dvitVar;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ dvit j(axdt axdtVar, int i) {
        dvit dvitVar = axdtVar.az(i).c;
        return dvitVar == null ? dvit.e : dvitVar;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ void k(axdr axdrVar, dvit dvitVar, @dzsi dviq dviqVar, long j) {
        dvit dvitVar2 = dvitVar;
        axdu bZ = axdv.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        axdv axdvVar = (axdv) bZ.b;
        dvitVar2.getClass();
        axdvVar.c = dvitVar2;
        int i = axdvVar.a | 2;
        axdvVar.a = i;
        int i2 = i | 1;
        axdvVar.a = i2;
        axdvVar.b = j;
        if (dviqVar != null) {
            dviqVar.getClass();
            axdvVar.d = dviqVar;
            axdvVar.a = i2 | 4;
        }
        axdv bK = bZ.bK();
        if (axdrVar.c) {
            axdrVar.bF();
            axdrVar.c = false;
        }
        axds axdsVar = (axds) axdrVar.b;
        axds axdsVar2 = axds.ac;
        bK.getClass();
        axdsVar.bG();
        axdsVar.R.add(0, bK);
    }

    @Override // defpackage.awwx
    public final int l(dvix dvixVar) {
        dvit dvitVar = ((dviw) dvixVar).Q;
        if (dvitVar == null) {
            dvitVar = dvit.e;
        }
        int a2 = drbt.a(dvitVar.d);
        if (a2 == 0) {
            return 1;
        }
        return a2;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ int m(dssj dssjVar) {
        int a2 = drbt.a(((dvit) dssjVar).d);
        if (a2 == 0) {
            return 1;
        }
        return a2;
    }
}
