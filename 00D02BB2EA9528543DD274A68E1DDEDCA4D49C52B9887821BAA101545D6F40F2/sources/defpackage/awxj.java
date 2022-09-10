package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: awxj  reason: default package */
/* loaded from: classes.dex */
public final class awxj implements awwx<dvhc> {
    static final awxj a = new awxj();

    @Override // defpackage.awwx
    public final int a(axdt axdtVar) {
        return axdtVar.q();
    }

    @Override // defpackage.awwx
    public final int b(dkut dkutVar) {
        return dkutVar.d;
    }

    @Override // defpackage.awwx
    public final long c(axdt axdtVar, int i) {
        return ((axds) axdtVar).n.get(i).b;
    }

    @Override // defpackage.awwx
    public final dviq d(axdt axdtVar, int i) {
        dviq dviqVar = axdtVar.r(i).d;
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
        axdsVar.bc();
        axdsVar.n.remove(i);
    }

    @Override // defpackage.awwx
    public final void f(axdr axdrVar) {
        if (axdrVar.c) {
            axdrVar.bF();
            axdrVar.c = false;
        }
        axds axdsVar = axds.ac;
        ((axds) axdrVar.b).n = axds.ck();
    }

    @Override // defpackage.awwx
    public final void g(drbi drbiVar) {
        if (drbiVar.c) {
            drbiVar.bF();
            drbiVar.c = false;
        }
        drbj drbjVar = (drbj) drbiVar.b;
        drbj drbjVar2 = drbj.Z;
        drbjVar.a |= 32768;
        drbjVar.p = true;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ dqpe h(dvhc dvhcVar) {
        dqpe dqpeVar = dvhcVar.a;
        return dqpeVar == null ? dqpe.f : dqpeVar;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ dvhc i(dvix dvixVar) {
        dvhc dvhcVar = ((dviw) dvixVar).l;
        return dvhcVar == null ? dvhc.c : dvhcVar;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ dvhc j(axdt axdtVar, int i) {
        dvhc dvhcVar = axdtVar.r(i).c;
        return dvhcVar == null ? dvhc.c : dvhcVar;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ void k(axdr axdrVar, dvhc dvhcVar, @dzsi dviq dviqVar, long j) {
        dvhc dvhcVar2 = dvhcVar;
        axcx bZ = axcy.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        axcy axcyVar = (axcy) bZ.b;
        dvhcVar2.getClass();
        axcyVar.c = dvhcVar2;
        int i = axcyVar.a | 2;
        axcyVar.a = i;
        int i2 = i | 1;
        axcyVar.a = i2;
        axcyVar.b = j;
        if (dviqVar != null) {
            dviqVar.getClass();
            axcyVar.d = dviqVar;
            axcyVar.a = i2 | 4;
        }
        axcy bK = bZ.bK();
        if (axdrVar.c) {
            axdrVar.bF();
            axdrVar.c = false;
        }
        axds axdsVar = (axds) axdrVar.b;
        axds axdsVar2 = axds.ac;
        bK.getClass();
        axdsVar.bc();
        axdsVar.n.add(0, bK);
    }

    @Override // defpackage.awwx
    public final int l(dvix dvixVar) {
        dvhc dvhcVar = ((dviw) dvixVar).l;
        if (dvhcVar == null) {
            dvhcVar = dvhc.c;
        }
        int a2 = drbt.a(dvhcVar.b);
        if (a2 == 0) {
            return 1;
        }
        return a2;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ int m(dssj dssjVar) {
        int a2 = drbt.a(((dvhc) dssjVar).b);
        if (a2 == 0) {
            return 1;
        }
        return a2;
    }
}
