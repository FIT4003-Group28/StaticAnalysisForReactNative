package defpackage;
/* compiled from: PG */
/* renamed from: wuk  reason: default package */
/* loaded from: classes7.dex */
public final class wuk extends wut {
    public final String a;

    public wuk(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null id");
    }

    @Override // defpackage.wut
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof wut)) {
            return false;
        }
        return this.a.equals(((wut) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String str = this.a;
        StringBuilder sb = new StringBuilder(str.length() + 14);
        sb.append("ProductId{id=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
