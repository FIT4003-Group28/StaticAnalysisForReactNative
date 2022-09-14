package defpackage;
/* compiled from: PG */
/* renamed from: cupg  reason: default package */
/* loaded from: classes5.dex */
final class cupg extends cuqh {
    private final String a;
    private final int b;
    private final int c;

    public cupg(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.cuqh
    public final String a() {
        return this.a;
    }

    @Override // defpackage.cuqh
    public final int b() {
        return this.b;
    }

    @Override // defpackage.cuqh
    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cuqh) {
            cuqh cuqhVar = (cuqh) obj;
            if (this.a.equals(cuqhVar.a()) && this.b == cuqhVar.b() && this.c == cuqhVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public final String toString() {
        String str = this.a;
        int i = this.b;
        int i2 = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 70);
        sb.append("StatusBadge{text=");
        sb.append(str);
        sb.append(", backgroundColor=");
        sb.append(i);
        sb.append(", textColor=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }
}
