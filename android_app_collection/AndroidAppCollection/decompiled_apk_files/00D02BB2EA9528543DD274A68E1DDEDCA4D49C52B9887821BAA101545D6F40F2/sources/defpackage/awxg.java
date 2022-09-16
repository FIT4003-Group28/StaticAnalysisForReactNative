package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: awxg  reason: default package */
/* loaded from: classes.dex */
public final class awxg implements awwx<dqfq> {
    static final awxg a = new awxg();

    @Override // defpackage.awwx
    public final int a(axdt axdtVar) {
        return axdtVar.s();
    }

    @Override // defpackage.awwx
    public final int b(dkut dkutVar) {
        return dkutVar.c;
    }

    @Override // defpackage.awwx
    public final long c(axdt axdtVar, int i) {
        return ((axds) axdtVar).o.get(i).b;
    }

    @Override // defpackage.awwx
    public final dviq d(axdt axdtVar, int i) {
        dviq dviqVar = axdtVar.t(i).d;
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
        axdsVar.bd();
        axdsVar.o.remove(i);
    }

    @Override // defpackage.awwx
    public final void f(axdr axdrVar) {
        if (axdrVar.c) {
            axdrVar.bF();
            axdrVar.c = false;
        }
        axds axdsVar = axds.ac;
        ((axds) axdrVar.b).o = axds.ck();
    }

    @Override // defpackage.awwx
    public final void g(drbi drbiVar) {
        if (drbiVar.c) {
            drbiVar.bF();
            drbiVar.c = false;
        }
        drbj drbjVar = (drbj) drbiVar.b;
        drbj drbjVar2 = drbj.Z;
        drbjVar.a |= 2048;
        drbjVar.n = true;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ dqpe h(dqfq dqfqVar) {
        dqpe dqpeVar = dqfqVar.c;
        return dqpeVar == null ? dqpe.f : dqpeVar;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ dqfq i(dvix dvixVar) {
        dqfq dqfqVar = ((dviw) dvixVar).m;
        return dqfqVar == null ? dqfq.h : dqfqVar;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ dqfq j(axdt axdtVar, int i) {
        dqfq dqfqVar = axdtVar.t(i).c;
        return dqfqVar == null ? dqfq.h : dqfqVar;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ void k(axdr axdrVar, dqfq dqfqVar, @dzsi dviq dviqVar, long j) {
        dqfq dqfqVar2 = dqfqVar;
        axee bZ = axef.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        axef axefVar = (axef) bZ.b;
        dqfqVar2.getClass();
        axefVar.c = dqfqVar2;
        int i = axefVar.a | 2;
        axefVar.a = i;
        int i2 = i | 1;
        axefVar.a = i2;
        axefVar.b = j;
        if (dviqVar != null) {
            dviqVar.getClass();
            axefVar.d = dviqVar;
            axefVar.a = i2 | 4;
        }
        axef bK = bZ.bK();
        if (axdrVar.c) {
            axdrVar.bF();
            axdrVar.c = false;
        }
        axds axdsVar = (axds) axdrVar.b;
        axds axdsVar2 = axds.ac;
        bK.getClass();
        axdsVar.bd();
        axdsVar.o.add(0, bK);
    }

    @Override // defpackage.awwx
    public final int l(dvix dvixVar) {
        dqfq dqfqVar = ((dviw) dvixVar).m;
        if (dqfqVar == null) {
            dqfqVar = dqfq.h;
        }
        int a2 = drbt.a(dqfqVar.g);
        if (a2 == 0) {
            return 1;
        }
        return a2;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ int m(dssj dssjVar) {
        int a2 = drbt.a(((dqfq) dssjVar).g);
        if (a2 == 0) {
            return 1;
        }
        return a2;
    }
}
