package defpackage;

import java.io.Serializable;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Set;
import java.util.TimeZone;
/* compiled from: PG */
/* renamed from: eapg  reason: default package */
/* loaded from: classes6.dex */
public final class eapg extends eaqj implements Serializable, eapt {
    private static final Set<eaoz> c;
    private static final long serialVersionUID = -8775358157899L;
    public final long a;
    public final eaok b;
    private volatile transient int d;

    static {
        HashSet hashSet = new HashSet();
        c = hashSet;
        hashSet.add(eaoz.g);
        hashSet.add(eaoz.f);
        hashSet.add(eaoz.e);
        hashSet.add(eaoz.c);
        hashSet.add(eaoz.d);
        hashSet.add(eaoz.b);
        hashSet.add(eaoz.a);
    }

    public eapg() {
        this(eaor.a(), earp.W());
    }

    public static eapg a() {
        return new eapg(eaor.a(), earp.W());
    }

    public static eapg b(eaou eaouVar) {
        if (eaouVar != null) {
            return new eapg(eaor.a(), earp.X(eaouVar));
        }
        throw new NullPointerException("Zone must not be null");
    }

    public static eapg c(String str) {
        return eaul.i.j(str);
    }

    public static eapg d(Date date) {
        if (date.getTime() < 0) {
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.setTime(date);
            int i = gregorianCalendar.get(0);
            int i2 = gregorianCalendar.get(1);
            if (i != 1) {
                i2 = 1 - i2;
            }
            return new eapg(i2, gregorianCalendar.get(2) + 1, gregorianCalendar.get(5));
        }
        return new eapg(date.getYear() + 1900, date.getMonth() + 1, date.getDate());
    }

    private Object readResolve() {
        if (this.b == null) {
            return new eapg(this.a, earp.E);
        }
        return !eaou.b.equals(this.b.a()) ? new eapg(this.a, this.b.b()) : this;
    }

    @Override // defpackage.eaqe, java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(eapt eaptVar) {
        return compareTo(eaptVar);
    }

    @Override // defpackage.eapt
    public final int e() {
        return 3;
    }

    @Override // defpackage.eaqe
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof eapg) {
            eapg eapgVar = (eapg) obj;
            if (this.b.equals(eapgVar.b)) {
                return this.a == eapgVar.a;
            }
        }
        return super.equals(obj);
    }

    @Override // defpackage.eaqe
    protected final eaon f(int i, eaok eaokVar) {
        if (i != 0) {
            if (i == 1) {
                return eaokVar.L();
            }
            if (i == 2) {
                return eaokVar.D();
            }
            StringBuilder sb = new StringBuilder(26);
            sb.append("Invalid index: ");
            sb.append(i);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        return eaokVar.N();
    }

    @Override // defpackage.eaqe
    public final int hashCode() {
        int i = this.d;
        if (i == 0) {
            int hashCode = super.hashCode();
            this.d = hashCode;
            return hashCode;
        }
        return i;
    }

    @Override // defpackage.eaqe, defpackage.eapt
    public final boolean i(eaop eaopVar) {
        eaoz a = eaopVar.a();
        if (c.contains(a) || a.a(this.b).d() >= this.b.B().d()) {
            return eaopVar.c(this.b).c();
        }
        return false;
    }

    @Override // defpackage.eapt
    public final eaok j() {
        return this.b;
    }

    @Override // defpackage.eaqe
    public final int k(eapt eaptVar) {
        if (this == eaptVar) {
            return 0;
        }
        if (eaptVar instanceof eapg) {
            eapg eapgVar = (eapg) eaptVar;
            if (this.b.equals(eapgVar.b)) {
                long j = this.a;
                long j2 = eapgVar.a;
                if (j < j2) {
                    return -1;
                }
                return j != j2 ? 1 : 0;
            }
        }
        return super.compareTo(eaptVar);
    }

    public final eaol l() {
        return m(null);
    }

    public final eaol m(eaou eaouVar) {
        eaou e = eaor.e(eaouVar);
        eaok c2 = this.b.c(e);
        return new eaol(c2.D().F(e.t(this.a + 21600000)), c2);
    }

    public final Date n() {
        int t = t();
        Date date = new Date(r() - 1900, s() - 1, t);
        eapg d = d(date);
        if (d.C(this)) {
            while (!d.equals(this)) {
                date.setTime(date.getTime() + 3600000);
                d = d(date);
            }
            while (date.getDate() == t) {
                date.setTime(date.getTime() - 1000);
            }
            date.setTime(date.getTime() + 1000);
        } else if (d.equals(this)) {
            Date date2 = new Date(date.getTime() - TimeZone.getDefault().getDSTSavings());
            if (date2.getDate() == t) {
                return date2;
            }
        }
        return date;
    }

    public final eapg o(long j) {
        long F = this.b.D().F(j);
        return F == this.a ? this : new eapg(F, this.b);
    }

    public final eapg p(int i) {
        return i == 0 ? this : o(this.b.B().e(this.a, i));
    }

    public final eapg q(int i) {
        return i == 0 ? this : o(this.b.B().g(this.a, i));
    }

    public final int r() {
        return this.b.N().d(this.a);
    }

    public final int s() {
        return this.b.L().d(this.a);
    }

    public final int t() {
        return this.b.D().d(this.a);
    }

    public final String toString() {
        return eaul.c.h(this);
    }

    public final int u() {
        return this.b.C().d(this.a);
    }

    public final eapg v(int i) {
        return o(this.b.D().p(this.a, i));
    }

    public final eapf w() {
        return new eapf(this, this.b.D());
    }

    public eapg(int i, int i2, int i3) {
        this(i, i2, i3, earp.E);
    }

    @Override // defpackage.eapt
    public final int g(int i) {
        if (i != 0) {
            if (i == 1) {
                return this.b.L().d(this.a);
            }
            if (i == 2) {
                return this.b.D().d(this.a);
            }
            StringBuilder sb = new StringBuilder(26);
            sb.append("Invalid index: ");
            sb.append(i);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        return this.b.N().d(this.a);
    }

    @Override // defpackage.eaqe, defpackage.eapt
    public final int h(eaop eaopVar) {
        if (eaopVar == null) {
            throw new IllegalArgumentException("The DateTimeFieldType must not be null");
        }
        if (i(eaopVar)) {
            return eaopVar.c(this.b).d(this.a);
        }
        String valueOf = String.valueOf(eaopVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
        sb.append("Field '");
        sb.append(valueOf);
        sb.append("' is not supported");
        throw new IllegalArgumentException(sb.toString());
    }

    public eapg(int i, int i2, int i3, eaok eaokVar) {
        eaok b = eaor.d(eaokVar).b();
        long d = b.d(i, i2, i3, 0);
        this.b = b;
        this.a = d;
    }

    public eapg(long j) {
        this(j, earp.W());
    }

    public eapg(long j, eaok eaokVar) {
        eaok d = eaor.d(eaokVar);
        long r = d.a().r(eaou.b, j);
        eaok b = d.b();
        this.a = b.D().F(r);
        this.b = b;
    }

    public eapg(long j, eaou eaouVar) {
        this(j, earp.X(eaouVar));
    }

    public eapg(Object obj) {
        easj c2 = easc.a().c(obj);
        eaok d = eaor.d(c2.e(obj));
        eaok b = d.b();
        this.b = b;
        int[] d2 = c2.d(this, obj, d, eaul.i);
        this.a = b.d(d2[0], d2[1], d2[2], 0);
    }

    public eapg(Object obj, eaou eaouVar) {
        easj c2 = easc.a().c(obj);
        eaok d = eaor.d(c2.b(obj, eaouVar));
        eaok b = d.b();
        this.b = b;
        int[] d2 = c2.d(this, obj, d, eaul.i);
        this.a = b.d(d2[0], d2[1], d2[2], 0);
    }
}
