package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: awxy  reason: default package */
/* loaded from: classes.dex */
public final class awxy implements awwx<dvhu> {
    static final awxy a = new awxy();

    @Override // defpackage.awwx
    public final int a(axdt axdtVar) {
        return axdtVar.ag();
    }

    @Override // defpackage.awwx
    public final int b(dkut dkutVar) {
        return dkutVar.z;
    }

    @Override // defpackage.awwx
    public final long c(axdt axdtVar, int i) {
        return ((axds) axdtVar).I.get(i).b;
    }

    @Override // defpackage.awwx
    public final dviq d(axdt axdtVar, int i) {
        dviq dviqVar = axdtVar.ah(i).d;
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
        axdsVar.bx();
        axdsVar.I.remove(i);
    }

    @Override // defpackage.awwx
    public final void f(axdr axdrVar) {
        if (axdrVar.c) {
            axdrVar.bF();
            axdrVar.c = false;
        }
        axds axdsVar = axds.ac;
        ((axds) axdrVar.b).I = axds.ck();
    }

    @Override // defpackage.awwx
    public final void g(drbi drbiVar) {
        if (drbiVar.c) {
            drbiVar.bF();
            drbiVar.c = false;
        }
        drbj drbjVar = (drbj) drbiVar.b;
        drbj drbjVar2 = drbj.Z;
        drbjVar.a |= Integer.MIN_VALUE;
        drbjVar.D = true;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ dqpe h(dvhu dvhuVar) {
        dqpe dqpeVar = dvhuVar.a;
        return dqpeVar == null ? dqpe.f : dqpeVar;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ dvhu i(dvix dvixVar) {
        dvhu dvhuVar = ((dviw) dvixVar).G;
        return dvhuVar == null ? dvhu.d : dvhuVar;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ dvhu j(axdt axdtVar, int i) {
        dvhu dvhuVar = axdtVar.ah(i).c;
        return dvhuVar == null ? dvhu.d : dvhuVar;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ void k(axdr axdrVar, dvhu dvhuVar, @dzsi dviq dviqVar, long j) {
        dvhu dvhuVar2 = dvhuVar;
        axdn bZ = axdo.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        axdo axdoVar = (axdo) bZ.b;
        dvhuVar2.getClass();
        axdoVar.c = dvhuVar2;
        int i = axdoVar.a | 2;
        axdoVar.a = i;
        int i2 = i | 1;
        axdoVar.a = i2;
        axdoVar.b = j;
        if (dviqVar != null) {
            dviqVar.getClass();
            axdoVar.d = dviqVar;
            axdoVar.a = i2 | 4;
        }
        axdo bK = bZ.bK();
        if (axdrVar.c) {
            axdrVar.bF();
            axdrVar.c = false;
        }
        axds axdsVar = (axds) axdrVar.b;
        axds axdsVar2 = axds.ac;
        bK.getClass();
        axdsVar.bx();
        axdsVar.I.add(0, bK);
    }

    @Override // defpackage.awwx
    public final int l(dvix dvixVar) {
        dvhu dvhuVar = ((dviw) dvixVar).G;
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
