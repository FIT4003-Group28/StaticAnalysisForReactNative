package defpackage;

import com.google.android.exoplayer.MediaFormat;
/* compiled from: PG */
/* renamed from: ozx  reason: default package */
/* loaded from: classes4.dex */
final class ozx extends pab {
    private final boolean a;
    private final pcs c;
    private final pct d;
    private int e;
    private int f;
    private boolean g;
    private long h;
    private MediaFormat i;
    private int j;
    private long k;

    public ozx(oyf oyfVar, boolean z) {
        super(oyfVar);
        this.a = z;
        pcs pcsVar = new pcs(new byte[8]);
        this.c = pcsVar;
        this.d = new pct(pcsVar.a);
        this.e = 0;
    }

    @Override // defpackage.pab
    public final void b() {
    }

    @Override // defpackage.pab
    public final void c(long j, boolean z) {
        this.k = j;
    }

    @Override // defpackage.pab
    public final void d() {
        this.e = 0;
        this.f = 0;
        this.g = false;
    }

    @Override // defpackage.pab
    public final void a(pct pctVar) {
        int i;
        int i2;
        MediaFormat b;
        int i3;
        while (pctVar.a() > 0) {
            int i4 = this.e;
            if (i4 == 0) {
                while (true) {
                    if (pctVar.a() <= 0) {
                        break;
                    } else if (!this.g) {
                        this.g = pctVar.h() == 11;
                    } else {
                        int h = pctVar.h();
                        if (h == 119) {
                            this.g = false;
                            this.e = 1;
                            byte[] bArr = this.d.a;
                            bArr[0] = 11;
                            bArr[1] = 119;
                            this.f = 2;
                            break;
                        }
                        this.g = h == 11;
                    }
                }
            } else if (i4 == 1) {
                byte[] bArr2 = this.d.a;
                int min = Math.min(pctVar.a(), 8 - this.f);
                pctVar.u(bArr2, this.f, min);
                int i5 = this.f + min;
                this.f = i5;
                if (i5 == 8) {
                    if (this.i == null) {
                        if (this.a) {
                            pcs pcsVar = this.c;
                            int[] iArr = pcd.a;
                            pcsVar.e(32);
                            int a = pcsVar.a(2);
                            if (a == 3) {
                                i3 = pcd.c[pcsVar.a(2)];
                            } else {
                                pcsVar.e(2);
                                i3 = pcd.b[a];
                            }
                            b = MediaFormat.b(null, "audio/eac3", -1, -1, -1L, pcd.d[pcsVar.a(3)] + (pcsVar.f() ? 1 : 0), i3, null, null);
                        } else {
                            pcs pcsVar2 = this.c;
                            int[] iArr2 = pcd.a;
                            pcsVar2.e(32);
                            int a2 = pcsVar2.a(2);
                            pcsVar2.e(14);
                            int a3 = pcsVar2.a(3);
                            if ((a3 & 1) != 0 && a3 != 1) {
                                pcsVar2.e(2);
                            }
                            if ((a3 & 4) != 0) {
                                pcsVar2.e(2);
                            }
                            if (a3 == 2) {
                                pcsVar2.e(2);
                            }
                            b = MediaFormat.b(null, "audio/ac3", -1, -1, -1L, pcd.d[a3] + (pcsVar2.f() ? 1 : 0), pcd.b[a2], null, null);
                        }
                        this.i = b;
                        this.b.d(this.i);
                    }
                    int i6 = 6;
                    if (this.a) {
                        byte[] bArr3 = this.c.a;
                        int[] iArr3 = pcd.a;
                        int i7 = ((bArr3[2] & 7) << 8) + (bArr3[3] & 255) + 1;
                        i = i7 + i7;
                    } else {
                        byte[] bArr4 = this.c.a;
                        int[] iArr4 = pcd.a;
                        byte b2 = bArr4[4];
                        int i8 = b2 & 63;
                        int i9 = pcd.b[(b2 & 192) >> 6];
                        if (i9 == 44100) {
                            int i10 = pcd.f[i8 >> 1] + (i8 & 1);
                            i = i10 + i10;
                        } else {
                            int i11 = pcd.e[i8 >> 1];
                            i = i9 == 32000 ? i11 * 6 : i11 * 4;
                        }
                    }
                    this.j = i;
                    if (this.a) {
                        byte[] bArr5 = this.c.a;
                        if (((bArr5[4] & 192) >> 6) != 3) {
                            i6 = pcd.a[(bArr5[4] & 48) >> 4];
                        }
                        i2 = i6 * 256;
                    } else {
                        i2 = 1536;
                    }
                    this.h = (int) ((i2 * 1000000) / this.i.r);
                    this.d.z(0);
                    this.b.f(this.d, 8);
                    this.e = 2;
                }
            } else {
                int min2 = Math.min(pctVar.a(), this.j - this.f);
                this.b.f(pctVar, min2);
                int i12 = this.f + min2;
                this.f = i12;
                int i13 = this.j;
                if (i12 == i13) {
                    this.b.g(this.k, 1, i13, 0, null);
                    this.k += this.h;
                    this.e = 0;
                }
            }
        }
    }
}
