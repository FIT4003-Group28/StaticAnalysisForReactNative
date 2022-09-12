package defpackage;
/* compiled from: PG */
/* renamed from: ggs  reason: default package */
/* loaded from: classes.dex */
public final class ggs extends ggt {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public ggs(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    @Override // defpackage.ggt
    public final float a() {
        return this.a;
    }

    @Override // defpackage.ggt
    public final float b() {
        return this.b;
    }

    @Override // defpackage.ggt
    public final float c() {
        return this.c;
    }

    @Override // defpackage.ggt
    public final float d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ggt) {
            ggt ggtVar = (ggt) obj;
            if (Float.floatToIntBits(this.a) == Float.floatToIntBits(ggtVar.a()) && Float.floatToIntBits(this.b) == Float.floatToIntBits(ggtVar.b()) && Float.floatToIntBits(this.c) == Float.floatToIntBits(ggtVar.c()) && Float.floatToIntBits(this.d) == Float.floatToIntBits(ggtVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((Float.floatToIntBits(this.a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.b)) * 1000003) ^ Float.floatToIntBits(this.c)) * 1000003) ^ Float.floatToIntBits(this.d);
    }

    public final String toString() {
        float f = this.a;
        float f2 = this.b;
        float f3 = this.c;
        float f4 = this.d;
        StringBuilder sb = new StringBuilder(104);
        sb.append("ImmutableRectF{left=");
        sb.append(f);
        sb.append(", top=");
        sb.append(f2);
        sb.append(", right=");
        sb.append(f3);
        sb.append(", bottom=");
        sb.append(f4);
        sb.append("}");
        return sb.toString();
    }
}
