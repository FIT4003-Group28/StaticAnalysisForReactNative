package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: wzr  reason: default package */
/* loaded from: classes4.dex */
public final class wzr {
    public static final wzr a = a(0, 0, 0, false, amon.a, amon.a);
    public final int b;
    public final int c;
    public final boolean d;
    public final ampq e;
    public final ampq f;
    private final int g;

    public wzr() {
    }

    public wzr(int i, int i2, int i3, boolean z, ampq ampqVar, ampq ampqVar2) {
        this.b = i;
        this.c = i2;
        this.g = i3;
        this.d = z;
        this.e = ampqVar;
        this.f = ampqVar2;
    }

    public static wzr a(int i, int i2, int i3, boolean z, ampq ampqVar, ampq ampqVar2) {
        return new wzr(i, i2, i3, z, ampqVar, ampqVar2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wzr)) {
            return false;
        }
        wzr wzrVar = (wzr) obj;
        return this.b == wzrVar.b && this.c == wzrVar.c && this.g == wzrVar.g && this.d == wzrVar.d && this.e.equals(wzrVar.e) && this.f.equals(wzrVar.f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.g), Boolean.valueOf(this.d), this.e, this.f});
    }

    public final String toString() {
        int i = this.b;
        int i2 = this.c;
        int i3 = this.g;
        StringBuilder sb = new StringBuilder(54);
        sb.append("AdCountMetadata[");
        sb.append(i);
        sb.append(", ");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append("]");
        return sb.toString();
    }
}
