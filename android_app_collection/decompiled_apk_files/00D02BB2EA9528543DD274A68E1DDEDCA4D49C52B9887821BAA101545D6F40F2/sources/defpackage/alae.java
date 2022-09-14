package defpackage;

import java.io.Serializable;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: alae  reason: default package */
/* loaded from: classes.dex */
public final class alae implements Serializable {
    public static final alae a = new alae(0.0f, 0.0f);
    public final float b;
    public final float c;

    public alae(float f, float f2) {
        this.b = f;
        this.c = f2;
    }

    public static alae a(float f, float f2, float f3, float f4) {
        return new alae(((f + f) / f3) - 1.0f, ((f2 + f2) / f4) - 1.0f);
    }

    public static alae e(alae alaeVar) {
        float f = 0.0f;
        float a2 = Float.isNaN(alaeVar.b) ? 0.0f : akn.a(alaeVar.b, -1.0f, 1.0f);
        if (!Float.isNaN(alaeVar.c)) {
            f = akn.a(alaeVar.c, -1.0f, 1.0f);
        }
        return (Float.floatToIntBits(a2) == Float.floatToIntBits(alaeVar.b) && Float.floatToIntBits(f) == Float.floatToIntBits(alaeVar.c)) ? alaeVar : new alae(a2, f);
    }

    public final float b() {
        return (this.b + 1.0f) / 2.0f;
    }

    public final float c() {
        return (this.c + 1.0f) / 2.0f;
    }

    public final alae d(alae alaeVar, float f) {
        float f2 = this.b;
        float f3 = alaeVar.b;
        float f4 = this.c;
        return new alae(f2 + ((f3 - f2) * f), f4 + ((alaeVar.c - f4) * f));
    }

    public final boolean equals(@dzsi Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof alae) {
            alae alaeVar = (alae) obj;
            if (Float.floatToIntBits(this.b) == Float.floatToIntBits(alaeVar.b) && Float.floatToIntBits(this.c) == Float.floatToIntBits(alaeVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.b), Float.valueOf(this.c)});
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.e("x", this.b);
        b.e("y", this.c);
        return b.toString();
    }
}
