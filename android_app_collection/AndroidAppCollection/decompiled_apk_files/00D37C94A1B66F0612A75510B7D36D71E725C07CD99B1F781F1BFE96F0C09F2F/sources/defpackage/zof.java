package defpackage;

import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
/* compiled from: PG */
/* renamed from: zof  reason: default package */
/* loaded from: classes4.dex */
public final class zof {
    public final Looper a;
    public final Thread b;
    public boolean c;
    public zod d;
    public String e;
    public String f;
    private boolean g;

    public zof() {
        HandlerThread handlerThread = new HandlerThread("zof");
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        this.a = looper;
        this.b = looper.getThread();
        new Handler(looper).post(new Runnable() { // from class: zoe
            @Override // java.lang.Runnable
            public final void run() {
                zof zofVar = zof.this;
                try {
                    zofVar.d = zod.m(2, 2);
                    zofVar.d.e();
                    zod.h(zofVar.d);
                    zofVar.e = GLES20.glGetString(7937);
                    zofVar.f = GLES20.glGetString(7938);
                } catch (RuntimeException e) {
                    zep.f("GlDeviceInfo", "Failed to init GL", e);
                }
                try {
                    zod.f();
                } catch (RuntimeException e2) {
                    zep.f("GlDeviceInfo", "focusNone failed: ", e2);
                }
                try {
                    zod zodVar = zofVar.d;
                    if (zodVar != null) {
                        zodVar.g();
                    }
                } catch (RuntimeException e3) {
                    zep.f("GlDeviceInfo", "FilterRenderTarget.release failed: ", e3);
                }
                synchronized (zofVar.b) {
                    zofVar.c = true;
                    zofVar.b.notifyAll();
                    zofVar.a.quit();
                }
            }
        });
    }

    public final void a() {
        synchronized (this.b) {
            long currentTimeMillis = System.currentTimeMillis();
            while (this.b.isAlive() && !this.c && !this.g) {
                try {
                    this.b.wait(500L);
                } catch (InterruptedException unused) {
                    zep.m("GlDeviceInfo", "Wait interrupted");
                }
                if (System.currentTimeMillis() - currentTimeMillis >= 500) {
                    zep.m("GlDeviceInfo", "Wait for GlDeviceInfo timed out");
                    this.g = true;
                }
            }
        }
    }
}
