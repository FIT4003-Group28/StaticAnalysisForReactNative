package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: xcd  reason: default package */
/* loaded from: classes4.dex */
public final class xcd {
    public final Uri a;
    public final afxt b;
    public final boolean c;
    public final long d;
    public final amuk e;

    public xcd(Uri uri, afxt afxtVar, boolean z, long j, amuk amukVar) {
        if (uri != null) {
            this.a = uri;
            this.b = afxtVar;
            this.c = z;
            this.d = j;
            if (amukVar != null) {
                this.e = amukVar;
                return;
            }
            throw new NullPointerException("Null substitutedMacros");
        }
        throw new NullPointerException("Null getUri");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xcd) {
            xcd xcdVar = (xcd) obj;
            if (this.a.equals(xcdVar.a) && this.b.equals(xcdVar.b) && this.c == xcdVar.c && this.d == xcdVar.d && amxp.v(this.e, xcdVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        int i = true != this.c ? 1237 : 1231;
        long j = this.d;
        return ((((hashCode ^ i) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        boolean z = this.c;
        long j = this.d;
        String valueOf3 = String.valueOf(this.e);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 139 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("FulfilledPing{getUri=");
        sb.append(valueOf);
        sb.append(", getHeaderRestrictor=");
        sb.append(valueOf2);
        sb.append(", getDelayedSendAllowed=");
        sb.append(z);
        sb.append(", getExpirationTimeMillis=");
        sb.append(j);
        sb.append(", substitutedMacros=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }

    public xcd() {
    }
}
