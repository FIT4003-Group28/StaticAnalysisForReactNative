package defpackage;
/* compiled from: PG */
/* renamed from: uzq  reason: default package */
/* loaded from: classes4.dex */
public final class uzq implements uum {
    private final int a;
    private final boolean b;
    private final int c;
    private final vsr d;

    public uzq() {
    }

    public uzq(int i, vsr vsrVar, boolean z, byte[] bArr, byte[] bArr2) {
        this.c = 2;
        this.a = i;
        this.d = vsrVar;
        this.b = z;
    }

    @Override // defpackage.uum
    public final int a() {
        return this.a;
    }

    @Override // defpackage.uum
    public final int b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof uzq)) {
            return false;
        }
        uzq uzqVar = (uzq) obj;
        int i = this.c;
        int i2 = uzqVar.c;
        if (i == 0) {
            throw null;
        }
        return i == i2 && this.a == uzqVar.a && this.d.equals(uzqVar.d) && this.b == uzqVar.b;
    }

    public final int hashCode() {
        int i = this.c;
        uun.b(i);
        return ((((((i ^ 1000003) * 1000003) ^ this.a) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        String a = uun.a(this.c);
        int i = this.a;
        String valueOf = String.valueOf(this.d);
        boolean z = this.b;
        StringBuilder sb = new StringBuilder(a.length() + 114 + String.valueOf(valueOf).length());
        sb.append("TikTokTraceConfigurations{enablement=");
        sb.append(a);
        sb.append(", rateLimitPerSecond=");
        sb.append(i);
        sb.append(", dynamicSampler=");
        sb.append(valueOf);
        sb.append(", recordTimerDuration=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
