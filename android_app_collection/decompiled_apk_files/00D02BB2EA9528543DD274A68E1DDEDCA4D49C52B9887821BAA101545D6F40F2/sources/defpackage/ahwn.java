package defpackage;

import com.google.android.apps.gmm.locationsharing.api.PersonId;
import com.google.android.apps.gmm.locationsharing.api.Profile;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ahwn  reason: default package */
/* loaded from: classes2.dex */
public abstract class ahwn implements ahwl {
    static {
        TimeUnit.MINUTES.toMillis(2L);
        TimeUnit.MINUTES.toMillis(10L);
        TimeUnit.HOURS.toMillis(1L);
        TimeUnit.HOURS.toMillis(24L);
    }

    public static ahwm G(ahwl ahwlVar) {
        return ((ahwn) ahwlVar).n();
    }

    public static ahwm H() {
        ahux ahuxVar = new ahux();
        ahuxVar.b(false);
        ahuxVar.d(false);
        ahuxVar.f(0L);
        ahuxVar.g(0L);
        ahuxVar.k(dcdc.e());
        ahuxVar.l(false);
        ahuxVar.m(doep.i);
        return ahuxVar;
    }

    public static dbsg<String> I(Iterable<dqzv> iterable) {
        dqyb dqybVar;
        dqzv J = J(iterable);
        if (J != null) {
            if (J.b == 2) {
                dqybVar = (dqyb) J.c;
            } else {
                dqybVar = dqyb.j;
            }
            if ((dqybVar.a & 1) != 0) {
                return dbsg.j((J.b == 2 ? (dqyb) J.c : dqyb.j).d);
            }
        }
        return dbpy.a;
    }

    @dzsi
    public static dqzv J(Iterable<dqzv> iterable) {
        dqzv dqzvVar = null;
        long j = 0;
        for (dqzv dqzvVar2 : iterable) {
            int a = dqzq.a(dqzvVar2.d);
            if (a != 0 && a == 3) {
                long j2 = dqzvVar2.f;
                if (j < j2) {
                    dqzvVar = dqzvVar2;
                    j = j2;
                }
            }
            int a2 = dqzq.a(dqzvVar2.d);
            if (a2 != 0 && a2 == 2) {
                return dqzvVar2;
            }
        }
        return dqzvVar;
    }

    @Override // defpackage.ahwl
    public final long A(long j) {
        return Math.max(0L, j - y());
    }

    @Override // defpackage.ahwl
    public final boolean B() {
        return !g().isEmpty();
    }

    @Override // defpackage.ahwl
    public final boolean C() {
        return q().c == ahwj.TOKEN;
    }

    @Override // defpackage.ahwl
    public final boolean D() {
        int a;
        dqzv o = o();
        return (o == null || (a = dqzq.a(o.d)) == 0 || a != 2) ? false : true;
    }

    @Override // defpackage.ahwl
    public final long E(long j) {
        dqzv o = o();
        if (o == null) {
            return 0L;
        }
        return Math.max(0L, TimeUnit.SECONDS.toMillis(o.f) - j);
    }

    @Override // defpackage.ahwl
    public final void F(String str, PrintWriter printWriter) {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 14 + String.valueOf(hexString).length());
        sb.append(str);
        sb.append("SharingState #");
        sb.append(hexString);
        printWriter.println(sb.toString());
        PersonId q = q();
        String concat = String.valueOf(str).concat("  ");
        String hexString2 = Integer.toHexString(System.identityHashCode(q));
        StringBuilder sb2 = new StringBuilder(String.valueOf(concat).length() + 10 + String.valueOf(hexString2).length());
        sb2.append(concat);
        sb2.append("PersonId #");
        sb2.append(hexString2);
        printWriter.println(sb2.toString());
        String str2 = q.b;
        StringBuilder sb3 = new StringBuilder(String.valueOf(concat).length() + 5 + String.valueOf(str2).length());
        sb3.append(concat);
        sb3.append("  id=");
        sb3.append(str2);
        printWriter.println(sb3.toString());
        int ordinal = q.c.ordinal();
        StringBuilder sb4 = new StringBuilder(String.valueOf(concat).length() + 18);
        sb4.append(concat);
        sb4.append("  type=");
        sb4.append(ordinal);
        printWriter.println(sb4.toString());
        boolean i = i();
        StringBuilder sb5 = new StringBuilder(String.valueOf(str).length() + 24);
        sb5.append(str);
        sb5.append("  shareAclChanging=");
        sb5.append(i);
        printWriter.println(sb5.toString());
        boolean j = j();
        StringBuilder sb6 = new StringBuilder(String.valueOf(str).length() + 33);
        sb6.append(str);
        sb6.append("  requestLocationInProgress=");
        sb6.append(j);
        printWriter.println(sb6.toString());
        long k = k();
        StringBuilder sb7 = new StringBuilder(String.valueOf(str).length() + 52);
        sb7.append(str);
        sb7.append("  lastAskForLocationTimestampMs=");
        sb7.append(k);
        printWriter.println(sb7.toString());
        boolean l = l();
        StringBuilder sb8 = new StringBuilder(String.valueOf(str).length() + 30);
        sb8.append(str);
        sb8.append("  sharingWithCurrentUser=");
        sb8.append(l);
        printWriter.println(sb8.toString());
        boolean B = B();
        StringBuilder sb9 = new StringBuilder(String.valueOf(str).length() + 38);
        sb9.append(str);
        sb9.append("  isBeingSharedWithByCurrentUser=");
        sb9.append(B);
        printWriter.println(sb9.toString());
        boolean z = false;
        boolean z2 = q().c == ahwj.GAIA;
        StringBuilder sb10 = new StringBuilder(String.valueOf(str).length() + 19);
        sb10.append(str);
        sb10.append("  isGaiaShare=");
        sb10.append(z2);
        printWriter.println(sb10.toString());
        if (q().c == ahwj.PHONE || q().c == ahwj.EMAIL) {
            z = true;
        }
        StringBuilder sb11 = new StringBuilder(String.valueOf(str).length() + 22);
        sb11.append(str);
        sb11.append("  isContactShare=");
        sb11.append(z);
        printWriter.println(sb11.toString());
        long d = d();
        StringBuilder sb12 = new StringBuilder(String.valueOf(str).length() + 58);
        sb12.append(str);
        sb12.append("  lastShareAclModificationTimestampMs=");
        sb12.append(d);
        printWriter.println(sb12.toString());
        long y = y();
        StringBuilder sb13 = new StringBuilder(String.valueOf(str).length() + 42);
        sb13.append(str);
        sb13.append("  locationTimestampMs=");
        sb13.append(y);
        printWriter.println(sb13.toString());
        long e = e();
        StringBuilder sb14 = new StringBuilder(String.valueOf(str).length() + 53);
        sb14.append(str);
        sb14.append("  lastSharingActivityTimestampMs=");
        sb14.append(e);
        printWriter.println(sb14.toString());
    }

    @Override // defpackage.ahwl
    public abstract Profile a();

    @Override // defpackage.ahwl
    public abstract doep b();

    public abstract dbsg<ahvj> c();

    @Override // defpackage.ahwl
    public abstract long d();

    @Override // defpackage.ahwl
    public abstract long e();

    @Override // defpackage.ahwl
    public abstract long f();

    @Override // defpackage.ahwl
    public abstract dcdc<dqzv> g();

    public abstract boolean h();

    @Override // defpackage.ahwl
    public abstract boolean i();

    public abstract boolean j();

    public abstract long k();

    @Override // defpackage.ahwl
    public abstract boolean l();

    @Override // defpackage.ahwl
    public abstract dbsg<String> m();

    public abstract ahwm n();

    @dzsi
    public dqzv o() {
        throw null;
    }

    @Override // defpackage.ahwl
    public ajje p() {
        throw null;
    }

    @Override // defpackage.ahwl
    public final PersonId q() {
        return a().a();
    }

    @Override // defpackage.ahwl
    @dzsi
    public final dqyj r() {
        doep b = b();
        if ((b.a & 4) != 0) {
            dqyj dqyjVar = b.c;
            return dqyjVar == null ? dqyj.f : dqyjVar;
        }
        dqzv o = o();
        if (o != null && o.b == 1) {
            return (dqyj) o.c;
        }
        return null;
    }

    @Override // defpackage.ahwl
    public final String s() {
        return b().b;
    }

    @Override // defpackage.ahwl
    public final String t() {
        return a().b().c("");
    }

    public String toString() {
        dbsb b = dbsc.b(this);
        b.b("displayName", a().b());
        b.b("id", q().toString());
        b.b("locationDisplayName", x());
        return b.toString();
    }

    @Override // defpackage.ahwl
    public final String u() {
        return a().d().c("");
    }

    @Override // defpackage.ahwl
    @dzsi
    public final dhjz v() {
        dnol dnolVar = b().d;
        if (dnolVar == null) {
            dnolVar = dnol.g;
        }
        if ((dnolVar.a & 1) != 0) {
            dnol dnolVar2 = b().d;
            if (dnolVar2 == null) {
                dnolVar2 = dnol.g;
            }
            dhjz dhjzVar = dnolVar2.b;
            return dhjzVar == null ? dhjz.e : dhjzVar;
        }
        return null;
    }

    @Override // defpackage.ahwl
    public final boolean w() {
        return c().a();
    }

    @Override // defpackage.ahwl
    public final String x() {
        dnol dnolVar = b().d;
        if (dnolVar == null) {
            dnolVar = dnol.g;
        }
        return dnolVar.e;
    }

    @Override // defpackage.ahwl
    public final long y() {
        dnol dnolVar = b().d;
        if (dnolVar == null) {
            dnolVar = dnol.g;
        }
        return dnolVar.c;
    }

    @Override // defpackage.ahwl
    public final boolean z() {
        return b().e;
    }
}
