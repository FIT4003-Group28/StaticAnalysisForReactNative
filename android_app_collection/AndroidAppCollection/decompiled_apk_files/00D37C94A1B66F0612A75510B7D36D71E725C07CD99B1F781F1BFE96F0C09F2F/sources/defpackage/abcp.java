package defpackage;
/* compiled from: PG */
/* renamed from: abcp  reason: default package */
/* loaded from: classes.dex */
public final class abcp {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final amuk f;

    public abcp() {
    }

    public abcp(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, amuk amukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = amukVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof abcp) {
            abcp abcpVar = (abcp) obj;
            if (this.a == abcpVar.a && this.b == abcpVar.b && this.c == abcpVar.c && this.d == abcpVar.d && this.e == abcpVar.e && amxp.v(this.f, abcpVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((((((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003;
        if (true == this.e) {
            i = 1231;
        }
        return ((i2 ^ i) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        boolean z3 = this.c;
        boolean z4 = this.d;
        boolean z5 = this.e;
        String valueOf = String.valueOf(this.f);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 218);
        sb.append("OfflineSettingCategory{isCrossDeviceOfflineEnabled=");
        sb.append(z);
        sb.append(", isFullHdFormatOptionAvailable=");
        sb.append(z2);
        sb.append(", isRecommendationsEnabled=");
        sb.append(z3);
        sb.append(", isDownloadQualityEnabled=");
        sb.append(z4);
        sb.append(", shouldDisplaySmartDownloads=");
        sb.append(z5);
        sb.append(", downloadQualityFormats=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
