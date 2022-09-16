package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.util.Log;
/* compiled from: PG */
/* renamed from: aceo  reason: default package */
/* loaded from: classes.dex */
final class aceo extends CameraCaptureSession.StateCallback {
    final /* synthetic */ aces a;

    public aceo(aces acesVar) {
        this.a = acesVar;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        super.onClosed(cameraCaptureSession);
        this.a.i = null;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        Log.e("CameraPreviewCtrl", "Could not configure camera preview");
        aces acesVar = this.a;
        acesVar.e = null;
        acfv acfvVar = acesVar.l;
        if (acfvVar != null) {
            acfvVar.a(new RuntimeException("Could not configure camera preview"));
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        aces acesVar = this.a;
        if (acesVar.h == null) {
            return;
        }
        acesVar.i = cameraCaptureSession;
        acesVar.e.set(CaptureRequest.CONTROL_MODE, 1);
        CameraCharacteristics a = this.a.a();
        if (aces.j(a, CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES, 3)) {
            this.a.e.set(CaptureRequest.CONTROL_AF_MODE, 3);
        }
        if (aces.j(a, CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES, 2)) {
            this.a.e.set(CaptureRequest.CONTROL_AE_MODE, 2);
        }
        this.a.i();
    }
}
