package defpackage;

import com.google.ar.core.ImageMetadata;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
/* compiled from: PG */
/* renamed from: agwg  reason: default package */
/* loaded from: classes2.dex */
public final class agwg implements agwa {
    private static final dcqe d = dcqe.c("agwg");
    @dzsi
    private static agwo n;
    public final cqat a;
    public final btrm b;
    private final agwh f;
    private final dxio<akfa> g;
    private final dxio<agwp> h;
    @dzsi
    private crzp<btlu> i;
    @dzsi
    private btlu l;
    private final HashSet<agvz> e = new HashSet<>();
    private volatile long j = Long.MIN_VALUE;
    @dzsi
    private dehn<diqz> k = null;
    @dzsi
    private dehn<dlbu> m = null;
    public btlu c = btlu.a;

    public agwg(cqat cqatVar, agwh agwhVar, btrm btrmVar, dxio<akfa> dxioVar, dxio<agwp> dxioVar2) {
        this.a = cqatVar;
        this.f = agwhVar;
        this.b = btrmVar;
        this.g = dxioVar;
        this.h = dxioVar2;
    }

    private final synchronized void r(agwo agwoVar) {
        Iterator<agvz> it = this.e.iterator();
        while (it.hasNext()) {
            agvz next = it.next();
            if (next != null) {
                next.a(agwoVar);
            }
        }
        n = agwoVar;
    }

    private static void s(btlu btluVar) {
        dbsk.l(btluVar.l());
    }

    @Override // defpackage.agwa
    public final synchronized void a(agvz agvzVar) {
        this.e.add(agvzVar);
    }

    @Override // defpackage.agwa
    public final synchronized void b(agvz agvzVar) {
        this.e.remove(agvzVar);
    }

    @Override // defpackage.agwa
    @dzsi
    public final agwo c() {
        return n;
    }

    @Override // defpackage.agwa
    public final void d() {
        if (this.i == null) {
            this.i = new crzp(this) { // from class: agwb
                private final agwg a;

                {
                    this.a = this;
                }

                @Override // defpackage.crzp
                public final void On(crzm crzmVar) {
                    agwg agwgVar = this.a;
                    btlu q = btlu.q((btlu) crzmVar.l());
                    if (!q.l() || !q.equals(agwgVar.c)) {
                        agwgVar.p();
                        agwgVar.b.b(new agwo(1, agwgVar.a.e()));
                    }
                    agwgVar.c = q;
                }
            };
        }
        crzm<btlu> C = this.g.a().C();
        crzp<btlu> crzpVar = this.i;
        dbsk.s(crzpVar);
        C.d(crzpVar, dege.a);
    }

    @Override // defpackage.agwa
    public final void e() {
        if (this.i == null) {
            bvoo.h("Call onStart() before calling onStop().", new Object[0]);
            return;
        }
        crzm<btlu> C = this.g.a().C();
        crzp<btlu> crzpVar = this.i;
        dbsk.s(crzpVar);
        C.c(crzpVar);
    }

    @Override // defpackage.agwa
    public final boolean f(@dzsi btlu btluVar) {
        return this.h.a().a(btluVar);
    }

    @Override // defpackage.agwa
    @Deprecated
    public final dehn<dirj> g(List<dkzo> list, dkzq dkzqVar) {
        btlu btluVar = this.c;
        s(btluVar);
        return n(btluVar, list, dkzqVar);
    }

    @Override // defpackage.agwa
    public final dehn<dirj> h(final btlu btluVar, dlas dlasVar, dkzq dkzqVar) {
        return deew.h(degp.q(this.f.a(btluVar, dcdc.e(), dcdc.f(dlasVar), dkzqVar)), new dbrn(this, btluVar) { // from class: agwd
            private final agwg a;
            private final btlu b;

            {
                this.a = this;
                this.b = btluVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                agwg agwgVar = this.a;
                dirj dirjVar = (dirj) obj;
                agwgVar.p();
                agwgVar.q();
                return dirjVar;
            }
        }, dege.a);
    }

    @Override // defpackage.agwa
    @Deprecated
    public final dehn<dlbu> j(akqs akqsVar, dkzq dkzqVar) {
        btlu btluVar = this.c;
        s(btluVar);
        dehn<dlbu> dehnVar = this.m;
        if (dehnVar != null) {
            dehnVar.cancel(true);
        }
        dehn<dlbu> c = this.f.c(btluVar, akqsVar, dkzqVar);
        this.m = c;
        return c;
    }

    @Override // defpackage.agwa
    public final dehn<List<dldj>> k(btlu btluVar) {
        return deew.h(i(btluVar), agwe.a, dege.a);
    }

    @Override // defpackage.agwa
    public final dehn<Void> l(btlu btluVar, dldl dldlVar) {
        return deew.h(degp.q(this.f.d(btluVar, dldlVar)), new dbrn(this) { // from class: agwf
            private final agwg a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                diql diqlVar = (diql) obj;
                this.a.p();
                return null;
            }
        }, dege.a);
    }

    final synchronized boolean m(btlu btluVar) {
        if (this.k != null && this.j >= 0 && this.a.e() <= this.j + 600000 && dbsd.a(this.l, btluVar)) {
            dehn<diqz> dehnVar = this.k;
            if (dehnVar != null && dehnVar.isDone()) {
                try {
                    this.k.get();
                } catch (InterruptedException | ExecutionException unused) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final synchronized dehn<dirj> n(final btlu btluVar, List<dkzo> list, dkzq dkzqVar) {
        return deew.h(degp.q(this.f.a(btluVar, list, dcdc.e(), dkzqVar)), new dbrn(this, btluVar) { // from class: agwc
            private final agwg a;
            private final btlu b;

            {
                this.a = this;
                this.b = btluVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                agwg agwgVar = this.a;
                dirj dirjVar = (dirj) obj;
                agwgVar.p();
                agwgVar.q();
                return dirjVar;
            }
        }, dege.a);
    }

    @Override // defpackage.agwa
    /* renamed from: o */
    public final synchronized degp<diqz> i(btlu btluVar) {
        if (m(btluVar)) {
            agwh agwhVar = this.f;
            diqu diquVar = (diqu) diqx.g.bZ();
            if (diquVar.c) {
                diquVar.bF();
                diquVar.c = false;
            }
            diqx diqxVar = (diqx) diquVar.b;
            diqxVar.a |= 8;
            diqxVar.c = true;
            diqx diqxVar2 = (diqx) diquVar.b;
            diqxVar2.a |= 16;
            diqxVar2.d = true;
            diqx diqxVar3 = (diqx) diquVar.b;
            diqxVar3.a |= 32;
            diqxVar3.e = true;
            dnqg bZ = dnqh.p.bZ();
            dnmu dnmuVar = dnmu.PROPERTY_GMM;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnqh dnqhVar = (dnqh) bZ.b;
            dnqhVar.l = dnmuVar.ap;
            dnqhVar.a |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
            if (diquVar.c) {
                diquVar.bF();
                diquVar.c = false;
            }
            diqx diqxVar4 = (diqx) diquVar.b;
            dnqh bK = bZ.bK();
            bK.getClass();
            diqxVar4.f = bK;
            diqxVar4.a |= 64;
            this.k = agwhVar.b(btluVar, (diqx) diquVar.bK());
            this.l = btluVar;
            this.j = this.a.e();
        }
        dehn<diqz> dehnVar = this.k;
        if (dehnVar != null) {
            return degp.q(dehnVar);
        }
        bvoo.f(new IllegalStateException("The returned response should never be null."));
        return degp.q(deha.c());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void p() {
        dehn<diqz> dehnVar = this.k;
        if (dehnVar != null) {
            dehnVar.cancel(true);
            this.k = null;
            this.l = null;
        }
    }

    public final void q() {
        agwo agwoVar = new agwo(2, this.a.e());
        this.b.b(agwoVar);
        r(agwoVar);
    }
}
