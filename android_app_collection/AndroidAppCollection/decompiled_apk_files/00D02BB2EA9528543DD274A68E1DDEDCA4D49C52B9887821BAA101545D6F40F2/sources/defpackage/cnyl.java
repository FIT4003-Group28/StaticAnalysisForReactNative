package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: cnyl  reason: default package */
/* loaded from: classes5.dex */
public final class cnyl {
    private final dsjo a;

    public cnyl(dsjo dsjoVar) {
        cnwc.a(dsjoVar);
        this.a = dsjoVar;
    }

    public final int a() {
        int a = dsjn.a(this.a.b);
        if (a == 0) {
            return 3;
        }
        return a;
    }

    public final long b() {
        return this.a.c;
    }

    public final long c() {
        return this.a.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cnyl)) {
            return false;
        }
        cnyl cnylVar = (cnyl) obj;
        return a() == cnylVar.a() && b() == cnylVar.b() && c() == cnylVar.c();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(a()), Long.valueOf(b()), Long.valueOf(c())});
    }

    public final String toString() {
        int a = a();
        if (a == 1) {
            String num = Integer.toString(a());
            long b = b();
            StringBuilder sb = new StringBuilder(String.valueOf(num).length() + 22);
            sb.append(num);
            sb.append("(");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        } else if (a != 2) {
            String num2 = Integer.toString(a());
            long b2 = b();
            long c = c();
            StringBuilder sb2 = new StringBuilder(String.valueOf(num2).length() + 44);
            sb2.append(num2);
            sb2.append("(");
            sb2.append(b2);
            sb2.append(", ");
            sb2.append(c);
            sb2.append(")");
            return sb2.toString();
        } else {
            String num3 = Integer.toString(a());
            long b3 = b();
            StringBuilder sb3 = new StringBuilder(String.valueOf(num3).length() + 22);
            sb3.append(num3);
            sb3.append("(");
            sb3.append(b3);
            sb3.append(")");
            return sb3.toString();
        }
    }
}
