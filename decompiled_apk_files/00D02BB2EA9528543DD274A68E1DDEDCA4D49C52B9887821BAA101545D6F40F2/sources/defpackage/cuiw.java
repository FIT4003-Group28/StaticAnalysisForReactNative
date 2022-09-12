package defpackage;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;
/* compiled from: PG */
/* renamed from: cuiw  reason: default package */
/* loaded from: classes5.dex */
public final class cuiw {
    public static final byte[] a(Bitmap bitmap, int i) {
        if (bitmap == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, i, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }
}
