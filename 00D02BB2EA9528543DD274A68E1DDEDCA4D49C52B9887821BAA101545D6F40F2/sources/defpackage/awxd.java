package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: awxd  reason: default package */
/* loaded from: classes.dex */
public final class awxd implements awwx<dnus> {
    static final awxd a = new awxd();

    @Override // defpackage.awwx
    public final int a(axdt axdtVar) {
        return axdtVar.e();
    }

    @Override // defpackage.awwx
    public final int b(dkut dkutVar) {
        return dkutVar.L;
    }

    @Override // defpackage.awwx
    public final long c(axdt axdtVar, int i) {
        return ((axds) axdtVar).h.get(i).b;
    }

    @Override // defpackage.awwx
    public final dviq d(axdt axdtVar, int i) {
        dviq dviqVar = axdtVar.f(i).d;
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
        axdsVar.aW();
        axdsVar.h.remove(i);
    }

    @Override // defpackage.awwx
    public final void f(axdr axdrVar) {
        if (axdrVar.c) {
            axdrVar.bF();
            axdrVar.c = false;
        }
        axds axdsVar = axds.ac;
        ((axds) axdrVar.b).h = axds.ck();
    }

    @Override // defpackage.awwx
    public final void g(drbi drbiVar) {
        if (drbiVar.c) {
            drbiVar.bF();
            drbiVar.c = false;
        }
        drbj drbjVar = (drbj) drbiVar.b;
        drbj drbjVar2 = drbj.Z;
        drbjVar.a |= 128;
        drbjVar.j = true;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ dqpe h(dnus dnusVar) {
        dqpe dqpeVar = dnusVar.a;
        return dqpeVar == null ? dqpe.f : dqpeVar;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ dnus i(dvix dvixVar) {
        dnus dnusVar = ((dviw) dvixVar).e;
        return dnusVar == null ? dnus.d : dnusVar;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ dnus j(axdt axdtVar, int i) {
        dnus dnusVar = axdtVar.f(i).c;
        return dnusVar == null ? dnus.d : dnusVar;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ void k(axdr axdrVar, dnus dnusVar, @dzsi dviq dviqVar, long j) {
        dnus dnusVar2 = dnusVar;
        axcn bZ = axco.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        axco axcoVar = (axco) bZ.b;
        dnusVar2.getClass();
        axcoVar.c = dnusVar2;
        int i = axcoVar.a | 2;
        axcoVar.a = i;
        int i2 = i | 1;
        axcoVar.a = i2;
        axcoVar.b = j;
        if (dviqVar != null) {
            dviqVar.getClass();
            axcoVar.d = dviqVar;
            axcoVar.a = i2 | 4;
        }
        axco bK = bZ.bK();
        if (axdrVar.c) {
            axdrVar.bF();
            axdrVar.c = false;
        }
        axds axdsVar = (axds) axdrVar.b;
        axds axdsVar2 = axds.ac;
        bK.getClass();
        axdsVar.aW();
        axdsVar.h.add(0, bK);
    }

    @Override // defpackage.awwx
    public final int l(dvix dvixVar) {
        dnus dnusVar = ((dviw) dvixVar).e;
        if (dnusVar == null) {
            dnusVar = dnus.d;
        }
        int a2 = drbt.a(dnusVar.b);
        if (a2 == 0) {
            return 1;
        }
        return a2;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ int m(dssj dssjVar) {
        int a2 = drbt.a(((dnus) dssjVar).b);
        if (a2 == 0) {
            return 1;
        }
        return a2;
    }
}
