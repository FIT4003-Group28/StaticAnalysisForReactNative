package defpackage;

import android.content.Intent;
import android.graphics.SurfaceTexture;
import android.hardware.display.DisplayManager;
import android.hardware.display.VirtualDisplay;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.Surface;
import java.nio.Buffer;
import java.util.Set;
/* compiled from: PG */
/* renamed from: accp  reason: default package */
/* loaded from: classes.dex */
public final class accp implements SurfaceTexture.OnFrameAvailableListener, absw, accg {
    public static final /* synthetic */ int g = 0;
    public SurfaceTexture a;
    public VirtualDisplay c;
    public boolean d;
    public accf e;
    public acce f;
    private final abry h;
    private final DisplayManager i;
    private final MediaProjectionManager j;
    private final Intent k;
    private int o;
    private int p;
    private Surface q;
    private Handler r;
    private Handler s;
    private MediaProjection t;
    private accc u;
    private boolean v;
    private boolean w;
    private final float[] l = new float[16];
    private final Runnable m = new accl(this, 1);
    private final Runnable n = new accl(this);
    private final MediaProjection.Callback x = new accm(this);
    private final VirtualDisplay.Callback y = new accn(this);
    private final DisplayManager.DisplayListener z = new acco(this);

    public accp(DisplayManager displayManager, MediaProjectionManager mediaProjectionManager, Intent intent, abry abryVar, int i, int i2) {
        aqxo.y(true);
        displayManager.getClass();
        this.i = displayManager;
        mediaProjectionManager.getClass();
        this.j = mediaProjectionManager;
        intent.getClass();
        this.k = intent;
        abryVar.getClass();
        this.h = abryVar;
        this.o = i;
        this.p = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(final int i) {
        acce acceVar = this.f;
        if (acceVar != null) {
            Handler handler = this.r;
            if (handler != null) {
                handler.post(new Runnable() { // from class: acck
                    @Override // java.lang.Runnable
                    public final void run() {
                        accp accpVar = accp.this;
                        accpVar.f.a(i);
                    }
                });
            } else {
                acceVar.a(i);
            }
        }
    }

    @Override // defpackage.accg
    public final void a(Surface surface, long j) {
    }

    @Override // defpackage.accg
    public final void b(acce acceVar, Handler handler) {
        this.f = acceVar;
        this.r = handler;
    }

    @Override // defpackage.accg
    public final void c(accf accfVar, Handler handler) {
        this.e = accfVar;
        this.s = handler;
    }

    @Override // defpackage.accg
    public final void d(Surface surface) {
    }

    @Override // defpackage.accg
    public final boolean e() {
        if (!this.d) {
            Log.e("VirtualDisplaySource", "Cannot pause when virtual display not active.");
            return false;
        } else if (!this.v) {
            Log.e("VirtualDisplaySource", "Cannot pause when video source not started.");
            return false;
        } else {
            this.w = true;
            this.c.setSurface(null);
            return true;
        }
    }

    @Override // defpackage.accg
    public final boolean f() {
        if (this.d) {
            Log.e("VirtualDisplaySource", "Virtual display already active");
            return false;
        }
        MediaProjection mediaProjection = this.j.getMediaProjection(-1, this.k);
        this.t = mediaProjection;
        if (mediaProjection == null) {
            Log.e("VirtualDisplaySource", "Could not acquire a media projection");
            return false;
        }
        mediaProjection.registerCallback(this.x, null);
        this.i.registerDisplayListener(this.z, null);
        Display display = this.i.getDisplay(0);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        display.getRealMetrics(displayMetrics);
        VirtualDisplay createVirtualDisplay = this.t.createVirtualDisplay("Virtual Display Video Source", this.o, this.p, displayMetrics.densityDpi, 19, null, this.y, null);
        this.c = createVirtualDisplay;
        if (createVirtualDisplay == null) {
            Log.e("VirtualDisplaySource", "Could not create virtual display");
            return false;
        }
        this.d = true;
        createVirtualDisplay.getDisplay().getRealMetrics(displayMetrics);
        this.o = displayMetrics.widthPixels;
        this.p = displayMetrics.heightPixels;
        Matrix.setIdentityM(this.l, 0);
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        abse.b("glGenTextures");
        int i = iArr[0];
        GLES20.glBindTexture(36197, i);
        StringBuilder sb = new StringBuilder(25);
        sb.append("glBindTexture ");
        sb.append(i);
        abse.b(sb.toString());
        GLES20.glTexParameterf(36197, 10241, 9728.0f);
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        abse.b("glTexParameter");
        SurfaceTexture surfaceTexture = new SurfaceTexture(i);
        this.a = surfaceTexture;
        surfaceTexture.setDefaultBufferSize(this.o, this.p);
        this.q = new Surface(this.a);
        abry abryVar = this.h;
        EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(abryVar.a, abryVar.c, new int[]{12375, this.o, 12374, this.p, 12344}, 0);
        abse.a("eglCreatePbufferSurface");
        if (eglCreatePbufferSurface == null) {
            throw new absd("surface was null");
        }
        abryVar.c(eglCreatePbufferSurface);
        this.u = new accc();
        return true;
    }

    @Override // defpackage.accg
    public final boolean g() {
        if (!this.d) {
            Log.e("VirtualDisplaySource", "Cannot resume when virtual display not active.");
            return false;
        } else if (!this.v) {
            Log.e("VirtualDisplaySource", "Cannot resume when video source not started.");
            return false;
        } else {
            this.w = false;
            this.c.setSurface(this.q);
            Handler handler = this.s;
            if (handler != null) {
                handler.post(this.m);
                return true;
            }
            this.m.run();
            return true;
        }
    }

    @Override // defpackage.accg
    public final boolean h() {
        if (!this.d) {
            Log.e("VirtualDisplaySource", "Cannot start when virtual display not active.");
            return false;
        }
        try {
            this.a.setOnFrameAvailableListener(this, this.s);
            this.c.setSurface(this.q);
            this.v = true;
            return true;
        } catch (Exception e) {
            Log.e("VirtualDisplaySource", "Error starting virtual display source", e);
            return false;
        }
    }

    @Override // defpackage.accg
    public final void i() {
        int i;
        j();
        this.d = false;
        this.i.unregisterDisplayListener(this.z);
        VirtualDisplay virtualDisplay = this.c;
        if (virtualDisplay != null) {
            virtualDisplay.setSurface(null);
            this.c.release();
            this.c = null;
        }
        MediaProjection mediaProjection = this.t;
        if (mediaProjection != null) {
            mediaProjection.unregisterCallback(this.x);
            this.t.stop();
            this.t = null;
        }
        try {
            abry abryVar = this.h;
            if (abryVar != null && abryVar.d) {
                abryVar.d();
            }
        } catch (Exception e) {
            Log.e("VirtualDisplaySource", "Error clearing EGL context", e);
        }
        try {
            accc acccVar = this.u;
            if (acccVar != null && (i = acccVar.i) >= 0) {
                GLES20.glDeleteProgram(i);
                acccVar.i = -1;
            }
            SurfaceTexture surfaceTexture = this.a;
            if (surfaceTexture != null) {
                surfaceTexture.release();
            }
            Surface surface = this.q;
            if (surface != null) {
                surface.release();
            }
            abry abryVar2 = this.h;
            if (abryVar2 != null) {
                abryVar2.e();
            }
        } catch (Exception e2) {
            Log.e("VirtualDisplaySource", "Error releasing virtual display source resources", e2);
        }
        this.u = null;
        this.a = null;
        this.q = null;
    }

    @Override // defpackage.accg
    public final void j() {
        if (!this.d) {
            Log.e("VirtualDisplaySource", "Cannot stop when virtual display not active.");
        } else if (!this.v) {
        } else {
            this.v = false;
            c(null, null);
            try {
                this.a.setOnFrameAvailableListener(null);
                this.c.setSurface(null);
            } catch (Exception e) {
                Log.e("VirtualDisplaySource", "Error stopping virtual display source", e);
            }
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        if (this.v && !this.w && surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (Exception e) {
                Log.e("VirtualDisplaySource", "Error copying frame to display surface", e);
                l(7);
            }
        }
        Handler handler = this.s;
        if (handler != null) {
            handler.post(this.n);
        } else {
            this.n.run();
        }
    }

    @Override // defpackage.absw
    public final void ra(boolean z, int i, int i2, Set set) {
        if (!this.v) {
            return;
        }
        try {
            accc acccVar = this.u;
            float[] fArr = this.l;
            abse.b("draw start");
            GLES20.glUseProgram(acccVar.i);
            abse.b("glUseProgram");
            GLES20.glUniformMatrix4fv(acccVar.g, 1, false, acccVar.d, 0);
            abse.b("glUniformMatrix4fv");
            GLES20.glUniformMatrix4fv(acccVar.h, 1, false, fArr, 0);
            abse.b("glUniformMatrix4fv");
            GLES20.glEnableVertexAttribArray(acccVar.e);
            abse.b("glEnableVertexAttribArray");
            GLES20.glVertexAttribPointer(acccVar.e, 2, 5126, false, 8, (Buffer) accc.a);
            abse.b("glVertexAttribPointer");
            GLES20.glEnableVertexAttribArray(acccVar.f);
            abse.b("glEnableVertexAttribArray");
            GLES20.glVertexAttribPointer(acccVar.f, 2, 5126, false, 8, (Buffer) accc.b);
            abse.b("glVertexAttribPointer");
            GLES20.glDrawArrays(5, 0, accc.c);
            abse.b("glDrawArrays");
            GLES20.glDisableVertexAttribArray(acccVar.e);
            GLES20.glDisableVertexAttribArray(acccVar.f);
            GLES20.glUseProgram(0);
        } catch (Exception e) {
            Log.e("VirtualDisplaySource", "Could not copy frame to target surface", e);
            l(7);
        }
    }
}
