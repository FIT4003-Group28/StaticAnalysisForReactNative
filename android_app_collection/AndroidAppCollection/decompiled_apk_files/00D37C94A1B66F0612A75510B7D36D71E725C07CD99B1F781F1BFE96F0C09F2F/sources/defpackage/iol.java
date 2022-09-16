package defpackage;

import com.google.android.libraries.youtube.innertube.model.BrowseResponseModel;
/* compiled from: PG */
/* renamed from: iol  reason: default package */
/* loaded from: classes3.dex */
public final class iol {
    public final apzg a;
    public final BrowseResponseModel b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public iol() {
    }

    public iol(apzg apzgVar, BrowseResponseModel browseResponseModel, boolean z, boolean z2, boolean z3) {
        this.a = apzgVar;
        this.b = browseResponseModel;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }

    public static iok a() {
        return new iok();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof iol) {
            iol iolVar = (iol) obj;
            if (this.a.equals(iolVar.a) && this.b.equals(iolVar.b) && this.c == iolVar.c && this.d == iolVar.d && this.e == iolVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003;
        if (true == this.e) {
            i = 1231;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        boolean z = this.c;
        boolean z2 = this.d;
        boolean z3 = this.e;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 130 + String.valueOf(valueOf2).length());
        sb.append("BrowseResponseWrapper{endpoint=");
        sb.append(valueOf);
        sb.append(", browseResponseModel=");
        sb.append(valueOf2);
        sb.append(", isLoggingEnabled=");
        sb.append(z);
        sb.append(", isNewResponseNeeded=");
        sb.append(z2);
        sb.append(", isLoadingResponse=");
        sb.append(z3);
        sb.append("}");
        return sb.toString();
    }
}
