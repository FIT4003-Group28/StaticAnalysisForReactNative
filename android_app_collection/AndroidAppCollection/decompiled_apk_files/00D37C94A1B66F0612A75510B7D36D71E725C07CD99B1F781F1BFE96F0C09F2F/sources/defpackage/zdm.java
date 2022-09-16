package defpackage;
/* compiled from: PG */
/* renamed from: zdm  reason: default package */
/* loaded from: classes4.dex */
public final class zdm {
    public final int a;
    public final long b;

    public zdm() {
    }

    public zdm(int i, long j) {
        this.a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zdm) {
            zdm zdmVar = (zdm) obj;
            if (this.a == zdmVar.a && this.b == zdmVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        long j = this.b;
        return ((i ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        int i = this.a;
        long j = this.b;
        StringBuilder sb = new StringBuilder(82);
        sb.append("BatteryCurrentSample{batteryCurrentMa=");
        sb.append(i);
        sb.append(", elapsedMs=");
        sb.append(j);
        sb.append("}");
        return sb.toString();
    }
}
