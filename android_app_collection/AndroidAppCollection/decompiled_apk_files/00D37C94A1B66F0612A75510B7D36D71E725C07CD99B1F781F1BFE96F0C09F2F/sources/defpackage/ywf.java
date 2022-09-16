package defpackage;

import java.util.Arrays;
import java.util.concurrent.ScheduledFuture;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ywf  reason: default package */
/* loaded from: classes4.dex */
public final class ywf {
    public final long[] a;
    public final long[] b;
    public final boolean c;
    public final int d;
    public final int e;
    public final int f;
    public final ScheduledFuture g;

    public ywf() {
    }

    public ywf(long[] jArr, long[] jArr2, boolean z, int i, int i2, int i3, ScheduledFuture scheduledFuture) {
        this.a = jArr;
        this.b = jArr2;
        this.c = z;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = scheduledFuture;
    }

    public final boolean a() {
        return this.d != 0;
    }

    public final ywe b() {
        return new ywe(this);
    }

    public final boolean equals(Object obj) {
        long[] jArr;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ywf) {
            ywf ywfVar = (ywf) obj;
            boolean z = ywfVar instanceof ywf;
            if (Arrays.equals(this.a, z ? ywfVar.a : ywfVar.a)) {
                long[] jArr2 = this.b;
                if (z) {
                    jArr = ywfVar.b;
                } else {
                    jArr = ywfVar.b;
                }
                if (Arrays.equals(jArr2, jArr) && this.c == ywfVar.c && this.d == ywfVar.d && this.e == ywfVar.e && this.f == ywfVar.f) {
                    ScheduledFuture scheduledFuture = this.g;
                    ScheduledFuture scheduledFuture2 = ywfVar.g;
                    if (scheduledFuture != null ? scheduledFuture.equals(scheduledFuture2) : scheduledFuture2 == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((((((Arrays.hashCode(this.a) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b)) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003;
        ScheduledFuture scheduledFuture = this.g;
        return hashCode ^ (scheduledFuture == null ? 0 : scheduledFuture.hashCode());
    }

    public final String toString() {
        String arrays = Arrays.toString(this.a);
        String arrays2 = Arrays.toString(this.b);
        boolean z = this.c;
        int i = this.d;
        int i2 = this.e;
        int i3 = this.f;
        String valueOf = String.valueOf(this.g);
        int length = String.valueOf(arrays).length();
        StringBuilder sb = new StringBuilder(length + 134 + String.valueOf(arrays2).length() + String.valueOf(valueOf).length());
        sb.append("Guts{active=");
        sb.append(arrays);
        sb.append(", serialized=");
        sb.append(arrays2);
        sb.append(", isDirty=");
        sb.append(z);
        sb.append(", disposed=");
        sb.append(i);
        sb.append(", isShutdownLikely=");
        sb.append(i2);
        sb.append(", changeCount=");
        sb.append(i3);
        sb.append(", serializeTask=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
