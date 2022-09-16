package defpackage;
/* compiled from: PG */
/* renamed from: ahfm  reason: default package */
/* loaded from: classes.dex */
public final class ahfm {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final zgz f;
    public final int g;
    public final boolean h;

    public ahfm() {
    }

    public ahfm(boolean z, boolean z2, boolean z3, boolean z4, int i, zgz zgzVar, int i2, boolean z5) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = i;
        this.f = zgzVar;
        this.g = i2;
        this.h = z5;
    }

    public static ahfl a() {
        ahfl ahflVar = new ahfl();
        ahflVar.d = 2131232804;
        ahflVar.b = false;
        ahflVar.c = true;
        ahflVar.a = true;
        ahflVar.c(false);
        ahflVar.d(ahfk.a);
        ahflVar.e = 10;
        ahflVar.b();
        return ahflVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ahfm) {
            ahfm ahfmVar = (ahfm) obj;
            if (this.a == ahfmVar.a && this.b == ahfmVar.b && this.c == ahfmVar.c && this.d == ahfmVar.d && this.e == ahfmVar.e && this.f.equals(ahfmVar.f) && this.g == ahfmVar.g && this.h == ahfmVar.h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = ((((((((((((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g) * 1000003;
        if (true == this.h) {
            i = 1231;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        boolean z3 = this.c;
        boolean z4 = this.d;
        int i = this.e;
        String valueOf = String.valueOf(this.f);
        int i2 = this.g;
        boolean z5 = this.h;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 295);
        sb.append("PlayerModuleConfig{onesieEnabled=");
        sb.append(z);
        sb.append(", enableVss2StatsTracking=");
        sb.append(z2);
        sb.append(", enableRawCcSupport=");
        sb.append(z3);
        sb.append(", enableLegacyHeartbeatFlow=");
        sb.append(z4);
        sb.append(", backgroundNotificationIconResourceId=");
        sb.append(i);
        sb.append(", referringAppProvider=");
        sb.append(valueOf);
        sb.append(", maximumConsecutiveSkippedUnplayableVideos=");
        sb.append(i2);
        sb.append(", enableVss2UserPresenceTracking=");
        sb.append(z5);
        sb.append("}");
        return sb.toString();
    }
}
