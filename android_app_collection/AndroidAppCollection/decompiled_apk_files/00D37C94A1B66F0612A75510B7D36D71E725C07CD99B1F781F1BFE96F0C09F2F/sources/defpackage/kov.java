package defpackage;
/* compiled from: PG */
/* renamed from: kov  reason: default package */
/* loaded from: classes3.dex */
final class kov {
    public final amuk a;
    public final int b;

    public kov(amuk amukVar, int i) {
        if (amukVar != null) {
            this.a = amukVar;
            this.b = i;
            return;
        }
        throw new NullPointerException("Null playlistPanelVideos");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kov) {
            kov kovVar = (kov) obj;
            if (amxp.v(this.a, kovVar.a) && this.b == kovVar.b) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 90);
        sb.append("PlaylistPanelVideosAndPlaybackPosition{playlistPanelVideos=");
        sb.append(valueOf);
        sb.append(", playbackPosition=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }

    public kov() {
    }
}
