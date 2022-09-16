package defpackage;

import com.google.android.libraries.youtube.innertube.model.BrowseResponseModel;
/* compiled from: PG */
/* renamed from: hqh  reason: default package */
/* loaded from: classes3.dex */
public final class hqh {
    public final BrowseResponseModel a;
    private final apzg b;
    private final boolean c;
    private final boolean d;
    private final boolean e;

    public hqh() {
    }

    public hqh(apzg apzgVar, BrowseResponseModel browseResponseModel, boolean z, boolean z2, boolean z3) {
        this.b = apzgVar;
        this.a = browseResponseModel;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }

    public static hqg a() {
        return new hqg();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hqh) {
            hqh hqhVar = (hqh) obj;
            if (this.b.equals(hqhVar.b) && this.a.equals(hqhVar.a) && this.c == hqhVar.c && this.d == hqhVar.d && this.e == hqhVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003;
        if (true == this.e) {
            i = 1231;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.a);
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
