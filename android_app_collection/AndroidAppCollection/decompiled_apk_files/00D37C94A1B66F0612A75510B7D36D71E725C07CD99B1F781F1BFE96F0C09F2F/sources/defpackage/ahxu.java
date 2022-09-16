package defpackage;
/* compiled from: PG */
/* renamed from: ahxu  reason: default package */
/* loaded from: classes.dex */
public final class ahxu {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final long d;

    public ahxu() {
    }

    public ahxu(boolean z, boolean z2, boolean z3, long j) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = j;
    }

    public static ahxt a() {
        ahxt ahxtVar = new ahxt();
        ahxtVar.e(false);
        return ahxtVar;
    }

    public static ahxu b(boolean z) {
        ahxt a = a();
        a.d(z);
        a.e(false);
        a.b(!z);
        a.c(0L);
        return a.a();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ahxu) {
            ahxu ahxuVar = (ahxu) obj;
            if (this.a == ahxuVar.a && this.b == ahxuVar.b && this.c == ahxuVar.c && this.d == ahxuVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003;
        if (true == this.c) {
            i = 1231;
        }
        long j = this.d;
        return ((i2 ^ i) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        boolean z3 = this.c;
        long j = this.d;
        StringBuilder sb = new StringBuilder(148);
        sb.append("AccessibilityState{isAccessibilityPlayerEnabled=");
        sb.append(z);
        sb.append(", isTestOnlyState=");
        sb.append(z2);
        sb.append(", canHidePlayerControls=");
        sb.append(z3);
        sb.append(", controlsHideDelayMs=");
        sb.append(j);
        sb.append("}");
        return sb.toString();
    }
}
