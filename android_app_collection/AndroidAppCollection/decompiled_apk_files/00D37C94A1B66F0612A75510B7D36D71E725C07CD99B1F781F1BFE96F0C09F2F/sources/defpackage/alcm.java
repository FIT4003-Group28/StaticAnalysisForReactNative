package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: alcm  reason: default package */
/* loaded from: classes.dex */
public final class alcm {
    public final String a;
    public final Bitmap b;
    public final byte[] c;
    public final Uri d;

    public alcm() {
    }

    public alcm(String str, Bitmap bitmap, byte[] bArr, Uri uri) {
        this.a = str;
        this.b = bitmap;
        this.c = bArr;
        this.d = uri;
    }

    public static alcl a(String str) {
        alcl alclVar = new alcl();
        if (str != null) {
            alclVar.a = str;
            alclVar.b = null;
            alclVar.c = null;
            alclVar.d = null;
            return alclVar;
        }
        throw new NullPointerException("Null frontendId");
    }

    public final boolean equals(Object obj) {
        Bitmap bitmap;
        if (obj == this) {
            return true;
        }
        if (obj instanceof alcm) {
            alcm alcmVar = (alcm) obj;
            if (this.a.equals(alcmVar.a) && ((bitmap = this.b) != null ? bitmap.equals(alcmVar.b) : alcmVar.b == null)) {
                if (Arrays.equals(this.c, alcmVar instanceof alcm ? alcmVar.c : alcmVar.c)) {
                    Uri uri = this.d;
                    Uri uri2 = alcmVar.d;
                    if (uri != null ? uri.equals(uri2) : uri2 == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        Bitmap bitmap = this.b;
        int i = 0;
        int hashCode2 = (((hashCode ^ (bitmap == null ? 0 : bitmap.hashCode())) * 1000003) ^ Arrays.hashCode(this.c)) * 1000003;
        Uri uri = this.d;
        if (uri != null) {
            i = uri.hashCode();
        }
        return hashCode2 ^ i;
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        String arrays = Arrays.toString(this.c);
        String valueOf2 = String.valueOf(this.d);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 92 + length2 + String.valueOf(arrays).length() + String.valueOf(valueOf2).length());
        sb.append("UploadNotificationModel{frontendId=");
        sb.append(str);
        sb.append(", thumbnail=");
        sb.append(valueOf);
        sb.append(", notificationEndpointData=");
        sb.append(arrays);
        sb.append(", sourceVideoUri=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
