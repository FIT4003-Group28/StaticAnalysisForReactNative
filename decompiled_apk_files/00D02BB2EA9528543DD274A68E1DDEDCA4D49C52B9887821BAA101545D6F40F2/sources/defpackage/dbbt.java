package defpackage;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import android.view.Surface;
import com.google.ar.core.SharedCamera;
/* compiled from: PG */
/* renamed from: dbbt  reason: default package */
/* loaded from: classes5.dex */
public final class dbbt extends CameraDevice.StateCallback {
    public static final /* synthetic */ int d = 0;
    final /* synthetic */ Handler a;
    final /* synthetic */ CameraDevice.StateCallback b;
    final /* synthetic */ SharedCamera c;

    public dbbt(SharedCamera sharedCamera, Handler handler, CameraDevice.StateCallback stateCallback) {
        this.c = sharedCamera;
        this.a = handler;
        this.b = stateCallback;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(final CameraDevice cameraDevice) {
        Handler handler = this.a;
        final CameraDevice.StateCallback stateCallback = this.b;
        handler.post(new Runnable(stateCallback, cameraDevice) { // from class: dbbp
            private final CameraDevice.StateCallback a;
            private final CameraDevice b;

            {
                this.a = stateCallback;
                this.b = cameraDevice;
            }

            @Override // java.lang.Runnable
            public final void run() {
                CameraDevice.StateCallback stateCallback2 = this.a;
                CameraDevice cameraDevice2 = this.b;
                int i = dbbt.d;
                stateCallback2.onClosed(cameraDevice2);
            }
        });
        this.c.onDeviceClosed(cameraDevice);
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(final CameraDevice cameraDevice) {
        Handler handler = this.a;
        final CameraDevice.StateCallback stateCallback = this.b;
        handler.post(new Runnable(stateCallback, cameraDevice) { // from class: dbbr
            private final CameraDevice.StateCallback a;
            private final CameraDevice b;

            {
                this.a = stateCallback;
                this.b = cameraDevice;
            }

            @Override // java.lang.Runnable
            public final void run() {
                CameraDevice.StateCallback stateCallback2 = this.a;
                CameraDevice cameraDevice2 = this.b;
                int i = dbbt.d;
                stateCallback2.onDisconnected(cameraDevice2);
            }
        });
        this.c.onDeviceDisconnected(cameraDevice);
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(final CameraDevice cameraDevice, final int i) {
        Handler handler = this.a;
        final CameraDevice.StateCallback stateCallback = this.b;
        handler.post(new Runnable(stateCallback, cameraDevice, i) { // from class: dbbs
            private final CameraDevice.StateCallback a;
            private final CameraDevice b;
            private final int c;

            {
                this.a = stateCallback;
                this.b = cameraDevice;
                this.c = i;
            }

            @Override // java.lang.Runnable
            public final void run() {
                CameraDevice.StateCallback stateCallback2 = this.a;
                CameraDevice cameraDevice2 = this.b;
                int i2 = this.c;
                int i3 = dbbt.d;
                stateCallback2.onError(cameraDevice2, i2);
            }
        });
        this.c.close();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(final CameraDevice cameraDevice) {
        dbca dbcaVar;
        dbca dbcaVar2;
        SurfaceTexture gpuSurfaceTexture;
        dbca dbcaVar3;
        Surface gpuSurface;
        dbcaVar = this.c.sharedCameraInfo;
        dbcaVar.a = cameraDevice;
        Handler handler = this.a;
        final CameraDevice.StateCallback stateCallback = this.b;
        handler.post(new Runnable(stateCallback, cameraDevice) { // from class: dbbq
            private final CameraDevice.StateCallback a;
            private final CameraDevice b;

            {
                this.a = stateCallback;
                this.b = cameraDevice;
            }

            @Override // java.lang.Runnable
            public final void run() {
                CameraDevice.StateCallback stateCallback2 = this.a;
                CameraDevice cameraDevice2 = this.b;
                int i = dbbt.d;
                stateCallback2.onOpened(cameraDevice2);
            }
        });
        this.c.onDeviceOpened(cameraDevice);
        dbcaVar2 = this.c.sharedCameraInfo;
        gpuSurfaceTexture = this.c.getGpuSurfaceTexture();
        dbcaVar2.c = gpuSurfaceTexture;
        dbcaVar3 = this.c.sharedCameraInfo;
        gpuSurface = this.c.getGpuSurface();
        dbcaVar3.d = gpuSurface;
    }
}
