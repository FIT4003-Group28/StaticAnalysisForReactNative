package defpackage;
/* compiled from: PG */
/* renamed from: jqk  reason: default package */
/* loaded from: classes3.dex */
public final class jqk {
    public final boolean a;
    public final boolean b;

    public jqk() {
    }

    public jqk(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jqk) {
            jqk jqkVar = (jqk) obj;
            if (this.a == jqkVar.a && this.b == jqkVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003;
        if (true == this.b) {
            i = 1231;
        }
        return i2 ^ i;
    }

    public final String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        StringBuilder sb = new StringBuilder(57);
        sb.append("VideoErrorAndRetryableState{error=");
        sb.append(z);
        sb.append(", retryable=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }
}
