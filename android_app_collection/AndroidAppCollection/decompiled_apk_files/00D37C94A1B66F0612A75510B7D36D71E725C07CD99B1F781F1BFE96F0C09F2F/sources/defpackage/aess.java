package defpackage;
/* compiled from: PG */
/* renamed from: aess  reason: default package */
/* loaded from: classes.dex */
public final class aess {
    public final long a;
    public final long b;
    public final long c;

    public aess(long j) {
        this(j, 0L, 0L);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aess)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        aess aessVar = (aess) obj;
        return this.a == aessVar.a && this.b == aessVar.b && this.c == aessVar.c;
    }

    public final int hashCode() {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        String str;
        long j = this.a;
        long j2 = this.b;
        String str2 = "";
        if (j2 != 0) {
            StringBuilder sb = new StringBuilder(57);
            sb.append(" snapToKeyframeToleranceBeforeMillis=");
            sb.append(j2);
            str = sb.toString();
        } else {
            str = str2;
        }
        long j3 = this.c;
        if (j3 != 0) {
            StringBuilder sb2 = new StringBuilder(56);
            sb2.append(" snapTokeyframeToleranceAfterMillis=");
            sb2.append(j3);
            str2 = sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 45 + String.valueOf(str2).length());
        sb3.append("Position(positionMillis=");
        sb3.append(j);
        sb3.append(str);
        sb3.append(str2);
        sb3.append(")");
        return sb3.toString();
    }

    public aess(long j, long j2, long j3) {
        this.a = j;
        this.b = Math.max(0L, j2);
        this.c = Math.max(0L, j3);
    }
}
