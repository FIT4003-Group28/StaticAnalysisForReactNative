package defpackage;

import android.graphics.Bitmap;
import android.media.FaceDetector;
/* compiled from: PG */
/* renamed from: cdgu  reason: default package */
/* loaded from: classes4.dex */
final class cdgu implements cdgw {
    @Override // defpackage.cdgw
    public final cdgv a(Bitmap bitmap) {
        if (!Bitmap.Config.RGB_565.equals(bitmap.getConfig())) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int[] iArr = new int[width * height];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            bitmap = Bitmap.createBitmap(iArr, width, height, Bitmap.Config.RGB_565);
        }
        if (!Bitmap.Config.RGB_565.equals(bitmap.getConfig())) {
            return cdgv.c(dcdc.e(), cdhg.FACE_DETECTION_NON_RGB_565_BITMAP);
        }
        if (bitmap.getWidth() % 2 != 0) {
            if (bitmap.getWidth() > 1) {
                bitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth() - 1, bitmap.getHeight());
                if (bitmap == null) {
                    return cdgv.c(dcdc.e(), cdhg.FACE_DETECTION_FAILED_TO_CROP_BITMAP);
                }
            } else {
                return cdgv.c(dcdc.e(), cdhg.FACE_DETECTION_ODD_WIDTH_BITMAP);
            }
        }
        FaceDetector.Face[] faceArr = new FaceDetector.Face[3];
        int findFaces = new FaceDetector(bitmap.getWidth(), bitmap.getHeight(), 3).findFaces(bitmap, faceArr);
        if (findFaces != 0) {
            dccx F = dcdc.F();
            for (int i = 0; i < findFaces; i++) {
                F.g(new cdgt(faceArr[i]));
            }
            return cdgv.c(F.f(), null);
        }
        return cdgv.c(dcdc.e(), null);
    }
}
