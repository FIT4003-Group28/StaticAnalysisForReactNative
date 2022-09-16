package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Locale;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.webrtc.EncodedImage;
import org.webrtc.Logging;
import org.webrtc.VideoCodecStatus;
import org.webrtc.VideoDecoder;
import org.webrtc.VideoFrame;
/* compiled from: PG */
/* renamed from: axhn  reason: default package */
/* loaded from: classes2.dex */
public final class axhn implements VideoDecoder {
    public long A;
    public long B;
    private final String F;
    private final axgr G;
    private baoz H;
    private boolean I;

    /* renamed from: J  reason: collision with root package name */
    private Looper f132J;
    private int K;
    private int L;
    private int M;
    private axin N;
    private boolean O;
    private int P;
    private int Q;
    private ByteBuffer[] R;
    public final axgq a;
    public final amqo b;
    public final int c;
    public final boolean d;
    public Handler e;
    public final Queue g;
    public final Queue h;
    public axha i;
    public int j;
    public int k;
    public axin l;
    public boolean m;
    public int n;
    public int o;
    public int p;
    public int q;
    public ByteBuffer[] s;
    public baom t;
    public Surface u;
    public axhl v;
    public VideoDecoder.Callback w;
    public long x;
    public int y;
    public int z;
    public volatile boolean f = false;
    VideoCodecStatus r = VideoCodecStatus.OK;
    public axif E = null;
    public final Object C = new Object();
    public int D = 0;

    public axhn(String str, axgq axgqVar, int i, axgr axgrVar, amqo amqoVar, boolean z) {
        if (amqoVar != null || p(i)) {
            this.F = str;
            this.a = axgqVar;
            this.K = i;
            axgrVar.getClass();
            this.G = axgrVar;
            this.b = amqoVar;
            this.d = z;
            this.g = new ArrayDeque();
            this.h = new ArrayDeque();
            int i2 = 3;
            if ((axgrVar.b & 8) != 0) {
                int i3 = axgrVar.f;
                if (i3 > 0) {
                    i2 = i3;
                    this.c = i2;
                    return;
                }
                StringBuilder sb = new StringBuilder(45);
                sb.append("Wrong value for maxPendingFrames: ");
                sb.append(i3);
                Logging.d("IMCVideoDecoder", sb.toString());
            }
            axgq axgqVar2 = axgq.UNKNOWN;
            int ordinal = axgqVar.ordinal();
            if (ordinal == 1 || ordinal == 2) {
                i2 = 1;
            } else if (ordinal != 3) {
                i2 = 2;
            }
            this.c = i2;
            return;
        }
        StringBuilder sb2 = new StringBuilder(37);
        sb2.append("Unsupported color format: ");
        sb2.append(i);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static long b(long j) {
        return TimeUnit.MICROSECONDS.convert(j, TimeUnit.MILLISECONDS);
    }

    public static long c(long j) {
        return TimeUnit.MILLISECONDS.convert(j, TimeUnit.MICROSECONDS);
    }

    private static final boolean p(int i) {
        int[] iArr = axie.b;
        int length = iArr.length;
        for (int i2 = 0; i2 < 7; i2++) {
            if (iArr[i2] == i) {
                return true;
            }
        }
        return false;
    }

    public final int a() {
        i();
        try {
            return this.E.a(b(500L));
        } catch (IllegalStateException e) {
            Logging.c("IMCVideoDecoder", "dequeueInputBuffer failed", e);
            return -2;
        }
    }

    @Override // org.webrtc.VideoDecoder
    public final /* synthetic */ long createNativeVideoDecoder() {
        return 0L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x0526, code lost:
        r2 = r27.K;
        r3 = new java.lang.StringBuilder(39);
        r3.append("Non supported color format: ");
        r3.append(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x053e, code lost:
        throw new java.lang.IllegalStateException(r3.toString());
     */
    /* JADX WARN: Removed duplicated region for block: B:135:0x04ee A[Catch: IllegalStateException -> 0x05d5, TryCatch #0 {IllegalStateException -> 0x05d5, blocks: (B:11:0x001a, B:12:0x001d, B:103:0x03ff, B:105:0x0419, B:107:0x0424, B:109:0x0432, B:111:0x043a, B:113:0x0442, B:115:0x044a, B:118:0x0466, B:126:0x0485, B:128:0x0489, B:131:0x04bf, B:133:0x04e8, B:135:0x04ee, B:137:0x04f6, B:139:0x0510, B:141:0x051a, B:144:0x0526, B:145:0x053e, B:140:0x0515, B:146:0x053f, B:148:0x0547, B:149:0x054f, B:151:0x0557, B:152:0x055f, B:130:0x048d, B:132:0x04c4, B:122:0x0474, B:106:0x041e, B:153:0x05a7, B:155:0x05cc), top: B:160:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0510 A[Catch: IllegalStateException -> 0x05d5, TryCatch #0 {IllegalStateException -> 0x05d5, blocks: (B:11:0x001a, B:12:0x001d, B:103:0x03ff, B:105:0x0419, B:107:0x0424, B:109:0x0432, B:111:0x043a, B:113:0x0442, B:115:0x044a, B:118:0x0466, B:126:0x0485, B:128:0x0489, B:131:0x04bf, B:133:0x04e8, B:135:0x04ee, B:137:0x04f6, B:139:0x0510, B:141:0x051a, B:144:0x0526, B:145:0x053e, B:140:0x0515, B:146:0x053f, B:148:0x0547, B:149:0x054f, B:151:0x0557, B:152:0x055f, B:130:0x048d, B:132:0x04c4, B:122:0x0474, B:106:0x041e, B:153:0x05a7, B:155:0x05cc), top: B:160:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0515 A[Catch: IllegalStateException -> 0x05d5, TryCatch #0 {IllegalStateException -> 0x05d5, blocks: (B:11:0x001a, B:12:0x001d, B:103:0x03ff, B:105:0x0419, B:107:0x0424, B:109:0x0432, B:111:0x043a, B:113:0x0442, B:115:0x044a, B:118:0x0466, B:126:0x0485, B:128:0x0489, B:131:0x04bf, B:133:0x04e8, B:135:0x04ee, B:137:0x04f6, B:139:0x0510, B:141:0x051a, B:144:0x0526, B:145:0x053e, B:140:0x0515, B:146:0x053f, B:148:0x0547, B:149:0x054f, B:151:0x0557, B:152:0x055f, B:130:0x048d, B:132:0x04c4, B:122:0x0474, B:106:0x041e, B:153:0x05a7, B:155:0x05cc), top: B:160:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0547 A[Catch: IllegalStateException -> 0x05d5, TryCatch #0 {IllegalStateException -> 0x05d5, blocks: (B:11:0x001a, B:12:0x001d, B:103:0x03ff, B:105:0x0419, B:107:0x0424, B:109:0x0432, B:111:0x043a, B:113:0x0442, B:115:0x044a, B:118:0x0466, B:126:0x0485, B:128:0x0489, B:131:0x04bf, B:133:0x04e8, B:135:0x04ee, B:137:0x04f6, B:139:0x0510, B:141:0x051a, B:144:0x0526, B:145:0x053e, B:140:0x0515, B:146:0x053f, B:148:0x0547, B:149:0x054f, B:151:0x0557, B:152:0x055f, B:130:0x048d, B:132:0x04c4, B:122:0x0474, B:106:0x041e, B:153:0x05a7, B:155:0x05cc), top: B:160:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0557 A[Catch: IllegalStateException -> 0x05d5, TryCatch #0 {IllegalStateException -> 0x05d5, blocks: (B:11:0x001a, B:12:0x001d, B:103:0x03ff, B:105:0x0419, B:107:0x0424, B:109:0x0432, B:111:0x043a, B:113:0x0442, B:115:0x044a, B:118:0x0466, B:126:0x0485, B:128:0x0489, B:131:0x04bf, B:133:0x04e8, B:135:0x04ee, B:137:0x04f6, B:139:0x0510, B:141:0x051a, B:144:0x0526, B:145:0x053e, B:140:0x0515, B:146:0x053f, B:148:0x0547, B:149:0x054f, B:151:0x0557, B:152:0x055f, B:130:0x048d, B:132:0x04c4, B:122:0x0474, B:106:0x041e, B:153:0x05a7, B:155:0x05cc), top: B:160:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0526 A[EDGE_INSN: B:166:0x0526->B:144:0x0526 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.webrtc.VideoCodecStatus d(long r28) {
        /*
            Method dump skipped, instructions count: 1506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axhn.d(long):org.webrtc.VideoCodecStatus");
    }

    @Override // org.webrtc.VideoDecoder
    public final VideoCodecStatus decode(final EncodedImage encodedImage, VideoDecoder.DecodeInfo decodeInfo) {
        this.H.a();
        ByteBuffer byteBuffer = encodedImage.b;
        if (byteBuffer == null) {
            Logging.b("IMCVideoDecoder", "decode() - no input data");
            return VideoCodecStatus.ERR_PARAMETER;
        } else if (byteBuffer.remaining() == 0) {
            Logging.b("IMCVideoDecoder", "decode() - input buffer empty");
            return VideoCodecStatus.ERR_PARAMETER;
        } else if (!this.I) {
            Logging.b("IMCVideoDecoder", "decode() - not initialized");
            return VideoCodecStatus.UNINITIALIZED;
        } else {
            VideoCodecStatus e = e(new Callable() { // from class: axhh
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    VideoCodecStatus f;
                    axhn axhnVar = axhn.this;
                    EncodedImage encodedImage2 = encodedImage;
                    axhnVar.i();
                    axif axifVar = axhnVar.E;
                    if (axifVar == null || axhnVar.w == null) {
                        String valueOf = String.valueOf(axifVar);
                        String valueOf2 = String.valueOf(axhnVar.w);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 41 + String.valueOf(valueOf2).length());
                        sb.append("decode uninitialized, codec: ");
                        sb.append(valueOf);
                        sb.append(", callback: ");
                        sb.append(valueOf2);
                        Logging.d("IMCVideoDecoder", sb.toString());
                        return VideoCodecStatus.UNINITIALIZED;
                    } else if (!axhnVar.f) {
                        Logging.d("IMCVideoDecoder", "decodeInternal: Decoder is not running.");
                        return VideoCodecStatus.OK;
                    } else if (axhnVar.r != VideoCodecStatus.OK) {
                        String valueOf3 = String.valueOf(axhnVar.r);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf3).length() + 34);
                        sb2.append("decodeInternal: Poll loop not OK: ");
                        sb2.append(valueOf3);
                        Logging.b("IMCVideoDecoder", sb2.toString());
                        return axhnVar.r;
                    } else {
                        int i = encodedImage2.c;
                        int i2 = encodedImage2.d;
                        if (i * i2 > 0 && (i != axhnVar.j || i2 != axhnVar.k)) {
                            Logging.a("IMCVideoDecoder", String.format(Locale.ENGLISH, "Input resolution changed from %s x %s to %s x %s", Integer.valueOf(axhnVar.j), Integer.valueOf(axhnVar.k), Integer.valueOf(encodedImage2.c), Integer.valueOf(encodedImage2.d)));
                            VideoCodecStatus videoCodecStatus = VideoCodecStatus.OK;
                            if (!axhnVar.o()) {
                                int i3 = encodedImage2.c;
                                int i4 = encodedImage2.d;
                                axhnVar.i();
                                VideoCodecStatus h = axhnVar.h();
                                videoCodecStatus = h != VideoCodecStatus.OK ? h : axhnVar.g(i3, i4);
                            } else if (axhnVar.d) {
                                Logging.a("IMCVideoDecoder", "Ignore resolution change - expect INFO_OUTPUT_FORMAT_CHANGED");
                            } else {
                                int i5 = encodedImage2.c;
                                int i6 = encodedImage2.d;
                                axhnVar.i();
                                StringBuilder sb3 = new StringBuilder(43);
                                sb3.append("softReinitDecode: ");
                                sb3.append(i5);
                                sb3.append(" x ");
                                sb3.append(i6);
                                Logging.a("IMCVideoDecoder", sb3.toString());
                                axhnVar.f = false;
                                axhnVar.l.b();
                                try {
                                    axhnVar.E.a.flush();
                                    axhnVar.j = i5;
                                    axhnVar.k = i6;
                                    axhnVar.k();
                                    axhnVar.f = true;
                                    Logging.a("IMCVideoDecoder", "softReinitDecode done.");
                                    videoCodecStatus = VideoCodecStatus.OK;
                                } catch (IllegalStateException e2) {
                                    Logging.c("IMCVideoDecoder", "codec.flush failed", e2);
                                    videoCodecStatus = VideoCodecStatus.FALLBACK_SOFTWARE;
                                }
                            }
                            if (videoCodecStatus != VideoCodecStatus.OK) {
                                Logging.b("IMCVideoDecoder", "reinitDecode fails");
                                return videoCodecStatus;
                            }
                        }
                        if (!axhnVar.m || encodedImage2.f == EncodedImage.FrameType.VideoFrameKey) {
                            long j = 0;
                            if (axhnVar.n > axhnVar.o + axhnVar.c) {
                                if (axhnVar.a == axgq.H264 || axhnVar.a == axgq.H265X) {
                                    int i7 = axhnVar.n;
                                    int i8 = axhnVar.o;
                                    StringBuilder sb4 = new StringBuilder(84);
                                    sb4.append("Decoder is too far behind. Try to drain. Received: ");
                                    sb4.append(i7);
                                    sb4.append(". Decoded: ");
                                    sb4.append(i8);
                                    Logging.d("IMCVideoDecoder", sb4.toString());
                                    axhnVar.j();
                                }
                                long elapsedRealtime = SystemClock.elapsedRealtime();
                                while (true) {
                                    if (SystemClock.elapsedRealtime() - elapsedRealtime < 1000) {
                                        f = axhnVar.d(j);
                                        if (f != VideoCodecStatus.OK) {
                                            int i9 = axhnVar.n;
                                            int i10 = axhnVar.o;
                                            StringBuilder sb5 = new StringBuilder(86);
                                            sb5.append("DeliverPendingOutputs error. Frames received: ");
                                            sb5.append(i9);
                                            sb5.append(". Frames decoded: ");
                                            sb5.append(i10);
                                            Logging.b("IMCVideoDecoder", sb5.toString());
                                            break;
                                        }
                                        if (axhnVar.o()) {
                                            axhnVar.m();
                                        }
                                        if (axhnVar.n <= axhnVar.o + axhnVar.c) {
                                            f = VideoCodecStatus.OK;
                                            break;
                                        }
                                        try {
                                            Thread.sleep(10L);
                                            j = 0;
                                        } catch (InterruptedException e3) {
                                            Logging.c("IMCVideoDecoder", "Interrupted while draining decoder.", e3);
                                            f = VideoCodecStatus.ERROR;
                                        }
                                    } else {
                                        int i11 = axhnVar.n;
                                        int i12 = axhnVar.o;
                                        StringBuilder sb6 = new StringBuilder(88);
                                        sb6.append("Output buffer dequeue timeout. Frames received: ");
                                        sb6.append(i11);
                                        sb6.append(". Frames decoded: ");
                                        sb6.append(i12);
                                        Logging.b("IMCVideoDecoder", sb6.toString());
                                        f = axhnVar.f();
                                        break;
                                    }
                                }
                                if (f != VideoCodecStatus.OK) {
                                    return f;
                                }
                            }
                            int a = axhnVar.a();
                            if (a < 0) {
                                int i13 = axhnVar.n;
                                int i14 = axhnVar.o;
                                StringBuilder sb7 = new StringBuilder(99);
                                sb7.append("Input buffers are not available. Try to deliver output. Received: ");
                                sb7.append(i13);
                                sb7.append(". Decoded: ");
                                sb7.append(i14);
                                Logging.d("IMCVideoDecoder", sb7.toString());
                                if (axhnVar.d(axhn.b(10L)) != VideoCodecStatus.OK) {
                                    int i15 = axhnVar.n;
                                    int i16 = axhnVar.o;
                                    StringBuilder sb8 = new StringBuilder(86);
                                    sb8.append("DeliverPendingOutputs error. Frames received: ");
                                    sb8.append(i15);
                                    sb8.append(". Frames decoded: ");
                                    sb8.append(i16);
                                    Logging.b("IMCVideoDecoder", sb8.toString());
                                    return axhnVar.f();
                                }
                                a = axhnVar.a();
                                if (a < 0) {
                                    Logging.b("IMCVideoDecoder", "decode() - no HW input buffers available");
                                    return axhnVar.f();
                                }
                            }
                            int remaining = encodedImage2.b.remaining();
                            ByteBuffer byteBuffer2 = axhnVar.s[a];
                            if (byteBuffer2.capacity() < remaining) {
                                int capacity = byteBuffer2.capacity();
                                StringBuilder sb9 = new StringBuilder(68);
                                sb9.append("HW buffer too small. Buffer size ");
                                sb9.append(capacity);
                                sb9.append(". Frame size ");
                                sb9.append(remaining);
                                Logging.b("IMCVideoDecoder", sb9.toString());
                                return axhnVar.f();
                            }
                            byteBuffer2.rewind();
                            byteBuffer2.put(encodedImage2.b);
                            long micros = (axhnVar.n * TimeUnit.SECONDS.toMicros(1L)) / 30;
                            if (axhnVar.p <= axhnVar.q) {
                                Locale locale = Locale.ENGLISH;
                                Object[] objArr = new Object[4];
                                objArr[0] = Integer.valueOf(axhnVar.n);
                                objArr[1] = Boolean.valueOf(encodedImage2.f == EncodedImage.FrameType.VideoFrameKey);
                                objArr[2] = Long.valueOf(axhn.c(micros));
                                objArr[3] = Integer.valueOf(remaining);
                                Logging.a("IMCVideoDecoder", String.format(locale, "Decoder frame in # %s. Key: %s. TS: %s. Size: %s", objArr));
                            }
                            axhnVar.n++;
                            axhnVar.z += remaining;
                            try {
                                axhnVar.E.k(a, remaining, micros);
                                axha axhaVar = axhnVar.i;
                                axhnVar.g.offer(new axhk(SystemClock.elapsedRealtime(), encodedImage2.e, encodedImage2.g, axhaVar != null ? axhaVar.a(encodedImage2.b).a : null));
                                axhnVar.m = false;
                                if (axhnVar.n > axhnVar.o) {
                                    axhnVar.l.a(10L);
                                }
                                return axhnVar.d(0L);
                            } catch (IllegalStateException e4) {
                                Logging.c("IMCVideoDecoder", "queueInputBuffer failed", e4);
                                return axhnVar.f();
                            }
                        }
                        Logging.b("IMCVideoDecoder", "decode() - key frame required first");
                        return VideoCodecStatus.NO_OUTPUT;
                    }
                }
            }, "decoder.decode");
            VideoCodecStatus videoCodecStatus = VideoCodecStatus.REQUEST_SLI;
            return e;
        }
    }

    protected final VideoCodecStatus e(Callable callable, String str) {
        return axij.e(this.e, callable, str);
    }

    public final VideoCodecStatus f() {
        i();
        int i = this.Q + 1;
        this.Q = i;
        StringBuilder sb = new StringBuilder(21);
        sb.append("HW error #");
        sb.append(i);
        Logging.b("IMCVideoDecoder", sb.toString());
        if (this.Q <= 3) {
            return VideoCodecStatus.ERROR;
        }
        return VideoCodecStatus.FALLBACK_SOFTWARE;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008e A[Catch: Exception -> 0x00ee, TryCatch #0 {Exception -> 0x00ee, blocks: (B:19:0x0084, B:21:0x008e, B:23:0x0097, B:24:0x009a), top: B:37:0x0084 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0097 A[Catch: Exception -> 0x00ee, TryCatch #0 {Exception -> 0x00ee, blocks: (B:19:0x0084, B:21:0x008e, B:23:0x0097, B:24:0x009a), top: B:37:0x0084 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.webrtc.VideoCodecStatus g(int r9, int r10) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axhn.g(int, int):org.webrtc.VideoCodecStatus");
    }

    @Override // org.webrtc.VideoDecoder
    public final String getImplementationName() {
        String valueOf = String.valueOf(this.F);
        return valueOf.length() != 0 ? "IMC: ".concat(valueOf) : new String("IMC: ");
    }

    public final VideoCodecStatus h() {
        i();
        if (!this.f) {
            Logging.a("IMCVideoDecoder", "stopDecodeInternal: Decoder is not running.");
            return VideoCodecStatus.OK;
        }
        Logging.a("IMCVideoDecoder", String.format(Locale.ENGLISH, "stopDecodeInternal. Frames received: %s. Frames decoded: %s. Frames delivered: %s. Decoded frames dropped: %s", Integer.valueOf(this.n), Integer.valueOf(this.o), Integer.valueOf(this.p), Integer.valueOf(this.P)));
        VideoCodecStatus videoCodecStatus = VideoCodecStatus.OK;
        this.f = false;
        this.l.b();
        this.N.b();
        i();
        synchronized (this.C) {
            while (this.D > 0) {
                Logging.a("IMCVideoDecoder", "Waiting for all frames to be released.");
                try {
                    this.C.wait();
                } catch (InterruptedException e) {
                    Logging.c("IMCVideoDecoder", "Interrupted while waiting for output buffers to be released.", e);
                }
            }
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final Exception[] excArr = new Exception[1];
        new Thread(new Runnable() { // from class: axhf
            @Override // java.lang.Runnable
            public final void run() {
                axhn axhnVar = axhn.this;
                Exception[] excArr2 = excArr;
                CountDownLatch countDownLatch2 = countDownLatch;
                try {
                    Logging.a("IMCVideoDecoder", "MediaCodec release on release thread");
                    axhnVar.E.g();
                    axhnVar.E.c();
                    Logging.a("IMCVideoDecoder", "MediaCodec release on release thread done");
                } catch (Exception e2) {
                    Logging.c("IMCVideoDecoder", "MediaCodec release failed", e2);
                    excArr2[0] = e2;
                }
                countDownLatch2.countDown();
            }
        }, "IMCVideoDecoder.release").start();
        try {
            if (!countDownLatch.await(5000L, TimeUnit.MILLISECONDS)) {
                Logging.b("IMCVideoDecoder", "Media decoder release timeout");
                videoCodecStatus = VideoCodecStatus.ERROR;
            }
            Exception exc = excArr[0];
            if (exc != null) {
                Logging.c("IMCVideoDecoder", "Media encoder release error", exc);
                videoCodecStatus = VideoCodecStatus.ERROR;
            }
            if (o()) {
                this.v.a();
            }
            this.g.clear();
            this.h.clear();
            this.E = null;
            Logging.a("IMCVideoDecoder", "stopDecodeInternal done");
            return videoCodecStatus;
        } catch (InterruptedException e2) {
            Logging.c("IMCVideoDecoder", "Interrupted", e2);
            Thread.currentThread().interrupt();
            return VideoCodecStatus.ERROR;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void i() {
        if (this.f132J.isCurrentThread()) {
            return;
        }
        throw new AssertionError("Not called on the codec thread.");
    }

    @Override // org.webrtc.VideoDecoder
    public final VideoCodecStatus initDecode(final VideoDecoder.Settings settings, final VideoDecoder.Callback callback) {
        this.H = new baoz();
        Logging.a("IMCVideoDecoder", String.format(Locale.ENGLISH, "initDecode: %s: %s x %s. Color: 0x%X. Use surface: %s. Max pending frames: %s.", this.a, Integer.valueOf(settings.a), Integer.valueOf(settings.b), Integer.valueOf(this.K), Boolean.valueOf(o()), Integer.valueOf(this.c)));
        if (this.I) {
            Logging.b("IMCVideoDecoder", "initDecode called without releasing previous decoder");
            return VideoCodecStatus.ERROR;
        }
        if (!o()) {
            Logging.b("IMCVideoDecoder", "No shared EglBase.Context. Decoders will not use texture mode.");
            if (this.K == 0) {
                Logging.b("IMCVideoDecoder", "Color format is not recognized. Only surface decoding is supported.");
                return VideoCodecStatus.ERROR;
            }
        }
        if (this.f132J != null) {
            try {
                Logging.a("IMCVideoDecoder", "codecThread join");
                this.f132J.getThread().join();
                Logging.a("IMCVideoDecoder", "codecThread join done");
            } catch (InterruptedException unused) {
                Logging.b("IMCVideoDecoder", "Interrupted while waiting for old codec to stop.");
                return VideoCodecStatus.ERROR;
            }
        }
        HandlerThread handlerThread = new HandlerThread("IMCVideoDecoder");
        handlerThread.start();
        this.f132J = handlerThread.getLooper();
        this.e = new Handler(this.f132J);
        this.l = new axin(this.e, new axhd(this, 1));
        this.N = new axin(this.e, new axhd(this));
        VideoCodecStatus e = e(new Callable() { // from class: axhi
            @Override // java.util.concurrent.Callable
            public final Object call() {
                axhn axhnVar = axhn.this;
                VideoDecoder.Settings settings2 = settings;
                VideoDecoder.Callback callback2 = callback;
                int i = settings2.a;
                int i2 = settings2.b;
                boolean o = axhnVar.o();
                StringBuilder sb = new StringBuilder(37);
                sb.append("initDecodeInternal. useSurface: ");
                sb.append(o);
                Logging.a("IMCVideoDecoder", sb.toString());
                axhnVar.i();
                axhnVar.i = axie.a(axhnVar.a);
                axhnVar.w = callback2;
                if (axhnVar.o()) {
                    Logging.a("IMCVideoDecoder", "Create SurfaceTextureHelper");
                    bapm bapmVar = new bapm();
                    HandlerThread handlerThread2 = new HandlerThread("decoder-texture-thread");
                    handlerThread2.start();
                    Handler handler = new Handler(handlerThread2.getLooper());
                    axhnVar.t = (baom) bapa.b(handler, new baok((bamm) ((amqr) axhnVar.b).a, handler, bapmVar));
                    axhnVar.u = new Surface(axhnVar.t.b);
                    axhnVar.v = new axhl(axhnVar, axhnVar.t);
                    baom baomVar = axhnVar.t;
                    axhl axhlVar = axhnVar.v;
                    if (baomVar.c != null || baomVar.j != null) {
                        throw new IllegalStateException("SurfaceTextureHelper listener has already been set.");
                    }
                    baomVar.j = axhlVar;
                    baomVar.a.post(baomVar.k);
                }
                return axhnVar.g(i, i2);
            }
        }, "decoder.init");
        if (e == VideoCodecStatus.OK) {
            this.I = true;
        } else {
            this.f132J.quit();
        }
        String valueOf = String.valueOf(e);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 17);
        sb.append("initDecode done: ");
        sb.append(valueOf);
        Logging.a("IMCVideoDecoder", sb.toString());
        return e;
    }

    public final void j() {
        this.q = Math.max(this.p + 1, 15);
    }

    public final void k() {
        this.L = this.j;
        this.M = this.k;
        this.O = false;
        this.m = true;
        this.n = 0;
        this.o = 0;
        this.p = 0;
        this.P = 0;
        this.q = 15;
        this.g.clear();
        this.h.clear();
        if (o()) {
            this.v.a();
        }
        this.r = VideoCodecStatus.OK;
        l();
    }

    public final void l() {
        this.x = SystemClock.elapsedRealtime();
        this.y = this.p;
        this.z = 0;
        this.A = 0L;
        this.B = 0L;
    }

    public final boolean m() {
        axhm axhmVar;
        i();
        if (!this.f) {
            return false;
        }
        axhl axhlVar = this.v;
        synchronized (axhlVar.a) {
            axhmVar = null;
            if (axhlVar.e == 3) {
                axhlVar.e = 1;
                VideoFrame videoFrame = axhlVar.c;
                axhlVar.c = null;
                axhj axhjVar = axhlVar.b;
                axhmVar = new axhm(videoFrame, (int) Math.min(200L, axhjVar.e - axhjVar.f.a), axhlVar.b.f);
            }
        }
        if (axhmVar != null) {
            this.p++;
            this.A += axhmVar.b;
            this.B += SystemClock.elapsedRealtime() - axhmVar.c.a;
            this.w.a(axhmVar.a, Integer.valueOf(axhmVar.b), axhmVar.c.d);
            axhmVar.a.release();
            if (this.h.size() > 0) {
                return this.v.b();
            }
        }
        return false;
    }

    public final boolean n(int i, boolean z) {
        try {
            this.E.d(i, z);
            return true;
        } catch (IllegalStateException e) {
            Logging.c("IMCVideoDecoder", "releaseOutputBuffer failed", e);
            return false;
        }
    }

    public final boolean o() {
        amqo amqoVar = this.b;
        return (amqoVar == null || ((amqr) amqoVar).a == null) ? false : true;
    }

    @Override // org.webrtc.VideoDecoder
    public final VideoCodecStatus release() {
        Logging.a("IMCVideoDecoder", "release");
        if (!this.I) {
            Logging.d("IMCVideoDecoder", "Calling release for non initialized codec");
            return VideoCodecStatus.OK;
        }
        VideoCodecStatus e = e(new Callable() { // from class: axhg
            @Override // java.util.concurrent.Callable
            public final Object call() {
                axhn axhnVar = axhn.this;
                axhnVar.i();
                if (!axhnVar.f) {
                    Logging.a("IMCVideoDecoder", "release: Decoder is not running.");
                    return VideoCodecStatus.OK;
                }
                VideoCodecStatus h = axhnVar.h();
                if (axhnVar.o()) {
                    if (axhnVar.u != null) {
                        Logging.a("IMCVideoDecoder", "Release Surface");
                        axhnVar.u.release();
                        axhnVar.u = null;
                    }
                    if (axhnVar.t != null) {
                        Logging.a("IMCVideoDecoder", "Release surfaceTextureHelper");
                        baom baomVar = axhnVar.t;
                        Logging.a("SurfaceTextureHelper", "stopListening()");
                        baomVar.a.removeCallbacks(baomVar.k);
                        bapa.e(baomVar.a, new baoh(baomVar, 2));
                        axhnVar.v.a();
                        baom baomVar2 = axhnVar.t;
                        Logging.a("SurfaceTextureHelper", "dispose()");
                        bapa.e(baomVar2.a, new baoh(baomVar2, 1));
                        axhnVar.t = null;
                        axhnVar.v = null;
                    }
                }
                axha axhaVar = axhnVar.i;
                if (axhaVar != null) {
                    axhaVar.b();
                    axhnVar.i = null;
                }
                axhnVar.w = null;
                return h;
            }
        }, "decoder.release");
        this.f132J.quit();
        this.I = false;
        Logging.a("IMCVideoDecoder", "release done");
        return e;
    }
}
