package defpackage;

import android.content.Context;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLExt;
import android.os.Handler;
import android.os.Looper;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: zlp  reason: default package */
/* loaded from: classes4.dex */
public final class zlp implements Runnable, vqt, zla {
    long B;
    public long C;
    public long D;
    long E;
    long F;
    public long G;
    public long H;
    public int I;

    /* renamed from: J  reason: collision with root package name */
    public int f273J;
    public znb K;
    public final boolean L;
    public zln M;
    public zlo N;
    public int O;
    public final boolean P;
    public vtf Q;
    public zkz R;
    public gwy S;
    private final int T;
    private final vrp U;
    private final boolean V;
    private final EGLContext W;
    private vqv X;
    private final int Y;
    public vqu b;
    vqu c;
    public pmm d;
    public zlb e;
    public boolean g;
    public int h;
    public int i;
    public MediaFormat j;
    public MediaFormat k;
    public vqx l;
    public final int o;
    public final int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public float u;
    public Thread w;
    public Handler x;
    Looper y;
    public boolean z;
    public int a = 0;
    public boolean m = false;
    public float v = 1.0f;
    public boolean A = false;
    public final Object f = new Object();
    public final Object n = new Object();

    public zlp(EGLContext eGLContext, vrp vrpVar, boolean z, int i, int i2, int i3, int i4, Context context, boolean z2, boolean z3) {
        this.W = eGLContext;
        this.U = vrpVar;
        this.L = z;
        this.o = i;
        this.p = i2;
        this.T = i3;
        this.Y = i4;
        this.V = z2;
        this.P = z3;
        if (context == null || !z2 || ake.c(context, "android.permission.RECORD_AUDIO") != 0) {
            return;
        }
        l();
    }

    public static boolean i(float f) {
        return Math.abs(f + (-1.0f)) >= 0.01f;
    }

    private final void l() {
        boolean z = true;
        aqxo.y(this.e == null);
        int i = this.Y;
        if (i <= 0 || i > 2) {
            z = false;
        }
        aqxo.y(z);
        zlb zlbVar = new zlb(this.Y);
        this.e = zlbVar;
        zlbVar.a = this;
        zlbVar.c();
    }

    public final long a() {
        if (this.B < 0) {
            return 0L;
        }
        long nanos = TimeUnit.SECONDS.toNanos(1L);
        return TimeUnit.NANOSECONDS.toMillis(((float) ((this.E - this.B) + (((float) nanos) / this.u))) / this.v);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        vqv vqvVar = this.X;
        long j = this.E;
        long j2 = this.B;
        EGLExt.eglPresentationTimeANDROID(vqvVar.b, vqvVar.d, ((float) (j - j2)) / this.v);
        vqv vqvVar2 = this.X;
        EGL14.eglSwapBuffers(vqvVar2.b, vqvVar2.d);
        this.F = this.E;
    }

    public final synchronized void c(int i) {
        this.O = i;
        if (!this.A || (this.z && this.a < 4)) {
            return;
        }
        this.z = true;
        if (this.a < 4) {
            return;
        }
        this.A = false;
        zln zlnVar = this.M;
        if (zlnVar != null) {
            ((gxk) zlnVar).as.execute(new gwq((gxk) zlnVar, 1));
        }
        d();
    }

    public final void d() {
        this.A = false;
        synchronized (this) {
            h(1);
            this.x.post(new Runnable() { // from class: zll
                @Override // java.lang.Runnable
                public final void run() {
                    zlp zlpVar = zlp.this;
                    if (zlpVar.E > zlpVar.F && !zlpVar.j(zlpVar.a())) {
                        zlpVar.b();
                    }
                    zlpVar.y.quit();
                }
            });
        }
    }

    public final void e() {
        synchronized (this.n) {
            this.m = false;
            this.n.notify();
        }
    }

    public final void f(int i) {
        synchronized (this) {
            this.a = i;
            notifyAll();
        }
    }

    public final void g() {
        f(this.C > 0 ? 3 : 4);
    }

    public final void h(int i) {
        synchronized (this) {
            while (this.a < i) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    public final boolean j(long j) {
        long j2 = this.D;
        return j2 != 0 && j >= j2;
    }

    public final boolean k() {
        int i;
        return this.A && ((i = this.a) == 3 || i == 4);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Looper.prepare();
        synchronized (this) {
            this.x = new Handler();
            this.y = Looper.myLooper();
            f(1);
        }
        this.g = false;
        vru a = this.U.a("video/avc", true);
        if (a != null) {
            int i = this.s;
            int i2 = this.t;
            float f = this.u;
            int i3 = this.T;
            MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", i, i2);
            createVideoFormat.setInteger("color-format", 2130708361);
            createVideoFormat.setInteger("bitrate", i3);
            createVideoFormat.setFloat("frame-rate", f);
            createVideoFormat.setInteger("i-frame-interval", 2);
            this.h = -1;
            this.j = null;
            vqu vquVar = new vqu(a, createVideoFormat);
            this.b = vquVar;
            vquVar.a = this;
            vru a2 = this.U.a("audio/mp4a-latm", true);
            if (a2 != null) {
                this.i = -1;
                this.k = null;
                MediaFormat createAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", 44100, this.Y);
                createAudioFormat.setInteger("bitrate", 128000);
                createAudioFormat.setInteger("max-input-size", 20000);
                vqu vquVar2 = new vqu(a2, createAudioFormat);
                this.c = vquVar2;
                vquVar2.a = this;
                if (i(this.v)) {
                    pmm pmmVar = new pmm();
                    this.d = pmmVar;
                    pmmVar.a(this.v);
                    try {
                        this.d.j(new pkw(44100, this.Y, 2));
                    } catch (pkx unused) {
                        zep.c("SonicAudioProcessor UnhandledAudioFormatException", "The input audio format has to be C.ENCODING_PCM_16BIT.");
                    }
                    this.d.l();
                }
                vqv vqvVar = new vqv(this.W, this.b.c.a.createInputSurface());
                this.X = vqvVar;
                vqvVar.a();
                this.l = new vqx();
                try {
                    vtf vtfVar = new vtf(new MediaMuxer(this.R.a.toString(), 0));
                    this.Q = vtfVar;
                    int i4 = (this.q + this.r) % 360;
                    if (i4 >= 180) {
                        vtfVar.b((i4 + 180) % 360);
                    } else {
                        vtfVar.b(i4);
                    }
                    this.b.d();
                    this.c.d();
                    this.B = -1L;
                    this.E = -1L;
                    this.H = 0L;
                    if (this.e == null) {
                        l();
                    }
                    synchronized (this) {
                        f(2);
                        zln zlnVar = this.M;
                        if (zlnVar != null) {
                            if (((gxk) zlnVar).al.a() != null) {
                                ((gxk) zlnVar).as.execute(new gwq((gxk) zlnVar));
                            } else {
                                ((gxk) zlnVar).aA.z();
                            }
                        } else {
                            g();
                        }
                        if (this.z) {
                            c(0);
                        }
                    }
                    Looper.loop();
                    f(5);
                    synchronized (this.f) {
                        this.f.notifyAll();
                    }
                    this.x.removeCallbacksAndMessages(null);
                    e();
                    this.e.d();
                    if (i(this.v)) {
                        this.d.m();
                        while (!this.d.p()) {
                            long a3 = this.e.a(this.H);
                            ByteBuffer k = this.d.k();
                            int limit = k.limit();
                            this.c.b(k, limit, a3);
                            this.H += limit;
                        }
                    }
                    long a4 = this.e.a(this.H);
                    if (this.V) {
                        this.e.c();
                    } else {
                        this.e.b();
                        this.e = null;
                    }
                    synchronized (this.f) {
                        if (this.g) {
                            vqu vquVar3 = this.c;
                            vquVar3.c.j(vquVar3.c.a(-1L), 0, a4, 4);
                        }
                    }
                    synchronized (this.f) {
                        if (this.g) {
                            this.b.c.a.signalEndOfInputStream();
                            while (true) {
                                vqu vquVar4 = this.b;
                                if (vquVar4.b == 2 || this.c.b == 2) {
                                    vquVar4.a(10000L);
                                    this.c.a(10000L);
                                } else {
                                    try {
                                        break;
                                    } catch (IOException | IllegalStateException e) {
                                        zep.d("Failed to stop media muxer.", e);
                                    }
                                }
                            }
                            this.Q.a.stop();
                        }
                        try {
                            this.Q.a.release();
                        } catch (IllegalStateException e2) {
                            zep.d("Failed to release media muxer.", e2);
                        }
                        this.Q = null;
                    }
                    this.b.e();
                    this.b.c();
                    this.b = null;
                    this.c.e();
                    this.c.c();
                    this.c = null;
                    vqv vqvVar2 = this.X;
                    if (vqvVar2 != null) {
                        vqvVar2.a();
                        this.l.b();
                        vqv vqvVar3 = this.X;
                        if (vqvVar3.b != EGL14.EGL_NO_DISPLAY) {
                            EGL14.eglMakeCurrent(vqvVar3.b, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
                            EGL14.eglDestroySurface(vqvVar3.b, vqvVar3.d);
                            EGL14.eglDestroyContext(vqvVar3.b, vqvVar3.c);
                            EGL14.eglReleaseThread();
                            EGL14.eglTerminate(vqvVar3.b);
                        }
                        vqvVar3.b = EGL14.EGL_NO_DISPLAY;
                        vqvVar3.c = EGL14.EGL_NO_CONTEXT;
                        vqvVar3.d = EGL14.EGL_NO_SURFACE;
                        vqvVar3.a.release();
                    }
                    this.l = null;
                    this.X = null;
                    if (this.g) {
                        this.K = new znb(this.s, this.t, a(), this.v);
                    }
                    synchronized (this) {
                        this.x = null;
                        f(6);
                    }
                    zlo zloVar = this.N;
                    if (zloVar != null) {
                        zloVar.aM(this.K, this.O);
                        return;
                    } else {
                        zep.l("RecordingStoppedListener is null! Recording stopped and discarded.");
                        return;
                    }
                } catch (IOException e3) {
                    zep.b("Failed to create media muxer.");
                    throw new IllegalStateException(e3);
                }
            }
            throw new RuntimeException("Failed to create audio encoder.");
        }
        throw new IllegalStateException("Failed to create video encoder.");
    }
}
