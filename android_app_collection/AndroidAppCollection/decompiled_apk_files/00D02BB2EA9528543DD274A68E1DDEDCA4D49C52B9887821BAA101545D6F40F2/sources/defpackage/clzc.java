package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: clzc  reason: default package */
/* loaded from: classes5.dex */
final class clzc {
    public static final byte[] a = {0, 0, 1};
    public boolean b;
    public int c;
    public int d;
    public int e;
    public byte[] f = new byte[128];

    public final void a() {
        this.b = false;
        this.d = 0;
        this.c = 0;
    }

    public final void b(byte[] bArr, int i, int i2) {
        if (!this.b) {
            return;
        }
        int i3 = i2 - i;
        byte[] bArr2 = this.f;
        int length = bArr2.length;
        int i4 = this.d + i3;
        if (length < i4) {
            this.f = Arrays.copyOf(bArr2, i4 + i4);
        }
        System.arraycopy(bArr, i, this.f, this.d, i3);
        this.d += i3;
    }
}
