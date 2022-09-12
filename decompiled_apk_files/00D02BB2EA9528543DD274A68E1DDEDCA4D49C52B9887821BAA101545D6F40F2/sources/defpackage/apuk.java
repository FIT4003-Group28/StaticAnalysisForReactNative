package defpackage;
/* compiled from: PG */
/* renamed from: apuk  reason: default package */
/* loaded from: classes2.dex */
public final class apuk extends apuu {
    private final String a;

    public apuk(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null reviewId");
    }

    @Override // defpackage.apuu
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof apuu)) {
            return false;
        }
        return this.a.equals(((apuu) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String str = this.a;
        StringBuilder sb = new StringBuilder(str.length() + 37);
        sb.append("ReviewResponseDeletedEvent{reviewId=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
