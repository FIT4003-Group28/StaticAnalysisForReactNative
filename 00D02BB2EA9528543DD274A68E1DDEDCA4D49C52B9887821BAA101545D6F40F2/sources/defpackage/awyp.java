package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: awyp  reason: default package */
/* loaded from: classes.dex */
public final class awyp implements awwx<dvgu> {
    static final awyp a = new awyp();

    @Override // defpackage.awwx
    public final int a(axdt axdtVar) {
        return axdtVar.ac();
    }

    @Override // defpackage.awwx
    public final int b(dkut dkutVar) {
        return dkutVar.w;
    }

    @Override // defpackage.awwx
    public final long c(axdt axdtVar, int i) {
        return ((axds) axdtVar).G.get(i).b;
    }

    @Override // defpackage.awwx
    public final dviq d(axdt axdtVar, int i) {
        dviq dviqVar = axdtVar.ad(i).d;
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
        axdsVar.bv();
        axdsVar.G.remove(i);
    }

    @Override // defpackage.awwx
    public final void f(axdr axdrVar) {
        if (axdrVar.c) {
            axdrVar.bF();
            axdrVar.c = false;
        }
        axds axdsVar = axds.ac;
        ((axds) axdrVar.b).G = axds.ck();
    }

    @Override // defpackage.awwx
    public final void g(drbi drbiVar) {
        if (drbiVar.c) {
            drbiVar.bF();
            drbiVar.c = false;
        }
        drbj drbjVar = (drbj) drbiVar.b;
        drbj drbjVar2 = drbj.Z;
        drbjVar.b |= 16777216;
        drbjVar.Y = true;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ dqpe h(dvgu dvguVar) {
        dqpe dqpeVar = dvguVar.a;
        return dqpeVar == null ? dqpe.f : dqpeVar;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ dvgu i(dvix dvixVar) {
        dvgu dvguVar = ((dviw) dvixVar).Y;
        return dvguVar == null ? dvgu.c : dvguVar;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ dvgu j(axdt axdtVar, int i) {
        dvgu dvguVar = axdtVar.ad(i).c;
        return dvguVar == null ? dvgu.c : dvguVar;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ void k(axdr axdrVar, dvgu dvguVar, @dzsi dviq dviqVar, long j) {
        dvgu dvguVar2 = dvguVar;
        axcp bZ = axcq.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        axcq axcqVar = (axcq) bZ.b;
        dvguVar2.getClass();
        axcqVar.c = dvguVar2;
        int i = axcqVar.a | 2;
        axcqVar.a = i;
        int i2 = i | 1;
        axcqVar.a = i2;
        axcqVar.b = j;
        if (dviqVar != null) {
            dviqVar.getClass();
            axcqVar.d = dviqVar;
            axcqVar.a = i2 | 4;
        }
        axcq bK = bZ.bK();
        if (axdrVar.c) {
            axdrVar.bF();
            axdrVar.c = false;
        }
        axds axdsVar = (axds) axdrVar.b;
        axds axdsVar2 = axds.ac;
        bK.getClass();
        axdsVar.bv();
        axdsVar.G.add(0, bK);
    }

    @Override // defpackage.awwx
    public final int l(dvix dvixVar) {
        dvgu dvguVar = ((dviw) dvixVar).Y;
        if (dvguVar == null) {
            dvguVar = dvgu.c;
        }
        int a2 = drbt.a(dvguVar.b);
        if (a2 == 0) {
            return 1;
        }
        return a2;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ int m(dssj dssjVar) {
        int a2 = drbt.a(((dvgu) dssjVar).b);
        if (a2 == 0) {
            return 1;
        }
        return a2;
    }
}
