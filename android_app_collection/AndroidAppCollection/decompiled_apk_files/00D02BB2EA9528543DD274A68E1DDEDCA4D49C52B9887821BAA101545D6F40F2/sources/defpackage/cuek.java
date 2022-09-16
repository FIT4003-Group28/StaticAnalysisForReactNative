package defpackage;
/* compiled from: PG */
/* renamed from: cuek  reason: default package */
/* loaded from: classes5.dex */
final class cuek extends cuhk {
    private final String a;

    public cuek(String str) {
        this.a = str;
    }

    @Override // defpackage.cuhk
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cuhk)) {
            return false;
        }
        return this.a.equals(((cuhk) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String str = this.a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 15);
        sb.append("HyperLink{url=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
