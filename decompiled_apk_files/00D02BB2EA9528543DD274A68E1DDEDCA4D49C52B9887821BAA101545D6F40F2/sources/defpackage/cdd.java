package defpackage;
/* compiled from: PG */
/* renamed from: cdd  reason: default package */
/* loaded from: classes.dex */
final class cdd extends cdi {
    @Override // defpackage.cdi
    public final float a(int i, int i2, int i3, int i4) {
        int min = Math.min(i2 / i4, i / i3);
        if (min == 0) {
            return 1.0f;
        }
        return 1.0f / Integer.highestOneBit(min);
    }

    @Override // defpackage.cdi
    public final int b(int i, int i2, int i3, int i4) {
        return 2;
    }
}
