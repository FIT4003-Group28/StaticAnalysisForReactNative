package defpackage;

import com.google.ar.core.ImageMetadata;
import java.util.Iterator;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cebq  reason: default package */
/* loaded from: classes4.dex */
public final class cebq {
    private final Executor a;
    private final busg b;

    public cebq(Executor executor, busg busgVar) {
        this.a = executor;
        this.b = busgVar;
    }

    public final void a(bwrs<ilo> bwrsVar, String str, final cebp cebpVar, Runnable runnable) {
        final dbsg dbsgVar;
        ilo c = bwrsVar.c();
        if (c != null) {
            Iterator<cdjd> it = c.by().iterator();
            while (true) {
                if (it.hasNext()) {
                    cdjd next = it.next();
                    if (str.equals(next.a().g())) {
                        dbsgVar = dbsg.i(next);
                        break;
                    }
                } else {
                    Iterator<djck> it2 = c.bE().a.iterator();
                    loop1: while (true) {
                        if (!it2.hasNext()) {
                            dbsgVar = dbpy.a;
                            break;
                        }
                        for (docg docgVar : it2.next().g) {
                            if (str.equals(docgVar.i)) {
                                dbsgVar = dbsg.i(cdrr.r(docgVar, cdja.PUBLISHED));
                                break loop1;
                            }
                        }
                    }
                }
            }
        } else {
            dbsgVar = dbpy.a;
        }
        if (!dbsgVar.a()) {
            dihm bZ = dihn.e.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dihn dihnVar = (dihn) bZ.b;
            str.getClass();
            dihnVar.a |= 1;
            dihnVar.b = str;
            dmbh bZ2 = dmbi.a.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dmbi.d((dmbi) bZ2.b);
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dmbi.e((dmbi) bZ2.b);
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dmbi.b((dmbi) bZ2.b);
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dmbi.f((dmbi) bZ2.b);
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dmbi.c((dmbi) bZ2.b);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dihn dihnVar2 = (dihn) bZ.b;
            dmbi bK = bZ2.bK();
            bK.getClass();
            dihnVar2.c = bK;
            dihnVar2.a |= 2;
            dnqg bZ3 = dnqh.p.bZ();
            dnmu dnmuVar = dnmu.PROPERTY_GMM;
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dnqh dnqhVar = (dnqh) bZ3.b;
            dnqhVar.l = dnmuVar.ap;
            dnqhVar.a |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dihn dihnVar3 = (dihn) bZ.b;
            dnqh bK2 = bZ3.bK();
            bK2.getClass();
            dihnVar3.d = bK2;
            dihnVar3.a |= 4;
            this.b.b(bZ.bK(), new cebo(cebpVar, runnable), this.a);
            return;
        }
        this.a.execute(new Runnable(cebpVar, dbsgVar) { // from class: cebn
            private final cebp a;
            private final dbsg b;

            {
                this.a = cebpVar;
                this.b = dbsgVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.a((cdjd) this.b.b());
            }
        });
    }
}
