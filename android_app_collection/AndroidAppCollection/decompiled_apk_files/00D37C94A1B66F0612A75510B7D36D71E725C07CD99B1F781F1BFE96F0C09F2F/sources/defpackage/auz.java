package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: auz  reason: default package */
/* loaded from: classes2.dex */
public final class auz {
    public final long a;
    public final pkt b;
    public final int c;
    public final long d;
    public final pkt e;
    public final int f;
    public final long g;
    public final long h;
    public final ppz i;
    public final ppz j;

    public auz(long j, pkt pktVar, int i, ppz ppzVar, long j2, pkt pktVar2, int i2, ppz ppzVar2, long j3, long j4) {
        this.a = j;
        this.b = pktVar;
        this.c = i;
        this.i = ppzVar;
        this.d = j2;
        this.e = pktVar2;
        this.f = i2;
        this.j = ppzVar2;
        this.g = j3;
        this.h = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            auz auzVar = (auz) obj;
            if (this.a == auzVar.a && this.c == auzVar.c && this.d == auzVar.d && this.f == auzVar.f && this.g == auzVar.g && this.h == auzVar.h && akzj.f(this.b, auzVar.b) && akzj.f(this.i, auzVar.i) && akzj.f(this.e, auzVar.e) && akzj.f(this.j, auzVar.j)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), this.b, Integer.valueOf(this.c), this.i, Long.valueOf(this.d), this.e, Integer.valueOf(this.f), this.j, Long.valueOf(this.g), Long.valueOf(this.h)});
    }
}
