package defpackage;

import com.google.android.apps.gmm.locationsharing.api.PersonId;
import com.google.android.apps.gmm.locationsharing.api.Profile;
/* compiled from: PG */
/* renamed from: ahvg  reason: default package */
/* loaded from: classes2.dex */
public abstract class ahvg {
    private static final eaow a = eaow.c(2);
    private static final eaow b = eaow.c(10);
    private static final eaow c = eaow.b(1);
    private static final eaow d = eaow.a(1);

    public static ahvg d(doep doepVar, ahvi ahviVar) {
        dbsg<ahvj> dbsgVar;
        dbsk.l((doepVar.a & 4) != 0);
        dqyj dqyjVar = doepVar.c;
        if (dqyjVar == null) {
            dqyjVar = dqyj.f;
        }
        PersonId a2 = PersonId.a(doepVar);
        ahwk g = Profile.g();
        ahuw ahuwVar = (ahuw) g;
        ahuwVar.a = a2;
        ahuwVar.b = m(dqyjVar.d);
        ahuwVar.c = m(dqyjVar.e);
        ahuwVar.d = m(dqyjVar.c);
        Profile a3 = g.a();
        if ((doepVar.a & 64) != 0) {
            doek doekVar = doepVar.f;
            if (doekVar == null) {
                doekVar = doek.f;
            }
            dbsgVar = ((aibf) ahviVar).b(doekVar);
        } else {
            dbsgVar = dbpy.a;
        }
        return new ahuz(a3, doepVar, dbsgVar);
    }

    public static dbsg<String> m(String str) {
        return str.isEmpty() ? dbpy.a : dbsg.i(str);
    }

    public abstract Profile a();

    public abstract doep b();

    public abstract dbsg<ahvj> c();

    public final boolean e() {
        return b().e;
    }

    public final dbsg<dqyh> f() {
        if ((b().a & 128) != 0) {
            dqyh dqyhVar = b().g;
            if (dqyhVar == null) {
                dqyhVar = dqyh.e;
            }
            return dbsg.i(dqyhVar);
        }
        return dbpy.a;
    }

    public final dbsg<dhjz> g() {
        dhjz dhjzVar;
        dnol dnolVar = b().d;
        if (dnolVar == null) {
            dnolVar = dnol.g;
        }
        if ((dnolVar.a & 1) != 0) {
            dnol dnolVar2 = b().d;
            if (dnolVar2 == null) {
                dnolVar2 = dnol.g;
            }
            dhjzVar = dnolVar2.b;
            if (dhjzVar == null) {
                dhjzVar = dhjz.e;
            }
        } else {
            dhjzVar = null;
        }
        return dbsg.j(dhjzVar);
    }

    public final dbsg<Integer> h() {
        if ((b().a & 8) != 0) {
            dnol dnolVar = b().d;
            if (dnolVar == null) {
                dnolVar = dnol.g;
            }
            return dbsg.i(Integer.valueOf(dnolVar.d));
        }
        return dbpy.a;
    }

    public final dbsg<String> i() {
        dnol dnolVar = b().d;
        if (dnolVar == null) {
            dnolVar = dnol.g;
        }
        return m(dnolVar.e);
    }

    public final dbsg<eapd> j() {
        if ((b().a & 8) != 0) {
            dnol dnolVar = b().d;
            if (dnolVar == null) {
                dnolVar = dnol.g;
            }
            return dbsg.j(new eapd(dnolVar.c));
        }
        return dbpy.a;
    }

    public final ahvf k(eapd eapdVar) {
        dbsg<eaow> l = l(eapdVar);
        if (!l.a() || l.b().p(d)) {
            return ahvf.OBSOLETE;
        }
        if (l.b().p(c)) {
            return ahvf.OLD;
        }
        if (l.b().p(b)) {
            return ahvf.STALE;
        }
        if (l.b().p(a)) {
            return ahvf.FRESH;
        }
        return ahvf.SUPER_FRESH;
    }

    public final dbsg<eaow> l(eapd eapdVar) {
        if (!j().a()) {
            return dbpy.a;
        }
        if (j().b().x(eapdVar)) {
            return dbsg.i(new eaow(j().b(), eapdVar));
        }
        return dbsg.i(eaow.a);
    }
}
