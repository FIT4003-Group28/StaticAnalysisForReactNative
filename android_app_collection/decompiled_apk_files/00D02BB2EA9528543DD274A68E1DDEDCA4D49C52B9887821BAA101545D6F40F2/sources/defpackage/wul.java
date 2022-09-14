package defpackage;
/* compiled from: PG */
/* renamed from: wul  reason: default package */
/* loaded from: classes7.dex */
final class wul extends wuu {
    private final String a;

    public wul(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null productId");
    }

    @Override // defpackage.wuu
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof wuu)) {
            return false;
        }
        return this.a.equals(((wuu) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String str = this.a;
        StringBuilder sb = new StringBuilder(str.length() + 34);
        sb.append("TripEstimateParameters{productId=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
