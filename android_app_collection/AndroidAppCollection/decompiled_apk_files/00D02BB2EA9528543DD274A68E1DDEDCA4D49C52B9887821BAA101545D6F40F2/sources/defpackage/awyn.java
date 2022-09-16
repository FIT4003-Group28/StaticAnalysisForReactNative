package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: awyn  reason: default package */
/* loaded from: classes.dex */
public final class awyn implements awwx<dvjf> {
    static final awyn a = new awyn();

    @Override // defpackage.awwx
    public final int a(axdt axdtVar) {
        return axdtVar.i();
    }

    @Override // defpackage.awwx
    public final int b(dkut dkutVar) {
        return dkutVar.p;
    }

    @Override // defpackage.awwx
    public final long c(axdt axdtVar, int i) {
        return ((axds) axdtVar).j.get(i).b;
    }

    @Override // defpackage.awwx
    public final dviq d(axdt axdtVar, int i) {
        dviq dviqVar = axdtVar.j(i).d;
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
        axdsVar.aY();
        axdsVar.j.remove(i);
    }

    @Override // defpackage.awwx
    public final void f(axdr axdrVar) {
        if (axdrVar.c) {
            axdrVar.bF();
            axdrVar.c = false;
        }
        axds axdsVar = axds.ac;
        ((axds) axdrVar.b).j = axds.ck();
    }

    @Override // defpackage.awwx
    public final void g(drbi drbiVar) {
        if (drbiVar.c) {
            drbiVar.bF();
            drbiVar.c = false;
        }
        drbj drbjVar = (drbj) drbiVar.b;
        drbj drbjVar2 = drbj.Z;
        drbjVar.b |= 16384;
        drbjVar.P = true;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ dqpe h(dvjf dvjfVar) {
        dqpe dqpeVar = dvjfVar.b;
        return dqpeVar == null ? dqpe.f : dqpeVar;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ dvjf i(dvix dvixVar) {
        dvjf dvjfVar = ((dviw) dvixVar).g;
        return dvjfVar == null ? dvjf.f : dvjfVar;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ dvjf j(axdt axdtVar, int i) {
        dvjf dvjfVar = axdtVar.j(i).c;
        return dvjfVar == null ? dvjf.f : dvjfVar;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ void k(axdr axdrVar, dvjf dvjfVar, @dzsi dviq dviqVar, long j) {
        dvjf dvjfVar2 = dvjfVar;
        axem bZ = axen.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        axen axenVar = (axen) bZ.b;
        dvjfVar2.getClass();
        axenVar.c = dvjfVar2;
        int i = axenVar.a | 2;
        axenVar.a = i;
        int i2 = i | 1;
        axenVar.a = i2;
        axenVar.b = j;
        if (dviqVar != null) {
            dviqVar.getClass();
            axenVar.d = dviqVar;
            axenVar.a = i2 | 4;
        }
        axen bK = bZ.bK();
        if (axdrVar.c) {
            axdrVar.bF();
            axdrVar.c = false;
        }
        axds axdsVar = (axds) axdrVar.b;
        axds axdsVar2 = axds.ac;
        bK.getClass();
        axdsVar.aY();
        axdsVar.j.add(0, bK);
    }

    @Override // defpackage.awwx
    public final int l(dvix dvixVar) {
        dvjf dvjfVar = ((dviw) dvixVar).g;
        if (dvjfVar == null) {
            dvjfVar = dvjf.f;
        }
        int a2 = drbt.a(dvjfVar.e);
        if (a2 == 0) {
            return 1;
        }
        return a2;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ int m(dssj dssjVar) {
        int a2 = drbt.a(((dvjf) dssjVar).e);
        if (a2 == 0) {
            return 1;
        }
        return a2;
    }
}
