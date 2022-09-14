package defpackage;
/* compiled from: PG */
/* renamed from: dczr  reason: default package */
/* loaded from: classes5.dex */
public final class dczr {
    public final String a;

    static {
        new dczr("");
    }

    public dczr(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dczr)) {
            return false;
        }
        return this.a.equals(((dczr) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 867184553;
    }

    public final String toString() {
        String str = this.a;
        StringBuilder sb = new StringBuilder(str.length() + 10);
        sb.append("SafeHtml{");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
