package defpackage;

import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer.MediaFormat;
import java.util.Arrays;
import java.util.Collections;
/* compiled from: PG */
/* renamed from: ozz  reason: default package */
/* loaded from: classes4.dex */
final class ozz extends pab {
    private static final byte[] c = {73, 68, 51};
    public long a;
    private final pcs d;
    private final pct e;
    private final oyf f;
    private int g;
    private int h;
    private int i;
    private boolean j;
    private boolean k;
    private long l;
    private int m;
    private oyf n;
    private long o;

    public ozz(oyf oyfVar, oyf oyfVar2) {
        super(oyfVar);
        this.f = oyfVar2;
        oyfVar2.d(MediaFormat.d());
        this.d = new pcs(new byte[7]);
        this.e = new pct(Arrays.copyOf(c, 10));
        e();
    }

    private final void f(oyf oyfVar, long j, int i, int i2) {
        this.g = 3;
        this.h = i;
        this.n = oyfVar;
        this.o = j;
        this.m = i2;
    }

    private final boolean g(pct pctVar, byte[] bArr, int i) {
        int min = Math.min(pctVar.a(), i - this.h);
        pctVar.u(bArr, this.h, min);
        int i2 = this.h + min;
        this.h = i2;
        return i2 == i;
    }

    @Override // defpackage.pab
    public final void b() {
    }

    @Override // defpackage.pab
    public final void c(long j, boolean z) {
        this.a = j;
    }

    @Override // defpackage.pab
    public final void d() {
        e();
    }

    public final void e() {
        this.g = 0;
        this.h = 0;
        this.i = 256;
    }

    @Override // defpackage.pab
    public final void a(pct pctVar) {
        int i;
        while (pctVar.a() > 0) {
            int i2 = this.g;
            boolean z = true;
            if (i2 == 0) {
                byte[] bArr = pctVar.a;
                int i3 = pctVar.b;
                int i4 = pctVar.c;
                while (true) {
                    if (i3 < i4) {
                        int i5 = i3 + 1;
                        int i6 = bArr[i3] & 255;
                        int i7 = this.i;
                        if (i7 == 512) {
                            if (i6 < 240 || i6 == 255) {
                                i7 = 512;
                            } else {
                                if (1 != ((i6 & 1) ^ 1)) {
                                    z = false;
                                }
                                this.j = z;
                                this.g = 2;
                                this.h = 0;
                                pctVar.z(i5);
                            }
                        }
                        int i8 = i6 | i7;
                        if (i8 != 329) {
                            if (i8 == 511) {
                                this.i = 512;
                            } else if (i8 == 836) {
                                i = 1024;
                            } else if (i8 == 1075) {
                                this.g = 1;
                                this.h = 3;
                                this.m = 0;
                                this.e.z(0);
                                pctVar.z(i5);
                                break;
                            } else if (i7 != 256) {
                                this.i = 256;
                                i3 = i5 - 1;
                            }
                            i3 = i5;
                        } else {
                            i = 768;
                        }
                        this.i = i;
                        i3 = i5;
                    } else {
                        pctVar.z(i3);
                        break;
                    }
                }
            } else if (i2 != 1) {
                if (i2 != 2) {
                    int min = Math.min(pctVar.a(), this.m - this.h);
                    this.n.f(pctVar, min);
                    int i9 = this.h + min;
                    this.h = i9;
                    int i10 = this.m;
                    if (i9 == i10) {
                        this.n.g(this.a, 1, i10, 0, null);
                        this.a += this.o;
                        e();
                    }
                } else {
                    if (g(pctVar, this.d.a, true != this.j ? 5 : 7)) {
                        this.d.d(0);
                        if (!this.k) {
                            int a = this.d.a(2) + 1;
                            if (a != 2) {
                                StringBuilder sb = new StringBuilder(61);
                                sb.append("Detected audio object type: ");
                                sb.append(a);
                                sb.append(", but assuming AAC LC.");
                                Log.w("AdtsReader", sb.toString());
                            }
                            int a2 = this.d.a(4);
                            this.d.e(1);
                            int a3 = this.d.a(3);
                            byte[] bArr2 = pcf.a;
                            byte[] bArr3 = {(byte) (((a2 >> 1) & 7) | 16), (byte) (((a2 << 7) & 128) | ((a3 << 3) & 120))};
                            Pair a4 = pcf.a(bArr3);
                            MediaFormat b = MediaFormat.b(null, "audio/mp4a-latm", -1, -1, -1L, ((Integer) a4.second).intValue(), ((Integer) a4.first).intValue(), Collections.singletonList(bArr3), null);
                            this.l = 1024000000 / b.r;
                            this.b.d(b);
                            this.k = true;
                        } else {
                            this.d.e(10);
                        }
                        this.d.e(4);
                        int a5 = this.d.a(13) - 7;
                        if (this.j) {
                            a5 -= 2;
                        }
                        f(this.b, this.l, 0, a5);
                    }
                }
            } else if (g(pctVar, this.e.a, 10)) {
                this.f.f(this.e, 10);
                this.e.z(6);
                f(this.f, 0L, 10, 10 + this.e.g());
            }
        }
    }
}
