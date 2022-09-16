package defpackage;
/* compiled from: PG */
/* renamed from: clis  reason: default package */
/* loaded from: classes5.dex */
public final class clis extends clju {
    private final String a;
    private final long b;

    public clis(String str, long j) {
        if (str != null) {
            this.a = str;
            this.b = j;
            return;
        }
        throw new NullPointerException("Null contentTag");
    }

    @Override // defpackage.clju
    public final String a() {
        return this.a;
    }

    @Override // defpackage.clju
    public final long b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof clju) {
            clju cljuVar = (clju) obj;
            if (this.a.equals(cljuVar.a()) && this.b == cljuVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        long j = this.b;
        return ((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        String str = this.a;
        long j = this.b;
        StringBuilder sb = new StringBuilder(str.length() + 75);
        sb.append("DownloadMetadata{contentTag=");
        sb.append(str);
        sb.append(", lastModifiedTimeSeconds=");
        sb.append(j);
        sb.append("}");
        return sb.toString();
    }
}
