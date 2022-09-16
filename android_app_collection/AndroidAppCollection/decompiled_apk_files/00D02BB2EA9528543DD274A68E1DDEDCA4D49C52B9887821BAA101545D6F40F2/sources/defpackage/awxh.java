package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: awxh  reason: default package */
/* loaded from: classes.dex */
public final class awxh implements awwx<dpsj> {
    static final awxh a = new awxh();

    @Override // defpackage.awwx
    public final int a(axdt axdtVar) {
        return axdtVar.ae();
    }

    @Override // defpackage.awwx
    public final int b(dkut dkutVar) {
        return dkutVar.M;
    }

    @Override // defpackage.awwx
    public final long c(axdt axdtVar, int i) {
        return ((axds) axdtVar).H.get(i).b;
    }

    @Override // defpackage.awwx
    public final dviq d(axdt axdtVar, int i) {
        dviq dviqVar = axdtVar.af(i).d;
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
        axdsVar.bw();
        axdsVar.H.remove(i);
    }

    @Override // defpackage.awwx
    public final void f(axdr axdrVar) {
        if (axdrVar.c) {
            axdrVar.bF();
            axdrVar.c = false;
        }
        axds axdsVar = axds.ac;
        ((axds) axdrVar.b).H = axds.ck();
    }

    @Override // defpackage.awwx
    public final void g(drbi drbiVar) {
        if (drbiVar.c) {
            drbiVar.bF();
            drbiVar.c = false;
        }
        drbj drbjVar = (drbj) drbiVar.b;
        drbj drbjVar2 = drbj.Z;
        drbjVar.a |= 4096;
        drbjVar.o = true;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ dqpe h(dpsj dpsjVar) {
        dqpe dqpeVar = dpsjVar.a;
        return dqpeVar == null ? dqpe.f : dqpeVar;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ dpsj i(dvix dvixVar) {
        dpsj dpsjVar = ((dviw) dvixVar).S;
        return dpsjVar == null ? dpsj.d : dpsjVar;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ dpsj j(axdt axdtVar, int i) {
        dpsj dpsjVar = axdtVar.af(i).c;
        return dpsjVar == null ? dpsj.d : dpsjVar;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ void k(axdr axdrVar, dpsj dpsjVar, @dzsi dviq dviqVar, long j) {
        dpsj dpsjVar2 = dpsjVar;
        axcv bZ = axcw.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        axcw axcwVar = (axcw) bZ.b;
        dpsjVar2.getClass();
        axcwVar.c = dpsjVar2;
        int i = axcwVar.a | 2;
        axcwVar.a = i;
        int i2 = i | 1;
        axcwVar.a = i2;
        axcwVar.b = j;
        if (dviqVar != null) {
            dviqVar.getClass();
            axcwVar.d = dviqVar;
            axcwVar.a = i2 | 4;
        }
        axcw bK = bZ.bK();
        if (axdrVar.c) {
            axdrVar.bF();
            axdrVar.c = false;
        }
        axds axdsVar = (axds) axdrVar.b;
        axds axdsVar2 = axds.ac;
        bK.getClass();
        axdsVar.bw();
        axdsVar.H.add(0, bK);
    }

    @Override // defpackage.awwx
    public final int l(dvix dvixVar) {
        dpsj dpsjVar = ((dviw) dvixVar).S;
        if (dpsjVar == null) {
            dpsjVar = dpsj.d;
        }
        int a2 = drbt.a(dpsjVar.b);
        if (a2 == 0) {
            return 1;
        }
        return a2;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ int m(dssj dssjVar) {
        int a2 = drbt.a(((dpsj) dssjVar).b);
        if (a2 == 0) {
            return 1;
        }
        return a2;
    }
}
