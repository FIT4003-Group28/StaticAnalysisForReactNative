package defpackage;
/* compiled from: PG */
/* renamed from: dccj  reason: default package */
/* loaded from: classes.dex */
final class dccj {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i) {
        return (int) (Integer.rotateLeft((int) (i * (-862048943)), 15) * 461845907);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(Object obj) {
        return a(obj == null ? 0 : obj.hashCode());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(int i) {
        int max = Math.max(i, 2);
        int highestOneBit = Integer.highestOneBit(max);
        if (max > highestOneBit) {
            int i2 = highestOneBit + highestOneBit;
            if (i2 <= 0) {
                return 1073741824;
            }
            return i2;
        }
        return highestOneBit;
    }
}
