package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.os.Handler;
import com.google.ar.core.SharedCamera;
/* compiled from: PG */
/* renamed from: dbbz  reason: default package */
/* loaded from: classes5.dex */
public final class dbbz extends CameraCaptureSession.StateCallback {
    public static final /* synthetic */ int d = 0;
    final /* synthetic */ Handler a;
    final /* synthetic */ CameraCaptureSession.StateCallback b;
    final /* synthetic */ SharedCamera c;

    public dbbz(SharedCamera sharedCamera, Handler handler, CameraCaptureSession.StateCallback stateCallback) {
        this.c = sharedCamera;
        this.a = handler;
        this.b = stateCallback;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onActive(final CameraCaptureSession cameraCaptureSession) {
        Handler handler = this.a;
        final CameraCaptureSession.StateCallback stateCallback = this.b;
        handler.post(new Runnable(stateCallback, cameraCaptureSession) { // from class: dbby
            private final CameraCaptureSession.StateCallback a;
            private final CameraCaptureSession b;

            {
                this.a = stateCallback;
                this.b = cameraCaptureSession;
            }

            @Override // java.lang.Runnable
            public final void run() {
                CameraCaptureSession.StateCallback stateCallback2 = this.a;
                CameraCaptureSession cameraCaptureSession2 = this.b;
                int i = dbbz.d;
                stateCallback2.onActive(cameraCaptureSession2);
            }
        });
        this.c.onCaptureSessionActive(cameraCaptureSession);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onClosed(final CameraCaptureSession cameraCaptureSession) {
        Handler handler = this.a;
        final CameraCaptureSession.StateCallback stateCallback = this.b;
        handler.post(new Runnable(stateCallback, cameraCaptureSession) { // from class: dbbu
            private final CameraCaptureSession.StateCallback a;
            private final CameraCaptureSession b;

            {
                this.a = stateCallback;
                this.b = cameraCaptureSession;
            }

            @Override // java.lang.Runnable
            public final void run() {
                CameraCaptureSession.StateCallback stateCallback2 = this.a;
                CameraCaptureSession cameraCaptureSession2 = this.b;
                int i = dbbz.d;
                stateCallback2.onClosed(cameraCaptureSession2);
            }
        });
        this.c.onCaptureSessionClosed(cameraCaptureSession);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(final CameraCaptureSession cameraCaptureSession) {
        Handler handler = this.a;
        final CameraCaptureSession.StateCallback stateCallback = this.b;
        handler.post(new Runnable(stateCallback, cameraCaptureSession) { // from class: dbbw
            private final CameraCaptureSession.StateCallback a;
            private final CameraCaptureSession b;

            {
                this.a = stateCallback;
                this.b = cameraCaptureSession;
            }

            @Override // java.lang.Runnable
            public final void run() {
                CameraCaptureSession.StateCallback stateCallback2 = this.a;
                CameraCaptureSession cameraCaptureSession2 = this.b;
                int i = dbbz.d;
                stateCallback2.onConfigureFailed(cameraCaptureSession2);
            }
        });
        this.c.onCaptureSessionConfigureFailed(cameraCaptureSession);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(final CameraCaptureSession cameraCaptureSession) {
        dbca dbcaVar;
        dbca unused;
        unused = this.c.sharedCameraInfo;
        Handler handler = this.a;
        final CameraCaptureSession.StateCallback stateCallback = this.b;
        handler.post(new Runnable(stateCallback, cameraCaptureSession) { // from class: dbbv
            private final CameraCaptureSession.StateCallback a;
            private final CameraCaptureSession b;

            {
                this.a = stateCallback;
                this.b = cameraCaptureSession;
            }

            @Override // java.lang.Runnable
            public final void run() {
                CameraCaptureSession.StateCallback stateCallback2 = this.a;
                CameraCaptureSession cameraCaptureSession2 = this.b;
                int i = dbbz.d;
                stateCallback2.onConfigured(cameraCaptureSession2);
            }
        });
        this.c.onCaptureSessionConfigured(cameraCaptureSession);
        dbcaVar = this.c.sharedCameraInfo;
        if (dbcaVar.a != null) {
            this.c.setDummyListenerToAvoidImageBufferStarvation();
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onReady(final CameraCaptureSession cameraCaptureSession) {
        Handler handler = this.a;
        final CameraCaptureSession.StateCallback stateCallback = this.b;
        handler.post(new Runnable(stateCallback, cameraCaptureSession) { // from class: dbbx
            private final CameraCaptureSession.StateCallback a;
            private final CameraCaptureSession b;

            {
                this.a = stateCallback;
                this.b = cameraCaptureSession;
            }

            @Override // java.lang.Runnable
            public final void run() {
                CameraCaptureSession.StateCallback stateCallback2 = this.a;
                CameraCaptureSession cameraCaptureSession2 = this.b;
                int i = dbbz.d;
                stateCallback2.onReady(cameraCaptureSession2);
            }
        });
        this.c.onCaptureSessionReady(cameraCaptureSession);
    }
}
