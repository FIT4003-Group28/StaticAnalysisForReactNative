package defpackage;
/* compiled from: PG */
/* renamed from: axkw  reason: default package */
/* loaded from: classes2.dex */
public final class axkw {
    public long a;
    public final int b;

    public axkw(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        axkw axkwVar = (axkw) obj;
        return this.b == axkwVar.b && this.a == axkwVar.a;
    }

    public final int hashCode() {
        long j = this.a;
        return (((int) (j ^ (j >>> 32))) * 31) + this.b;
    }

    public final String toString() {
        long j = this.a;
        int i = this.b;
        StringBuilder sb = new StringBuilder(74);
        sb.append("Entry{sampleCount=");
        sb.append(j);
        sb.append(", groupDescriptionIndex=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
