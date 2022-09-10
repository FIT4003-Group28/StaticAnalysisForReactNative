package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: awyb  reason: default package */
/* loaded from: classes.dex */
public final class awyb implements awwx<dnuw> {
    static final awyb a = new awyb();

    @Override // defpackage.awwx
    public final int a(axdt axdtVar) {
        return axdtVar.g();
    }

    @Override // defpackage.awwx
    public final int b(dkut dkutVar) {
        return dkutVar.n;
    }

    @Override // defpackage.awwx
    public final long c(axdt axdtVar, int i) {
        return ((axds) axdtVar).i.get(i).b;
    }

    @Override // defpackage.awwx
    public final dviq d(axdt axdtVar, int i) {
        dviq dviqVar = axdtVar.h(i).d;
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
        axdsVar.aX();
        axdsVar.i.remove(i);
    }

    @Override // defpackage.awwx
    public final void f(axdr axdrVar) {
        if (axdrVar.c) {
            axdrVar.bF();
            axdrVar.c = false;
        }
        axds axdsVar = axds.ac;
        ((axds) axdrVar.b).i = axds.ck();
    }

    @Override // defpackage.awwx
    public final void g(drbi drbiVar) {
        if (drbiVar.c) {
            drbiVar.bF();
            drbiVar.c = false;
        }
        drbj drbjVar = (drbj) drbiVar.b;
        drbj drbjVar2 = drbj.Z;
        drbjVar.b |= 4;
        drbjVar.G = true;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ dqpe h(dnuw dnuwVar) {
        dqpe dqpeVar = dnuwVar.a;
        return dqpeVar == null ? dqpe.f : dqpeVar;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ dnuw i(dvix dvixVar) {
        dnuw dnuwVar = ((dviw) dvixVar).f;
        return dnuwVar == null ? dnuw.d : dnuwVar;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ dnuw j(axdt axdtVar, int i) {
        dnuw dnuwVar = axdtVar.h(i).c;
        return dnuwVar == null ? dnuw.d : dnuwVar;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ void k(axdr axdrVar, dnuw dnuwVar, @dzsi dviq dviqVar, long j) {
        dnuw dnuwVar2 = dnuwVar;
        axdp bZ = axdq.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        axdq axdqVar = (axdq) bZ.b;
        dnuwVar2.getClass();
        axdqVar.c = dnuwVar2;
        int i = axdqVar.a | 2;
        axdqVar.a = i;
        int i2 = i | 1;
        axdqVar.a = i2;
        axdqVar.b = j;
        if (dviqVar != null) {
            dviqVar.getClass();
            axdqVar.d = dviqVar;
            axdqVar.a = i2 | 4;
        }
        axdq bK = bZ.bK();
        if (axdrVar.c) {
            axdrVar.bF();
            axdrVar.c = false;
        }
        axds axdsVar = (axds) axdrVar.b;
        axds axdsVar2 = axds.ac;
        bK.getClass();
        axdsVar.aX();
        axdsVar.i.add(0, bK);
    }

    @Override // defpackage.awwx
    public final int l(dvix dvixVar) {
        dnuw dnuwVar = ((dviw) dvixVar).f;
        if (dnuwVar == null) {
            dnuwVar = dnuw.d;
        }
        int a2 = drbt.a(dnuwVar.c);
        if (a2 == 0) {
            return 1;
        }
        return a2;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ int m(dssj dssjVar) {
        int a2 = drbt.a(((dnuw) dssjVar).c);
        if (a2 == 0) {
            return 1;
        }
        return a2;
    }
}
