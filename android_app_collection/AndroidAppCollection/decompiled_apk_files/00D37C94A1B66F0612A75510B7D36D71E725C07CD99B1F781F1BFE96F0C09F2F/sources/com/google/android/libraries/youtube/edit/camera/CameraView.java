package com.google.android.libraries.youtube.edit.camera;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.media.CamcorderProfile;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.camera.ShortsZoomSlider;
import com.google.android.libraries.youtube.edit.camera.CameraView;
import com.google.android.libraries.youtube.edit.camera.MultiSegmentCameraProgressIndicator;
import com.google.android.youtube.R;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class CameraView extends zms implements GLSurfaceView.Renderer, SurfaceTexture.OnFrameAvailableListener, zmb, zra, zlf, zlo {
    public zlg A;
    private GLSurfaceView B;
    private boolean C;
    private zrp D;
    private int E;
    private int F;
    private int G;
    private int H;
    private int I;

    /* renamed from: J */
    private int f164J;
    private zly K;
    private final Context L;
    private ankt M;
    private int N;
    public View a;
    public vqx b;
    public SurfaceTexture c;
    public int d;
    public boolean e;
    public boolean f;
    public zlp g;
    public final Object h;
    public final Object i;
    public zqq j;
    public int k;
    public int l;
    public zlw m;
    public zln n;
    public volatile boolean o;
    public final Object p;
    public zlh q;
    public final Set r;
    public boolean s;
    public boolean t;
    public zlo u;
    public boolean v;
    public boolean w;
    public hkl x;
    public gwy y;
    public gxe z;

    public CameraView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = false;
        this.h = new Object();
        this.i = new Object();
        this.k = -1;
        this.E = -1;
        this.F = -1;
        this.G = -1;
        this.f164J = 30;
        this.l = 5000000;
        this.p = new Object();
        this.r = Collections.newSetFromMap(new WeakHashMap());
        this.s = false;
        this.N = 6;
        this.L = context;
        inflate(context, R.layout.camera_view, this);
        this.M = anii.h(this.q.a.a(), ydy.f, anjk.a);
    }

    static final boolean O(Camera camera, String str) {
        try {
            Camera.Parameters parameters = camera.getParameters();
            List<String> supportedFlashModes = parameters.getSupportedFlashModes();
            return (parameters.getFlashMode() == null || supportedFlashModes == null || !supportedFlashModes.contains(str)) ? false : true;
        } catch (Exception e) {
            zep.n("Error while getting camera parameters.", e);
            return false;
        }
    }

    public static final Rect P(RectF rectF) {
        Rect rect = new Rect();
        rect.left = Math.round(rectF.left);
        rect.top = Math.round(rectF.top);
        rect.right = Math.round(rectF.right);
        rect.bottom = Math.round(rectF.bottom);
        return rect;
    }

    public static final RectF Q(Rect rect) {
        return new RectF(rect.left, rect.top, rect.right, rect.bottom);
    }

    private static Rect U(float f, float f2, float f3, int i, int i2) {
        double d = (f / i) * 2000.0f;
        Double.isNaN(d);
        int i3 = (int) (d - 1000.0d);
        double d2 = (f2 / i2) * 2000.0f;
        Double.isNaN(d2);
        int i4 = (int) (d2 - 1000.0d);
        int round = Math.round(f3 * 200.0f) / 2;
        return new Rect(Math.min(Math.max(-1000, i3 - round), 1000), Math.min(Math.max(-1000, i4 - round), 1000), Math.min(Math.max(-1000, i3 + round), 1000), Math.min(Math.max(-1000, i4 + round), 1000));
    }

    private final void V(String str) {
        if (this.f) {
            zep.c("PresetFilterDebug", str);
        }
    }

    private final void W() {
        ylx.m(this.q.a.b(new fgn(this.E == this.F ? 0 : 1, 5), anjk.a), ngc.n);
    }

    private final void X() {
        this.j.getClass();
        CamcorderProfile h = h(true);
        int i = h.videoFrameWidth;
        int i2 = h.videoFrameHeight;
        int i3 = (this.A.d + 90) % 180;
        int i4 = i3 == 0 ? i : i2;
        if (i3 == 0) {
            i = i2;
        }
        this.j.e(this.c, i, i4);
        V("CameraView::videoEffectPipelineDrishti.setPrimaryTargetAvailable");
    }

    private final void Y() {
        CamcorderProfile m = zna.m(this.E, 20, this.N);
        if (m == null) {
            zep.b("Failed to determine camera profile.");
        } else {
            this.A.f(this.E, m.videoFrameWidth, m.videoFrameHeight, Math.min(m.videoFrameRate, this.f164J));
        }
    }

    public static int f(float f, int i, int i2) {
        return Math.min(i, Math.max(0, ((int) (i * f)) + i2));
    }

    public static /* synthetic */ void m(Throwable th) {
        zep.d("Error calling setCameraFacing() in ProtoDataStore", th);
    }

    public final void A() {
        synchronized (this.h) {
            zlp zlpVar = this.g;
            if (zlpVar != null) {
                if (zlpVar.A) {
                    B(0);
                }
                zlp zlpVar2 = this.g;
                synchronized (zlpVar2) {
                    if (zlpVar2.A) {
                        zlpVar2.O = 1;
                        zlpVar2.d();
                        zlpVar2.h(6);
                    } else if (zlpVar2.a > 0) {
                        zlpVar2.h(6);
                    }
                }
                zlb zlbVar = zlpVar2.e;
                if (zlbVar != null) {
                    zlbVar.d();
                    zlpVar2.e.b();
                    zlpVar2.e = null;
                }
                this.g = null;
            }
        }
        synchronized (this.p) {
            this.o = true;
        }
        this.A.a();
        final zqq zqqVar = this.j;
        this.B.queueEvent(new Runnable() { // from class: zlu
            @Override // java.lang.Runnable
            public final void run() {
                CameraView cameraView = CameraView.this;
                zqq zqqVar2 = zqqVar;
                if (!cameraView.w) {
                    cameraView.D();
                }
                cameraView.A.d();
                cameraView.A.c(null);
                if (cameraView.w) {
                    synchronized (cameraView.i) {
                        if (zqqVar2 == cameraView.j) {
                            cameraView.D();
                        } else {
                            zep.l("VideoEffectPipeline tearDown completed before stop");
                        }
                    }
                }
                vqx vqxVar = cameraView.b;
                if (vqxVar != null) {
                    vqxVar.b();
                    cameraView.b = null;
                }
                SurfaceTexture surfaceTexture = cameraView.c;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                    GLES20.glDeleteTextures(1, new int[]{cameraView.d}, 0);
                }
                synchronized (cameraView.p) {
                    cameraView.o = false;
                    cameraView.p.notifyAll();
                }
            }
        });
        this.B.onPause();
    }

    public final void B(int i) {
        if (H()) {
            this.g.c(i);
        } else {
            zep.l("stopRecord called but camera is not recording.");
        }
    }

    @Override // defpackage.zmb
    public final void C(int i) {
        boolean z = true;
        if (i != 1) {
            i = 0;
        }
        aqxo.s(true, "cameraDirection must be one of @CameraDirection values; was %s.", i);
        if (!I()) {
            return;
        }
        if (i == 0 && this.E == this.F) {
            return;
        }
        if (i == 1 && this.E == this.G) {
            return;
        }
        this.A.d();
        int i2 = this.A.g;
        int i3 = this.F;
        if (i2 == i3) {
            i3 = this.G;
        }
        this.E = i3;
        W();
        Y();
        zly zlyVar = this.K;
        if (zlyVar == null) {
            return;
        }
        hdl hdlVar = (hdl) zlyVar;
        if (1 != i) {
            z = false;
        }
        hdlVar.i = z;
        if (i != 0) {
            hdlVar.g = false;
            hdlVar.e.K(false);
        }
        hdlVar.b();
    }

    public final void D() {
        zqq zqqVar = this.j;
        if (zqqVar != null) {
            zqqVar.h();
            this.j.i();
            this.j = null;
        }
    }

    @Override // defpackage.zmb
    public final boolean E() {
        return this.e;
    }

    @Override // defpackage.zmb
    public final boolean F() {
        Camera a = this.A.a();
        if (a == null) {
            return false;
        }
        return O(a, "torch") || this.E == this.G;
    }

    public final boolean G() {
        zlp zlpVar = this.g;
        return zlpVar != null && !zlpVar.A;
    }

    @Override // defpackage.zmb
    public final boolean H() {
        zlp zlpVar = this.g;
        return zlpVar != null && zlpVar.A;
    }

    @Override // defpackage.zmb
    public final boolean I() {
        if (this.F < 0 || this.G < 0) {
            return false;
        }
        zlp zlpVar = this.g;
        return zlpVar == null || !zlpVar.A;
    }

    public final boolean J(Camera camera, String str) {
        if (camera != null && (O(camera, str) || this.E != this.F)) {
            if (!O(camera, str) && this.E == this.G) {
                return "torch".equals(str) || "off".equals(str);
            }
            try {
                Camera.Parameters parameters = camera.getParameters();
                parameters.setFlashMode(str);
                camera.setParameters(parameters);
                return true;
            } catch (Exception e) {
                zep.n("Error while setting camera flash light mode", e);
            }
        }
        return false;
    }

    public final boolean L() {
        if (this.A.a() == null) {
            return false;
        }
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(this.E, cameraInfo);
        return !cameraInfo.canDisableShutterSound;
    }

    public final void M(zkz zkzVar, int i, zlo zloVar) {
        N(zkzVar, i, 0L, 0L, zloVar);
    }

    public final void N(zkz zkzVar, int i, long j, long j2, zlo zloVar) {
        this.H = 0;
        this.I = 0;
        if (!G()) {
            zep.b("Camera is not ready for recording.");
        } else if (this.A.a() != null) {
            CamcorderProfile h = h(false);
            if (h == null) {
                zep.b("No camcorder profile. Did you forget to call prepareRecord?");
                return;
            }
            this.k = -1;
            s(false);
            this.u = zloVar;
            zlp zlpVar = this.g;
            zlpVar.S = this.y;
            zlpVar.M = this.n;
            int i2 = this.A.c;
            int i3 = h.videoFrameWidth;
            int i4 = h.videoFrameHeight;
            float min = Math.min(h.videoFrameRate, this.f164J);
            zlpVar.q = i2;
            zlpVar.r = i;
            zlpVar.s = i3;
            zlpVar.t = i4;
            zlpVar.u = min;
            aqxo.y(j == 0 || j > 0);
            aqxo.y(j2 == 0 || j2 > 0);
            if (j != 0 && j2 != 0) {
                aqxo.y(j <= j2);
            }
            zlpVar.C = j;
            zlpVar.D = j2;
            zlpVar.R = zkzVar;
            zlpVar.N = this;
            zlpVar.G = ((float) TimeUnit.SECONDS.toNanos(1L)) / min;
            zlpVar.K = null;
            zlpVar.A = true;
            zlpVar.z = false;
            zlpVar.I = 0;
            zlpVar.f273J = 0;
            if (zlpVar.P) {
                zlpVar.f(0);
            }
            zlpVar.w = new Thread(zlpVar, "editRecordVideo");
            zlpVar.w.start();
            n();
            for (zlz zlzVar : this.r) {
                zlzVar.mi();
            }
        } else {
            zep.b("Camera not active.");
        }
    }

    public final void R() {
        this.C = true;
    }

    @Override // defpackage.zra
    public final void a(SurfaceTexture surfaceTexture, int i) {
        V("CameraView::onPipelineSourceSurfaceCreated");
        this.A.c(surfaceTexture);
    }

    @Override // defpackage.zlo
    public final void aM(final znb znbVar, final int i) {
        post(new Runnable() { // from class: zlt
            @Override // java.lang.Runnable
            public final void run() {
                CameraView cameraView = CameraView.this;
                znb znbVar2 = znbVar;
                int i2 = i;
                cameraView.a.setVisibility(8);
                for (zlz zlzVar : cameraView.r) {
                    zlzVar.d();
                    zlzVar.mm();
                }
                if (cameraView.v) {
                    cameraView.s(true);
                }
                zlo zloVar = cameraView.u;
                if (zloVar != null) {
                    zloVar.aM(znbVar2, i2);
                }
            }
        });
    }

    @Override // defpackage.zlf
    public final void b() {
        post(new Runnable() { // from class: zlq
            @Override // java.lang.Runnable
            public final void run() {
                for (zlz zlzVar : CameraView.this.r) {
                    zlzVar.a();
                }
            }
        });
    }

    @Override // defpackage.zlf
    public final void c(final Camera camera) {
        if (this.j != null) {
            X();
        }
        post(new Runnable() { // from class: zlr
            @Override // java.lang.Runnable
            public final void run() {
                CameraView cameraView = CameraView.this;
                Camera camera2 = camera;
                if (cameraView.e) {
                    cameraView.J(camera2, "torch");
                }
                for (zlz zlzVar : cameraView.r) {
                    zlzVar.b();
                }
            }
        });
    }

    @Override // defpackage.zmb
    public final int g() {
        return this.E == this.G ? 1 : 0;
    }

    public final zma i() {
        Camera a = this.A.a();
        if (a == null) {
            return null;
        }
        Camera.Size previewSize = a.getParameters().getPreviewSize();
        zma zmaVar = new zma();
        zmaVar.b = previewSize.height;
        zmaVar.a = previewSize.width;
        return zmaVar;
    }

    @Override // defpackage.zmb
    public final void j(zlz zlzVar) {
        this.r.add(zlzVar);
    }

    public final void k(float f) {
        Camera.Parameters j;
        Camera a = this.A.a();
        if (a == null || (j = this.A.j(a)) == null || !j.isZoomSupported()) {
            return;
        }
        float f2 = -1.0f;
        float f3 = f - 1.0f;
        if (Math.abs(f3) < 0.001f) {
            return;
        }
        int zoom = j.getZoom();
        int maxZoom = j.getMaxZoom();
        float f4 = f3 * maxZoom;
        if (Math.abs(f4) >= 1.0f) {
            f2 = f4;
        } else if (f4 > 0.0f) {
            f2 = 1.0f;
        }
        w(a, j, Math.max(0, Math.min(maxZoom, Math.round(zoom + f2))), maxZoom, true);
    }

    public final void l(float f, float f2, zlx zlxVar) {
        List<String> supportedFocusModes;
        Camera a = this.A.a();
        if (a == null) {
            return;
        }
        Camera.Parameters parameters = a.getParameters();
        String focusMode = parameters.getFocusMode();
        int i = this.A.d;
        Matrix matrix = new Matrix();
        matrix.setScale(1.0f, this.E == this.G ? -1.0f : 1.0f);
        matrix.postRotate(360 - i);
        try {
            a.cancelAutoFocus();
            if (parameters.getMaxNumFocusAreas() > 0) {
                ArrayList arrayList = new ArrayList();
                RectF Q = Q(U(f, f2, 1.0f, this.B.getWidth(), this.B.getHeight()));
                matrix.mapRect(Q);
                arrayList.add(new Camera.Area(P(Q), 800));
                parameters.setFocusAreas(arrayList);
            }
            if (parameters.getMaxNumMeteringAreas() > 0) {
                ArrayList arrayList2 = new ArrayList();
                RectF Q2 = Q(U(f, f2, 1.5f, this.B.getWidth(), this.B.getHeight()));
                matrix.mapRect(Q2);
                arrayList2.add(new Camera.Area(P(Q2), 800));
                parameters.setMeteringAreas(arrayList2);
            }
            boolean z = false;
            if (parameters != null && (supportedFocusModes = parameters.getSupportedFocusModes()) != null && supportedFocusModes.contains("auto")) {
                z = true;
            }
            if (z) {
                parameters.setFocusMode("auto");
            }
            a.setParameters(parameters);
            if ((parameters.getMaxNumFocusAreas() > 0 || parameters.getMaxNumMeteringAreas() > 0) && zlxVar != null) {
                zlxVar.a((int) f, (int) f2);
            }
            if (!z) {
                return;
            }
            a.autoFocus(new zlv(focusMode));
        } catch (RuntimeException unused) {
            zep.b("error setting camera parameters");
        }
    }

    public final void n() {
        Camera a = this.A.a();
        if (a != null && this.e && this.E == this.G && !O(a, "torch")) {
            this.a.setVisibility(0);
            for (zlz zlzVar : this.r) {
                zlzVar.mn();
            }
        }
    }

    @Override // defpackage.zmb
    public final void o(zlz zlzVar) {
        this.r.remove(zlzVar);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        int[] iArr;
        int[] iArr2;
        int i;
        int i2;
        zlp zlpVar = this.g;
        if (zlpVar != null && zlpVar.A) {
            synchronized (zlpVar.n) {
                while (zlpVar.m) {
                    try {
                        zlpVar.n.wait();
                    } catch (InterruptedException unused) {
                        zep.b("TextureLock waiting interrupted.");
                    }
                }
            }
        }
        this.c.updateTexImage();
        final zlp zlpVar2 = this.g;
        if (zlpVar2 != null && zlpVar2.A) {
            final SurfaceTexture surfaceTexture = this.c;
            final int i3 = this.d;
            synchronized (zlpVar2) {
                if (zlpVar2.k() && surfaceTexture.getTimestamp() > 0) {
                    zlpVar2.m = true;
                    zlpVar2.I++;
                    zlpVar2.x.post(new Runnable() { // from class: zlm
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i4;
                            int i5;
                            MultiSegmentCameraProgressIndicator multiSegmentCameraProgressIndicator;
                            zlp zlpVar3 = zlp.this;
                            SurfaceTexture surfaceTexture2 = surfaceTexture;
                            int i6 = i3;
                            zlpVar3.b.a(0L);
                            long timestamp = surfaceTexture2.getTimestamp();
                            long j = zlpVar3.B;
                            if (j < 0) {
                                zlpVar3.B = timestamp;
                                zlpVar3.F = 0L;
                                j = timestamp;
                            }
                            long j2 = zlpVar3.F;
                            float f = zlpVar3.v;
                            long j3 = ((float) (j2 - j)) / f;
                            long j4 = ((float) (zlpVar3.E - j)) / f;
                            long abs = Math.abs((j4 - j3) - zlpVar3.G);
                            long abs2 = Math.abs(((((float) (timestamp - j)) / f) - j3) - zlpVar3.G);
                            if (j4 == 0 || (zlpVar3.E >= zlpVar3.B && abs < abs2)) {
                                zlpVar3.b();
                            }
                            float[] fArr = new float[16];
                            surfaceTexture2.getTransformMatrix(fArr);
                            boolean z = true;
                            float f2 = (fArr[0] * fArr[5]) - (fArr[1] * fArr[4]);
                            boolean z2 = !zlpVar3.L && f2 > 0.0f;
                            if (f2 > 0.0f) {
                                if (zlpVar3.p < 0) {
                                    z = false;
                                }
                                aqxo.y(z);
                                i4 = zlpVar3.p;
                            } else {
                                if (zlpVar3.o < 0) {
                                    z = false;
                                }
                                aqxo.y(z);
                                i4 = zlpVar3.o;
                            }
                            if (z2) {
                                android.opengl.Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
                                android.opengl.Matrix.translateM(fArr, 0, -1.0f, 0.0f, 0.0f);
                            }
                            if (f2 > 0.0f) {
                                i5 = ((zlpVar3.r - i4) + 360) % 360;
                                if (z2) {
                                    i5 = (i5 + 180) % 360;
                                }
                            } else {
                                i5 = (zlpVar3.r + i4) % 360;
                            }
                            int i7 = i5 == 180 ? 270 : 90;
                            float[] fArr2 = new float[16];
                            android.opengl.Matrix.setIdentityM(fArr2, 0);
                            android.opengl.Matrix.setRotateM(fArr2, 0, i7, 0.0f, 0.0f, 1.0f);
                            zlpVar3.l.a(i6, fArr2, fArr);
                            zlpVar3.E = surfaceTexture2.getTimestamp();
                            long a = zlpVar3.a();
                            gwy gwyVar = zlpVar3.S;
                            if (gwyVar != null && (multiSegmentCameraProgressIndicator = gwyVar.a.aC) != null) {
                                multiSegmentCameraProgressIndicator.d((int) a);
                            }
                            if (zlpVar3.a == 3 && a >= zlpVar3.C) {
                                zlpVar3.f(4);
                            }
                            if (zlpVar3.z || zlpVar3.j(a)) {
                                zlpVar3.c(0);
                            }
                            zlpVar3.e();
                        }
                    });
                }
            }
            this.H++;
        }
        float[] fArr = new float[16];
        this.c.getTransformMatrix(fArr);
        float[] fArr2 = new float[16];
        android.opengl.Matrix.setIdentityM(fArr2, 0);
        this.b.a(this.d, fArr2, fArr);
        if (this.m != null) {
            int i4 = this.d;
            int[] iArr3 = new int[4];
            GLES20.glGetIntegerv(2978, iArr3, 0);
            Camera.Size previewSize = this.A.a().getParameters().getPreviewSize();
            int i5 = previewSize.height;
            int i6 = previewSize.width;
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i5 * i6 * 4);
            allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
            int[] iArr4 = new int[1];
            int[] iArr5 = new int[1];
            try {
                vqw.b("glGenFramebuffers");
                GLES20.glGenTextures(1, iArr5, 0);
                int i7 = iArr5[0];
                GLES20.glActiveTexture(33984);
                vqw.b("glActiveTexture");
                GLES20.glBindTexture(3553, i7);
                vqw.b("glBindTexture");
                iArr2 = iArr4;
                try {
                    GLES20.glTexImage2D(3553, 0, 6408, i5, i6, 0, 6408, 5121, null);
                    vqw.b("glTexImage2D");
                    GLES20.glGenFramebuffers(1, iArr2, 0);
                    GLES20.glBindFramebuffer(36160, iArr2[0]);
                    vqw.b("glBindFramebuffer");
                    GLES20.glFramebufferTexture2D(36160, 36064, 3553, i7, 0);
                    vqw.b("glFramebufferTexture2D");
                    int glCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
                    if (glCheckFramebufferStatus != 36053) {
                        iArr = iArr5;
                        i = 36160;
                        i2 = 3553;
                        try {
                            String valueOf = String.valueOf(this);
                            int glGetError = GLES20.glGetError();
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 78);
                            sb.append(valueOf);
                            sb.append(": Failed to set up render buffer with status ");
                            sb.append(glCheckFramebufferStatus);
                            sb.append(" and error ");
                            sb.append(glGetError);
                            throw new RuntimeException(sb.toString());
                        } catch (Throwable th) {
                            th = th;
                            GLES20.glBindFramebuffer(i, 0);
                            vqw.c("glBindFramebuffer");
                            GLES20.glDeleteFramebuffers(1, iArr2, 0);
                            vqw.c("glDeleteFramebuffers");
                            GLES20.glBindTexture(i2, 0);
                            vqw.c("glBindTexture");
                            GLES20.glDeleteTextures(1, iArr, 0);
                            vqw.c("glDeleteTextures");
                            GLES20.glViewport(iArr3[0], iArr3[1], iArr3[2], iArr3[3]);
                            throw th;
                        }
                    }
                    GLES20.glViewport(0, 0, i5, i6);
                    this.b.a(i4, fArr2, fArr);
                    i = 36160;
                    try {
                        GLES20.glReadPixels(0, 0, i5, i6, 6408, 5121, allocateDirect);
                        vqw.b("glReadPixels");
                        GLES20.glBindFramebuffer(36160, 0);
                        vqw.c("glBindFramebuffer");
                        GLES20.glDeleteFramebuffers(1, iArr2, 0);
                        vqw.c("glDeleteFramebuffers");
                        GLES20.glBindTexture(3553, 0);
                        vqw.c("glBindTexture");
                        GLES20.glDeleteTextures(1, iArr5, 0);
                        vqw.c("glDeleteTextures");
                        GLES20.glViewport(iArr3[0], iArr3[1], iArr3[2], iArr3[3]);
                        Bitmap createBitmap = Bitmap.createBitmap(i5, i6, Bitmap.Config.ARGB_8888);
                        createBitmap.copyPixelsFromBuffer(allocateDirect);
                        Matrix matrix = new Matrix();
                        matrix.postScale(1.0f, -1.0f);
                        final Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap, 0, 0, createBitmap.getWidth(), createBitmap.getHeight(), matrix, true);
                        final zlw zlwVar = this.m;
                        this.m = null;
                        post(new Runnable() { // from class: zls
                            @Override // java.lang.Runnable
                            public final void run() {
                                CameraView cameraView = CameraView.this;
                                zlw zlwVar2 = zlwVar;
                                Bitmap bitmap = createBitmap2;
                                for (zlz zlzVar : cameraView.r) {
                                    zlzVar.mm();
                                }
                                ((hmc) zlwVar2).aI(bitmap, false);
                                bitmap.recycle();
                            }
                        });
                    } catch (Throwable th2) {
                        th = th2;
                        iArr = iArr5;
                        i2 = 3553;
                        GLES20.glBindFramebuffer(i, 0);
                        vqw.c("glBindFramebuffer");
                        GLES20.glDeleteFramebuffers(1, iArr2, 0);
                        vqw.c("glDeleteFramebuffers");
                        GLES20.glBindTexture(i2, 0);
                        vqw.c("glBindTexture");
                        GLES20.glDeleteTextures(1, iArr, 0);
                        vqw.c("glDeleteTextures");
                        GLES20.glViewport(iArr3[0], iArr3[1], iArr3[2], iArr3[3]);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    iArr = iArr5;
                    i = 36160;
                    i2 = 3553;
                    GLES20.glBindFramebuffer(i, 0);
                    vqw.c("glBindFramebuffer");
                    GLES20.glDeleteFramebuffers(1, iArr2, 0);
                    vqw.c("glDeleteFramebuffers");
                    GLES20.glBindTexture(i2, 0);
                    vqw.c("glBindTexture");
                    GLES20.glDeleteTextures(1, iArr, 0);
                    vqw.c("glDeleteTextures");
                    GLES20.glViewport(iArr3[0], iArr3[1], iArr3[2], iArr3[3]);
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                iArr = iArr5;
                iArr2 = iArr4;
            }
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int[] i = zlg.i();
        aqxo.y(i[0] >= 0 || i[1] >= 0);
        int i2 = i[0];
        this.F = i2;
        int i3 = i[1];
        this.G = i3;
        this.E = i3;
        if (i2 >= 0 && ((Integer) ylx.g(this.M, 500L, TimeUnit.MILLISECONDS, Integer.valueOf(this.G))).intValue() == 0) {
            this.E = this.F;
        }
        this.A.i = this;
        GLSurfaceView gLSurfaceView = (GLSurfaceView) findViewById(R.id.camera_preview);
        this.B = gLSurfaceView;
        gLSurfaceView.setEGLContextClientVersion(2);
        this.B.setRenderer(this);
        this.B.setRenderMode(0);
        V("CameraView::surfaceView set Renderer");
        this.a = findViewById(R.id.camera_front_flash_torch_scrim);
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.B.requestRender();
        zlp zlpVar = this.g;
        if (zlpVar == null || !zlpVar.A) {
            return;
        }
        this.I++;
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.e = savedState.a;
        this.f164J = savedState.b;
        this.l = savedState.c;
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.a = this.e;
        savedState.b = this.f164J;
        savedState.c = this.l;
        return savedState;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        GLES20.glViewport(0, 0, i, i2);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        int i;
        int i2;
        int i3;
        V("CameraView::on surfaceView SurfaceCreated");
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        vqw.b("Couldn't generate textures.");
        GLES20.glBindTexture(36197, iArr[0]);
        vqw.b("Couldn't bind texture.");
        GLES20.glTexParameterf(36197, 10241, 9728.0f);
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        vqw.b("Couldn't set texture parameters.");
        int i4 = iArr[0];
        this.d = i4;
        this.c = new SurfaceTexture(i4);
        V("CameraView::created pipeline output surfaceTexture");
        this.c.setOnFrameAvailableListener(this);
        this.b = new vqx();
        if (this.F >= 0) {
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            Camera.getCameraInfo(this.F, cameraInfo);
            i = cameraInfo.orientation;
        } else {
            i = -1;
        }
        if (this.G >= 0) {
            Camera.CameraInfo cameraInfo2 = new Camera.CameraInfo();
            Camera.getCameraInfo(this.G, cameraInfo2);
            i2 = cameraInfo2.orientation;
        } else {
            i2 = -1;
        }
        CamcorderProfile h = h(true);
        if (h != null) {
            i3 = h.audioChannels;
        } else {
            zep.b("Couldn't find camcorder profile to prepare audio. Falling back to mono.");
            i3 = 1;
        }
        EGLContext eglGetCurrentContext = EGL14.eglGetCurrentContext();
        String valueOf = String.valueOf(eglGetCurrentContext);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 62);
        sb.append("EGLContext: CameraView::createCameraRecorder with EGLContext  ");
        sb.append(valueOf);
        V(sb.toString());
        zlp zlpVar = new zlp(eglGetCurrentContext, vrp.a, this.s, i, i2, this.l, i3, this.L, this.t, ((Boolean) this.x.b.a.a.V(axwv.d).B().aw()).booleanValue());
        synchronized (this.h) {
            this.g = zlpVar;
        }
        if (this.C) {
            if (!this.w) {
                D();
            }
            synchronized (this.i) {
                if (this.w) {
                    D();
                }
                Context context = getContext();
                EGLContext eglGetCurrentContext2 = EGL14.eglGetCurrentContext();
                String valueOf2 = String.valueOf(eglGetCurrentContext2);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 73);
                sb2.append("EGLContext:CameraView::createVideoEffectPipelineDrishti with EGLContext  ");
                sb2.append(valueOf2);
                V(sb2.toString());
                zqq zqqVar = new zqq(context, this, eglGetCurrentContext2);
                this.j = zqqVar;
                boolean z = this.f;
                zqqVar.r = z;
                zou zouVar = zqqVar.i;
                if (zouVar != null) {
                    zouVar.H = z;
                    zoi zoiVar = zouVar.c;
                    if (zoiVar != null) {
                        zoiVar.g = z;
                    }
                }
                zqqVar.E();
                zrp zrpVar = this.D;
                if (zrpVar != null) {
                    this.j.y(zrpVar);
                }
                this.j.j();
                V("CameraView::created and started videoEffectPipelineDrishti");
            }
            if (this.A.a() == null) {
                return;
            }
            X();
            return;
        }
        this.A.c(this.c);
    }

    public final void p(float f) {
        Camera.Parameters j;
        Camera a = this.A.a();
        if (a == null || (j = this.A.j(a)) == null || !j.isZoomSupported()) {
            return;
        }
        int maxZoom = j.getMaxZoom();
        w(a, j, f(f, maxZoom, 0), maxZoom, false);
    }

    @Override // defpackage.zmb
    public final void q(zly zlyVar) {
        this.K = zlyVar;
    }

    public final void r(int i) {
        this.A.e(i);
    }

    public final void s(boolean z) {
        zqq zqqVar = this.j;
        if (zqqVar != null) {
            zqqVar.x(z);
        }
        zrp zrpVar = this.D;
        if (zrpVar != null) {
            zsc zscVar = (zsc) zrpVar;
            zscVar.d = z;
            zscVar.h.b(z);
            zscVar.r();
        }
    }

    @Override // android.view.View
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.B.setOnTouchListener(onTouchListener);
    }

    public final void t(zrp zrpVar) {
        synchronized (this.i) {
            this.D = zrpVar;
            zqq zqqVar = this.j;
            if (zqqVar != null) {
                zqqVar.y(zrpVar);
            }
        }
    }

    public final void u(int i, int i2) {
        zgd.v(this.B, i, i2);
        zgd.v(this.a, i, i2);
    }

    public final void v(int i) {
        aqxo.y(this.A.a() == null);
        this.N = i;
    }

    public final void w(Camera camera, Camera.Parameters parameters, int i, int i2, boolean z) {
        parameters.setZoom(i);
        try {
            camera.setParameters(parameters);
            gxe gxeVar = this.z;
            if (gxeVar == null) {
                return;
            }
            float f = i / i2;
            ShortsZoomSlider shortsZoomSlider = gxeVar.a.aI;
            if (shortsZoomSlider == null) {
                return;
            }
            boolean z2 = !z;
            shortsZoomSlider.setProgress(Math.min(1000, (int) (f * 1000.0f)));
            if (!z2) {
                return;
            }
            shortsZoomSlider.a(0.3f);
        } catch (Exception e) {
            zep.n("Error while setting camera parameters.", e);
        }
    }

    public final void x() {
        y(g());
    }

    public final void y(int i) {
        if (i != 1) {
            i = 0;
        }
        aqxo.s(true, "cameraDirection must be one of @CameraDirection values; was %s.", i);
        synchronized (this.p) {
            while (this.o) {
                try {
                    this.p.wait();
                } catch (InterruptedException unused) {
                }
            }
        }
        this.E = i == 1 ? this.G : this.F;
        W();
        Y();
        this.B.onResume();
    }

    public final void z() {
        synchronized (this.h) {
            zlp zlpVar = this.g;
            if (zlpVar == null) {
                zep.b("Recorder has not been initialized.");
                return;
            }
            synchronized (zlpVar) {
                if (zlpVar.a == 2) {
                    zlpVar.g();
                }
            }
        }
    }

    @Override // defpackage.zmb
    public final boolean K(boolean z) {
        if (z == this.e) {
            return true;
        }
        if (!z) {
            if (J(this.A.a(), "off")) {
                this.e = false;
                return true;
            }
        } else if (J(this.A.a(), "torch")) {
            this.e = true;
            return true;
        }
        return false;
    }

    public final CamcorderProfile h(boolean z) {
        int i;
        if (!z || (i = this.F) < 0 || this.G < 0) {
            return zna.m(this.E, 20, this.N);
        }
        CamcorderProfile m = zna.m(i, 20, this.N);
        CamcorderProfile m2 = zna.m(this.G, 20, this.N);
        if (m == null) {
            return m2;
        }
        if (m2 == null) {
            return m;
        }
        return (m.videoFrameRate < 20 || m2.videoFrameRate >= 20) ? ((m2.videoFrameRate < 20 || m.videoFrameRate >= 20) && m.videoFrameWidth * m.videoFrameHeight >= m2.videoFrameWidth * m2.videoFrameHeight) ? m : m2 : m;
    }

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public final class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new xcg(13);
        boolean a;
        int b;
        int c;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.a = parcel.readInt() != 1 ? false : true;
            this.b = parcel.readInt();
            this.c = parcel.readInt();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a ? 1 : 0);
            parcel.writeInt(this.b);
            parcel.writeInt(this.c);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
