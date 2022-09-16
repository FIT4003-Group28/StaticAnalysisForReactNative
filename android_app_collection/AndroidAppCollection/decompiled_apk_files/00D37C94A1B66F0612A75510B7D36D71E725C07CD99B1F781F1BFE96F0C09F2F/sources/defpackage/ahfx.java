package defpackage;
/* compiled from: PG */
/* renamed from: ahfx  reason: default package */
/* loaded from: classes.dex */
final class ahfx extends ahgd {
    private final String a;

    public ahfx(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null videoId");
    }

    @Override // defpackage.ahgd
    public String a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ahgd)) {
            return false;
        }
        return this.a.equals(((ahgd) obj).a());
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        String str = this.a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 48);
        sb.append("OfflineDrmSessionExpirationUpdateEvent{videoId=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
