package defpackage;

import android.app.Activity;
import com.google.android.apps.gmm.directions.framework.fetch.api.FetchState;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ucm  reason: default package */
/* loaded from: classes7.dex */
public class ucm implements ubt {
    public final Activity a;
    private boolean b;
    private boolean c;
    private final HashMap<tlv, ubv> d;
    private dcdc<ubo> e;
    private dbsg<tmd> f;
    private dbsg<FetchState> g;
    private final tur h;
    private final ucg i;
    private final ubw j;
    private final ucj k;
    private final ubq l;
    private final ucq m;
    @dzsi
    private jam n;

    public ucm(Activity activity, ubw ubwVar, uch uchVar, uck uckVar, uca ucaVar, ucq ucqVar, tur turVar, dbsg<tmd> dbsgVar, dbsg<FetchState> dbsgVar2) {
        this.a = activity;
        this.j = ubwVar;
        this.m = ucqVar;
        Activity activity2 = (Activity) ((dxjd) uchVar.a).a;
        uch.a(activity2, 1);
        suv a = uchVar.b.a();
        uch.a(a, 2);
        tgn a2 = uchVar.c.a();
        uch.a(a2, 3);
        cqhn a3 = uchVar.d.a();
        uch.a(a3, 4);
        cqat a4 = uchVar.e.a();
        uch.a(a4, 5);
        cqkj a5 = uchVar.f.a();
        uch.a(a5, 6);
        cqhu a6 = uchVar.g.a();
        uch.a(a6, 7);
        Executor a7 = uchVar.h.a();
        uch.a(a7, 8);
        this.i = new ucg(activity2, a, a2, a3, a4, a5, a6, a7);
        this.n = null;
        tgg a8 = uckVar.a.a();
        uck.a(a8, 1);
        cqhn a9 = uckVar.b.a();
        uck.a(a9, 2);
        this.k = new ucj(a8, a9);
        this.g = dbsgVar2;
        this.h = turVar;
        this.d = new HashMap<>();
        dccx F = dcdc.F();
        this.f = dbsgVar;
        if (dbsgVar.a()) {
            tmd b = this.f.b();
            turVar.a(b.g());
            dcdc<tlv> g = b.g();
            int size = g.size();
            boolean z = true;
            int i = 0;
            while (i < size) {
                tlv tlvVar = g.get(i);
                ubv a10 = ubwVar.a(tlvVar, z);
                this.d.put(tlvVar, a10);
                F.g(a10);
                i++;
                z = false;
            }
        }
        this.e = F.f();
        this.h.a(this.f.a() ? this.f.b().g() : dcdc.e());
        this.b = true;
        this.c = false;
        Activity activity3 = (Activity) ((dxjd) ucaVar.a).a;
        uca.a(activity3, 1);
        tgg a11 = ucaVar.b.a();
        uca.a(a11, 2);
        this.l = new ubz(activity3, a11);
    }

    private final boolean q() {
        return this.g.a() && this.g.b().a().a().equals(tgk.IN_PROGRESS);
    }

    @Override // defpackage.ubt
    public ubr a() {
        return this.i;
    }

    @Override // defpackage.ubt
    public dcdc<ubo> b() {
        return this.e;
    }

    @Override // defpackage.ubt
    @dzsi
    public jam c() {
        return this.n;
    }

    @Override // defpackage.ubt
    public Boolean d() {
        boolean z = false;
        if (q() && !this.f.a()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.ubt
    public Boolean e() {
        boolean z = false;
        if (f().booleanValue() && this.n == null) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.ubt
    public Boolean f() {
        return Boolean.valueOf(!this.b);
    }

    @Override // defpackage.ubt
    public Boolean g() {
        return Boolean.valueOf(this.c);
    }

    @Override // defpackage.ubt
    @dzsi
    public ubs h() {
        if (!this.f.a() || this.f.b().c().a() || this.f.b().c().h()) {
            return null;
        }
        return this.k;
    }

    @Override // defpackage.ubt
    @dzsi
    public ubq i() {
        if (!this.f.a() || !this.f.b().c().a()) {
            if (this.f.a() && this.f.b().c().h()) {
                return new ucl(this);
            }
            return null;
        }
        return this.l;
    }

    public void j() {
        this.i.g();
    }

    public void k() {
        this.i.h();
    }

    public void l(boolean z) {
        if (this.b != z) {
            this.b = z;
            cqkx.p(this);
        }
    }

    public void m(boolean z) {
        if (this.c != z) {
            this.c = z;
            cqkx.p(this);
        }
    }

    public void n(dbsg<FetchState> dbsgVar) {
        if (!this.g.equals(dbsgVar)) {
            this.g = dbsgVar;
            this.k.d(q());
            cqkx.p(this);
        }
    }

    public void o(dbsg<uco> dbsgVar) {
        if (dbsgVar.a()) {
            ucq ucqVar = this.m;
            uco b = dbsgVar.b();
            Activity activity = (Activity) ((dxjd) ucqVar.a).a;
            ucq.a(activity, 1);
            tgg a = ucqVar.b.a();
            ucq.a(a, 2);
            ucq.a(b, 3);
            this.n = new ucp(activity, a, b);
        } else {
            this.n = null;
        }
        cqkx.p(this);
    }

    public void p(dbsg<tmd> dbsgVar) {
        dcdc<tlv> dcdcVar;
        int i;
        dcdc<tlv> dcdcVar2;
        int i2;
        if (this.f.equals(dbsgVar)) {
            return;
        }
        dccx F = dcdc.F();
        this.f = dbsgVar;
        Set<tlv> keySet = this.d.keySet();
        if (this.f.a()) {
            tmd b = this.f.b();
            dcdc<tlv> g = b.g();
            int size = g.size();
            int i3 = 0;
            boolean z = true;
            while (i3 < size) {
                tlv tlvVar = g.get(i3);
                if (this.d.containsKey(tlvVar)) {
                    ubv ubvVar = this.d.get(tlvVar);
                    if (!tlvVar.equals(ubvVar.f) || ubvVar.j != z) {
                        ubvVar.f = tlvVar;
                        ubvVar.j = z;
                        ubvVar.h = ubvVar.f.y(ubvVar.b);
                        ubvVar.i = ubv.i(ubvVar.b.getResources(), ubvVar.f);
                        Set<amve> keySet2 = ubvVar.c.keySet();
                        dccx F2 = dcdc.F();
                        dcdc<amve> l = ubvVar.f.l();
                        int size2 = l.size();
                        int i4 = 0;
                        boolean z2 = true;
                        while (i4 < size2) {
                            amve amveVar = l.get(i4);
                            if (ubvVar.c.containsKey(amveVar)) {
                                keySet2.remove(amveVar);
                                F2.g(ubvVar.c.get(amveVar));
                                dcdcVar2 = g;
                                i2 = size;
                            } else {
                                dcdcVar2 = g;
                                i2 = size;
                                dbsg<ual> a = ubvVar.g.a(ubvVar.f, amveVar, ubvVar.j && z2);
                                if (a.a()) {
                                    F2.g(a.b());
                                    ubvVar.c.put(amveVar, a.b());
                                } else {
                                    i4++;
                                    g = dcdcVar2;
                                    size = i2;
                                }
                            }
                            z2 = false;
                            i4++;
                            g = dcdcVar2;
                            size = i2;
                        }
                        dcdcVar = g;
                        i = size;
                        ubvVar.c.keySet().removeAll(keySet2);
                        ubvVar.d = F2.f();
                        ubvVar.e = ubvVar.d.subList(0, ubvVar.f.n());
                        cqhn cqhnVar = ubvVar.a;
                        cqkx.p(ubvVar);
                    } else {
                        dcdcVar = g;
                        i = size;
                    }
                    F.g(ubvVar);
                    keySet.remove(tlvVar);
                } else {
                    dcdcVar = g;
                    i = size;
                    ubv a2 = this.j.a(tlvVar, z);
                    this.d.put(tlvVar, a2);
                    F.g(a2);
                }
                i3++;
                g = dcdcVar;
                size = i;
                z = false;
            }
            this.d.keySet().removeAll(keySet);
            this.i.k(dbsg.i(b.c().f()));
        } else {
            this.d.clear();
            this.i.k(dbpy.a);
        }
        this.e = F.f();
        this.h.a(this.f.a() ? this.f.b().g() : dcdc.e());
        cqkx.p(this);
    }
}
