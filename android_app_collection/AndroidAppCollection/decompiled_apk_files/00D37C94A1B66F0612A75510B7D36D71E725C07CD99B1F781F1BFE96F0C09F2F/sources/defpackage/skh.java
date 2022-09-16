package defpackage;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.util.Size;
import com.google.common.util.concurrent.SettableFuture;
import java.util.Arrays;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: skh  reason: default package */
/* loaded from: classes4.dex */
public final class skh implements ski {
    public static final amzy a = amzy.l("com/google/android/libraries/ar/faceviewer/external/Camera2CameraProvider");
    public String b;
    public ankt c;
    public ankt d;
    private final CameraManager e;
    private final Executor f;

    public skh(Context context, Executor executor) {
        this.f = executor;
        this.e = (CameraManager) context.getSystemService("camera");
    }

    public final /* synthetic */ Object a(SettableFuture settableFuture, SettableFuture settableFuture2, Size size, agp agpVar) {
        try {
            CameraManager cameraManager = this.e;
            String str = this.b;
            Executor executor = this.f;
            cameraManager.openCamera(str, executor, new ske(agpVar, settableFuture, settableFuture2, size, executor));
            return "Camera2CameraProvider.startCamera";
        } catch (CameraAccessException | IllegalArgumentException | SecurityException e) {
            ((amzw) ((amzw) ((amzw) a.f()).h(e)).i("com/google/android/libraries/ar/faceviewer/external/Camera2CameraProvider", "lambda$startCamera$0", 'Y', "Camera2CameraProvider.java")).q("Opening camera failed.");
            agpVar.d(e);
            settableFuture.e(e);
            settableFuture2.e(e);
            return "Camera2CameraProvider.startCamera";
        }
    }

    @Override // defpackage.ski
    public final void b() {
        ankt anktVar = this.d;
        if (anktVar != null) {
            slf.a(anktVar, this.f);
            this.d = null;
        }
        ankt anktVar2 = this.c;
        if (anktVar2 != null) {
            slf.a(anktVar2, this.f);
            this.c = null;
        }
    }

    @Override // defpackage.ski
    public final void c() {
        try {
            for (String str : Arrays.asList(this.e.getCameraIdList())) {
                Integer num = (Integer) this.e.getCameraCharacteristics(str).get(CameraCharacteristics.LENS_FACING);
                if (num != null && num.equals(0)) {
                    this.b = str;
                    return;
                }
            }
        } catch (CameraAccessException | IllegalArgumentException e) {
            ((amzw) ((amzw) ((amzw) a.f()).h(e)).i("com/google/android/libraries/ar/faceviewer/external/Camera2CameraProvider", "initialize", '<', "Camera2CameraProvider.java")).q("Accessing camera characteristics info failed.");
        }
    }
}
