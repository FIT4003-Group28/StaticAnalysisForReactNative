package defpackage;

import com.google.android.exoplayer2.Format;
/* compiled from: PG */
/* renamed from: bcc  reason: default package */
/* loaded from: classes2.dex */
public final class bcc {
    public final int a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;
    public final Format f;
    public final int g;
    public final long[] h;
    public final long[] i;
    public final int j;
    public final bcd[] k;

    public bcc(int i, int i2, long j, long j2, long j3, Format format, int i3, bcd[] bcdVarArr, int i4, long[] jArr, long[] jArr2) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = format;
        this.g = i3;
        this.k = bcdVarArr;
        this.j = i4;
        this.h = jArr;
        this.i = jArr2;
    }

    public final bcd a(int i) {
        bcd[] bcdVarArr = this.k;
        if (bcdVarArr == null) {
            return null;
        }
        return bcdVarArr[i];
    }
}
