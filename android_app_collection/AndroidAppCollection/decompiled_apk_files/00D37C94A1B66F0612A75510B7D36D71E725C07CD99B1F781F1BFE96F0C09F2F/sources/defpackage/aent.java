package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: aent  reason: default package */
/* loaded from: classes.dex */
public final class aent {
    public static final aens a = aens.a(-1, -1);
    public final byte[] b;
    public final String c;
    public final int d;
    public final long e;
    public final long f;
    public final boolean g;
    public final boolean h;
    public final long i;
    public final String j;
    public aens k;

    public aent(byte[] bArr, String str, int i, long j, long j2, boolean z, boolean z2, String str2, long j3, aens aensVar) {
        this.b = (byte[]) afms.a(bArr);
        afms.a(str);
        this.c = str;
        this.d = i;
        this.e = j;
        this.f = j2;
        this.g = z;
        this.h = z2;
        this.j = str2;
        this.i = j3;
        afms.a(aensVar);
        this.k = aensVar;
        if (aensVar == a || bArr.length == aensVar.b - aensVar.a) {
            return;
        }
        afus.b(1, 8, "data_byte_range_mismatch");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof aent) {
                aent aentVar = (aent) obj;
                if (this.c.equals(aentVar.c) && this.d == aentVar.d && this.e == aentVar.e && this.f == aentVar.f && this.g == aentVar.g && this.h == aentVar.h) {
                    aens aensVar = this.k;
                    long j = aensVar.a;
                    aens aensVar2 = aentVar.k;
                    return j == aensVar2.a && aensVar.b == aensVar2.b && Arrays.equals(this.b, aentVar.b);
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        throw new UnsupportedOperationException();
    }
}
