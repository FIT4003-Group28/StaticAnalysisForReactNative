package defpackage;
/* compiled from: PG */
/* renamed from: uzl  reason: default package */
/* loaded from: classes4.dex */
public final class uzl implements uum {
    public final int a;
    public final float b;
    private final ampq c;
    private final int d;

    public uzl() {
    }

    public uzl(int i, int i2, float f, ampq ampqVar) {
        this.d = i;
        this.a = i2;
        this.b = f;
        this.c = ampqVar;
    }

    public static final uzk c() {
        uzk uzkVar = new uzk(null);
        uzkVar.a = 10;
        uzkVar.b = Float.valueOf(1.0f);
        uzkVar.c = amon.a;
        uzkVar.d = 1;
        return uzkVar;
    }

    @Override // defpackage.uum
    public final int a() {
        return this.a;
    }

    @Override // defpackage.uum
    public final int b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof uzl)) {
            return false;
        }
        uzl uzlVar = (uzl) obj;
        int i = this.d;
        int i2 = uzlVar.d;
        if (i == 0) {
            throw null;
        }
        return i == i2 && this.a == uzlVar.a && Float.floatToIntBits(this.b) == Float.floatToIntBits(uzlVar.b) && this.c.equals(uzlVar.c);
    }

    public final int hashCode() {
        int i = this.d;
        uun.b(i);
        return ((((((i ^ 1000003) * 1000003) ^ this.a) * 1000003) ^ Float.floatToIntBits(this.b)) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        String a = uun.a(this.d);
        int i = this.a;
        float f = this.b;
        String valueOf = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(a.length() + 130 + String.valueOf(valueOf).length());
        sb.append("TimerConfigurations{enablement=");
        sb.append(a);
        sb.append(", rateLimitPerSecond=");
        sb.append(i);
        sb.append(", samplingProbability=");
        sb.append(f);
        sb.append(", perEventConfigurationFlags=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
