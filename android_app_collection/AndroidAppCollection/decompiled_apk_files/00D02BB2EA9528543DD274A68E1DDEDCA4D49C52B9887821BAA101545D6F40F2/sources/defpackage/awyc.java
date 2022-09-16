package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: awyc  reason: default package */
/* loaded from: classes3.dex */
public final class awyc implements awwx<dnuy> {
    static final awyc a = new awyc();

    @Override // defpackage.awwx
    public final int a(axdt axdtVar) {
        return axdtVar.aO();
    }

    @Override // defpackage.awwx
    public final int b(dkut dkutVar) {
        return dkutVar.U;
    }

    @Override // defpackage.awwx
    public final long c(axdt axdtVar, int i) {
        return ((axds) axdtVar).Z.get(i).b;
    }

    @Override // defpackage.awwx
    public final dviq d(axdt axdtVar, int i) {
        dviq dviqVar = axdtVar.aP(i).d;
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
        axdsVar.bO();
        axdsVar.Z.remove(i);
    }

    @Override // defpackage.awwx
    public final void f(axdr axdrVar) {
        if (axdrVar.c) {
            axdrVar.bF();
            axdrVar.c = false;
        }
        axds axdsVar = axds.ac;
        ((axds) axdrVar.b).Z = axds.ck();
    }

    @Override // defpackage.awwx
    public final void g(drbi drbiVar) {
        if (drbiVar.c) {
            drbiVar.bF();
            drbiVar.c = false;
        }
        drbj drbjVar = (drbj) drbiVar.b;
        drbj drbjVar2 = drbj.Z;
        drbjVar.b |= 2097152;
        drbjVar.V = true;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ dqpe h(dnuy dnuyVar) {
        dqpe dqpeVar = dnuyVar.a;
        return dqpeVar == null ? dqpe.f : dqpeVar;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ dnuy i(dvix dvixVar) {
        dnuy dnuyVar = ((dviw) dvixVar).V;
        return dnuyVar == null ? dnuy.d : dnuyVar;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ dnuy j(axdt axdtVar, int i) {
        dnuy dnuyVar = axdtVar.aP(i).c;
        return dnuyVar == null ? dnuy.d : dnuyVar;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ void k(axdr axdrVar, dnuy dnuyVar, @dzsi dviq dviqVar, long j) {
        dnuy dnuyVar2 = dnuyVar;
        axea bZ = axeb.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        axeb axebVar = (axeb) bZ.b;
        dnuyVar2.getClass();
        axebVar.c = dnuyVar2;
        int i = axebVar.a | 2;
        axebVar.a = i;
        int i2 = i | 1;
        axebVar.a = i2;
        axebVar.b = j;
        if (dviqVar != null) {
            dviqVar.getClass();
            axebVar.d = dviqVar;
            axebVar.a = i2 | 4;
        }
        axeb bK = bZ.bK();
        if (axdrVar.c) {
            axdrVar.bF();
            axdrVar.c = false;
        }
        axds axdsVar = (axds) axdrVar.b;
        axds axdsVar2 = axds.ac;
        bK.getClass();
        axdsVar.bO();
        axdsVar.Z.add(0, bK);
    }

    @Override // defpackage.awwx
    public final int l(dvix dvixVar) {
        dnuy dnuyVar = ((dviw) dvixVar).V;
        if (dnuyVar == null) {
            dnuyVar = dnuy.d;
        }
        int a2 = drbt.a(dnuyVar.b);
        if (a2 == 0) {
            return 1;
        }
        return a2;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ int m(dssj dssjVar) {
        int a2 = drbt.a(((dnuy) dssjVar).b);
        if (a2 == 0) {
            return 1;
        }
        return a2;
    }
}
