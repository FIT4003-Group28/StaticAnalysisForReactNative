package defpackage;

import android.hardware.camera2.CameraDevice;
/* compiled from: PG */
/* renamed from: acen  reason: default package */
/* loaded from: classes.dex */
final class acen extends CameraDevice.StateCallback {
    final /* synthetic */ aces a;

    public acen(aces acesVar) {
        this.a = acesVar;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        this.a.e(cameraDevice, "Camera disconnected");
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i) {
        aces acesVar = this.a;
        StringBuilder sb = new StringBuilder(25);
        sb.append("Camera error: ");
        sb.append(i);
        acesVar.e(cameraDevice, sb.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a7 A[Catch: Exception -> 0x00d8, TryCatch #0 {Exception -> 0x00d8, blocks: (B:7:0x0020, B:33:0x00a7, B:35:0x00b4, B:36:0x00c2, B:37:0x00c9, B:16:0x0063, B:19:0x006e, B:20:0x0073, B:22:0x0076, B:24:0x0084, B:27:0x0093, B:26:0x0090, B:28:0x0096, B:31:0x009d, B:10:0x0052, B:13:0x005b), top: B:44:0x0020 }] */
    @Override // android.hardware.camera2.CameraDevice.StateCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onOpened(android.hardware.camera2.CameraDevice r10) {
        /*
            r9 = this;
            aces r0 = r9.a
            r0.h = r10
            java.util.concurrent.Semaphore r10 = r0.k
            int r10 = r10.availablePermits()
            r0 = 0
            r1 = 1
            if (r10 != 0) goto L10
            r10 = 1
            goto L11
        L10:
            r10 = 0
        L11:
            java.lang.String r2 = "Unexpected lock state"
            defpackage.aqxo.z(r10, r2)
            aces r10 = r9.a
            java.util.concurrent.Semaphore r10 = r10.k
            r10.release()
            aces r10 = r9.a
            r2 = 0
            android.view.TextureView r3 = r10.b     // Catch: java.lang.Exception -> Ld8
            android.graphics.SurfaceTexture r3 = r3.getSurfaceTexture()     // Catch: java.lang.Exception -> Ld8
            android.util.Size r4 = r10.g     // Catch: java.lang.Exception -> Ld8
            int r4 = r4.getWidth()     // Catch: java.lang.Exception -> Ld8
            android.util.Size r5 = r10.g     // Catch: java.lang.Exception -> Ld8
            int r5 = r5.getHeight()     // Catch: java.lang.Exception -> Ld8
            r3.setDefaultBufferSize(r4, r5)     // Catch: java.lang.Exception -> Ld8
            android.view.Surface r4 = new android.view.Surface     // Catch: java.lang.Exception -> Ld8
            r4.<init>(r3)     // Catch: java.lang.Exception -> Ld8
            android.hardware.camera2.CameraDevice r3 = r10.h     // Catch: java.lang.Exception -> Ld8
            r5 = 3
            android.hardware.camera2.CaptureRequest$Builder r3 = r3.createCaptureRequest(r5)     // Catch: java.lang.Exception -> Ld8
            r10.e = r3     // Catch: java.lang.Exception -> Ld8
            android.hardware.camera2.CaptureRequest$Builder r3 = r10.e     // Catch: java.lang.Exception -> Ld8
            r3.addTarget(r4)     // Catch: java.lang.Exception -> Ld8
            android.hardware.camera2.CameraCharacteristics r3 = r10.a()     // Catch: java.lang.Exception -> Ld8
            android.hardware.camera2.CameraCharacteristics$Key r5 = android.hardware.camera2.CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL     // Catch: java.lang.Exception -> Ld8
            r6 = 2
            if (r3 != 0) goto L52
            goto L5f
        L52:
            java.lang.Object r5 = r3.get(r5)     // Catch: java.lang.Exception -> Ld8
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: java.lang.Exception -> Ld8
            if (r5 != 0) goto L5b
            goto L5f
        L5b:
            int r6 = r5.intValue()     // Catch: java.lang.Exception -> Ld8
        L5f:
            if (r3 != 0) goto L63
        L61:
            r0 = r2
            goto La5
        L63:
            android.hardware.camera2.CameraCharacteristics$Key r5 = android.hardware.camera2.CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES     // Catch: java.lang.Exception -> Ld8
            java.lang.Object r3 = r3.get(r5)     // Catch: java.lang.Exception -> Ld8
            android.util.Range[] r3 = (android.util.Range[]) r3     // Catch: java.lang.Exception -> Ld8
            if (r3 != 0) goto L6e
            goto L61
        L6e:
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Exception -> Ld8
            r5.<init>()     // Catch: java.lang.Exception -> Ld8
        L73:
            int r7 = r3.length     // Catch: java.lang.Exception -> Ld8
            if (r0 >= r7) goto L96
            r7 = r3[r0]     // Catch: java.lang.Exception -> Ld8
            r8 = 15
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Exception -> Ld8
            boolean r8 = r7.contains(r8)     // Catch: java.lang.Exception -> Ld8
            if (r8 != 0) goto L90
            r8 = 15000(0x3a98, float:2.102E-41)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Exception -> Ld8
            boolean r8 = r7.contains(r8)     // Catch: java.lang.Exception -> Ld8
            if (r8 == 0) goto L93
        L90:
            r5.add(r7)     // Catch: java.lang.Exception -> Ld8
        L93:
            int r0 = r0 + 1
            goto L73
        L96:
            boolean r0 = r5.isEmpty()     // Catch: java.lang.Exception -> Ld8
            if (r0 == 0) goto L9d
            goto L61
        L9d:
            java.util.Comparator r0 = defpackage.aces.a     // Catch: java.lang.Exception -> Ld8
            java.lang.Object r0 = java.util.Collections.min(r5, r0)     // Catch: java.lang.Exception -> Ld8
            android.util.Range r0 = (android.util.Range) r0     // Catch: java.lang.Exception -> Ld8
        La5:
            if (r0 == 0) goto Lc9
            java.lang.String r3 = java.lang.String.valueOf(r0)     // Catch: java.lang.Exception -> Ld8
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Exception -> Ld8
            r3.length()     // Catch: java.lang.Exception -> Ld8
            if (r6 != r1) goto Lc2
            android.hardware.camera2.CaptureRequest$Builder r1 = r10.e     // Catch: java.lang.Exception -> Ld8
            android.hardware.camera2.CaptureRequest$Key r3 = android.hardware.camera2.CaptureRequest.SENSOR_FRAME_DURATION     // Catch: java.lang.Exception -> Ld8
            r5 = 66666666(0x3f940aa, double:3.29377094E-316)
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Exception -> Ld8
            r1.set(r3, r5)     // Catch: java.lang.Exception -> Ld8
        Lc2:
            android.hardware.camera2.CaptureRequest$Builder r1 = r10.e     // Catch: java.lang.Exception -> Ld8
            android.hardware.camera2.CaptureRequest$Key r3 = android.hardware.camera2.CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE     // Catch: java.lang.Exception -> Ld8
            r1.set(r3, r0)     // Catch: java.lang.Exception -> Ld8
        Lc9:
            android.hardware.camera2.CameraDevice r0 = r10.h     // Catch: java.lang.Exception -> Ld8
            java.util.List r1 = java.util.Collections.singletonList(r4)     // Catch: java.lang.Exception -> Ld8
            aceo r3 = new aceo     // Catch: java.lang.Exception -> Ld8
            r3.<init>(r10)     // Catch: java.lang.Exception -> Ld8
            r0.createCaptureSession(r1, r3, r2)     // Catch: java.lang.Exception -> Ld8
            return
        Ld8:
            r0 = move-exception
            java.lang.String r1 = "CameraPreviewCtrl"
            java.lang.String r3 = "Could not create capture session"
            android.util.Log.e(r1, r3, r0)
            r10.e = r2
            acfv r10 = r10.l
            if (r10 == 0) goto Le9
            r10.a(r0)
        Le9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acen.onOpened(android.hardware.camera2.CameraDevice):void");
    }
}
