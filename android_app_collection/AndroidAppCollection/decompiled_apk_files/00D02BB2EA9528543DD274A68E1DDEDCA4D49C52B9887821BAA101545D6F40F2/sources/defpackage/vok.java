package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
/* compiled from: PG */
/* renamed from: vok  reason: default package */
/* loaded from: classes7.dex */
public final class vok implements voh {
    public static final dcqe a = dcqe.c("vok");
    public final Activity b;
    public final ahth c;
    public final vog d;
    public final dxio<bxzv> e;
    public final wts f;
    public boolean g = true;
    @dzsi
    public vnk h;
    @dzsi
    public zdy i;
    @dzsi
    public dehn<GmmLocation> j;
    @dzsi
    public akqq k;
    @dzsi
    public akqq l;
    @dzsi
    public wut m;
    private final dqvj n;
    @dzsi
    private byaa o;
    private final voi p;

    public vok(Activity activity, ahth ahthVar, vog vogVar, dxio<bxzv> dxioVar, wts wtsVar, dqvj dqvjVar) {
        this.b = activity;
        this.c = ahthVar;
        this.d = vogVar;
        this.e = dxioVar;
        this.f = wtsVar;
        this.n = dqvjVar;
        voi voiVar = new voi(this);
        this.p = voiVar;
        synchronized (vogVar.f) {
            vogVar.f.add(new vof(voiVar));
        }
    }

    @Override // defpackage.voh
    public final void a() {
        amsy i = i(this.h);
        if (i != null) {
            vog vogVar = this.d;
            voe b = vogVar.b(i);
            if (!b.b()) {
                b.a = true;
                Collection<wuv> c = b.c();
                Iterator<wuv> it = c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (it.next().r() != null) {
                        ArrayList arrayList = new ArrayList();
                        for (wuv wuvVar : b.c()) {
                            if (wuvVar.v() == 1) {
                                arrayList.add(wuvVar);
                            }
                        }
                        int size = arrayList.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            b.a(((wuv) arrayList.get(i2)).C(2));
                        }
                        dehn<Set<String>> dehnVar = vogVar.h;
                        if (dehnVar != null) {
                            dehnVar.cancel(true);
                        }
                        wto wtoVar = vogVar.e;
                        vogVar.h = deew.h(wtoVar.c(), wtg.a, wtoVar.a);
                        deha.q(vogVar.h, new vob(vogVar, i, b, c), vogVar.b);
                    }
                }
            }
            zdy zdyVar = this.i;
            if (zdyVar == null) {
                return;
            }
            cqkx.p(zdyVar);
        }
    }

    @Override // defpackage.voh
    @dzsi
    public final wuv b(@dzsi wut wutVar) {
        amsy i = i(this.h);
        if (i == null || wutVar == null) {
            return null;
        }
        return this.d.b(i).d(wutVar);
    }

    public final void c(zdy zdyVar) {
        zdy zdyVar2 = this.i;
        if (zdyVar2 != null) {
            if (dbsd.a(zdyVar2, zdyVar)) {
                return;
            }
            this.i = zdyVar;
            return;
        }
        if (this.g) {
            this.g = false;
            this.d.a();
        }
        this.i = zdyVar;
        g(this.k, this.m);
    }

    public final void d() {
        if (this.i == null) {
            return;
        }
        this.i = null;
        this.e.a().c();
    }

    public final void e(vnk vnkVar) {
        this.h = vnkVar;
        a();
    }

    public final void f(akqq akqqVar) {
        this.k = akqqVar;
        g(akqqVar, this.m);
    }

    public final void g(@dzsi akqq akqqVar, @dzsi wut wutVar) {
        wup m;
        wuv b = b(wutVar);
        if (this.e.a().d() || this.i == null || akqqVar == null || wutVar == null || b == null || (m = b.m()) == null) {
            return;
        }
        double a2 = m.a();
        int round = (int) Math.round(a2);
        int i = round;
        int i2 = 1;
        while (i <= 0 && i2 < 3) {
            i2++;
            double d = i2 * i2;
            Double.isNaN(d);
            i = (int) Math.round(d * a2);
        }
        if (i <= 0) {
            i2 = 1;
        }
        if (i > 0) {
            round = i;
        }
        akqs k = akqo.k(akqqVar, i2 * 1000);
        bxzx bZ = byaa.d.bZ();
        String str = ((wuk) wutVar).a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        byaa byaaVar = (byaa) bZ.b;
        str.getClass();
        byaaVar.a |= 1;
        byaaVar.b = str;
        bxzy bZ2 = bxzz.d.bZ();
        dgrt e = k.e();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        bxzz bxzzVar = (bxzz) bZ2.b;
        e.getClass();
        bxzzVar.b = e;
        bxzzVar.a |= 1;
        int min = Math.min(8, round);
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        bxzz bxzzVar2 = (bxzz) bZ2.b;
        bxzzVar2.a |= 2;
        bxzzVar2.c = min;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        byaa byaaVar2 = (byaa) bZ.b;
        bxzz bK = bZ2.bK();
        bK.getClass();
        byaaVar2.c = bK;
        byaaVar2.a |= 2;
        byaa bK2 = bZ.bK();
        this.o = bK2;
        if (h()) {
            return;
        }
        this.e.a().a(bK2, m.b());
    }

    public final boolean h() {
        String str;
        wuv b = b(this.m);
        akqq akqqVar = this.k;
        byaa byaaVar = this.o;
        if (this.i != null && akqqVar != null && b != null && b.v() != 4 && b.v() != 3) {
            if (this.e.a().d()) {
                this.e.a().c();
            }
            dgas g = b.g();
            if (g == null || (g.a & 1) == 0) {
                str = "";
            } else {
                Resources resources = this.b.getResources();
                str = resources.getString(R.string.DIRECTIONS_TAXI_CALLOUT_WAIT_TIME, bvtb.c(resources, g, bvsz.ABBREVIATED));
            }
            if (str.length() > 0) {
                wup m = b.m();
                bxzv a2 = this.e.a();
                String b2 = m == null ? null : m.b();
                akqq akqqVar2 = this.l;
                if (akqqVar2 != null) {
                    akqqVar = akqqVar2;
                }
                a2.b(byaaVar, b2, akqqVar, str);
                return true;
            }
        }
        return false;
    }

    @dzsi
    public final amsy i(@dzsi vnk vnkVar) {
        if (vnkVar != null) {
            dcdc<vnu> r = vnkVar.r();
            int size = r.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                vnu vnuVar = r.get(i);
                i++;
                if (vnuVar.a() == this.n) {
                    amte p = vnuVar.d().p();
                    if (p != null) {
                        return p.a;
                    }
                }
            }
        }
        return null;
    }

    public final void j(int i) {
        vnk vnkVar = this.h;
        if (vnkVar == null) {
            return;
        }
        synchronized (vnkVar) {
            int aW = vnkVar.aW(this.n);
            if (aW == -1) {
                return;
            }
            vnu vnuVar = vnkVar.r().get(aW);
            vnkVar.m(vnuVar.j(this.b, vnuVar.d().x(i)));
        }
    }
}
