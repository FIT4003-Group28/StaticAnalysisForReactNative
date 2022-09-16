package defpackage;

import android.hardware.Camera;
/* compiled from: PG */
/* renamed from: abrp  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class abrp implements Camera.AutoFocusCallback {
    public static final /* synthetic */ abrp a = new abrp();

    private /* synthetic */ abrp() {
    }

    @Override // android.hardware.Camera.AutoFocusCallback
    public final void onAutoFocus(boolean z, Camera camera) {
        try {
            Camera.Parameters parameters = camera.getParameters();
            abrw.g(parameters);
            camera.setParameters(parameters);
        } catch (Exception e) {
            zep.d("Error while resetting camera parameters.", e);
        }
    }
}
