package defpackage;

import com.google.ar.core.ImageMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: awxp  reason: default package */
/* loaded from: classes.dex */
public final class awxp implements awwx<dvho> {
    static final awxp a = new awxp();

    @Override // defpackage.awwx
    public final int a(axdt axdtVar) {
        return axdtVar.K();
    }

    @Override // defpackage.awwx
    public final int b(dkut dkutVar) {
        return dkutVar.f;
    }

    @Override // defpackage.awwx
    public final long c(axdt axdtVar, int i) {
        return ((axds) axdtVar).x.get(i).b;
    }

    @Override // defpackage.awwx
    public final dviq d(axdt axdtVar, int i) {
        dviq dviqVar = axdtVar.L(i).d;
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
        axdsVar.bm();
        axdsVar.x.remove(i);
    }

    @Override // defpackage.awwx
    public final void f(axdr axdrVar) {
        if (axdrVar.c) {
            axdrVar.bF();
            axdrVar.c = false;
        }
        axds axdsVar = axds.ac;
        ((axds) axdrVar.b).x = axds.ck();
    }

    @Override // defpackage.awwx
    public final void g(drbi drbiVar) {
        if (drbiVar.c) {
            drbiVar.bF();
            drbiVar.c = false;
        }
        drbj drbjVar = (drbj) drbiVar.b;
        drbj drbjVar2 = drbj.Z;
        drbjVar.a |= ImageMetadata.SHADING_MODE;
        drbjVar.u = true;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ dqpe h(dvho dvhoVar) {
        dqpe dqpeVar = dvhoVar.c;
        return dqpeVar == null ? dqpe.f : dqpeVar;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ dvho i(dvix dvixVar) {
        dvho dvhoVar = ((dviw) dvixVar).H;
        return dvhoVar == null ? dvho.f : dvhoVar;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ dvho j(axdt axdtVar, int i) {
        dvho dvhoVar = axdtVar.L(i).c;
        return dvhoVar == null ? dvho.f : dvhoVar;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ void k(axdr axdrVar, dvho dvhoVar, @dzsi dviq dviqVar, long j) {
        dvho dvhoVar2 = dvhoVar;
        axdd bZ = axde.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        axde axdeVar = (axde) bZ.b;
        dvhoVar2.getClass();
        axdeVar.c = dvhoVar2;
        int i = axdeVar.a | 2;
        axdeVar.a = i;
        int i2 = i | 1;
        axdeVar.a = i2;
        axdeVar.b = j;
        if (dviqVar != null) {
            dviqVar.getClass();
            axdeVar.d = dviqVar;
            axdeVar.a = i2 | 4;
        }
        axde bK = bZ.bK();
        if (axdrVar.c) {
            axdrVar.bF();
            axdrVar.c = false;
        }
        axds axdsVar = (axds) axdrVar.b;
        axds axdsVar2 = axds.ac;
        bK.getClass();
        axdsVar.bm();
        axdsVar.x.add(0, bK);
    }

    @Override // defpackage.awwx
    public final int l(dvix dvixVar) {
        dvho dvhoVar = ((dviw) dvixVar).H;
        if (dvhoVar == null) {
            dvhoVar = dvho.f;
        }
        int a2 = drbt.a(dvhoVar.e);
        if (a2 == 0) {
            return 1;
        }
        return a2;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ int m(dssj dssjVar) {
        int a2 = drbt.a(((dvho) dssjVar).e);
        if (a2 == 0) {
            return 1;
        }
        return a2;
    }
}
