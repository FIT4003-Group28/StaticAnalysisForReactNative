package defpackage;

import android.app.Application;
import android.hardware.Camera;
import java.util.List;
/* compiled from: PG */
/* renamed from: bbzd  reason: default package */
/* loaded from: classes3.dex */
public final class bbzd extends bbvw {
    public final Application e;
    public final ahjq f;
    public final bvrb g;
    public final bcpe h;

    public bbzd(Application application, ahjq ahjqVar, bvrb bvrbVar, bcpe bcpeVar) {
        this.e = application;
        this.f = ahjqVar;
        this.g = bvrbVar;
        this.h = bcpeVar;
    }

    @Override // defpackage.bbvw
    public final List<Camera.Size> a(Camera.Parameters parameters) {
        return parameters.getSupportedPictureSizes();
    }

    @Override // defpackage.bbvw
    public final void b(Camera.Parameters parameters, Camera.Size size) {
        this.d = size;
        parameters.setPictureSize(size.width, size.height);
    }

    @Override // defpackage.bbvw
    public final List<String> d() {
        return dcdc.g("continuous-picture", "auto");
    }

    @Override // defpackage.bbvw
    public final void g(Camera camera, int i) {
        camera.setDisplayOrientation(i);
    }
}
