package defpackage;

import j$.time.Duration;
/* compiled from: PG */
/* renamed from: aigb  reason: default package */
/* loaded from: classes.dex */
public final class aigb {
    public final float a;
    public final float b;
    public final Duration c;

    public aigb(float f, float f2, Duration duration) {
        this.a = f;
        this.b = f2;
        if (duration != null) {
            this.c = duration;
            return;
        }
        throw new NullPointerException("Null duration");
    }

    public static aigb a(float f, float f2, Duration duration) {
        boolean z = true;
        boolean z2 = f >= 0.0f && f <= 1.0f;
        Float valueOf = Float.valueOf(f);
        aqxo.u(z2, "input is not a valid opacity: %s", valueOf);
        aqxo.u(f2 >= 0.0f && f2 <= 1.0f, "input is not a valid opacity: %s", valueOf);
        if (duration.toMillis() < 0) {
            z = false;
        }
        aqxo.u(z, "duration is negative: %s", duration);
        return new aigb(f, f2, duration);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aigb) {
            aigb aigbVar = (aigb) obj;
            if (Float.floatToIntBits(this.a) == Float.floatToIntBits(aigbVar.a) && Float.floatToIntBits(this.b) == Float.floatToIntBits(aigbVar.b) && this.c.equals(aigbVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Float.floatToIntBits(this.a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.b)) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        float f = this.a;
        float f2 = this.b;
        String valueOf = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 83);
        sb.append("AlphaAnimationStep{startAlpha=");
        sb.append(f);
        sb.append(", endAlpha=");
        sb.append(f2);
        sb.append(", duration=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    public aigb() {
    }
}
