package defpackage;
/* compiled from: PG */
/* renamed from: axgy  reason: default package */
/* loaded from: classes3.dex */
public final class axgy extends axhd {
    public final String a;
    public final boolean b;

    public axgy(String str, boolean z) {
        dzvx.c(str, "targetUserObfuscatedGaiaId");
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof axgy)) {
                return false;
            }
            axgy axgyVar = (axgy) obj;
            return dzvx.d(this.a, axgyVar.a) && this.b == axgyVar.b;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.a;
        return ((str != null ? str.hashCode() : 0) * 31) + (this.b ? 1 : 0);
    }

    public final String toString() {
        return "UpdateIsRequestInFlightEvent(targetUserObfuscatedGaiaId=" + this.a + ", isRequestInFlight=" + this.b + ")";
    }
}
