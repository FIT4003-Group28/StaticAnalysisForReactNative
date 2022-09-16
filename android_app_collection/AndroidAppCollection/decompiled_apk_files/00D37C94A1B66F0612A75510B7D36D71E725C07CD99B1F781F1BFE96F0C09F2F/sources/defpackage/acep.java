package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
/* compiled from: PG */
/* renamed from: acep  reason: default package */
/* loaded from: classes.dex */
final class acep extends CameraCaptureSession.CaptureCallback {
    boolean a;
    final /* synthetic */ CaptureRequest b;
    final /* synthetic */ aces c;

    public acep(aces acesVar, CaptureRequest captureRequest) {
        this.c = acesVar;
        this.b = captureRequest;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
        super.onCaptureStarted(cameraCaptureSession, captureRequest, j, j2);
        if (!this.a) {
            this.c.g(this.b, null);
            this.a = true;
            acfv acfvVar = this.c.l;
            if (acfvVar == null) {
                return;
            }
            acfvVar.a.b.setVisibility(0);
            acfvVar.a.e.setVisibility(8);
        }
    }
}
