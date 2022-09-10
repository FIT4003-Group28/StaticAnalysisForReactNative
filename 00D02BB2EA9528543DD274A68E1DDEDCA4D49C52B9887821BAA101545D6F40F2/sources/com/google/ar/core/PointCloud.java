package com.google.ar.core;

import com.google.ar.core.exceptions.DeadlineExceededException;
import java.io.Closeable;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class PointCloud implements Closeable {
    private long nativeHandle;
    private final long nativeSymbolTableHandle;
    private final Session session;

    protected PointCloud() {
        this.nativeHandle = 0L;
        this.session = null;
        this.nativeSymbolTableHandle = 0L;
    }

    public PointCloud(Session session, long j) {
        this.session = session;
        this.nativeHandle = j;
        this.nativeSymbolTableHandle = session.nativeSymbolTableHandle;
    }

    private native ByteBuffer nativeGetData(long j, long j2);

    private native ByteBuffer nativeGetIds(long j, long j2);

    private native long nativeGetTimestamp(long j, long j2);

    private native void nativeReleasePointCloud(long j, long j2);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        release();
    }

    protected void finalize() {
        long j = this.nativeHandle;
        if (j != 0) {
            nativeReleasePointCloud(this.nativeSymbolTableHandle, j);
        }
        super.finalize();
    }

    public IntBuffer getIds() {
        long j = this.nativeHandle;
        if (j == 0) {
            throw new DeadlineExceededException();
        }
        return Session.directByteBufferOrDefault(nativeGetIds(this.session.nativeWrapperHandle, j)).asIntBuffer();
    }

    public FloatBuffer getPoints() {
        long j = this.nativeHandle;
        if (j == 0) {
            throw new DeadlineExceededException();
        }
        return Session.directByteBufferOrDefault(nativeGetData(this.session.nativeWrapperHandle, j)).asFloatBuffer();
    }

    public long getTimestamp() {
        long j = this.nativeHandle;
        if (j == 0) {
            throw new DeadlineExceededException();
        }
        return nativeGetTimestamp(this.session.nativeWrapperHandle, j);
    }

    public void release() {
        nativeReleasePointCloud(this.nativeSymbolTableHandle, this.nativeHandle);
        this.nativeHandle = 0L;
    }
}
