package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: bkke  reason: default package */
/* loaded from: classes3.dex */
public class bkke {
    public final cclp a;
    public final bhru b;
    public final bkoj c;
    public final cjqy d;
    private final bklr e;

    public bkke(cclp cclpVar, bhru bhruVar, cjqy cjqyVar, bklr bklrVar, bkoj bkojVar) {
        this.a = cclpVar;
        this.b = bhruVar;
        this.d = cjqyVar;
        this.e = bklrVar;
        this.c = bkojVar;
    }

    public final boolean a(bwrs<ilo> bwrsVar) {
        this.a.a(bwrsVar);
        bkoj bkojVar = this.c;
        bkojVar.b = bwrsVar;
        cclp cclpVar = this.a;
        if (bkojVar.a() || bkojVar.a.f(cclpVar)) {
            return true;
        }
        ilo iloVar = (ilo) bwrs.b(bkojVar.b);
        dbsk.s(iloVar);
        return iloVar.aA();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final bklk b(bknf bknfVar, bwrs<ilo> bwrsVar) {
        bkkj bkkjVar;
        List<ccln> e;
        if (((ilo) bwrs.b(bwrsVar)) == null) {
            return this.e.a(bkkj.b, dcdc.e(), bwrsVar, bknfVar, false);
        }
        this.a.a(bwrsVar);
        bklr bklrVar = this.e;
        ccri ccriVar = (ccri) this.a;
        if (bwrs.b(ccriVar.c) == null) {
            bvoo.h("Attempted to get menu list from a placemark-less accessor.", new Object[0]);
            bkkjVar = bkkj.b;
        } else {
            ccriVar.d(dgfb.DISH);
            bkkjVar = ccriVar.b.b;
        }
        bkkj bkkjVar2 = bkkjVar;
        if (this.b.f(this.a)) {
            e = this.a.b(dgfb.DISH);
        } else {
            e = dcdc.e();
        }
        return bklrVar.a(bkkjVar2, e, bwrsVar, bknfVar, this.a.c(dgfb.DISH));
    }
}
