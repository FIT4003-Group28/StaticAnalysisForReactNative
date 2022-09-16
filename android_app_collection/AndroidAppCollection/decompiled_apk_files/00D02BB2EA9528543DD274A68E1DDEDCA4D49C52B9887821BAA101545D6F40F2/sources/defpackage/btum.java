package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: btum  reason: default package */
/* loaded from: classes4.dex */
public final class btum {
    public long a;
    public long b;
    public long c;
    public long d;
    public long e;

    private final Object[] a() {
        return new Object[]{Long.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c), Long.valueOf(this.d), Long.valueOf(this.e)};
    }

    public final boolean equals(@dzsi Object obj) {
        if (obj instanceof btum) {
            return Arrays.deepEquals(a(), ((btum) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(a());
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.g("receivedBytes", this.a);
        b.g("sentBytes", this.b);
        b.g("sentCompressedBytes", this.c);
        b.g("sentGmmMessages", this.d);
        b.g("sentCompressedGmmMessages", this.e);
        return b.toString();
    }
}
