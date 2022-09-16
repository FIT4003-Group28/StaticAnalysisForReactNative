package defpackage;

import com.google.android.exoplayer2.Format;
/* compiled from: PG */
/* renamed from: pft  reason: default package */
/* loaded from: classes4.dex */
public final class pft {
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
    public final pfu[] k;

    public pft(int i, int i2, long j, long j2, long j3, Format format, int i3, pfu[] pfuVarArr, int i4, long[] jArr, long[] jArr2) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = format;
        this.g = i3;
        this.k = pfuVarArr;
        this.j = i4;
        this.h = jArr;
        this.i = jArr2;
    }

    public final pfu a(int i) {
        pfu[] pfuVarArr = this.k;
        if (pfuVarArr == null) {
            return null;
        }
        return pfuVarArr[i];
    }
}
