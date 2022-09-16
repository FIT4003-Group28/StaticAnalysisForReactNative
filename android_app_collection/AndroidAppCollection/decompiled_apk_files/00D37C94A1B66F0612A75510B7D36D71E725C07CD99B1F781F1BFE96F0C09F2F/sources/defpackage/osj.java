package defpackage;
/* compiled from: PG */
/* renamed from: osj  reason: default package */
/* loaded from: classes4.dex */
public final class osj {
    private final String a = "proto";

    private osj() {
    }

    public static osj a() {
        return new osj();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof osj) {
            return this.a.equals(((osj) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String str = this.a;
        StringBuilder sb = new StringBuilder(str.length() + 17);
        sb.append("Encoding{name=\"");
        sb.append(str);
        sb.append("\"}");
        return sb.toString();
    }
}
