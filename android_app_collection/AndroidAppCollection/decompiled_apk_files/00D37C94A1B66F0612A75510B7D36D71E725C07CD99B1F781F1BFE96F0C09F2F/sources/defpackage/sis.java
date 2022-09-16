package defpackage;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import j$.util.Optional;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: sis  reason: default package */
/* loaded from: classes4.dex */
public final class sis {
    private static final amzy a = amzy.l("com/google/android/libraries/ar/faceviewer/components/rendering/CameraSizesGetter");

    public static Optional a(Context context, Integer num) {
        CameraManager cameraManager = (CameraManager) context.getSystemService("camera");
        try {
            for (String str : Arrays.asList(cameraManager.getCameraIdList())) {
                CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
                if (num.equals(cameraCharacteristics.get(CameraCharacteristics.LENS_FACING))) {
                    return Optional.of(cameraCharacteristics);
                }
            }
        } catch (CameraAccessException e) {
            ((amzw) ((amzw) ((amzw) a.f()).h(e)).i("com/google/android/libraries/ar/faceviewer/components/rendering/CameraSizesGetter", "getCameraCharacteristics", '/', "CameraSizesGetter.java")).q("Accessing camera ID info got error.");
        }
        return Optional.empty();
    }
}
