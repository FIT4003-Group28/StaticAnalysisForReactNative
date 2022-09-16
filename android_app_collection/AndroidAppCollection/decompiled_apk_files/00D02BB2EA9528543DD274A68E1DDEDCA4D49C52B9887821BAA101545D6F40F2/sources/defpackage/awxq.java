package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: awxq  reason: default package */
/* loaded from: classes3.dex */
public final class awxq implements awwx<dviz> {
    static final awxq a = new awxq();

    @Override // defpackage.awwx
    public final int a(axdt axdtVar) {
        return axdtVar.aM();
    }

    @Override // defpackage.awwx
    public final int b(dkut dkutVar) {
        return dkutVar.T;
    }

    @Override // defpackage.awwx
    public final long c(axdt axdtVar, int i) {
        return ((axds) axdtVar).Y.get(i).b;
    }

    @Override // defpackage.awwx
    public final dviq d(axdt axdtVar, int i) {
        dviq dviqVar = axdtVar.aN(i).d;
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
        axdsVar.bN();
        axdsVar.Y.remove(i);
    }

    @Override // defpackage.awwx
    public final void f(axdr axdrVar) {
        if (axdrVar.c) {
            axdrVar.bF();
            axdrVar.c = false;
        }
        axds axdsVar = axds.ac;
        ((axds) axdrVar.b).Y = axds.ck();
    }

    @Override // defpackage.awwx
    public final void g(drbi drbiVar) {
        if (drbiVar.c) {
            drbiVar.bF();
            drbiVar.c = false;
        }
        drbj drbjVar = (drbj) drbiVar.b;
        drbj drbjVar2 = drbj.Z;
        drbjVar.b |= 512;
        drbjVar.M = true;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ dqpe h(dviz dvizVar) {
        dqpe dqpeVar = dvizVar.c;
        return dqpeVar == null ? dqpe.f : dqpeVar;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ dviz i(dvix dvixVar) {
        dviz dvizVar = ((dviw) dvixVar).w;
        return dvizVar == null ? dviz.f : dvizVar;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ dviz j(axdt axdtVar, int i) {
        dviz dvizVar = axdtVar.aN(i).c;
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
        axdsVar.bN();
        axdsVar.Y.add(0, bK);
    }

    @Override // defpackage.awwx
    public final int l(dvix dvixVar) {
        dviz dvizVar = ((dviw) dvixVar).w;
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
