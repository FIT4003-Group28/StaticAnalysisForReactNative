package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import android.view.Surface;
import androidx.media3.common.ColorInfo;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.video.DummySurface;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: pxq  reason: default package */
/* loaded from: classes4.dex */
public class pxq extends awb {
    private static final int[] s = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private static boolean t;
    private static boolean u;
    private pxo A;
    private boolean B;
    private boolean C;
    private DummySurface D;
    private boolean E;
    private int F;
    private boolean G;
    private boolean H;
    private boolean I;

    /* renamed from: J  reason: collision with root package name */
    private long f260J;
    private long K;
    private long L;
    private int M;
    private int N;
    private int O;
    private long P;
    private long Q;
    private long R;
    private int S;
    private int T;
    private int U;
    private float V;
    private asr W;
    private boolean X;
    private int Y;
    private pxt Z;
    public Surface q;
    pxp r;
    private final Context v;
    private final pya w;
    private final pyj x;
    private final int y;
    private final boolean z;

    public pxq(Context context, avw avwVar, awd awdVar, Handler handler, pyk pykVar, int i) {
        super(2, avwVar, awdVar, 30.0f);
        this.y = i;
        Context applicationContext = context.getApplicationContext();
        this.v = applicationContext;
        this.w = new pya(applicationContext);
        this.x = new pyj(handler, pykVar);
        this.z = "NVIDIA".equals(pxi.c);
        this.K = -9223372036854775807L;
        this.T = -1;
        this.U = -1;
        this.V = -1.0f;
        this.F = 1;
        this.Y = 0;
        aI();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static int aF(avz avzVar, String str, int i, int i2) {
        char c;
        int i3;
        if (i == -1 || i2 == -1) {
            return -1;
        }
        int i4 = 4;
        switch (str.hashCode()) {
            case -1851077871:
                if (str.equals("video/dolby-vision")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1664118616:
                if (str.equals("video/3gpp")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1662541442:
                if (str.equals("video/hevc")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1187890754:
                if (str.equals("video/mp4v-es")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1599127256:
                if (str.equals("video/x-vnd.on2.vp8")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 4:
                i3 = i * i2;
                i4 = 2;
                break;
            case 2:
            case 3:
                if (!"BRAVIA 4K 2015".equals(pxi.d) && (!"Amazon".equals(pxi.c) || (!"KFSOWI".equals(pxi.d) && (!"AFTS".equals(pxi.d) || !avzVar.f)))) {
                    i3 = pxi.b(i, 16) * pxi.b(i2, 16) * 256;
                    i4 = 2;
                    break;
                } else {
                    return -1;
                }
                break;
            case 5:
            case 6:
                i3 = i * i2;
                break;
            default:
                return -1;
        }
        return (i3 * 3) / (i4 + i4);
    }

    private static List aG(awd awdVar, Format format, boolean z, boolean z2) {
        Pair a;
        String str = format.l;
        if (str == null) {
            return Collections.emptyList();
        }
        List d = awn.d(awdVar.a(str, z, z2), format);
        if ("video/dolby-vision".equals(str) && (a = awn.a(format)) != null) {
            int intValue = ((Integer) a.first).intValue();
            if (intValue == 16 || intValue == 256) {
                d.addAll(awdVar.a("video/hevc", z, z2));
            } else if (intValue == 512) {
                d.addAll(awdVar.a("video/avc", z, z2));
            }
        }
        return Collections.unmodifiableList(d);
    }

    private final void aH() {
        avx avxVar;
        this.G = false;
        if (pxi.a < 23 || !this.X || (avxVar = ((awb) this).b) == null) {
            return;
        }
        this.r = new pxp(this, avxVar);
    }

    private final void aI() {
        this.W = null;
    }

    private final void aJ() {
        if (this.M > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.x.d(this.M, elapsedRealtime - this.L);
            this.M = 0;
            this.L = elapsedRealtime;
        }
    }

    private final void aK() {
        int i = this.T;
        if (i == -1) {
            if (this.U == -1) {
                return;
            }
            i = -1;
        }
        asr asrVar = this.W;
        if (asrVar != null && asrVar.a == i && asrVar.b == this.U && asrVar.d == this.V) {
            return;
        }
        asr asrVar2 = new asr(i, this.U, this.V);
        this.W = asrVar2;
        this.x.i(asrVar2);
    }

    private final void aL() {
        asr asrVar = this.W;
        if (asrVar != null) {
            this.x.i(asrVar);
        }
    }

    private final void aM(long j, long j2, Format format) {
        pxt pxtVar = this.Z;
        if (pxtVar != null) {
            pxtVar.a(j, j2, format, ((awb) this).d);
        }
    }

    private final void aN() {
        this.K = SystemClock.elapsedRealtime() + 5000;
    }

    private static boolean aO(long j) {
        return j < -30000;
    }

    private final boolean aP(avz avzVar) {
        return pxi.a >= 23 && !this.X && !az(avzVar.a) && (!avzVar.f || DummySurface.b(this.v));
    }

    protected static int as(avz avzVar, Format format) {
        if (format.m != -1) {
            int size = format.n.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                i += ((byte[]) format.n.get(i2)).length;
            }
            return format.m + i;
        }
        return aF(avzVar, format.l, format.q, format.r);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.awb
    public final void B() {
        super.B();
        this.O = 0;
    }

    @Override // defpackage.awb, defpackage.phj, defpackage.pkd
    public final void D(float f, float f2) {
        super.D(f, f2);
        pya pyaVar = this.w;
        pyaVar.g = f;
        pyaVar.b();
        pyaVar.d(false);
    }

    @Override // defpackage.awb
    protected final boolean G() {
        return this.X && pxi.a < 23;
    }

    @Override // defpackage.awb, defpackage.pkd
    public boolean I() {
        DummySurface dummySurface;
        if (!super.I() || (!this.G && (((dummySurface = this.D) == null || this.q != dummySurface) && ((awb) this).b != null && !this.X))) {
            if (this.K == -9223372036854775807L) {
                return false;
            }
            if (SystemClock.elapsedRealtime() < this.K) {
                return true;
            }
            this.K = -9223372036854775807L;
            return false;
        }
        this.K = -9223372036854775807L;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0075, code lost:
        if (r13.c[defpackage.pxl.a(r11 - 1)] == false) goto L30;
     */
    @Override // defpackage.awb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final boolean J(long r28, long r30, defpackage.avx r32, java.nio.ByteBuffer r33, int r34, int r35, int r36, long r37, boolean r39, boolean r40, com.google.android.exoplayer2.Format r41) {
        /*
            Method dump skipped, instructions count: 608
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pxq.J(long, long, avx, java.nio.ByteBuffer, int, int, int, long, boolean, boolean, com.google.android.exoplayer2.Format):boolean");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.awb
    public boolean K(avz avzVar) {
        return this.q != null || aP(avzVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean aA(long j, boolean z) {
        int T = T(j);
        if (T == 0) {
            return false;
        }
        pms pmsVar = this.l;
        pmsVar.i++;
        int i = this.O + T;
        if (z) {
            pmsVar.f += i;
        } else {
            ax(i);
        }
        O();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean aB(long j, long j2, boolean z) {
        return j < -500000 && !z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean aC(long j, long j2, boolean z) {
        return aO(j) && !z;
    }

    protected final void aD(avx avxVar, int i, long j) {
        aK();
        int i2 = pxi.a;
        avxVar.i(i, j);
        this.Q = SystemClock.elapsedRealtime() * 1000;
        this.l.e++;
        this.N = 0;
        au();
    }

    protected final void aE(avx avxVar, int i) {
        int i2 = pxi.a;
        avxVar.q(i);
        this.l.f++;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.phj
    public void af() {
        this.M = 0;
        this.L = SystemClock.elapsedRealtime();
        this.Q = SystemClock.elapsedRealtime() * 1000;
        this.R = 0L;
        this.S = 0;
        pya pyaVar = this.w;
        pyaVar.d = true;
        pyaVar.b();
        pyaVar.d(false);
    }

    @Override // defpackage.phj
    protected final void ag() {
        this.K = -9223372036854775807L;
        aJ();
        int i = this.S;
        if (i != 0) {
            pyj pyjVar = this.x;
            long j = this.R;
            Handler handler = pyjVar.a;
            if (handler != null) {
                handler.post(new pyb(pyjVar, j, i));
            }
            this.R = 0L;
            this.S = 0;
        }
        pya pyaVar = this.w;
        pyaVar.d = false;
        pyaVar.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public pxo at(avz avzVar, Format format, Format[] formatArr) {
        Point point;
        int i;
        int i2;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int aF;
        int i3 = format.q;
        int i4 = format.r;
        int as = as(avzVar, format);
        int length = formatArr.length;
        if (length != 1) {
            int i5 = 0;
            boolean z = false;
            for (int i6 = 0; i6 < length; i6++) {
                Format format2 = formatArr[i6];
                if (format.x != null && format2.x == null) {
                    pis b = format2.b();
                    b.w = format.x;
                    format2 = b.a();
                }
                if (avzVar.b(format, format2).d != 0) {
                    int i7 = format2.q;
                    z |= i7 == -1 || format2.r == -1;
                    i3 = Math.max(i3, i7);
                    i4 = Math.max(i4, format2.r);
                    as = Math.max(as, as(avzVar, format2));
                }
            }
            if (z) {
                StringBuilder sb = new StringBuilder(66);
                sb.append("Resolutions unknown. Codec max resolution: ");
                sb.append(i3);
                sb.append("x");
                sb.append(i4);
                Log.w("MediaCodecVideoRenderer", sb.toString());
                int i8 = format.r;
                int i9 = format.q;
                int i10 = i8 > i9 ? i8 : i9;
                int i11 = i8 <= i9 ? i8 : i9;
                float f = i11 / i10;
                int[] iArr = s;
                while (i5 < 9) {
                    int i12 = iArr[i5];
                    int i13 = (int) (i12 * f);
                    if (i12 <= i10 || i13 <= i11) {
                        break;
                    }
                    if (i8 <= i9) {
                        i = i10;
                        i2 = i12;
                    } else {
                        i = i10;
                        i2 = i13;
                    }
                    if (i8 <= i9) {
                        i12 = i13;
                    }
                    int i14 = pxi.a;
                    MediaCodecInfo.CodecCapabilities codecCapabilities = avzVar.d;
                    point = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? null : avz.a(videoCapabilities, i2, i12);
                    int i15 = i8;
                    int i16 = i11;
                    if (avzVar.e(point.x, point.y, format.s)) {
                        break;
                    }
                    i5++;
                    i10 = i;
                    i8 = i15;
                    i11 = i16;
                }
                point = null;
                if (point != null) {
                    i3 = Math.max(i3, point.x);
                    i4 = Math.max(i4, point.y);
                    as = Math.max(as, aF(avzVar, format.l, i3, i4));
                    StringBuilder sb2 = new StringBuilder(57);
                    sb2.append("Codec max resolution adjusted to: ");
                    sb2.append(i3);
                    sb2.append("x");
                    sb2.append(i4);
                    Log.w("MediaCodecVideoRenderer", sb2.toString());
                }
            }
            return new pxo(i3, i4, as);
        }
        if (as != -1 && (aF = aF(avzVar, format.l, format.q, format.r)) != -1) {
            as = Math.min((int) (as * 1.5f), aF);
        }
        return new pxo(i3, i4, as);
    }

    final void au() {
        this.I = true;
        if (!this.G) {
            this.G = true;
            this.x.g(this.q);
            this.E = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void av(long j) {
        E(j);
        aK();
        this.l.e++;
        au();
        t(j);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void aw(avx avxVar, Surface surface) {
        avxVar.j(surface);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void ax(int i) {
        pms pmsVar = this.l;
        pmsVar.g += i;
        this.M += i;
        int i2 = this.N + i;
        this.N = i2;
        pmsVar.h = Math.max(i2, pmsVar.h);
        if (this.M >= this.y) {
            aJ();
        }
    }

    protected final void ay(long j) {
        pms pmsVar = this.l;
        pmsVar.j += j;
        pmsVar.k++;
        this.R += j;
        this.S++;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0355, code lost:
        if (r1.equals("602LV") != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:490:0x0751, code lost:
        if (r7 != 2) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0073 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean az(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 2782
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pxq.az(java.lang.String):boolean");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.awb
    public float b(float f, Format format, Format[] formatArr) {
        float f2 = -1.0f;
        for (Format format2 : formatArr) {
            float f3 = format2.s;
            if (f3 != -1.0f) {
                f2 = Math.max(f2, f3);
            }
        }
        if (f2 == -1.0f) {
            return -1.0f;
        }
        return f2 * f;
    }

    @Override // defpackage.awb
    protected final int c(awd awdVar, Format format) {
        int i = 0;
        if (!pwl.l(format.l)) {
            return 0;
        }
        boolean z = format.o != null;
        List aG = aG(awdVar, format, z, false);
        if (z && aG.isEmpty()) {
            aG = aG(awdVar, format, false, false);
        }
        if (aG.isEmpty()) {
            return 1;
        }
        if (!M(format)) {
            return 2;
        }
        avz avzVar = (avz) aG.get(0);
        boolean c = avzVar.c(format);
        int i2 = true != avzVar.d(format) ? 8 : 16;
        if (c) {
            List aG2 = aG(awdVar, format, z, true);
            if (!aG2.isEmpty()) {
                avz avzVar2 = (avz) aG2.get(0);
                if (avzVar2.c(format) && avzVar2.d(format)) {
                    i = 32;
                }
            }
        }
        return (true != c ? 3 : 4) | i2 | i;
    }

    @Override // defpackage.pkd, defpackage.pke
    public final String d() {
        return "MediaCodecVideoRenderer";
    }

    @Override // defpackage.awb
    protected final avv f(avz avzVar, Format format, MediaCrypto mediaCrypto, float f) {
        Pair a;
        DummySurface dummySurface = this.D;
        if (dummySurface != null && dummySurface.a != avzVar.f) {
            dummySurface.release();
            this.D = null;
        }
        String str = avzVar.c;
        pxo at = at(avzVar, format, ar());
        this.A = at;
        boolean z = this.z;
        int i = this.X ? this.Y : 0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", format.q);
        mediaFormat.setInteger("height", format.r);
        pns.d(mediaFormat, format.n);
        float f2 = format.s;
        if (f2 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f2);
        }
        pns.c(mediaFormat, "rotation-degrees", format.t);
        ColorInfo colorInfo = format.x;
        if (colorInfo != null) {
            pns.c(mediaFormat, "color-transfer", colorInfo.c);
            pns.c(mediaFormat, "color-standard", colorInfo.a);
            pns.c(mediaFormat, "color-range", colorInfo.b);
            byte[] bArr = colorInfo.d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(format.l) && (a = awn.a(format)) != null) {
            pns.c(mediaFormat, "profile", ((Integer) a.first).intValue());
        }
        mediaFormat.setInteger("max-width", at.a);
        mediaFormat.setInteger("max-height", at.b);
        pns.c(mediaFormat, "max-input-size", at.c);
        if (pxi.a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (z) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", true);
            mediaFormat.setInteger("audio-session-id", i);
        }
        if (this.q == null) {
            if (aP(avzVar)) {
                if (this.D == null) {
                    this.D = DummySurface.a(this.v, avzVar.f);
                }
                this.q = this.D;
            } else {
                throw new IllegalStateException();
            }
        }
        return new avv(avzVar, mediaFormat, format, this.q, mediaCrypto);
    }

    @Override // defpackage.awb
    protected final avy g(Throwable th, avz avzVar) {
        return new pxn(th, avzVar, this.q);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.awb
    public pmw h(avz avzVar, Format format, Format format2) {
        int i;
        int i2;
        pmw b = avzVar.b(format, format2);
        int i3 = b.e;
        int i4 = format2.q;
        pxo pxoVar = this.A;
        if (i4 > pxoVar.a || format2.r > pxoVar.b) {
            i3 |= 256;
        }
        if (as(avzVar, format2) > this.A.c) {
            i3 |= 64;
        }
        String str = avzVar.a;
        if (i3 != 0) {
            i2 = i3;
            i = 0;
        } else {
            i = b.d;
            i2 = 0;
        }
        return new pmw(str, format, format2, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.awb
    public final pmw i(pit pitVar) {
        pmw i = super.i(pitVar);
        this.x.f(pitVar.b, i);
        return i;
    }

    @Override // defpackage.awb
    protected final List j(awd awdVar, Format format, boolean z) {
        return aG(awdVar, format, z, this.X);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.awb
    public void k(pmv pmvVar) {
        if (!this.C) {
            return;
        }
        ByteBuffer byteBuffer = pmvVar.g;
        ptx.a(byteBuffer);
        if (byteBuffer.remaining() < 7) {
            return;
        }
        byte b = byteBuffer.get();
        short s2 = byteBuffer.getShort();
        short s3 = byteBuffer.getShort();
        byte b2 = byteBuffer.get();
        byte b3 = byteBuffer.get();
        byteBuffer.position(0);
        if (b != -75 || s2 != 60 || s3 != 1 || b2 != 4 || b3 != 0) {
            return;
        }
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        byteBuffer.position(0);
        avx avxVar = ((awb) this).b;
        Bundle bundle = new Bundle();
        bundle.putByteArray("hdr10-plus-info", bArr);
        avxVar.k(bundle);
    }

    @Override // defpackage.awb
    protected final void m(Exception exc) {
        pns.e("MediaCodecVideoRenderer", "Video codec error", exc);
        this.x.h(exc);
    }

    @Override // defpackage.awb
    protected final void n(String str, long j, long j2) {
        this.x.a(str, j, j2);
        this.B = az(str);
        avz avzVar = ((awb) this).e;
        ptx.a(avzVar);
        boolean z = false;
        if (pxi.a >= 29 && "video/x-vnd.on2.vp9".equals(avzVar.b)) {
            MediaCodecInfo.CodecProfileLevel[] f = avzVar.f();
            int length = f.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (f[i].profile == 16384) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
        }
        this.C = z;
        if (pxi.a < 23 || !this.X) {
            return;
        }
        avx avxVar = ((awb) this).b;
        ptx.a(avxVar);
        this.r = new pxp(this, avxVar);
    }

    @Override // defpackage.awb
    protected final void o(String str) {
        this.x.b(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.awb, defpackage.phj
    public final void p() {
        aI();
        aH();
        this.E = false;
        pya pyaVar = this.w;
        pxw pxwVar = pyaVar.b;
        if (pxwVar != null) {
            pxwVar.a();
            pxz pxzVar = pyaVar.c;
            ptx.a(pxzVar);
            pxzVar.c.sendEmptyMessage(2);
        }
        this.r = null;
        try {
            super.p();
        } finally {
            this.x.c(this.l);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.awb, defpackage.phj
    public void q(boolean z, boolean z2) {
        super.q(z, z2);
        boolean z3 = Z().b;
        ptx.e(!z3 || this.Y != 0);
        if (this.X != z3) {
            this.X = z3;
            y();
        }
        this.x.e(this.l);
        pya pyaVar = this.w;
        if (pyaVar.b != null) {
            pxz pxzVar = pyaVar.c;
            ptx.a(pxzVar);
            pxzVar.c.sendEmptyMessage(1);
            pyaVar.b.b(new pxu(pyaVar));
        }
        this.H = z2;
        this.I = false;
    }

    @Override // defpackage.awb
    protected final void r(Format format, MediaFormat mediaFormat) {
        int integer;
        int integer2;
        avx avxVar = ((awb) this).b;
        if (avxVar != null) {
            avxVar.l(this.F);
        }
        if (this.X) {
            this.T = format.q;
            integer2 = format.r;
            this.U = integer2;
        } else {
            ptx.a(mediaFormat);
            boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            if (z) {
                integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
            } else {
                integer = mediaFormat.getInteger("width");
            }
            this.T = integer;
            if (z) {
                integer2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
            } else {
                integer2 = mediaFormat.getInteger("height");
            }
            this.U = integer2;
        }
        float f = format.u;
        this.V = f;
        int i = pxi.a;
        int i2 = format.t;
        if (i2 == 90 || i2 == 270) {
            int i3 = this.T;
            this.T = integer2;
            this.U = i3;
            this.V = 1.0f / f;
        }
        pya pyaVar = this.w;
        pyaVar.f = format.s;
        pxm pxmVar = pyaVar.a;
        pxmVar.a.d();
        pxmVar.b.d();
        pxmVar.c = false;
        pxmVar.d = -9223372036854775807L;
        pxmVar.e = 0;
        pyaVar.c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.awb, defpackage.phj
    public void s(long j, boolean z) {
        super.s(j, z);
        aH();
        this.w.b();
        this.P = -9223372036854775807L;
        this.f260J = -9223372036854775807L;
        this.N = 0;
        if (z) {
            aN();
        } else {
            this.K = -9223372036854775807L;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.awb
    public final void t(long j) {
        super.t(j);
        if (!this.X) {
            this.O--;
        }
    }

    @Override // defpackage.awb
    protected final void u() {
        aH();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.awb
    public void v(pmv pmvVar) {
        if (!this.X) {
            this.O++;
        }
        if (pxi.a >= 23 || !this.X) {
            return;
        }
        av(pmvVar.f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.awb, defpackage.phj
    public final void w() {
        try {
            super.w();
        } finally {
            DummySurface dummySurface = this.D;
            if (dummySurface != null) {
                if (this.q == dummySurface) {
                    this.q = null;
                }
                dummySurface.release();
                this.D = null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [phj, pxq, awb] */
    /* JADX WARN: Type inference failed for: r5v9, types: [android.view.Surface] */
    @Override // defpackage.phj, defpackage.pkb
    public void ad(int i, Object obj) {
        if (i != 1) {
            if (i == 7) {
                this.Z = (pxt) obj;
                return;
            } else if (i == 10) {
                int intValue = ((Integer) obj).intValue();
                if (this.Y == intValue) {
                    return;
                }
                this.Y = intValue;
                if (!this.X) {
                    return;
                }
                y();
                return;
            } else if (i == 4) {
                int intValue2 = ((Integer) obj).intValue();
                this.F = intValue2;
                avx avxVar = this.b;
                if (avxVar == null) {
                    return;
                }
                avxVar.l(intValue2);
                return;
            } else if (i != 5) {
                return;
            } else {
                pya pyaVar = this.w;
                int intValue3 = ((Integer) obj).intValue();
                if (pyaVar.h == intValue3) {
                    return;
                }
                pyaVar.h = intValue3;
                pyaVar.d(true);
                return;
            }
        }
        Surface surface = null;
        DummySurface dummySurface = obj instanceof Surface ? (Surface) obj : null;
        if (dummySurface == null) {
            DummySurface dummySurface2 = this.D;
            if (dummySurface2 != null) {
                dummySurface = dummySurface2;
            } else {
                avz avzVar = this.e;
                if (avzVar != null && aP(avzVar)) {
                    dummySurface = DummySurface.a(this.v, avzVar.f);
                    this.D = dummySurface;
                }
            }
        }
        if (this.q != dummySurface) {
            this.q = dummySurface;
            pya pyaVar2 = this.w;
            if (true != (dummySurface instanceof DummySurface)) {
                surface = dummySurface;
            }
            if (pyaVar2.e != surface) {
                pyaVar2.a();
                pyaVar2.e = surface;
                pyaVar2.d(true);
            }
            this.E = false;
            int i2 = this.o;
            avx avxVar2 = this.b;
            if (avxVar2 != null) {
                if (pxi.a < 23 || dummySurface == null || this.B) {
                    y();
                    l();
                } else {
                    aw(avxVar2, dummySurface);
                }
            }
            if (dummySurface == null || dummySurface == this.D) {
                aI();
                aH();
                return;
            }
            aL();
            aH();
            if (i2 != 2) {
                return;
            }
            aN();
        } else if (dummySurface == null || dummySurface == this.D) {
        } else {
            aL();
            if (!this.E) {
                return;
            }
            this.x.g(this.q);
        }
    }
}
