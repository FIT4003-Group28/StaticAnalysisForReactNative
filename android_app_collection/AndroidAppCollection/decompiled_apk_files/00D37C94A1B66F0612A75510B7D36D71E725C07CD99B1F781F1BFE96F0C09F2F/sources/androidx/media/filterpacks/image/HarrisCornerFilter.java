package androidx.media.filterpacks.image;

import java.nio.ByteBuffer;
/* compiled from: PG */
/* loaded from: classes.dex */
public class HarrisCornerFilter extends asj {
    static {
        System.loadLibrary("filterframework_jni");
    }

    private static native boolean markCorners(int i, int i2, ByteBuffer byteBuffer, ByteBuffer byteBuffer2);
}
