package defpackage;
/* compiled from: PG */
/* renamed from: caf  reason: default package */
/* loaded from: classes.dex */
final class caf {
    public final String a;

    public caf(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof caf) {
            return this.a.equals(((caf) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String str = this.a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 29);
        sb.append("StringHeaderFactory{value='");
        sb.append(str);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
