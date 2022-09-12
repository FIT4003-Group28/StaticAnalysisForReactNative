package defpackage;

import com.google.android.apps.gmm.locationsharing.api.PersonId;
import com.google.android.apps.gmm.locationsharing.api.Profile;
/* compiled from: PG */
/* renamed from: aink  reason: default package */
/* loaded from: classes2.dex */
public abstract class aink {
    private final dbsg<ahvg> B() {
        if (l().a()) {
            return l();
        }
        return m();
    }

    public static aink i(PersonId personId, dcdc<ahwg> dcdcVar, dcep<aioj> dcepVar, cqat cqatVar) {
        return new aimz(dbpy.a, personId, dcdcVar, dcdc.e(), dcepVar, 1, false, cqatVar);
    }

    public final boolean A() {
        return d().isEmpty() && j().isEmpty();
    }

    public abstract dbsg<Profile> a();

    public abstract PersonId b();

    public abstract dcdc<ahwg> c();

    public abstract dcdc<ahvg> d();

    public abstract dcep<aioj> e();

    public abstract Boolean f();

    public abstract cqat g();

    public abstract int h();

    public final dcdc<ahwg> j() {
        final eapd eapdVar = new eapd(g().b());
        return dcdc.q(dcft.i(c(), new dbsl(eapdVar) { // from class: ainc
            private final eapd a;

            {
                this.a = eapdVar;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                dbsg<eaow> o = ((ahwg) obj).o(this.a);
                return !((Boolean) (!o.a() ? dbpy.a : dbsg.i(Boolean.valueOf(o.b().p(eaow.a) ^ true))).c(false)).booleanValue();
            }
        }));
    }

    public final boolean k() {
        boolean e = m().a() ? m().b().e() : false;
        boolean e2 = u().a() ? u().b().e() : false;
        if (t().a()) {
            e2 = e2 || t().b().e();
        }
        return e2 || e || !e().isEmpty();
    }

    public final dbsg<ahvg> l() {
        return dbsg.j((ahvg) dcft.d(dcft.i(d(), aind.a), null));
    }

    public final dbsg<ahvg> m() {
        return dbsg.j((ahvg) dcft.d(dcft.i(d(), aine.a), null));
    }

    public final dbsg<dhjz> n() {
        dbsg<ahvg> B = B();
        return B.a() ? B.b().g() : dbpy.a;
    }

    public final dbsg<String> o() {
        return B().a() ? ahvg.m(B().b().b().b) : dbpy.a;
    }

    public final dbsg<eaow> p(eapd eapdVar) {
        dbsg<ahvg> B = B();
        return B.a() ? B.b().l(eapdVar) : dbpy.a;
    }

    public final dbsg<dqyd> q() {
        if (!l().a() || (l().b().b().a & 1024) == 0) {
            if (!m().a() || (m().b().b().a & 1024) == 0) {
                return dbpy.a;
            }
            dqyd dqydVar = m().b().b().h;
            if (dqydVar == null) {
                dqydVar = dqyd.d;
            }
            return dbsg.i(dqydVar);
        }
        dqyd dqydVar2 = l().b().b().h;
        if (dqydVar2 == null) {
            dqydVar2 = dqyd.d;
        }
        return dbsg.i(dqydVar2);
    }

    public final dbsg<ahvf> r(eapd eapdVar) {
        if (l().a()) {
            return dbsg.i(l().b().k(eapdVar));
        }
        return m().a() ? dbsg.i(m().b().k(eapdVar)) : dbpy.a;
    }

    public final boolean s(eapd eapdVar) {
        return !l().a() && m().a() && m().b().k(eapdVar) == ahvf.OBSOLETE;
    }

    public final dbsg<ahwg> t() {
        return dbsg.j((ahwg) dcft.d(dcft.i(j(), ainf.a), null));
    }

    public final dbsg<ahwg> u() {
        return dbsg.j((ahwg) dcft.d(dcft.i(j(), aing.a), null));
    }

    public final boolean v() {
        return dcft.j(c(), ainh.a);
    }

    public final dbsg<String> w() {
        if (t().a()) {
            return t().b().m();
        }
        return u().a() ? u().b().m() : dbpy.a;
    }

    public final dbsg<String> x() {
        return (dbsg) dcft.m(c(), aini.a).h(ainj.a).c(dbpy.a);
    }

    public final boolean y() {
        dbsg<ahwg> u = u();
        if (u.a()) {
            dqzu dqzuVar = u.b().a().g;
            if (dqzuVar == null) {
                dqzuVar = dqzu.b;
            }
            int a = dqzt.a(dqzuVar.a);
            if (a != 0 && a == 3) {
                return true;
            }
        }
        return false;
    }

    public final boolean z() {
        return !a().a() && !v() && !e().isEmpty();
    }
}
