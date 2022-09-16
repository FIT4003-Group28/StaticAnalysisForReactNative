package defpackage;

import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import com.google.android.youtube.R;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: abrw  reason: default package */
/* loaded from: classes.dex */
public final class abrw implements Runnable, abtg {
    public final int a;
    public boolean b;
    public int c;
    public int d;
    public abrs e;
    public int f;
    private final ExecutorService g;
    private final double h;
    private final boolean i;
    private int j;
    private int k;
    private Camera l;
    private SurfaceTexture m;
    private SurfaceTexture n;
    private boolean o;

    public abrw(double d, boolean z) {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new abru());
        this.a = Camera.getNumberOfCameras();
        this.c = 1;
        this.d = 1;
        this.j = -1;
        this.k = -1;
        this.g = newSingleThreadExecutor;
        this.h = d;
        this.i = z;
    }

    public static void g(Camera.Parameters parameters) {
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        if (supportedFocusModes.contains("continuous-video")) {
            parameters.setFocusMode("continuous-video");
        } else if (supportedFocusModes.contains("continuous-picture")) {
            parameters.setFocusMode("continuous-picture");
        } else if (supportedFocusModes.contains("edof")) {
            parameters.setFocusMode("edof");
        } else if (supportedFocusModes.contains("infinity")) {
            parameters.setFocusMode("infinity");
        }
        String valueOf = String.valueOf(parameters.getFocusMode());
        if (valueOf.length() != 0) {
            "Focus mode: ".concat(valueOf);
        }
    }

    private final synchronized Camera o(int i) {
        Camera camera;
        if (Camera.getNumberOfCameras() != 0) {
            camera = null;
            for (int i2 = 2; camera == null && this.k == i && i2 >= 0; i2--) {
                try {
                    camera = Camera.open(i);
                } catch (RuntimeException e) {
                    if (i2 > 0) {
                        try {
                            wait(500L);
                        } catch (InterruptedException e2) {
                            throw new abrt(e2);
                        }
                    } else {
                        throw new abrt(e);
                    }
                }
            }
            throw new abrt(new Throwable("Interrupted with a camera change"));
        }
        throw new abrv();
        return camera;
    }

    private final void p() {
        Camera camera;
        synchronized (this) {
            camera = this.l;
            this.l = null;
        }
        if (camera != null) {
            if (this.o) {
                camera.stopPreview();
            }
            camera.release();
        }
        this.o = false;
        this.j = -1;
    }

    private static boolean q(Camera.Parameters parameters) {
        List<String> supportedSceneModes;
        return (parameters == null || (supportedSceneModes = parameters.getSupportedSceneModes()) == null || !supportedSceneModes.contains("hdr")) ? false : true;
    }

    public final int a() {
        try {
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            Camera.getCameraInfo(b(), cameraInfo);
            return cameraInfo.facing;
        } catch (Exception e) {
            zep.d("Error obtaining camera info: ", e);
            return -1;
        }
    }

    public final synchronized int b() {
        return this.k;
    }

    final Future d(int i) {
        boolean z = true;
        aqxo.p(i >= -1);
        if (i >= this.a) {
            z = false;
        }
        aqxo.p(z);
        this.k = i;
        notifyAll();
        return this.g.submit(this);
    }

    public final synchronized void e() {
        d((this.k + 1) % this.a);
    }

    @Override // defpackage.abtg
    public final void f() {
        Future d;
        synchronized (this) {
            d = d(-1);
        }
        if (d != null) {
            try {
                d.get(30L, TimeUnit.SECONDS);
            } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e) {
                zep.d("CameraVideoSource: ", e);
            }
        }
    }

    public final synchronized void h(int i) {
        d(i);
    }

    @Override // defpackage.abtg
    public final synchronized void i(SurfaceTexture surfaceTexture) {
        if (surfaceTexture == null) {
            this.m = null;
            this.n = null;
        } else if (this.m == null) {
            this.m = surfaceTexture;
            notifyAll();
        } else {
            this.n = surfaceTexture;
            this.g.submit(this);
        }
    }

    public final synchronized void j() {
        int numberOfCameras = Camera.getNumberOfCameras();
        int i = numberOfCameras - 1;
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        int i2 = 0;
        while (true) {
            if (i2 >= numberOfCameras) {
                break;
            }
            Camera.getCameraInfo(i2, cameraInfo);
            if (cameraInfo.facing == 1) {
                i = i2;
                break;
            }
            i2++;
        }
        d(i);
    }

    public final boolean k(String str) {
        Camera camera = this.l;
        if (camera != null) {
            try {
                Camera.Parameters parameters = camera.getParameters();
                List<String> supportedFlashModes = parameters.getSupportedFlashModes();
                return (parameters.getFlashMode() == null || supportedFlashModes == null || !supportedFlashModes.contains(str)) ? false : true;
            } catch (Exception e) {
                zep.n("Error while getting camera parameters.", e);
            }
        }
        return false;
    }

    public final synchronized boolean l(String str) {
        if (this.l == null || !k(str)) {
            return false;
        }
        try {
            Camera.Parameters parameters = this.l.getParameters();
            parameters.setFlashMode(str);
            this.l.setParameters(parameters);
            return true;
        } catch (Exception e) {
            zep.n("Error while setting camera flash light mode", e);
            return false;
        }
    }

    public final synchronized void m(float f, float f2, int i, acjx acjxVar) {
        Camera camera = this.l;
        if (camera != null) {
            try {
                Camera.Parameters parameters = camera.getParameters();
                try {
                    this.l.cancelAutoFocus();
                    if (parameters.getMaxNumFocusAreas() > 0) {
                        parameters.setFocusAreas(amuk.r(new Camera.Area(c(f, f2, i, 200.0f), 800)));
                    }
                    if (parameters.getMaxNumMeteringAreas() > 0) {
                        parameters.setMeteringAreas(amuk.r(new Camera.Area(c(f, f2, i, 300.0f), 800)));
                    }
                    if (parameters.getMaxNumFocusAreas() <= 0 && parameters.getMaxNumMeteringAreas() <= 0) {
                        return;
                    }
                    int i2 = (int) f;
                    int i3 = (int) f2;
                    acke ackeVar = acjxVar.a;
                    Animation loadAnimation = AnimationUtils.loadAnimation(ackeVar.rb(), R.anim.focus_inner_circle_anim);
                    Animation loadAnimation2 = AnimationUtils.loadAnimation(ackeVar.rb(), R.anim.focus_outer_circle_anim);
                    ackeVar.au.setAnimation(loadAnimation);
                    ackeVar.av.setAnimation(loadAnimation2);
                    ImageView imageView = ackeVar.av;
                    zgd.t(imageView, zgd.b(zgd.l(i2 - (imageView.getWidth() / 2)), zgd.p(i3 - (ackeVar.av.getHeight() / 2))), ViewGroup.MarginLayoutParams.class);
                    ImageView imageView2 = ackeVar.au;
                    zgd.t(imageView2, zgd.b(zgd.l(i2 - (imageView2.getWidth() / 2)), zgd.p(i3 - (ackeVar.au.getHeight() / 2))), ViewGroup.MarginLayoutParams.class);
                    loadAnimation.start();
                    loadAnimation2.start();
                    if (parameters == null || !parameters.getSupportedFocusModes().contains("auto")) {
                        return;
                    }
                    parameters.setFocusMode("auto");
                    this.l.setParameters(parameters);
                    this.l.autoFocus(abrp.a);
                } catch (RuntimeException e) {
                    String valueOf = String.valueOf(e.getMessage());
                    zep.b(valueOf.length() != 0 ? "Error setting camera parameters ".concat(valueOf) : new String("Error setting camera parameters "));
                }
            } catch (Exception e2) {
                zep.d("Error while getting camera parameters.", e2);
            }
        }
    }

    public final synchronized void n(float f) {
        Camera camera = this.l;
        if (camera != null) {
            try {
                Camera.Parameters parameters = camera.getParameters();
                if (parameters.isZoomSupported()) {
                    float f2 = -1.0f;
                    float f3 = f - 1.0f;
                    if (Math.abs(f3) >= 0.001f) {
                        int zoom = parameters.getZoom();
                        int max = Math.max(parameters.getMaxZoom(), 1);
                        float f4 = f3 * max;
                        if (Math.abs(f4) >= 1.0f) {
                            f2 = f4;
                        } else if (f4 > 0.0f) {
                            f2 = 1.0f;
                        }
                        parameters.setZoom(Math.max(0, Math.min(max, Math.round(zoom + f2))));
                        try {
                            this.l.setParameters(parameters);
                        } catch (Exception e) {
                            zep.n("Error while setting camera parameters.", e);
                        }
                    }
                }
            } catch (Exception e2) {
                zep.n("Error while getting camera parameters.", e2);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        SurfaceTexture surfaceTexture = this.n;
        if (surfaceTexture != null && surfaceTexture != this.m) {
            Camera camera = this.l;
            if (camera != null && this.o) {
                try {
                    camera.stopPreview();
                    this.l.setPreviewTexture(this.n);
                    this.l.startPreview();
                } catch (IOException unused) {
                }
            }
            this.m = this.n;
            this.n = null;
        }
        if (this.k == this.j) {
            return;
        }
        p();
        int i = this.k;
        if (i == -1) {
            return;
        }
        try {
            synchronized (this) {
                this.l = o(i);
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                Camera.getCameraInfo(i, cameraInfo);
                this.b = cameraInfo.canDisableShutterSound;
                Camera camera2 = this.l;
                this.f = cameraInfo.orientation;
                if (cameraInfo.facing == 1) {
                    camera2.setDisplayOrientation((360 - cameraInfo.orientation) % 360);
                } else {
                    camera2.setDisplayOrientation(cameraInfo.orientation);
                }
                z = cameraInfo.facing == 1;
                Camera.Parameters parameters = this.l.getParameters();
                int i2 = (int) (this.h * 1000.0d);
                List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
                long j = parameters.getPreferredPreviewSizeForVideo() != null ? parameters.getPreferredPreviewSizeForVideo().width * parameters.getPreferredPreviewSizeForVideo().height : -1L;
                Iterator<Camera.Size> it = supportedPreviewSizes.iterator();
                while (it.hasNext()) {
                    Camera.Size next = it.next();
                    if (j > 0) {
                        if (next.width * next.height > j) {
                            it.remove();
                        }
                    }
                }
                Camera.Size size = (Camera.Size) Collections.min(supportedPreviewSizes, new abrq(i2, 1));
                int i3 = size.width;
                int i4 = size.height;
                parameters.setPreviewSize(size.width, size.height);
                double d = size.width;
                double d2 = size.height;
                Double.isNaN(d);
                Double.isNaN(d2);
                Camera.Size size2 = (Camera.Size) Collections.min(parameters.getSupportedPictureSizes(), new abrq((int) ((d / d2) * 1000.0d)));
                Camera.Size pictureSize = parameters.getPictureSize();
                if (pictureSize != null && !pictureSize.equals(size2)) {
                    parameters.setPictureSize(size2.width, size2.height);
                    int i5 = size2.width;
                    int i6 = size2.height;
                }
                this.c = size.width;
                this.d = size.height;
                int[] iArr = {30000, 30000};
                int i7 = Integer.MAX_VALUE;
                for (int[] iArr2 : parameters.getSupportedPreviewFpsRange()) {
                    int abs = Math.abs(iArr2[0]) + Math.abs(iArr2[1] - 30000);
                    int i8 = abs < i7 ? abs : i7;
                    if (abs < i7) {
                        iArr = iArr2;
                    }
                    i7 = i8;
                }
                parameters.setPreviewFpsRange(iArr[0], iArr[1]);
                g(parameters);
                parameters.setRecordingHint(true);
                if (this.i && q(parameters)) {
                    parameters.setSceneMode("hdr");
                }
                this.l.setParameters(parameters);
                int i9 = cameraInfo.facing == 1 ? 2 : 3;
                boolean q = q(parameters);
                abxa b = abxa.b();
                abwz a = b.a(asth.class);
                if (a.e && b.c) {
                    astf astfVar = (astf) abxa.e(asth.class, b.d(a));
                    if (astfVar == null) {
                        zep.b("Could not create camera metric");
                    } else {
                        aopa createBuilder = astg.a.createBuilder();
                        createBuilder.copyOnWrite();
                        astg astgVar = (astg) createBuilder.instance;
                        astgVar.c = i9 - 1;
                        astgVar.b |= 1;
                        createBuilder.copyOnWrite();
                        astg astgVar2 = (astg) createBuilder.instance;
                        astgVar2.b = 2 | astgVar2.b;
                        astgVar2.d = q;
                        astg astgVar3 = (astg) createBuilder.mo39build();
                        astfVar.copyOnWrite();
                        asth asthVar = (asth) astfVar.instance;
                        asth asthVar2 = asth.a;
                        astgVar3.getClass();
                        aopu aopuVar = asthVar.f;
                        if (!aopuVar.c()) {
                            asthVar.f = aopi.mutableCopy(aopuVar);
                        }
                        asthVar.f.add(astgVar3);
                        b.h(astfVar);
                    }
                }
                while (this.m == null && i == this.k) {
                    try {
                        wait();
                    } catch (InterruptedException unused2) {
                        zep.l("CameraVideoSource: Interrupted while waiting for SurfaceTexture");
                    }
                }
                if (i == this.k) {
                    SurfaceTexture surfaceTexture2 = this.m;
                    if (surfaceTexture2 == null) {
                        throw new IllegalStateException("Camera currentSurfaceTexture is null");
                    }
                    this.l.setPreviewTexture(surfaceTexture2);
                } else {
                    throw new abrr();
                }
            }
            this.l.startPreview();
            this.o = true;
            this.j = i;
            abrs abrsVar = this.e;
            if (abrsVar == null) {
                return;
            }
            abrsVar.a(z);
        } catch (Exception e) {
            zep.d("Error initializing camera preview", e);
            p();
        }
    }

    final Rect c(float f, float f2, int i, float f3) {
        int i2 = (i - this.f) % 360;
        if (i2 < 0) {
            i2 += 360;
        }
        if (i2 == 90) {
            float f4 = this.c - f2;
            f2 = f;
            f = f4;
        } else if (i2 == 180) {
            f = this.c - f;
            f2 = this.d - f2;
        } else if (i2 == 270) {
            f2 = this.d - f;
            f = f2;
        }
        double d = (f / this.c) * 2000.0f;
        Double.isNaN(d);
        int i3 = (int) (d - 1000.0d);
        double d2 = (f2 / this.d) * 2000.0f;
        Double.isNaN(d2);
        int i4 = (int) (d2 - 1000.0d);
        int i5 = (int) (f3 / 2.0f);
        return new Rect(Math.min(Math.max(-1000, i3 - i5), 1000), Math.min(Math.max(-1000, i4 - i5), 1000), Math.min(Math.max(-1000, i3 + i5), 1000), Math.min(Math.max(-1000, i4 + i5), 1000));
    }
}
