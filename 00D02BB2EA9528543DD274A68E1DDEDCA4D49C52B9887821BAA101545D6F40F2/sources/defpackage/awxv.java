package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: awxv  reason: default package */
/* loaded from: classes.dex */
public final class awxv implements awwx<dvhu> {
    static final awxv a = new awxv();

    @Override // defpackage.awwx
    public final int a(axdt axdtVar) {
        return axdtVar.C();
    }

    @Override // defpackage.awwx
    public final int b(dkut dkutVar) {
        return dkutVar.j;
    }

    @Override // defpackage.awwx
    public final long c(axdt axdtVar, int i) {
        return ((axds) axdtVar).t.get(i).b;
    }

    @Override // defpackage.awwx
    public final dviq d(axdt axdtVar, int i) {
        dviq dviqVar = axdtVar.D(i).d;
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
        axdsVar.bi();
        axdsVar.t.remove(i);
    }

    @Override // defpackage.awwx
    public final void f(axdr axdrVar) {
        if (axdrVar.c) {
            axdrVar.bF();
            axdrVar.c = false;
        }
        axds axdsVar = axds.ac;
        ((axds) axdrVar.b).t = axds.ck();
    }

    @Override // defpackage.awwx
    public final void g(drbi drbiVar) {
        if (drbiVar.c) {
            drbiVar.bF();
            drbiVar.c = false;
        }
        drbj drbjVar = (drbj) drbiVar.b;
        drbj drbjVar2 = drbj.Z;
        drbjVar.a |= 67108864;
        drbjVar.y = true;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ dqpe h(dvhu dvhuVar) {
        dqpe dqpeVar = dvhuVar.a;
        return dqpeVar == null ? dqpe.f : dqpeVar;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ dvhu i(dvix dvixVar) {
        dvhu dvhuVar = ((dviw) dvixVar).C;
        return dvhuVar == null ? dvhu.d : dvhuVar;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ dvhu j(axdt axdtVar, int i) {
        dvhu dvhuVar = axdtVar.D(i).c;
        return dvhuVar == null ? dvhu.d : dvhuVar;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ void k(axdr axdrVar, dvhu dvhuVar, @dzsi dviq dviqVar, long j) {
        dvhu dvhuVar2 = dvhuVar;
        axdl bZ = axdm.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        axdm axdmVar = (axdm) bZ.b;
        dvhuVar2.getClass();
        axdmVar.c = dvhuVar2;
        int i = axdmVar.a | 2;
        axdmVar.a = i;
        int i2 = i | 1;
        axdmVar.a = i2;
        axdmVar.b = j;
        if (dviqVar != null) {
            dviqVar.getClass();
            axdmVar.d = dviqVar;
            axdmVar.a = i2 | 4;
        }
        axdm bK = bZ.bK();
        if (axdrVar.c) {
            axdrVar.bF();
            axdrVar.c = false;
        }
        axds axdsVar = (axds) axdrVar.b;
        axds axdsVar2 = axds.ac;
        bK.getClass();
        axdsVar.bi();
        axdsVar.t.add(0, bK);
    }

    @Override // defpackage.awwx
    public final int l(dvix dvixVar) {
        dvhu dvhuVar = ((dviw) dvixVar).C;
        if (dvhuVar == null) {
            dvhuVar = dvhu.d;
        }
        int a2 = drbt.a(dvhuVar.c);
        if (a2 == 0) {
            return 1;
        }
        return a2;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ int m(dssj dssjVar) {
        int a2 = drbt.a(((dvhu) dssjVar).c);
        if (a2 == 0) {
            return 1;
        }
        return a2;
    }
}