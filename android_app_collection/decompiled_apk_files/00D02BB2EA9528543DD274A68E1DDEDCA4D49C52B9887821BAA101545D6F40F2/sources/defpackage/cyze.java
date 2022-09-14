package defpackage;
/* compiled from: PG */
/* renamed from: cyze  reason: default package */
/* loaded from: classes5.dex */
final class cyze extends czad {
    public final long a;
    public final String b;

    public cyze(long j, String str) {
        this.a = j;
        if (str != null) {
            this.b = str;
            return;
        }
        throw new NullPointerException("Null accountName");
    }

    @Override // defpackage.czad
    public final long a() {
        return this.a;
    }

    @Override // defpackage.czad
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof czad) {
            czad czadVar = (czad) obj;
            if (this.a == czadVar.a() && this.b.equals(czadVar.b())) {
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
        StringBuilder sb = new StringBuilder(str.length() + 70);
        sb.append("FeatureSideInput{currentTimeMillis=");
        sb.append(j);
        sb.append(", accountName=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
