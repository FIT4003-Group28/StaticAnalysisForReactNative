package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: baze  reason: default package */
/* loaded from: classes3.dex */
public class baze extends bban implements bazv {
    private static final dcqe b = dcqe.c("baze");
    public final dxio<axwy> a;
    @dzsi
    private bayu c;
    private int h;
    private boolean i;
    @dzsi
    private Runnable j;
    private final axwb k;
    private final bayv l;
    private final bayy m;
    private final bazx n;
    private final wgc o;
    private final axwu p;
    private final ania q;
    @dzsi
    private final GmmLocation r;
    private final ivw s;

    public baze(gga ggaVar, ahjq ahjqVar, axwq axwqVar, bayv bayvVar, bayy bayyVar, bazx bazxVar, ania aniaVar, dxio<axwy> dxioVar, wgc wgcVar, axwu axwuVar) {
        super(ggaVar);
        this.c = null;
        this.h = -1;
        this.i = false;
        this.j = null;
        gga ggaVar2 = this.d;
        ivu ivuVar = ivu.FIXED;
        jaq jaqVar = jaq.MOD_DAY_NIGHT_WHITE_ON_BLUE;
        cqtd f = cqrt.f(2131231580);
        String string = this.d.getString(R.string.ACCESSIBILITY_ADD_PLACES_TO_LIST);
        cjta b2 = cjtd.b();
        b2.d = dtxu.a;
        this.s = new bazb(this, ggaVar2, ivuVar, jaqVar, f, string, b2.a());
        this.r = ahjqVar.a();
        this.k = axwqVar.x();
        this.l = bayvVar;
        this.m = bayyVar;
        this.n = bazxVar;
        this.q = aniaVar;
        this.a = dxioVar;
        this.o = wgcVar;
        this.p = axwuVar;
    }

    private static boolean B(dndr dndrVar) {
        return dndrVar == dndr.HOME || dndrVar == dndr.WORK;
    }

    private final bayj u(List<azva> list, dndr dndrVar) {
        dbsk.a(B(dndrVar));
        for (azva azvaVar : list) {
            if (azvaVar.a == dndrVar) {
                return x(azvaVar);
            }
        }
        return w(dndrVar);
    }

    private static dbsl<bayj> v(final azqv azqvVar) {
        return new dbsl(azqvVar) { // from class: baza
            private final azqv a;

            {
                this.a = azqvVar;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                azqv azqvVar2 = this.a;
                bayj bayjVar = (bayj) obj;
                if (bayjVar instanceof bayu) {
                    bayu bayuVar = (bayu) bayjVar;
                    return bayuVar.w().equals(azqvVar2.b) && bayuVar.h.equals(azqvVar2.c);
                }
                return false;
            }
        };
    }

    private final bayx w(dndr dndrVar) {
        return this.m.a(dndrVar);
    }

    private final bayu x(azva azvaVar) {
        akqq akqqVar = azvaVar.e;
        return this.l.a(azvaVar.a, azvaVar.b, azvaVar.c, azvaVar.d, akqqVar, azvaVar.f, azvaVar.g, batx.a(this.r, akqqVar), this.p);
    }

    @Override // defpackage.bban, defpackage.bayl
    public List<bayj> QI() {
        return this.q.a() ? super.QI() : dcbg.b(super.QI()).o(dbst.a(dbst.d(bazw.class))).z();
    }

    @Override // defpackage.bban, defpackage.bayl
    public Boolean d() {
        boolean z = false;
        if (!this.i && this.j == null) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public void e(boolean z) {
        this.i = true;
    }

    public void f(boolean z, @dzsi Runnable runnable) {
        this.i = false;
        this.j = runnable;
    }

    public void g(List<azva> list, List<azvo> list2) {
        ArrayList<bayj> arrayList = new ArrayList();
        for (azva azvaVar : list) {
            if (azvaVar.a == dndr.NICKNAME) {
                arrayList.add(x(azvaVar));
            }
        }
        for (azvo azvoVar : list2) {
            arrayList.add(this.n.a(azvoVar, this, batx.a(this.r, azvoVar.d())));
        }
        if (this.r != null) {
            for (bayj bayjVar : arrayList) {
                if (bayjVar.q() == null) {
                    Collections.sort(arrayList, bayj.b);
                    break;
                }
            }
            Collections.sort(arrayList, new bayi(this.r));
        } else {
            Collections.sort(arrayList, bayj.b);
            break;
        }
        this.e.clear();
        this.e.add(u(list, dndr.HOME));
        this.e.add(u(list, dndr.WORK));
        this.e.addAll(arrayList);
    }

    @Override // defpackage.bazv
    public void j(bayj bayjVar) {
        this.e.remove(bayjVar);
        cqkx.p(this);
    }

    @Override // defpackage.bazv
    public void k(long j) {
        Iterator<bayj> it = this.e.iterator();
        while (it.hasNext()) {
            bayj next = it.next();
            if ((next instanceof bazw) && ((bazw) next).i() == j) {
                it.remove();
            }
        }
        cqkx.p(this);
    }

    @Override // defpackage.bazv
    public void l() {
        this.k.b(new bazd(this));
    }

    @Override // defpackage.bban, defpackage.bayl
    @dzsi
    public jar m() {
        if (!d().booleanValue()) {
            wgc wgcVar = this.o;
            dvko dvkoVar = wgcVar.b.getPersonalPlacesParameters().b;
            if (dvkoVar == null) {
                dvkoVar = dvko.n;
            }
            if (dvkoVar.m && wgcVar.a.a()) {
                return this.s;
            }
            return null;
        }
        return null;
    }

    @Override // defpackage.bayl
    public baye n() {
        Runnable runnable;
        Runnable runnable2 = (this.i || (runnable = this.j) == null) ? null : runnable;
        if (runnable2 != null) {
            gga ggaVar = this.d;
            return new bbao(ggaVar, ggaVar.getString(R.string.LABELED_PLACES_RETRY_SYNC_HEADLINE_TEXT), cqqg.a((int) R.drawable.yourplaces_illustration_labeled), true, runnable2);
        }
        return new bazc();
    }

    public void s(azqv azqvVar) {
        bayu bayuVar;
        if (azqvVar.a == azvb.DELETE) {
            bayu bayuVar2 = (bayu) dcft.m(this.e, v(azqvVar)).f();
            if (bayuVar2 == null) {
                return;
            }
            this.h = this.e.indexOf(bayuVar2);
            this.c = bayuVar2;
            dndr w = bayuVar2.w();
            if (w != azqvVar.b || !bayuVar2.h.equals(azqvVar.c)) {
                return;
            }
            this.e.remove(bayuVar2);
            if (B(w)) {
                this.e.add(this.h, w(w));
            }
            cqkx.p(this);
            return;
        }
        int i = 0;
        if (azqvVar.a != azvb.UPDATE && azqvVar.a != azvb.EDIT) {
            bvoo.h("Unsupported alias operation in AliasChangedEvent: %s.", azqvVar.a.name());
            return;
        }
        dndr dndrVar = azqvVar.b;
        akqq akqqVar = azqvVar.f;
        bayv bayvVar = this.l;
        Long l = azqvVar.c;
        dbsk.s(l);
        bayu a = bayvVar.a(dndrVar, l, akqi.f(azqvVar.e), azqvVar.d, akqqVar, azqvVar.h, azqvVar.g, batx.a(this.r, akqqVar), this.p);
        if (B(dndrVar)) {
            List<bayj> list = this.e;
            if (dndrVar != dndr.HOME) {
                if (dndrVar != dndr.WORK) {
                    throw new IllegalArgumentException();
                }
                i = 1;
            }
            list.set(i, a);
        } else {
            int n = dcft.n(this.e, v(azqvVar));
            if (n >= 0) {
                this.e.set(n, a);
            } else if (this.h == -1 || (bayuVar = this.c) == null) {
                this.e.add(a);
            } else {
                Long l2 = azqvVar.c;
                if (l2 != null) {
                    this.e.add(this.h, new bayu(bayuVar.t, bayuVar.f, bayuVar.u, bayuVar.s, bayuVar.v, bayuVar.a, bayuVar.c, bayuVar.d, bayuVar.e, bayuVar.w, bayuVar.p, bayuVar.q, bayuVar.r, bayuVar.g, l2, bayuVar.l, bayuVar.i, bayuVar.m, bayuVar.j, bayuVar.k, bayuVar.n, bayuVar.o));
                }
                t();
            }
        }
        cqkx.p(this);
    }

    public final void t() {
        this.c = null;
        this.h = -1;
    }
}
