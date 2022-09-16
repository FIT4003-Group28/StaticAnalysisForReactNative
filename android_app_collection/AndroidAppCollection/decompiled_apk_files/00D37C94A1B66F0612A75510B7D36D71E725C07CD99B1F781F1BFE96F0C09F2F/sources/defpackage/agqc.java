package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: agqc  reason: default package */
/* loaded from: classes.dex */
public final class agqc {
    public String a;
    public int b;
    public String c;
    public int d;
    public int e;
    public byte[] f;
    public byte[] g;
    public boolean h;

    public final agqd a() {
        return new agqd(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }

    public final void b(byte[] bArr) {
        this.f = Arrays.copyOf(bArr, bArr.length);
    }
}
