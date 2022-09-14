package defpackage;
/* compiled from: PG */
/* renamed from: clct  reason: default package */
/* loaded from: classes5.dex */
public final class clct {
    private final String a;

    private clct(String str) {
        this.a = str;
    }

    public static clct a(String str) {
        return new clct(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof clct) {
            return this.a.equals(((clct) obj).a);
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
