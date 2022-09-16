package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: awxa  reason: default package */
/* loaded from: classes.dex */
public final class awxa implements awwx<dvhw> {
    static final awxa a = new awxa();

    @Override // defpackage.awwx
    public final int a(axdt axdtVar) {
        return axdtVar.ai();
    }

    @Override // defpackage.awwx
    public final int b(dkut dkutVar) {
        return dkutVar.B;
    }

    @Override // defpackage.awwx
    public final long c(axdt axdtVar, int i) {
        return ((axds) axdtVar).J.get(i).b;
    }

    @Override // defpackage.awwx
    public final dviq d(axdt axdtVar, int i) {
        dviq dviqVar = axdtVar.aj(i).d;
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
        axdsVar.by();
        axdsVar.J.remove(i);
    }

    @Override // defpackage.awwx
    public final void f(axdr axdrVar) {
        if (axdrVar.c) {
            axdrVar.bF();
            axdrVar.c = false;
        }
        axds axdsVar = axds.ac;
        ((axds) axdrVar.b).J = axds.ck();
    }

    @Override // defpackage.awwx
    public final void g(drbi drbiVar) {
        if (drbiVar.c) {
            drbiVar.bF();
            drbiVar.c = false;
        }
        drbj drbjVar = (drbj) drbiVar.b;
        drbj drbjVar2 = drbj.Z;
        drbjVar.a |= 16;
        drbjVar.g = true;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ dqpe h(dvhw dvhwVar) {
        dqpe dqpeVar = dvhwVar.c;
        return dqpeVar == null ? dqpe.f : dqpeVar;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ dvhw i(dvix dvixVar) {
        dvhw dvhwVar = ((dviw) dvixVar).x;
        return dvhwVar == null ? dvhw.f : dvhwVar;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ dvhw j(axdt axdtVar, int i) {
        dvhw dvhwVar = axdtVar.aj(i).c;
        return dvhwVar == null ? dvhw.f : dvhwVar;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ void k(axdr axdrVar, dvhw dvhwVar, @dzsi dviq dviqVar, long j) {
        dvhw dvhwVar2 = dvhwVar;
        axdw bZ = axdx.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        axdx axdxVar = (axdx) bZ.b;
        dvhwVar2.getClass();
        axdxVar.c = dvhwVar2;
        int i = axdxVar.a | 2;
        axdxVar.a = i;
        int i2 = i | 1;
        axdxVar.a = i2;
        axdxVar.b = j;
        if (dviqVar != null) {
            dviqVar.getClass();
            axdxVar.d = dviqVar;
            axdxVar.a = i2 | 4;
        }
        axdx bK = bZ.bK();
        if (axdrVar.c) {
            axdrVar.bF();
            axdrVar.c = false;
        }
        axds axdsVar = (axds) axdrVar.b;
        axds axdsVar2 = axds.ac;
        bK.getClass();
        axdsVar.by();
        axdsVar.J.add(0, bK);
    }

    @Override // defpackage.awwx
    public final int l(dvix dvixVar) {
        dvhw dvhwVar = ((dviw) dvixVar).x;
        if (dvhwVar == null) {
            dvhwVar = dvhw.f;
        }
        int a2 = drbt.a(dvhwVar.e);
        if (a2 == 0) {
            return 1;
        }
        return a2;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ int m(dssj dssjVar) {
        int a2 = drbt.a(((dvhw) dssjVar).e);
        if (a2 == 0) {
            return 1;
        }
        return a2;
    }
}
