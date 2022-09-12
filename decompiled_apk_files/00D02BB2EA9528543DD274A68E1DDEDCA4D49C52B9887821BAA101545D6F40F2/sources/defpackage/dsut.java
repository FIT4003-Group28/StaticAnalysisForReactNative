package defpackage;
/* compiled from: PG */
/* renamed from: dsut  reason: default package */
/* loaded from: classes.dex */
public final class dsut {
    static final int a = c(1, 3);
    static final int b = c(1, 4);
    static final int c = c(2, 0);
    static final int d = c(3, 2);

    public static int a(int i) {
        return i & 7;
    }

    public static int b(int i) {
        return i >>> 3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(int i, int i2) {
        return (i << 3) | i2;
    }
}
