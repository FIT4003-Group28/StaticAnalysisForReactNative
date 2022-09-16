package defpackage;

import android.graphics.drawable.Drawable;
import android.net.Uri;
/* compiled from: PG */
/* renamed from: xrp  reason: default package */
/* loaded from: classes4.dex */
public final class xrp {
    public final Uri a;
    public final int b;
    public final Drawable c;
    public final arif d;
    public final int e;
    public final String f;

    public xrp() {
    }

    public xrp(Uri uri, int i, Drawable drawable, arif arifVar, int i2, String str) {
        this.a = uri;
        this.b = i;
        this.c = drawable;
        this.d = arifVar;
        this.e = i2;
        this.f = str;
    }

    public static xro a() {
        xro xroVar = new xro();
        xroVar.c(0);
        return xroVar;
    }

    public final xro b() {
        return new xro(this);
    }

    public final boolean equals(Object obj) {
        Drawable drawable;
        arif arifVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof xrp) {
            xrp xrpVar = (xrp) obj;
            if (this.a.equals(xrpVar.a) && this.b == xrpVar.b && ((drawable = this.c) != null ? drawable.equals(xrpVar.c) : xrpVar.c == null) && ((arifVar = this.d) != null ? arifVar.equals(xrpVar.d) : xrpVar.d == null) && this.e == xrpVar.e) {
                String str = this.f;
                String str2 = xrpVar.f;
                if (str != null ? str.equals(str2) : str2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003;
        Drawable drawable = this.c;
        int i = 0;
        int hashCode2 = (hashCode ^ (drawable == null ? 0 : drawable.hashCode())) * 1000003;
        arif arifVar = this.d;
        int hashCode3 = (((hashCode2 ^ (arifVar == null ? 0 : arifVar.hashCode())) * 1000003) ^ this.e) * 1000003;
        String str = this.f;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode3 ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        int i = this.b;
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        int i2 = this.e;
        String str = this.f;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 128 + length2 + String.valueOf(valueOf3).length() + String.valueOf(str).length());
        sb.append("PostCreationImage{uri=");
        sb.append(valueOf);
        sb.append(", rotationAngle=");
        sb.append(i);
        sb.append(", drawable=");
        sb.append(valueOf2);
        sb.append(", previewCoordinates=");
        sb.append(valueOf3);
        sb.append(", uploadingState=");
        sb.append(i2);
        sb.append(", encryptedBlobId=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
