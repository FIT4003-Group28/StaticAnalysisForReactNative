package defpackage;
/* compiled from: PG */
/* renamed from: cuoo  reason: default package */
/* loaded from: classes5.dex */
final class cuoo extends cupm {
    private final int b;
    private final String c;
    private final dcdc<cuqd> d;

    public cuoo(int i, String str, dcdc<cuqd> dcdcVar) {
        this.b = i;
        this.c = str;
        this.d = dcdcVar;
    }

    @Override // defpackage.cupm
    public final int a() {
        return this.b;
    }

    @Override // defpackage.cupm
    public final String b() {
        return this.c;
    }

    @Override // defpackage.cupm
    public final dcdc<cuqd> c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cupm) {
            cupm cupmVar = (cupm) obj;
            if (this.b == cupmVar.a() && this.c.equals(cupmVar.b()) && dchl.m(this.d, cupmVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.b ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        int i = this.b;
        String str = this.c;
        String valueOf = String.valueOf(this.d);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 56 + String.valueOf(valueOf).length());
        sb.append("CardCarousel{cardWidth=");
        sb.append(i);
        sb.append(", jsonSource=");
        sb.append(str);
        sb.append(", cards=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
