package androidx.media.filterpacks.image;

import java.nio.ByteBuffer;
/* compiled from: PG */
/* loaded from: classes.dex */
public class ToRgbValuesFilter extends asj {
    static {
        System.loadLibrary("filterframework_jni");
    }

    private static native boolean toRgbValues(ByteBuffer byteBuffer, ByteBuffer byteBuffer2);
}
