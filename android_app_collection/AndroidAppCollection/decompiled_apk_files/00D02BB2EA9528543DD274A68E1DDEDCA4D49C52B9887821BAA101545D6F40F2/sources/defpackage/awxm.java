package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: awxm  reason: default package */
/* loaded from: classes.dex */
public final class awxm implements awwx<drbr> {
    static final awxm a = new awxm();

    @Override // defpackage.awwx
    public final int a(axdt axdtVar) {
        return axdtVar.aA();
    }

    @Override // defpackage.awwx
    public final int b(dkut dkutVar) {
        return dkutVar.K;
    }

    @Override // defpackage.awwx
    public final long c(axdt axdtVar, int i) {
        return ((axds) axdtVar).S.get(i).b;
    }

    @Override // defpackage.awwx
    public final dviq d(axdt axdtVar, int i) {
        dviq dviqVar = axdtVar.aB(i).d;
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
        axdsVar.bH();
        axdsVar.S.remove(i);
    }

    @Override // defpackage.awwx
    public final void f(axdr axdrVar) {
        if (axdrVar.c) {
            axdrVar.bF();
            axdrVar.c = false;
        }
        axds axdsVar = axds.ac;
        ((axds) axdrVar.b).S = axds.ck();
    }

    @Override // defpackage.awwx
    public final void g(drbi drbiVar) {
        if (drbiVar.c) {
            drbiVar.bF();
            drbiVar.c = false;
        }
        drbj drbjVar = (drbj) drbiVar.b;
        drbj drbjVar2 = drbj.Z;
        drbjVar.a |= 262144;
        drbjVar.s = true;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ dqpe h(drbr drbrVar) {
        dqpe dqpeVar = drbrVar.a;
        return dqpeVar == null ? dqpe.f : dqpeVar;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ drbr i(dvix dvixVar) {
        drbr drbrVar = ((dviw) dvixVar).P;
        return drbrVar == null ? drbr.d : drbrVar;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ drbr j(axdt axdtVar, int i) {
        drbr drbrVar = axdtVar.aB(i).c;
        return drbrVar == null ? drbr.d : drbrVar;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ void k(axdr axdrVar, drbr drbrVar, @dzsi dviq dviqVar, long j) {
        drbr drbrVar2 = drbrVar;
        axei bZ = axej.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        axej axejVar = (axej) bZ.b;
        drbrVar2.getClass();
        axejVar.c = drbrVar2;
        int i = axejVar.a | 2;
        axejVar.a = i;
        int i2 = i | 1;
        axejVar.a = i2;
        axejVar.b = j;
        if (dviqVar != null) {
            dviqVar.getClass();
            axejVar.d = dviqVar;
            axejVar.a = i2 | 4;
        }
        axej bK = bZ.bK();
        if (axdrVar.c) {
            axdrVar.bF();
            axdrVar.c = false;
        }
        axds axdsVar = (axds) axdrVar.b;
        axds axdsVar2 = axds.ac;
        bK.getClass();
        axdsVar.bH();
        axdsVar.S.add(0, bK);
    }

    @Override // defpackage.awwx
    public final int l(dvix dvixVar) {
        drbr drbrVar = ((dviw) dvixVar).P;
        if (drbrVar == null) {
            drbrVar = drbr.d;
        }
        int a2 = drbt.a(drbrVar.c);
        if (a2 == 0) {
            return 1;
        }
        return a2;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ int m(dssj dssjVar) {
        int a2 = drbt.a(((drbr) dssjVar).c);
        if (a2 == 0) {
            return 1;
        }
        return a2;
    }
}
