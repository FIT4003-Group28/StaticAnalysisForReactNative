package defpackage;
/* compiled from: PG */
/* renamed from: akqs  reason: default package */
/* loaded from: classes.dex */
public final class akqs {
    public final Object a;
    public final int b;

    public akqs(Object obj, int i) {
        if (obj != null) {
            this.a = obj;
            this.b = i;
            return;
        }
        throw new NullPointerException("Null value");
    }

    public static akqs a(Object obj, int i) {
        return new akqs(obj, i);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akqs) {
            akqs akqsVar = (akqs) obj;
            if (this.a.equals(akqsVar.a) && this.b == akqsVar.b) {
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
        String str = i != 1 ? i != 2 ? i != 3 ? "INVALID" : "STALE" : "VALID" : "UNKNOWN";
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26 + str.length());
        sb.append("CacheEntry{value=");
        sb.append(valueOf);
        sb.append(", state=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }

    public akqs() {
    }
}
