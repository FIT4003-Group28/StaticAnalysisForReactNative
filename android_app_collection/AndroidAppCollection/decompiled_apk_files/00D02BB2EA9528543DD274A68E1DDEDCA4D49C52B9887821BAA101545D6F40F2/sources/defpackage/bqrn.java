package defpackage;
/* compiled from: PG */
/* renamed from: bqrn  reason: default package */
/* loaded from: classes4.dex */
final class bqrn extends bqsg {
    public final String a;
    private final float b;
    private final String c;
    private final int d;

    public bqrn(String str, float f, String str2, int i) {
        this.a = str;
        this.b = f;
        if (str2 != null) {
            this.c = str2;
            this.d = i;
            return;
        }
        throw new NullPointerException("Null promptMessage");
    }

    @Override // defpackage.bqsg
    public final String a() {
        return this.a;
    }

    @Override // defpackage.bqsg
    public final float b() {
        return this.b;
    }

    @Override // defpackage.bqsg
    public final String c() {
        return this.c;
    }

    @Override // defpackage.bqsg
    public final int d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bqsg) {
            bqsg bqsgVar = (bqsg) obj;
            if (this.a.equals(bqsgVar.a()) && Float.floatToIntBits(this.b) == Float.floatToIntBits(bqsgVar.b()) && this.c.equals(bqsgVar.c()) && this.d == bqsgVar.d()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.b)) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d;
    }

    public final String toString() {
        String str = this.a;
        float f = this.b;
        String str2 = this.c;
        int i = this.d;
        StringBuilder sb = new StringBuilder(str.length() + 76 + str2.length());
        sb.append("Prompt{label=");
        sb.append(str);
        sb.append(", threshold=");
        sb.append(f);
        sb.append(", promptMessage=");
        sb.append(str2);
        sb.append(", score=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
