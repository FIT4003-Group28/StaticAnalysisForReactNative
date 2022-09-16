package defpackage;
/* compiled from: PG */
/* renamed from: aiec  reason: default package */
/* loaded from: classes.dex */
public final class aiec {
    public final long a;
    public final aiju b;
    private final boolean c;

    public aiec() {
    }

    public aiec(long j, boolean z, aiju aijuVar) {
        this.a = j;
        this.c = z;
        this.b = aijuVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aiec) {
            aiec aiecVar = (aiec) obj;
            if (this.a == aiecVar.a && this.c == aiecVar.c && this.b.equals(aiecVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ this.b.hashCode()) * 1000003;
    }

    public final String toString() {
        long j = this.a;
        boolean z = this.c;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 148 + "null".length());
        sb.append("PrefetchPrebufferParameters{mediaDurationMs=");
        sb.append(j);
        sb.append(", enableAutoMediaDuration=");
        sb.append(z);
        sb.append(", prefetchPlaybackContextWrapper=");
        sb.append(valueOf);
        sb.append(", expectedViewport=");
        sb.append("null");
        sb.append("}");
        return sb.toString();
    }
}
