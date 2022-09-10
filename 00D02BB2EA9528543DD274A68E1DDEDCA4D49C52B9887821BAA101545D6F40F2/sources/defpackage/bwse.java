package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bwse  reason: default package */
/* loaded from: classes4.dex */
public final class bwse {
    final /* synthetic */ bwsf a;

    public bwse(bwsf bwsfVar) {
        this.a = bwsfVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(alih alihVar) {
        akve akveVar = (akve) alihVar.a(akve.class);
        if (akveVar == null) {
            return;
        }
        bwsf bwsfVar = this.a;
        if (bwsfVar.f == null) {
            bwsfVar.m();
        }
        bwsfVar.d.j(bwsfVar.f, cjtd.a(dtyb.ec));
        bwsf bwsfVar2 = this.a;
        akra akraVar = alihVar.a;
        String str = akveVar.b;
        bwzp k = bwsfVar2.k();
        if (k != null) {
            akraVar.S();
            k.aU();
        }
        bwsfVar2.c.a().a(akraVar, str, bwsfVar2.e, true, new bwsc(bwsfVar2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(alij alijVar) {
        akvg akvgVar = (akvg) alijVar.a(akvg.class);
        if (akvgVar == null) {
            return;
        }
        bwsf bwsfVar = this.a;
        if (bwsfVar.g == null) {
            bwsfVar.m();
        }
        bwsfVar.d.j(bwsfVar.g, cjtd.a(dtyb.eb));
        bwsf bwsfVar2 = this.a;
        akra akraVar = alijVar.a;
        dggg dgggVar = akvgVar.b;
        if (dgggVar == null) {
            dgggVar = dggg.d;
        }
        bwsd bwsdVar = new bwsd(bwsfVar2);
        if (dgggVar == null) {
            bwsfVar2.c.a().a(akraVar, null, false, false, bwsdVar);
            return;
        }
        bwuy a = bwsfVar2.c.a();
        dhjy bZ = dhjz.e.bZ();
        double k = akraVar.k();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhjz dhjzVar = (dhjz) bZ.b;
        dhjzVar.a |= 2;
        dhjzVar.c = k;
        double o = akraVar.o();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhjz dhjzVar2 = (dhjz) bZ.b;
        dhjzVar2.a |= 1;
        dhjzVar2.b = o;
        dhjz bK = bZ.bK();
        buti butiVar = a.a;
        dwfy bZ2 = dwge.m.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dwge dwgeVar = (dwge) bZ2.b;
        dwgeVar.b = 4;
        dwgeVar.a |= 1;
        dwge dwgeVar2 = (dwge) bZ2.b;
        dgggVar.getClass();
        dwgeVar2.c();
        dwgeVar2.d.add(dgggVar);
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dwge dwgeVar3 = (dwge) bZ2.b;
        bK.getClass();
        dwgeVar3.e = bK;
        int i = dwgeVar3.a | 32;
        dwgeVar3.a = i;
        dwgeVar3.a = i | 64;
        dwgeVar3.g = 25.0d;
        dwfv b = bwuy.b(null, false);
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dwge dwgeVar4 = (dwge) bZ2.b;
        b.getClass();
        dwgeVar4.h = b;
        dwgeVar4.a |= 128;
        butiVar.b(bZ2.bK(), bwsdVar, a.b);
    }
}
