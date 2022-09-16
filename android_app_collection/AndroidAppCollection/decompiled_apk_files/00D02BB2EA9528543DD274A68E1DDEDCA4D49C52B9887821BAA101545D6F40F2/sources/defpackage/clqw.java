package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: clqw  reason: default package */
/* loaded from: classes5.dex */
public final class clqw {
    public final long a;
    public final clpb b;
    public final int c;
    public final cmeh d;
    public final long e;
    public final clpb f;
    public final int g;
    public final cmeh h;
    public final long i;
    public final long j;

    public clqw(long j, clpb clpbVar, int i, cmeh cmehVar, long j2, clpb clpbVar2, int i2, cmeh cmehVar2, long j3, long j4) {
        this.a = j;
        this.b = clpbVar;
        this.c = i;
        this.d = cmehVar;
        this.e = j2;
        this.f = clpbVar2;
        this.g = i2;
        this.h = cmehVar2;
        this.i = j3;
        this.j = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            clqw clqwVar = (clqw) obj;
            if (this.a == clqwVar.a && this.c == clqwVar.c && this.e == clqwVar.e && this.g == clqwVar.g && this.i == clqwVar.i && this.j == clqwVar.j && dbsd.a(this.b, clqwVar.b) && dbsd.a(this.d, clqwVar.d) && dbsd.a(this.f, clqwVar.f) && dbsd.a(this.h, clqwVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), this.b, Integer.valueOf(this.c), this.d, Long.valueOf(this.e), this.f, Integer.valueOf(this.g), this.h, Long.valueOf(this.i), Long.valueOf(this.j)});
    }
}
