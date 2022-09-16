package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: baie  reason: default package */
/* loaded from: classes2.dex */
public final class baie implements Serializable {
    public static baie a = null;
    private static baie c = null;
    private static baie d = null;
    private static final long serialVersionUID = 2274324892792009998L;
    public final bahx[] b;
    private final String e;

    static {
        new HashMap(32);
    }

    public baie(String str, bahx[] bahxVarArr) {
        this.e = str;
        this.b = bahxVarArr;
    }

    public static baie c() {
        baie baieVar = d;
        if (baieVar == null) {
            baie baieVar2 = new baie("Seconds", new bahx[]{bahx.k});
            d = baieVar2;
            return baieVar2;
        }
        return baieVar;
    }

    public static baie d() {
        baie baieVar = c;
        if (baieVar == null) {
            baie baieVar2 = new baie("Standard", new bahx[]{bahx.d, bahx.e, bahx.f, bahx.g, bahx.i, bahx.j, bahx.k, bahx.l});
            c = baieVar2;
            return baieVar2;
        }
        return baieVar;
    }

    public final int a(bahx bahxVar) {
        int b = b();
        for (int i = 0; i < b; i++) {
            if (this.b[i] == bahxVar) {
                return i;
            }
        }
        return -1;
    }

    public final int b() {
        return this.b.length;
    }

    public final boolean e(bahx bahxVar) {
        return a(bahxVar) >= 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof baie) {
            return Arrays.equals(this.b, ((baie) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int i2 = 0;
        while (true) {
            bahx[] bahxVarArr = this.b;
            if (i < bahxVarArr.length) {
                i2 += bahxVarArr[i].hashCode();
                i++;
            } else {
                return i2;
            }
        }
    }

    public final String toString() {
        String str = this.e;
        StringBuilder sb = new StringBuilder(str.length() + 12);
        sb.append("PeriodType[");
        sb.append(str);
        sb.append("]");
        return sb.toString();
    }
}
