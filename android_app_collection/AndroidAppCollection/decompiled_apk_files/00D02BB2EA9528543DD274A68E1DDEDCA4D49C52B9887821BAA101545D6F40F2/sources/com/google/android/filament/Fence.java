package com.google.android.filament;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class Fence {
    public static final long WAIT_FOR_EVER = -1;
    private long mNativeObject;

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public enum FenceStatus {
        ERROR,
        CONDITION_SATISFIED,
        TIMEOUT_EXPIRED
    }

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public enum Mode {
        FLUSH,
        DONT_FLUSH
    }

    public Fence(long j) {
        this.mNativeObject = j;
    }

    private static native int nWait(long j, int i, long j2);

    private static native int nWaitAndDestroy(long j, int i);

    public static FenceStatus waitAndDestroy(Fence fence, Mode mode) {
        int nWaitAndDestroy = nWaitAndDestroy(fence.getNativeObject(), mode.ordinal());
        if (nWaitAndDestroy != -1) {
            if (nWaitAndDestroy == 0) {
                return FenceStatus.CONDITION_SATISFIED;
            }
            return FenceStatus.ERROR;
        }
        return FenceStatus.ERROR;
    }

    public void clearNativeObject() {
        this.mNativeObject = 0L;
    }

    public long getNativeObject() {
        long j = this.mNativeObject;
        if (j != 0) {
            return j;
        }
        throw new IllegalStateException("Calling method on destroyed Fence");
    }

    public FenceStatus wait(Mode mode, long j) {
        int nWait = nWait(getNativeObject(), mode.ordinal(), j);
        if (nWait != -1) {
            if (nWait == 0) {
                return FenceStatus.CONDITION_SATISFIED;
            }
            if (nWait == 1) {
                return FenceStatus.TIMEOUT_EXPIRED;
            }
            return FenceStatus.ERROR;
        }
        return FenceStatus.ERROR;
    }
}
