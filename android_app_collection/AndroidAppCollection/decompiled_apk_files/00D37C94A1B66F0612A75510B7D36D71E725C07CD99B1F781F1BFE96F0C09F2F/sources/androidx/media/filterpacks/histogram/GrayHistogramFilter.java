package androidx.media.filterpacks.histogram;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
/* compiled from: PG */
/* loaded from: classes.dex */
public final class GrayHistogramFilter extends asj {
    static {
        System.loadLibrary("filterframework_jni");
    }

    private static native void extractHistogram(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, IntBuffer intBuffer);
}
