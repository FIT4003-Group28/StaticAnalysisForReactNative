package com.google.geo.imagery.viewer.api;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class Image {
    private long a;

    protected Image(long j) {
        this.a = j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static long a(Image image) {
        if (image == null) {
            return 0L;
        }
        return image.a;
    }

    public static Image c(Bitmap bitmap) {
        if (bitmap.isRecycled()) {
            return null;
        }
        int byteCount = bitmap.getByteCount();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(byteCount);
        bitmap.copyPixelsToBuffer(allocateDirect);
        Bitmap.Config config = bitmap.getConfig();
        Bitmap.Config config2 = Bitmap.Config.RGB_565;
        long Image_newImage = ImageSwigJNI.Image_newImage(allocateDirect, byteCount, bitmap.getWidth(), bitmap.getHeight(), config == config2 ? 6407 : 6408, config == config2 ? 33635 : 5121);
        if (Image_newImage != 0) {
            return new Image(Image_newImage);
        }
        return null;
    }

    public final synchronized void b() {
        if (this.a != 0) {
            this.a = 0L;
        }
    }

    protected final void finalize() {
        b();
    }
}
