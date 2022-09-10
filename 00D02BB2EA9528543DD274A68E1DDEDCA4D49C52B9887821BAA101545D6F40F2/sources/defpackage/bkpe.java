package defpackage;
/* compiled from: PG */
/* renamed from: bkpe  reason: default package */
/* loaded from: classes3.dex */
public abstract class bkpe {
    public abstract cdjd a();

    public abstract boolean b();

    public final cdjd c(cdjd cdjdVar, @dzsi bwrs<ilo> bwrsVar) {
        final docg h;
        ilo c;
        docg h2 = cdjdVar.h();
        if (!cdjdVar.a().g().equals(a().a().g())) {
            return cdjdVar;
        }
        if (b()) {
            dsqp dsqpVar = (dsqp) h2.cu(5);
            dsqpVar.bC(h2);
            docc doccVar = (docc) dsqpVar;
            int a = a().b().a();
            if (doccVar.c) {
                doccVar.bF();
                doccVar.c = false;
            }
            docg docgVar = (docg) doccVar.b;
            docg docgVar2 = docg.M;
            docgVar.a |= 4194304;
            docgVar.D = a;
            dqjh b = a().b().b();
            if (doccVar.c) {
                doccVar.bF();
                doccVar.c = false;
            }
            docg docgVar3 = (docg) doccVar.b;
            docgVar3.C = b.e;
            docgVar3.a |= 2097152;
            h = doccVar.bK();
        } else {
            h = a().h();
        }
        if (bwrsVar != null && (c = bwrsVar.c()) != null) {
            ily g = c.g();
            docg docgVar4 = c.bo().c;
            if (docgVar4 == null) {
                docgVar4 = docg.M;
            }
            if (docgVar4.i.equals(h.i) && !docgVar4.equals(h)) {
                g.v(h);
            }
            g.J(h.i, new dbrn(h) { // from class: bkpd
                private final docg a;

                {
                    this.a = h;
                }

                @Override // defpackage.dbrn
                public final Object a(Object obj) {
                    docg docgVar5 = (docg) obj;
                    return this.a;
                }
            });
            bwrsVar.d(g.d());
        }
        return cdrr.r(h, a().a().c());
    }
}
