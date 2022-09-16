package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: awyo  reason: default package */
/* loaded from: classes.dex */
public final class awyo implements awwx<dnvm> {
    static final awyo a = new awyo();

    @Override // defpackage.awwx
    public final int a(axdt axdtVar) {
        return axdtVar.c();
    }

    @Override // defpackage.awwx
    public final int b(dkut dkutVar) {
        return dkutVar.r;
    }

    @Override // defpackage.awwx
    public final long c(axdt axdtVar, int i) {
        return ((axds) axdtVar).g.get(i).b;
    }

    @Override // defpackage.awwx
    public final dviq d(axdt axdtVar, int i) {
        dviq dviqVar = axdtVar.d(i).d;
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
        axdsVar.aV();
        axdsVar.g.remove(i);
    }

    @Override // defpackage.awwx
    public final void f(axdr axdrVar) {
        if (axdrVar.c) {
            axdrVar.bF();
            axdrVar.c = false;
        }
        axds axdsVar = axds.ac;
        ((axds) axdrVar.b).g = axds.ck();
    }

    @Override // defpackage.awwx
    public final void g(drbi drbiVar) {
        if (drbiVar.c) {
            drbiVar.bF();
            drbiVar.c = false;
        }
        drbj drbjVar = (drbj) drbiVar.b;
        drbj drbjVar2 = drbj.Z;
        drbjVar.b |= 32768;
        drbjVar.Q = true;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ dqpe h(dnvm dnvmVar) {
        dqpe dqpeVar = dnvmVar.a;
        return dqpeVar == null ? dqpe.f : dqpeVar;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ dnvm i(dvix dvixVar) {
        dnvm dnvmVar = ((dviw) dvixVar).c;
        return dnvmVar == null ? dnvm.d : dnvmVar;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ dnvm j(axdt axdtVar, int i) {
        dnvm dnvmVar = axdtVar.d(i).c;
        return dnvmVar == null ? dnvm.d : dnvmVar;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ void k(axdr axdrVar, dnvm dnvmVar, @dzsi dviq dviqVar, long j) {
        dnvm dnvmVar2 = dnvmVar;
        axeo bZ = axep.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        axep axepVar = (axep) bZ.b;
        dnvmVar2.getClass();
        axepVar.c = dnvmVar2;
        int i = axepVar.a | 2;
        axepVar.a = i;
        int i2 = i | 1;
        axepVar.a = i2;
        axepVar.b = j;
        if (dviqVar != null) {
            dviqVar.getClass();
            axepVar.d = dviqVar;
            axepVar.a = i2 | 4;
        }
        axep bK = bZ.bK();
        if (axdrVar.c) {
            axdrVar.bF();
            axdrVar.c = false;
        }
        axds axdsVar = (axds) axdrVar.b;
        axds axdsVar2 = axds.ac;
        bK.getClass();
        axdsVar.aV();
        axdsVar.g.add(0, bK);
    }

    @Override // defpackage.awwx
    public final int l(dvix dvixVar) {
        dnvm dnvmVar = ((dviw) dvixVar).c;
        if (dnvmVar == null) {
            dnvmVar = dnvm.d;
        }
        int a2 = drbt.a(dnvmVar.c);
        if (a2 == 0) {
            return 1;
        }
        return a2;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ int m(dssj dssjVar) {
        int a2 = drbt.a(((dnvm) dssjVar).c);
        if (a2 == 0) {
            return 1;
        }
        return a2;
    }
}
