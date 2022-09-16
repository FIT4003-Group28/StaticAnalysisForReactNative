package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: ahoi  reason: default package */
/* loaded from: classes.dex */
public final class ahoi {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public ahoi(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ahoi)) {
            return false;
        }
        ahoi ahoiVar = (ahoi) obj;
        return this.a == ahoiVar.a && this.c == ahoiVar.c && this.d == ahoiVar.d && this.b == ahoiVar.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a), Float.valueOf(this.b), Float.valueOf(this.c), Float.valueOf(this.d)});
    }
}
