package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: eapo  reason: default package */
/* loaded from: classes6.dex */
public final class eapo implements Serializable {
    static final int a;
    public static final int b;
    public static eapo c = null;
    private static eapo e = null;
    private static eapo f = null;
    private static eapo g = null;
    private static eapo h = null;
    private static eapo i = null;
    private static eapo j = null;
    private static eapo k = null;
    private static eapo l = null;
    private static final long serialVersionUID = 2274324892792009998L;
    public final eaoz[] d;
    private final String m;
    private final int[] n;

    static {
        new HashMap(32);
        a = 4;
        b = 5;
    }

    public eapo(String str, eaoz[] eaozVarArr, int[] iArr) {
        this.m = str;
        this.d = eaozVarArr;
        this.n = iArr;
    }

    public static eapo a() {
        eapo eapoVar = e;
        if (eapoVar == null) {
            eapo eapoVar2 = new eapo("Standard", new eaoz[]{eaoz.d, eaoz.e, eaoz.f, eaoz.g, eaoz.i, eaoz.j, eaoz.k, eaoz.l}, new int[]{0, 1, 2, 3, 4, 5, 6, 7});
            e = eapoVar2;
            return eapoVar2;
        }
        return eapoVar;
    }

    public static eapo b() {
        eapo eapoVar = f;
        if (eapoVar == null) {
            eapo eapoVar2 = new eapo("Years", new eaoz[]{eaoz.d}, new int[]{0, -1, -1, -1, -1, -1, -1, -1});
            f = eapoVar2;
            return eapoVar2;
        }
        return eapoVar;
    }

    public static eapo c() {
        eapo eapoVar = g;
        if (eapoVar == null) {
            eapo eapoVar2 = new eapo("Months", new eaoz[]{eaoz.e}, new int[]{-1, 0, -1, -1, -1, -1, -1, -1});
            g = eapoVar2;
            return eapoVar2;
        }
        return eapoVar;
    }

    public static eapo d() {
        eapo eapoVar = h;
        if (eapoVar == null) {
            eapo eapoVar2 = new eapo("Weeks", new eaoz[]{eaoz.f}, new int[]{-1, -1, 0, -1, -1, -1, -1, -1});
            h = eapoVar2;
            return eapoVar2;
        }
        return eapoVar;
    }

    public static eapo e() {
        eapo eapoVar = i;
        if (eapoVar == null) {
            eapo eapoVar2 = new eapo("Days", new eaoz[]{eaoz.g}, new int[]{-1, -1, -1, 0, -1, -1, -1, -1});
            i = eapoVar2;
            return eapoVar2;
        }
        return eapoVar;
    }

    public static eapo f() {
        eapo eapoVar = j;
        if (eapoVar == null) {
            eapo eapoVar2 = new eapo("Hours", new eaoz[]{eaoz.i}, new int[]{-1, -1, -1, -1, 0, -1, -1, -1});
            j = eapoVar2;
            return eapoVar2;
        }
        return eapoVar;
    }

    public static eapo g() {
        eapo eapoVar = k;
        if (eapoVar == null) {
            eapo eapoVar2 = new eapo("Minutes", new eaoz[]{eaoz.j}, new int[]{-1, -1, -1, -1, -1, 0, -1, -1});
            k = eapoVar2;
            return eapoVar2;
        }
        return eapoVar;
    }

    public static eapo h() {
        eapo eapoVar = l;
        if (eapoVar == null) {
            eapo eapoVar2 = new eapo("Seconds", new eaoz[]{eaoz.k}, new int[]{-1, -1, -1, -1, -1, -1, 0, -1});
            l = eapoVar2;
            return eapoVar2;
        }
        return eapoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof eapo) {
            return Arrays.equals(this.d, ((eapo) obj).d);
        }
        return false;
    }

    public final int hashCode() {
        int i2 = 0;
        int i3 = 0;
        while (true) {
            eaoz[] eaozVarArr = this.d;
            if (i2 < eaozVarArr.length) {
                i3 += eaozVarArr[i2].hashCode();
                i2++;
            } else {
                return i3;
            }
        }
    }

    public final int i() {
        return this.d.length;
    }

    public final boolean j(eaoz eaozVar) {
        return k(eaozVar) >= 0;
    }

    public final int k(eaoz eaozVar) {
        int i2 = i();
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.d[i3] == eaozVar) {
                return i3;
            }
        }
        return -1;
    }

    public final int l(eapu eapuVar, int i2) {
        int i3 = this.n[i2];
        if (i3 == -1) {
            return 0;
        }
        return eapuVar.h(i3);
    }

    public final String toString() {
        String str = this.m;
        StringBuilder sb = new StringBuilder(str.length() + 12);
        sb.append("PeriodType[");
        sb.append(str);
        sb.append("]");
        return sb.toString();
    }
}
