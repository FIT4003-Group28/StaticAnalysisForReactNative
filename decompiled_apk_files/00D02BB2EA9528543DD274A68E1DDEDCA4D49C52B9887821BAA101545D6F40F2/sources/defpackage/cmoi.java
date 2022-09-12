package defpackage;

import android.content.Context;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.video.DummySurface;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: cmoi  reason: default package */
/* loaded from: classes5.dex */
public final class cmoi extends cmbb {
    private static final int[] e = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private static boolean f;
    private static boolean r;
    private float A;
    private Surface B;
    private boolean C;
    private int D;
    private boolean E;
    private boolean F;
    private boolean G;
    private long H;
    private long I;
    private long J;
    private int K;
    private int L;
    private int M;
    private long N;
    private long O;
    private int P;
    private int Q;
    private int R;
    private int S;
    private float T;
    private float U;
    private int V;
    private int W;
    private int X;
    private float Y;
    private boolean Z;
    private int aa;
    private cmoj ab;
    cmoh d;
    private final Context s;
    private final cmom t;
    private final cmox u;
    private final boolean v;
    private cmog w;
    private boolean x;
    private boolean y;
    private Surface z;

    public cmoi(Context context, cmbd cmbdVar, Handler handler, cmoy cmoyVar) {
        super(2, cmbdVar, 30.0f);
        Context applicationContext = context.getApplicationContext();
        this.s = applicationContext;
        this.t = new cmom(applicationContext);
        this.u = new cmox(handler, cmoyVar);
        this.v = "NVIDIA".equals(cmny.c);
        this.I = -9223372036854775807L;
        this.Q = -1;
        this.R = -1;
        this.T = -1.0f;
        this.D = 1;
        aE();
    }

    private static void aA(Surface surface, float f2) {
        try {
            surface.setFrameRate(f2, f2 == 0.0f ? 0 : 1);
        } catch (IllegalStateException e2) {
            cmna.a("Failed to call Surface.setFrameRate", e2);
        }
    }

    private final boolean aB(cmaz cmazVar) {
        return cmny.a >= 23 && !this.Z && !au(cmazVar.a) && (!cmazVar.f || DummySurface.a(this.s));
    }

    private final void aC() {
        this.I = SystemClock.elapsedRealtime() + 5000;
    }

    private final void aD() {
        cmbr cmbrVar;
        this.E = false;
        if (cmny.a < 23 || !this.Z || (cmbrVar = this.q) == null) {
            return;
        }
        this.d = new cmoh(this, cmbrVar);
    }

    private final void aE() {
        this.V = -1;
        this.W = -1;
        this.Y = -1.0f;
        this.X = -1;
    }

    private final void aF() {
        int i = this.Q;
        if (i == -1) {
            if (this.R == -1) {
                return;
            }
            i = -1;
        }
        if (this.V == i && this.W == this.R && this.X == this.S && this.Y == this.T) {
            return;
        }
        this.u.a(i, this.R, this.S, this.T);
        this.V = this.Q;
        this.W = this.R;
        this.X = this.S;
        this.Y = this.T;
    }

    private final void aG() {
        int i = this.V;
        if (i == -1) {
            if (this.W == -1) {
                return;
            }
            i = -1;
        }
        this.u.a(i, this.W, this.X, this.Y);
    }

    private final void aH() {
        if (this.K > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            final long j = elapsedRealtime - this.J;
            final cmox cmoxVar = this.u;
            final int i = this.K;
            Handler handler = cmoxVar.a;
            if (handler != null) {
                handler.post(new Runnable(cmoxVar, i, j) { // from class: cmor
                    private final cmox a;
                    private final int b;
                    private final long c;

                    {
                        this.a = cmoxVar;
                        this.b = i;
                        this.c = j;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        cmox cmoxVar2 = this.a;
                        int i2 = this.b;
                        long j2 = this.c;
                        cmoy cmoyVar = cmoxVar2.b;
                        int i3 = cmny.a;
                        cmoyVar.u(i2, j2);
                    }
                });
            }
            this.K = 0;
            this.J = elapsedRealtime;
        }
    }

    private static boolean aI(long j) {
        return j < -30000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static int aJ(cmaz cmazVar, String str, int i, int i2) {
        char c;
        int i3;
        if (i == -1 || i2 == -1) {
            return -1;
        }
        int i4 = 4;
        switch (str.hashCode()) {
            case -1664118616:
                if (str.equals("video/3gpp")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1662541442:
                if (str.equals("video/hevc")) {
                    c = 4;
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
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1599127256:
                if (str.equals("video/x-vnd.on2.vp8")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c != 0 && c != 1) {
            if (c == 2) {
                if ("BRAVIA 4K 2015".equals(cmny.d) || ("Amazon".equals(cmny.c) && ("KFSOWI".equals(cmny.d) || ("AFTS".equals(cmny.d) && cmazVar.f)))) {
                    return -1;
                }
                i3 = cmny.A(i, 16) * cmny.A(i2, 16) * 256;
                i4 = 2;
                return (i3 * 3) / (i4 + i4);
            } else if (c != 3) {
                if (c != 4 && c != 5) {
                    return -1;
                }
                i3 = i * i2;
                return (i3 * 3) / (i4 + i4);
            }
        }
        i3 = i * i2;
        i4 = 2;
        return (i3 * 3) / (i4 + i4);
    }

    private static List<cmaz> aK(Format format, boolean z, boolean z2) {
        Pair<Integer, Integer> e2;
        String str = format.l;
        if (str == null) {
            return Collections.emptyList();
        }
        List<cmaz> c = cmbo.c(cmbo.b(str, z, z2), format);
        if ("video/dolby-vision".equals(str) && (e2 = cmbo.e(format)) != null) {
            int intValue = ((Integer) e2.first).intValue();
            if (intValue == 16 || intValue == 256) {
                c.addAll(cmbo.b("video/hevc", z, z2));
            } else if (intValue == 512) {
                c.addAll(cmbo.b("video/avc", z, z2));
            }
        }
        return Collections.unmodifiableList(c);
    }

    private final void aL() {
        cmoj cmojVar = this.ab;
        if (cmojVar != null) {
            cmojVar.a();
        }
    }

    protected static int at(cmaz cmazVar, Format format) {
        if (format.m != -1) {
            int size = format.n.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                i += format.n.get(i2).length;
            }
            return format.m + i;
        }
        return aJ(cmazVar, format.l, format.q, format.r);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x043d, code lost:
        if (r1.equals("deb") != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0061, code lost:
        if (r1 != 4) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:488:0x0741, code lost:
        if (r5 != 2) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected static final boolean au(java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 2740
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmoi.au(java.lang.String):boolean");
    }

    private final void ay(boolean z) {
        Surface surface;
        if (cmny.a < 30 || (surface = this.z) == null || surface == this.B) {
            return;
        }
        float f2 = 0.0f;
        if (this.a == 2) {
            float f3 = this.U;
            if (f3 != -1.0f) {
                f2 = f3 * ((cmbb) this).i;
            }
        }
        if (this.A == f2 && !z) {
            return;
        }
        this.A = f2;
        aA(surface, f2);
    }

    private final void az() {
        Surface surface;
        if (cmny.a < 30 || (surface = this.z) == null || surface == this.B || this.A == 0.0f) {
            return;
        }
        this.A = 0.0f;
        aA(surface, 0.0f);
    }

    @Override // defpackage.cmbb, defpackage.clls
    protected final void A() {
        try {
            super.A();
        } finally {
            Surface surface = this.B;
            if (surface != null) {
                if (this.z == surface) {
                    this.z = null;
                }
                surface.release();
                this.B = null;
            }
        }
    }

    @Override // defpackage.cmbb, defpackage.clls, defpackage.clol
    public final void I(float f2) {
        super.I(f2);
        ay(false);
    }

    @Override // defpackage.clol, defpackage.clon
    public final String J() {
        return "MediaCodecVideoRenderer";
    }

    @Override // defpackage.cmbb, defpackage.clol
    public final boolean L() {
        Surface surface;
        if (!super.L() || (!this.E && (((surface = this.B) == null || this.z != surface) && this.q != null && !this.Z))) {
            if (this.I == -9223372036854775807L) {
                return false;
            }
            if (SystemClock.elapsedRealtime() < this.I) {
                return true;
            }
            this.I = -9223372036854775807L;
            return false;
        }
        this.I = -9223372036854775807L;
        return true;
    }

    @Override // defpackage.cmbb
    protected final int O(cmbd cmbdVar, Format format) {
        int i = 0;
        if (!cmnf.b(format.l)) {
            return 0;
        }
        boolean z = format.o != null;
        List<cmaz> aK = aK(format, z, false);
        if (z && aK.isEmpty()) {
            aK = aK(format, false, false);
        }
        if (aK.isEmpty()) {
            return 1;
        }
        if (!an(format)) {
            return 2;
        }
        cmaz cmazVar = aK.get(0);
        boolean b = cmazVar.b(format);
        int i2 = true != cmazVar.c(format) ? 8 : 16;
        if (b) {
            List<cmaz> aK2 = aK(format, z, true);
            if (!aK2.isEmpty()) {
                cmaz cmazVar2 = aK2.get(0);
                if (cmazVar2.b(format) && cmazVar2.c(format)) {
                    i = 32;
                }
            }
        }
        return (true != b ? 3 : 4) | i2 | i;
    }

    @Override // defpackage.cmbb
    protected final List<cmaz> P(cmbd cmbdVar, Format format, boolean z) {
        return aK(format, z, this.Z);
    }

    @Override // defpackage.cmbb
    protected final void R(final String str, final long j, final long j2) {
        final cmox cmoxVar = this.u;
        Handler handler = cmoxVar.a;
        if (handler != null) {
            handler.post(new Runnable(cmoxVar, str, j, j2) { // from class: cmop
                private final cmox a;
                private final String b;
                private final long c;
                private final long d;

                {
                    this.a = cmoxVar;
                    this.b = str;
                    this.c = j;
                    this.d = j2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    cmox cmoxVar2 = this.a;
                    String str2 = this.b;
                    long j3 = this.c;
                    long j4 = this.d;
                    cmoy cmoyVar = cmoxVar2.b;
                    int i = cmny.a;
                    cmoyVar.s(str2, j3, j4);
                }
            });
        }
        this.x = au(str);
        cmaz cmazVar = ((cmbb) this).k;
        cmmn.f(cmazVar);
        boolean z = false;
        if (cmny.a >= 29 && "video/x-vnd.on2.vp9".equals(cmazVar.b)) {
            MediaCodecInfo.CodecProfileLevel[] a = cmazVar.a();
            int length = a.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (a[i].profile == 16384) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
        }
        this.y = z;
    }

    @Override // defpackage.cmbb
    protected final void S(final String str) {
        final cmox cmoxVar = this.u;
        Handler handler = cmoxVar.a;
        if (handler != null) {
            handler.post(new Runnable(cmoxVar, str) { // from class: cmov
                private final cmox a;
                private final String b;

                {
                    this.a = cmoxVar;
                    this.b = str;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    cmox cmoxVar2 = this.a;
                    String str2 = this.b;
                    cmoy cmoyVar = cmoxVar2.b;
                    int i = cmny.a;
                    cmoyVar.x(str2);
                }
            });
        }
    }

    @Override // defpackage.cmbb
    protected final void T(clng clngVar) {
        super.T(clngVar);
        final cmox cmoxVar = this.u;
        final Format format = clngVar.a;
        Handler handler = cmoxVar.a;
        if (handler != null) {
            handler.post(new Runnable(cmoxVar, format) { // from class: cmoq
                private final cmox a;
                private final Format b;

                {
                    this.a = cmoxVar;
                    this.b = format;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    cmox cmoxVar2 = this.a;
                    Format format2 = this.b;
                    cmoy cmoyVar = cmoxVar2.b;
                    int i = cmny.a;
                    cmoyVar.t(format2);
                }
            });
        }
    }

    @Override // defpackage.cmbb
    protected final void U(Format format, MediaFormat mediaFormat) {
        int integer;
        int integer2;
        cmbr cmbrVar = this.q;
        if (cmbrVar != null) {
            cmbrVar.e(this.D);
        }
        if (this.Z) {
            this.Q = format.q;
            this.R = format.r;
        } else {
            cmmn.f(mediaFormat);
            boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            if (z) {
                integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
            } else {
                integer = mediaFormat.getInteger("width");
            }
            this.Q = integer;
            if (z) {
                integer2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
            } else {
                integer2 = mediaFormat.getInteger("height");
            }
            this.R = integer2;
        }
        this.T = format.u;
        if (cmny.a >= 21) {
            int i = format.t;
            if (i == 90 || i == 270) {
                int i2 = this.Q;
                this.Q = this.R;
                this.R = i2;
                this.T = 1.0f / this.T;
            }
        } else {
            this.S = format.t;
        }
        this.U = format.s;
        ay(false);
    }

    @Override // defpackage.cmbb
    protected final void V(cltg cltgVar) {
        if (!this.Z) {
            this.M++;
        }
        if (cmny.a >= 23 || !this.Z) {
            return;
        }
        ap(cltgVar.d);
    }

    @Override // defpackage.cmbb
    protected final void W() {
        aD();
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0121, code lost:
        if (r6 > r11) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0123, code lost:
        r5 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0125, code lost:
        r5 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0126, code lost:
        if (r6 > r11) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0128, code lost:
        r4 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0129, code lost:
        r2 = new android.graphics.Point(r5, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0138, code lost:
        r20 = r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x022b  */
    @Override // defpackage.cmbb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void Y(defpackage.cmaz r22, defpackage.cmbr r23, com.google.android.exoplayer2.Format r24, android.media.MediaCrypto r25, float r26) {
        /*
            Method dump skipped, instructions count: 628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmoi.Y(cmaz, cmbr, com.google.android.exoplayer2.Format, android.media.MediaCrypto, float):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0083, code lost:
        if (r9 > 100000) goto L111;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x012a  */
    @Override // defpackage.cmbb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final boolean Z(long r26, long r28, defpackage.cmbr r30, java.nio.ByteBuffer r31, int r32, int r33, int r34, long r35, boolean r37, boolean r38, com.google.android.exoplayer2.Format r39) {
        /*
            Method dump skipped, instructions count: 499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmoi.Z(long, long, cmbr, java.nio.ByteBuffer, int, int, int, long, boolean, boolean, com.google.android.exoplayer2.Format):boolean");
    }

    @Override // defpackage.cmbb
    protected final int aa(cmaz cmazVar, Format format, Format format2) {
        int i = format2.q;
        cmog cmogVar = this.w;
        if (i > cmogVar.a || format2.r > cmogVar.b || at(cmazVar, format2) > this.w.c) {
            return 0;
        }
        return cmazVar.d(format, format2);
    }

    @Override // defpackage.cmbb
    protected final float ab(float f2, Format[] formatArr) {
        float f3 = -1.0f;
        for (Format format : formatArr) {
            float f4 = format.s;
            if (f4 != -1.0f) {
                f3 = Math.max(f3, f4);
            }
        }
        if (f3 == -1.0f) {
            return -1.0f;
        }
        return f3 * f2;
    }

    @Override // defpackage.cmbb
    protected final boolean ad(cmaz cmazVar) {
        return this.z != null || aB(cmazVar);
    }

    @Override // defpackage.cmbb
    protected final boolean ae() {
        return this.Z && cmny.a < 23;
    }

    @Override // defpackage.cmbb
    protected final void ai() {
        super.ai();
        this.M = 0;
    }

    @Override // defpackage.cmbb
    protected final cmay ak(Throwable th, cmaz cmazVar) {
        return new cmof(th, cmazVar, this.z);
    }

    @Override // defpackage.cmbb
    protected final void al(cltg cltgVar) {
        if (!this.y) {
            return;
        }
        ByteBuffer byteBuffer = cltgVar.e;
        cmmn.f(byteBuffer);
        if (byteBuffer.remaining() < 7) {
            return;
        }
        byte b = byteBuffer.get();
        short s = byteBuffer.getShort();
        short s2 = byteBuffer.getShort();
        byte b2 = byteBuffer.get();
        byte b3 = byteBuffer.get();
        byteBuffer.position(0);
        if (b != -75 || s != 60 || s2 != 1 || b2 != 4 || b3 != 0) {
            return;
        }
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        byteBuffer.position(0);
        cmbr cmbrVar = this.q;
        Bundle bundle = new Bundle();
        bundle.putByteArray("hdr10-plus-info", bArr);
        cmbrVar.d(bundle);
    }

    @Override // defpackage.cmbb
    protected final void am(long j) {
        super.am(j);
        if (!this.Z) {
            this.M--;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void ap(long j) {
        af(j);
        aF();
        this.o.e++;
        as();
        am(j);
    }

    protected final void aq(int i) {
        clte clteVar = this.o;
        clteVar.g += i;
        this.K += i;
        int i2 = this.L + i;
        this.L = i2;
        clteVar.h = Math.max(i2, clteVar.h);
        if (this.K >= 50) {
            aH();
        }
    }

    protected final void ar(long j) {
        clte clteVar = this.o;
        clteVar.j += j;
        clteVar.k++;
        this.O += j;
        this.P++;
    }

    final void as() {
        this.G = true;
        if (!this.E) {
            this.E = true;
            this.u.b(this.z);
            this.C = true;
        }
    }

    protected final void av(cmbr cmbrVar, int i) {
        aF();
        cmnw.a("releaseOutputBuffer");
        cmbrVar.b(i, true);
        cmnw.b();
        this.N = SystemClock.elapsedRealtime() * 1000;
        this.o.e++;
        this.L = 0;
        as();
    }

    protected final void aw(cmbr cmbrVar, int i, long j) {
        aF();
        cmnw.a("releaseOutputBuffer");
        cmbrVar.a.releaseOutputBuffer(i, j);
        cmnw.b();
        this.N = SystemClock.elapsedRealtime() * 1000;
        this.o.e++;
        this.L = 0;
        as();
    }

    protected final void ax(cmbr cmbrVar, int i) {
        cmnw.a("skipVideoBuffer");
        cmbrVar.b(i, false);
        cmnw.b();
        this.o.f++;
    }

    @Override // defpackage.clls, defpackage.cloi
    public final void t(int i, Object obj) {
        if (i != 1) {
            if (i != 4) {
                if (i != 6) {
                    return;
                }
                this.ab = (cmoj) obj;
                return;
            }
            int intValue = ((Integer) obj).intValue();
            this.D = intValue;
            cmbr cmbrVar = this.q;
            if (cmbrVar == null) {
                return;
            }
            cmbrVar.e(intValue);
            return;
        }
        Surface surface = (Surface) obj;
        if (surface == null) {
            Surface surface2 = this.B;
            if (surface2 != null) {
                surface = surface2;
            } else {
                cmaz cmazVar = ((cmbb) this).k;
                if (cmazVar != null && aB(cmazVar)) {
                    surface = DummySurface.b(this.s, cmazVar.f);
                    this.B = surface;
                }
            }
        }
        if (this.z != surface) {
            az();
            this.z = surface;
            this.C = false;
            ay(true);
            int i2 = this.a;
            cmbr cmbrVar2 = this.q;
            if (cmbrVar2 != null) {
                if (cmny.a < 23 || surface == null || this.x) {
                    ag();
                    ac();
                } else {
                    cmbrVar2.a.setOutputSurface(surface);
                }
            }
            if (surface == null || surface == this.B) {
                aE();
                aD();
                return;
            }
            aG();
            aD();
            if (i2 != 2) {
                return;
            }
            aC();
        } else if (surface == null || surface == this.B) {
        } else {
            aG();
            if (!this.C) {
                return;
            }
            this.u.b(this.z);
        }
    }

    @Override // defpackage.cmbb, defpackage.clls
    protected final void u(boolean z, boolean z2) {
        super.u(z, z2);
        int i = this.aa;
        int i2 = D().b;
        this.aa = i2;
        this.Z = i2 != 0;
        if (i2 != i) {
            ag();
        }
        final cmox cmoxVar = this.u;
        final clte clteVar = this.o;
        Handler handler = cmoxVar.a;
        if (handler != null) {
            handler.post(new Runnable(cmoxVar, clteVar) { // from class: cmoo
                private final cmox a;
                private final clte b;

                {
                    this.a = cmoxVar;
                    this.b = clteVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    cmox cmoxVar2 = this.a;
                    clte clteVar2 = this.b;
                    cmoy cmoyVar = cmoxVar2.b;
                    int i3 = cmny.a;
                    cmoyVar.r(clteVar2);
                }
            });
        }
        cmom cmomVar = this.t;
        cmomVar.i = false;
        if (cmomVar.a != null) {
            cmomVar.b.c.sendEmptyMessage(1);
            cmok cmokVar = cmomVar.c;
            if (cmokVar != null) {
                cmokVar.a.registerDisplayListener(cmokVar, null);
            }
            cmomVar.a();
        }
        this.F = z2;
        this.G = false;
    }

    @Override // defpackage.cmbb, defpackage.clls
    protected final void w(long j, boolean z) {
        super.w(j, z);
        aD();
        this.H = -9223372036854775807L;
        this.L = 0;
        if (z) {
            aC();
        } else {
            this.I = -9223372036854775807L;
        }
    }

    @Override // defpackage.clls
    protected final void x() {
        this.K = 0;
        this.J = SystemClock.elapsedRealtime();
        this.N = SystemClock.elapsedRealtime() * 1000;
        this.O = 0L;
        this.P = 0;
        ay(false);
    }

    @Override // defpackage.clls
    protected final void y() {
        this.I = -9223372036854775807L;
        aH();
        final int i = this.P;
        if (i != 0) {
            final cmox cmoxVar = this.u;
            final long j = this.O;
            Handler handler = cmoxVar.a;
            if (handler != null) {
                handler.post(new Runnable(cmoxVar, j, i) { // from class: cmos
                    private final cmox a;
                    private final long b;
                    private final int c;

                    {
                        this.a = cmoxVar;
                        this.b = j;
                        this.c = i;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        cmox cmoxVar2 = this.a;
                        long j2 = this.b;
                        int i2 = this.c;
                        cmoy cmoyVar = cmoxVar2.b;
                        int i3 = cmny.a;
                        cmoyVar.z(j2, i2);
                    }
                });
            }
            this.O = 0L;
            this.P = 0;
        }
        az();
    }

    @Override // defpackage.cmbb, defpackage.clls
    protected final void z() {
        aE();
        aD();
        this.C = false;
        cmom cmomVar = this.t;
        if (cmomVar.a != null) {
            cmok cmokVar = cmomVar.c;
            if (cmokVar != null) {
                cmokVar.a.unregisterDisplayListener(cmokVar);
            }
            cmomVar.b.c.sendEmptyMessage(2);
        }
        this.d = null;
        try {
            super.z();
        } finally {
            this.u.c(this.o);
        }
    }
}
