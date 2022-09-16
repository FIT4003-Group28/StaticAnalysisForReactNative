package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.util.Log;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Queue;
import javax.microedition.khronos.egl.EGLContext;
/* compiled from: PG */
/* renamed from: aohz  reason: default package */
/* loaded from: classes.dex */
public final class aohz extends aoin implements SurfaceTexture.OnFrameAvailableListener {
    public volatile SurfaceTexture a;
    public final List b;
    public aoim c;
    protected int d;
    protected int e;
    private volatile SurfaceTexture n;
    private int[] o;
    private final Queue p;
    private int q;
    private final int r;
    private long s;
    private long t;
    private boolean u;

    public aohz(EGLContext eGLContext) {
        super(eGLContext);
        this.a = null;
        this.n = null;
        this.o = null;
        this.p = new ArrayDeque();
        this.q = 0;
        this.c = null;
        this.s = 0L;
        this.t = 0L;
        this.u = false;
        this.d = 0;
        this.e = 0;
        this.r = 3;
        this.c = new aoim();
        this.b = new ArrayList();
    }

    public static void f(aoie aoieVar) {
        GLES20.glDeleteTextures(1, new int[]{aoieVar.c}, 0);
    }

    private final aohy j() {
        int i = this.d;
        int i2 = this.e;
        int[] iArr = {0};
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, iArr[0]);
        GLES20.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, null);
        aoio.c("glTexImage2D");
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        aoio.c("texture setup");
        int i3 = iArr[0];
        String.format("Created output texture: %d width: %d height: %d", Integer.valueOf(i3), Integer.valueOf(this.d), Integer.valueOf(this.e));
        h(i3, this.d, this.e);
        return new aohy(this, i3, this.d, this.e);
    }

    private static final void k(aoie aoieVar) {
        try {
            aoieVar.c();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            String valueOf = String.valueOf(e.getMessage());
            Log.e("ExternalTextureConv", valueOf.length() != 0 ? "thread was unexpectedly interrupted: ".concat(valueOf) : new String("thread was unexpectedly interrupted: "));
            throw new RuntimeException(e);
        }
    }

    public final aoie a() {
        aohy aohyVar;
        synchronized (this) {
            aohyVar = (aohy) this.p.poll();
            this.q++;
        }
        if (aohyVar == null) {
            return j();
        }
        if (aohyVar.d != this.d || aohyVar.e != this.e) {
            k(aohyVar);
            f(aohyVar);
            return j();
        }
        k(aohyVar);
        return aohyVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final synchronized void b(aohy aohyVar) {
        this.p.offer(aohyVar);
        int i = this.q - 1;
        this.q = i;
        int max = Math.max(this.r - i, 0);
        while (this.p.size() > max) {
            final aohy aohyVar2 = (aohy) this.p.remove();
            this.k.post(new Runnable() { // from class: aohw
                @Override // java.lang.Runnable
                public final void run() {
                    aohz.f(aohy.this);
                }
            });
        }
    }

    @Override // defpackage.aoin
    public final void c() {
        super.c();
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        aoim aoimVar = this.c;
        HashMap hashMap = new HashMap();
        hashMap.put("position", 1);
        hashMap.put("texture_coordinate", 2);
        int d = aoio.d("#extension GL_OES_EGL_image_external : require\nvarying mediump vec2 sample_coordinate;\nuniform samplerExternalOES video_frame;\n\nvoid main() {\n  gl_FragColor = texture2D(video_frame, sample_coordinate);\n}", hashMap);
        aoimVar.f = d;
        aoimVar.g = GLES20.glGetUniformLocation(d, "video_frame");
        aoimVar.h = GLES20.glGetUniformLocation(aoimVar.f, "texture_transform");
        aoio.c("glGetUniformLocation");
        int[] iArr = new int[1];
        this.o = iArr;
        GLES20.glGenTextures(1, iArr, 0);
        this.n = new SurfaceTexture(this.o[0]);
        e(this.n, 0, 0);
    }

    @Override // defpackage.aoin
    public final void d() {
        e(null, 0, 0);
        while (!this.p.isEmpty()) {
            f((aoie) this.p.remove());
        }
        this.n.release();
        int[] iArr = this.o;
        if (iArr != null) {
            GLES20.glDeleteTextures(1, iArr, 0);
        }
        GLES20.glDeleteProgram(this.c.f);
        super.d();
    }

    public final void e(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.a != null) {
            this.a.setOnFrameAvailableListener(null);
        }
        this.a = surfaceTexture;
        if (this.a != null) {
            this.a.setOnFrameAvailableListener(this);
        }
        this.d = i;
        this.e = i2;
    }

    public final void g(aoie aoieVar) {
        FloatBuffer floatBuffer;
        h(aoieVar.c, this.d, this.e);
        aoim aoimVar = this.c;
        SurfaceTexture surfaceTexture = this.a;
        GLES20.glClear(16384);
        GLES20.glActiveTexture(33984);
        aoio.c("glActiveTexture");
        surfaceTexture.updateTexImage();
        surfaceTexture.getTransformMatrix(aoimVar.i);
        GLES20.glTexParameteri(36197, 10241, 9729);
        GLES20.glTexParameteri(36197, 10240, 9729);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        aoio.c("glTexParameteri");
        GLES20.glUseProgram(aoimVar.f);
        aoio.c("glUseProgram");
        GLES20.glUniform1i(aoimVar.g, 0);
        aoio.c("glUniform1i");
        GLES20.glUniformMatrix4fv(aoimVar.h, 1, false, aoimVar.i, 0);
        aoio.c("glUniformMatrix4fv");
        GLES20.glEnableVertexAttribArray(1);
        int i = aoimVar.j;
        if (i == 1) {
            floatBuffer = aoim.c;
        } else if (i != 2) {
            floatBuffer = i != 3 ? aoim.b : aoim.e;
        } else {
            floatBuffer = aoim.d;
        }
        GLES20.glVertexAttribPointer(1, 2, 5126, false, 0, (Buffer) floatBuffer);
        GLES20.glEnableVertexAttribArray(2);
        GLES20.glVertexAttribPointer(2, 2, 5126, false, 0, (Buffer) aoim.a);
        aoio.c("program setup");
        GLES20.glDrawArrays(5, 0, 4);
        aoio.c("glDrawArrays");
        GLES20.glBindTexture(36197, 0);
        aoio.c("glBindTexture");
        GLES20.glFinish();
        long timestamp = this.a.getTimestamp() / 1000;
        if (this.u) {
            long j = this.s;
            long j2 = this.t;
            if (j + timestamp <= j2) {
                this.s = (j2 + 1) - timestamp;
            }
        }
        long j3 = timestamp + this.s;
        aoieVar.f = j3;
        this.t = j3;
        this.u = true;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(final SurfaceTexture surfaceTexture) {
        this.k.post(new Runnable() { // from class: aohx
            @Override // java.lang.Runnable
            public final void run() {
                aohz aohzVar = aohz.this;
                if (surfaceTexture != aohzVar.a) {
                    return;
                }
                synchronized (aohzVar.b) {
                    boolean z = false;
                    for (aoic aoicVar : aohzVar.b) {
                        aoie a = aohzVar.a();
                        aohzVar.g(a);
                        if (aoicVar != null) {
                            a.b();
                            aoicVar.a(a);
                        }
                        z = true;
                    }
                    if (!z) {
                        aohzVar.g(aohzVar.a());
                    }
                }
            }
        });
    }
}
