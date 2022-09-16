package defpackage;
/* compiled from: PG */
/* renamed from: uxi  reason: default package */
/* loaded from: classes4.dex */
public final class uxi implements uum {
    private final long a;
    private final amvn b;
    private final int c;

    public uxi() {
    }

    public uxi(int i, long j, amvn amvnVar) {
        this.c = i;
        this.a = j;
        this.b = amvnVar;
    }

    @Override // defpackage.uum
    public final /* synthetic */ int a() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.uum
    public final int b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof uxi)) {
            return false;
        }
        uxi uxiVar = (uxi) obj;
        int i = this.c;
        int i2 = uxiVar.c;
        if (i == 0) {
            throw null;
        }
        return i == i2 && this.a == uxiVar.a && this.b.equals(uxiVar.b);
    }

    public final int hashCode() {
        int i = this.c;
        uun.b(i);
        long j = this.a;
        return ((((i ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((amyg) this.b).c;
    }

    public final String toString() {
        String a = uun.a(this.c);
        long j = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(a.length() + 117 + String.valueOf(valueOf).length());
        sb.append("DebugMemoryConfigurations{enablement=");
        sb.append(a);
        sb.append(", debugMemoryServiceThrottleMs=");
        sb.append(j);
        sb.append(", debugMemoryEventsToSample=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
