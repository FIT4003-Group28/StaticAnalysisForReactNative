package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: awxl  reason: default package */
/* loaded from: classes3.dex */
public final class awxl implements awwx<dvhi> {
    static final awxl a = new awxl();

    @Override // defpackage.awwx
    public final int a(axdt axdtVar) {
        return axdtVar.u();
    }

    @Override // defpackage.awwx
    public final int b(dkut dkutVar) {
        return dkutVar.e;
    }

    @Override // defpackage.awwx
    public final long c(axdt axdtVar, int i) {
        return ((axds) axdtVar).p.get(i).b;
    }

    @Override // defpackage.awwx
    public final dviq d(axdt axdtVar, int i) {
        dviq dviqVar = axdtVar.v(i).d;
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
        axdsVar.be();
        axdsVar.p.remove(i);
    }

    @Override // defpackage.awwx
    public final void f(axdr axdrVar) {
        if (axdrVar.c) {
            axdrVar.bF();
            axdrVar.c = false;
        }
        axds axdsVar = axds.ac;
        ((axds) axdrVar.b).p = axds.ck();
    }

    @Override // defpackage.awwx
    public final void g(drbi drbiVar) {
        if (drbiVar.c) {
            drbiVar.bF();
            drbiVar.c = false;
        }
        drbj drbjVar = (drbj) drbiVar.b;
        drbj drbjVar2 = drbj.Z;
        drbjVar.a |= 131072;
        drbjVar.r = true;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ dqpe h(dvhi dvhiVar) {
        dqpe dqpeVar = dvhiVar.a;
        return dqpeVar == null ? dqpe.f : dqpeVar;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ dvhi i(dvix dvixVar) {
        dvhi dvhiVar = ((dviw) dvixVar).n;
        return dvhiVar == null ? dvhi.c : dvhiVar;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ dvhi j(axdt axdtVar, int i) {
        dvhi dvhiVar = axdtVar.v(i).c;
        return dvhiVar == null ? dvhi.c : dvhiVar;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ void k(axdr axdrVar, dvhi dvhiVar, @dzsi dviq dviqVar, long j) {
        dvhi dvhiVar2 = dvhiVar;
        axdb bZ = axdc.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        axdc axdcVar = (axdc) bZ.b;
        dvhiVar2.getClass();
        axdcVar.c = dvhiVar2;
        int i = axdcVar.a | 2;
        axdcVar.a = i;
        int i2 = i | 1;
        axdcVar.a = i2;
        axdcVar.b = j;
        if (dviqVar != null) {
            dviqVar.getClass();
            axdcVar.d = dviqVar;
            axdcVar.a = i2 | 4;
        }
        axdc bK = bZ.bK();
        if (axdrVar.c) {
            axdrVar.bF();
            axdrVar.c = false;
        }
        axds axdsVar = (axds) axdrVar.b;
        axds axdsVar2 = axds.ac;
        bK.getClass();
        axdsVar.be();
        axdsVar.p.add(0, bK);
    }

    @Override // defpackage.awwx
    public final int l(dvix dvixVar) {
        dvhi dvhiVar = ((dviw) dvixVar).n;
        if (dvhiVar == null) {
            dvhiVar = dvhi.c;
        }
        int a2 = drbt.a(dvhiVar.b);
        if (a2 == 0) {
            return 1;
        }
        return a2;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ int m(dssj dssjVar) {
        int a2 = drbt.a(((dvhi) dssjVar).b);
        if (a2 == 0) {
            return 1;
        }
        return a2;
    }
}
