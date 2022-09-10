package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: bbfg  reason: default package */
/* loaded from: classes3.dex */
public class bbfg {
    public final Set<bbff> a = new HashSet();
    public final Set<bbfe> b = new HashSet();
    public bbfb c;
    private final bbez d;
    private final akpm e;
    private final dehq f;

    public bbfg(bbez bbezVar, akpm akpmVar, dehq dehqVar) {
        bbes bbesVar = new bbes();
        bbesVar.a = akqi.a;
        bbesVar.b(dspd.b);
        bbesVar.d(Collections.emptyList());
        bbesVar.c(false);
        this.c = bbesVar.a();
        this.d = bbezVar;
        this.e = akpmVar;
        this.f = dehqVar;
    }

    public final void a(bbfa bbfaVar) {
        this.c = bbfaVar.a();
        for (bbff bbffVar : this.a) {
            bbffVar.b(this.c);
        }
    }

    public final void b(Throwable th) {
        bbfa e = this.c.e();
        e.d(Collections.emptyList());
        e.c(false);
        a(e);
        for (bbfe bbfeVar : this.b) {
            bbfeVar.a(th);
        }
    }

    public final void c() {
        if (this.c.d()) {
            return;
        }
        bbfa e = this.c.e();
        e.b(this.c.b());
        bvqg bvqgVar = new bvqg(this) { // from class: bbfc
            private final bbfg a;

            {
                this.a = this;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                bbfg bbfgVar = this.a;
                dkzh dkzhVar = (dkzh) obj;
                if (dkzhVar.a.size() == 0) {
                    bbfgVar.b(new Throwable("No recommended places found in server response."));
                    return;
                }
                bbfa e2 = bbfgVar.c.e();
                e2.d(dkzhVar.a);
                e2.b(dkzhVar.b);
                e2.c(false);
                bbfgVar.a(e2);
            }
        };
        bvrj.UI_THREAD.c();
        if (this.c.d()) {
            return;
        }
        e.c(true);
        a(e);
        bbez bbezVar = this.d;
        akqi a = this.c.a();
        dspd b = this.c.b();
        akpm akpmVar = this.e;
        dhjx Y = akpmVar.Y(akpmVar.n());
        deig d = deig.d();
        dkze bZ = dkzf.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dkzf dkzfVar = (dkzf) bZ.b;
        b.getClass();
        int i = dkzfVar.a | 1;
        dkzfVar.a = i;
        dkzfVar.b = b;
        Y.getClass();
        dkzfVar.d = Y;
        dkzfVar.a = i | 4;
        if (!a.equals(akqi.a)) {
            dkzi bZ2 = dkzj.c.bZ();
            String o = a.o();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dkzj dkzjVar = (dkzj) bZ2.b;
            o.getClass();
            dkzjVar.a = 1 | dkzjVar.a;
            dkzjVar.b = o;
            dkzj bK = bZ2.bK();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dkzf dkzfVar2 = (dkzf) bZ.b;
            bK.getClass();
            dsrj<dkzj> dsrjVar = dkzfVar2.c;
            if (!dsrjVar.a()) {
                dkzfVar2.c = dsqw.cl(dsrjVar);
            }
            dkzfVar2.c.add(bK);
        }
        ((buur) bbezVar.a).b().b(bZ.bK(), new bbey(d), bbezVar.b);
        deha.q(d, new bbfd(this, bvqgVar), this.f);
    }
}
