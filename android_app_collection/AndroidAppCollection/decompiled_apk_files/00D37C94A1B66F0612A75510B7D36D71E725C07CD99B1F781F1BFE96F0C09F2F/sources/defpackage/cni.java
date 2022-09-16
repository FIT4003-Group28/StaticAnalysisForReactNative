package defpackage;
/* compiled from: PG */
/* renamed from: cni  reason: default package */
/* loaded from: classes2.dex */
final class cni {
    public final String a;

    public cni(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cni) {
            return this.a.equals(((cni) obj).a);
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
        sb.append("'}");
        return sb.toString();
    }
}
