package com.google.android.filament;

import java.nio.Buffer;
import java.nio.BufferOverflowException;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class IndexBuffer {
    private long mNativeObject;

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public class Builder {
        private final BuilderFinalizer mFinalizer;
        private final long mNativeBuilder;

        /* compiled from: PG */
        /* loaded from: classes5.dex */
        class BuilderFinalizer {
            private final long mNativeObject;

            public BuilderFinalizer(long j) {
                this.mNativeObject = j;
            }

            public void finalize() {
                long j;
                try {
                    super.finalize();
                    j = this.mNativeObject;
                } catch (Throwable unused) {
                    j = this.mNativeObject;
                }
                IndexBuffer.nDestroyBuilder(j);
            }
        }

        /* compiled from: PG */
        /* loaded from: classes5.dex */
        public enum IndexType {
            USHORT,
            UINT
        }

        public Builder() {
            long nCreateBuilder = IndexBuffer.nCreateBuilder();
            this.mNativeBuilder = nCreateBuilder;
            this.mFinalizer = new BuilderFinalizer(nCreateBuilder);
        }

        public Builder bufferType(IndexType indexType) {
            IndexBuffer.nBuilderBufferType(this.mNativeBuilder, indexType.ordinal());
            return this;
        }

        public IndexBuffer build(Engine engine) {
            long nBuilderBuild = IndexBuffer.nBuilderBuild(this.mNativeBuilder, engine.getNativeObject());
            if (nBuilderBuild == 0) {
                throw new IllegalStateException("Couldn't create IndexBuffer");
            }
            return new IndexBuffer(nBuilderBuild);
        }

        public Builder indexCount(int i) {
            IndexBuffer.nBuilderIndexCount(this.mNativeBuilder, i);
            return this;
        }
    }

    private IndexBuffer(long j) {
        this.mNativeObject = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderBufferType(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nBuilderBuild(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderIndexCount(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateBuilder();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nDestroyBuilder(long j);

    private static native int nGetIndexCount(long j);

    private static native int nSetBuffer(long j, long j2, Buffer buffer, int i, int i2, int i3, Object obj, Runnable runnable);

    public void clearNativeObject() {
        this.mNativeObject = 0L;
    }

    public int getIndexCount() {
        return nGetIndexCount(getNativeObject());
    }

    public long getNativeObject() {
        long j = this.mNativeObject;
        if (j != 0) {
            return j;
        }
        throw new IllegalStateException("Calling method on destroyed IndexBuffer");
    }

    public void setBuffer(Engine engine, Buffer buffer) {
        setBuffer(engine, buffer, 0, 0, null, null);
    }

    public void setBuffer(Engine engine, Buffer buffer, int i, int i2) {
        setBuffer(engine, buffer, i, i2, null, null);
    }

    public void setBuffer(Engine engine, Buffer buffer, int i, int i2, Object obj, Runnable runnable) {
        if (nSetBuffer(getNativeObject(), engine.getNativeObject(), buffer, buffer.remaining(), i, i2 == 0 ? buffer.remaining() : i2, obj, runnable) >= 0) {
            return;
        }
        throw new BufferOverflowException();
    }
}
