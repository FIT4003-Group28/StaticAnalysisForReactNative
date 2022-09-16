package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: aogb  reason: default package */
/* loaded from: classes2.dex */
public abstract class aogb implements Comparable<aogb>, Serializable {
    public static aogb d(int i, int i2, int i3) {
        return new aofo(i, i2, i3);
    }

    public static aogb e(dngs dngsVar) {
        boolean z = false;
        dbsk.a(1 == (dngsVar.a & 1));
        dbsk.a((dngsVar.a & 2) != 0);
        dbsk.a((dngsVar.a & 4) != 0);
        dbsk.a(!((dngsVar.a & 8) != 0));
        dbsk.a(!((dngsVar.a & 16) != 0));
        if ((dngsVar.a & 32) != 0) {
            z = true;
        }
        dbsk.a(!z);
        return d(dngsVar.b, dngsVar.c, dngsVar.d);
    }

    public static aogb f(eapg eapgVar) {
        return d(eapgVar.r(), eapgVar.s() - 1, eapgVar.t());
    }

    public static dbsg<aogb> g(long j, eaou eaouVar, long j2, eaou eaouVar2) {
        eaol eaolVar = new eaol(j, eaouVar);
        eaol eaolVar2 = new eaol(j2, eaouVar2);
        if (eaolVar.C() >= 6 && eaolVar2.C() >= 6) {
            if (eaolVar.y() != eaolVar2.y() || eaolVar.z() != eaolVar2.z() || eaolVar.A() != eaolVar2.A()) {
                return dbpy.a;
            }
            return dbsg.i(d(eaolVar.y(), eaolVar.z() - 1, eaolVar.A()));
        }
        return dbpy.a;
    }

    public abstract int a();

    public abstract int b();

    public abstract int c();

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(aogb aogbVar) {
        aogb aogbVar2 = aogbVar;
        return dbzx.b.c(a(), aogbVar2.a()).c(b(), aogbVar2.b()).c(c(), aogbVar2.c()).i();
    }

    public final dngs h() {
        dngr bZ = dngs.h.bZ();
        int a = a();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dngs dngsVar = (dngs) bZ.b;
        dngsVar.a |= 1;
        dngsVar.b = a;
        int b = b();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dngs dngsVar2 = (dngs) bZ.b;
        dngsVar2.a |= 2;
        dngsVar2.c = b;
        int c = c();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dngs dngsVar3 = (dngs) bZ.b;
        dngsVar3.a |= 4;
        dngsVar3.d = c;
        return bZ.bK();
    }

    public final aogb i() {
        return l(-1);
    }

    public final aogb j() {
        return l(1);
    }

    public final boolean k(eapg eapgVar) {
        return m().equals(eapgVar);
    }

    public final aogb l(int i) {
        return f(m().p(i));
    }

    public final eapg m() {
        return new eapg(a(), b() + 1, c());
    }

    public final String toString() {
        return m().toString();
    }
}
