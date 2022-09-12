package defpackage;
/* compiled from: PG */
/* renamed from: decr  reason: default package */
/* loaded from: classes6.dex */
public final class decr {
    static int a(int i) {
        return i ^ Integer.MIN_VALUE;
    }

    public static int b(int i, int i2) {
        return decl.c(a(i), a(i2));
    }

    public static int c(long j) {
        if (j <= 0) {
            return 0;
        }
        if (j < 4294967296L) {
            return (int) j;
        }
        return -1;
    }
}
