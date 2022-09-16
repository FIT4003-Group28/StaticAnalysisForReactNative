package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: byke  reason: default package */
/* loaded from: classes4.dex */
public class byke implements byil {
    public static final dcqe a = dcqe.c("byke");
    public final cjqy b;
    public byny c;
    private final List<byng> d;
    private final jib e;
    private final bynx f;
    private final akpm g;
    private final gll h;
    private final dxio<akzh> i;
    private final jco j = new bykd(this);

    public byke(Activity activity, bynr bynrVar, bynx bynxVar, akpm akpmVar, dxio<akzh> dxioVar, gll gllVar, cjqy cjqyVar, byny bynyVar) {
        this.i = dxioVar;
        boolean z = true;
        if (!bynyVar.isEmpty() && !bynyVar.a()) {
            z = false;
        }
        dbsk.a(z);
        this.f = bynxVar;
        this.g = akpmVar;
        this.h = gllVar;
        this.b = cjqyVar;
        dccx F = dcdc.F();
        Iterator it = bynyVar.iterator();
        while (it.hasNext()) {
            F.g(bynrVar.a(bykb.a, activity, amwb.F((dozz) it.next()), false, false, new bykc(this), null));
        }
        this.d = F.f();
        this.c = bynyVar;
        this.e = jib.g(activity, activity.getString(R.string.TRAFFIC_NEARBY));
    }

    @Override // defpackage.jbk
    public jib NC() {
        return this.e;
    }

    @Override // defpackage.byil
    public List<byng> b() {
        return this.d;
    }

    @Override // defpackage.byil
    public Integer c() {
        return Integer.valueOf(this.c.c);
    }

    @Override // defpackage.byil
    public jco d() {
        return this.j;
    }

    @Override // defpackage.byil
    public cjtd e() {
        return cjtd.a(dtyc.bi);
    }

    public void f() {
        dozz b = this.c.b();
        if (b != null) {
            this.f.a(dcdc.f(b), -1, null);
        }
    }

    public void g() {
        this.f.b();
    }

    public void h() {
        dozz b;
        dozs dozsVar;
        doud doudVar;
        byny bynyVar = this.c;
        if (bynyVar == null || this.h == null || this.g == null || this.i == null || (b = bynyVar.b()) == null) {
            return;
        }
        if (b.b == 22) {
            dozsVar = (dozs) b.c;
        } else {
            dozsVar = dozs.q;
        }
        dozr dozrVar = dozsVar.l;
        if (dozrVar == null) {
            dozrVar = dozr.e;
        }
        if (dozrVar.b == 1) {
            doudVar = (doud) dozrVar.c;
        } else {
            doudVar = doud.c;
        }
        akqs akqsVar = null;
        if (doudVar.a.size() >= 2 && doudVar.b.size() >= 2) {
            akqsVar = akrk.g(doudVar).b();
        }
        if (akqsVar == null) {
            return;
        }
        dbsg<akyc> d = akyt.d(akqsVar, this.h.b(), this.i.a().A());
        if (!d.a()) {
            return;
        }
        this.g.p(d.b());
    }
}
