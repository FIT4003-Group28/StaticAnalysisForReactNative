package defpackage;
/* compiled from: PG */
/* renamed from: bnqw  reason: default package */
/* loaded from: classes.dex */
enum bnqw {
    NEXT,
    X,
    Y,
    WIDTH,
    HEIGHT,
    FLAGS;
    
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
