package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import java.io.FileInputStream;
/* compiled from: PG */
/* renamed from: coux  reason: default package */
/* loaded from: classes5.dex */
public final class coux {
    public static Bitmap a(ParcelFileDescriptor parcelFileDescriptor) {
        if (parcelFileDescriptor == null) {
            return null;
        }
        FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptor.getFileDescriptor());
        try {
            return BitmapFactory.decodeStream(fileInputStream);
        } finally {
            cnxr.a(fileInputStream);
        }
    }
}
