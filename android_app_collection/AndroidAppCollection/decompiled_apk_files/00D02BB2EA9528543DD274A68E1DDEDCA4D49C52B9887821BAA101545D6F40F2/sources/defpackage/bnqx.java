package defpackage;
/* compiled from: PG */
/* renamed from: bnqx  reason: default package */
/* loaded from: classes.dex */
enum bnqx {
    NEXT,
    PREV,
    Y,
    HEIGHT,
    CELL_COUNT,
    HOLE_LIMIT;
    
    private static final int g = values().length;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a(int[] iArr, int i) {
        return iArr[(i * g) + ordinal()];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(int[] iArr, int i, int i2) {
        iArr[(i * g) + ordinal()] = i2;
    }
}
