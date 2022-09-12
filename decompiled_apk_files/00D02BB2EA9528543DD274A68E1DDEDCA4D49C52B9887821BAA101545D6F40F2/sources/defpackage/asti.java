package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
/* compiled from: PG */
/* renamed from: asti  reason: default package */
/* loaded from: classes2.dex */
public enum asti {
    FULL,
    HALF,
    EMPTY;

    public final Bitmap a(Resources resources, boolean z) {
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    throw null;
                }
                return BitmapFactory.decodeResource(resources, true != z ? 2131231747 : 2131231752);
            }
            Bitmap decodeResource = BitmapFactory.decodeResource(resources, true != z ? 2131231628 : 2131231629);
            if (!bvox.c(resources)) {
                return decodeResource;
            }
            Matrix matrix = new Matrix();
            matrix.preScale(-1.0f, 1.0f);
            return Bitmap.createBitmap(decodeResource, 0, 0, decodeResource.getWidth(), decodeResource.getHeight(), matrix, false);
        }
        return BitmapFactory.decodeResource(resources, 2131231748);
    }
}
