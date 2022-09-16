package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: akyb  reason: default package */
/* loaded from: classes.dex */
public final class akyb {
    public final Uri a;
    public final ampq b;
    public final ampq c;

    public akyb() {
    }

    public akyb(Uri uri, ampq ampqVar, ampq ampqVar2) {
        this.a = uri;
        this.b = ampqVar;
        this.c = ampqVar2;
    }

    public static akya a(Uri uri) {
        uri.getClass();
        akya akyaVar = new akya(null);
        akyaVar.a = uri;
        akyaVar.b = amon.a;
        akyaVar.c = amon.a;
        return akyaVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akyb) {
            akyb akybVar = (akyb) obj;
            if (this.a.equals(akybVar.a) && this.b.equals(akybVar.b) && this.c.equals(akybVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 63 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("PendingMedia{uri=");
        sb.append(valueOf);
        sb.append(", presetFrontendId=");
        sb.append(valueOf2);
        sb.append(", presetThumbnailFilePath=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
