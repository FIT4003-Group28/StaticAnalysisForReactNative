package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: awxb  reason: default package */
/* loaded from: classes.dex */
public final class awxb implements awwx<dnuk> {
    static final awxb a = new awxb();

    @Override // defpackage.awwx
    public final int a(axdt axdtVar) {
        return axdtVar.a();
    }

    @Override // defpackage.awwx
    public final int b(dkut dkutVar) {
        return dkutVar.s;
    }

    @Override // defpackage.awwx
    public final long c(axdt axdtVar, int i) {
        return ((axds) axdtVar).f.get(i).b;
    }

    @Override // defpackage.awwx
    public final dviq d(axdt axdtVar, int i) {
        dviq dviqVar = axdtVar.b(i).d;
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
        axdsVar.aU();
        axdsVar.f.remove(i);
    }

    @Override // defpackage.awwx
    public final void f(axdr axdrVar) {
        if (axdrVar.c) {
            axdrVar.bF();
            axdrVar.c = false;
        }
        axds axdsVar = axds.ac;
        ((axds) axdrVar.b).f = axds.ck();
    }

    @Override // defpackage.awwx
    public final void g(drbi drbiVar) {
        if (drbiVar.c) {
            drbiVar.bF();
            drbiVar.c = false;
        }
        drbj drbjVar = (drbj) drbiVar.b;
        drbj drbjVar2 = drbj.Z;
        drbjVar.a |= 32;
        drbjVar.h = true;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ dqpe h(dnuk dnukVar) {
        dqpe dqpeVar = dnukVar.a;
        return dqpeVar == null ? dqpe.f : dqpeVar;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ dnuk i(dvix dvixVar) {
        dnuk dnukVar = ((dviw) dvixVar).d;
        return dnukVar == null ? dnuk.d : dnukVar;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ dnuk j(axdt axdtVar, int i) {
        dnuk dnukVar = axdtVar.b(i).c;
        return dnukVar == null ? dnuk.d : dnukVar;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ void k(axdr axdrVar, dnuk dnukVar, @dzsi dviq dviqVar, long j) {
        dnuk dnukVar2 = dnukVar;
        axcl bZ = axcm.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        axcm axcmVar = (axcm) bZ.b;
        dnukVar2.getClass();
        axcmVar.c = dnukVar2;
        int i = axcmVar.a | 2;
        axcmVar.a = i;
        int i2 = i | 1;
        axcmVar.a = i2;
        axcmVar.b = j;
        if (dviqVar != null) {
            dviqVar.getClass();
            axcmVar.d = dviqVar;
            axcmVar.a = i2 | 4;
        }
        axcm bK = bZ.bK();
        if (axdrVar.c) {
            axdrVar.bF();
            axdrVar.c = false;
        }
        axds axdsVar = (axds) axdrVar.b;
        axds axdsVar2 = axds.ac;
        bK.getClass();
        axdsVar.aU();
        axdsVar.f.add(0, bK);
    }

    @Override // defpackage.awwx
    public final int l(dvix dvixVar) {
        dnuk dnukVar = ((dviw) dvixVar).d;
        if (dnukVar == null) {
            dnukVar = dnuk.d;
        }
        int a2 = drbt.a(dnukVar.c);
        if (a2 == 0) {
            return 1;
        }
        return a2;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ int m(dssj dssjVar) {
        int a2 = drbt.a(((dnuk) dssjVar).c);
        if (a2 == 0) {
            return 1;
        }
        return a2;
    }
}
