package defpackage;
/* compiled from: PG */
/* renamed from: cniu  reason: default package */
/* loaded from: classes5.dex */
public final class cniu {
    public final String a;
    public final int b;

    public cniu(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cniu)) {
            return false;
        }
        cniu cniuVar = (cniu) obj;
        return this.b == cniuVar.b && this.a.equals(cniuVar.a);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        String str = this.a;
        int i = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 56);
        sb.append("PackageInfoSpec{packageName='");
        sb.append(str);
        sb.append('\'');
        sb.append(", versionCode=");
        sb.append(i);
        sb.append('}');
        return sb.toString();
    }
}
