package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.SurfaceHolder;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.webrtc.Logging;
import org.webrtc.VideoFrame;
/* compiled from: PG */
/* renamed from: baof  reason: default package */
/* loaded from: classes2.dex */
public final class baof extends banb implements SurfaceHolder.Callback {
    private boolean A;
    private int B;
    private int C;
    private int D;
    private baoc y;
    private final Object z;

    public baof(String str) {
        super(str);
        this.z = new Object();
    }

    private final void e(String str) {
        String str2 = this.a;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 2 + String.valueOf(str).length());
        sb.append(str2);
        sb.append(": ");
        sb.append(str);
        Logging.a("SurfaceEglRenderer", sb.toString());
    }

    public final void d(final bamm bammVar, baoc baocVar, final int[] iArr, baob baobVar) {
        bapa.d();
        this.y = baocVar;
        synchronized (this.z) {
            this.A = false;
            this.B = 0;
            this.C = 0;
            this.D = 0;
        }
        synchronized (this.b) {
            if (this.c != null) {
                throw new IllegalStateException(String.valueOf(this.a).concat("Already initialized"));
            }
            super.b("Initializing EglRenderer");
            this.i = baobVar;
            HandlerThread handlerThread = new HandlerThread(String.valueOf(this.a).concat("EglRenderer"));
            handlerThread.start();
            this.c = new bana(handlerThread.getLooper(), new bamv(this, 2, null));
            bapa.e(this.c, new Runnable() { // from class: bamu
                @Override // java.lang.Runnable
                public final void run() {
                    banb banbVar = banb.this;
                    bamm bammVar2 = bammVar;
                    int[] iArr2 = iArr;
                    banbVar.b("EglBase.create shared context");
                    banbVar.g = bamk.d(bammVar2, iArr2);
                }
            });
            this.c.post(this.x);
            super.a(System.nanoTime());
            this.c.postDelayed(this.w, TimeUnit.SECONDS.toMillis(4L));
        }
    }

    @Override // defpackage.banb, org.webrtc.VideoSink
    public final void onFrame(VideoFrame videoFrame) {
        final int i;
        VideoFrame videoFrame2;
        synchronized (this.z) {
            if (!this.A) {
                this.A = true;
                e("Reporting first rendered frame.");
            }
            if (this.B != videoFrame.b() || this.C != videoFrame.a() || this.D != videoFrame.getRotation()) {
                int width = videoFrame.getBuffer().getWidth();
                int height = videoFrame.getBuffer().getHeight();
                int rotation = videoFrame.getRotation();
                StringBuilder sb = new StringBuilder(87);
                sb.append("Reporting frame resolution changed to ");
                sb.append(width);
                sb.append("x");
                sb.append(height);
                sb.append(" with rotation ");
                sb.append(rotation);
                e(sb.toString());
                baoc baocVar = this.y;
                if (baocVar != null) {
                    final int width2 = videoFrame.getBuffer().getWidth();
                    int height2 = videoFrame.getBuffer().getHeight();
                    int rotation2 = videoFrame.getRotation();
                    if (rotation2 == 0) {
                        i = width2;
                    } else if (rotation2 == 180) {
                        i = width2;
                        rotation2 = 180;
                    } else {
                        i = height2;
                    }
                    if (rotation2 == 0 || rotation2 == 180) {
                        width2 = height2;
                    }
                    final baoo baooVar = (baoo) baocVar;
                    Runnable runnable = new Runnable() { // from class: baon
                        @Override // java.lang.Runnable
                        public final void run() {
                            baoo baooVar2 = baoo.this;
                            int i2 = i;
                            int i3 = width2;
                            baooVar2.b = i2;
                            baooVar2.c = i3;
                            baooVar2.a();
                            baooVar2.requestLayout();
                        }
                    };
                    if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                        runnable.run();
                    } else {
                        ((baoo) baocVar).post(runnable);
                    }
                }
                this.B = videoFrame.b();
                this.C = videoFrame.a();
                this.D = videoFrame.getRotation();
            }
        }
        synchronized (this.o) {
            this.p++;
        }
        synchronized (this.b) {
            if (this.c == null) {
                super.b("Dropping frame - Not initialized or already released.");
                return;
            }
            synchronized (this.k) {
                videoFrame2 = this.l;
                if (videoFrame2 != null) {
                    videoFrame2.release();
                }
                this.l = videoFrame;
                this.l.retain();
                this.c.post(new bamv(this, 1));
            }
            if (videoFrame2 == null) {
                return;
            }
            synchronized (this.o) {
                this.q++;
            }
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        bapa.d();
        StringBuilder sb = new StringBuilder(65);
        sb.append("surfaceChanged: format: ");
        sb.append(i);
        sb.append(" size: ");
        sb.append(i2);
        sb.append("x");
        sb.append(i3);
        e(sb.toString());
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        bapa.d();
        this.x.a(surfaceHolder.getSurface());
        bamw bamwVar = this.x;
        synchronized (this.b) {
            Handler handler = this.c;
            if (handler != null) {
                handler.post(bamwVar);
            }
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        bapa.d();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final Runnable runnable = new Runnable() { // from class: baoe
            @Override // java.lang.Runnable
            public final void run() {
                countDownLatch.countDown();
            }
        };
        this.x.a(null);
        synchronized (this.b) {
            Handler handler = this.c;
            if (handler != null) {
                handler.removeCallbacks(this.x);
                this.c.postAtFrontOfQueue(new Runnable() { // from class: bamt
                    @Override // java.lang.Runnable
                    public final void run() {
                        banb banbVar = banb.this;
                        Runnable runnable2 = runnable;
                        bams bamsVar = banbVar.g;
                        if (bamsVar != null) {
                            bamsVar.e();
                            banbVar.g.h();
                        }
                        runnable2.run();
                    }
                });
            } else {
                runnable.run();
            }
        }
        bapa.c(countDownLatch);
    }
}
