package defpackage;

import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
/* compiled from: PG */
/* renamed from: bnru  reason: default package */
/* loaded from: classes3.dex */
public final class bnru {
    public final int a;
    public final int b;
    public final byte[] c;

    public bnru(byte[] bArr) {
        if (a(bArr)) {
            this.c = bArr;
            ShortBuffer asShortBuffer = ByteBuffer.wrap(bArr).asShortBuffer();
            this.a = asShortBuffer.get(4);
            this.b = asShortBuffer.get(5);
            return;
        }
        throw new IllegalArgumentException("Unrecognized compressed texture format");
    }

    public static boolean a(byte[] bArr) {
        return bArr[0] == 80 && bArr[1] == 75 && bArr[2] == 77 && bArr[3] == 32;
    }
}
