package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: amft  reason: default package */
/* loaded from: classes.dex */
public final class amft {
    public final long a;
    public final TimeUnit b;

    public amft(long j, TimeUnit timeUnit) {
        this.a = j;
        if (timeUnit != null) {
            this.b = timeUnit;
            return;
        }
        throw new NullPointerException("Null timeUnit");
    }

    public static amft a(long j, TimeUnit timeUnit) {
        return new amft(j, timeUnit);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof amft) {
            amft amftVar = (amft) obj;
            if (this.a == amftVar.a && this.b.equals(amftVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return this.b.hashCode() ^ ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        long j = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 54);
        sb.append("TimeUnitPair{duration=");
        sb.append(j);
        sb.append(", timeUnit=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    public amft() {
    }
}
