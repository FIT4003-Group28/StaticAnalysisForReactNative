package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: awwu  reason: default package */
/* loaded from: classes3.dex */
public final class awwu implements awwx<dqsb> {
    static final awwu a = new awwu();

    @Override // defpackage.awwx
    public final int a(axdt axdtVar) {
        return axdtVar.aQ();
    }

    @Override // defpackage.awwx
    public final int b(dkut dkutVar) {
        return dkutVar.V;
    }

    @Override // defpackage.awwx
    public final long c(axdt axdtVar, int i) {
        return ((axds) axdtVar).aa.get(i).b;
    }

    @Override // defpackage.awwx
    public final dviq d(axdt axdtVar, int i) {
        dviq dviqVar = axdtVar.aR(i).d;
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
        axdsVar.bP();
        axdsVar.aa.remove(i);
    }

    @Override // defpackage.awwx
    public final void f(axdr axdrVar) {
        if (axdrVar.c) {
            axdrVar.bF();
            axdrVar.c = false;
        }
        axds axdsVar = axds.ac;
        ((axds) axdrVar.b).aa = axds.ck();
    }

    @Override // defpackage.awwx
    public final void g(drbi drbiVar) {
        if (drbiVar.c) {
            drbiVar.bF();
            drbiVar.c = false;
        }
        drbj drbjVar = (drbj) drbiVar.b;
        drbj drbjVar2 = drbj.Z;
        drbjVar.a |= 1;
        drbjVar.c = true;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ dqpe h(dqsb dqsbVar) {
        dqpe dqpeVar = dqsbVar.a;
        return dqpeVar == null ? dqpe.f : dqpeVar;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ dqsb i(dvix dvixVar) {
        dqsb dqsbVar = ((dviw) dvixVar).T;
        return dqsbVar == null ? dqsb.d : dqsbVar;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ dqsb j(axdt axdtVar, int i) {
        dqsb dqsbVar = axdtVar.aR(i).c;
        return dqsbVar == null ? dqsb.d : dqsbVar;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ void k(axdr axdrVar, dqsb dqsbVar, @dzsi dviq dviqVar, long j) {
        dqsb dqsbVar2 = dqsbVar;
        axch bZ = axci.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        axci axciVar = (axci) bZ.b;
        dqsbVar2.getClass();
        axciVar.c = dqsbVar2;
        int i = axciVar.a | 2;
        axciVar.a = i;
        int i2 = i | 1;
        axciVar.a = i2;
        axciVar.b = j;
        if (dviqVar != null) {
            dviqVar.getClass();
            axciVar.d = dviqVar;
            axciVar.a = i2 | 4;
        }
        axci bK = bZ.bK();
        if (axdrVar.c) {
            axdrVar.bF();
            axdrVar.c = false;
        }
        axds axdsVar = (axds) axdrVar.b;
        axds axdsVar2 = axds.ac;
        bK.getClass();
        axdsVar.bP();
        axdsVar.aa.add(0, bK);
    }

    @Override // defpackage.awwx
    public final int l(dvix dvixVar) {
        dqsb dqsbVar = ((dviw) dvixVar).T;
        if (dqsbVar == null) {
            dqsbVar = dqsb.d;
        }
        int a2 = drbt.a(dqsbVar.b);
        if (a2 == 0) {
            return 1;
        }
        return a2;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ int m(dssj dssjVar) {
        int a2 = drbt.a(((dqsb) dssjVar).b);
        if (a2 == 0) {
            return 1;
        }
        return a2;
    }
}
