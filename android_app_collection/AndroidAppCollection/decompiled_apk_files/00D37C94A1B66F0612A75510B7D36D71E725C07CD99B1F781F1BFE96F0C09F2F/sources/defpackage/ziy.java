package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: ziy  reason: default package */
/* loaded from: classes4.dex */
final class ziy {
    public final Uri a;
    public final zix b;

    public ziy(Uri uri, zix zixVar) {
        if (uri != null) {
            this.a = uri;
            if (zixVar != null) {
                this.b = zixVar;
                return;
            }
            throw new NullPointerException("Null observer");
        }
        throw new NullPointerException("Null subscribed");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ziy) {
            ziy ziyVar = (ziy) obj;
            if (this.a.equals(ziyVar.a) && this.b.equals(ziyVar.b)) {
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
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 52 + String.valueOf(valueOf2).length());
        sb.append("DataSyncObserverNotification{subscribed=");
        sb.append(valueOf);
        sb.append(", observer=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }

    public ziy() {
    }
}
