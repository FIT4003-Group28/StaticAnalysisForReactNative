package com.google.ar.core;

import android.media.Image;
import android.view.MotionEvent;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class Frame {
    static final ArrayList<Anchor> ANCHORS_EMPTY_LIST = new ArrayList<>();
    static final ArrayList<Plane> PLANES_EMPTY_LIST = new ArrayList<>();
    private static final String TAG = "ARCore-Frame";
    private LightEstimate lightEstimate;
    long nativeHandle;
    final long nativeSymbolTableHandle;
    final Session session;

    protected Frame() {
        this.nativeHandle = 0L;
        this.session = null;
        this.nativeSymbolTableHandle = 0L;
    }

    public Frame(Session session) {
        this(session, nativeCreateFrame(session.nativeWrapperHandle));
    }

    private List<HitResult> convertNativeHitResultsToList(long[] jArr) {
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j : jArr) {
            HitResult hitResult = new HitResult(j, this.session);
            if (hitResult.getTrackable() != null) {
                arrayList.add(hitResult);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    private native long nativeAcquireCameraImage(long j, long j2);

    private native long nativeAcquireDepthImage(long j, long j2);

    private native long nativeAcquireDepthImagePrivate(long j, long j2);

    private native long nativeAcquireImageMetadata(long j, long j2);

    private native long nativeAcquireRawDepthConfidenceImage(long j, long j2);

    private native long nativeAcquireRawDepthImage(long j, long j2);

    private native long nativeAcquireSegmentation(long j, long j2);

    private native long[] nativeAcquireUpdatedAnchors(long j, long j2);

    private static native long nativeCreateFrame(long j);

    private static native void nativeDestroyFrame(long j, long j2);

    private native long nativeGetAndroidCameraTimestamp(long j, long j2);

    private native Pose nativeGetAndroidSensorPose(long j, long j2);

    private native int nativeGetBackgroundSegmentationTextureName(long j, long j2);

    private native int nativeGetCameraTextureName(long j, long j2);

    private native int nativeGetImageFeatureCount(long j, long j2);

    private native float nativeGetImageMotionMagnitude(long j, long j2);

    private native void nativeGetLightEstimate(long j, long j2, long j3);

    private native long nativeGetTimestamp(long j, long j2);

    private native boolean nativeHasDisplayGeometryChanged(long j, long j2);

    private native void nativeTransformCoordinates2dFloatArrayOrBuffer(long j, long j2, int i, Object obj, int i2, Object obj2);

    private native void nativeTransformDisplayUvCoords(long j, long j2, FloatBuffer floatBuffer, FloatBuffer floatBuffer2);

    public Image acquireCameraImage() {
        return new ArImage(this.session, nativeAcquireCameraImage(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public Image acquireDepthImage() {
        return new ArImage(this.session, nativeAcquireDepthImage(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public Image acquireDepthImagePrivate() {
        return new ArImage(this.session, nativeAcquireDepthImagePrivate(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public PointCloud acquirePointCloud() {
        return new PointCloud(this.session, nativeAcquirePointCloud(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public Image acquireRawDepthConfidenceImage() {
        return new ArImage(this.session, nativeAcquireRawDepthConfidenceImage(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public Image acquireRawDepthImage() {
        return new ArImage(this.session, nativeAcquireRawDepthImage(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public Segmentation acquireSegmentation() {
        return new Segmentation(this.session, nativeAcquireSegmentation(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    protected void finalize() {
        long j = this.nativeHandle;
        if (j != 0) {
            nativeDestroyFrame(this.nativeSymbolTableHandle, j);
            this.nativeHandle = 0L;
        }
        super.finalize();
    }

    public long getAndroidCameraTimestamp() {
        return nativeGetAndroidCameraTimestamp(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public Pose getAndroidSensorPose() {
        return nativeGetAndroidSensorPose(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public int getBackgroundSegmentationTextureName() {
        return nativeGetBackgroundSegmentationTextureName(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public Camera getCamera() {
        return new Camera(this.session, this);
    }

    public int getCameraTextureName() {
        return nativeGetCameraTextureName(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public float getDepthRegionConfidence(int i, int i2, int i3, int i4) {
        return nativeFrameGetDepthRegionConfidence(this.session.nativeWrapperHandle, this.nativeHandle, i, i2, i3, i4);
    }

    public int getImageFeatureCount() {
        return nativeGetImageFeatureCount(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public ImageMetadata getImageMetadata() {
        return new ImageMetadata(nativeAcquireImageMetadata(this.session.nativeWrapperHandle, this.nativeHandle), this.session);
    }

    public float getImageMotionMagnitude() {
        return nativeGetImageMotionMagnitude(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public LightEstimate getLightEstimate() {
        if (this.lightEstimate == null) {
            this.lightEstimate = new LightEstimate(this.session);
        }
        nativeGetLightEstimate(this.session.nativeWrapperHandle, this.nativeHandle, this.lightEstimate.nativeHandle);
        return this.lightEstimate;
    }

    public long getTimestamp() {
        return nativeGetTimestamp(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public Collection<Anchor> getUpdatedAnchors() {
        Session session = this.session;
        return session.convertNativeAnchorsToCollection(nativeAcquireUpdatedAnchors(session.nativeWrapperHandle, this.nativeHandle));
    }

    public <T extends Trackable> Collection<T> getUpdatedTrackables(Class<T> cls) {
        dbbm a = dbbm.a(cls);
        if (a == dbbm.UNKNOWN_TO_JAVA) {
            return Collections.emptyList();
        }
        return this.session.convertNativeTrackablesToCollection(cls, nativeAcquireUpdatedTrackables(this.session.nativeWrapperHandle, this.nativeHandle, a.k));
    }

    public boolean hasDisplayGeometryChanged() {
        return nativeHasDisplayGeometryChanged(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public List<HitResult> hitTest(float f, float f2) {
        return convertNativeHitResultsToList(nativeHitTest(this.session.nativeWrapperHandle, this.nativeHandle, f, f2));
    }

    public List<HitResult> hitTestInstantPlacement(float f, float f2, float f3) {
        return convertNativeHitResultsToList(nativeHitTestInstantPlacement(this.session.nativeWrapperHandle, this.nativeHandle, f, f2, f3));
    }

    public native long nativeAcquirePointCloud(long j, long j2);

    public native long[] nativeAcquireUpdatedTrackables(long j, long j2, int i);

    public native float nativeFrameGetDepthRegionConfidence(long j, long j2, int i, int i2, int i3, int i4);

    public native long[] nativeHitTest(long j, long j2, float f, float f2);

    public native long[] nativeHitTestInstantPlacement(long j, long j2, float f, float f2, float f3);

    public native long[] nativeHitTestRay(long j, long j2, float[] fArr, int i, float[] fArr2, int i2);

    public native long[] nativeInstantHitTest(long j, long j2, float f, float f2, float f3);

    public void transformCoordinates2d(Coordinates2d coordinates2d, FloatBuffer floatBuffer, Coordinates2d coordinates2d2, FloatBuffer floatBuffer2) {
        nativeTransformCoordinates2dFloatArrayOrBuffer(this.session.nativeWrapperHandle, this.nativeHandle, coordinates2d.nativeCode, floatBuffer, coordinates2d2.nativeCode, floatBuffer2);
    }

    @Deprecated
    public void transformDisplayUvCoords(FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        if (!floatBuffer.isDirect() || !floatBuffer2.isDirect()) {
            throw new IllegalArgumentException("transformDisplayUvCoords currently requires direct buffers.");
        }
        nativeTransformDisplayUvCoords(this.session.nativeWrapperHandle, this.nativeHandle, floatBuffer, floatBuffer2);
    }

    public Frame(Session session, long j) {
        this.session = session;
        this.nativeHandle = j;
        this.nativeSymbolTableHandle = session.nativeSymbolTableHandle;
    }

    public void transformCoordinates2d(Coordinates2d coordinates2d, float[] fArr, Coordinates2d coordinates2d2, float[] fArr2) {
        nativeTransformCoordinates2dFloatArrayOrBuffer(this.session.nativeWrapperHandle, this.nativeHandle, coordinates2d.nativeCode, fArr, coordinates2d2.nativeCode, fArr2);
    }

    public List<HitResult> hitTest(float f, float f2, float f3) {
        return convertNativeHitResultsToList(nativeInstantHitTest(this.session.nativeWrapperHandle, this.nativeHandle, f, f2, f3));
    }

    public List<HitResult> hitTest(MotionEvent motionEvent) {
        return hitTest(motionEvent.getX(), motionEvent.getY());
    }

    public List<HitResult> hitTest(float[] fArr, int i, float[] fArr2, int i2) {
        return convertNativeHitResultsToList(nativeHitTestRay(this.session.nativeWrapperHandle, this.nativeHandle, fArr, i, fArr2, i2));
    }
}
