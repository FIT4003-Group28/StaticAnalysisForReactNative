package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: awyr  reason: default package */
/* loaded from: classes.dex */
public final class awyr implements awwx<dviz> {
    static final awyr a = new awyr();

    @Override // defpackage.awwx
    public final int a(axdt axdtVar) {
        return axdtVar.aw();
    }

    @Override // defpackage.awwx
    public final int b(dkut dkutVar) {
        return dkutVar.H;
    }

    @Override // defpackage.awwx
    public final long c(axdt axdtVar, int i) {
        return ((axds) axdtVar).Q.get(i).b;
    }

    @Override // defpackage.awwx
    public final dviq d(axdt axdtVar, int i) {
        dviq dviqVar = axdtVar.ax(i).d;
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
        axdsVar.bF();
        axdsVar.Q.remove(i);
    }

    @Override // defpackage.awwx
    public final void f(axdr axdrVar) {
        if (axdrVar.c) {
            axdrVar.bF();
            axdrVar.c = false;
        }
        axds axdsVar = axds.ac;
        ((axds) axdrVar.b).Q = axds.ck();
    }

    @Override // defpackage.awwx
    public final void g(drbi drbiVar) {
        if (drbiVar.c) {
            drbiVar.bF();
            drbiVar.c = false;
        }
        drbj drbjVar = (drbj) drbiVar.b;
        drbj drbjVar2 = drbj.Z;
        drbjVar.b |= 131072;
        drbjVar.S = true;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ dqpe h(dviz dvizVar) {
        dqpe dqpeVar = dvizVar.c;
        return dqpeVar == null ? dqpe.f : dqpeVar;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ dviz i(dvix dvixVar) {
        dviz dvizVar = ((dviw) dvixVar).u;
        return dvizVar == null ? dviz.f : dvizVar;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ dviz j(axdt axdtVar, int i) {
        dviz dvizVar = axdtVar.ax(i).c;
        return dvizVar == null ? dviz.f : dvizVar;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ void k(axdr axdrVar, dviz dvizVar, @dzsi dviq dviqVar, long j) {
        dviz dvizVar2 = dvizVar;
        axdy bZ = axdz.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        axdz axdzVar = (axdz) bZ.b;
        dvizVar2.getClass();
        axdzVar.c = dvizVar2;
        int i = axdzVar.a | 2;
        axdzVar.a = i;
        int i2 = i | 1;
        axdzVar.a = i2;
        axdzVar.b = j;
        if (dviqVar != null) {
            dviqVar.getClass();
            axdzVar.d = dviqVar;
            axdzVar.a = i2 | 4;
        }
        axdz bK = bZ.bK();
        if (axdrVar.c) {
            axdrVar.bF();
            axdrVar.c = false;
        }
        axds axdsVar = (axds) axdrVar.b;
        axds axdsVar2 = axds.ac;
        bK.getClass();
        axdsVar.bF();
        axdsVar.Q.add(0, bK);
    }

    @Override // defpackage.awwx
    public final int l(dvix dvixVar) {
        dviz dvizVar = ((dviw) dvixVar).u;
        if (dvizVar == null) {
            dvizVar = dviz.f;
        }
        int a2 = drbt.a(dvizVar.e);
        if (a2 == 0) {
            return 1;
        }
        return a2;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ int m(dssj dssjVar) {
        int a2 = drbt.a(((dviz) dssjVar).e);
        if (a2 == 0) {
            return 1;
        }
        return a2;
    }
}