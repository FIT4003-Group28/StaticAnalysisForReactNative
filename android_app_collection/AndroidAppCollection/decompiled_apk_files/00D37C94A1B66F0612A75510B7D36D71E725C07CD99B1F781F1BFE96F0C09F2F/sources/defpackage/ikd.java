package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: ikd  reason: default package */
/* loaded from: classes3.dex */
public final class ikd {
    public final Uri a;
    public final String b;

    public ikd(Uri uri, String str) {
        if (uri != null) {
            this.a = uri;
            if (str != null) {
                this.b = str;
                return;
            }
            throw new NullPointerException("Null videoDuration");
        }
        throw new NullPointerException("Null filePath");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ikd) {
            ikd ikdVar = (ikd) obj;
            if (this.a.equals(ikdVar.a) && this.b.equals(ikdVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String str = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 41 + str.length());
        sb.append("ThumbnailModel{filePath=");
        sb.append(valueOf);
        sb.append(", videoDuration=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }

    public ikd() {
    }
}
