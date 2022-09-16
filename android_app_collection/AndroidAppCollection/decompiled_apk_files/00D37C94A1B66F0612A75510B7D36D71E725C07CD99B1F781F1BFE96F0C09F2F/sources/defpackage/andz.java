package defpackage;
/* compiled from: PG */
/* renamed from: andz  reason: default package */
/* loaded from: classes.dex */
public final class andz {
    public final String a;

    public andz(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof andz)) {
            return false;
        }
        return this.a.equals(((andz) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1809505057;
    }

    public final String toString() {
        String str = this.a;
        StringBuilder sb = new StringBuilder(str.length() + 20);
        sb.append("TrustedResourceUrl{");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
