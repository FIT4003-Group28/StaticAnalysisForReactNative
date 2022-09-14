package com.google.android.filament;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;
/* compiled from: PG */
/* loaded from: classes.dex */
final class NioUtils {

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    enum BufferType {
        BYTE,
        CHAR,
        SHORT,
        INT,
        LONG,
        FLOAT,
        DOUBLE
    }

    private NioUtils() {
    }

    static Object getBaseArray(Buffer buffer) {
        if (buffer.hasArray()) {
            return buffer.array();
        }
        return null;
    }

    static int getBaseArrayOffset(Buffer buffer, int i) {
        if (buffer.hasArray()) {
            return (buffer.arrayOffset() + buffer.position()) << i;
        }
        return 0;
    }

    static long getBasePointer(Buffer buffer, long j, int i) {
        if (j != 0) {
            return j + (buffer.position() << i);
        }
        return 0L;
    }

    static int getBufferType(Buffer buffer) {
        if (buffer instanceof ByteBuffer) {
            return BufferType.BYTE.ordinal();
        }
        if (buffer instanceof CharBuffer) {
            return BufferType.CHAR.ordinal();
        }
        if (buffer instanceof ShortBuffer) {
            return BufferType.SHORT.ordinal();
        }
        if (buffer instanceof IntBuffer) {
            return BufferType.INT.ordinal();
        }
        if (buffer instanceof LongBuffer) {
            return BufferType.LONG.ordinal();
        }
        if (buffer instanceof FloatBuffer) {
            return BufferType.FLOAT.ordinal();
        }
        return BufferType.DOUBLE.ordinal();
    }
}
