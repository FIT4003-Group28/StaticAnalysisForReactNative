package defpackage;
/* compiled from: PG */
/* renamed from: ctyu  reason: default package */
/* loaded from: classes5.dex */
class ctyu extends cuhi {
    public final dcdc<cuhq> a;
    private final int b;
    private final int c;

    public ctyu(int i, int i2, dcdc<cuhq> dcdcVar) {
        this.b = i;
        this.c = i2;
        if (dcdcVar != null) {
            this.a = dcdcVar;
            return;
        }
        throw new NullPointerException("Null textStyles");
    }

    @Override // defpackage.cuhi
    public final int a() {
        return this.b;
    }

    @Override // defpackage.cuhi
    public final int b() {
        return this.c;
    }

    @Override // defpackage.cuhi
    public final dcdc<cuhq> c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cuhi) {
            cuhi cuhiVar = (cuhi) obj;
            if (this.b == cuhiVar.a() && this.c == cuhiVar.b() && dchl.m(this.a, cuhiVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.b ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        int i = this.b;
        int i2 = this.c;
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 76);
        sb.append("FormattedTextSpan{startIndex=");
        sb.append(i);
        sb.append(", endIndex=");
        sb.append(i2);
        sb.append(", textStyles=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
