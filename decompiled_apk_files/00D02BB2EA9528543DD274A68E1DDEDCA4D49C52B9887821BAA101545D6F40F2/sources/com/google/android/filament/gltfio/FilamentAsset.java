package com.google.android.filament.gltfio;

import com.google.android.filament.Box;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class FilamentAsset {
    private Animator mAnimator = null;
    private long mNativeObject;

    public FilamentAsset(long j) {
        this.mNativeObject = j;
    }

    private static native long nGetAnimator(long j);

    private static native void nGetBoundingBox(long j, float[] fArr);

    private static native void nGetEntities(long j, int[] iArr);

    private static native int nGetEntityCount(long j);

    private static native String nGetName(long j, int i);

    private static native int nGetResourceUriCount(long j);

    private static native void nGetResourceUris(long j, String[] strArr);

    private static native int nGetRoot(long j);

    private static native void nReleaseSourceData(long j);

    public void clearNativeObject() {
        this.mNativeObject = 0L;
    }

    public Animator getAnimator() {
        Animator animator = this.mAnimator;
        if (animator != null) {
            return animator;
        }
        Animator animator2 = new Animator(nGetAnimator(getNativeObject()));
        this.mAnimator = animator2;
        return animator2;
    }

    public Box getBoundingBox() {
        float[] fArr = new float[6];
        nGetBoundingBox(this.mNativeObject, fArr);
        return new Box(fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5]);
    }

    public int[] getEntities() {
        int[] iArr = new int[nGetEntityCount(this.mNativeObject)];
        nGetEntities(this.mNativeObject, iArr);
        return iArr;
    }

    public String getName(int i) {
        return nGetName(getNativeObject(), i);
    }

    public long getNativeObject() {
        return this.mNativeObject;
    }

    public String[] getResourceUris() {
        String[] strArr = new String[nGetResourceUriCount(this.mNativeObject)];
        nGetResourceUris(this.mNativeObject, strArr);
        return strArr;
    }

    public int getRoot() {
        return nGetRoot(this.mNativeObject);
    }

    public void releaseSourceData() {
        nReleaseSourceData(this.mNativeObject);
    }
}
