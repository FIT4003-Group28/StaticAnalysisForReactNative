package defpackage;

import com.google.research.aimatter.drishti.DrishtiCache;
/* compiled from: PG */
/* renamed from: awwo  reason: default package */
/* loaded from: classes2.dex */
public final class awwo {
    public final long a;
    public final DrishtiCache b;

    public awwo() {
    }

    public awwo(long j, DrishtiCache drishtiCache) {
        this.a = j;
        this.b = drishtiCache;
    }

    public static awwn a() {
        awwn awwnVar = new awwn();
        awwnVar.b(0L);
        return awwnVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof awwo) {
            awwo awwoVar = (awwo) obj;
            if (this.a == awwoVar.a) {
                DrishtiCache drishtiCache = this.b;
                DrishtiCache drishtiCache2 = awwoVar.b;
                if (drishtiCache != null ? drishtiCache.equals(drishtiCache2) : drishtiCache2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        DrishtiCache drishtiCache = this.b;
        return (drishtiCache == null ? 0 : drishtiCache.hashCode()) ^ i;
    }

    public final String toString() {
        long j = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 82);
        sb.append("ExternalGraphComponents{parentGlContextHandle=");
        sb.append(j);
        sb.append(", drishtiCache=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
