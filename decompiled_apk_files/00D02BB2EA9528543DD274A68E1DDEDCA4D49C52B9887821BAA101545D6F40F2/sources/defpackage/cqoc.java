package defpackage;
/* compiled from: PG */
/* renamed from: cqoc  reason: default package */
/* loaded from: classes5.dex */
final class cqoc extends cqoy {
    private final int a;
    private final int b;
    private final cqtv c;

    public cqoc(int i, int i2, cqtv cqtvVar) {
        this.a = i;
        this.b = i2;
        this.c = cqtvVar;
    }

    @Override // defpackage.cqoy
    public final int a() {
        return this.a;
    }

    @Override // defpackage.cqoy
    public final int b() {
        return this.b;
    }

    @Override // defpackage.cqoy
    public final cqtv c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cqoy) {
            cqoy cqoyVar = (cqoy) obj;
            if (this.a == cqoyVar.a() && this.b == cqoyVar.b() && this.c.equals(cqoyVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ ((cqrp) this.c).a;
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        String valueOf = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 59);
        sb.append("GoneMargin{viewId=");
        sb.append(i);
        sb.append(", anchor=");
        sb.append(i2);
        sb.append(", margin=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
