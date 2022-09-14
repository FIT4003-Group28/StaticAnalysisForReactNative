package defpackage;

import android.graphics.Bitmap;
/* compiled from: PG */
/* renamed from: cpfe  reason: default package */
/* loaded from: classes5.dex */
public final class cpfe {
    public static final cpfg a(cpfg cpfgVar) {
        if (cpfgVar.b != null) {
            return cpfgVar;
        }
        throw new IllegalStateException("Missing image data.  Call either setBitmap or setImageData to specify the image");
    }

    public static final void b(Bitmap bitmap, cpfg cpfgVar) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        cpfgVar.b = bitmap;
        cpff cpffVar = cpfgVar.a;
        cpffVar.a = width;
        cpffVar.b = height;
    }
}
