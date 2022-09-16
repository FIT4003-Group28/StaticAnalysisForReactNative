package defpackage;
/* compiled from: PG */
/* renamed from: aijp  reason: default package */
/* loaded from: classes.dex */
public final class aijp {
    public static final aijp a = a().a();
    public final acvg b;
    public final boolean c;
    public final int d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final afmv h;

    public aijp() {
    }

    public aijp(acvg acvgVar, boolean z, int i, int i2, boolean z2, boolean z3, afmv afmvVar) {
        this.b = acvgVar;
        this.c = z;
        this.d = i;
        this.e = i2;
        this.f = z2;
        this.g = z3;
        this.h = afmvVar;
    }

    public static aijo a() {
        aijo aijoVar = new aijo();
        aijoVar.d(false);
        aijoVar.f(-1);
        aijoVar.e(-1);
        aijoVar.c(false);
        aijoVar.b(false);
        return aijoVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aijp) {
            aijp aijpVar = (aijp) obj;
            acvg acvgVar = this.b;
            if (acvgVar != null ? acvgVar.equals(aijpVar.b) : aijpVar.b == null) {
                if (this.c == aijpVar.c && this.d == aijpVar.d && this.e == aijpVar.e && this.f == aijpVar.f && this.g == aijpVar.g) {
                    afmv afmvVar = this.h;
                    afmv afmvVar2 = aijpVar.h;
                    if (afmvVar != null ? afmvVar.equals(afmvVar2) : afmvVar2 == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        acvg acvgVar = this.b;
        int i = 0;
        int i2 = 1237;
        int hashCode = ((((((((((acvgVar == null ? 0 : acvgVar.hashCode()) ^ 1000003) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003;
        if (true == this.g) {
            i2 = 1231;
        }
        int i3 = (hashCode ^ i2) * 1000003;
        afmv afmvVar = this.h;
        if (afmvVar != null) {
            i = afmvVar.hashCode();
        }
        return i3 ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        boolean z = this.c;
        int i = this.d;
        int i2 = this.e;
        boolean z2 = this.f;
        boolean z3 = this.g;
        String valueOf2 = String.valueOf(this.h);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 252 + String.valueOf(valueOf2).length());
        sb.append("PlaybackStartParameters{latencyActionLogger=");
        sb.append(valueOf);
        sb.append(", shouldUseQueuedVideoForNavigation=");
        sb.append(z);
        sb.append(", watchNextResponseProcessingDelay=");
        sb.append(i);
        sb.append(", watchNextResponseParsingDelay=");
        sb.append(i2);
        sb.append(", shouldPauseOnLastFrame=");
        sb.append(z2);
        sb.append(", mediaSessionDisabled=");
        sb.append(z3);
        sb.append(", expectedViewport=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
