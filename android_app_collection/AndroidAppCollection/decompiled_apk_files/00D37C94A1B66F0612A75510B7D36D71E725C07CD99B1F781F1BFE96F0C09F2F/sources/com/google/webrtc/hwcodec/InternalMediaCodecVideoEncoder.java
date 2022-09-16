package com.google.webrtc.hwcodec;

import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import com.google.webrtc.hwcodec.InternalMediaCodecVideoEncoder;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.webrtc.Logging;
import org.webrtc.VideoCodecStatus;
import org.webrtc.VideoEncoder;
import org.webrtc.VideoFrame;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class InternalMediaCodecVideoEncoder implements VideoEncoder {
    public static final long a = TimeUnit.SECONDS.toMicros(1);
    public int A;
    public int B;
    public VideoCodecStatus C;
    public long D;
    public int E;
    public int F;
    public int G;
    public int H;
    public long I;

    /* renamed from: J  reason: collision with root package name */
    public int f170J;
    public final axgz K;
    public axif L;
    public final int M;
    public final bane N = new bane();
    private final String O;
    private final Integer P;
    private final Integer Q;
    private final boolean R;
    private final axgs S;
    private final int T;
    private final amqo U;
    private final amuk V;
    private final baoz W;
    private HandlerThread X;
    private Handler Y;
    private boolean Z;
    private Surface aa;
    private axin ab;
    private int ac;
    private final acoz ad;
    public final axgq b;
    public final int c;
    public final long d;
    public final long e;
    public final bapf f;
    public final axhz g;
    public boolean h;
    public ByteBuffer[] i;
    public VideoEncoder.Callback j;
    public boolean k;
    public bams l;
    public axha m;
    public axin n;
    public final Deque o;
    public int p;
    public int q;
    public boolean r;
    public long s;
    public long t;
    public int u;
    public long v;
    public long w;
    public ByteBuffer x;
    public int y;
    public int z;

    public InternalMediaCodecVideoEncoder(String str, axgq axgqVar, Integer num, Integer num2, boolean z, axgs axgsVar, axgz axgzVar, amqo amqoVar, acoz acozVar, amuk amukVar) {
        int i;
        baoz baozVar = new baoz();
        this.W = baozVar;
        this.g = new axhz();
        this.o = new ArrayDeque();
        this.x = null;
        this.C = VideoCodecStatus.OK;
        this.O = str;
        this.b = axgqVar;
        this.P = num;
        this.Q = num2;
        int intValue = num2.intValue();
        int i2 = 2;
        if (intValue == 19) {
            i = 1;
        } else if (intValue != 21 && intValue != 2141391872 && intValue != 2141391876) {
            StringBuilder sb = new StringBuilder(36);
            sb.append("Unsupported colorFormat: ");
            sb.append(intValue);
            throw new IllegalArgumentException(sb.toString());
        } else {
            i = 2;
        }
        this.M = i;
        this.R = z;
        this.S = axgsVar;
        this.T = axgsVar.f;
        this.d = TimeUnit.SECONDS.toMicros(axgsVar.g);
        this.e = axgsVar.h;
        if ((axgsVar.b & 256) != 0) {
            int i3 = axgsVar.i;
            if (i3 <= 0) {
                StringBuilder sb2 = new StringBuilder(41);
                sb2.append("Wrong maxPendingFrames value: ");
                sb2.append(i3);
                Logging.d("IMCVideoEncoder", sb2.toString());
            } else {
                i2 = i3;
            }
        }
        this.c = i2;
        this.K = axgzVar;
        this.U = amqoVar;
        this.ad = acozVar;
        this.f = new axgy();
        this.V = amukVar;
        baozVar.b();
    }

    public static long a(long j) {
        return TimeUnit.MILLISECONDS.convert(j, TimeUnit.MICROSECONDS);
    }

    protected final VideoCodecStatus b(Callable callable, String str) {
        return axij.e(this.Y, callable, str);
    }

    public final VideoCodecStatus c() {
        f();
        int i = this.ac + 1;
        this.ac = i;
        StringBuilder sb = new StringBuilder(21);
        sb.append("HW error #");
        sb.append(i);
        Logging.b("IMCVideoEncoder", sb.toString());
        if (this.ac <= 3) {
            return VideoCodecStatus.ERROR;
        }
        return VideoCodecStatus.FALLBACK_SOFTWARE;
    }

    @Override // org.webrtc.VideoEncoder
    public final /* synthetic */ long createNativeVideoEncoder() {
        return 0L;
    }

    public final VideoCodecStatus d(int i, int i2, boolean z) {
        f();
        this.p = i;
        this.q = i2;
        this.r = z;
        this.s = -1L;
        this.t = System.nanoTime();
        this.u = 0;
        this.v = 0L;
        this.w = 0L;
        this.m = axie.a(this.b);
        this.B = 0;
        this.C = VideoCodecStatus.OK;
        this.y = this.K.a();
        int b = this.K.b();
        int i3 = this.A;
        int i4 = this.y;
        int i5 = this.z;
        long j = this.d;
        int i6 = this.T;
        long j2 = this.e;
        int i7 = this.c;
        String valueOf = String.valueOf(this.V);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 402 + "null".length());
        sb.append("startEncodeInternal: ");
        sb.append(i);
        sb.append(" x ");
        sb.append(i2);
        sb.append(". Target bitrate: ");
        sb.append(i3);
        sb.append(". Adjusted bitrate: ");
        sb.append(i4);
        sb.append(". Target framerate: ");
        sb.append(i5);
        sb.append(". Adjusted framerate: ");
        sb.append(b);
        sb.append(". useSurfaceMode: ");
        sb.append(z);
        sb.append(". forcedKeyFrameUs: ");
        sb.append(j);
        sb.append(". keyFrameIntervalSec: ");
        sb.append(i6);
        sb.append(". maxFrameGapBeforeRequestingKeyFrameNs: ");
        sb.append(j2);
        sb.append(". maxPendingFrames: ");
        sb.append(i7);
        sb.append(". Bitrate limits: ");
        sb.append(valueOf);
        sb.append(". videoFadeInController: ");
        sb.append("null");
        Logging.a("IMCVideoEncoder", sb.toString());
        try {
            this.L = axij.f(this.O);
            int intValue = (z ? this.P : this.Q).intValue();
            try {
                MediaFormat createVideoFormat = MediaFormat.createVideoFormat(axie.c(this.b), i, i2);
                createVideoFormat.setInteger("bitrate", this.y);
                createVideoFormat.setInteger("bitrate-mode", 2);
                createVideoFormat.setInteger("color-format", intValue);
                createVideoFormat.setInteger("frame-rate", b);
                createVideoFormat.setInteger("i-frame-interval", this.T);
                if (this.b == axgq.H264 && this.R) {
                    Logging.a("IMCVideoEncoder", "Using H264 HP.");
                    createVideoFormat.setInteger("profile", 8);
                    createVideoFormat.setInteger("level", 256);
                }
                String valueOf2 = String.valueOf(createVideoFormat);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 8);
                sb2.append("Format: ");
                sb2.append(valueOf2);
                Logging.a("IMCVideoEncoder", sb2.toString());
                this.L.j(createVideoFormat, null, 1);
                if (z) {
                    this.l = bamk.d((bamm) ((amqr) this.U).a, bams.e);
                    Surface createInputSurface = this.L.a.createInputSurface();
                    this.aa = createInputSurface;
                    this.l.d(createInputSurface);
                    this.l.f();
                }
                this.L.f();
                this.i = this.L.i();
                this.o.clear();
                this.k = true;
                this.F = 0;
                this.G = 0;
                g();
                this.n.b();
                this.ab.a(3000L);
                return VideoCodecStatus.OK;
            } catch (Exception e) {
                Logging.c("IMCVideoEncoder", "startEncodeInternal failed", e);
                e();
                return VideoCodecStatus.FALLBACK_SOFTWARE;
            }
        } catch (Exception e2) {
            String valueOf3 = String.valueOf(this.O);
            Logging.c("IMCVideoEncoder", valueOf3.length() != 0 ? "Cannot create media encoder ".concat(valueOf3) : new String("Cannot create media encoder "), e2);
            return VideoCodecStatus.FALLBACK_SOFTWARE;
        }
    }

    public final VideoCodecStatus e() {
        f();
        Logging.a("IMCVideoEncoder", "stopEncodeInternal");
        this.n.b();
        this.ab.b();
        this.x = null;
        this.o.clear();
        this.g.a();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final Exception[] excArr = new Exception[1];
        new Thread(new Runnable() { // from class: axhv
            @Override // java.lang.Runnable
            public final void run() {
                InternalMediaCodecVideoEncoder internalMediaCodecVideoEncoder = InternalMediaCodecVideoEncoder.this;
                Exception[] excArr2 = excArr;
                CountDownLatch countDownLatch2 = countDownLatch;
                try {
                    internalMediaCodecVideoEncoder.L.g();
                } catch (Exception e) {
                    Logging.c("IMCVideoEncoder", "Media encoder stop failed", e);
                }
                try {
                    internalMediaCodecVideoEncoder.L.c();
                } catch (Exception e2) {
                    Logging.c("IMCVideoEncoder", "Media encoder release failed", e2);
                    excArr2[0] = e2;
                }
                countDownLatch2.countDown();
            }
        }, "IMCVideoEncoder.release").start();
        try {
            boolean await = countDownLatch.await(5000L, TimeUnit.MILLISECONDS);
            Exception exc = excArr[0];
            if (exc != null) {
                Logging.c("IMCVideoEncoder", "MediaCodec release exception.", exc);
                return VideoCodecStatus.ERROR;
            } else if (!await) {
                Logging.b("IMCVideoEncoder", "MediaCodec release timed out.");
                acoz acozVar = this.ad;
                if (acozVar != null) {
                    acpg acpgVar = acozVar.a;
                    zep.c("PeerConnectionClient", "onCriticalEncodeError");
                    acqj acqjVar = acpgVar.z;
                    if (acqjVar != null) {
                        acqjVar.a();
                    }
                }
                return VideoCodecStatus.ERROR;
            } else {
                this.L = null;
                this.i = null;
                this.k = false;
                this.N.c();
                this.f.a();
                bams bamsVar = this.l;
                if (bamsVar != null) {
                    bamsVar.g();
                    this.l = null;
                }
                Surface surface = this.aa;
                if (surface != null) {
                    surface.release();
                    this.aa = null;
                }
                axha axhaVar = this.m;
                if (axhaVar != null) {
                    axhaVar.b();
                    this.m = null;
                }
                Logging.a("IMCVideoEncoder", "stopEncodeInternal done");
                return VideoCodecStatus.OK;
            }
        } catch (InterruptedException e) {
            Logging.c("IMCVideoEncoder", "Interrupted", e);
            Thread.currentThread().interrupt();
            return VideoCodecStatus.ERROR;
        }
    }

    @Override // org.webrtc.VideoEncoder
    public final VideoCodecStatus encode(final VideoFrame videoFrame, final VideoEncoder.EncodeInfo encodeInfo) {
        this.W.a();
        if (!this.h) {
            return VideoCodecStatus.UNINITIALIZED;
        }
        VideoCodecStatus b = b(new Callable() { // from class: axhy
            /* JADX WARN: Can't wrap try/catch for region: R(15:31|(3:33|(2:35|36)(2:38|39)|37)|40|41|(2:43|(4:51|52|(2:114|(1:116)(1:117))(1:55)|(2:57|58)(6:59|(4:61|62|63|64)(5:76|77|78|79|(1:81)(4:82|83|84|(5:86|(2:88|(2:90|(1:92)(2:99|100))(1:101))(2:102|(1:104)(2:105|106))|93|94|95)(1:107)))|65|(1:67)|68|(1:72)(2:70|71))))|118|119|120|121|122|52|(0)|114|(0)(0)|(0)(0)) */
            /* JADX WARN: Code restructure failed: missing block: B:52:0x01b0, code lost:
                r0 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:53:0x01b1, code lost:
                org.webrtc.Logging.c("IMCVideoEncoder", "requestKeyFrame failed", r0);
             */
            /* JADX WARN: Removed duplicated region for block: B:61:0x01de  */
            /* JADX WARN: Removed duplicated region for block: B:62:0x0201  */
            /* JADX WARN: Removed duplicated region for block: B:64:0x0209  */
            /* JADX WARN: Removed duplicated region for block: B:65:0x020d  */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object call() {
                /*
                    Method dump skipped, instructions count: 1038
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.axhy.call():java.lang.Object");
            }
        }, "encoder.encode");
        VideoCodecStatus videoCodecStatus = VideoCodecStatus.REQUEST_SLI;
        return b;
    }

    public final void f() {
        if (Thread.currentThread() == this.X) {
            return;
        }
        throw new AssertionError("Not called on the codec thread.");
    }

    public final void g() {
        this.D = System.currentTimeMillis();
        this.E = this.G;
        this.H = 0;
        this.I = 0L;
        this.f170J = 0;
    }

    @Override // org.webrtc.VideoEncoder
    public final String getImplementationName() {
        String valueOf = String.valueOf(this.O);
        return valueOf.length() != 0 ? "IMC: ".concat(valueOf) : new String("IMC: ");
    }

    @Override // org.webrtc.VideoEncoder
    public VideoEncoder.ResolutionBitrateLimits[] getResolutionBitrateLimits() {
        return (VideoEncoder.ResolutionBitrateLimits[]) arey.x(this.V, VideoEncoder.ResolutionBitrateLimits.class);
    }

    @Override // org.webrtc.VideoEncoder
    public final VideoEncoder.ScalingSettings getScalingSettings() {
        if (!this.Z) {
            return VideoEncoder.ScalingSettings.a;
        }
        axgq axgqVar = axgq.UNKNOWN;
        int ordinal = this.b.ordinal();
        if (ordinal == 1) {
            return new VideoEncoder.ScalingSettings(27, 80);
        }
        if (ordinal == 3) {
            return new VideoEncoder.ScalingSettings(23, 33);
        }
        return ordinal != 4 ? VideoEncoder.ScalingSettings.a : new VideoEncoder.ScalingSettings(27, 35);
    }

    public final boolean h() {
        amqo amqoVar = this.U;
        return (amqoVar == null || ((amqr) amqoVar).a == null || this.P == null) ? false : true;
    }

    @Override // org.webrtc.VideoEncoder
    public final VideoCodecStatus initEncode(final VideoEncoder.Settings settings, final VideoEncoder.Callback callback) {
        this.W.a();
        this.Z = settings.f;
        if (this.X != null) {
            try {
                Logging.a("IMCVideoEncoder", "codecThread join");
                this.X.join();
                Logging.a("IMCVideoEncoder", "codecThread join done");
            } catch (InterruptedException unused) {
                Logging.b("IMCVideoEncoder", "Interrupted while waiting for old codec to stop.");
                return VideoCodecStatus.ERROR;
            }
        }
        HandlerThread handlerThread = new HandlerThread("IMCVideoEncoder");
        this.X = handlerThread;
        handlerThread.start();
        this.Y = new Handler(this.X.getLooper());
        this.n = new axin(this.Y, new Runnable() { // from class: axhs
            /* JADX WARN: Removed duplicated region for block: B:61:0x024a  */
            /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 594
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.axhs.run():void");
            }
        });
        this.ab = new axin(this.Y, new Runnable() { // from class: axhr
            @Override // java.lang.Runnable
            public final void run() {
                InternalMediaCodecVideoEncoder internalMediaCodecVideoEncoder = InternalMediaCodecVideoEncoder.this;
                internalMediaCodecVideoEncoder.f();
                if (internalMediaCodecVideoEncoder.G == internalMediaCodecVideoEncoder.E) {
                    internalMediaCodecVideoEncoder.g();
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis();
                float f = ((float) (currentTimeMillis - internalMediaCodecVideoEncoder.D)) / 1000.0f;
                float f2 = internalMediaCodecVideoEncoder.G - internalMediaCodecVideoEncoder.E;
                Logging.a("IMCVideoEncoder", String.format(Locale.ENGLISH, "Statistics for last %s ms. Encoded frames: %s. Bitrate: %.0f kbps. Target: %s kbps. FPS: %.1f. Avg. encode time: %.1f ms. QP: %.1f.", Long.valueOf(currentTimeMillis - internalMediaCodecVideoEncoder.D), Integer.valueOf(internalMediaCodecVideoEncoder.G), Float.valueOf(((internalMediaCodecVideoEncoder.H * 8) / f) / 1000.0f), Integer.valueOf(internalMediaCodecVideoEncoder.A / 1000), Float.valueOf(f2 / f), Float.valueOf(((float) TimeUnit.NANOSECONDS.toMillis(internalMediaCodecVideoEncoder.I)) / f2), Float.valueOf(internalMediaCodecVideoEncoder.f170J / f2)));
                internalMediaCodecVideoEncoder.g();
            }
        });
        int i = settings.a;
        int i2 = settings.b;
        int i3 = settings.c;
        int i4 = settings.d;
        boolean h = h();
        StringBuilder sb = new StringBuilder(95);
        sb.append("initEncode: ");
        sb.append(i);
        sb.append(" x ");
        sb.append(i2);
        sb.append(". @ ");
        sb.append(i3);
        sb.append("kbps. Fps: ");
        sb.append(i4);
        sb.append(". Use  surface: ");
        sb.append(h);
        Logging.a("IMCVideoEncoder", sb.toString());
        if (!h()) {
            Logging.b("IMCVideoEncoder", "No shared EglBase.Context. Encoders will not use texture mode.");
        }
        VideoCodecStatus b = b(new Callable() { // from class: axhx
            @Override // java.util.concurrent.Callable
            public final Object call() {
                InternalMediaCodecVideoEncoder internalMediaCodecVideoEncoder = InternalMediaCodecVideoEncoder.this;
                VideoEncoder.Settings settings2 = settings;
                VideoEncoder.Callback callback2 = callback;
                internalMediaCodecVideoEncoder.f();
                internalMediaCodecVideoEncoder.j = callback2;
                int i5 = settings2.e;
                if (i5 > 1) {
                    StringBuilder sb2 = new StringBuilder(75);
                    sb2.append("Falling back to software since ");
                    sb2.append(i5);
                    sb2.append(" simulcast streams are requested.");
                    Logging.a("IMCVideoEncoder", sb2.toString());
                    return VideoCodecStatus.FALLBACK_SOFTWARE;
                }
                internalMediaCodecVideoEncoder.A = 10000000;
                int i6 = settings2.c;
                if (i6 != 0) {
                    internalMediaCodecVideoEncoder.A = i6 * 1000;
                }
                int i7 = 30;
                internalMediaCodecVideoEncoder.z = 30;
                int i8 = settings2.d;
                if (i8 != 0) {
                    i7 = almu.s(i8, 1, 30);
                    internalMediaCodecVideoEncoder.z = i7;
                }
                internalMediaCodecVideoEncoder.K.d(internalMediaCodecVideoEncoder.A, i7);
                return internalMediaCodecVideoEncoder.d(settings2.a, settings2.b, internalMediaCodecVideoEncoder.h());
            }
        }, "encoder.init");
        if (b == VideoCodecStatus.OK) {
            this.h = true;
        } else {
            this.X.quit();
        }
        return b;
    }

    @Override // org.webrtc.VideoEncoder
    public final /* synthetic */ boolean isHardwareEncoder() {
        return true;
    }

    @Override // org.webrtc.VideoEncoder
    public final VideoCodecStatus release() {
        this.W.a();
        Logging.a("IMCVideoEncoder", "release");
        VideoCodecStatus videoCodecStatus = VideoCodecStatus.OK;
        if (this.h) {
            videoCodecStatus = b(new Callable() { // from class: axhw
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return InternalMediaCodecVideoEncoder.this.e();
                }
            }, "encoder.release");
            this.X.quit();
            this.h = false;
        } else {
            Logging.d("IMCVideoEncoder", "Calling release on non-initialized codec.");
        }
        this.W.b();
        Logging.a("IMCVideoEncoder", "release done");
        return videoCodecStatus;
    }

    @Override // org.webrtc.VideoEncoder
    public final VideoCodecStatus setRateAllocation(final VideoEncoder.BitrateAllocation bitrateAllocation, final int i) {
        this.W.a();
        if (this.h) {
            this.Y.post(new Runnable() { // from class: axhu
                @Override // java.lang.Runnable
                public final void run() {
                    int[][] iArr;
                    InternalMediaCodecVideoEncoder internalMediaCodecVideoEncoder = InternalMediaCodecVideoEncoder.this;
                    VideoEncoder.BitrateAllocation bitrateAllocation2 = bitrateAllocation;
                    int i2 = i;
                    if (internalMediaCodecVideoEncoder.k) {
                        int i3 = 0;
                        for (int[] iArr2 : bitrateAllocation2.a) {
                            for (int i4 : iArr2) {
                                i3 += i4;
                            }
                        }
                        internalMediaCodecVideoEncoder.A = i3;
                        int s = almu.s(i2, 1, 30);
                        internalMediaCodecVideoEncoder.z = s;
                        internalMediaCodecVideoEncoder.K.d(internalMediaCodecVideoEncoder.A, s);
                    }
                }
            });
        }
        return VideoCodecStatus.OK;
    }
}
