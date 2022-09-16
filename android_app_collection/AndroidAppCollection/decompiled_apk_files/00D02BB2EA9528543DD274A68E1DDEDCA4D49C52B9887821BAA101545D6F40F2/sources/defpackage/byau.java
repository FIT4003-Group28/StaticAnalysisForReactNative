package defpackage;
/* compiled from: PG */
/* renamed from: byau  reason: default package */
/* loaded from: classes4.dex */
final class byau extends bybs {
    private final String a;

    public byau(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null identifier");
    }

    @Override // defpackage.bybs
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bybs)) {
            return false;
        }
        return this.a.equals(((bybs) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String str = this.a;
        StringBuilder sb = new StringBuilder(str.length() + 29);
        sb.append("AvailableCarsKey{identifier=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
