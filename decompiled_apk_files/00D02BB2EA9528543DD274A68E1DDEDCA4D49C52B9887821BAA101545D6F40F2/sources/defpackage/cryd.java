package defpackage;
/* compiled from: PG */
/* renamed from: cryd  reason: default package */
/* loaded from: classes5.dex */
public final class cryd {
    public int a;
    private int b;
    private boolean c;

    public static final int d(int i) {
        if (i == Integer.MIN_VALUE) {
            return 0;
        }
        return i;
    }

    private final void f(int i) {
        this.a |= i;
        this.b = i | this.b;
    }

    public final void a() {
        f(1);
    }

    public final void b() {
        f(16);
    }

    public final void c() {
        f(4);
    }

    public final void e() {
        f(32);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cryd) {
            cryd crydVar = (cryd) obj;
            if (this.b == crydVar.b) {
                boolean z = crydVar.c;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b + 961;
    }

    public final String toString() {
        int i = this.a;
        String str = (i & 16) != 0 ? "kill_animation " : "";
        String str2 = (i & 4) != 0 ? "no_overlay " : "";
        String str3 = 1 != (i & 1) ? "" : "crop ";
        String str4 = (i & 8) != 0 ? "smartcrop " : "";
        String str5 = (i & 32) != 0 ? "webp " : "";
        int length = str.length();
        int length2 = str2.length();
        StringBuilder sb = new StringBuilder(length + 18 + length2 + str3.length() + str4.length() + str5.length());
        sb.append("FifeUrlOptions{ ");
        sb.append(str);
        sb.append(str2);
        sb.append("");
        sb.append(str3);
        sb.append("");
        sb.append(str4);
        sb.append("");
        sb.append("");
        sb.append("");
        sb.append("");
        sb.append("");
        sb.append(str5);
        sb.append("");
        sb.append("");
        sb.append("");
        sb.append("");
        sb.append("");
        sb.append("");
        sb.append("");
        sb.append("");
        sb.append("");
        sb.append("");
        sb.append("");
        sb.append("");
        sb.append(" }");
        return sb.toString();
    }
}
