package defpackage;
/* compiled from: PG */
/* renamed from: bxky  reason: default package */
/* loaded from: classes4.dex */
public final class bxky extends bxkz {
    public final String a;
    public final int b;
    private final long c;

    public bxky(String str, int i, long j) {
        if (str != null) {
            this.a = str;
            this.b = i;
            this.c = j;
            return;
        }
        throw new NullPointerException("Null queryText");
    }

    @Override // defpackage.bxkz
    public final String a() {
        return this.a;
    }

    @Override // defpackage.bxkz
    public final int b() {
        return this.b;
    }

    @Override // defpackage.bxkz
    public final long c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bxkz) {
            bxkz bxkzVar = (bxkz) obj;
            if (this.a.equals(bxkzVar.a()) && this.b == bxkzVar.b() && this.c == bxkzVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        int i = this.b;
        long j = this.c;
        return ((((hashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        String str = this.a;
        int i = this.b;
        long j = this.c;
        StringBuilder sb = new StringBuilder(str.length() + 88);
        sb.append("QueryEdit{queryText=");
        sb.append(str);
        sb.append(", completionPoint=");
        sb.append(i);
        sb.append(", editTimestampMs=");
        sb.append(j);
        sb.append("}");
        return sb.toString();
    }
}
