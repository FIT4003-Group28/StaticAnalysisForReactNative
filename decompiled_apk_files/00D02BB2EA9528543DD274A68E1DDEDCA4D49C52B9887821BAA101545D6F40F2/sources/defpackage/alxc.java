package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: alxc  reason: default package */
/* loaded from: classes2.dex */
public final class alxc {
    public int a;
    private byte b;
    private int c;

    public alxc() {
        this(0L);
    }

    public alxc(long j) {
        this.a = (int) ((-256) & j);
        this.b = (byte) (255 & j);
        this.c = (int) (j >> 32);
    }

    public final long a() {
        return (this.a & (-256)) | (this.b & 255) | (this.c << 32);
    }

    public final boolean equals(@dzsi Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof alxc) && a() == ((alxc) obj).a();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(a())});
    }
}
