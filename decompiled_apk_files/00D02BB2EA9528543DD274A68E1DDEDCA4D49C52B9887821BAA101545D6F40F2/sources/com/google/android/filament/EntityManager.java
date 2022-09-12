package com.google.android.filament;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class EntityManager {
    private long mNativeObject;

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    class Holder {
        static final EntityManager INSTANCE = new EntityManager();

        private Holder() {
        }
    }

    private EntityManager() {
        this.mNativeObject = nGetEntityManager();
    }

    public static EntityManager get() {
        return Holder.INSTANCE;
    }

    private static native int nCreate(long j);

    private static native void nCreateArray(long j, int i, int[] iArr);

    private static native void nDestroy(long j, int i);

    private static native void nDestroyArray(long j, int i, int[] iArr);

    private static native long nGetEntityManager();

    private static native boolean nIsAlive(long j, int i);

    public int create() {
        return nCreate(this.mNativeObject);
    }

    public void destroy(int i) {
        nDestroy(this.mNativeObject, i);
    }

    public long getNativeObject() {
        return this.mNativeObject;
    }

    public boolean isAlive(int i) {
        return nIsAlive(this.mNativeObject, i);
    }

    public int[] create(int i) {
        if (i > 0) {
            int[] iArr = new int[i];
            nCreateArray(this.mNativeObject, i, iArr);
            return iArr;
        }
        throw new ArrayIndexOutOfBoundsException("n must be at least 1");
    }

    public void destroy(int[] iArr) {
        nDestroyArray(this.mNativeObject, iArr.length, iArr);
    }

    public int[] create(int[] iArr) {
        nCreateArray(this.mNativeObject, iArr.length, iArr);
        return iArr;
    }
}
