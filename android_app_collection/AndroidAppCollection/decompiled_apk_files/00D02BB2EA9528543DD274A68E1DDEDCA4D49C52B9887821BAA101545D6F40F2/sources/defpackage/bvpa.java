package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: bvpa  reason: default package */
/* loaded from: classes.dex */
public final class bvpa {
    public short[] a;
    public int b;

    public bvpa() {
        this(16);
    }

    public final void a(short s) {
        int i = this.b;
        short[] sArr = this.a;
        int length = sArr.length;
        if (i >= length) {
            short[] sArr2 = new short[length + length];
            System.arraycopy(sArr, 0, sArr2, 0, length);
            this.a = sArr2;
        }
        short[] sArr3 = this.a;
        int i2 = this.b;
        this.b = i2 + 1;
        sArr3[i2] = s;
    }

    public final short[] b(int i) {
        while (true) {
            int i2 = this.b;
            short[] sArr = this.a;
            int length = sArr.length;
            if (i2 + i > length) {
                this.a = Arrays.copyOf(sArr, length + length);
            } else {
                return sArr;
            }
        }
    }

    public bvpa(int i) {
        this.a = new short[i == 0 ? 1 : i];
    }
}
