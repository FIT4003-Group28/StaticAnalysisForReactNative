package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: awxs  reason: default package */
/* loaded from: classes.dex */
public final class awxs implements awwx<dvhs> {
    static final awxs a = new awxs();

    @Override // defpackage.awwx
    public final int a(axdt axdtVar) {
        return axdtVar.y();
    }

    @Override // defpackage.awwx
    public final int b(dkut dkutVar) {
        return dkutVar.h;
    }

    @Override // defpackage.awwx
    public final long c(axdt axdtVar, int i) {
        return ((axds) axdtVar).r.get(i).b;
    }

    @Override // defpackage.awwx
    public final dviq d(axdt axdtVar, int i) {
        dviq dviqVar = axdtVar.z(i).d;
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
        axdsVar.bg();
        axdsVar.r.remove(i);
    }

    @Override // defpackage.awwx
    public final void f(axdr axdrVar) {
        if (axdrVar.c) {
            axdrVar.bF();
            axdrVar.c = false;
        }
        axds axdsVar = axds.ac;
        ((axds) axdrVar.b).r = axds.ck();
    }

    @Override // defpackage.awwx
    public final void g(drbi drbiVar) {
        if (drbiVar.c) {
            drbiVar.bF();
            drbiVar.c = false;
        }
        drbj drbjVar = (drbj) drbiVar.b;
        drbj drbjVar2 = drbj.Z;
        drbjVar.a |= 1073741824;
        drbjVar.C = true;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ dqpe h(dvhs dvhsVar) {
        dqpe dqpeVar = dvhsVar.a;
        return dqpeVar == null ? dqpe.f : dqpeVar;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ dvhs i(dvix dvixVar) {
        dvhs dvhsVar = ((dviw) dvixVar).A;
        return dvhsVar == null ? dvhs.d : dvhsVar;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ dvhs j(axdt axdtVar, int i) {
        dvhs dvhsVar = axdtVar.z(i).c;
        return dvhsVar == null ? dvhs.d : dvhsVar;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ void k(axdr axdrVar, dvhs dvhsVar, @dzsi dviq dviqVar, long j) {
        dvhs dvhsVar2 = dvhsVar;
        axdj bZ = axdk.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        axdk axdkVar = (axdk) bZ.b;
        dvhsVar2.getClass();
        axdkVar.c = dvhsVar2;
        int i = axdkVar.a | 2;
        axdkVar.a = i;
        int i2 = i | 1;
        axdkVar.a = i2;
        axdkVar.b = j;
        if (dviqVar != null) {
            dviqVar.getClass();
            axdkVar.d = dviqVar;
            axdkVar.a = i2 | 4;
        }
        axdk bK = bZ.bK();
        if (axdrVar.c) {
            axdrVar.bF();
            axdrVar.c = false;
        }
        axds axdsVar = (axds) axdrVar.b;
        axds axdsVar2 = axds.ac;
        bK.getClass();
        axdsVar.bg();
        axdsVar.r.add(0, bK);
    }

    @Override // defpackage.awwx
    public final int l(dvix dvixVar) {
        dvhs dvhsVar = ((dviw) dvixVar).A;
        if (dvhsVar == null) {
            dvhsVar = dvhs.d;
        }
        int a2 = drbt.a(dvhsVar.c);
        if (a2 == 0) {
            return 1;
        }
        return a2;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ int m(dssj dssjVar) {
        int a2 = drbt.a(((dvhs) dssjVar).c);
        if (a2 == 0) {
            return 1;
        }
        return a2;
    }
}
