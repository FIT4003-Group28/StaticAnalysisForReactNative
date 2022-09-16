package defpackage;
/* compiled from: PG */
/* renamed from: lor  reason: default package */
/* loaded from: classes3.dex */
final class lor {
    public final long a;
    public final int b;

    public lor() {
    }

    public lor(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lor) {
            lor lorVar = (lor) obj;
            if (this.a == lorVar.a && this.b == lorVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return this.b ^ ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        long j = this.a;
        int i = this.b;
        StringBuilder sb = new StringBuilder(79);
        sb.append("LoadStartedContext{startTimeNanos=");
        sb.append(j);
        sb.append(", loadNumber=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
