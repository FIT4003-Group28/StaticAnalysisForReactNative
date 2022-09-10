package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: alai  reason: default package */
/* loaded from: classes2.dex */
public final class alai {
    @dzsi
    public final alag a;
    public final float b;
    public final float c;
    public final float d;
    public final alae e;
    public final alah f;

    public alai(@dzsi alag alagVar, float f, float f2, float f3, alae alaeVar, alah alahVar) {
        this.a = alagVar;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = alaeVar;
        this.f = alahVar;
    }

    public static alaf a() {
        return new alaf();
    }

    public final boolean equals(@dzsi Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof alai)) {
            return false;
        }
        alai alaiVar = (alai) obj;
        return this.a == alaiVar.a && this.b == alaiVar.b && this.c == alaiVar.c && this.d == alaiVar.d && this.e.equals(alaiVar.e) && this.f == alaiVar.f;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b), Float.valueOf(this.c), Float.valueOf(this.d), this.e, this.f});
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.b("id", this.a);
        b.e("zoom", this.b);
        b.e("tilt", this.c);
        b.e("bearing", this.d);
        b.b("lookAhead", this.e);
        b.b("relativeTo", this.f);
        return b.toString();
    }
}
