package defpackage;

import com.google.ar.core.ImageMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: awyq  reason: default package */
/* loaded from: classes.dex */
public final class awyq implements awwx<dvjh> {
    static final awyq a = new awyq();

    @Override // defpackage.awwx
    public final int a(axdt axdtVar) {
        return axdtVar.m();
    }

    @Override // defpackage.awwx
    public final int b(dkut dkutVar) {
        return dkutVar.q;
    }

    @Override // defpackage.awwx
    public final long c(axdt axdtVar, int i) {
        return ((axds) axdtVar).l.get(i).b;
    }

    @Override // defpackage.awwx
    public final dviq d(axdt axdtVar, int i) {
        dviq dviqVar = axdtVar.n(i).d;
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
        axdsVar.ba();
        axdsVar.l.remove(i);
    }

    @Override // defpackage.awwx
    public final void f(axdr axdrVar) {
        if (axdrVar.c) {
            axdrVar.bF();
            axdrVar.c = false;
        }
        axds axdsVar = axds.ac;
        ((axds) axdrVar.b).l = axds.ck();
    }

    @Override // defpackage.awwx
    public final void g(drbi drbiVar) {
        if (drbiVar.c) {
            drbiVar.bF();
            drbiVar.c = false;
        }
        drbj drbjVar = (drbj) drbiVar.b;
        drbj drbjVar2 = drbj.Z;
        drbjVar.b |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        drbjVar.R = true;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ dqpe h(dvjh dvjhVar) {
        dqpe dqpeVar = dvjhVar.b;
        return dqpeVar == null ? dqpe.f : dqpeVar;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ dvjh i(dvix dvixVar) {
        dvjh dvjhVar = ((dviw) dvixVar).i;
        return dvjhVar == null ? dvjh.e : dvjhVar;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ dvjh j(axdt axdtVar, int i) {
        dvjh dvjhVar = axdtVar.n(i).c;
        return dvjhVar == null ? dvjh.e : dvjhVar;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ void k(axdr axdrVar, dvjh dvjhVar, @dzsi dviq dviqVar, long j) {
        dvjh dvjhVar2 = dvjhVar;
        axeq bZ = axer.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        axer axerVar = (axer) bZ.b;
        dvjhVar2.getClass();
        axerVar.c = dvjhVar2;
        int i = axerVar.a | 2;
        axerVar.a = i;
        int i2 = i | 1;
        axerVar.a = i2;
        axerVar.b = j;
        if (dviqVar != null) {
            dviqVar.getClass();
            axerVar.d = dviqVar;
            axerVar.a = i2 | 4;
        }
        axer bK = bZ.bK();
        if (axdrVar.c) {
            axdrVar.bF();
            axdrVar.c = false;
        }
        axds axdsVar = (axds) axdrVar.b;
        axds axdsVar2 = axds.ac;
        bK.getClass();
        axdsVar.ba();
        axdsVar.l.add(0, bK);
    }

    @Override // defpackage.awwx
    public final int l(dvix dvixVar) {
        dvjh dvjhVar = ((dviw) dvixVar).i;
        if (dvjhVar == null) {
            dvjhVar = dvjh.e;
        }
        int a2 = drbt.a(dvjhVar.d);
        if (a2 == 0) {
            return 1;
        }
        return a2;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ int m(dssj dssjVar) {
        int a2 = drbt.a(((dvjh) dssjVar).d);
        if (a2 == 0) {
            return 1;
        }
        return a2;
    }
}
