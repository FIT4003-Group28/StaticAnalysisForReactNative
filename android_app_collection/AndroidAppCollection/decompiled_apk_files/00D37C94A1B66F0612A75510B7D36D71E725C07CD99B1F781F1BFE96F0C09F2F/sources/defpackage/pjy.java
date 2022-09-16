package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: pjy  reason: default package */
/* loaded from: classes4.dex */
public final class pjy {
    public final Object a;
    public final int b;
    public final Object c;
    public final int d;
    public final long e;
    public final long f;
    public final int g;
    public final int h;

    public pjy(Object obj, int i, Object obj2, int i2, long j, long j2, int i3, int i4) {
        this.a = obj;
        this.b = i;
        this.c = obj2;
        this.d = i2;
        this.e = j;
        this.f = j2;
        this.g = i3;
        this.h = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            pjy pjyVar = (pjy) obj;
            if (this.b == pjyVar.b && this.d == pjyVar.d && this.e == pjyVar.e && this.f == pjyVar.f && this.g == pjyVar.g && this.h == pjyVar.h && akzj.f(this.a, pjyVar.a) && akzj.f(this.c, pjyVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), this.c, Integer.valueOf(this.d), Integer.valueOf(this.b), Long.valueOf(this.e), Long.valueOf(this.f), Integer.valueOf(this.g), Integer.valueOf(this.h)});
    }
}
