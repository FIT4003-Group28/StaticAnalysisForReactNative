package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: awym  reason: default package */
/* loaded from: classes.dex */
public final class awym implements awwx<dnva> {
    static final awym a = new awym();

    @Override // defpackage.awwx
    public final int a(axdt axdtVar) {
        return axdtVar.k();
    }

    @Override // defpackage.awwx
    public final int b(dkut dkutVar) {
        return dkutVar.o;
    }

    @Override // defpackage.awwx
    public final long c(axdt axdtVar, int i) {
        return ((axds) axdtVar).k.get(i).b;
    }

    @Override // defpackage.awwx
    public final dviq d(axdt axdtVar, int i) {
        dviq dviqVar = axdtVar.l(i).d;
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
        axdsVar.aZ();
        axdsVar.k.remove(i);
    }

    @Override // defpackage.awwx
    public final void f(axdr axdrVar) {
        if (axdrVar.c) {
            axdrVar.bF();
            axdrVar.c = false;
        }
        axds axdsVar = axds.ac;
        ((axds) axdrVar.b).k = axds.ck();
    }

    @Override // defpackage.awwx
    public final void g(drbi drbiVar) {
        if (drbiVar.c) {
            drbiVar.bF();
            drbiVar.c = false;
        }
        drbj drbjVar = (drbj) drbiVar.b;
        drbj drbjVar2 = drbj.Z;
        drbjVar.b |= 8192;
        drbjVar.O = true;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ dqpe h(dnva dnvaVar) {
        dqpe dqpeVar = dnvaVar.a;
        return dqpeVar == null ? dqpe.f : dqpeVar;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ dnva i(dvix dvixVar) {
        dnva dnvaVar = ((dviw) dvixVar).h;
        return dnvaVar == null ? dnva.c : dnvaVar;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ dnva j(axdt axdtVar, int i) {
        dnva dnvaVar = axdtVar.l(i).c;
        return dnvaVar == null ? dnva.c : dnvaVar;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ void k(axdr axdrVar, dnva dnvaVar, @dzsi dviq dviqVar, long j) {
        dnva dnvaVar2 = dnvaVar;
        axek bZ = axel.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        axel axelVar = (axel) bZ.b;
        dnvaVar2.getClass();
        axelVar.c = dnvaVar2;
        int i = axelVar.a | 2;
        axelVar.a = i;
        int i2 = i | 1;
        axelVar.a = i2;
        axelVar.b = j;
        if (dviqVar != null) {
            dviqVar.getClass();
            axelVar.d = dviqVar;
            axelVar.a = i2 | 4;
        }
        axel bK = bZ.bK();
        if (axdrVar.c) {
            axdrVar.bF();
            axdrVar.c = false;
        }
        axds axdsVar = (axds) axdrVar.b;
        axds axdsVar2 = axds.ac;
        bK.getClass();
        axdsVar.aZ();
        axdsVar.k.add(0, bK);
    }

    @Override // defpackage.awwx
    public final int l(dvix dvixVar) {
        dnva dnvaVar = ((dviw) dvixVar).h;
        if (dnvaVar == null) {
            dnvaVar = dnva.c;
        }
        int a2 = drbt.a(dnvaVar.b);
        if (a2 == 0) {
            return 1;
        }
        return a2;
    }

    @Override // defpackage.awwx
    public final /* bridge */ /* synthetic */ int m(dssj dssjVar) {
        int a2 = drbt.a(((dnva) dssjVar).b);
        if (a2 == 0) {
            return 1;
        }
        return a2;
    }
}
