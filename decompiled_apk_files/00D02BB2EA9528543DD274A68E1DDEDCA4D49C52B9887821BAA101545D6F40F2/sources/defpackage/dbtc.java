package defpackage;

import java.util.BitSet;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dbtc  reason: default package */
/* loaded from: classes5.dex */
public final class dbtc extends dbqu {
    private final char[] a;
    private final boolean b;
    private final long c;

    public dbtc(char[] cArr, long j, boolean z, String str) {
        super(str);
        this.a = cArr;
        this.c = j;
        this.b = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int v(int i) {
        return Integer.rotateLeft(i * (-862048943), 15) * 461845907;
    }

    @Override // defpackage.dbrb
    public final boolean b(char c) {
        if (c == 0) {
            return this.b;
        }
        if (((this.c >> c) & 1) != 1) {
            return false;
        }
        int length = this.a.length - 1;
        int v = v(c) & length;
        int i = v;
        do {
            char c2 = this.a[i];
            if (c2 == 0) {
                return false;
            }
            if (c2 == c) {
                return true;
            }
            i = (i + 1) & length;
        } while (i != v);
        return false;
    }

    @Override // defpackage.dbrb
    public final void l(BitSet bitSet) {
        char[] cArr;
        if (this.b) {
            bitSet.set(0);
        }
        for (char c : this.a) {
            if (c != 0) {
                bitSet.set(c);
            }
        }
    }
}
