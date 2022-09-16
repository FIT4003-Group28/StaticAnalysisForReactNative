package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: skg  reason: default package */
/* loaded from: classes4.dex */
final class skg extends CameraCaptureSession.StateCallback {
    private final SettableFuture a;
    private final CaptureRequest b;
    private final Executor c;

    public skg(SettableFuture settableFuture, CaptureRequest captureRequest, Executor executor) {
        this.a = settableFuture;
        this.b = captureRequest;
        this.c = executor;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        this.a.e(new RuntimeException("Set camera request failed."));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        CaptureRequest captureRequest = this.b;
        if (captureRequest != null) {
            try {
                cameraCaptureSession.setSingleRepeatingRequest(captureRequest, this.c, new skf());
                this.a.o(cameraCaptureSession);
            } catch (CameraAccessException | IllegalArgumentException | IllegalStateException e) {
                ((amzw) ((amzw) ((amzw) skh.a.f()).h(e)).i("com/google/android/libraries/ar/faceviewer/external/Camera2CameraProvider$SessionCallback", "onConfigured", (char) 211, "Camera2CameraProvider.java")).q("Set camera request failed.");
                this.a.e(e);
            }
        }
    }
}
