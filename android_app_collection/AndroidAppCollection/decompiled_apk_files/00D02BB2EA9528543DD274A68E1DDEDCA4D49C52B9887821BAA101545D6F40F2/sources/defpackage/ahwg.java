package defpackage;

import com.google.android.apps.gmm.locationsharing.api.PersonId;
import com.google.android.apps.gmm.locationsharing.api.Profile;
/* compiled from: PG */
/* renamed from: ahwg  reason: default package */
/* loaded from: classes2.dex */
public abstract class ahwg {
    public static boolean g(dqzv dqzvVar) {
        return PersonId.b(dqzvVar) == null;
    }

    public static dbsg<ahwg> h(dqzv dqzvVar, ahvi ahviVar, boolean z, dbsg<eapd> dbsgVar) {
        dbsg<ahvj> dbsgVar2;
        if (g(dqzvVar)) {
            return dbpy.a;
        }
        PersonId b = PersonId.b(dqzvVar);
        dbsk.s(b);
        ahwk g = Profile.g();
        ahuw ahuwVar = (ahuw) g;
        ahuwVar.a = b;
        int i = dqzvVar.b;
        if (i == 1) {
            ahuwVar.d = p(((dqyj) dqzvVar.c).c);
            ahuwVar.b = p((dqzvVar.b == 1 ? (dqyj) dqzvVar.c : dqyj.f).d);
            ahuwVar.c = p((dqzvVar.b == 1 ? (dqyj) dqzvVar.c : dqyj.f).e);
        } else {
            if ((i == 2 ? (dqyb) dqzvVar.c : dqyb.j).b == 6) {
                dqyb dqybVar = dqzvVar.b == 2 ? (dqyb) dqzvVar.c : dqyb.j;
                dqya dqyaVar = dqybVar.b == 6 ? (dqya) dqybVar.c : dqya.e;
                ahuwVar.b = p(dqyaVar.b);
                ahuwVar.e = p(dqyaVar.c);
            }
        }
        dbsg i2 = b.c == ahwj.TOKEN ? dbpy.a : dbsg.i(g.a());
        if ((dqzvVar.a & 8) != 0) {
            dqzn dqznVar = dqzvVar.e;
            if (dqznVar == null) {
                dqznVar = dqzn.c;
            }
            doek doekVar = dqznVar.b;
            if (doekVar == null) {
                doekVar = doek.f;
            }
            dbsgVar2 = ((aibf) ahviVar).b(doekVar);
        } else {
            dbsgVar2 = dbpy.a;
        }
        return dbsg.i(new ahvc(dqzvVar, dbsgVar, i2, b, z, dbsgVar2));
    }

    private static dbsg<String> p(String str) {
        return str.isEmpty() ? dbpy.a : dbsg.i(str);
    }

    public abstract dqzv a();

    public abstract dbsg<eapd> b();

    public abstract dbsg<Profile> c();

    public abstract PersonId d();

    public abstract boolean e();

    public abstract dbsg<ahvj> f();

    public final boolean i() {
        int a = dqzq.a(a().d);
        return a != 0 && a == 2;
    }

    public final boolean j() {
        return a().b == 2;
    }

    public final boolean k() {
        int a = dqzq.a(a().d);
        return a != 0 && a == 4;
    }

    public final dbsg<String> l() {
        dqyb dqybVar;
        dqzv a = a();
        if (a.b == 2) {
            dqybVar = (dqyb) a.c;
        } else {
            dqybVar = dqyb.j;
        }
        return p(dqybVar.e);
    }

    public final dbsg<String> m() {
        dqyb dqybVar;
        dqzv a = a();
        if (a.b == 2) {
            dqybVar = (dqyb) a.c;
        } else {
            dqybVar = dqyb.j;
        }
        return p(dqybVar.d);
    }

    public final dbsg<String> n() {
        dqyb dqybVar;
        dqzv a = a();
        if (a.b == 2) {
            dqybVar = (dqyb) a.c;
        } else {
            dqybVar = dqyb.j;
        }
        return p(dqybVar.f);
    }

    public final dbsg<eaow> o(eapd eapdVar) {
        return (a().a & 16) != 0 ? dbsg.i(new eaow(eapdVar, new eapd(eaow.d(a().f).b))) : dbpy.a;
    }
}
