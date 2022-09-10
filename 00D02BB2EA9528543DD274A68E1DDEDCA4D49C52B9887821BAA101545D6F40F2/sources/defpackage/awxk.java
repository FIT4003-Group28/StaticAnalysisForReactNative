package defpackage;

import com.google.ar.core.ImageMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: awxk  reason: default package */
/* loaded from: classes3.dex */
public final class awxk implements awwx<dvhg> {
    static final awxk a = new awxk();

    @Override // defpackage.awwx
    public final int a(axdt axdtVar) {
        return axdtVar.aK();
    }

    @Override // defpackage.awwx
    public final int b(dkut dkutVar) {
        return dkutVar.S;
    }

    @Override // defpackage.awwx
    public final long c(axdt axdtVar, int i) {
        return ((axds) axdtVar).X.get(i).b;
    }

    @Override // defpackage.awwx
    public final dviq d(axdt axdtVar, int i) {
        dviq dviqVar = axdtVar.aL(i).d;
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
        axdsVar.bM();
        axdsVar.X.remove(i);
    }

    @Override // defpackage.awwx
    public final void f(axdr axdrVar) {
        if (axdrVar.c) {
            axdrVar.bF();
            axdrVar.c = false;
        }
        axds axdsVar = axds.ac;
        ((axds) axdrVar.b).X = axds.ck();
    }

    @Override // defpackage.awwx
    public final void g(drbi drbiVar) {
        if (drbiVar.c) {
            drbiVar.bF();
            drbiVar.c = false;
        }
        drbj drbjVar = (drbj) drbiVar.b;
        drbj drbjVar2 = drbj.Z;
        drbjVar.a |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        drbjVar.q = true;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ dqpe h(dvhg dvhgVar) {
        dqpe dqpeVar = dvhgVar.b;
        return dqpeVar == null ? dqpe.f : dqpeVar;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ dvhg i(dvix dvixVar) {
        dvhg dvhgVar = ((dviw) dvixVar).R;
        return dvhgVar == null ? dvhg.f : dvhgVar;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ dvhg j(axdt axdtVar, int i) {
        dvhg dvhgVar = axdtVar.aL(i).c;
        return dvhgVar == null ? dvhg.f : dvhgVar;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ void k(axdr axdrVar, dvhg dvhgVar, @dzsi dviq dviqVar, long j) {
        dvhg dvhgVar2 = dvhgVar;
        axcz bZ = axda.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        axda axdaVar = (axda) bZ.b;
        dvhgVar2.getClass();
        axdaVar.c = dvhgVar2;
        int i = axdaVar.a | 2;
        axdaVar.a = i;
        int i2 = i | 1;
        axdaVar.a = i2;
        axdaVar.b = j;
        if (dviqVar != null) {
            dviqVar.getClass();
            axdaVar.d = dviqVar;
            axdaVar.a = i2 | 4;
        }
        axda bK = bZ.bK();
        if (axdrVar.c) {
            axdrVar.bF();
            axdrVar.c = false;
        }
        axds axdsVar = (axds) axdrVar.b;
        axds axdsVar2 = axds.ac;
        bK.getClass();
        axdsVar.bM();
        axdsVar.X.add(0, bK);
    }

    @Override // defpackage.awwx
    public final int l(dvix dvixVar) {
        dvhg dvhgVar = ((dviw) dvixVar).R;
        if (dvhgVar == null) {
            dvhgVar = dvhg.f;
        }
        int a2 = drbt.a(dvhgVar.e);
        if (a2 == 0) {
            return 1;
        }
        return a2;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ int m(dssj dssjVar) {
        int a2 = drbt.a(((dvhg) dssjVar).e);
        if (a2 == 0) {
            return 1;
        }
        return a2;
    }
}
