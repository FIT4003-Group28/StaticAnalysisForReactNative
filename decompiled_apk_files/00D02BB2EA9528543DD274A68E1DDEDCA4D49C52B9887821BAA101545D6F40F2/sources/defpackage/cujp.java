package defpackage;
/* compiled from: PG */
/* renamed from: cujp  reason: default package */
/* loaded from: classes5.dex */
final class cujp extends cujt {
    private final String a;

    public cujp(String str) {
        this.a = str;
    }

    @Override // defpackage.cujt
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cujt)) {
            return false;
        }
        return this.a.equals(((cujt) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String str = this.a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 30);
        sb.append("MediaDownloadResult{filename=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
