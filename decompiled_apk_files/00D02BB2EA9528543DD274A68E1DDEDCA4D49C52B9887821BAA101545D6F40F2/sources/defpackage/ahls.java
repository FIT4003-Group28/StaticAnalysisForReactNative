package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: ahls  reason: default package */
/* loaded from: classes2.dex */
public final class ahls extends ahlv {
    public final long a;
    public final float[] b;

    public ahls(long j, float[] fArr) {
        this.a = j;
        if (fArr != null) {
            this.b = fArr;
            return;
        }
        throw new NullPointerException("Null values");
    }

    @Override // defpackage.ahlv
    public final long a() {
        return this.a;
    }

    @Override // defpackage.ahlv
    public final float[] b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ahlv) {
            ahlv ahlvVar = (ahlv) obj;
            if (this.a == ahlvVar.a()) {
                if (Arrays.equals(this.b, ahlvVar instanceof ahls ? ((ahls) ahlvVar).b : ahlvVar.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return Arrays.hashCode(this.b) ^ ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        long j = this.a;
        String arrays = Arrays.toString(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 59);
        sb.append("StampedValues{timestampNanos=");
        sb.append(j);
        sb.append(", values=");
        sb.append(arrays);
        sb.append("}");
        return sb.toString();
    }
}
