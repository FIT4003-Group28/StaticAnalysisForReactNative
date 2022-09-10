package defpackage;

import com.google.ar.core.ImageMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: awye  reason: default package */
/* loaded from: classes.dex */
public final class awye implements awwx<dvhq> {
    static final awye a = new awye();

    @Override // defpackage.awwx
    public final int a(axdt axdtVar) {
        return axdtVar.U();
    }

    @Override // defpackage.awwx
    public final int b(dkut dkutVar) {
        return dkutVar.R;
    }

    @Override // defpackage.awwx
    public final long c(axdt axdtVar, int i) {
        return ((axds) axdtVar).C.get(i).b;
    }

    @Override // defpackage.awwx
    public final dviq d(axdt axdtVar, int i) {
        dviq dviqVar = axdtVar.V(i).d;
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
        axdsVar.br();
        axdsVar.C.remove(i);
    }

    @Override // defpackage.awwx
    public final void f(axdr axdrVar) {
        if (axdrVar.c) {
            axdrVar.bF();
            axdrVar.c = false;
        }
        axds axdsVar = axds.ac;
        ((axds) axdrVar.b).C = axds.ck();
    }

    @Override // defpackage.awwx
    public final void g(drbi drbiVar) {
        if (drbiVar.c) {
            drbiVar.bF();
            drbiVar.c = false;
        }
        drbj drbjVar = (drbj) drbiVar.b;
        drbj drbjVar2 = drbj.Z;
        drbjVar.b |= ImageMetadata.SHADING_MODE;
        drbjVar.U = true;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ dqpe h(dvhq dvhqVar) {
        dqpe dqpeVar = dvhqVar.a;
        return dqpeVar == null ? dqpe.f : dqpeVar;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ dvhq i(dvix dvixVar) {
        dvhq dvhqVar = ((dviw) dvixVar).J;
        return dvhqVar == null ? dvhq.d : dvhqVar;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ dvhq j(axdt axdtVar, int i) {
        dvhq dvhqVar = axdtVar.V(i).c;
        return dvhqVar == null ? dvhq.d : dvhqVar;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ void k(axdr axdrVar, dvhq dvhqVar, @dzsi dviq dviqVar, long j) {
        dvhq dvhqVar2 = dvhqVar;
        axdf bZ = axdg.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        axdg axdgVar = (axdg) bZ.b;
        dvhqVar2.getClass();
        axdgVar.c = dvhqVar2;
        int i = axdgVar.a | 2;
        axdgVar.a = i;
        int i2 = i | 1;
        axdgVar.a = i2;
        axdgVar.b = j;
        if (dviqVar != null) {
            dviqVar.getClass();
            axdgVar.d = dviqVar;
            axdgVar.a = i2 | 4;
        }
        axdg bK = bZ.bK();
        if (axdrVar.c) {
            axdrVar.bF();
            axdrVar.c = false;
        }
        axds axdsVar = (axds) axdrVar.b;
        axds axdsVar2 = axds.ac;
        bK.getClass();
        axdsVar.br();
        axdsVar.C.add(0, bK);
    }

    @Override // defpackage.awwx
    public final int l(dvix dvixVar) {
        dvhq dvhqVar = ((dviw) dvixVar).J;
        if (dvhqVar == null) {
            dvhqVar = dvhq.d;
        }
        int a2 = drbt.a(dvhqVar.c);
        if (a2 == 0) {
            return 1;
        }
        return a2;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ int m(dssj dssjVar) {
        int a2 = drbt.a(((dvhq) dssjVar).c);
        if (a2 == 0) {
            return 1;
        }
        return a2;
    }
}
