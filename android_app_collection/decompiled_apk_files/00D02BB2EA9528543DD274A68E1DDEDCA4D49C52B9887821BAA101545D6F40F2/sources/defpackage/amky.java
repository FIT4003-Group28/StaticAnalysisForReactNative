package defpackage;
/* compiled from: PG */
/* renamed from: amky  reason: default package */
/* loaded from: classes.dex */
public final class amky {
    public static final amky f = b(1.0f);
    public final amkx a;
    public final int b;
    public final int c;
    public final float d;
    public final boolean e;

    private amky(amkx amkxVar, int i, int i2, float f2, boolean z) {
        this.a = amkxVar;
        this.b = i;
        this.c = i2;
        this.d = f2;
        this.e = z;
    }

    public static amky a(amkx amkxVar, float f2) {
        amkx amkxVar2 = amkx.PHONES_AND_TABLETS;
        int ordinal = amkxVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return new amky(amkx.CAR_HEAD_UNIT, 12, 32, Math.max(f2, 1.0f), true);
            }
            String valueOf = String.valueOf(amkxVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
            sb.append("Unknown type: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
        return b(f2);
    }

    private static amky b(float f2) {
        return new amky(amkx.PHONES_AND_TABLETS, 8, 32, f2, false);
    }
}
