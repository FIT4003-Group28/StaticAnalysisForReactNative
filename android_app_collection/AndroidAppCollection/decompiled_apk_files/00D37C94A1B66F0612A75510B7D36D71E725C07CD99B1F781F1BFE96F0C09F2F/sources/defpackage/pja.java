package defpackage;
/* compiled from: PG */
/* renamed from: pja  reason: default package */
/* loaded from: classes4.dex */
public final class pja {
    public final long a = -9223372036854775807L;
    public final long b = -9223372036854775807L;
    public final long c = -9223372036854775807L;
    public final float d = -3.4028235E38f;
    public final float e = -3.4028235E38f;

    static {
        new pja();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pja)) {
            return false;
        }
        pja pjaVar = (pja) obj;
        long j = pjaVar.a;
        long j2 = pjaVar.b;
        long j3 = pjaVar.c;
        float f = pjaVar.d;
        float f2 = pjaVar.e;
        return true;
    }

    public final int hashCode() {
        int i = (int) (-9223372034707292159L);
        return (((((((i * 31) + i) * 31) + i) * 31) + Float.floatToIntBits(-3.4028235E38f)) * 31) + Float.floatToIntBits(-3.4028235E38f);
    }
}
