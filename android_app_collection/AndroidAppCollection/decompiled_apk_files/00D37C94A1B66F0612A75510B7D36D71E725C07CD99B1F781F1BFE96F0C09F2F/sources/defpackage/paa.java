package defpackage;

import com.google.android.exoplayer.MediaFormat;
/* compiled from: PG */
/* renamed from: paa  reason: default package */
/* loaded from: classes4.dex */
final class paa extends pab {
    private final pct a;
    private int c;
    private int d;
    private int e;
    private long f;
    private MediaFormat g;
    private int h;
    private long i;

    public paa(oyf oyfVar) {
        super(oyfVar);
        pct pctVar = new pct(new byte[15]);
        this.a = pctVar;
        byte[] bArr = pctVar.a;
        bArr[0] = Byte.MAX_VALUE;
        bArr[1] = -2;
        bArr[2] = Byte.MIN_VALUE;
        bArr[3] = 1;
        this.c = 0;
    }

    @Override // defpackage.pab
    public final void b() {
    }

    @Override // defpackage.pab
    public final void c(long j, boolean z) {
        this.i = j;
    }

    @Override // defpackage.pab
    public final void d() {
        this.c = 0;
        this.d = 0;
        this.e = 0;
    }

    @Override // defpackage.pab
    public final void a(pct pctVar) {
        while (pctVar.a() > 0) {
            int i = this.c;
            if (i == 0) {
                while (true) {
                    if (pctVar.a() > 0) {
                        int i2 = this.e << 8;
                        this.e = i2;
                        int h = i2 | pctVar.h();
                        this.e = h;
                        if (h == 2147385345) {
                            this.e = 0;
                            this.d = 4;
                            this.c = 1;
                            break;
                        }
                    }
                }
            } else if (i == 1) {
                byte[] bArr = this.a.a;
                int min = Math.min(pctVar.a(), 15 - this.d);
                pctVar.u(bArr, this.d, min);
                int i3 = this.d + min;
                this.d = i3;
                if (i3 == 15) {
                    byte[] bArr2 = this.a.a;
                    if (this.g == null) {
                        pcs pcsVar = pcg.d;
                        int length = bArr2.length;
                        pcsVar.a = bArr2;
                        pcsVar.b = 0;
                        pcsVar.c = 0;
                        pcsVar.d = length;
                        pcsVar.e(60);
                        int i4 = pcg.a[pcsVar.a(6)];
                        int i5 = pcg.b[pcsVar.a(4)];
                        int a = pcsVar.a(5);
                        int i6 = a >= 29 ? -1 : (pcg.c[a] * 1000) / 2;
                        pcsVar.e(10);
                        this.g = MediaFormat.b(null, "audio/vnd.dts", i6, -1, -1L, i4 + (pcsVar.a(2) > 0 ? 1 : 0), i5, null, null);
                        this.b.d(this.g);
                    }
                    int[] iArr = pcg.a;
                    this.h = (((bArr2[5] & 2) << 12) | ((bArr2[6] & 255) << 4) | ((bArr2[7] & 240) >> 4)) + 1;
                    this.f = (int) (((((((bArr2[5] & 252) >> 2) | ((bArr2[4] & 1) << 6)) + 1) * 32) * 1000000) / this.g.r);
                    this.a.z(0);
                    this.b.f(this.a, 15);
                    this.c = 2;
                }
            } else {
                int min2 = Math.min(pctVar.a(), this.h - this.d);
                this.b.f(pctVar, min2);
                int i7 = this.d + min2;
                this.d = i7;
                int i8 = this.h;
                if (i7 == i8) {
                    this.b.g(this.i, 1, i8, 0, null);
                    this.i += this.f;
                    this.c = 0;
                }
            }
        }
    }
}
