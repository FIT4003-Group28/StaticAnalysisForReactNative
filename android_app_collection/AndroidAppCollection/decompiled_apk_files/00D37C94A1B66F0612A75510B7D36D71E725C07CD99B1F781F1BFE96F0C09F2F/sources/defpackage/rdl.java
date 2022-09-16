package defpackage;

import com.google.android.gms.gmscompliance.GmsDeviceComplianceResponse;
/* compiled from: PG */
/* renamed from: rdl  reason: default package */
/* loaded from: classes4.dex */
public final class rdl {
    public final GmsDeviceComplianceResponse a;
    public final long b;
    public final int c;

    public rdl() {
    }

    public rdl(GmsDeviceComplianceResponse gmsDeviceComplianceResponse, int i, long j) {
        this.a = gmsDeviceComplianceResponse;
        this.c = i;
        this.b = j;
    }

    public static rdl a(GmsDeviceComplianceResponse gmsDeviceComplianceResponse, int i, long j) {
        return new rdl(gmsDeviceComplianceResponse, i, j);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rdl) {
            rdl rdlVar = (rdl) obj;
            GmsDeviceComplianceResponse gmsDeviceComplianceResponse = this.a;
            if (gmsDeviceComplianceResponse != null ? gmsDeviceComplianceResponse.equals(rdlVar.a) : rdlVar.a == null) {
                if (this.c == rdlVar.c && this.b == rdlVar.b) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        GmsDeviceComplianceResponse gmsDeviceComplianceResponse = this.a;
        int hashCode = gmsDeviceComplianceResponse == null ? 0 : gmsDeviceComplianceResponse.hashCode();
        int i = this.c;
        long j = this.b;
        return ((((hashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        int i = this.c;
        String str = i != 1 ? i != 2 ? "EXPIRED" : "MALFORMED" : "CACHED_READ_FAST";
        long j = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 103 + str.length());
        sb.append("ParsedResponse{gmsDeviceComplianceResponse=");
        sb.append(valueOf);
        sb.append(", parsingStatus=");
        sb.append(str);
        sb.append(", expirationTimeMillis=");
        sb.append(j);
        sb.append("}");
        return sb.toString();
    }
}
