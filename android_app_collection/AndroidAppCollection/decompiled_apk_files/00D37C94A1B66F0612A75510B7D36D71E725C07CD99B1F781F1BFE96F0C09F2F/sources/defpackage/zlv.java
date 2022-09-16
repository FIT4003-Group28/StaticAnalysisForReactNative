package defpackage;

import android.hardware.Camera;
/* compiled from: PG */
/* renamed from: zlv  reason: default package */
/* loaded from: classes4.dex */
public final class zlv implements Camera.AutoFocusCallback {
    final /* synthetic */ String a;

    public zlv(String str) {
        this.a = str;
    }

    @Override // android.hardware.Camera.AutoFocusCallback
    public final void onAutoFocus(boolean z, Camera camera) {
        try {
            Camera.Parameters parameters = camera.getParameters();
            parameters.setFocusMode(this.a);
            camera.setParameters(parameters);
        } catch (RuntimeException unused) {
            zep.b("Camera is used after being released.");
        }
    }
}
