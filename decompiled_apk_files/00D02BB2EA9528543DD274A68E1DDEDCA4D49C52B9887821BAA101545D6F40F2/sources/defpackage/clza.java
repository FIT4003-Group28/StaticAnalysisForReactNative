package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: clza  reason: default package */
/* loaded from: classes5.dex */
final class clza {
    public static final byte[] a = {0, 0, 1};
    public boolean b;
    public int c;
    public int d;
    public byte[] e = new byte[128];

    public final void a(byte[] bArr, int i, int i2) {
        if (!this.b) {
            return;
        }
        int i3 = i2 - i;
        byte[] bArr2 = this.e;
        int length = bArr2.length;
        int i4 = this.c + i3;
        if (length < i4) {
            this.e = Arrays.copyOf(bArr2, i4 + i4);
        }
        System.arraycopy(bArr, i, this.e, this.c, i3);
        this.c += i3;
    }
}