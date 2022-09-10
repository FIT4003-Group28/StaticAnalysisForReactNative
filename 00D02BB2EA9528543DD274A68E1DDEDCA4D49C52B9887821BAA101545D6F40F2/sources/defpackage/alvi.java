package defpackage;
/* compiled from: PG */
/* renamed from: alvi  reason: default package */
/* loaded from: classes.dex */
public final class alvi {
    public final akra a;
    public float b;
    public int c;

    public alvi(akra akraVar, int i, float f) {
        this.a = akraVar;
        this.c = i;
        this.b = f;
    }

    public static alvi a(dmlq dmlqVar, akqn akqnVar) {
        int i;
        float f;
        dmls dmlsVar = dmlqVar.b;
        if (dmlsVar == null) {
            dmlsVar = dmls.c;
        }
        akra h = akqnVar.h(dmlsVar.b);
        if ((dmlqVar.a & 4) != 0) {
            f = dmlqVar.d / 10.0f;
            i = 1;
        } else {
            i = 2;
            f = 0.0f;
        }
        return new alvi(h, i, f);
    }

    public static alvi c(akra akraVar) {
        return new alvi(akraVar, 2, Float.NaN);
    }

    public final boolean b() {
        return !Float.isNaN(this.b) && !(this.b == 0.0f && this.c == 2);
    }

    public final void d(float f, int i) {
        this.c = i;
        this.b = f;
    }

    public final boolean equals(@dzsi Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        alvi alviVar = (alvi) obj;
        if (this.c != alviVar.c) {
            return false;
        }
        akra akraVar = this.a;
        if (akraVar == null) {
            if (alviVar.a != null) {
                return false;
            }
        } else if (!akraVar.equals(alviVar.a)) {
            return false;
        }
        return Float.floatToIntBits(this.b) == Float.floatToIntBits(alviVar.b);
    }

    public final int hashCode() {
        int i = this.c;
        if (i != 0) {
            int i2 = (i + 31) * 31;
            akra akraVar = this.a;
            return ((i2 + (akraVar == null ? 0 : akraVar.hashCode())) * 31) + Float.floatToIntBits(this.b);
        }
        throw null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AbsolutePosition{position=");
        sb.append(this.a);
        if (b()) {
            sb.append(", rotationMode=");
            int i = this.c;
            sb.append((Object) (i != 1 ? i != 2 ? "null" : "SCREEN_RELATIVE" : "WORLD_RELATIVE"));
            sb.append(", rotation=");
            sb.append(this.b);
        }
        sb.append('}');
        return sb.toString();
    }
}
