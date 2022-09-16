package defpackage;
/* compiled from: PG */
/* renamed from: cflt  reason: default package */
/* loaded from: classes4.dex */
public final class cflt extends cflw {
    public final long a;
    private final String b;

    public cflt(long j, String str) {
        this.a = j;
        if (str != null) {
            this.b = str;
            return;
        }
        throw new NullPointerException("Null displayName");
    }

    @Override // defpackage.cflw
    public final long a() {
        return this.a;
    }

    @Override // defpackage.cflw
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cflw) {
            cflw cflwVar = (cflw) obj;
            if (this.a == cflwVar.a() && this.b.equals(cflwVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return this.b.hashCode() ^ ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        long j = this.a;
        String str = this.b;
        StringBuilder sb = new StringBuilder(str.length() + 48);
        sb.append("Route{fprint=");
        sb.append(j);
        sb.append(", displayName=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
