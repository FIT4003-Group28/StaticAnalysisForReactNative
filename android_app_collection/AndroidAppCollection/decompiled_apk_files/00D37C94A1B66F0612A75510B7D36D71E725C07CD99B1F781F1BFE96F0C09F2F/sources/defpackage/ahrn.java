package defpackage;

import android.opengl.GLES20;
import android.os.Build;
import android.util.Range;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: ahrn  reason: default package */
/* loaded from: classes.dex */
public final class ahrn {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public int e;
    byte[] h;
    boolean k;
    public final int[] l;
    private final int q;
    private final int r;
    private ahpc s;
    private ahpa t;
    private final ahrm u = new ahrm();
    private final ArrayDeque v = new ArrayDeque();
    private final ArrayDeque w = new ArrayDeque();
    long f = -1;
    long g = -1;
    long i = -1;
    long j = 0;
    public int n = 3;
    public int o = 3;
    public int m = 500;
    public int p = 3;

    public ahrn(ahrp ahrpVar) {
        this.l = r1;
        int[] iArr = {0};
        this.q = ahrpVar.f("uColorPrimaryTransform");
        this.r = ahrpVar.f("uLuminanceTransform");
        this.a = ahrpVar.f("uInputLut");
        this.b = ahrpVar.f("uOutputLut");
        this.c = ahrpVar.f("uKneeLut");
        this.d = ahrpVar.f("uLutSize");
        GLES20.glGenTextures(3, iArr, 0);
        for (int i = 0; i < 3; i++) {
            ahom.g(this.l[i]);
        }
    }

    private static void f(ahpa ahpaVar, ahrm ahrmVar, long j) {
        float f = ahrmVar.b / 4095.0f;
        ahpaVar.f = f;
        float f2 = ahrmVar.c / 4095.0f;
        ahpaVar.g = f2;
        ahpaVar.h = ahrmVar.d;
        int i = ahrmVar.g;
        if (i <= 0) {
            i = ahrmVar.f;
        }
        float f3 = i * 0.1f;
        ahpaVar.d = f3;
        float f4 = ahpaVar.e;
        StringBuilder sb = new StringBuilder(129);
        sb.append("Knee = ");
        sb.append((int) (f * f3));
        sb.append("x");
        sb.append((int) (f2 * f4));
        sb.append(", MaxDisplayLuma = ");
        sb.append(f4);
        sb.append(", MaxSceneLuma = ");
        sb.append(f3);
        sb.append(", Time = ");
        double d = j;
        Double.isNaN(d);
        sb.append(d / 1000000.0d);
        float l = ahom.l(ahpaVar.d);
        ahpaVar.d = l;
        if (ahpaVar.f >= 1.0f || l < ahpaVar.e) {
            ahpaVar.h = 0;
            return;
        }
        float[] fArr = ahpaVar.i;
        if (fArr == null || fArr.length < ahpaVar.h) {
            ahpaVar.i = new float[ahpaVar.h];
        }
        float f5 = 1.0f - ahpaVar.g;
        String str = "";
        for (int i2 = 0; i2 < ahpaVar.h; i2++) {
            ahpaVar.i[i2] = ahpaVar.g + ((ahrmVar.e[i2] / 1023.0f) * f5);
            String valueOf = String.valueOf(str);
            float f6 = ahpaVar.i[i2];
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 16);
            sb2.append(valueOf);
            sb2.append(f6);
            sb2.append(",");
            str = sb2.toString();
        }
        String valueOf2 = String.valueOf(str);
        if (valueOf2.length() == 0) {
            return;
        }
        "Bezier =".concat(valueOf2);
    }

    private final void g(ByteBuffer byteBuffer, int i, int i2) {
        a(i, i2);
        GLES20.glPixelStorei(3317, 1);
        GLES20.glTexImage2D(3553, 0, 6410, 1, byteBuffer.capacity() / 2, 0, 6410, 5121, byteBuffer);
        Boolean bool = ahom.a;
    }

    public final void a(int i, int i2) {
        GLES20.glActiveTexture(33988 + i);
        GLES20.glBindTexture(3553, this.l[i]);
        GLES20.glTexParameterf(3553, 10241, 9729.0f);
        GLES20.glTexParameterf(3553, 10240, 9729.0f);
        GLES20.glTexParameterf(3553, 10242, 33071.0f);
        GLES20.glTexParameterf(3553, 10243, 33071.0f);
        GLES20.glUniform1i(i2, i + 4);
        Boolean bool = ahom.a;
    }

    public final void b(boolean z, byte[] bArr, long j, long j2) {
        long j3;
        if (this.f <= j) {
            if (z) {
                z = true;
            }
            j3 = this.i;
            if (j3 != -1 && Math.abs(j3 - j2) > 100000) {
                this.j = this.i - j2;
            }
            this.v.add(bArr);
            this.w.add(Long.valueOf(j));
            this.f = j;
        }
        this.v.clear();
        this.w.clear();
        this.u.a = false;
        if (z) {
            this.k = true;
            this.e = 0;
            this.i = -1L;
            this.j = 0L;
            return;
        }
        j3 = this.i;
        if (j3 != -1) {
            this.j = this.i - j2;
        }
        this.v.add(bArr);
        this.w.add(Long.valueOf(j));
        this.f = j;
    }

    public final void c(ahor ahorVar) {
        ByteBuffer e = ahorVar.e();
        if (e != null && e.hasRemaining()) {
            int remaining = e.remaining();
            byte[] bArr = new byte[remaining + 1];
            bArr[0] = 0;
            e.get(bArr, 1, remaining);
            e.position(0);
            e.limit(0);
            b(false, bArr, ahorVar.c(), ahorVar.c());
        }
        long c = ahorVar.c() - this.j;
        if (!this.w.isEmpty() && this.g != c) {
            this.g = c;
            long j = 0;
            byte[] bArr2 = null;
            while (!this.w.isEmpty() && c >= ((Long) this.w.getFirst()).longValue()) {
                j = ((Long) this.w.removeFirst()).longValue();
                bArr2 = (byte[]) this.v.removeFirst();
            }
            if (bArr2 != null && !Arrays.equals(bArr2, this.h)) {
                this.h = bArr2;
                ahrm ahrmVar = this.u;
                ahrmVar.a = false;
                try {
                    pcs pcsVar = new pcs(bArr2);
                    pcsVar.e(8);
                    int a = pcsVar.a(8);
                    int a2 = pcsVar.a(16);
                    int a3 = pcsVar.a(16);
                    if (a == 181 && a2 == 60 && a3 == 1) {
                        pcsVar.e(16);
                        if (pcsVar.a(2) <= 1) {
                            pcsVar.a(27);
                            if (pcsVar.a(1) <= 0) {
                                ahrmVar.f = 0;
                                for (int i = 0; i < 3; i++) {
                                    ahrmVar.f = Math.max(pcsVar.a(17), ahrmVar.f);
                                }
                                pcsVar.e(17);
                                ahrmVar.g = 0;
                                int a4 = pcsVar.a(4);
                                while (true) {
                                    int i2 = a4 - 1;
                                    if (a4 <= 0) {
                                        break;
                                    }
                                    int a5 = pcsVar.a(7);
                                    int a6 = pcsVar.a(17);
                                    if (a5 >= 75) {
                                        ahrmVar.g = Math.max(ahrmVar.g, a6);
                                    }
                                    a4 = i2;
                                }
                                pcsVar.a(10);
                                if (pcsVar.a(1) <= 0) {
                                    if (pcsVar.a(1) > 0) {
                                        ahrmVar.b = pcsVar.a(12);
                                        ahrmVar.c = pcsVar.a(12);
                                        ahrmVar.d = pcsVar.a(4);
                                        for (int i3 = 0; i3 < ahrmVar.d; i3++) {
                                            ahrmVar.e[i3] = pcsVar.a(10);
                                        }
                                    }
                                    if (pcsVar.a(1) > 0) {
                                        pcsVar.a(6);
                                    }
                                    ahrmVar.a = true;
                                    if (this.e == 0) {
                                        e(null);
                                    } else {
                                        f(this.t, this.u, j);
                                        try {
                                            this.s.a(this.t);
                                            g(ByteBuffer.wrap(this.s.b()), 2, this.c);
                                            Boolean bool = ahom.a;
                                        } catch (Exception e2) {
                                            String.valueOf(String.valueOf(e2)).length();
                                        }
                                    }
                                }
                            }
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
        Boolean bool2 = ahom.a;
    }

    public final void d(ahor ahorVar, int i, ahpj ahpjVar, boolean z) {
        if (z || this.k) {
            this.e = 0;
            if (i == 3 || (ahpjVar != null && ahpjVar.c() != null)) {
                e(ahpjVar);
            }
            GLES20.glUniform1f(this.d, this.e);
            this.k = false;
        }
        c(ahorVar);
    }

    public final void e(ahpj ahpjVar) {
        final double d;
        if (this.s == null) {
            this.s = new ahpc();
            this.t = new ahpa();
        }
        ahpa ahpaVar = this.t;
        ahpaVar.j = 1;
        ahpaVar.e = 500.0f;
        ahpaVar.b = 6;
        ahpaVar.c = 1000.0f;
        ahpaVar.d = 0.0f;
        ahpaVar.l = 2;
        ahpaVar.k = 3;
        ahpaVar.f = 0.75f;
        ahpaVar.g = 0.75f;
        ahpaVar.h = 0;
        ahpaVar.e = this.m;
        if (ahpjVar != null) {
            if (ahpjVar.a() != -1) {
                this.t.b = ahpjVar.a();
            }
            if (ahpjVar.b() != -1) {
                ahpa ahpaVar2 = this.t;
                int b = ahpjVar.b();
                ahpaVar2.j = b == 6 ? 1 : b == 7 ? 2 : 3;
            }
            if (ahpjVar.c() != null) {
                ByteBuffer order = ByteBuffer.wrap(ahpjVar.c(), 17, 8).order(ByteOrder.LITTLE_ENDIAN);
                short s = order.getShort();
                order.getShort();
                short s2 = order.getShort();
                this.t.c = s2 > 0 ? s2 : s;
            }
        } else {
            ahpaVar.j = this.p;
        }
        ahpa ahpaVar3 = this.t;
        ahpaVar3.l = this.n;
        ahpaVar3.k = this.o;
        ahrm ahrmVar = this.u;
        if (ahrmVar.a) {
            f(ahpaVar3, ahrmVar, 0L);
        }
        int i = this.t.b;
        String a = aear.a(this.n);
        String a2 = aeas.a(this.t.j);
        String a3 = aeas.a(this.o);
        ahpa ahpaVar4 = this.t;
        float f = ahpaVar4.d;
        float f2 = ahpaVar4.c;
        StringBuilder sb = new StringBuilder(a.length() + 143 + a2.length() + a3.length());
        sb.append("Video Primaries = ");
        sb.append(i);
        sb.append(", Display Primaries = ");
        sb.append(a);
        sb.append(", Video Transfer = ");
        sb.append(a2);
        sb.append(", Display Transfer = ");
        sb.append(a3);
        sb.append(", MaxSCL = ");
        sb.append(f);
        sb.append(", MaxCLL = ");
        sb.append(f2);
        try {
            final ahpc ahpcVar = this.s;
            ahpa ahpaVar5 = this.t;
            if (Build.VERSION.SDK_INT < 24) {
                return;
            }
            int i2 = ahpaVar5.j;
            if (i2 == 1) {
                ahpcVar.a = new ahov(2);
            } else if (i2 != 2) {
                return;
            } else {
                ahpcVar.a = new ahov();
            }
            int i3 = ahpaVar5.k;
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i4 == 0) {
                ahpcVar.b = new ahov(2);
            } else if (i4 != 2) {
                return;
            } else {
                ahpcVar.b = new ahov(1);
            }
            int i5 = ahpaVar5.b;
            if (i5 == 6) {
                ahpcVar.c = new ahou(ahou.a);
            } else if (i5 != 1) {
                return;
            } else {
                ahpcVar.c = new ahou(ahou.b);
            }
            ahpcVar.e = ahpcVar.c.d;
            int i6 = ahpaVar5.l;
            int i7 = i6 - 1;
            if (i6 != 0) {
                if (i7 == 0) {
                    ahpcVar.d = new ahou(ahou.a);
                } else if (i7 == 1) {
                    ahpcVar.d = new ahou(ahou.c);
                } else if (i7 == 2) {
                    ahpcVar.d = new ahou(ahou.b);
                }
                ahpcVar.f = ahpcVar.d.e;
                ahpcVar.g = new ahpe();
                ahpe.b(ahpcVar.f, ahpcVar.e, ahpcVar.g);
                ahpcVar.h = new Range(Double.valueOf(0.0d), Double.valueOf(10000.0d));
                int i8 = ahpaVar5.a;
                ahpcVar.i = new anuf(256, new ahpb() { // from class: ahox
                    @Override // defpackage.ahpb
                    public final double a(int i9, double d2) {
                        ahpc ahpcVar2 = ahpc.this;
                        Range range = ahpcVar2.h;
                        ahow ahowVar = ahpcVar2.a;
                        double d3 = i9;
                        Double.isNaN(d3);
                        return ((Double) range.clamp(Double.valueOf(ahowVar.c(d3 / d2) * ahpcVar2.a.b()))).doubleValue() / 10000.0d;
                    }
                });
                if (ahpcVar.b.d()) {
                    double d2 = ahpaVar5.e;
                    double b2 = ahpcVar.b.b();
                    Double.isNaN(d2);
                    d = d2 / b2;
                } else {
                    d = 1.0d;
                }
                int i9 = ahpaVar5.a;
                ahpcVar.j = new anuf(1024, new ahpb() { // from class: ahoy
                    @Override // defpackage.ahpb
                    public final double a(int i10, double d3) {
                        ahpc ahpcVar2 = ahpc.this;
                        double d4 = d;
                        ahow ahowVar = ahpcVar2.b;
                        double d5 = i10;
                        Double.isNaN(d5);
                        return Math.min(1.0d, ahowVar.a((d5 / d3) * d4));
                    }
                });
                ahpcVar.a(ahpaVar5);
                ByteBuffer wrap = ByteBuffer.wrap(this.s.i.a);
                ByteBuffer wrap2 = ByteBuffer.wrap(this.s.j.a);
                ByteBuffer wrap3 = ByteBuffer.wrap(this.s.b());
                ahpc ahpcVar2 = this.s;
                float[] fArr = ahpcVar2.g.a;
                float[] fArr2 = ahpcVar2.e.a;
                int capacity = wrap.capacity() / 2;
                this.e = capacity;
                GLES20.glUniform1f(this.d, capacity);
                g(wrap, 0, this.a);
                g(wrap3, 2, this.c);
                g(wrap2, 1, this.b);
                GLES20.glUniformMatrix3fv(this.q, 1, true, fArr, 0);
                GLES20.glUniform3fv(this.r, 1, fArr2, 3);
                Boolean bool = ahom.a;
                return;
            }
            throw null;
        } catch (Exception e) {
            String.valueOf(String.valueOf(e)).length();
        }
    }
}
