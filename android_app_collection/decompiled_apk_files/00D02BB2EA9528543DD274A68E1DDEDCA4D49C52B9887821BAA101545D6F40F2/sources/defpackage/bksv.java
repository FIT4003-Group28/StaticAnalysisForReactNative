package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: bksv  reason: default package */
/* loaded from: classes3.dex */
public class bksv implements bksa {
    public final int a;
    public final bkrx b;
    @dzsi
    public final bkry c;
    public final bkpj d;
    private final btvo f;
    private final bktc g;
    private final bksi h;
    private final bksl i;
    private final int j;
    private bkse n;
    private final cqqw l = new bksr(this);
    private CharSequence m = "";
    @dzsi
    private String o = null;
    private List<bksb> p = dcdc.e();
    private List<bksb> q = dcdc.e();
    @dzsi
    private bksk r = null;
    private Map<drdk, djck> s = dcmn.a;
    @dzsi
    public djck e = null;
    private boolean t = false;
    private final boolean k = true;

    public bksv(Activity activity, Resources resources, btvo btvoVar, cqhn cqhnVar, cqhu cqhuVar, bktc bktcVar, bksi bksiVar, bksl bkslVar, bkpk bkpkVar, bkrx bkrxVar, @dzsi bkry bkryVar, boolean z, boolean z2) {
        this.f = btvoVar;
        this.g = bktcVar;
        this.h = bksiVar;
        this.i = bkslVar;
        this.a = jmj.a(activity, 16);
        this.j = jmj.a(activity, 58);
        this.b = bkrxVar;
        this.c = bkryVar;
        bksm bksmVar = new bksm(this);
        Activity activity2 = (Activity) ((dxjd) bkpkVar.a).a;
        bkpk.a(activity2, 1);
        bkpk.a(bkpkVar.b.a(), 2);
        bkpk.a(bkpkVar.c.a(), 3);
        bkpk.a(this, 4);
        this.d = new bkpj(activity2, this, bksmVar);
    }

    @dzsi
    private final bktb E() {
        if (this.e != null) {
            for (bksb bksbVar : this.p) {
                if (bksbVar instanceof bktb) {
                    bktb bktbVar = (bktb) bksbVar;
                    if (bktbVar.k().equals(this.e)) {
                        return bktbVar;
                    }
                }
            }
        }
        return null;
    }

    private final void F(@dzsi djck djckVar) {
        this.e = null;
        for (bksb bksbVar : this.p) {
            if (bksbVar instanceof bktb) {
                bktb bktbVar = (bktb) bksbVar;
                if (!bktbVar.k().equals(djckVar)) {
                    bktbVar.l(false);
                } else {
                    this.e = djckVar;
                    bktbVar.l(true);
                }
            }
        }
    }

    private final int G() {
        bkse bkseVar = this.n;
        if (bkseVar == null || !bkseVar.f().booleanValue()) {
            bktb E = E();
            int indexOf = E == null ? 0 : this.p.indexOf(E);
            if (indexOf != -1) {
                return indexOf;
            }
            return 0;
        }
        return this.p.size();
    }

    @dzsi
    private final RecyclerView H() {
        for (View view : cqkx.n(this)) {
            View a = cqhu.a(view, bkqo.a);
            if (a != null) {
                return (RecyclerView) a;
            }
        }
        return null;
    }

    public void A() {
        this.d.c();
    }

    public void B() {
        this.d.c();
    }

    public dbsg<Integer> C() {
        return this.d.b;
    }

    public bkpj D() {
        return this.d;
    }

    @Override // defpackage.bksa
    public void a(drdk drdkVar, @dzsi String str) {
        p(this.s.get(drdkVar), str);
    }

    @Override // defpackage.bksa
    public List<bksb> b() {
        return this.p;
    }

    @Override // defpackage.bksa
    public List<bksb> c() {
        return this.q;
    }

    @Override // defpackage.bksa
    @dzsi
    public bkrw d() {
        return this.r;
    }

    @Override // defpackage.bksa
    @dzsi
    public bkse e() {
        return this.n;
    }

    @Override // defpackage.bksa
    public Float f() {
        return Float.valueOf(w().booleanValue() ? this.d.d() : 0.0f);
    }

    @Override // defpackage.bksa
    public Boolean g() {
        return Boolean.valueOf(f().floatValue() > 0.0f);
    }

    @Override // defpackage.bksa
    public Boolean h() {
        return Boolean.valueOf(f().floatValue() < 1.0f);
    }

    @Override // defpackage.bksa
    public cqqw i() {
        return this.l;
    }

    @Override // defpackage.bksa
    public CharSequence j() {
        return this.m;
    }

    @Override // defpackage.bksa
    public Boolean k() {
        boolean z = false;
        if (w().booleanValue() && G() != 0) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bksa
    public Boolean l() {
        return Boolean.valueOf(this.t);
    }

    public void m(bkse bkseVar) {
        this.n = bkseVar;
        if (bkseVar instanceof bktk) {
            ((bktk) bkseVar).v(new bksn(this));
        }
    }

    public void n(bkrz bkrzVar) {
        this.d.a = bkrzVar;
    }

    public void o() {
        p(null, null);
    }

    public final void p(@dzsi djck djckVar, @dzsi String str) {
        if (!this.k) {
            this.b.a(djckVar, str);
            return;
        }
        if (djckVar != null) {
            q();
        }
        F(djckVar);
        bktb E = E();
        if (E != null && !c().contains(E)) {
            s();
        }
        r();
        this.b.a(this.e, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void q() {
        bkse bkseVar = this.n;
        if (bkseVar == null) {
            return;
        }
        bkseVar.a().a("");
        this.n.l(true);
    }

    public void r() {
        int G;
        final aag aagVar;
        bkse bkseVar = this.n;
        if (bkseVar == null || !bkseVar.m().booleanValue()) {
            G = G();
        } else {
            G = this.p.size();
        }
        RecyclerView H = H();
        if (H == null || (aagVar = (aag) H.l) == null) {
            return;
        }
        final bkss bkssVar = new bkss(this, H.getContext());
        bkssVar.g = G;
        H.post(new Runnable(aagVar, bkssVar) { // from class: bkso
            private final aag a;
            private final aah b;

            {
                this.a = aagVar;
                this.b = bkssVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.aw(this.b);
            }
        });
    }

    public List<bksb> s() {
        List<bksb> e;
        if (this.r == null) {
            return dcdc.e();
        }
        this.r = null;
        int size = this.q.size();
        if (size < 0 || size >= this.p.size()) {
            e = dcdc.e();
        } else {
            List<bksb> list = this.p;
            e = list.subList(size, list.size());
        }
        this.b.a(this.e, null);
        cqkx.p(this);
        RecyclerView H = H();
        if (H == null) {
            return e;
        }
        if (H.p) {
            ViewTreeObserver viewTreeObserver = H.getViewTreeObserver();
            viewTreeObserver.addOnPreDrawListener(new bkst(this, viewTreeObserver));
        } else {
            H.addOnAttachStateChangeListener(new bksu(this));
        }
        return e;
    }

    @Override // defpackage.bega
    public void t(bwrs<ilo> bwrsVar) {
        ilo c = bwrsVar.c();
        dbsk.s(c);
        if (!this.f.getUgcParameters().ap().a) {
            u();
            return;
        }
        djup bE = c.bE();
        if (bE.a.size() <= 0) {
            u();
        } else if (this.f.getUgcParameters().ap().c) {
            u();
            this.t = true;
            cqkx.p(this);
        } else {
            boolean z = false;
            boolean z2 = this.r == null;
            String o = c.ai().o();
            String str = this.o;
            if (str == null || !str.equals(o)) {
                this.e = null;
                z2 = false;
            }
            this.o = o;
            dcdg p = dcdn.p();
            for (djck djckVar : bE.a) {
                drdk drdkVar = djckVar.b;
                if (drdkVar == null) {
                    drdkVar = drdk.c;
                }
                p.f(drdkVar, djckVar);
            }
            this.s = p.b();
            ArrayList arrayList = new ArrayList();
            for (djck djckVar2 : bE.a) {
                arrayList.add(this.g.a(c, djckVar2, new bksg(this) { // from class: bksp
                    private final bksv a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.bksg
                    public final void a(djck djckVar3) {
                        this.a.p(djckVar3, null);
                    }
                }, dtxy.nt));
            }
            List subList = arrayList.subList(0, Math.min(4, arrayList.size()));
            int size = arrayList.size() - subList.size();
            if (size >= 4) {
                z = true;
            }
            boolean z3 = (!z) | z2;
            ArrayList arrayList2 = new ArrayList();
            if (this.k) {
                Activity activity = (Activity) ((dxjd) this.h.a).a;
                bksi.a(activity, 1);
                bksi.a(this, 2);
                arrayList2.add(new bksh(activity, this));
            }
            dccx F = dcdc.F();
            F.i(arrayList2);
            F.i(arrayList);
            dcdc f = F.f();
            this.p = f;
            if (z3) {
                this.q = f;
                this.r = null;
            } else {
                dccx F2 = dcdc.F();
                F2.i(arrayList2);
                F2.i(subList);
                this.q = F2.f();
                bksl bkslVar = this.i;
                bksq bksqVar = new bksq(this);
                Activity activity2 = (Activity) ((dxjd) bkslVar.a).a;
                bksl.a(activity2, 1);
                cqhn a = bkslVar.b.a();
                bksl.a(a, 2);
                cqhu a2 = bkslVar.c.a();
                bksl.a(a2, 3);
                bksl.a(bksqVar, 5);
                this.r = new bksk(activity2, a, a2, size, bksqVar);
            }
            F(this.e);
            cqkx.p(this);
        }
    }

    @Override // defpackage.bega
    public void u() {
        this.o = null;
        this.p = dcdc.e();
        this.q = dcdc.e();
        this.s = dcmn.a;
        this.e = null;
        this.r = null;
        this.m = "";
        this.t = false;
        cqkx.p(this);
    }

    public int v() {
        if (H() != null && g().booleanValue()) {
            return this.j;
        }
        return 0;
    }

    @Override // defpackage.bega
    public Boolean w() {
        return Boolean.valueOf(!this.p.isEmpty());
    }

    public cqqw x() {
        return this.d;
    }

    public int y() {
        bkpj bkpjVar = this.d;
        return bkpjVar.f(bkpjVar.d);
    }

    public int z() {
        return this.d.f(2);
    }
}
