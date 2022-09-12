package defpackage;

import com.google.android.apps.gmm.ugc.post.photo.MediaData;
/* compiled from: PG */
/* renamed from: cdup  reason: default package */
/* loaded from: classes4.dex */
final class cdup extends cdxe {
    private final MediaData a;
    private final int b;

    public cdup(MediaData mediaData, int i) {
        if (mediaData != null) {
            this.a = mediaData;
            this.b = i;
            return;
        }
        throw new NullPointerException("Null mediaData");
    }

    @Override // defpackage.cdxe
    public final MediaData a() {
        return this.a;
    }

    @Override // defpackage.cdxe
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cdxe) {
            cdxe cdxeVar = (cdxe) obj;
            if (this.a.equals(cdxeVar.a()) && this.b == cdxeVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        int i = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
        sb.append("Media{mediaData=");
        sb.append(valueOf);
        sb.append(", index=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
