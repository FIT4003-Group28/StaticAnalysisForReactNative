package defpackage;
/* compiled from: PG */
/* renamed from: ahww  reason: default package */
/* loaded from: classes.dex */
public final class ahww {
    public final long a;
    public final long b;
    public final CharSequence c;
    public final arhr d;
    private final long e;

    public ahww() {
    }

    public ahww(long j, long j2, long j3, CharSequence charSequence, arhr arhrVar) {
        this.a = j;
        this.b = j2;
        this.e = j3;
        this.c = charSequence;
        this.d = arhrVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ahww) {
            ahww ahwwVar = (ahww) obj;
            if (this.a == ahwwVar.a && this.b == ahwwVar.b && this.e == ahwwVar.e && this.c.equals(ahwwVar.c) && this.d.equals(ahwwVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        long j3 = this.e;
        return this.d.hashCode() ^ ((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ this.c.hashCode()) * 1000003);
    }

    public final String toString() {
        long j = this.a;
        long j2 = this.b;
        long j3 = this.e;
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.d);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 189 + String.valueOf(valueOf2).length());
        sb.append("TimedMarkerDecoratorModel{decorationVisibilityStartMillis=");
        sb.append(j);
        sb.append(", decorationVisibilityEndMillis=");
        sb.append(j2);
        sb.append(", decorationTimeMillis=");
        sb.append(j3);
        sb.append(", label=");
        sb.append(valueOf);
        sb.append(", icon=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
