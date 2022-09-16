package defpackage;
/* compiled from: PG */
/* renamed from: azz  reason: default package */
/* loaded from: classes2.dex */
public final class azz {
    public static final azz a = new azz(0, 0);
    public final long b;
    public final long c;

    public azz(long j, long j2) {
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            azz azzVar = (azz) obj;
            if (this.b == azzVar.b && this.c == azzVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.b) * 31) + ((int) this.c);
    }

    public final String toString() {
        long j = this.b;
        long j2 = this.c;
        StringBuilder sb = new StringBuilder(60);
        sb.append("[timeUs=");
        sb.append(j);
        sb.append(", position=");
        sb.append(j2);
        sb.append("]");
        return sb.toString();
    }
}
