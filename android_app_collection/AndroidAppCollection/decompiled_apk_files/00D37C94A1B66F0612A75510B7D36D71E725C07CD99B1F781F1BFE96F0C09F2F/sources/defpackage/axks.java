package defpackage;
/* compiled from: PG */
/* renamed from: axks  reason: default package */
/* loaded from: classes2.dex */
public final class axks {
    final int a;
    final short b;

    public axks(int i, short s) {
        this.a = i;
        this.b = s;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        axks axksVar = (axks) obj;
        return this.a == axksVar.a && this.b == axksVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        int i = this.a;
        short s = this.b;
        StringBuilder sb = new StringBuilder(54);
        sb.append("{availableBitrate=");
        sb.append(i);
        sb.append(", targetRateShare=");
        sb.append((int) s);
        sb.append("}");
        return sb.toString();
    }
}
