package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: cbba  reason: default package */
/* loaded from: classes4.dex */
public class cbba extends ibd implements cbqy {
    private static final dcqe h = dcqe.c("cbba");
    public final gga g;
    private final ges i;
    private final dcdc<cbqx> j;
    private final List<cbqu> k;
    private final cqkj l;
    private final cbay m;
    private final dpvi n;
    @dzsi
    private final dpvi o;
    @dzsi
    private final dpsd p;

    public cbba(dpvi dpviVar, @dzsi dpvi dpviVar2, @dzsi dpsd dpsdVar, ges gesVar, gn gnVar, cqhn cqhnVar, cjqy cjqyVar, gga ggaVar, cqkj cqkjVar) {
        super(cqhnVar, cjqyVar);
        this.n = dpviVar;
        this.o = dpviVar2;
        this.p = dpsdVar;
        this.i = gesVar;
        this.g = ggaVar;
        this.l = cqkjVar;
        cbay cbayVar = new cbay(dpviVar, dpviVar2, dpsdVar, gnVar, new Runnable(this) { // from class: cbav
            private final cbba a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cqkx.p(this.a);
            }
        });
        this.m = cbayVar;
        this.k = cbayVar.a;
        this.j = dcdc.i(new cbaz(cbqv.DAILY, ggaVar), new cbaz(cbqv.WEEKLY, ggaVar), new cbaz(cbqv.MONTHLY, ggaVar), new cbaz(cbqv.CUSTOM, ggaVar));
    }

    @Override // defpackage.cbqy
    public jib e() {
        gga ggaVar = this.g;
        jhz e = jib.g(ggaVar, ggaVar.getString(R.string.REPEATING_EVENT_TITLE)).e();
        e.i = cqrt.g(2131232205, ibm.t());
        e.f(new View.OnClickListener(this) { // from class: cbaw
            private final cbba a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.f();
            }
        });
        e.x = false;
        return e.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f() {
        cbqb.a(this.i, new Runnable(this) { // from class: cbax
            private final cbba a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.g.onBackPressed();
            }
        }, this.l, cjtd.a(dtyd.j), cjtd.a(dtyd.k));
    }

    @Override // defpackage.cbqy
    public String g() {
        return this.g.getString(R.string.DONE);
    }

    @Override // defpackage.cbqy
    public cqkl h() {
        cbqt q = q();
        if (q == null || !q.h().booleanValue()) {
            bvoo.h("Edit submitted on recurring pattern view model that is null or invalid.", new Object[0]);
            return cqkl.a;
        }
        dpsd a = q.a();
        if (a == null) {
            bvoo.h("Edit submitted on recurring pattern view model that has no pattern.", new Object[0]);
            return cqkl.a;
        }
        dpsc bZ = dpsd.f.bZ();
        cbqv l = l();
        cbqv cbqvVar = cbqv.DAILY;
        int ordinal = l.ordinal();
        if (ordinal == 0) {
            dpoh dpohVar = a.b;
            if (dpohVar == null) {
                dpohVar = dpoh.c;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dpsd dpsdVar = (dpsd) bZ.b;
            dpohVar.getClass();
            dpsdVar.b = dpohVar;
            dpsdVar.a |= 1;
        } else if (ordinal == 1) {
            bZ.a(a.c);
        } else if (ordinal == 2) {
            dsrj<dpyf> dsrjVar = a.d;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dpsd dpsdVar2 = (dpsd) bZ.b;
            dpsdVar2.c();
            dsod.bv(dsrjVar, dpsdVar2.d);
        } else if (ordinal == 3) {
            dsrj<dqhp> dsrjVar2 = a.e;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dpsd dpsdVar3 = (dpsd) bZ.b;
            dpsdVar3.d();
            dsod.bv(dsrjVar2, dpsdVar3.e);
        }
        q.d(bZ.bK());
        this.i.Nw(q);
        this.g.onBackPressed();
        return cqkl.a;
    }

    @Override // defpackage.cbqy
    public Boolean i() {
        return q().h();
    }

    @Override // defpackage.cbqy
    public String j() {
        return this.g.getString(R.string.CANCEL_BUTTON);
    }

    @Override // defpackage.cbqy
    public cqkl k() {
        f();
        return cqkl.a;
    }

    public cbqv l() {
        return o().get(b().intValue()).h();
    }

    public void m(cbqv cbqvVar) {
        n(cbqvVar, null);
    }

    @Override // defpackage.cbqy
    public List<cbqx> o() {
        return this.j;
    }

    @Override // defpackage.cbqy
    public gt p() {
        return this.m;
    }

    public cbqt q() {
        cbqt cbqtVar = null;
        for (int i = 0; i < this.k.size(); i++) {
            if (this.k.get(i).g().equals(l())) {
                cbqtVar = this.k.get(i).i();
            }
        }
        if (cbqtVar != null) {
            return cbqtVar;
        }
        dpsd dpsdVar = this.p;
        dpvi dpviVar = this.n;
        dpvi dpviVar2 = this.o;
        return new cbau(dpsdVar, dpsdVar, dpviVar, dpviVar, dpviVar2, dpviVar2);
    }

    public void n(cbqv cbqvVar, @dzsi cbqu cbquVar) {
        int i;
        if (this.k != null && cbqvVar != null) {
            i = 0;
            while (i < this.k.size()) {
                if (this.k.get(i).g().equals(cbqvVar)) {
                    break;
                }
                i++;
            }
        }
        i = -1;
        if (i != -1) {
            NP(i);
        }
    }
}
