package defpackage;

import android.graphics.Typeface;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: atob  reason: default package */
/* loaded from: classes2.dex */
public final class atob {
    public final cqtv a;
    public final cqtv b;
    public final cqtv c;
    public final cqtv d;
    public final cqtv e;
    public final float f;
    public final boolean g;
    public final cqss h;
    public final float i;
    public final float j;
    public final float k;
    public final Typeface l;
    public final int m = 5;
    public final cqtv n;

    public atob(cqtv cqtvVar, cqtv cqtvVar2, cqtv cqtvVar3, cqtv cqtvVar4, cqtv cqtvVar5, float f, boolean z, cqss cqssVar, float f2, float f3, float f4, Typeface typeface, cqtv cqtvVar6) {
        this.a = cqtvVar;
        this.b = cqtvVar2;
        this.c = cqtvVar3;
        this.d = cqtvVar4;
        this.e = cqtvVar5;
        this.f = f;
        this.g = z;
        this.h = cqssVar;
        this.i = f2;
        this.j = f3;
        this.k = f4;
        this.l = typeface;
        this.n = cqtvVar6;
    }

    public final boolean equals(@dzsi Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof atob) {
            atob atobVar = (atob) obj;
            if (this.a == atobVar.a && this.b == atobVar.b && this.c == atobVar.c && this.d == atobVar.d && this.e == atobVar.e && this.f == atobVar.f && this.g == atobVar.g && this.h.equals(atobVar.h) && this.i == atobVar.i && this.j == atobVar.j && this.k == atobVar.k && this.l.equals(atobVar.l)) {
                int i = atobVar.m;
                if (this.n == atobVar.n) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, Float.valueOf(this.f), Boolean.valueOf(this.g), this.h, Float.valueOf(this.i), Float.valueOf(this.j), Float.valueOf(this.k), this.l, 5, this.n});
    }
}
