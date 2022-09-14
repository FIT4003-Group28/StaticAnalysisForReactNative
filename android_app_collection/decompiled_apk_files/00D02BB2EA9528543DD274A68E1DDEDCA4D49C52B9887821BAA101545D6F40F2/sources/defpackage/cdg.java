package defpackage;
/* compiled from: PG */
/* renamed from: cdg  reason: default package */
/* loaded from: classes.dex */
final class cdg extends cdi {
    @Override // defpackage.cdi
    public final float a(int i, int i2, int i3, int i4) {
        if (h) {
            return Math.min(i3 / i, i4 / i2);
        }
        int max = Math.max(i2 / i4, i / i3);
        if (max != 0) {
            return 1.0f / Integer.highestOneBit(max);
        }
        return 1.0f;
    }

    @Override // defpackage.cdi
    public final int b(int i, int i2, int i3, int i4) {
        return h ? 2 : 1;
    }
}
