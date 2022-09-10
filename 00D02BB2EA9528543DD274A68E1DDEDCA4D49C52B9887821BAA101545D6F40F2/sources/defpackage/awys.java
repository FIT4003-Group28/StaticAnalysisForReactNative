package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: awys  reason: default package */
/* loaded from: classes.dex */
public final class awys implements awwx<dvjj> {
    static final awys a = new awys();

    @Override // defpackage.awwx
    public final int a(axdt axdtVar) {
        return axdtVar.W();
    }

    @Override // defpackage.awwx
    public final int b(dkut dkutVar) {
        return dkutVar.A;
    }

    @Override // defpackage.awwx
    public final long c(axdt axdtVar, int i) {
        return ((axds) axdtVar).D.get(i).b;
    }

    @Override // defpackage.awwx
    public final dviq d(axdt axdtVar, int i) {
        dviq dviqVar = axdtVar.X(i).d;
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
        axdsVar.bs();
        axdsVar.D.remove(i);
    }

    @Override // defpackage.awwx
    public final void f(axdr axdrVar) {
        if (axdrVar.c) {
            axdrVar.bF();
            axdrVar.c = false;
        }
        axds axdsVar = axds.ac;
        ((axds) axdrVar.b).D = axds.ck();
    }

    @Override // defpackage.awwx
    public final void g(drbi drbiVar) {
        if (drbiVar.c) {
            drbiVar.bF();
            drbiVar.c = false;
        }
        drbj drbjVar = (drbj) drbiVar.b;
        drbj drbjVar2 = drbj.Z;
        drbjVar.b |= 262144;
        drbjVar.T = true;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ dqpe h(dvjj dvjjVar) {
        dqpe dqpeVar = dvjjVar.c;
        return dqpeVar == null ? dqpe.f : dqpeVar;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ dvjj i(dvix dvixVar) {
        dvjj dvjjVar = ((dviw) dvixVar).L;
        return dvjjVar == null ? dvjj.f : dvjjVar;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ dvjj j(axdt axdtVar, int i) {
        dvjj dvjjVar = axdtVar.X(i).c;
        return dvjjVar == null ? dvjj.f : dvjjVar;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ void k(axdr axdrVar, dvjj dvjjVar, @dzsi dviq dviqVar, long j) {
        dvjj dvjjVar2 = dvjjVar;
        axes bZ = axet.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        axet axetVar = (axet) bZ.b;
        dvjjVar2.getClass();
        axetVar.c = dvjjVar2;
        int i = axetVar.a | 2;
        axetVar.a = i;
        int i2 = i | 1;
        axetVar.a = i2;
        axetVar.b = j;
        if (dviqVar != null) {
            dviqVar.getClass();
            axetVar.d = dviqVar;
            axetVar.a = i2 | 4;
        }
        axet bK = bZ.bK();
        if (axdrVar.c) {
            axdrVar.bF();
            axdrVar.c = false;
        }
        axds axdsVar = (axds) axdrVar.b;
        axds axdsVar2 = axds.ac;
        bK.getClass();
        axdsVar.bs();
        axdsVar.D.add(0, bK);
    }

    @Override // defpackage.awwx
    public final int l(dvix dvixVar) {
        dvjj dvjjVar = ((dviw) dvixVar).L;
        if (dvjjVar == null) {
            dvjjVar = dvjj.f;
        }
        int a2 = drbt.a(dvjjVar.e);
        if (a2 == 0) {
            return 1;
        }
        return a2;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ int m(dssj dssjVar) {
        int a2 = drbt.a(((dvjj) dssjVar).e);
        if (a2 == 0) {
            return 1;
        }
        return a2;
    }
}
