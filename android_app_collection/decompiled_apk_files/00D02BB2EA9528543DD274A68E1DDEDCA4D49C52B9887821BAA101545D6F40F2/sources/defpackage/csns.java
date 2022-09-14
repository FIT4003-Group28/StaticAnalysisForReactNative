package defpackage;
/* compiled from: PG */
/* renamed from: csns  reason: default package */
/* loaded from: classes5.dex */
final class csns<V> extends csoa<V> {
    private final dbsg<V> a;
    private final long b;
    private final int c;

    public csns(dbsg<V> dbsgVar, int i, long j) {
        this.a = dbsgVar;
        this.c = i;
        this.b = j;
    }

    @Override // defpackage.csoa
    public final dbsg<V> a() {
        return this.a;
    }

    @Override // defpackage.csoa
    public final long b() {
        return this.b;
    }

    @Override // defpackage.csoa
    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof csoa) {
            csoa csoaVar = (csoa) obj;
            if (this.a.equals(csoaVar.a())) {
                int i = this.c;
                int c = csoaVar.c();
                if (i == 0) {
                    throw null;
                }
                if (i == c && this.b == csoaVar.b()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        int i = this.c;
        if (i != 0) {
            long j = this.b;
            return ((hashCode ^ i) * 1000003) ^ ((int) ((j >>> 32) ^ j));
        }
        throw null;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String a = csnz.a(this.c);
        long j = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 53 + a.length());
        sb.append("Value{value=");
        sb.append(valueOf);
        sb.append(", state=");
        sb.append(a);
        sb.append(", timestamp=");
        sb.append(j);
        sb.append("}");
        return sb.toString();
    }
}
