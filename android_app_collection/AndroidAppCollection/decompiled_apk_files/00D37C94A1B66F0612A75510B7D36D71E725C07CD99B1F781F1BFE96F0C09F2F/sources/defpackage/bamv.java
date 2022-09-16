package defpackage;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.os.Handler;
import java.nio.ByteBuffer;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import org.webrtc.Logging;
import org.webrtc.VideoFrame;
/* compiled from: PG */
/* renamed from: bamv  reason: default package */
/* loaded from: classes2.dex */
public final class bamv implements Runnable {
    final /* synthetic */ banb a;
    private final /* synthetic */ int b;

    public bamv(banb banbVar) {
        this.a = banbVar;
    }

    public /* synthetic */ bamv(banb banbVar, int i) {
        this.b = i;
        this.a = banbVar;
    }

    public bamv(banb banbVar, int i, byte[] bArr) {
        this.b = i;
        this.a = banbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j;
        float f;
        float f2;
        float f3;
        int i = this.b;
        if (i == 0) {
            banb banbVar = this.a;
            DecimalFormat decimalFormat = new DecimalFormat("#.0");
            long nanoTime = System.nanoTime();
            synchronized (banbVar.o) {
                try {
                    j = nanoTime - banbVar.s;
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    if (j > 0) {
                        long nanos = TimeUnit.SECONDS.toNanos(1L);
                        long millis = TimeUnit.NANOSECONDS.toMillis(j);
                        int i2 = banbVar.p;
                        int i3 = banbVar.q;
                        int i4 = banbVar.r;
                        String format = decimalFormat.format(((float) (banbVar.r * nanos)) / ((float) j));
                        String c = banb.c(banbVar.t, banbVar.r);
                        String c2 = banb.c(banbVar.u, banbVar.r);
                        StringBuilder sb = new StringBuilder(String.valueOf(format).length() + 173 + String.valueOf(c).length() + String.valueOf(c2).length());
                        sb.append("Duration: ");
                        sb.append(millis);
                        sb.append(" ms. Frames received: ");
                        sb.append(i2);
                        sb.append(". Dropped: ");
                        sb.append(i3);
                        sb.append(". Rendered: ");
                        sb.append(i4);
                        sb.append(". Render fps: ");
                        sb.append(format);
                        sb.append(". Average render time: ");
                        sb.append(c);
                        sb.append(". Average swapBuffer time: ");
                        sb.append(c2);
                        sb.append(".");
                        banbVar.b(sb.toString());
                        banbVar.a(nanoTime);
                    }
                    synchronized (this.a.b) {
                        banb banbVar2 = this.a;
                        Handler handler = banbVar2.c;
                        if (handler != null) {
                            handler.removeCallbacks(banbVar2.w);
                            banb banbVar3 = this.a;
                            banbVar3.c.postDelayed(banbVar3.w, TimeUnit.SECONDS.toMillis(4L));
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            }
        } else if (i != 1) {
            synchronized (this.a.b) {
                this.a.c = null;
            }
        } else {
            banb banbVar4 = this.a;
            synchronized (banbVar4.k) {
                VideoFrame videoFrame = banbVar4.l;
                if (videoFrame == null) {
                    return;
                }
                banbVar4.l = null;
                bams bamsVar = banbVar4.g;
                if (bamsVar == null || !bamsVar.k()) {
                    banbVar4.b("Dropping frame - No surface");
                    return;
                }
                synchronized (banbVar4.f) {
                }
                long nanoTime2 = System.nanoTime();
                float b = videoFrame.b() / videoFrame.a();
                synchronized (banbVar4.m) {
                    f = banbVar4.n;
                    if (f == 0.0f) {
                        f = b;
                    }
                }
                if (b > f) {
                    f3 = f / b;
                    f2 = 1.0f;
                } else {
                    f2 = b / f;
                    f3 = 1.0f;
                }
                banbVar4.j.reset();
                banbVar4.j.preTranslate(0.5f, 0.5f);
                banbVar4.j.preScale(1.0f, 1.0f);
                banbVar4.j.preScale(f3, f2);
                banbVar4.j.preTranslate(-0.5f, -0.5f);
                try {
                    GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                    GLES20.glClear(16384);
                    banbVar4.h.b(videoFrame, banbVar4.i, banbVar4.j, banbVar4.g.b(), banbVar4.g.a());
                    long nanoTime3 = System.nanoTime();
                    banbVar4.g.i();
                    long nanoTime4 = System.nanoTime();
                    synchronized (banbVar4.o) {
                        banbVar4.r++;
                        banbVar4.t += nanoTime4 - nanoTime2;
                        banbVar4.u += nanoTime4 - nanoTime3;
                    }
                    if (!banbVar4.d.isEmpty()) {
                        banbVar4.j.reset();
                        banbVar4.j.preTranslate(0.5f, 0.5f);
                        banbVar4.j.preScale(1.0f, 1.0f);
                        banbVar4.j.preScale(1.0f, -1.0f);
                        banbVar4.j.preTranslate(-0.5f, -0.5f);
                        Iterator it = banbVar4.d.iterator();
                        if (it.hasNext()) {
                            bamz bamzVar = (bamz) it.next();
                            it.remove();
                            float f4 = bamzVar.b;
                            int b2 = (int) (videoFrame.b() * 0.0f);
                            float f5 = bamzVar.b;
                            int a = (int) (videoFrame.a() * 0.0f);
                            if (b2 != 0 && a != 0) {
                                banbVar4.v.b(b2, a);
                                GLES20.glBindFramebuffer(36160, banbVar4.v.a);
                                GLES20.glFramebufferTexture2D(36160, 36064, 3553, banbVar4.v.b, 0);
                                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                                GLES20.glClear(16384);
                                bapf bapfVar = banbVar4.h;
                                baob baobVar = bamzVar.c;
                                bapfVar.b(videoFrame, null, banbVar4.j, b2, a);
                                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(b2 * a * 4);
                                GLES20.glViewport(0, 0, b2, a);
                                GLES20.glReadPixels(0, 0, b2, a, 6408, 5121, allocateDirect);
                                GLES20.glBindFramebuffer(36160, 0);
                                banl.d("EglRenderer.notifyCallbacks");
                                Bitmap.createBitmap(b2, a, Bitmap.Config.ARGB_8888).copyPixelsFromBuffer(allocateDirect);
                                bamy bamyVar = bamzVar.a;
                                throw null;
                            }
                            bamy bamyVar2 = bamzVar.a;
                            throw null;
                        }
                    }
                } catch (bani e) {
                    Logging.c("EglRenderer", String.valueOf(banbVar4.a).concat("Error while drawing frame"), e);
                    bamx bamxVar = banbVar4.e;
                    banbVar4.i.c();
                    banbVar4.h.a();
                    banbVar4.v.a();
                } finally {
                    videoFrame.release();
                }
            }
        }
    }
}
