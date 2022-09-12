package defpackage;
/* compiled from: PG */
/* renamed from: clnm  reason: default package */
/* loaded from: classes5.dex */
public final class clnm {
    public final long a = -9223372036854775807L;
    public final long b = -9223372036854775807L;
    public final long c = -9223372036854775807L;
    public final float d = -3.4028235E38f;
    public final float e = -3.4028235E38f;

    static {
        new clnm();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof clnm)) {
            return false;
        }
        clnm clnmVar = (clnm) obj;
        long j = clnmVar.a;
        long j2 = clnmVar.b;
        long j3 = clnmVar.c;
        float f = clnmVar.d;
        float f2 = clnmVar.e;
        return true;
    }

    public final int hashCode() {
        int i = (int) (-9223372034707292159L);
        return (((((((i * 31) + i) * 31) + i) * 31) + Float.floatToIntBits(-3.4028235E38f)) * 31) + Float.floatToIntBits(-3.4028235E38f);
    }
}
