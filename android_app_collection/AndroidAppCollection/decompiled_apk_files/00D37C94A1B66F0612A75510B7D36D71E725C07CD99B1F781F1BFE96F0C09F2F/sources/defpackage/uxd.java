package defpackage;
/* compiled from: PG */
/* renamed from: uxd  reason: default package */
/* loaded from: classes4.dex */
public final class uxd implements uum {
    private final int a;
    private final int b;

    public uxd() {
    }

    public uxd(int i) {
        this.b = 2;
        this.a = i;
    }

    @Override // defpackage.uum
    public final int a() {
        return this.a;
    }

    @Override // defpackage.uum
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof uxd)) {
            return false;
        }
        uxd uxdVar = (uxd) obj;
        int i = this.b;
        int i2 = uxdVar.b;
        if (i == 0) {
            throw null;
        }
        return i == i2 && this.a == uxdVar.a;
    }

    public final int hashCode() {
        int i = this.b;
        uun.b(i);
        return ((i ^ 1000003) * 1000003) ^ this.a;
    }

    public final String toString() {
        String a = uun.a(this.b);
        int i = this.a;
        StringBuilder sb = new StringBuilder(a.length() + 63);
        sb.append("JankConfigurations{enablement=");
        sb.append(a);
        sb.append(", rateLimitPerSecond=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
