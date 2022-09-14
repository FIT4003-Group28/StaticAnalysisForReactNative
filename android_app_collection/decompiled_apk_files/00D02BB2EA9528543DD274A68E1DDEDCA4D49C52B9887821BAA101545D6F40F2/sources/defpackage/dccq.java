package defpackage;
/* compiled from: PG */
/* renamed from: dccq  reason: default package */
/* loaded from: classes.dex */
public abstract class dccq<E> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int e(int i, int i2) {
        int i3 = i + (i >> 1) + 1;
        if (i3 < i2) {
            int highestOneBit = Integer.highestOneBit(i2 - 1);
            i3 = highestOneBit + highestOneBit;
        }
        if (i3 < 0) {
            return Integer.MAX_VALUE;
        }
        return i3;
    }

    public abstract void b(E e);

    public void d(Iterable<? extends E> iterable) {
        for (E e : iterable) {
            b(e);
        }
    }
}
