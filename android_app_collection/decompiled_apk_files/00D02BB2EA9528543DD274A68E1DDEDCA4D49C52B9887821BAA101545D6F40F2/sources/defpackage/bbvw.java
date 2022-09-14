package defpackage;

import android.graphics.Rect;
import android.hardware.Camera;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: bbvw  reason: default package */
/* loaded from: classes3.dex */
public abstract class bbvw {
    public boolean a = false;
    protected boolean b = false;
    protected int c = 0;
    @dzsi
    protected Camera.Size d = null;

    public abstract List<Camera.Size> a(Camera.Parameters parameters);

    public void b(Camera.Parameters parameters, Camera.Size size) {
        this.d = size;
    }

    public abstract List<String> d();

    public final void e(Camera camera, @dzsi final Camera.AutoFocusCallback autoFocusCallback) {
        if (this.a) {
            camera.cancelAutoFocus();
        }
        this.a = true;
        camera.autoFocus(new Camera.AutoFocusCallback(this, autoFocusCallback) { // from class: bbvv
            private final bbvw a;
            private final Camera.AutoFocusCallback b;

            {
                this.a = this;
                this.b = autoFocusCallback;
            }

            @Override // android.hardware.Camera.AutoFocusCallback
            public final void onAutoFocus(boolean z, Camera camera2) {
                bbvw bbvwVar = this.a;
                Camera.AutoFocusCallback autoFocusCallback2 = this.b;
                bbvwVar.a = false;
                if (autoFocusCallback2 == null) {
                    camera2.cancelAutoFocus();
                } else {
                    autoFocusCallback2.onAutoFocus(z, camera2);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(Camera camera) {
        if (!this.b) {
            camera.startPreview();
            this.b = true;
        }
        Camera.Parameters parameters = camera.getParameters();
        List<String> d = d();
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        Iterator<String> it = d.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            if (supportedFocusModes.contains(next)) {
                parameters.setFocusMode(next);
                break;
            }
        }
        camera.setParameters(parameters);
        e(camera, null);
    }

    public abstract void g(Camera camera, int i);

    /* JADX INFO: Access modifiers changed from: protected */
    public final Rect c() {
        int i;
        int i2;
        Camera.Size size = this.d;
        if (size == null) {
            i = 0;
            i2 = 0;
        } else if (this.c % 180 == 0) {
            i = size.width;
            i2 = this.d.height;
        } else {
            i = size.height;
            i2 = this.d.width;
        }
        return new Rect(0, 0, i, i2);
    }
}
