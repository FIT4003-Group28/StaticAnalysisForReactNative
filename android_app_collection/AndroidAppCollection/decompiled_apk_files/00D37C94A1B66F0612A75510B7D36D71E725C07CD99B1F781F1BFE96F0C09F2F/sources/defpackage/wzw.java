package defpackage;
/* compiled from: PG */
/* renamed from: wzw  reason: default package */
/* loaded from: classes4.dex */
public final class wzw {
    public final String a;

    public wzw() {
    }

    public static wzw a() {
        return new wzw("");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof wzw)) {
            return false;
        }
        return this.a.equals(((wzw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String str = this.a;
        StringBuilder sb = new StringBuilder(str.length() + 40);
        sb.append("AdVideoPlaybackContextModel{adVideoCpn=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }

    public wzw(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null adVideoCpn");
    }
}
