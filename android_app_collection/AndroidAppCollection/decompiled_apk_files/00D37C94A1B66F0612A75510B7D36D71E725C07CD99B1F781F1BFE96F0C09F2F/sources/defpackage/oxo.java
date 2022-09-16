package defpackage;

import com.google.android.exoplayer.MediaFormat;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.concurrent.LinkedBlockingDeque;
/* compiled from: PG */
/* renamed from: oxo  reason: default package */
/* loaded from: classes4.dex */
public class oxo implements oyf {
    public final oyc a;
    public volatile MediaFormat e;
    public final oug b = new oug(0);
    public boolean c = true;
    private long f = Long.MIN_VALUE;
    public volatile long d = Long.MIN_VALUE;

    public oxo(pbo pboVar) {
        this.a = new oyc(pboVar);
    }

    private final boolean i() {
        boolean e = this.a.e(this.b);
        if (this.c) {
            while (e && !this.b.e()) {
                this.a.d();
                e = this.a.e(this.b);
            }
        }
        if (!e) {
            return false;
        }
        long j = this.f;
        return j == Long.MIN_VALUE || this.b.e < j;
    }

    public final int a() {
        return this.a.b.e;
    }

    public final void b() {
        oyc oycVar = this.a;
        oya oyaVar = oycVar.b;
        oyaVar.e = 0;
        oyaVar.f = 0;
        oyaVar.g = 0;
        oyaVar.d = 0;
        pbo pboVar = oycVar.i;
        LinkedBlockingDeque linkedBlockingDeque = oycVar.c;
        pboVar.f((anuf[]) linkedBlockingDeque.toArray(new anuf[linkedBlockingDeque.size()]));
        oycVar.c.clear();
        oycVar.f = 0L;
        oycVar.g = 0L;
        oycVar.j = null;
        oycVar.h = oycVar.a;
        this.c = true;
        this.f = Long.MIN_VALUE;
        this.d = Long.MIN_VALUE;
    }

    public final boolean c(oug ougVar) {
        int i;
        if (!i()) {
            return false;
        }
        oyc oycVar = this.a;
        if (oycVar.b.e(ougVar, oycVar.d)) {
            if (ougVar.d()) {
                oyb oybVar = oycVar.d;
                long j = oybVar.a;
                oycVar.c(j, oycVar.e.a, 1);
                long j2 = j + 1;
                byte b = oycVar.e.a[0];
                int i2 = b & 128;
                int i3 = b & Byte.MAX_VALUE;
                osu osuVar = ougVar.a;
                if (osuVar.a == null) {
                    osuVar.a = new byte[16];
                }
                oycVar.c(j2, osuVar.a, i3);
                long j3 = j2 + i3;
                if (i2 != 0) {
                    oycVar.c(j3, oycVar.e.a, 2);
                    j3 += 2;
                    oycVar.e.z(0);
                    i = oycVar.e.k();
                } else {
                    i = 1;
                }
                osu osuVar2 = ougVar.a;
                int[] iArr = osuVar2.d;
                if (iArr == null || iArr.length < i) {
                    iArr = new int[i];
                }
                int[] iArr2 = osuVar2.e;
                if (iArr2 == null || iArr2.length < i) {
                    iArr2 = new int[i];
                }
                if (i2 != 0) {
                    int i4 = i * 6;
                    pct pctVar = oycVar.e;
                    if (pctVar.c < i4) {
                        pctVar.x(new byte[i4], i4);
                    }
                    oycVar.c(j3, oycVar.e.a, i4);
                    j3 += i4;
                    oycVar.e.z(0);
                    for (int i5 = 0; i5 < i; i5++) {
                        iArr[i5] = oycVar.e.k();
                        iArr2[i5] = oycVar.e.j();
                    }
                } else {
                    iArr[0] = 0;
                    iArr2[0] = ougVar.c - ((int) (j3 - oybVar.a));
                }
                osu osuVar3 = ougVar.a;
                byte[] bArr = oybVar.b;
                osuVar3.f = i;
                osuVar3.d = iArr;
                osuVar3.e = iArr2;
                osuVar3.b = bArr;
                osuVar3.c = 1;
                if (pcx.a >= 16) {
                    osuVar3.g.set(osuVar3.f, osuVar3.d, osuVar3.e, osuVar3.b, osuVar3.a, osuVar3.c);
                }
                long j4 = oybVar.a;
                int i6 = (int) (j3 - j4);
                oybVar.a = j4 + i6;
                ougVar.c -= i6;
            }
            ougVar.b(ougVar.c);
            long j5 = oycVar.d.a;
            ByteBuffer byteBuffer = ougVar.b;
            int i7 = ougVar.c;
            while (i7 > 0) {
                oycVar.b(j5);
                int i8 = (int) (j5 - oycVar.f);
                int min = Math.min(i7, oycVar.a - i8);
                byteBuffer.put(((anuf) oycVar.c.peek()).a, i8, min);
                j5 += min;
                i7 -= min;
            }
            oycVar.b(oycVar.b.b());
        }
        this.c = false;
        long j6 = ougVar.e;
        return true;
    }

    @Override // defpackage.oyf
    public final void d(MediaFormat mediaFormat) {
        this.e = mediaFormat;
    }

    public final boolean e() {
        return !i();
    }

    @Override // defpackage.oyf
    public final void f(pct pctVar, int i) {
        oyc oycVar = this.a;
        while (i > 0) {
            int a = oycVar.a(i);
            pctVar.u(oycVar.j.a, oycVar.h, a);
            oycVar.h += a;
            oycVar.g += a;
            i -= a;
        }
    }

    @Override // defpackage.oyf
    public void g(long j, int i, int i2, int i3, byte[] bArr) {
        this.d = Math.max(this.d, j);
        oyc oycVar = this.a;
        oycVar.b.d(j, i, (oycVar.g - i2) - i3, i2, bArr);
    }

    public final boolean h(long j) {
        oyc oycVar = this.a;
        long c = oycVar.b.c(j);
        if (c == -1) {
            return false;
        }
        oycVar.b(c);
        return true;
    }

    @Override // defpackage.oyf
    public final int j(oxn oxnVar, int i, boolean z) {
        oyc oycVar = this.a;
        int a = oxnVar.a(oycVar.j.a, oycVar.h, oycVar.a(i));
        if (a == -1) {
            if (!z) {
                throw new EOFException();
            }
            return -1;
        }
        oycVar.h += a;
        oycVar.g += a;
        return a;
    }
}
