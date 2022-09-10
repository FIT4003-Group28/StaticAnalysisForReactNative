package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: awwz  reason: default package */
/* loaded from: classes3.dex */
public final class awwz implements awwx<dqsj> {
    static final awwz a = new awwz();

    @Override // defpackage.awwx
    public final int a(axdt axdtVar) {
        return axdtVar.aS();
    }

    @Override // defpackage.awwx
    public final int b(dkut dkutVar) {
        return dkutVar.W;
    }

    @Override // defpackage.awwx
    public final long c(axdt axdtVar, int i) {
        return ((axds) axdtVar).ab.get(i).b;
    }

    @Override // defpackage.awwx
    public final dviq d(axdt axdtVar, int i) {
        dviq dviqVar = axdtVar.aT(i).d;
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
        axdsVar.bQ();
        axdsVar.ab.remove(i);
    }

    @Override // defpackage.awwx
    public final void f(axdr axdrVar) {
        if (axdrVar.c) {
            axdrVar.bF();
            axdrVar.c = false;
        }
        axds axdsVar = axds.ac;
        ((axds) axdrVar.b).ab = axds.ck();
    }

    @Override // defpackage.awwx
    public final void g(drbi drbiVar) {
        if (drbiVar.c) {
            drbiVar.bF();
            drbiVar.c = false;
        }
        drbj drbjVar = (drbj) drbiVar.b;
        drbj drbjVar2 = drbj.Z;
        drbjVar.a |= 8;
        drbjVar.f = true;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ dqpe h(dqsj dqsjVar) {
        dqpe dqpeVar = dqsjVar.a;
        return dqpeVar == null ? dqpe.f : dqpeVar;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ dqsj i(dvix dvixVar) {
        dqsj dqsjVar = ((dviw) dvixVar).U;
        return dqsjVar == null ? dqsj.p : dqsjVar;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ dqsj j(axdt axdtVar, int i) {
        dqsj dqsjVar = axdtVar.aT(i).c;
        return dqsjVar == null ? dqsj.p : dqsjVar;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ void k(axdr axdrVar, dqsj dqsjVar, @dzsi dviq dviqVar, long j) {
        dqsj dqsjVar2 = dqsjVar;
        axcj bZ = axck.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        axck axckVar = (axck) bZ.b;
        dqsjVar2.getClass();
        axckVar.c = dqsjVar2;
        int i = axckVar.a | 2;
        axckVar.a = i;
        int i2 = i | 1;
        axckVar.a = i2;
        axckVar.b = j;
        if (dviqVar != null) {
            dviqVar.getClass();
            axckVar.d = dviqVar;
            axckVar.a = i2 | 4;
        }
        axck bK = bZ.bK();
        if (axdrVar.c) {
            axdrVar.bF();
            axdrVar.c = false;
        }
        axds axdsVar = (axds) axdrVar.b;
        axds axdsVar2 = axds.ac;
        bK.getClass();
        axdsVar.bQ();
        axdsVar.ab.add(0, bK);
    }

    @Override // defpackage.awwx
    public final int l(dvix dvixVar) {
        dqsj dqsjVar = ((dviw) dvixVar).U;
        if (dqsjVar == null) {
            dqsjVar = dqsj.p;
        }
        int a2 = drbt.a(dqsjVar.b);
        if (a2 == 0) {
            return 1;
        }
        return a2;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ int m(dssj dssjVar) {
        int a2 = drbt.a(((dqsj) dssjVar).b);
        if (a2 == 0) {
            return 1;
        }
        return a2;
    }
}
