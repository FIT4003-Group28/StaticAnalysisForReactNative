package defpackage;
/* compiled from: PG */
/* renamed from: csob  reason: default package */
/* loaded from: classes5.dex */
public final class csob extends csod {
    private final csoa<dspd> a;
    private final long b;

    public csob(csoa<dspd> csoaVar, long j) {
        if (csoaVar != null) {
            this.a = csoaVar;
            this.b = j;
            return;
        }
        throw new NullPointerException("Null value");
    }

    @Override // defpackage.csod
    public final csoa<dspd> a() {
        return this.a;
    }

    @Override // defpackage.csod
    public final long b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof csod) {
            csod csodVar = (csod) obj;
            if (this.a.equals(csodVar.a()) && this.b == csodVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        long j = this.b;
        return ((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        long j = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 58);
        sb.append("ValueWithTimestamp{value=");
        sb.append(valueOf);
        sb.append(", timestamp=");
        sb.append(j);
        sb.append("}");
        return sb.toString();
    }
}
