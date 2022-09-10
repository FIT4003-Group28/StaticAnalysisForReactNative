package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: awxn  reason: default package */
/* loaded from: classes.dex */
public final class awxn implements awwx<dvha> {
    static final awxn a = new awxn();

    @Override // defpackage.awwx
    public final int a(axdt axdtVar) {
        return axdtVar.aG();
    }

    @Override // defpackage.awwx
    public final int b(dkut dkutVar) {
        return dkutVar.P;
    }

    @Override // defpackage.awwx
    public final long c(axdt axdtVar, int i) {
        return ((axds) axdtVar).V.get(i).b;
    }

    @Override // defpackage.awwx
    public final dviq d(axdt axdtVar, int i) {
        dviq dviqVar = axdtVar.aH(i).d;
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
        axdsVar.bK();
        axdsVar.V.remove(i);
    }

    @Override // defpackage.awwx
    public final void f(axdr axdrVar) {
        if (axdrVar.c) {
            axdrVar.bF();
            axdrVar.c = false;
        }
        axds axdsVar = axds.ac;
        ((axds) axdrVar.b).V = axds.ck();
    }

    @Override // defpackage.awwx
    public final void g(drbi drbiVar) {
        if (drbiVar.c) {
            drbiVar.bF();
            drbiVar.c = false;
        }
        drbj drbjVar = (drbj) drbiVar.b;
        drbj drbjVar2 = drbj.Z;
        drbjVar.a |= 1024;
        drbjVar.m = true;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ dqpe h(dvha dvhaVar) {
        dqpe dqpeVar = dvhaVar.c;
        return dqpeVar == null ? dqpe.f : dqpeVar;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ dvha i(dvix dvixVar) {
        dvha dvhaVar = ((dviw) dvixVar).k;
        return dvhaVar == null ? dvha.h : dvhaVar;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ dvha j(axdt axdtVar, int i) {
        dvha dvhaVar = axdtVar.aH(i).c;
        return dvhaVar == null ? dvha.h : dvhaVar;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ void k(axdr axdrVar, dvha dvhaVar, @dzsi dviq dviqVar, long j) {
        dvha dvhaVar2 = dvhaVar;
        axct bZ = axcu.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        axcu axcuVar = (axcu) bZ.b;
        dvhaVar2.getClass();
        axcuVar.c = dvhaVar2;
        int i = axcuVar.a | 2;
        axcuVar.a = i;
        int i2 = i | 1;
        axcuVar.a = i2;
        axcuVar.b = j;
        if (dviqVar != null) {
            dviqVar.getClass();
            axcuVar.d = dviqVar;
            axcuVar.a = i2 | 4;
        }
        axcu bK = bZ.bK();
        if (axdrVar.c) {
            axdrVar.bF();
            axdrVar.c = false;
        }
        axds axdsVar = (axds) axdrVar.b;
        axds axdsVar2 = axds.ac;
        bK.getClass();
        axdsVar.bK();
        axdsVar.V.add(0, bK);
    }

    @Override // defpackage.awwx
    public final int l(dvix dvixVar) {
        dvha dvhaVar = ((dviw) dvixVar).k;
        if (dvhaVar == null) {
            dvhaVar = dvha.h;
        }
        int a2 = drbt.a(dvhaVar.g);
        if (a2 == 0) {
            return 1;
        }
        return a2;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ int m(dssj dssjVar) {
        int a2 = drbt.a(((dvha) dssjVar).g);
        if (a2 == 0) {
            return 1;
        }
        return a2;
    }
}
